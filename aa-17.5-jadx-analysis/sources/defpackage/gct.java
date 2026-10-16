package defpackage;

import androidx.car.app.model.CarSpan;

/* loaded from: classes2.dex */
public final class gct implements gmo {
    public final CarSpan a;

    public gct(CarSpan carSpan) {
        this.a = carSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gct) && affa.f(this.a, ((gct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LegacyCarSpanWrapper(originalSpan=" + this.a + ")";
    }
}
