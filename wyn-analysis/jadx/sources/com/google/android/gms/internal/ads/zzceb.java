package com.google.android.gms.internal.ads;

import android.content.Context;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
final class zzceb {
    private Context zza;
    private InterfaceC3596a zzb;
    private G6.N zzc;
    private zzceg zzd;

    private zzceb() {
        throw null;
    }

    public final zzceb zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzceb zzb(InterfaceC3596a interfaceC3596a) {
        interfaceC3596a.getClass();
        this.zzb = interfaceC3596a;
        return this;
    }

    public final zzceb zzc(G6.N n10) {
        this.zzc = n10;
        return this;
    }

    public final zzceb zzd(zzceg zzcegVar) {
        this.zzd = zzcegVar;
        return this;
    }

    public final zzceh zze() {
        zzinh.zzc(this.zza, Context.class);
        zzinh.zzc(this.zzb, InterfaceC3596a.class);
        zzinh.zzc(this.zzc, G6.N.class);
        zzinh.zzc(this.zzd, zzceg.class);
        return new zzcec(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzceb(byte[] bArr) {
    }
}
