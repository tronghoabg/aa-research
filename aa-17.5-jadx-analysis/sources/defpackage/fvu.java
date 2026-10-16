package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class fvu implements gmo {
    public final fvv a;
    public final fwb b;
    public final afdr c;
    private final CarText d;
    private final gag e;
    private final boolean f;
    private final CarColor g;

    public fvu(fvv fvvVar, fwb fwbVar, afdr afdrVar) {
        this.a = fvvVar;
        this.b = fwbVar;
        this.d = null;
        this.e = null;
        this.c = afdrVar;
        this.f = true;
        this.g = null;
        if (woy.da(new gmo[]{fvvVar, fwbVar}).size() == 1) {
            return;
        }
        throw new IllegalArgumentException("ActionDelegateInternalModel requires that only a single field be non-null. SPECIFIC_ACTION: [" + fvvVar + "],GENERIC_ACTION: [" + fwbVar + "]");
    }

    public static /* synthetic */ fvu d(fvu fvuVar, fvv fvvVar, fwb fwbVar, afdr afdrVar, int i) {
        if ((i & 1) != 0) {
            fvvVar = fvuVar.a;
        }
        if ((i & 2) != 0) {
            fwbVar = fvuVar.b;
        }
        if ((i & 4) != 0) {
            CarText carText = fvuVar.d;
        }
        if ((i & 8) != 0) {
            gag gagVar = fvuVar.e;
        }
        if ((i & 16) != 0) {
            afdrVar = fvuVar.c;
        }
        boolean z = fvuVar.f;
        CarColor carColor = fvuVar.g;
        return new fvu(fvvVar, fwbVar, afdrVar);
    }

    public final boolean a() {
        fvv fvvVar = this.a;
        if (fvvVar != null && fvvVar.a()) {
            return true;
        }
        fwb fwbVar = this.b;
        fwa fwaVar = fwbVar instanceof fwa ? (fwa) fwbVar : null;
        return fwaVar != null && fwaVar.a.a;
    }

    public final boolean b() {
        fwb fwbVar = this.b;
        if (fwbVar != null) {
            return fwbVar.f();
        }
        fvv fvvVar = this.a;
        return (fvvVar == null || (fvvVar.a & 2) == 0) ? false : true;
    }

    public final boolean c() {
        fwb fwbVar = this.b;
        if (fwbVar != null) {
            return fwbVar.g();
        }
        fvv fvvVar = this.a;
        if (fvvVar == null) {
            return false;
        }
        return fvvVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvu)) {
            return false;
        }
        fvu fvuVar = (fvu) obj;
        if (!affa.f(this.a, fvuVar.a) || !affa.f(this.b, fvuVar.b)) {
            return false;
        }
        CarText carText = fvuVar.d;
        if (!affa.f(null, null)) {
            return false;
        }
        gag gagVar = fvuVar.e;
        if (!affa.f(null, null) || !affa.f(this.c, fvuVar.c)) {
            return false;
        }
        boolean z = fvuVar.f;
        CarColor carColor = fvuVar.g;
        return affa.f(null, null);
    }

    public final int hashCode() {
        fvv fvvVar = this.a;
        int iHashCode = fvvVar == null ? 0 : fvvVar.hashCode();
        fwb fwbVar = this.b;
        int iHashCode2 = fwbVar == null ? 0 : fwbVar.hashCode();
        int i = iHashCode * 31;
        afdr afdrVar = this.c;
        return (((((i + iHashCode2) * 29791) + (afdrVar != null ? afdrVar.hashCode() : 0)) * 31) + a.f(true)) * 31;
    }

    public final String toString() {
        return "ActionDelegateInternalModel(specificActionInternal=" + this.a + ", genericActionInternal=" + this.b + ", title=null, icon=null, onClick=" + this.c + ", isEnabled=true, backgroundColor=null)";
    }

    public fvu() {
        this(null, null, null);
    }
}
