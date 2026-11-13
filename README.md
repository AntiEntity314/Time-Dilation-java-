# Time Dilation Calculator

A simple Java console application that calculates time dilation effects based on Einstein's theory of relativity.

## Features

The program offers three calculation modes:

1. **Velocity-based (Special Relativity)** — Calculates time dilation for an object moving at a given velocity relative to the speed of light.
2. **Gravitational (General Relativity - Simple)** — Calculates time dilation due to gravity using radius, gravitational acceleration (g), and absolute time.
3. **Gravitational (Astronomical Objects)** — Calculates time dilation and escape velocity for astronomical bodies using mass and radius.

## How It Works

### 1. Velocity-based Time Dilation
Uses the special relativity formula:

```
t' = t / sqrt(1 - (v² / c²))
```

**Inputs:** Velocity (v), Absolute time (t)

### 2. Gravitational Time Dilation (Simple)
Uses a simplified gravitational time dilation formula based on local gravity:

```
t' = t / sqrt(1 - (2gR / c²))
```

**Inputs:** Radius, power of 10 for radius, gravitational acceleration (g), absolute time, power of 10 for time

### 3. Gravitational Time Dilation (Astronomical Objects)
Uses the Schwarzschild-based gravitational time dilation formula along with escape velocity:

```
t' = t / sqrt(1 - (2GM / c²))
v_esc = sqrt(2GM / R)
```

**Inputs:** Mass, power of 10 for mass, Radius, power of 10 for radius, absolute time, power of 10 for time

## Usage

1. Compile the program:
   ```bash
   javac TimeDilation.java
   ```

2. Run the program:
   ```bash
   java TimeDilation
   ```

3. Choose an option (1, 2, or 3) when prompted.

4. Enter the required values as prompted by the program.

5. View the calculated result (time dilation and/or escape velocity).

## Constants Used

| Constant | Value |
|----------|-------|
| Speed of light (c) | 3 × 10⁸ m/s |
| Gravitational constant (G) | 6.67 × 10⁻¹¹ N·m²/kg² |

## Example

```
Time Dilation Calculator
1. Velocity-based (Special Relativity)
2. Gravitational (General Relativity - Simple)
3. Gravitational (Astronomical Objects)
Choose an option: 1
Enter Velocity:
1.5e8
Enter Absolute time:
10
Time for Object = 11.547005383792515s
```

## Notes

- Invalid menu choices prompt the user to choose again, but the loop only re-checks the same already-stored input instead of asking for new input — enter a valid option on the first try.
- Power-of-10 inputs (e.g., `radpow`, `masspow`, `rpow`, `timepow`) are currently used as direct multipliers (`value * pow`) rather than true powers of 10 (`Math.pow(10, pow)`). Enter the full multiplier itself (e.g. `1000` instead of `3`) until this is fixed.
- Requires Java (JDK 8+) to compile and run.

## License

Free to use and modify for educational purposes.
```

Created by AntiEntity314