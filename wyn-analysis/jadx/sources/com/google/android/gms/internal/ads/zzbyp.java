package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbyp extends com.google.android.gms.ads.nativead.b {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbyp(zzbme zzbmeVar) {
        try {
            this.zzb = zzbmeVar.zzb();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbmeVar.zzc()) {
                zzbml zzbmlVarZzh = obj instanceof IBinder ? zzbmk.zzh((IBinder) obj) : null;
                if (zzbmlVarZzh != null) {
                    this.zza.add(new zzbyr(zzbmlVarZzh));
                }
            }
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
    }

    public final List<com.google.android.gms.ads.nativead.c> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
