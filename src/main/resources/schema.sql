DROP TABLE IF EXISTS REWARDS;

CREATE TABLE REWARDS (
  transactionid INT AUTO_INCREMENT  PRIMARY KEY,
  customerid INT NOT NULL,
  points_earned INT NOT NULL,
  purchase_amount NUMERIC(20,2) NOT NULL,
  transaction_date DATE NOT NULL
);