package defpackage;

import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lyq implements lit {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qzm] */
    @Override // defpackage.lit
    public final void a(boolean z) {
        int i = this.b;
        if (i == 0) {
            ((lyu) this.a).c.c();
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            Iterator it = ((qfc) obj).a.e.iterator();
            while (it.hasNext()) {
                try {
                    ((ikf) it.next()).a.c(z);
                } catch (RemoteException unused) {
                }
            }
        } else if (z) {
            ((kbn) obj).g(gsn.j);
        } else {
            ((kbn) obj).g(kbn.h(lbh.c().e()));
        }
    }

    public lyq(lyu lyuVar, int i) {
        this.b = i;
        this.a = lyuVar;
    }
}
