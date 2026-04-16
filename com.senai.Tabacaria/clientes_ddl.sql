-- Execute no MySQL (banco tabacaria) antes de usar o cadastro pela API.
CREATE TABLE IF NOT EXISTS clientes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    endereco VARCHAR(500) NOT NULL,
    PRIMARY KEY (id)
);
