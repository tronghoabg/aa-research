package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class emw {
    public double a;
    public double b;
    public double c;
    public double d;
    private boolean e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final defpackage.emp j;

    public emw(float f) {
        this.a = 38.72983346207417d;
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new defpackage.emp();
        this.i = f;
    }

    public final float a() {
        return (float) this.i;
    }

    final defpackage.emp b(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.e) {
            if (this.i == Double.MAX_VALUE) {
                throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.b;
            if (d3 > 1.0d) {
                double d4 = this.a;
                this.f = ((-d3) * d4) + (d4 * java.lang.Math.sqrt((d3 * d3) - 1.0d));
                double d5 = this.b;
                double d6 = this.a;
                this.g = ((-d5) * d6) - (d6 * java.lang.Math.sqrt((d5 * d5) - 1.0d));
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.h = this.a * java.lang.Math.sqrt(1.0d - (d3 * d3));
            }
            this.e = true;
        }
        double d7 = d - this.i;
        double d8 = this.b;
        double d9 = j / 1000.0d;
        if (d8 > 1.0d) {
            double d10 = this.g;
            double d11 = ((d10 * d7) - d2) / (d10 - this.f);
            double d12 = d7 - d11;
            double dPow2 = java.lang.Math.pow(2.718281828459045d, d10 * d9) * d12;
            double dPow3 = java.lang.Math.pow(2.718281828459045d, this.f * d9) * d11;
            double d13 = this.g;
            double dPow4 = d12 * d13 * java.lang.Math.pow(2.718281828459045d, d13 * d9);
            double d14 = this.f;
            dCos = dPow4 + (d11 * d14 * java.lang.Math.pow(2.718281828459045d, d14 * d9));
            dPow = dPow2 + dPow3;
        } else if (d8 == 1.0d) {
            double d15 = this.a;
            double d16 = d2 + (d15 * d7);
            double d17 = d7 + (d16 * d9);
            dPow = java.lang.Math.pow(2.718281828459045d, (-d15) * d9) * d17;
            double dPow5 = d17 * java.lang.Math.pow(2.718281828459045d, (-this.a) * d9);
            double d18 = -this.a;
            dCos = (dPow5 * d18) + (d16 * java.lang.Math.pow(2.718281828459045d, d9 * d18));
        } else {
            double d19 = 1.0d / this.h;
            double d20 = this.a;
            double d21 = d19 * ((d8 * d20 * d7) + d2);
            double dPow6 = java.lang.Math.pow(2.718281828459045d, (-d8) * d20 * d9) * ((java.lang.Math.cos(this.h * d9) * d7) + (java.lang.Math.sin(this.h * d9) * d21));
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * dPow6 * d23;
            double dPow7 = java.lang.Math.pow(2.718281828459045d, (-d23) * d22 * d9);
            double d25 = this.h;
            double dSin = (-d25) * d7 * java.lang.Math.sin(d25 * d9);
            double d26 = this.h;
            dCos = d24 + (dPow7 * (dSin + (d26 * d21 * java.lang.Math.cos(d26 * d9))));
            dPow = dPow6;
        }
        defpackage.emp empVar = this.j;
        empVar.a = (float) (dPow + this.i);
        empVar.b = (float) dCos;
        return empVar;
    }

    public final void c(float f) {
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.e = false;
    }

    public final void d(float f) {
        this.i = f;
    }

    public final void e(float f) {
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = java.lang.Math.sqrt(f);
        this.e = false;
    }

    public emw() {
        this.a = 38.72983346207417d;
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new defpackage.emp();
    }
}
