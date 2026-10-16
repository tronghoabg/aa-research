package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final /* synthetic */ class qod implements svu {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qod(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        ConnectionResult connectionResult;
        if (this.c == 0) {
            ((AtomicLong) ((rhj) this.b).c).set(this.a);
            return;
        }
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof skw) && (connectionResult = ((skw) exc).a.i) != null && connectionResult.c == 24) {
            ((qkv) this.b).c.set(this.a);
        }
    }
}
