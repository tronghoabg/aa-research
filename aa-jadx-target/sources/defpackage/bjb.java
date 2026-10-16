package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjb {
    public final long a;
    public final defpackage.blh b;
    public final long c;
    public defpackage.bjh d = defpackage.bjh.a;
    public final defpackage.cgf e;
    public defpackage.axd f;
    private final defpackage.bcf g;

    public bjb(long j, defpackage.blh blhVar, long j2) {
        this.a = j;
        this.b = blhVar;
        this.c = j2;
        defpackage.bcf bcfVar = new defpackage.bcf();
        this.g = bcfVar;
        this.e = defpackage.tq.h(new defpackage.bjc(blhVar, j, new defpackage.bjd(this, 1)).a(new defpackage.bcd(bcfVar)), defpackage.cqz.b);
    }

    public final void a() {
        this.f = this.b.i();
    }

    public final void b() {
        if (this.f != null) {
            this.b.h();
            this.f = null;
        }
    }

    public final void c(defpackage.azu azuVar) {
        this.d = defpackage.bjh.a(this.d, null, null, azuVar, 3);
    }
}
