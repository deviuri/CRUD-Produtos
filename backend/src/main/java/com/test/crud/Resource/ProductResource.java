package com.test.crud.Resource;

import com.test.crud.DTO.ProductDTO;
import com.test.crud.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductResource {

    private final ProductService service;



    @GetMapping
    public ResponseEntity<List<ProductDTO>> get(){
        return ResponseEntity.ok().body(service.get());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(service.getById(id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO dto, UriComponentsBuilder uriComponentsBuilder){
        ProductDTO p = service.create(dto);
        URI uri = uriComponentsBuilder.path("products/{id}").buildAndExpand(p, p.getId()).toUri();
        return ResponseEntity.created(uri).body(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO dto){
        ProductDTO p = service.update(id, dto);
        return ResponseEntity.ok().body(p);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    public ProductResource(ProductService service) {
        this.service = service;
    }
}
