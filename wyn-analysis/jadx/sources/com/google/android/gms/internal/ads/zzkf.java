package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzkf implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaer, zzrx, zzzr, zzwl, zzby, zzex {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzlj zza;

    public /* synthetic */ zzkf(zzlj zzljVar, byte[] bArr) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) {
        zzlj zzljVar = this.zza;
        zzljVar.zzQ(surfaceTexture);
        zzljVar.zzS(i5, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzlj zzljVar = this.zza;
        zzljVar.zzR(null);
        zzljVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i10) {
        this.zza.zzS(i5, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        this.zza.zzS(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zza(zzfe zzfeVar) {
        this.zza.zzP(zzjm.zzc(zzfeVar, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzb(zzjd zzjdVar) {
        this.zza.zzV().zzN(zzjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzc(String str, long j8, long j10) {
        this.zza.zzV().zzO(str, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzd(zzv zzvVar, zzje zzjeVar) {
        this.zza.zzV().zzP(zzvVar, zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zze(int i5, long j8) {
        this.zza.zzV().zzQ(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzf(final zzbv zzbvVar) {
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzeg zzegVarZzU = this.zza.zzU();
        zzegVarZzU.zze(25, zzebVar);
        zzegVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzg(Object obj, long j8) {
        zzlj zzljVar = this.zza;
        zzljVar.zzV().zzT(obj, j8);
        if (zzljVar.zzab() == obj) {
            zzeg zzegVarZzU = zzljVar.zzU();
            zzegVarZzU.zze(26, zzke.zza);
            zzegVarZzU.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzh(String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzi(zzjd zzjdVar) {
        this.zza.zzV().zzS(zzjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzj(long j8, int i5) {
        this.zza.zzV().zzU(j8, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzk(Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzl(zzjd zzjdVar) {
        this.zza.zzV().zzC(zzjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzm(String str, long j8, long j10) {
        this.zza.zzV().zzD(str, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzn(zzv zzvVar, zzje zzjeVar) {
        this.zza.zzV().zzE(zzvVar, zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzo(long j8) {
        this.zza.zzV().zzF(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzp(int i5, long j8, long j10) {
        this.zza.zzV().zzG(i5, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzq(String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzr(zzjd zzjdVar) {
        this.zza.zzV().zzI(zzjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzs(final boolean z2) {
        zzlj zzljVar = this.zza;
        if (zzljVar.zzac() == z2) {
            return;
        }
        zzljVar.zzad(z2);
        zzeg zzegVarZzU = zzljVar.zzU();
        zzegVarZzU.zze(23, new zzeb() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzs(z2);
            }
        });
        zzegVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzt(Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzu(Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzv(zzsa zzsaVar) {
        this.zza.zzV().zzL(zzsaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzw(zzsa zzsaVar) {
        this.zza.zzV().zzM(zzsaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzx(final int i5) {
        this.zza.zzY().zzb(new zzgti() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i5);
            }
        }, new zzgti() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i5);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzy(zzjb zzjbVar) {
        this.zza.zzZ().zza(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzz(zzjb zzjbVar) {
        this.zza.zzaa().zza(zzjbVar);
    }
}
