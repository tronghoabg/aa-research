package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbmm extends A6.b {
    private final zzbml zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbmm(zzbml zzbmlVar) {
        double dZzd;
        int iZze;
        InterfaceC3876a interfaceC3876aZzb;
        this.zza = zzbmlVar;
        Uri uriZzc = null;
        try {
            interfaceC3876aZzb = zzbmlVar.zzb();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        Drawable drawable = interfaceC3876aZzb != null ? (Drawable) BinderC3877b.S(interfaceC3876aZzb) : null;
        this.zzb = drawable;
        try {
            uriZzc = this.zza.zzc();
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
        this.zzc = uriZzc;
        try {
            dZzd = this.zza.zzd();
        } catch (RemoteException e11) {
            H6.l.d("", e11);
            dZzd = 1.0d;
        }
        this.zzd = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e12) {
            H6.l.d("", e12);
            iZze = -1;
        }
        this.zze = iZze;
        try {
            iZzf = this.zza.zzf();
        } catch (RemoteException e13) {
            H6.l.d("", e13);
        }
        this.zzf = iZzf;
    }

    @Override // A6.b
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // A6.b
    public final double getScale() {
        return this.zzd;
    }

    @Override // A6.b
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // A6.b
    public final int zza() {
        return this.zze;
    }

    @Override // A6.b
    public final int zzb() {
        return this.zzf;
    }
}
