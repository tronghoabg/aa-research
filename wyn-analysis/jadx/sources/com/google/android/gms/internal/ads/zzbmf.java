package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbmf {
    private final zzbme zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbmf(zzbme zzbmeVar) {
        IBinder iBinder;
        this.zza = zzbmeVar;
        try {
            this.zzc = zzbmeVar.zzb();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbmeVar.zzc()) {
                zzbml zzbmjVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                }
                if (zzbmjVar != null) {
                    this.zzb.add(new zzbmm(zzbmjVar));
                }
            }
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
    }

    public final List<A6.b> getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
