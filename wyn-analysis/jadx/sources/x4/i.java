package x4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import uc.C4271h;

/* loaded from: classes.dex */
public final class i extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C4271h f47707a;

    /* renamed from: b, reason: collision with root package name */
    public int f47708b;

    public i(C4271h c4271h) {
        this.f47707a = c4271h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            C4271h c4271h = this.f47707a;
            if (zIsProviderEnabled || zIsProviderEnabled2) {
                int i5 = this.f47708b;
                if (i5 == 0 || i5 == 1) {
                    this.f47708b = 2;
                    c4271h.a(1);
                    return;
                }
                return;
            }
            int i10 = this.f47708b;
            if (i10 == 0 || i10 == 2) {
                this.f47708b = 1;
                c4271h.a(0);
            }
        }
    }
}
