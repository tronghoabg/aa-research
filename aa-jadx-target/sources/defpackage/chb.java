package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chb extends defpackage.cge implements defpackage.czh, defpackage.cwn, defpackage.cxc {
    public final defpackage.affc a;
    public defpackage.chb b;
    public long c;
    public defpackage.chb d;
    private final java.lang.Object e;

    public chb(byte[] bArr) {
        this.a = null;
        this.e = defpackage.cha.a;
        this.c = 0L;
    }

    public final void b(defpackage.sr srVar) {
        defpackage.chb chbVar = this.b;
        if (chbVar != null) {
            chbVar.b(srVar);
        }
        this.b = null;
    }

    public final void d(defpackage.sr srVar) {
        defpackage.czh czhVar;
        defpackage.chb chbVar;
        defpackage.chb chbVar2 = this.b;
        defpackage.chb chbVar3 = null;
        if (chbVar2 == null || !defpackage.cdp.c(chbVar2, defpackage.cdp.j(srVar))) {
            if (this.q.A) {
                defpackage.afgv afgvVar = new defpackage.afgv();
                defpackage.dai.p(this, new glu(afgvVar, this, srVar, 1));
                czhVar = (defpackage.czh) afgvVar.a;
            } else {
                czhVar = null;
            }
            chbVar = (defpackage.chb) czhVar;
        } else {
            chbVar = chbVar2;
        }
        if (chbVar != null && chbVar2 == null) {
            chbVar.d(srVar);
        } else if (chbVar == null && chbVar2 != null) {
            chbVar2.b(srVar);
        } else if (!defpackage.afga.f(chbVar, chbVar2)) {
            if (chbVar != null) {
                chbVar.d(srVar);
                chbVar3 = chbVar;
            }
            if (chbVar2 != null) {
                chbVar2.b(srVar);
            }
            chbVar = chbVar3;
        } else if (chbVar != null) {
            chbVar.d(srVar);
        }
        this.b = chbVar;
    }

    @Override // defpackage.cyb
    public final void dB(long j) {
        this.c = j;
    }

    @Override // defpackage.czh
    public final java.lang.Object dx() {
        return this.e;
    }

    @Override // defpackage.cge
    public final void q() {
        this.d = null;
        this.b = null;
    }

    public chb() {
        this(null);
    }

    @Override // defpackage.cxc
    public final /* synthetic */ void f(defpackage.ctc ctcVar) {
    }
}
