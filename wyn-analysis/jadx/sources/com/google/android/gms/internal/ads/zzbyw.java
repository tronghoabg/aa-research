package com.google.android.gms.internal.ads;

import D6.e1;
import android.os.RemoteException;
import java.util.List;
import x6.InterfaceC4482m;

/* loaded from: classes3.dex */
public final class zzbyw implements com.google.android.gms.ads.nativead.k {
    private final zzbnc zza;
    private com.google.android.gms.ads.nativead.h zzb;

    public zzbyw(zzbnc zzbncVar) {
        this.zza = zzbncVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final com.google.android.gms.ads.nativead.h getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzbnc zzbncVar = this.zza;
                if (zzbncVar.zzo()) {
                    this.zzb = new zzbyq(zzbncVar);
                }
            }
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        return this.zzb;
    }

    public final com.google.android.gms.ads.nativead.c getImage(String str) {
        try {
            zzbml zzbmlVarZzf = this.zza.zzf(str);
            if (zzbmlVarZzf != null) {
                return new zzbyr(zzbmlVarZzf);
            }
            return null;
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final InterfaceC4482m getMediaContent() {
        try {
            zzbnc zzbncVar = this.zza;
            if (zzbncVar.zzs() != null) {
                return new e1(zzbncVar.zzs(), zzbncVar);
            }
            return null;
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zze(str);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzi(str);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }
}
