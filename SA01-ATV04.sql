USE comaBem;

/*Criar novo perfil de usuario*/
CREATE ROLE NovoPerfil;

/*criar novo usario e adicionar regra*/
CREATE USER moises IDENTIFIED BY "senhaN0va" DEFAULT ROLE NovoPerfil;

/*Definir permissões para uso do usuario*/
GRANT SELECT ON comaBem.* TO moises;