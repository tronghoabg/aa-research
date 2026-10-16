package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pdj implements IBinder.DeathRecipient {
    public final IBinder a;
    public final IBinder b;
    public final IInterface c;
    final /* synthetic */ pbf d;

    public pdj(pbf pbfVar, IBinder iBinder, pbj pbjVar) {
        this.d = pbfVar;
        this.a = iBinder;
        this.b = pbjVar.asBinder();
        this.c = pbjVar;
    }

    public static pdj a(IBinder iBinder, Map map) {
        return (pdj) map.get(iBinder);
    }

    @ResultIgnorabilityUnspecified
    public final void b(Map map, boolean z) {
        IBinder iBinder = this.a;
        if (map.containsKey(iBinder)) {
            map.remove(iBinder);
            if (z) {
                return;
            }
            this.b.unlinkToDeath(this, 0);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        Map map = this.d.a;
        synchronized (map) {
            b(map, true);
        }
    }
}
