package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
final /* synthetic */ class zzcda implements H6.m {
    static final /* synthetic */ zzcda zza = new zzcda();

    private /* synthetic */ zzcda() {
    }

    @Override // H6.m
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof zzcct ? (zzcct) iInterfaceQueryLocalInterface : new zzcct(iBinder);
    }
}
