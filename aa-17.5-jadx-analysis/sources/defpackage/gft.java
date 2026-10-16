package defpackage;

import androidx.car.app.model.CarSpan;

/* loaded from: classes2.dex */
public final class gft {
    public final int a;
    public final int b;
    public final CarSpan c;

    public gft(int i, int i2, CarSpan carSpan) {
        this.a = i;
        this.b = i2;
        this.c = carSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gft)) {
            return false;
        }
        gft gftVar = (gft) obj;
        return this.a == gftVar.a && this.b == gftVar.b && affa.f(this.c, gftVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SpanWrapper(start=" + this.a + ", end=" + this.b + ", carSpan=" + this.c + ")";
    }
}
