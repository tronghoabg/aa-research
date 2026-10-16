package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class tck extends defpackage.eqr {
    public boolean a;
    private defpackage.sqs h = defpackage.tda.a;

    public final void a() {
        defpackage.sqs sqsVar = this.h;
        defpackage.tdb tdbVar = sqsVar instanceof defpackage.tdb ? (defpackage.tdb) sqsVar : null;
        if (tdbVar != null) {
            super.m(tdbVar.a);
            this.h = defpackage.tda.a;
        }
    }

    public final void b(boolean z) {
        this.a = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // defpackage.eqp
    public final void m(java.lang.Object obj) {
        if (this.a) {
            this.h = new defpackage.tdb(obj);
        } else {
            super.m(obj);
        }
    }
}
