package com.google.android.gms.ads;

import D6.C0370f;
import D6.C0388o;
import D6.C0392q;
import H6.l;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;

/* loaded from: classes3.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C0388o c0388o = C0392q.f2477g.f2479b;
            zzbvf zzbvfVar = new zzbvf();
            c0388o.getClass();
            zzbzb zzbzbVar = (zzbzb) new C0370f(c0388o, this, zzbvfVar).d(this, false);
            if (zzbzbVar == null) {
                l.c("OfflineUtils is null");
            } else {
                zzbzbVar.zze(getIntent());
            }
        } catch (RemoteException e7) {
            l.c("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
