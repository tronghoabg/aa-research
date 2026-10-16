package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayv extends defpackage.cyc<defpackage.ayy> {
    private final defpackage.ayz a;
    private final boolean b = false;
    private final defpackage.apn c;
    private final defpackage.kwv d;

    public ayv(defpackage.ayz ayzVar, defpackage.kwv kwvVar, defpackage.apn apnVar) {
        this.a = ayzVar;
        this.d = kwvVar;
        this.c = apnVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ayy(this.a, this.d, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ayy ayyVar = (defpackage.ayy) cgeVar;
        ayyVar.b = this.a;
        ayyVar.d = this.d;
        ayyVar.c = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ayv)) {
            return false;
        }
        defpackage.ayv ayvVar = (defpackage.ayv) obj;
        if (!defpackage.afga.f(this.a, ayvVar.a) || !defpackage.afga.f(this.d, ayvVar.d)) {
            return false;
        }
        boolean z = ayvVar.b;
        return this.c == ayvVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }
}
