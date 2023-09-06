package com.test.crud.Service;

import com.test.crud.DTO.ProductDTO;
import com.test.crud.Model.Product;
import com.test.crud.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository repository;


    public List<ProductDTO> get(){
        List<ProductDTO> productsDTO = repository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());
        return productsDTO;
    }
    public ProductDTO getById(Long id) throws Exception {
        Optional<Product> p = repository.findById(id);
        Product product = p.orElseThrow(RuntimeException::new);
        return new ProductDTO(product);

    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public ProductDTO create(ProductDTO dto){
        Product p = new Product();
        entityProduct(dto, p);
        return new ProductDTO(p);
    }



    public ProductDTO update(Long id, ProductDTO dto){
        Product p = repository.getReferenceById(id);
        entityProduct(dto, p);
        return new ProductDTO(p);
    }







    public void entityProduct(ProductDTO dto, Product product){
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        repository.save(product);
    }

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
}
