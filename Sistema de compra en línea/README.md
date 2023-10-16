# Codigo POO
### //author: Christopher Xavier Sanchez Duran
### //UAMC

El programa simula la interacción de tres clientes con un sistema de compra en línea. Cada cliente agrega productos a su carrito, elimina productos y verifica el contenido y el costo total del carrito en diferentes etapas de la interacción. Los productos se obtienen del inventario previamente definido.


# En el método main:

Se crea un array de objetos Producto llamado Inventario con una longitud de 6 elementos.
Se inicializan los elementos del array Inventario con instancias de diferentes tipos de productos. Puedes notar que se están creando objetos de las clases Medicamento, Prenda, y Alimento, que deben ser subclases de la clase Producto. Cada uno de estos objetos representa un producto con sus respectivas propiedades.
Luego, se crea un array de objetos Usuario llamado Clientes con una longitud de 3 elementos.
Se inicializan los elementos del array Clientes con instancias de la clase Usuario, que representa a los clientes de la tienda en línea. Cada cliente se inicializa con un nombre, correo electrónico y número de cliente.
A continuación, se realiza un bucle for que itera sobre los clientes (3 clientes en total).

# Para cada cliente:
Se imprime la información del cliente, que incluye su nombre, correo electrónico y número de cliente.
Se agregan varios productos al carrito de compra del cliente utilizando el método agregarAlCarrito, que parece ser una función que permite a los clientes agregar productos a su carrito.
Se imprime el contenido del carrito de compra del cliente utilizando imprimirCarrito.
Se imprime el total de la compra del cliente utilizando imprimirTotal.
Se elimina un producto específico del carrito de compra del cliente utilizando eliminarDelCarrito, que toma el nombre del producto como parámetro.
Se vuelve a imprimir el contenido del carrito de compra y el total de la compra después de eliminar un producto.
Se agrega otro producto al carrito del cliente y se vuelven a imprimir el contenido del carrito y el total de la compra.

// author: Christopher Xavier Sanchez Duran
// Github: https://github.com/cxavier23
// Portafolio: https://cxavier23.github.io/

