USE comaBem;

/*Inserir Dados*/
INSERT INTO Unidades (ds_unidade) VALUES ("Kilo");
INSERT INTO Unidades (ds_unidade) VALUES ("Unidade");
INSERT INTO Unidades (ds_unidade) VALUES ("Litro");
INSERT INTO Unidades (ds_unidade) VALUES ("Metro");
INSERT INTO Unidades (ds_unidade) VALUES ("Duzia");

INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Carne", 30.00, 2, 1);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Oleo", 10.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Leite", 5.00, 1.5, 3);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Pepino", 3.00, 1, 2);
INSERT INTO Produtos (ds_produto, vl_produto, qt_produto, cd_unidade) VALUES ("Uva", 8.00, 10, 1);

/*alterar Dados*/
UPDATE Produtos SET ds_produto = "Kiwi" WHERE cd_produto = 6;
UPDATE Produtos SET cd_unidade = 2 WHERE cd_produto = 1;
UPDATE Produtos SET vl_produto = 80.00 WHERE cd_produto = 1;

/*Concultar Dados*/
SELECT * FROM Unidades;
SELECT * FROM Produtos;
SELECT ds_produto, vl_produto, qt_produto FROM Produtos ORDER BY ds_produto;

SELECT p.ds_produto AS 'Produto',  u.ds_unidade AS 'Unidade'
FROM Produtos AS p
JOIN Unidades AS u ON p.cd_unidade = u.cd_unidade;

/*Excluir Dados*/
DELETE FROM Produtos WHERE cd_produto = 1;
DELETE FROM Produtos WHERE cd_produto = 5;
