package defpackage;

/* loaded from: classes2.dex */
final class htp implements iej {
    private final dnw a;

    public htp(dnw dnwVar) {
        this.a = dnwVar;
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        Throwable runtimeException = hwtVar;
        if (hwtVar == null) {
            runtimeException = new RuntimeException("Unknown error");
        }
        this.a.d(runtimeException);
        return true;
    }

    @Override // defpackage.iej
    public final boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        try {
            this.a.b(new gms(obj, (byte[]) null));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }
}
