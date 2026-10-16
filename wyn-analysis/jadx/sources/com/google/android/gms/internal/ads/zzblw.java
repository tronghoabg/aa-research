package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzblw extends zzbmk {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzblw(Drawable drawable, Uri uri, double d3, int i5, int i10, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d3;
        this.zzd = i5;
        this.zze = i10;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final InterfaceC3876a zzb() throws RemoteException {
        return new BinderC3877b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Uri zzc() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Map zzg() {
        return this.zzf;
    }
}
