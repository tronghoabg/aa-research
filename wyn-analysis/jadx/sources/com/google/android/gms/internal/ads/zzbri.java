package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;

/* loaded from: classes3.dex */
public final class zzbri extends C6.c {
    public zzbri(Context context, Looper looper, InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c) {
        super(zzcbu.zza(context), looper, interfaceC1713b, interfaceC1714c, 166);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface : new zzbrp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbrp zzp() throws DeadObjectException {
        return (zzbrp) getService();
    }
}
