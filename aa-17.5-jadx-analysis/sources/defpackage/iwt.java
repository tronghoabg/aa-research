package defpackage;

import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class iwt implements IBinder.DeathRecipient {
    public final Context a;
    public final qve b;
    public final int c;
    public final List d = new ArrayList();
    public int e = 0;
    public final ajmd f;

    public iwt(Context context, qve qveVar, ajmd ajmdVar, int i) {
        this.a = context;
        this.b = qveVar;
        this.f = ajmdVar;
        this.c = i;
    }

    public final void a() {
        this.b.asBinder().unlinkToDeath(this, 0);
        List<iww> list = this.d;
        synchronized (list) {
            for (iww iwwVar : list) {
                String str = iwwVar.b;
                iwwVar.j();
                iwwVar.b();
            }
            list.clear();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
        this.f.G(this);
    }
}
