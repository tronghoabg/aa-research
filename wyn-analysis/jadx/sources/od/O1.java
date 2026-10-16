package od;

/* loaded from: classes5.dex */
public final class O1 extends S1 {
    @Override // od.S1
    public final boolean q(P1 p12) {
        synchronized (p12) {
            try {
                if (p12.f41779c != 0) {
                    return false;
                }
                p12.f41779c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.S1
    public final void r(P1 p12) {
        synchronized (p12) {
            p12.f41779c = 0;
        }
    }
}
