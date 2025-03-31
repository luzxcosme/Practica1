import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coordenadas_cartesianas(self):
        print(f"Los puntos del plano cartesiano son: ({self.x}, {self.y})")

    def coordenadas_polares(self):
        c = (self.x**2 + self.y**2)**(1/2)
        a = math.atan2(self.y, self.x)
        print(f"Las coordenadas polares son: (r = {c}, θ = {a})")

    def __str__(self):
        return f"({self.x}, {self.y})"


if __name__ == "__main__":
    p = Punto(3, 4)
    p.coordenadas_cartesianas()
    p.coordenadas_polares()
    p.__str__()
