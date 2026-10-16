package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lyw implements defpackage.lja {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyw(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rai] */
    @Override // defpackage.lja
    public final void a(boolean z) {
        int i = this.b;
        if (i == 0) {
            ((defpackage.lza) this.a).c.c();
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            java.util.Iterator it = ((defpackage.qfx) obj).a.e.iterator();
            while (it.hasNext()) {
                try {
                    ((defpackage.iko) it.next()).a.c(z);
                } catch (android.os.RemoteException unused) {
                }
            }
        } else if (z) {
            ((kbq) obj).g(gsv.j);
        } else {
            ((kbq) obj).g(kbq.h(defpackage.ler.b().e()));
        }
    }

    public lyw(defpackage.lza lzaVar, int i) {
        this.b = i;
        this.a = lzaVar;
    }
}
