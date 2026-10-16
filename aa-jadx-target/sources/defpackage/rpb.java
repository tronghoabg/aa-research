package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpb {
    public final defpackage.qyf a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final android.os.Handler g;
    public defpackage.qyh h;
    public ajnd i;

    public rpb(defpackage.qyf qyfVar, android.os.Looper looper) {
        this.g = new defpackage.rpa(this, looper);
        qyfVar.getClass();
        this.a = qyfVar;
    }

    public final void a() {
        try {
            defpackage.qyh qyhVar = this.h;
            if (qyhVar != null) {
                this.a.v(qyhVar);
            }
        } catch (android.os.RemoteException e) {
            if (defpackage.omv.c("CAR.SENSOR", 4)) {
                defpackage.rrx.d(4, "CAR.SENSOR", e, "RemoteException from car service: %s", e.getMessage());
            }
        } catch (java.lang.IllegalStateException unused) {
        }
        this.h = null;
        this.i = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void b(int i) throws defpackage.qst, rlo {
        try {
            this.a.j(i);
        } catch (android.os.RemoteException e) {
            defpackage.oml.I(e);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.G(e2);
        }
    }
}
