package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes3.dex */
public abstract class zzcha extends TextureView implements zzchx {
    protected final zzcho zza;
    protected final zzchy zzb;

    public zzcha(Context context) {
        super(context);
        this.zza = new zzcho();
        this.zzb = new zzchy(context, this);
    }

    public void zzA(int i5) {
    }

    public void zzB(int i5) {
    }

    public void zzC(int i5) {
    }

    public abstract String zza();

    public abstract void zzb(zzcgz zzcgzVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i5);

    public abstract void zzj(float f10, float f11);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public Integer zzw() {
        return null;
    }

    public void zzx(String str, String[] strArr, Integer num) {
        zzc(str);
    }

    public void zzy(int i5) {
    }

    public void zzz(int i5) {
    }
}
