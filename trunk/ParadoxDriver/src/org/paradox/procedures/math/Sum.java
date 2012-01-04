package org.paradox.procedures.math;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import org.paradox.metadata.ParadoxField;
import org.paradox.procedures.CallableProcedure;

/**
 *
 * @author 72330554168
 */
public class Sum implements CallableProcedure {

    public String getName() {
        return "sum";
    }

    public String getRemarks() {
        return "Returns the sum of row value";
    }

    public ArrayList<ParadoxField> getCols() {
        final ArrayList<ParadoxField> ret = new ArrayList<ParadoxField>();

        final ParadoxField field = new ParadoxField();
        field.setName("field");
        field.setType((byte)0xC);
        ret.add(field);

        return ret;
    }

    public int getReturnType() {
        return DatabaseMetaData.procedureReturnsResult;
    }

}
