package backend.backend.exception;

public class InventoryNotFoundException extends RuntimeException{

    public InventoryNotFoundException(Long id) {

        super("Id Not Found"+ id);


    }

    public InventoryNotFoundException(String message) {


        super(message);
    }
}
