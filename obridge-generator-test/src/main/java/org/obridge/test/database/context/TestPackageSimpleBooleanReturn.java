package org.obridge.test.database.context;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;
import java.math.BigDecimal;
import java.sql.ResultSet;
import org.obridge.test.database.objects.*;
import javax.annotation.Generated;

@Generated("org.obridge.generators.ProcedureContextGenerator")
public class TestPackageSimpleBooleanReturn {

    private Boolean functionReturn;

    public Boolean getFunctionReturn() {
        return this.functionReturn;
    }

    public void setFunctionReturn(Boolean functionReturn) {
        this.functionReturn = functionReturn;
    }


}
