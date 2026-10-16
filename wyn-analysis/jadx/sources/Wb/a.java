package Wb;

import Q3.h;
import T3.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import xa.d;

/* loaded from: classes5.dex */
public final class a extends BroadcastReceiver implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15450a;

    /* renamed from: b, reason: collision with root package name */
    public final d f15451b;

    /* renamed from: c, reason: collision with root package name */
    public C4271h f15452c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f15453d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public h f15454e;

    public a(Context context, d dVar) {
        this.f15450a = context;
        this.f15451b = dVar;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f15450a.unregisterReceiver(this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        h hVar = this.f15454e;
        if (hVar != null) {
            ((ConnectivityManager) this.f15451b.f47873b).unregisterNetworkCallback(hVar);
            this.f15454e = null;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        this.f15452c = (C4271h) interfaceC4270g;
        int i5 = Build.VERSION.SDK_INT;
        d dVar = this.f15451b;
        if (i5 >= 24) {
            h hVar = new h(this, 1);
            this.f15454e = hVar;
            ((ConnectivityManager) dVar.f47873b).registerDefaultNetworkCallback(hVar);
        } else {
            this.f15450a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) dVar.f47873b;
        this.f15453d.post(new r(19, this, d.m(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C4271h c4271h = this.f15452c;
        if (c4271h != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f15451b.f47873b;
            c4271h.a(d.m(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
