package au.edu.sydney.brawndo.erp.spfea.products;

import au.edu.sydney.brawndo.erp.ordering.Product;

import java.util.Arrays;
import java.util.Objects;

public class ProductImpl implements Product {

    private final String name;
    private final double[] manufacturingData;
    private final double cost;
    private final double[] recipeData;
    private final double[] marketingData;
    private final double[] safetyData;
    private final double[] licensingData;

    public ProductImpl(String name,
                       double cost,
                       double[] manufacturingData,
                       double[] recipeData,
                       double[] marketingData,
                       double[] safetyData,
                       double[] licensingData) {

        ProductType productType = ProductFactory.getProductType(name, manufacturingData, marketingData, safetyData, licensingData);
        Products products = new Products(productType, cost, recipeData);
        this.name = products.getProductType().getName();
        this.cost = products.getCost();
        this.manufacturingData = products.getProductType().getManufacturingData();
        this.recipeData = products.getRecipeData();
        this.marketingData = products.getProductType().getMarketingData();
        this.safetyData = products.getProductType().getSafetyData();
        this.licensingData = products.getProductType().getLicensingData();
    }

//    class Name{
//        String name;
//
//        public Name(String name) {
//            this.name = name;
//        }
//    }
//
//    class ManufacturingData{
//        double[] manufacturingData;
//
//        public ManufacturingData(double[] manufacturingData) {
//            this.manufacturingData = manufacturingData;
//        }
//    }
//
//    class Cost{
//        double cost;
//
//        public Cost(double cost) {
//            this.cost = cost;
//        }
//    }
//
//    class RecipeData {
//        double[] recipeData;
//
//        public RecipeData(double[] recipeData) {
//            this.recipeData = recipeData;
//        }
//    }
//
//    class MarketingData {
//        double[] marketingData;
//
//        public MarketingData(double[] marketingData) {
//            this.marketingData = marketingData;
//        }
//    }
//
//    class SafetyData{
//        double[] safetyData;
//    }
//
//    class LicensingData{
//        double [] licensingData;
//    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double[] getManufacturingData() {
        return manufacturingData;
    }

    @Override
    public double[] getRecipeData() {
        return recipeData;
    }

    @Override
    public double[] getMarketingData() {
        return marketingData;
    }

    @Override
    public double[] getSafetyData() {
        return safetyData;
    }

    @Override
    public double[] getLicensingData() {
        return licensingData;
    }

    @Override
    public String toString() {

        return String.format("%s", name);
    }

//    public boolean equals(ProductImpl product) {
//        if (this.getProductName().equals(product.getProductName()) &&
//                Arrays.equals(this.getManufacturingData(), product.getManufacturingData()) &&
//                Arrays.equals(this.getRecipeData(), product.getRecipeData()) &&
//                Arrays.equals(this.getMarketingData(), product.getMarketingData()) &&
//                Arrays.equals(this.getSafetyData(), product.getSafetyData()) &&
//                Arrays.equals(this.getLicensingData(), product.getLicensingData())){
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductImpl)) return false;
        ProductImpl product = (ProductImpl) o;
        return Double.compare(product.getCost(), getCost()) == 0 &&
                Objects.equals(name, product.name) &&
                Arrays.equals(getManufacturingData(), product.getManufacturingData()) &&
                Arrays.equals(getRecipeData(), product.getRecipeData()) &&
                Arrays.equals(getMarketingData(), product.getMarketingData()) &&
                Arrays.equals(getSafetyData(), product.getSafetyData()) &&
                Arrays.equals(getLicensingData(), product.getLicensingData());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, getCost());
        result = 31 * result + Arrays.hashCode(getManufacturingData());
        result = 31 * result + Arrays.hashCode(getRecipeData());
        result = 31 * result + Arrays.hashCode(getMarketingData());
        result = 31 * result + Arrays.hashCode(getSafetyData());
        result = 31 * result + Arrays.hashCode(getLicensingData());
        return result;
    }
}
