package e.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f46226a;

    /* synthetic */ d(e eVar) {
        Objects.requireNonNull(eVar);
        this.f46226a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        this.f46226a.f46227a.d();
    }
}
