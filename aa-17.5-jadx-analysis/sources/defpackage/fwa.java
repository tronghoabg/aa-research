package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class fwa implements fwb {
    public final fvw a;
    public final fvy b;

    public fwa(fvw fvwVar, fvy fvyVar) {
        this.a = fvwVar;
        this.b = fvyVar;
    }

    public static /* synthetic */ fwa h(fwa fwaVar, fvw fvwVar, fvy fvyVar, int i) {
        if ((i & 1) != 0) {
            fvwVar = fwaVar.a;
        }
        if ((i & 2) != 0) {
            fvyVar = fwaVar.b;
        }
        fvwVar.getClass();
        fvyVar.getClass();
        return new fwa(fvwVar, fvyVar);
    }

    @Override // defpackage.fwb
    public final CarColor a() {
        return this.b.e;
    }

    @Override // defpackage.fwb
    public final gag b() {
        return this.b.b;
    }

    @Override // defpackage.fwb
    public final gcs c() {
        return this.b.a;
    }

    @Override // defpackage.fwb
    public final afdr d() {
        return this.b.c;
    }

    @Override // defpackage.fwb
    public final boolean e() {
        return this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwa)) {
            return false;
        }
        fwa fwaVar = (fwa) obj;
        return affa.f(this.a, fwaVar.a) && affa.f(this.b, fwaVar.b);
    }

    @Override // defpackage.fwb
    public final boolean f() {
        return this.b.g;
    }

    @Override // defpackage.fwb
    public final boolean g() {
        return this.b.f;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CarTimedActionInternalModel(actionTimeInfo=" + this.a + ", carActionInternalModel=" + this.b + ")";
    }
}
