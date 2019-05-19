package au.edu.sydney.brawndo.erp.spfea.products;

public class Products {
    private ProductType productType;
    private double cost;
    private double[] recipeData;

    public Products(ProductType productType, double cost, double[] recipeData) {
        this.productType = productType;
        this.cost = cost;
        this.recipeData = recipeData;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getCost() {
        return cost;
    }

    public double[] getRecipeData() {
        return recipeData;
    }
}
