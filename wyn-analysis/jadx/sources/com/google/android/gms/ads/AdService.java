package com.google.android.gms.ads;

import D6.C0370f;
import D6.C0388o;
import D6.C0392q;
import H6.l;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;

/* loaded from: classes3.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C0388o c0388o = C0392q.f2477g.f2479b;
            zzbvf zzbvfVar = new zzbvf();
            c0388o.getClass();
            ((zzbzb) new C0370f(c0388o, this, zzbvfVar).d(this, false)).zze(intent);
        } catch (RemoteException e7) {
            l.c("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }
}
