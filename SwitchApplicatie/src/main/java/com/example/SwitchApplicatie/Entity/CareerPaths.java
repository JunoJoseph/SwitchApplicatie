package com.example.SwitchApplicatie.Entity;
import com.example.SwitchApplicatie.Database.DatabaseConnection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Entity
@Data
@Table(name = " CareerPaths")
@NoArgsConstructor
@AllArgsConstructor
public class CareerPaths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int pathID;
    private String pathName;
    private String description;


   /* public static CareerPaths getCareerPathById(int pathID) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String query = "SELECT * FROM CareerPaths WHERE PathID = ?";

        // Try-with-resources block ensures that each resource is closed after the try statement
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, pathID); // Set the value of the first parameter in the SQL query
            ResultSet resultSet = statement.executeQuery(); // Execute the query and get the result set

            // Check if the result set has any rows
            if (resultSet.next()) {
                // If a record is found, create a CareerPath object and populate it with data from the result set
                CareerPaths careerPath = new CareerPaths();
                careerPath.setPathID(resultSet.getInt("PathID"));
                careerPath.setPathName(resultSet.getString("PathName"));
                careerPath.setDescription(resultSet.getString("Description"));
                return careerPath; // Return the CareerPath object representing the found career path
            }
        }

        return null; // Return null if no matching record is found in the database
    }
}
