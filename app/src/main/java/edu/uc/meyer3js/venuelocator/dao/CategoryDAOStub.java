package edu.uc.meyer3js.venuelocator.dao;

public class CategoryDAOStub implements ICategoryDAO {
    @Override
    public String[] fetchData() {

        String[] categories = {"All", "Gas Station", "Stadium"};

        return categories;
    }
}
