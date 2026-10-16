package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kjq extends defpackage.kjr {
    public final defpackage.kkf a;
    public final com.google.android.gms.car.control.CarAction b;
    public final defpackage.kkf c;
    public final java.util.List d;
    private final boolean e;
    private final int f;

    public kjq(defpackage.kkf kkfVar, com.google.android.gms.car.control.CarAction carAction, defpackage.kkf kkfVar2, boolean z, java.util.List list, int i) {
        this.a = kkfVar;
        this.b = carAction;
        this.c = kkfVar2;
        this.e = z;
        this.d = list;
        this.f = i;
    }

    @Override // defpackage.kjr
    public final int a() {
        return this.f;
    }

    @Override // defpackage.kjr
    public final java.util.List b() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kjq)) {
            return false;
        }
        defpackage.kjq kjqVar = (defpackage.kjq) obj;
        return defpackage.afga.f(this.a, kjqVar.a) && defpackage.afga.f(this.b, kjqVar.b) && defpackage.afga.f(this.c, kjqVar.c) && this.e == kjqVar.e && defpackage.afga.f(this.d, kjqVar.d) && this.f == kjqVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        com.google.android.gms.car.control.CarAction carAction = this.b;
        int i = (iHashCode + (carAction == null ? 0 : carAction.a)) * 31;
        defpackage.kkf kkfVar = this.c;
        return ((((((i + (kkfVar != null ? kkfVar.hashCode() : 0)) * 31) + defpackage.a.e(this.e)) * 31) + this.d.hashCode()) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "CarPropertyControl(property=" + this.a + ", associatedAction=" + this.b + ", associatedProperty=" + this.c + ", enabled=" + this.e + ", metadata=" + this.d + ", sideAffinity=" + this.f + ")";
    }
}
