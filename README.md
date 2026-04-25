Nombre: Arvis Kaleth Rodríguez Rubio

Proyecto: PetroStack Casanare S.A.S.

## Resumen del Proyecto

Este proyecto implementa un sistema de gestión de inspecciones para pozos petroleros en la región de Casanare, Colombia. El sistema permite registrar eventos de inspección asociados a pozos específicos, utilizando una estructura de datos de pila (LIFO) para manejar las operaciones.

### Funcionalidades Principales
- **Registrar Evento**: Permite agregar un nuevo evento de inspección con detalles como código del pozo, municipio, tipo de evento, descripción y fecha-hora.
- **Revisar Último Evento**: Muestra el último evento registrado sin removerlo de la pila.
- **Retirar Último Evento**: Elimina el último evento registrado y lo mueve a una pila de "undo" para posibles reversiones.
- **Deshacer Última Acción**: Revierte la última operación de retiro, restaurando el evento a la pila principal.
- **Listar Eventos**: Muestra todos los eventos registrados, desde el más reciente al más antiguo.

### Arquitectura
- **Inspeccion**: Clase que modela un evento de inspección.
- **GestorInspecciones**: Lógica de negocio que orquesta las operaciones entre la pila principal y la pila de undo.
- **PilaEventos**: Implementación personalizada de una pila LIFO para almacenar los eventos.
- **MenuConsola**: Interfaz de usuario basada en consola para interactuar con el sistema.
- **Excepciones**: PilaLlenaException y PilaVaciaException para manejar errores en las operaciones de pila.

## Información sobre LIFO (Last In, First Out)

LIFO es un principio de estructura de datos donde el último elemento que se agrega es el primero en ser removido. En este proyecto, se utiliza una pila LIFO para simular el comportamiento de un registro de eventos donde las operaciones más recientes son las más accesibles. Esto es útil para funcionalidades como "undo" y para mantener un historial ordenado cronológicamente inverso.

