package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzcdb {
    public static final zzccp zza(Context context, String str, zzbvj zzbvjVar) {
        try {
            IBinder iBinderZze = ((zzcct) tg.b.W(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcda.zza)).zze(new BinderC3877b(context), str, zzbvjVar, 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(iBinderZze);
        } catch (H6.n e7) {
            e = e7;
            H6.l.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e10) {
            e = e10;
            H6.l.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
