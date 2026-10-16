package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amk<T> extends defpackage.cyc<defpackage.amv<T>> {
    private final defpackage.ana a;
    private final defpackage.apn b;
    private final boolean c;
    private final defpackage.aor h;
    private final java.lang.Boolean d = null;
    private final defpackage.ask f = null;
    private final java.lang.Boolean g = null;
    private final defpackage.aiz i = null;

    public amk(defpackage.ana anaVar, defpackage.apn apnVar, boolean z, defpackage.aor aorVar) {
        this.a = anaVar;
        this.b = apnVar;
        this.c = z;
        this.h = aorVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.amv(this.a, this.b, this.c, this.h);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        boolean z;
        boolean z2;
        defpackage.amv amvVar = (defpackage.amv) cgeVar;
        defpackage.aor aorVar = this.h;
        amvVar.b = aorVar;
        defpackage.ana anaVar = amvVar.a;
        defpackage.ana anaVar2 = this.a;
        if (defpackage.afga.f(anaVar, anaVar2)) {
            z = false;
        } else {
            amvVar.a = anaVar2;
            amvVar.i(aorVar);
            z = true;
        }
        defpackage.apn apnVar = this.b;
        if (amvVar.d != apnVar) {
            amvVar.d = apnVar;
            z2 = true;
        } else {
            z2 = z;
        }
        amvVar.G(amvVar.e, this.c, null, apnVar, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.amk)) {
            return false;
        }
        defpackage.amk amkVar = (defpackage.amk) obj;
        if (!defpackage.afga.f(this.a, amkVar.a) || this.b != amkVar.b || this.c != amkVar.c) {
            return false;
        }
        java.lang.Boolean bool = amkVar.d;
        defpackage.ask askVar = amkVar.f;
        java.lang.Boolean bool2 = amkVar.g;
        defpackage.aiz aizVar = amkVar.i;
        return defpackage.afga.f(this.h, amkVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.aor aorVar = this.h;
        return (((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 28629151) + (aorVar != null ? aorVar.hashCode() : 0);
    }
}
