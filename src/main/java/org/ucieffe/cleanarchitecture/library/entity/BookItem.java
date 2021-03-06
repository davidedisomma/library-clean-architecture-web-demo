package org.ucieffe.cleanarchitecture.library.entity;

public class BookItem {
    private String id;
    private String isbn;
    private Boolean isCatalogued;
    private Boolean isReserved;

    public BookItem(String id, String isbn, Boolean isCatalogued, Boolean isReserved) {
        this.id = id;
        this.isbn = isbn;
        this.isCatalogued = isCatalogued;
        this.isReserved = isReserved;
    }

    public String getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getCatalogued() {
        return isCatalogued;
    }

    public Boolean isReserved() {
        return isReserved;
    }

    public void release() {
        isReserved = Boolean.FALSE;
    }
}
