package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class zzcv implements zzcp {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;
    private zzcu zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public zzcv() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcp.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zza(long j8) {
        if (this.zzn < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j8 / this.zzc);
        }
        long j10 = this.zzm;
        this.zzj.getClass();
        long jZza = j10 - r2.zza();
        int i5 = this.zzh.zzb;
        int i10 = this.zzg.zzb;
        return i5 == i10 ? zzfm.zzw(j8, this.zzn, jZza, RoundingMode.DOWN) : zzfm.zzw(j8, this.zzn * i10, jZza * i5, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzb(zzcl zzclVar) throws zzco {
        int i5 = zzclVar.zzd;
        if (i5 != 2 && i5 != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i10 = this.zzb;
        if (i10 == -1) {
            i10 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i10, zzclVar.zzc, i5);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcu zzcuVar = this.zzj;
            zzcuVar.getClass();
            this.zzm += byteBuffer.remaining();
            zzcuVar.zzb(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null) {
            zzcuVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int iZzf;
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null && (iZzf = zzcuVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                this.zzk = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzcuVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += iZzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zzcp.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        zzcu zzcuVar = this.zzj;
        return zzcuVar == null || zzcuVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final /* synthetic */ void zzh() {
        AbstractC1750n.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzi(zzcn zzcnVar) {
        if (zzc()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                this.zzj = new zzcu(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, zzclVar2.zzb, zzclVar.zzd == 4);
            } else {
                zzcu zzcuVar = this.zzj;
                if (zzcuVar != null) {
                    zzcuVar.zze();
                }
            }
        }
        this.zzl = zzcp.zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcp.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final void zzk(float f10) {
        zzgtr.zza(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }

    public final void zzl(float f10) {
        zzgtr.zza(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final long zzm(long j8) {
        if (this.zzn < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.zzc * j8);
        }
        long j10 = this.zzm;
        this.zzj.getClass();
        long jZza = j10 - r2.zza();
        int i5 = this.zzh.zzb;
        int i10 = this.zzg.zzb;
        return i5 == i10 ? zzfm.zzw(j8, jZza, this.zzn, RoundingMode.DOWN) : zzfm.zzw(j8, jZza * i5, this.zzn * i10, RoundingMode.DOWN);
    }
}
