package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gbh implements gbg {
    public final String a;
    private final CarColor b = null;

    public gbh(String str) {
        this.a = str;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbh)) {
            return false;
        }
        gbh gbhVar = (gbh) obj;
        if (!affa.f(this.a, gbhVar.a)) {
            return false;
        }
        CarColor carColor = gbhVar.b;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "LazyInvalidIconUiModel(error=" + this.a + ", tint=null)";
    }
}
