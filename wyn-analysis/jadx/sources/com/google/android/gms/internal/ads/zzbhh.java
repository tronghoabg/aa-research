package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;

/* loaded from: classes3.dex */
public final class zzbhh extends C6.c {
    public zzbhh(Context context, Looper looper, InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c) {
        super(zzcbu.zza(context), looper, interfaceC1713b, interfaceC1714c, 123);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbhk ? (zzbhk) iInterfaceQueryLocalInterface : new zzbhk(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d7.d[] getApiFeatures() {
        return x6.x.f47758c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        d7.d[] availableFeatures = getAvailableFeatures();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue()) {
            d7.d dVar = x6.x.f47757b;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (!AbstractC1732v.m(availableFeatures[i5], dVar)) {
                    i5++;
                } else if (i5 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzbhk zzq() throws DeadObjectException {
        return (zzbhk) getService();
    }
}
