# Cuenta Bancaria–Java (POO)
---
## 🎯 Objetivo del proyecto
Aplicar principios fundamentales de POO, entre ellos:
- **Encapsulación**
- **Responsabilidad única**
- **Abierto/Cerrado**
- **Inversión de dependencias**
---
### 🔁 1. Transferencias entre cuentas
- Permite mover dinero de una cuenta a otra.
- Incluye validaciones como:
  - Saldo suficiente  
  - Cuentas válidas  
  - Monto permitido  
- Uso de excepciones personalizadas para errores de transferencia.

### 📜 2. Historial de transacciones
- Registro automático de movimientos:
  - Depósitos  
  - Retiros  
  - Transferencias  
- Cada transacción incluye tipo, monto y fecha.
- Gestión separada mediante clases dedicadas.

### 💰 3. Aplicación de intereses o cargos
- Permite aplicar:
  - Intereses para cuentas de ahorro  
  - Cargos o comisiones para cuentas corrientes  
- Lógica extensible de acuerdo con el tipo de cuenta.
- Mantiene el principio de abierto/cerrado para facilitar cambios futuros.

