package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import ef.C2529m;

/* loaded from: classes4.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29716a;

    public r(Context context) {
        this.f29716a = context;
    }

    public final Fe.c a() {
        Object objZ;
        try {
            objZ = AdvertisingIdClient.getAdvertisingIdInfo(this.f29716a);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Fe.c oVar = null;
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) objZ;
        Fe.c cVar = p.f29715a;
        if (info == null) {
            return cVar;
        }
        if (info.isLimitAdTrackingEnabled()) {
            oVar = cVar;
        } else {
            String id2 = info.getId();
            if (id2 != null) {
                oVar = new o(id2);
            }
        }
        return oVar != null ? oVar : cVar;
    }
}
