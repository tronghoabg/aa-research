package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class lzk extends eqm {
    private final pxp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzk(pxp pxpVar) {
        super(yls.a);
        int i = yfq.d;
        this.a = pxpVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.eqj
    public final void c() {
        pxp pxpVar = this.a;
        synchronized (pxpVar.b) {
            ?? r2 = pxpVar.a;
            boolean zIsEmpty = r2.isEmpty();
            r2.add(this);
            if (zIsEmpty) {
                try {
                    ows owsVarA = pxpVar.a();
                    ((ype) ((ype) lzv.a.f()).ai(4536)).y("requestSuggestionUpdates(), manager=%s", owsVarA);
                    if (owsVarA != null) {
                        owsVarA.gk(3, owsVarA.gh());
                    }
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) lzv.a.g()).p(e)).ai(4537)).u("Error notifying nav provider: requestSuggestionUpdates");
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.eqj
    public final void d() {
        pxp pxpVar = this.a;
        synchronized (pxpVar.b) {
            ?? r2 = pxpVar.a;
            r2.remove(this);
            if (r2.isEmpty()) {
                try {
                    ows owsVarA = pxpVar.a();
                    if (owsVarA != null) {
                        owsVarA.gk(4, owsVarA.gh());
                    }
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) lzv.a.g()).p(e)).ai(4538)).u("Error notifying nav provider: stopSuggestionUpdates");
                }
            }
        }
    }
}
