package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemsDAO {
    ArrayList<ItemDTO> getallItems() throws SQLException, ClassNotFoundException;
    boolean saveItems(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean deleteItems(String code) throws SQLException, ClassNotFoundException;
    boolean updateItems(ItemDTO dto) throws SQLException, ClassNotFoundException;

    void existItems();

    ResultSet genarateCode() throws SQLException, ClassNotFoundException;
}
