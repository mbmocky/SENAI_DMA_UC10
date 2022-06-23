/*criacao do banco*/
CREATE DATABASE ComaBem;

USE ComaBem;

/*cria tabela Unidade*/
CREATE TABLE Unidades
(
	cd_unidade INT AUTO_INCREMENT PRIMARY KEY,
    ds_unidade VARCHAR(200) NOT NULL
);

/*cria tabela Produtos*/
CREATE TABLE Produtos (
	cd_produto INT AUTO_INCREMENT PRIMARY KEY,
    ds_produto VARCHAR(200) NOT NULL,
    vl_produto DOUBLE NOT NULL,
    qt_produto DOUBLE NOT NULL,
    cd_unidade INT NOT NULL,
    CONSTRAINT fk_produto_unidade FOREIGN KEY (cd_unidade) REFERENCES Unidades(cd_unidade)
);
