package defpackage;

import androidx.car.app.model.CarSpan;

/* loaded from: classes2.dex */
public final class hlx {
    public final CarSpan a;
    public final int b;
    public final int c;
    public final int d;

    public hlx(CarSpan carSpan, int i, int i2, int i3) {
        this.a = carSpan;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        return "[" + String.valueOf(this.a) + ": " + this.b + ", " + this.c + ", flags: " + this.d + "]";
    }
}
