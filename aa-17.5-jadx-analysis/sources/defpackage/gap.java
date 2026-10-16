package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gap implements gbg {
    public final aiyk a;
    private final CarColor b;

    public gap(aiyk aiykVar, CarColor carColor) {
        this.a = aiykVar;
        this.b = carColor;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gap)) {
            return false;
        }
        gap gapVar = (gap) obj;
        return affa.f(this.a, gapVar.a) && affa.f(this.b, gapVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.b;
        return iHashCode + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "DynamicLazyIconUiModel(iconFlow=" + this.a + ", tint=" + this.b + ")";
    }
}
