<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Biodata</title>
    </head>
    <body>
        <h2>Biodata</h2>
        <section>
            <div>NIM: <span>${biodata.nim}</span></div>
            <div>Nama: <span>${biodata.name}</span></div>
            <div>Tanggal Lahir: <span>${biodata.born_date}</span></div>
            <div>Jurusan: <span>${biodata.jurusan}</span></div>
        </section>
    </body>
</html>