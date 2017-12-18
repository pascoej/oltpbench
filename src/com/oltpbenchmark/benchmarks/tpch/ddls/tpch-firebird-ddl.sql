
RECREATE TABLE CUSTOMER
(
  C_CUSTKEY                 INTEGER         NOT NULL,
  C_NAME                    VARCHAR(    25) NOT NULL ,
  C_ADDRESS                 VARCHAR(    40) NOT NULL ,
  C_NATIONKEY               INTEGER         NOT NULL,
  C_PHONE                      CHAR(    15) NOT NULL ,
  C_ACCTBAL                 DECIMAL( 15, 2) NOT NULL,
  C_MKTSEGMENT                 CHAR(    10) NOT NULL ,
  C_COMMENT                 VARCHAR(   117) NOT NULL ,
 CONSTRAINT PK_CUSTOMER PRIMARY KEY (C_CUSTKEY)
);
RECREATE TABLE LINEITEM
(
  L_ORDERKEY                   INTEGER         NOT NULL,
  L_PARTKEY                    INTEGER         NOT NULL,
  L_SUPPKEY                    INTEGER         NOT NULL,
  L_LINENUMBER                 INTEGER         NOT NULL,
  L_QUANTITY                   DECIMAL( 15, 2) NOT NULL,
  L_EXTENDEDPRICE              DECIMAL( 15, 2) NOT NULL,
  L_DISCOUNT                   DECIMAL( 15, 2) NOT NULL,
  L_TAX                        DECIMAL( 15, 2) NOT NULL,
  L_RETURNFLAG                    CHAR(     1) NOT NULL ,
  L_LINESTATUS                    CHAR(     1) NOT NULL ,
  L_SHIPDATE                      DATE         NOT NULL,
  L_COMMITDATE                    DATE         NOT NULL,
  L_RECEIPTDATE                   DATE         NOT NULL,
  L_SHIPINSTRUCT                  CHAR(    25) NOT NULL ,
  L_SHIPMODE                      CHAR(    10) NOT NULL ,
  L_COMMENT                    VARCHAR(    44) NOT NULL ,
 CONSTRAINT PK_LINEITEM PRIMARY KEY (L_ORDERKEY, L_LINENUMBER)
);
RECREATE TABLE NATION
(
  N_NATIONKEY              INTEGER         NOT NULL,
  N_NAME                      CHAR(    25) NOT NULL ,
  N_REGIONKEY              INTEGER         NOT NULL,
  N_COMMENT                VARCHAR(   152)  ,
 CONSTRAINT PK_NATION PRIMARY KEY (N_NATIONKEY)
);
RECREATE TABLE ORDERS
(
  O_ORDERKEY                   INTEGER         NOT NULL,
  O_CUSTKEY                    INTEGER         NOT NULL,
  O_ORDERSTATUS                   CHAR(     1) NOT NULL ,
  O_TOTALPRICE                 DECIMAL( 15, 2) NOT NULL,
  O_ORDERDATE                     DATE         NOT NULL,
  O_ORDERPRIORITY                 CHAR(    15) NOT NULL ,
  O_CLERK                         CHAR(    15) NOT NULL ,
  O_SHIPPRIORITY               INTEGER         NOT NULL,
  O_COMMENT                    VARCHAR(    79) NOT NULL ,
 CONSTRAINT PK_ORDERS PRIMARY KEY (O_ORDERKEY)
);
RECREATE TABLE PART
(
  P_PARTKEY                  INTEGER         NOT NULL,
  P_NAME                     VARCHAR(    55) NOT NULL ,
  P_MFGR                        CHAR(    25) NOT NULL ,
  P_BRAND                       CHAR(    10) NOT NULL ,
  P_TYPE                     VARCHAR(    25) NOT NULL ,
  P_SIZE                     INTEGER         NOT NULL,
  P_CONTAINER                   CHAR(    10) NOT NULL ,
  P_RETAILPRICE              DECIMAL( 15, 2) NOT NULL,
  P_COMMENT                  VARCHAR(    23) NOT NULL ,
 CONSTRAINT PK_PART PRIMARY KEY (P_PARTKEY)
);
RECREATE TABLE PARTSUPP
(
  PS_PARTKEY                 INTEGER         NOT NULL,
  PS_SUPPKEY                 INTEGER         NOT NULL,
  PS_AVAILQTY                INTEGER         NOT NULL,
  PS_SUPPLYCOST              DECIMAL( 15, 2) NOT NULL,
  PS_COMMENT                 VARCHAR(   199) NOT NULL ,
 CONSTRAINT PK_PARTSUPP PRIMARY KEY (PS_PARTKEY, PS_SUPPKEY)
);
RECREATE TABLE REGION
(
  R_REGIONKEY              INTEGER         NOT NULL,
  R_NAME                      CHAR(    25) NOT NULL ,
  R_COMMENT                VARCHAR(   152)  ,
 CONSTRAINT PK_REGION PRIMARY KEY (R_REGIONKEY)
);
RECREATE TABLE SUPPLIER
(
  S_SUPPKEY                INTEGER         NOT NULL,
  S_NAME                      CHAR(    25) NOT NULL ,
  S_ADDRESS                VARCHAR(    40) NOT NULL ,
  S_NATIONKEY              INTEGER         NOT NULL,
  S_PHONE                     CHAR(    15) NOT NULL ,
  S_ACCTBAL                DECIMAL( 15, 2) NOT NULL,
  S_COMMENT                VARCHAR(   101) NOT NULL ,
 CONSTRAINT PK_SUPPLIER PRIMARY KEY (S_SUPPKEY)
);
CREATE ASC INDEX I_C_C_ACCTBAL ON CUSTOMER (C_ACCTBAL);
CREATE ASC INDEX I_C_C_MKTSEGMENT ON CUSTOMER (C_MKTSEGMENT);
CREATE ASC INDEX I_C_C_PHONE_SUBSTR_1_2 ON CUSTOMER COMPUTED BY (substring (c_phone from 1 for 2));
CREATE ASC INDEX I_L_L_COMMITDATE ON LINEITEM (L_COMMITDATE);
CREATE ASC INDEX I_L_L_DISCOUNT ON LINEITEM (L_DISCOUNT);
CREATE ASC INDEX I_L_L_QUANTITY ON LINEITEM (L_QUANTITY);
CREATE ASC INDEX I_L_L_RECEIPTDATE ON LINEITEM (L_RECEIPTDATE);
CREATE ASC INDEX I_L_L_RETURNFLAG_LINESTATUS ON LINEITEM (L_RETURNFLAG, L_LINESTATUS);
CREATE ASC INDEX I_L_L_SHIPDATE ON LINEITEM (L_SHIPDATE);
CREATE ASC INDEX I_L_L_SHIPINSTRUCT ON LINEITEM (L_SHIPINSTRUCT);
CREATE ASC INDEX I_L_L_SHIPMODE ON LINEITEM (L_SHIPMODE);
CREATE ASC INDEX I_N_N_NAME ON NATION (N_NAME);
CREATE ASC INDEX I_O_O_ORDERDATE ON ORDERS (O_ORDERDATE);
CREATE ASC INDEX I_O_O_ORDERPRIORITY ON ORDERS (O_ORDERPRIORITY);
CREATE ASC INDEX I_O_O_SHIPPRIORITY ON ORDERS (O_SHIPPRIORITY);
CREATE ASC INDEX I_PS_PS_SUPPLYCOST ON PARTSUPP (PS_SUPPLYCOST);
CREATE ASC INDEX I_P_P_BRAND_CONTAINER_SIZE ON PART (P_BRAND, P_CONTAINER, P_SIZE);
CREATE ASC INDEX I_P_P_SIZE ON PART (P_SIZE);
CREATE ASC INDEX I_R_R_NAME ON REGION (R_NAME);