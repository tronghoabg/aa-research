package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alp extends defpackage.cyc<defpackage.alk> {
    private final defpackage.all a;
    private final boolean b = false;
    private final boolean c = true;

    public alp(defpackage.all allVar) {
        this.a = allVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.alk(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.alk alkVar = (defpackage.alk) cgeVar;
        alkVar.a = this.a;
        alkVar.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.alp)) {
            return false;
        }
        defpackage.alp alpVar = (defpackage.alp) obj;
        if (!defpackage.afga.f(this.a, alpVar.a)) {
            return false;
        }
        boolean z = alpVar.b;
        boolean z2 = alpVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + 1231;
    }
}
