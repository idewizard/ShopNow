package br.com.shopnow.serviceproduct.controllers;

import br.com.shopnow.serviceproduct.controllers.request.BuyProductRequest;
import br.com.shopnow.serviceproduct.controllers.request.RegisterProductRequest;
import br.com.shopnow.serviceproduct.controllers.request.ReturnProductRequest;
import br.com.shopnow.serviceproduct.controllers.request.SellProductRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/buy")
    public void buyProduct(@RequestBody @Valid BuyProductRequest request){} //TODO: Seria compra e venda a mesma coisa? ou separo?

    @PostMapping("/sell")
    public void sellProduct(@RequestBody @Valid SellProductRequest request){} //TODO: Seria compra e venda a mesma coisa? ou separo?

    @PostMapping("/return")
    public void returnProduct(@RequestBody @Valid ReturnProductRequest request){}

    @PostMapping("/register")
    public void registerProduct(@RequestBody @Valid RegisterProductRequest request){}

    @DeleteMapping("/delete/{productCode}")
    public void deleteProduct(@PathVariable long productCode){}

    @PutMapping("/modify/{productCode}")
    public void modifyProcut(@PathVariable long productCode){}

}
