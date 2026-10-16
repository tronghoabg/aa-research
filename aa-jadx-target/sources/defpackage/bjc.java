package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjc extends defpackage.cyc<defpackage.bje> {
    private final defpackage.blh a;
    private final long b;
    private final defpackage.afer c;

    public bjc(defpackage.blh blhVar, long j, defpackage.afer aferVar) {
        this.a = blhVar;
        this.b = j;
        this.c = aferVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bje(this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bje bjeVar = (defpackage.bje) cgeVar;
        defpackage.blh blhVar = bjeVar.a;
        defpackage.blh blhVar2 = this.a;
        boolean zF = defpackage.afga.f(blhVar2, blhVar);
        bjeVar.a = blhVar2;
        bjeVar.b = this.b;
        bjeVar.c = this.c;
        if (!zF) {
            bjeVar.d = bjeVar.b();
            bjeVar.e = bjeVar.d();
        }
        bjeVar.f.u();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bjc)) {
            return false;
        }
        defpackage.bjc bjcVar = (defpackage.bjc) obj;
        return defpackage.afga.f(this.a, bjcVar.a) && this.b == bjcVar.b && this.c == bjcVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }
}
