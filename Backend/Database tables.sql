use submissionData;
CREATE TABLE lead_detail (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email_address VARCHAR(100),
    phone_number VARCHAR(20)
);
CREATE TABLE consultant_detail (
    id INT PRIMARY KEY AUTO_INCREMENT,
    lead_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email_address VARCHAR(100),
    phone_number VARCHAR(20),
    FOREIGN KEY (lead_id) REFERENCES lead_detail(id)
);