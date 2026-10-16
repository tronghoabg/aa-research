package A7;

import E5.C0441b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import ba.C1521a;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;

/* loaded from: classes4.dex */
public final class V1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f725a;

    /* renamed from: b, reason: collision with root package name */
    public Object f726b;

    private final void a(Context context, Intent intent) {
        R4.c cVar = (R4.c) this.f726b;
        boolean z2 = cVar.f10236c;
        cVar.f10236c = R4.c.c(context);
        if (z2 != ((R4.c) this.f726b).f10236c) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + ((R4.c) this.f726b).f10236c);
            }
            R4.c cVar2 = (R4.c) this.f726b;
            C1521a c1521a = cVar2.f10235b;
            if (!cVar2.f10236c) {
                c1521a.getClass();
                return;
            }
            synchronized (((com.bumptech.glide.h) c1521a.f19415c)) {
                ((C0441b) c1521a.f19414b).j();
            }
        }
    }

    public void b() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((W9.w) this.f726b).f15400d).f27361b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.V1.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ V1(Object obj, int i5) {
        this.f725a = i5;
        this.f726b = obj;
    }

    public V1(C0273n0 c0273n0) {
        this.f725a = 0;
        this.f726b = c0273n0;
    }

    public V1(G6.I i5) {
        this.f725a = 2;
        Objects.requireNonNull(i5);
        this.f726b = i5;
    }

    public /* synthetic */ V1(G6.U u10) {
        this.f725a = 3;
        Objects.requireNonNull(u10);
        this.f726b = u10;
    }
}
