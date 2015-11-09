package common.operations;

import java.util.List;
import java.util.ArrayList;

public class QueryCarsPriceOperation implements Operation<Integer> {
    int id;
    String location;

    public QueryCarsPriceOperation(int id, String location) {
        this.id = id;
        this.location = location;
    }

    @Override
    public List<Object> getParameters() {
        final List<Object> l = new ArrayList<Object>();
        l.add(id);
        l.add(location);
        return l;
    }

    @Override
    public Integer invoke() {
        return null;
    }
}
