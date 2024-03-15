package dto;

import lombok.Builder;

@Builder

public class OrderDtoMockedBuilderAndFactory {
    private String status;
    private int courierId;
    private String customerName;
    private String customerPhone;
    private String comment;
    int id;


}
