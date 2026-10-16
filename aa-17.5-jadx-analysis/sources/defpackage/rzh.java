package defpackage;

import android.os.IBinder;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class rzh implements IBinder.DeathRecipient {
    public final IBinder a;
    final /* synthetic */ Object b;
    public final Object c;
    private final /* synthetic */ int d;

    public rzh(Object obj, IBinder iBinder, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = iBinder;
        this.c = obj2;
    }

    public final CopyOnWriteArrayList a() {
        int i = this.d;
        Object obj = this.b;
        return i != 0 ? ((jfm) obj).a : ((rzi) obj).b;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.d;
        Object obj = this.b;
        if (i != 0) {
            ((jfm) obj).a.remove(this);
        } else {
            ((rzi) obj).b.remove(this);
        }
    }
}
