package com.mammadli.model;

import com.mammadli.enums.OperationStatus;
import com.mammadli.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserOperationResponse {

    private int userId;
    private OperationType operationType;
    private OperationStatus operationStatus;

}
