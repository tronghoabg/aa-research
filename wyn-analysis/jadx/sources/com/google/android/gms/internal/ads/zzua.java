package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzua extends zzvw implements zzmd {
    private final Context zzb;
    private final zzrw zzc;
    private final zzsg zzd;
    private final zzvi zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzv zzi;
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzua(Context context, zzvk zzvkVar, zzvy zzvyVar, boolean z2, Handler handler, zzrx zzrxVar, zzsg zzsgVar) {
        super(context.getApplicationContext(), 1, zzvkVar, zzvyVar, false, 44100.0f);
        zzvi zzviVar = Build.VERSION.SDK_INT >= 35 ? new zzvi(zzvh.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzsgVar;
        this.zze = zzviVar;
        this.zzp = -1000;
        this.zzc = new zzrw(handler, zzrxVar);
        this.zzr = -9223372036854775807L;
        zzsgVar.zza(new zztz(this, null));
    }

    private static List zzbo(zzvy zzvyVar, zzv zzvVar, boolean z2, zzsg zzsgVar) throws zzwa {
        zzvp zzvpVarZza;
        return zzvVar.zzp == null ? zzgwt.zzi() : (!zzsgVar.zzd(zzvVar) || (zzvpVarZza = zzwi.zza()) == null) ? zzwi.zzc(zzvyVar, zzvVar, false, false) : zzgwt.zzj(zzvpVarZza);
    }

    private final int zzbp(zzvp zzvpVar, zzv zzvVar) {
        if ("OMX.google.raw.decoder".equals(zzvpVar.zza) && Build.VERSION.SDK_INT == 23 && !zzfm.zzR(this.zzb)) {
            return -1;
        }
        return zzvVar.zzq;
    }

    private final void zzbq() {
        long jZzg = this.zzd.zzg(zzac());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzA(long j8, boolean z2, boolean z10) throws zzvs, zzjm {
        super.zzA(j8, z2, z10);
        this.zzd.zzC();
        this.zzk = j8;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzC() {
        zzbq();
        this.zzq = false;
        this.zzd.zzB();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzC();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzvw) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzD();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzD();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzF() {
        zzvi zzviVar;
        this.zzd.zzE();
        if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.zze) == null) {
            return;
        }
        zzviVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final String zzV() {
        return "MediaCodecAudioRenderer";
    }

    public final /* synthetic */ zzrw zzaB() {
        return this.zzc;
    }

    public final /* synthetic */ zzvi zzaC() {
        return this.zze;
    }

    public final /* synthetic */ void zzaD(boolean z2) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzaE(boolean z2) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzab() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzac() {
        return super.zzac() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa {
        int i5;
        boolean z2;
        String str = zzvVar.zzp;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i10 = zzvVar.zzP;
        boolean zZzbl = zzvw.zzbl(zzvVar);
        int i11 = 1;
        if (!zZzbl || (i10 != 0 && zzwi.zza() == null)) {
            i5 = 0;
        } else {
            zzsg zzsgVar = this.zzd;
            zzqu zzquVarZzf = zzsgVar.zzf(zzvVar);
            if (zzquVarZzf.zzb) {
                i5 = true != zzquVarZzf.zzc ? 512 : 1536;
                if (zzquVarZzf.zzd) {
                    i5 |= 2048;
                }
            } else {
                i5 = 0;
            }
            if (zzsgVar.zzd(zzvVar)) {
                return i5 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzsg zzsgVar2 = this.zzd;
            if (zzsgVar2.zzd(zzfm.zzB(2, zzvVar.zzH, zzvVar.zzJ))) {
                List listZzbo = zzbo(zzvyVar, zzvVar, false, zzsgVar2);
                if (!listZzbo.isEmpty()) {
                    if (zZzbl) {
                        zzvp zzvpVar = (zzvp) listZzbo.get(0);
                        Context context = this.zzb;
                        boolean zZzc = zzvpVar.zzc(context, zzvVar);
                        if (zZzc) {
                            z2 = true;
                        } else {
                            for (int i12 = 1; i12 < listZzbo.size(); i12++) {
                                zzvp zzvpVar2 = (zzvp) listZzbo.get(i12);
                                if (zzvpVar2.zzc(context, zzvVar)) {
                                    z2 = false;
                                    zZzc = true;
                                    zzvpVar = zzvpVar2;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        int i13 = true != zZzc ? 3 : 4;
                        int i14 = 8;
                        if (zZzc && zzvpVar.zze(zzvVar)) {
                            i14 = 16;
                        }
                        return i13 | i14 | 32 | (true != zzvpVar.zzg ? 0 : 64) | (true != z2 ? 0 : 128) | i5;
                    }
                    i11 = 2;
                }
            }
        }
        return i11 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final List zzag(zzvy zzvyVar, zzv zzvVar, boolean z2) throws zzwa {
        return zzwi.zze(this.zzb, zzbo(zzvyVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzah(zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzvj zzai(com.google.android.gms.internal.ads.zzvp r10, com.google.android.gms.internal.ads.zzv r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzua.zzai(com.google.android.gms.internal.ads.zzvp, com.google.android.gms.internal.ads.zzv, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzvj");
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z2) {
        int i5;
        int i10;
        zzje zzjeVarZzf = zzvpVar.zzf(zzvVar, zzvVar2);
        int i11 = zzjeVarZzf.zze;
        if (zzaH(zzvVar2)) {
            i11 |= 32768;
        }
        if (zzbp(zzvpVar, zzvVar2) > this.zzf) {
            i11 |= 64;
        }
        String str = zzvpVar.zza;
        if (i11 != 0) {
            i10 = 0;
            i5 = i11;
        } else {
            i5 = 0;
            i10 = zzjeVarZzf.zzd;
        }
        return new zzje(str, zzvVar, zzvVar2, i10, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final long zzak(long j8, long j10, boolean z2) {
        zzsg zzsgVar = this.zzd;
        boolean z10 = false;
        if (zzsgVar.zzn() && this.zzr != -9223372036854775807L) {
            z10 = true;
        }
        if (!this.zzq) {
            return (z10 || super.zzac()) ? 1000000L : 10000L;
        }
        long jZzy = zzsgVar.zzy();
        if (this.zzo && z10 && jZzy != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jZzy, this.zzr - j8) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final float zzal(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i5 = zzvVar2.zzJ;
            if (i5 != -1) {
                iMax = Math.max(iMax, i5);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzam(String str, zzvj zzvjVar, long j8, long j10) {
        this.zzc.zzb(str, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzan(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzje zzap(zzly zzlyVar) throws zzvs, zzjm {
        zzv zzvVar = zzlyVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zzje zzjeVarZzap = super.zzap(zzlyVar);
        this.zzc.zzc(zzvVar, zzjeVarZzap);
        return zzjeVarZzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzaq(zzv zzvVar, MediaFormat mediaFormat) throws zzjm {
        int i5;
        int integer;
        zzv zzvVar2 = this.zzj;
        zzham zzhamVarZza = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaK() != null) {
            mediaFormat.getClass();
            int iZzC = "audio/raw".equals(zzvVar.zzp) ? zzvVar.zzK : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzfm.zzC(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            int integer2 = mediaFormat.getInteger("channel-count");
            int i10 = zzvVar.zzI;
            if (i10 == -1 || zzvVar.zzH != integer2) {
                i10 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i10 = integer;
            }
            zzt zztVar = new zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzJ(iZzC);
            zztVar.zzK(zzvVar.zzL);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzl(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzG(integer2);
            zztVar.zzH(i10);
            zztVar.zzI(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzP = zztVar.zzP();
            if (this.zzg && zzvVarZzP.zzH == 6 && (i5 = zzvVar.zzH) < 6) {
                zzhal zzhalVarZzg = zzham.zzg(i5);
                for (int i11 = 0; i11 < i5; i11++) {
                    zzhalVarZzg.zza(i11);
                }
                zzhamVarZza = zzhalVarZzg.zzb();
            } else if (this.zzh) {
                zzhamVarZza = zzaho.zza(zzvVarZzP.zzH);
            }
            zzvVar = zzvVarZzP;
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                if (zzaJ()) {
                    zzK();
                }
                zzgtr.zzi(i12 >= 29);
            }
            zzsg zzsgVar = this.zzd;
            zzry zzryVar = new zzry(zzvVar);
            zzryVar.zza(zzhamVarZza);
            zzryVar.zzb(zzN());
            zzryVar.zzc(zzO());
            zzsgVar.zzh(zzryVar.zzd());
        } catch (zzsb e7) {
            throw zzQ(e7, e7.zza, false, 5001);
        }
    }

    public final void zzar() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzas() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzat(long j8, long j10, zzvm zzvmVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, zzv zzvVar) throws zzjm {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i10 & 2) != 0) {
            zzvmVar.getClass();
            zzvmVar.zzc(i5, false);
            return true;
        }
        if (z2) {
            if (zzvmVar != null) {
                zzvmVar.zzc(i5, false);
            }
            ((zzvw) this).zza.zzf += i11;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j11, i11)) {
                this.zzr = j11;
                return false;
            }
            if (zzvmVar != null) {
                zzvmVar.zzc(i5, false);
            }
            ((zzvw) this).zza.zze += i11;
            return true;
        } catch (zzsc e7) {
            zzv zzvVar2 = this.zzi;
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e7, zzvVar2, false, 5001);
        } catch (zzsf e10) {
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e10, zzvVar, e10.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzau(zzjb zzjbVar) {
        this.zzc.zzn(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzav() throws zzjm {
        try {
            this.zzd.zzl();
            if (zzbg() != -9223372036854775807L) {
                this.zzr = zzbg();
            }
        } catch (zzsf e7) {
            throw zzQ(e7, e7.zzc, e7.zzb, true != zzaJ() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzaw(long j8) {
        this.zzd.zzx(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzax(zzix zzixVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzixVar.zza) == null || !Objects.equals(zzvVar.zzp, "audio/opus") || !zzaJ()) {
            return;
        }
        ByteBuffer byteBuffer = zzixVar.zze;
        byteBuffer.getClass();
        zzv zzvVar2 = zzixVar.zza;
        zzvVar2.getClass();
        int i5 = zzvVar2.zzL;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzz(i5, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final zzmd zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final long zzg() {
        if (zze() == 2) {
            zzbq();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        boolean z2 = this.zzn;
        this.zzn = false;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public final void zzx(int i5, Object obj) throws zzjm {
        zzvi zzviVar;
        if (i5 == 2) {
            zzsg zzsgVar = this.zzd;
            obj.getClass();
            zzsgVar.zzA(((Float) obj).floatValue());
            return;
        }
        if (i5 == 3) {
            zzd zzdVar = (zzd) obj;
            zzsg zzsgVar2 = this.zzd;
            zzdVar.getClass();
            zzsgVar2.zzr(zzdVar);
            return;
        }
        if (i5 == 6) {
            zze zzeVar = (zze) obj;
            zzsg zzsgVar3 = this.zzd;
            zzeVar.getClass();
            zzsgVar3.zzu(zzeVar);
            return;
        }
        if (i5 == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
            return;
        }
        if (i5 == 16) {
            obj.getClass();
            this.zzp = ((Integer) obj).intValue();
            zzvm zzvmVarZzaK = zzaK();
            if (zzvmVarZzaK == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzp));
            zzvmVarZzaK.zzp(bundle);
            return;
        }
        if (i5 == 19) {
            zzsg zzsgVar4 = this.zzd;
            obj.getClass();
            zzsgVar4.zzw(((Integer) obj).intValue());
            return;
        }
        if (i5 == 9) {
            zzsg zzsgVar5 = this.zzd;
            obj.getClass();
            zzsgVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i5 != 10) {
                super.zzx(i5, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzt(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.zze) == null) {
                return;
            }
            zzviVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzy(boolean z2, boolean z10) throws zzjm {
        super.zzy(z2, z10);
        this.zzc.zza(((zzvw) this).zza);
        zzK();
        zzsg zzsgVar = this.zzd;
        zzsgVar.zzb(zzL());
        zzsgVar.zzc(zzM());
    }
}
