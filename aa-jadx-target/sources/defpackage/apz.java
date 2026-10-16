package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apz extends defpackage.cyc<defpackage.aqj> {
    private final defpackage.aqk a;
    private final defpackage.apn b;
    private final boolean c;
    private final boolean d;
    private final defpackage.aor f;
    private final defpackage.aiz i = null;
    private final defpackage.ask g = null;
    private final defpackage.and h = null;

    public apz(defpackage.aqk aqkVar, defpackage.apn apnVar, boolean z, boolean z2, defpackage.aor aorVar) {
        this.a = aqkVar;
        this.b = apnVar;
        this.c = z;
        this.d = z2;
        this.f = aorVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.aqj(this.a, null, this.f, this.b, this.c, this.d, null, null);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.aqj) cgeVar).L(this.a, this.b, null, this.c, this.d, this.f, null, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.apz)) {
            return false;
        }
        defpackage.apz apzVar = (defpackage.apz) obj;
        if (!defpackage.afga.f(this.a, apzVar.a) || this.b != apzVar.b) {
            return false;
        }
        defpackage.aiz aizVar = apzVar.i;
        if (this.c != apzVar.c || this.d != apzVar.d || !defpackage.afga.f(this.f, apzVar.f)) {
            return false;
        }
        defpackage.ask askVar = apzVar.g;
        defpackage.and andVar = apzVar.h;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.aor aorVar = this.f;
        return ((((((iHashCode * 961) + (true != this.c ? 1237 : 1231)) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (aorVar != null ? aorVar.hashCode() : 0)) * 961;
    }
}
