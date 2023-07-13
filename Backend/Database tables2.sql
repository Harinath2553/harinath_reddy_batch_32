CREATE TABLE submission (
    id INT PRIMARY KEY AUTO_INCREMENT,
    consultant_id INT,
    submission_date DATE,
    vendor_company VARCHAR(100),
    vendor_name VARCHAR(100),
    vendor_email_address VARCHAR(100),
    vendor_phone_number VARCHAR(20),
    implementation_partner VARCHAR(100),
    client_name VARCHAR(100),
    pay_rate DECIMAL(10, 2),
    submission_status VARCHAR(50),
    submission_type VARCHAR(50),
    city VARCHAR(100),
    state VARCHAR(50),
    zip VARCHAR(20),
    FOREIGN KEY (consultant_id) REFERENCES consultant_detail(id)
); CREATE TABLE submission_update (
    id INT PRIMARY KEY AUTO_INCREMENT,
    submission_id INT,
    update_text Varchar(200),
    created_date DATE,
    Foreign Key(submission_id) references submission(id)
);