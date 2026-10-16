package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbyr extends com.google.android.gms.ads.nativead.c {
    private final zzbml zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbyr(zzbml zzbmlVar) {
        Uri uriZzc;
        double dZzd;
        int iZze;
        InterfaceC3876a interfaceC3876aZzb;
        this.zzb = zzbmlVar;
        Map mapZzg = null;
        try {
            interfaceC3876aZzb = zzbmlVar.zzb();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        Drawable drawable = interfaceC3876aZzb != null ? (Drawable) BinderC3877b.S(interfaceC3876aZzb) : null;
        this.zzc = drawable;
        try {
            uriZzc = this.zzb.zzc();
        } catch (RemoteException e10) {
            H6.l.d("", e10);
            uriZzc = null;
        }
        this.zzd = uriZzc;
        try {
            dZzd = this.zzb.zzd();
        } catch (RemoteException e11) {
            H6.l.d("", e11);
            dZzd = 1.0d;
        }
        this.zze = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zzb.zze();
        } catch (RemoteException e12) {
            H6.l.d("", e12);
            iZze = -1;
        }
        this.zzf = iZze;
        try {
            iZzf = this.zzb.zzf();
        } catch (RemoteException e13) {
            H6.l.d("", e13);
        }
        this.zzg = iZzf;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeX)).booleanValue()) {
            try {
                mapZzg = this.zzb.zzg();
            } catch (RemoteException unused) {
            }
        }
        this.zza = mapZzg;
    }

    @Override // com.google.android.gms.ads.nativead.c
    public final Drawable getDrawable() {
        return this.zzc;
    }

    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.c
    public final Uri getUri() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }
}
