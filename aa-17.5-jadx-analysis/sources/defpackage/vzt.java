package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
final class vzt extends ContentObserver {
    final /* synthetic */ vzu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzt(vzu vzuVar) {
        super(null);
        this.a = vzuVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        vzu vzuVar = this.a;
        synchronized (vzuVar.g) {
            vzuVar.h = null;
            war.e();
        }
        synchronized (vzuVar) {
            Iterator it = vzuVar.i.iterator();
            while (it.hasNext()) {
                ((vzv) it.next()).a();
            }
        }
    }
}
