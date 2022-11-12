<? 

$dbHost = 'Localhost';
$dbUsername = 'root';
$dbPassaword = '';
$dbName = 'formulario-felipe';

$conexao = new mysqli($dbHost, $dbUsername,$dbPassaword,$dbName);

if ($conexao->connect_errno)
{
    echo "Erro";
}
else 
{

    echo "Conexão efetuada com sucesso.";
}
?>