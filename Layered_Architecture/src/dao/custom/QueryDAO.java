package dao.custom;

import model.CustomDTO;
import model.CustomerDTO;

import java.util.ArrayList;

public interface QueryDAO {
    ArrayList<CustomDTO> searchOrder();
}
