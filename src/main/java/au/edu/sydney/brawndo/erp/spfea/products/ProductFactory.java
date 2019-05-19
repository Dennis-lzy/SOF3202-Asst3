package au.edu.sydney.brawndo.erp.spfea.products;

import au.edu.sydney.brawndo.erp.ordering.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static Map<String, ProductType> productMap = new HashMap<>();

    public static ProductType getProductType(String name, double[] manufacturingData, double[] marketingData, double[] safetyData, double[] licensingData){
        ProductType productType = (ProductType)productMap.get(name);
        if(productType == null){
            productType = new ProductType(name, manufacturingData, marketingData, safetyData, licensingData);
            productMap.put(name, productType);
        }

        return productType;
    }

}
