package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes3.dex */
class yup extends yur {
    final int a;
    final Duration b;
    final double c;

    public yup(Duration duration, int i) {
        woy.V(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
        zen.c(duration);
        this.b = duration;
        woy.W(true, "%s (%s) must be > 0", "multiplier", Double.valueOf(2.0d));
        this.c = 2.0d;
    }

    @Override // defpackage.yur
    public final boolean a(int i) {
        woy.V(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yup) {
            yup yupVar = (yup) obj;
            if (this.b.equals(yupVar.b)) {
                double d = yupVar.c;
                if (this.a == yupVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, Double.valueOf(2.0d));
    }
}
