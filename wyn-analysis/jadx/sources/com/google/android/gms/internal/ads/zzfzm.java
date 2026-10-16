package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import q7.BinderC3877b;
import r7.C3934d;

/* loaded from: classes3.dex */
public final class zzfzm {
    final zzfzp zza;
    final boolean zzb;

    private zzfzm(zzfzp zzfzpVar) {
        this.zza = zzfzpVar;
        this.zzb = zzfzpVar != null;
    }

    public static zzfzm zzb(Context context, String str, String str2) throws zzfyp {
        zzfzp zzfznVar;
        try {
            try {
                try {
                    IBinder iBinderB = C3934d.c(context, C3934d.f44523b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        zzfznVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfznVar = iInterfaceQueryLocalInterface instanceof zzfzp ? (zzfzp) iInterfaceQueryLocalInterface : new zzfzn(iBinderB);
                    }
                    zzfznVar.zzj(new BinderC3877b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfzm(zzfznVar);
                } catch (Exception e7) {
                    throw new zzfyp(e7);
                }
            } catch (RemoteException | zzfyp | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfzm(new zzfzq());
            }
        } catch (Exception e10) {
            throw new zzfyp(e10);
        }
    }

    public static zzfzm zzc() {
        zzfzq zzfzqVar = new zzfzq();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfzm(zzfzqVar);
    }

    public final zzfzl zza(byte[] bArr) {
        return new zzfzl(this, bArr, null);
    }
}
