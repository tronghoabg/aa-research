package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gaj implements gag {
    public final String a;
    private final CarColor b = null;

    public gaj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaj)) {
            return false;
        }
        gaj gajVar = (gaj) obj;
        if (!affa.f(this.a, gajVar.a)) {
            return false;
        }
        CarColor carColor = gajVar.b;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "LazyInvalidIconInternalModel(error=" + this.a + ", tint=null)";
    }
}
