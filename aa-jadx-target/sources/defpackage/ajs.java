package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajs extends defpackage.cge implements defpackage.cwu {
    public final defpackage.asj a;
    public boolean b;
    public boolean c;
    public boolean d;

    public ajs(defpackage.asj asjVar) {
        this.a = asjVar;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        cxnVar.q();
        if (this.b) {
            defpackage.dai.U(cxnVar, defpackage.ckd.h(-72057594037927936L, 0.3f), 0L, cxnVar.o(), 0.0f, null, 122);
        } else if (this.c || this.d) {
            defpackage.dai.U(cxnVar, defpackage.ckd.h(-72057594037927936L, 0.1f), 0L, cxnVar.o(), 0.0f, null, 122);
        }
    }

    @Override // defpackage.cge
    public final void dz() {
        ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.adh(this, (defpackage.afdk) null, 4), 3);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
