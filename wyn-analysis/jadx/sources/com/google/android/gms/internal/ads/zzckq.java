package com.google.android.gms.internal.ads;

import G6.U;
import Va.M6;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzckq extends zzcha {
    private final zzchv zzc;
    private zzckr zzd;
    private Uri zze;
    private zzcgz zzf;
    private boolean zzg;
    private int zzh;

    public zzckq(Context context, zzchv zzchvVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzchvVar;
        zzchvVar.zza(this);
    }

    private final boolean zzu() {
        int i5 = this.zzh;
        return (i5 == 1 || i5 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i5) {
        if (i5 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i5;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzckq.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return M6.t(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzb(zzcgz zzcgzVar) {
        this.zzf = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzc(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzckr(uri.toString());
            zzv(3);
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzd() {
        G6.L.k("AdImmersivePlayerView stop");
        zzckr zzckrVar = this.zzd;
        if (zzckrVar != null) {
            zzckrVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zze() {
        G6.L.k("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzf() {
        G6.L.k("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzi(int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i5);
        G6.L.k(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzj(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha, com.google.android.gms.internal.ads.zzchx
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    public final /* synthetic */ void zzr() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            zzcgzVar.zzb();
        }
    }

    public final /* synthetic */ void zzs() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            if (!this.zzg) {
                zzcgzVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    public final /* synthetic */ void zzt() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
        }
    }
}
