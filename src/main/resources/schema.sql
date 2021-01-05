
CREATE TABLE WORD(
    WORD_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    WORD_TRANSLATION VARCHAR (16) NOT NULL,
    FIRST_SENTENCE VARCHAR (64) NOT NULL,
    SECOND_SENTENCE VARCHAR (64) NOT NULL,
    THIRD_SENTENCE VARCHAR (64) NOT NULL,
    KO_WORD VARCHAR (64) NOT NULL

);

CREATE TABLE GUEST(
  GUEST_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  FIRST_NAME VARCHAR(64),
  LAST_NAME VARCHAR(64),
  EMAIL_ADDRESS VARCHAR(64),
  ADDRESS VARCHAR(64),
  COUNTRY VARCHAR(32),
  STATE VARCHAR(12),
  PHONE_NUMBER VARCHAR(24)
);