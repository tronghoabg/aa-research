package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lzr extends defpackage.eqs {
    private final defpackage.pyk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzr(defpackage.pyk pykVar) {
        super(defpackage.ymx.a);
        int i = defpackage.ygw.d;
        this.a = pykVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.eqp
    public final void c() {
        defpackage.pyk pykVar = this.a;
        synchronized (pykVar.b) {
            ?? r2 = pykVar.a;
            boolean zIsEmpty = r2.isEmpty();
            r2.add(this);
            if (zIsEmpty) {
                try {
                    defpackage.oxp oxpVarA = pykVar.a();
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.mac.a.f()).ai(4539)).y("requestSuggestionUpdates(), manager=%s", oxpVarA);
                    if (oxpVarA != null) {
                        oxpVarA.fs(3, oxpVarA.fp());
                    }
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mac.a.g()).p(e)).ai(4540)).u("Error notifying nav provider: requestSuggestionUpdates");
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.eqp
    public final void d() {
        defpackage.pyk pykVar = this.a;
        synchronized (pykVar.b) {
            ?? r2 = pykVar.a;
            r2.remove(this);
            if (r2.isEmpty()) {
                try {
                    defpackage.oxp oxpVarA = pykVar.a();
                    if (oxpVarA != null) {
                        oxpVarA.fs(4, oxpVarA.fp());
                    }
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mac.a.g()).p(e)).ai(4541)).u("Error notifying nav provider: stopSuggestionUpdates");
                }
            }
        }
    }
}
