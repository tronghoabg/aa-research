package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bje extends defpackage.cwo {
    public defpackage.blh a;
    public long b;
    public defpackage.afer c;
    public defpackage.beq d;
    public defpackage.bkb e;
    public final defpackage.crv f;

    public bje(defpackage.blh blhVar, long j, defpackage.afer aferVar) {
        this.a = blhVar;
        this.b = j;
        this.c = aferVar;
        defpackage.bax baxVar = new defpackage.bax(this, 5);
        defpackage.cqu cquVar = defpackage.crq.a;
        defpackage.crv crvVar = new defpackage.crv(null, null, baxVar);
        W(crvVar);
        this.f = crvVar;
        this.d = b();
        this.e = d();
    }

    public final defpackage.beq b() {
        return new defpackage.bjf(new defpackage.bjd(this, 3), new defpackage.bjd(this, 4), this.a);
    }

    public final defpackage.bkb d() {
        return new defpackage.bjg(new defpackage.bjd(this, 0), this.a, new defpackage.bjd(this, 2));
    }
}
