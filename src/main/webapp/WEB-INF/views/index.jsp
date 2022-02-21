<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
</head>
<style>
    #calculator #inputtd{
        border: 1px solid black;
        text-align: right;
        font-size: 20px;
    }
    #calculator #inputtd input{
        font-size: 20px;
        width: 90%;
        border: 0px;
        text-align: right;
    }
    #calculator #history{
        text-align: right;
        font-size: 13px;
    }
    #calculator td{
        text-align: center;
        width: 80px;
    }
    #calculator button{
        width: 100%;
        height: 100%;
        font-size: 20px;
        padding: 5px;
        margin: 3px;
    }

</style>
<body>
    <h1>Hello Calculator!</h1>
    
<form action="main" method="post">
    <table id="calculator">
        <tr>
            <td id='history' colspan="4">history</td>
        </tr>
        <tr>
           <td id='inputtd' colspan="4"><input name="value" readonly id="input"></input></td>
        </tr>
        <tr>
            <td><button class="operator" type="button">(</button></td>
            <td><button class="operator" type="button">)</button></td>
            <td><button class="operator" type="button">Back</button></td>
            <td><button class="operator" type="button">AC</button></td>
        </tr>
        <tr>
            <td><button class="number" onclick="insertNum()" type="button">7</button></td>
            <td><button class="number" onclick="insertNum()" type="button">8</button></td>
            <td><button class="number" onclick="insertNum()" type="button">9</button></td>
            <td><button class="operator" type="button">¡À</button></td>
        </tr>
        <tr>
            <td><button class="number" onclick="insertNum()" type="button">4</button></td>
            <td><button class="number" onclick="insertNum()" type="button">5</button></td>
            <td><button class="number" onclick="insertNum()" type="button">6</button></td>
            <td><button class="operator" type="button">¡¿</button></td>
        </tr>
        <tr>
            <td><button class="number" onclick="insertNum()" type="button">1</button></td>
            <td><button class="number" onclick="insertNum()" type="button">2</button></td>
            <td><button class="number" onclick="insertNum()" type="button">3</button></td>
            <td><button class="operator" type="button">-</button></td>
        </tr>
        <tr>
            <td><button class="number" onclick="insertNum()" type="button">0</button></td>
            <td><button class="dot" type="button">.</button></td>
            <td><button class="submit" type="submit">=</button></td>
            <td><button class="operator" type="button">+</button></td>
        </tr>
    </table>
</form>
    
</body>
<script>

    var input = "";

    function insertNum(){
        var num = event.target.innerText;
        input += num;
        document.getElementById('input').value = input;
    }


</script>
</html>