package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajd extends defpackage.cge implements defpackage.cwu, defpackage.cyp, defpackage.czc {
    public long a;
    public defpackage.cld c;
    public defpackage.cku d;
    private defpackage.dlz f;
    private defpackage.cku g;
    private defpackage.cld h;
    public float b = 1.0f;
    private long e = 9205357640488583168L;

    public ajd(long j, defpackage.cld cldVar) {
        this.a = j;
        this.c = cldVar;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        defpackage.cxn cxnVar2;
        defpackage.cku ckuVar;
        if (this.c == defpackage.cky.a) {
            long j = this.a;
            float[] fArr = defpackage.clr.a;
            if (j != defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u)) {
                defpackage.dai.U(cxnVar, this.a, 0L, 0L, 0.0f, null, 126);
            }
        } else {
            if (cxnVar.o() == this.e && cxnVar.p() == this.f && defpackage.afga.f(this.h, this.c)) {
                ckuVar = this.g;
                ckuVar.getClass();
                cxnVar2 = cxnVar;
            } else {
                cxnVar2 = cxnVar;
                defpackage.dai.z(this, new defpackage.ajz(this, cxnVar2, 1, null));
                ckuVar = this.d;
                this.d = null;
            }
            defpackage.cku ckuVar2 = ckuVar;
            this.g = ckuVar2;
            this.e = cxnVar2.o();
            this.f = cxnVar2.p();
            this.h = this.c;
            ckuVar2.getClass();
            long j2 = this.a;
            float[] fArr2 = defpackage.clr.a;
            if (j2 != defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u)) {
                defpackage.dai.aJ(cxnVar2, ckuVar2, this.a, null, 60);
            }
        }
        cxnVar.q();
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.def.U, this.c);
        dekVar.a(defpackage.def.T, new defpackage.bns(this, 1));
    }

    @Override // defpackage.cyp
    public final void r() {
        this.e = 9205357640488583168L;
        this.f = null;
        this.g = null;
        this.h = null;
        defpackage.dai.G(this);
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final boolean z() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
