package com.chinook.music.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

@Component
public class DatabaseInfoPrinter {

    private final DataSource dataSource;

    @Autowired
    public DatabaseInfoPrinter(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void printDatabaseInfo() {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            String dbName = metaData.getDatabaseProductName();
            String schema = connection.getSchema();

            System.out.println("Database Name: " + dbName);
            System.out.println("Schema: " + schema);
        } catch (SQLException e) {
            System.err.println("Error fetching database metadata: " + e.getMessage());
        }
    }
}
