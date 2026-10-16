package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.unity3d.services.core.device.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public final class zzadg extends zzvw implements zzadv {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznj zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadt zzP;
    private long zzQ;
    private boolean zzR;
    private int zzS;
    private final Context zze;
    private final boolean zzf;
    private final zzaeq zzg;
    private final boolean zzh;
    private final zzadw zzi;
    private final zzadu zzj;
    private final zzacp zzk;
    private final long zzl;
    private final zzadx zzm;
    private final PriorityQueue zzn;
    private zzadf zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaew zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzadi zzw;
    private zzev zzx;
    private boolean zzy;
    private int zzz;

    public zzadg(zzade zzadeVar) {
        super(zzadeVar.zze().getApplicationContext(), 2, zzadeVar.zzg(), zzadeVar.zzf(), false, 30.0f);
        Context applicationContext = zzadeVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeq(zzadeVar.zzh(), zzadeVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadw(applicationContext, this, 0L);
        this.zzj = new zzadu();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzev.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = -9223372036854775807L;
        this.zzk = new zzacp();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadx(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzay(com.google.android.gms.internal.ads.zzvp r11, com.google.android.gms.internal.ads.zzv r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzay(com.google.android.gms.internal.ads.zzvp, com.google.android.gms.internal.ads.zzv):int");
    }

    private final Surface zzbA(zzvp zzvpVar) {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            return zzaewVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbt(zzvpVar)) {
            return null;
        }
        zzgtr.zzi(zzaE(zzvpVar));
        zzadi zzadiVar = this.zzw;
        if (zzadiVar != null) {
            if (zzadiVar.zza != zzvpVar.zzf) {
                zzbB();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzadi.zzb(this.zze, zzvpVar.zzf);
        }
        return this.zzw;
    }

    private final void zzbB() {
        zzadi zzadiVar = this.zzw;
        if (zzadiVar != null) {
            zzadiVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzbC, reason: merged with bridge method [inline-methods] */
    public final void zzbq() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbD() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    public static int zzbo(zzvp zzvpVar, zzv zzvVar) {
        int i5 = zzvVar.zzq;
        if (i5 == -1) {
            return zzay(zzvpVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return i5 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzbs(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzbs(java.lang.String):boolean");
    }

    public static final boolean zzbt(zzvp zzvpVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvpVar.zzh;
    }

    private static List zzbu(Context context, zzvy zzvyVar, zzv zzvVar, boolean z2, boolean z10) throws zzwa {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgwt.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.zza(context)) {
            List listZzd = zzwi.zzd(zzvyVar, zzvVar, z2, z10);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzwi.zzc(zzvyVar, zzvVar, z2, z10);
    }

    private final void zzbv(Object obj) throws zzvs, zzjm {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbD();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int iZze = zze();
        zzvm zzvmVarZzaK = zzaK();
        if (zzvmVarZzaK != null && this.zzr == null) {
            zzvp zzvpVarZzaN = zzaN();
            zzvpVarZzaN.getClass();
            if (!zzbz(zzvpVarZzaN) || this.zzp) {
                zzaO();
                zzaG();
            } else {
                Surface surfaceZzbA = zzbA(zzvpVarZzaN);
                if (surfaceZzbA != null) {
                    zzvmVarZzaK.zzn(surfaceZzbA);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvmVarZzaK.zzo();
                }
            }
        }
        if (surface != null) {
            zzbD();
        } else {
            this.zzM = null;
            zzaew zzaewVar = this.zzr;
            if (zzaewVar != null) {
                zzaewVar.zzq();
            }
        }
        if (iZze == 2) {
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbw(zzix zzixVar) {
        if (zzcW() || zzixVar.zzd() || zzP() == -9223372036854775807L) {
            return true;
        }
        return zzP() - (zzixVar.zzd - zzbi()) <= PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    private final boolean zzbx(zzix zzixVar) {
        return zzixVar.zzd < zzH();
    }

    private final void zzby(long j8, long j10, zzv zzvVar) {
        zzadt zzadtVar = this.zzP;
        if (zzadtVar != null) {
            zzadtVar.zzcS(j8, j10, zzvVar, zzaM());
        }
    }

    private final boolean zzbz(zzvp zzvpVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbt(zzvpVar) || zzaE(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzA(long j8, boolean z2, boolean z10) throws zzvs, zzjm {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null && !z2) {
            zzaewVar.zzg(true);
        }
        if (z10) {
            this.zzG = j8;
        }
        super.zzA(j8, z2, z10);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
        if (z2) {
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzC() {
        if (this.zzC > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzC, jZzb - this.zzB);
            this.zzC = 0;
            this.zzB = jZzb;
        }
        int i5 = this.zzJ;
        if (i5 != 0) {
            this.zzg.zze(this.zzI, i5);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzD() {
        this.zzM = null;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeq zzaeqVar = this.zzg;
            zzaeqVar.zzi(((zzvw) this).zza);
            zzaeqVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = -9223372036854775807L;
            zzbB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzF() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || !this.zzf) {
            return;
        }
        zzaewVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final boolean zzX(long j8) {
        if (zzbh() == -9223372036854775807L || j8 < this.zzG) {
            return false;
        }
        long jZzba = zzba();
        return jZzba == -9223372036854775807L || j8 > jZzba;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final void zzY(float f10, float f11) throws zzvs, zzjm {
        super.zzY(f10, f11);
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzm(f10);
        } else {
            this.zzi.zzn(f10);
        }
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzc(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final void zzZ() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null) {
            this.zzi.zzh();
            return;
        }
        int i5 = this.zzt;
        if (i5 == 0 || i5 == 1) {
            this.zzt = 0;
        } else {
            zzaewVar.zzt();
        }
    }

    public final void zzaA(zzvm zzvmVar, int i5, long j8) {
        Trace.beginSection("dropVideoBuffer");
        zzvmVar.zzc(i5, false);
        Trace.endSection();
        zzaB(0, 1);
    }

    public final void zzaB(int i5, int i10) {
        zzjd zzjdVar = ((zzvw) this).zza;
        zzjdVar.zzh += i5;
        int i11 = i5 + i10;
        zzjdVar.zzg += i11;
        this.zzC += i11;
        int i12 = this.zzD + i11;
        this.zzD = i12;
        zzjdVar.zzi = Math.max(i12, zzjdVar.zzi);
    }

    public final void zzaC(long j8) {
        zzjd zzjdVar = ((zzvw) this).zza;
        zzjdVar.zzk += j8;
        zzjdVar.zzl++;
        this.zzI += j8;
        this.zzJ++;
    }

    public final void zzaD(zzvm zzvmVar, int i5, long j8, long j10) {
        Trace.beginSection("releaseOutputBuffer");
        zzvmVar.zzd(i5, j10);
        Trace.endSection();
        ((zzvw) this).zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbq();
        }
    }

    public final boolean zzaE(zzvp zzvpVar) {
        if (zzbs(zzvpVar.zza)) {
            return false;
        }
        return !zzvpVar.zzf || zzadi.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzaI(zzvp zzvpVar) {
        return zzbz(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzaQ() {
        zzvp zzvpVarZzaN = zzaN();
        if (this.zzr != null && zzvpVarZzaN != null) {
            String str = zzvpVarZzaN.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaR() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzv r0 = r12.zzaL()
            long r1 = r12.zzP()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r8 = r8 + r1
            long r10 = r12.zzbi()
            long r10 = r10 + r1
            long r1 = r12.zzaS()
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zznj r2 = r12.zzF
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzH
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzr
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzbg()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzaR():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzaT() {
        super.zzaT();
        this.zzn.clear();
        this.zzE = 0;
        this.zzS = 0;
        this.zzH = false;
        zzacp zzacpVar = this.zzk;
        if (zzacpVar != null) {
            zzacpVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzvo zzaV(Throwable th, zzvp zzvpVar) {
        return new zzada(th, zzvpVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final boolean zzaW(zzv zzvVar) throws zzjm {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || zzaewVar.zze()) {
            return true;
        }
        try {
            zzaewVar.zzd(zzvVar);
            return true;
        } catch (zzaev e7) {
            throw zzQ(e7, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzaX(zzix zzixVar) throws zzjm {
        ByteBuffer byteBuffer;
        zzacp zzacpVar = this.zzk;
        if (zzacpVar != null) {
            zzvp zzvpVarZzaN = zzaN();
            zzvpVarZzaN.getClass();
            if (zzvpVarZzaN.zzb.equals(MimeTypes.VIDEO_AV1) && zzixVar.zzc() && (byteBuffer = zzixVar.zzc) != null) {
                zzacpVar.zzb(byteBuffer);
            }
        }
        this.zzS = 0;
        int iZzaY = zzaY(zzixVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaY & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final int zzaY(zzix zzixVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbx(zzixVar) || zzbw(zzixVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaZ(com.google.android.gms.internal.ads.zzix r9) {
        /*
            r8 = this;
            boolean r0 = r8.zzbw(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.zzbx(r9)
            com.google.android.gms.internal.ads.zzadx r2 = r8.zzm
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.zzd
            long r4 = r2.zzb(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.zzl
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.zze()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.zzf()
            if (r2 == 0) goto L40
            r9.zza()
        L3e:
            r1 = r3
            goto L96
        L40:
            com.google.android.gms.internal.ads.zzacp r2 = r8.zzk
            if (r2 == 0) goto L96
            com.google.android.gms.internal.ads.zzvp r4 = r8.zzaN()
            r4.getClass()
            java.lang.String r4 = r4.zzb
            java.lang.String r5 = "video/av01"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L96
            java.nio.ByteBuffer r4 = r9.zzc
            if (r4 == 0) goto L96
            if (r0 != 0) goto L5f
            int r5 = r8.zzS
            if (r5 > 0) goto L61
        L5f:
            r5 = r3
            goto L62
        L61:
            r5 = r1
        L62:
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()
            r4.flip()
            int r2 = r2.zza(r4, r5)
            if (r2 != 0) goto L73
            r9.zza()
            goto L3e
        L73:
            int r5 = r4.limit()
            if (r2 == r5) goto L96
            com.google.android.gms.internal.ads.zzadf r5 = r8.zzo
            r5.getClass()
            int r5 = r5.zzc
            int r5 = r5 + r2
            int r4 = r4.capacity()
            if (r5 >= r4) goto L96
            boolean r4 = r9.zzk()
            if (r4 != 0) goto L96
            java.nio.ByteBuffer r1 = r9.zzc
            r1.getClass()
            r1.position(r2)
            goto L3e
        L96:
            if (r1 == 0) goto Lb2
            if (r0 == 0) goto La2
            com.google.android.gms.internal.ads.zzjd r9 = r8.zza
            int r0 = r9.zzd
            int r0 = r0 + r3
            r9.zzd = r0
            return r1
        La2:
            java.util.PriorityQueue r0 = r8.zzn
            long r4 = r9.zzd
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r0.add(r9)
            int r9 = r8.zzS
            int r9 = r9 + r3
            r8.zzS = r9
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzaZ(com.google.android.gms.internal.ads.zzix):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final void zzaa(long j8, long j10) throws Throwable {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            try {
                zzaewVar.zzv(j8, j10);
            } catch (zzaev e7) {
                throw zzQ(e7, e7.zza, false, 7001);
            }
        }
        super.zzaa(j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzab() {
        boolean zZzbc = zzbc();
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            return zzaewVar.zzh(zZzbc);
        }
        if (zZzbc && zzaK() == null) {
            return true;
        }
        return this.zzi.zzi(zZzbc);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    public final boolean zzac() {
        if (!super.zzac()) {
            return false;
        }
        zzaew zzaewVar = this.zzr;
        return zzaewVar == null || zzaewVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa {
        boolean z2;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i5 = 0;
        boolean z10 = zzvVar.zzt != null;
        List listZzbu = zzbu(context, zzvyVar, zzvVar, z10, false);
        if (z10 && listZzbu.isEmpty()) {
            listZzbu = zzbu(context, zzvyVar, zzvVar, false, false);
        }
        if (listZzbu.isEmpty()) {
            return Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE;
        }
        if (!zzvw.zzbl(zzvVar)) {
            return Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE;
        }
        zzvp zzvpVar = (zzvp) listZzbu.get(0);
        boolean zZzc = zzvpVar.zzc(context, zzvVar);
        if (zZzc) {
            z2 = true;
        } else {
            for (int i10 = 1; i10 < listZzbu.size(); i10++) {
                zzvp zzvpVar2 = (zzvp) listZzbu.get(i10);
                if (zzvpVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z2 = false;
                    zzvpVar = zzvpVar2;
                    break;
                }
            }
            z2 = true;
        }
        int i11 = true != zZzc ? 3 : 4;
        int i12 = true != zzvpVar.zze(zzvVar) ? 8 : 16;
        int i13 = true != zzvpVar.zzg ? 0 : 64;
        int i14 = true != z2 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadd.zza(context)) {
            i14 = 256;
        }
        if (zZzc) {
            List listZzbu2 = zzbu(context, zzvyVar, zzvVar, z10, true);
            if (!listZzbu2.isEmpty()) {
                zzvp zzvpVar3 = (zzvp) zzwi.zze(context, listZzbu2, zzvVar).get(0);
                if (zzvpVar3.zzc(context, zzvVar) && zzvpVar3.zze(zzvVar)) {
                    i5 = 32;
                }
            }
        }
        return i11 | i12 | i5 | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final List zzag(zzvy zzvyVar, zzv zzvVar, boolean z2) throws zzwa {
        Context context = this.zze;
        return zzwi.zze(context, zzbu(context, zzvyVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzvj zzai(zzvp zzvpVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10) {
        zzadf zzadfVar;
        Point pointZzi;
        int i5;
        int i10;
        int i11;
        boolean z2;
        zzv[] zzvVarArr;
        char c10;
        boolean z10;
        Pair pairZze;
        int iZzay;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbo = zzbo(zzvpVar, zzvVar);
        int i12 = zzvVar.zzx;
        int i13 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbo != -1 && (iZzay = zzay(zzvpVar, zzvVar)) != -1) {
                iZzbo = Math.min((int) (iZzbo * 1.5f), iZzay);
            }
            zzadfVar = new zzadf(i13, i12, iZzbo);
        } else {
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z11 = false;
            while (i14 < length) {
                zzv zzvVarZzP = zzvVarArrZzJ[i14];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVarZzP.zzF == null) {
                    zzt zztVarZza = zzvVarZzP.zza();
                    zztVarZza.zzE(zziVar);
                    zzvVarZzP = zztVarZza.zzP();
                }
                if (zzvpVar.zzf(zzvVar, zzvVarZzP).zzd != 0) {
                    int i15 = zzvVarZzP.zzw;
                    c10 = 65535;
                    if (i15 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzP.zzx != -1) {
                            z10 = false;
                        }
                        z11 |= z10;
                        iMax2 = Math.max(iMax2, i15);
                        iMax = Math.max(iMax, zzvVarZzP.zzx);
                        iZzbo = Math.max(iZzbo, zzbo(zzvpVar, zzvVarZzP));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z10 = true;
                    z11 |= z10;
                    iMax2 = Math.max(iMax2, i15);
                    iMax = Math.max(iMax, zzvVarZzP.zzx);
                    iZzbo = Math.max(iZzbo, zzbo(zzvpVar, zzvVarZzP));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    c10 = 65535;
                }
                i14++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z11) {
                zzeh.zzc("MediaCodecVideoRenderer", com.google.android.gms.internal.consent_sdk.a.u(iMax2, iMax, "Resolutions unknown. Codec max resolution: ", "x", new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length())));
                boolean z12 = i12 > i13;
                int i16 = z12 ? i12 : i13;
                int i17 = true != z12 ? i12 : i13;
                int[] iArr = zzb;
                int i18 = 0;
                while (i18 < 9) {
                    float f11 = i17;
                    float f12 = i16;
                    int i19 = iArr[i18];
                    int i20 = i18;
                    float f13 = i19;
                    if (i19 <= i16 || (i5 = (int) (f13 * (f11 / f12))) <= i17) {
                        break;
                    }
                    int i21 = i17;
                    if (true != z12) {
                        i10 = i16;
                        i11 = i19;
                    } else {
                        i10 = i16;
                        i11 = i5;
                    }
                    if (true != z12) {
                        i19 = i5;
                    }
                    pointZzi = zzvpVar.zzi(i11, i19);
                    float f14 = zzvVar.zzA;
                    if (pointZzi != null) {
                        z2 = z12;
                        if (zzvpVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                            break;
                        }
                    } else {
                        z2 = z12;
                    }
                    i18 = i20 + 1;
                    i17 = i21;
                    i16 = i10;
                    z12 = z2;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbo = Math.max(iZzbo, zzay(zzvpVar, zztVarZza2.zzP()));
                    zzeh.zzc("MediaCodecVideoRenderer", com.google.android.gms.internal.consent_sdk.a.u(iMax2, iMax, "Codec max resolution adjusted to: ", "x", new StringBuilder(AbstractC0279p0.f(iMax2, 35) + String.valueOf(iMax).length())));
                }
            }
            zzadfVar = new zzadf(iMax2, iMax, iZzbo);
        }
        String str = zzvpVar.zzc;
        this.zzo = zzadfVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i12);
        zzek.zza(mediaFormat, zzvVar.zzs);
        float f15 = zzvVar.zzA;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzek.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzek.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzek.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzek.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdr.zze(zzvVar)) != null) {
            zzek.zzb(mediaFormat, "profile", ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadfVar.zza);
        mediaFormat.setInteger("max-height", zzadfVar.zzb);
        zzek.zzb(mediaFormat, "max-input-size", zzadfVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbk(mediaFormat);
        Surface surfaceZzbA = zzbA(zzvpVar);
        if (this.zzr != null && !zzfm.zzW(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvj.zzb(zzvpVar, mediaFormat, zzvVar, surfaceZzbA, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z2) {
        int i5;
        int i10;
        int i11;
        zzje zzjeVarZzf = zzvpVar.zzf(zzvVar, zzvVar2);
        int i12 = zzjeVarZzf.zze;
        zzadf zzadfVar = this.zzo;
        zzadfVar.getClass();
        if (zzvVar2.zzw > zzadfVar.zza || zzvVar2.zzx > zzadfVar.zzb) {
            i12 |= 256;
        }
        if (zzbo(zzvpVar, zzvVar2) > zzadfVar.zzc) {
            i12 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE && (i11 = Build.VERSION.SDK_INT) < 31 && (i11 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f10 = zzvVar.zzA;
            if (f10 != -1.0f) {
                float f11 = zzvVar2.zzA;
                if (f11 != -1.0f && (!zzvpVar.zzf || !z2)) {
                    if (Math.abs((Math.max(f11, f10) / Math.min(f11, f10)) - Math.round(r12)) > 0.01f) {
                        i12 |= 65536;
                    }
                }
            }
        }
        String str = zzvpVar.zza;
        if (i12 != 0) {
            i10 = 0;
            i5 = i12;
        } else {
            i5 = 0;
            i10 = zzjeVarZzf.zzd;
        }
        return new zzje(str, zzvVar, zzvVar2, i10, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final float zzal(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzvp zzvpVarZzaN;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzA;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzF == null || (zzvpVarZzaN = zzaN()) == null) {
            return f12;
        }
        float fZzh = zzvpVarZzaN.zzh(zzvVar.zzw, zzvVar.zzx);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzam(String str, zzvj zzvjVar, long j8, long j10) {
        this.zzg.zzb(str, j8, j10);
        this.zzp = zzbs(str);
        zzvp zzvpVarZzaN = zzaN();
        zzvpVarZzaN.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzvpVarZzaN.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzvpVarZzaN.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i5].profile == 16384) {
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        this.zzq = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzan(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzje zzap(zzly zzlyVar) throws zzvs, zzjm {
        zzje zzjeVarZzap = super.zzap(zzlyVar);
        zzv zzvVar = zzlyVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzjeVarZzap);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
        return zzjeVarZzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzaq(zzv zzvVar, MediaFormat mediaFormat) {
        zzvm zzvmVarZzaK = zzaK();
        if (zzvmVarZzaK != null) {
            zzvmVarZzaK.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzvVar.zzC;
        int i5 = zzvVar.zzB;
        if (i5 == 90 || i5 == 270) {
            f10 = 1.0f / f10;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.zzL = new zzbv(integer, integer2, f10);
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null || !this.zzR) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzB(f10);
            zzv zzvVarZzP = zztVarZza.zzP();
            int i11 = this.zzt;
            List listZzi = this.zzu;
            if (listZzi == null) {
                listZzi = zzgwt.zzi();
            }
            zzaewVar.zzs(1, zzvVarZzP, zzbj(), i11, listZzi);
            this.zzt = 2;
        }
        this.zzR = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzar(long j8, long j10, long j11, boolean z2, boolean z10) throws zzvs, zzjm {
        int iZzS;
        if (this.zzr != null && this.zzf) {
            j10 -= -this.zzQ;
        }
        if (j8 >= -500000 || z2 || (iZzS = zzS(j10)) == 0) {
            return false;
        }
        this.zzG = j10;
        if (z10) {
            zzjd zzjdVar = ((zzvw) this).zza;
            int i5 = zzjdVar.zzd + iZzS;
            zzjdVar.zzd = i5;
            zzjdVar.zzf += this.zzE;
            zzjdVar.zzd = this.zzn.size() + i5;
        } else {
            ((zzvw) this).zza.zzj++;
            zzaB(this.zzn.size() + iZzS, this.zzE);
        }
        zzaP();
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzas() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzi();
            long jZzbj = this.zzQ;
            if (jZzbj == -9223372036854775807L) {
                jZzbj = zzbj();
                this.zzQ = jZzbj;
            }
            this.zzr.zzo(-jZzbj);
        } else {
            this.zzi.zza(2);
        }
        this.zzR = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzat(long r19, long r21, com.google.android.gms.internal.ads.zzvm r23, java.nio.ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.zzv r32) throws com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzat(long, long, com.google.android.gms.internal.ads.zzvm, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzau(zzjb zzjbVar) {
        this.zzg.zzk(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzav() {
        zzaew zzaewVar = this.zzr;
        if (zzaewVar != null) {
            zzaewVar.zzi();
        } else if (zzbg() != -9223372036854775807L) {
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzax(zzix zzixVar) throws zzjm {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzixVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b5 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b5 == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvm zzvmVarZzaK = zzaK();
                        zzvmVarZzaK.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvmVarZzaK.zzp(bundle);
                    }
                }
            }
        }
    }

    public final void zzaz(zzvm zzvmVar, int i5, long j8) {
        Trace.beginSection("skipVideoBuffer");
        zzvmVar.zzc(i5, false);
        Trace.endSection();
        ((zzvw) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzbb(long j8) {
        super.zzbb(j8);
        this.zzE--;
    }

    public final /* synthetic */ Surface zzbr() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public final void zzx(int i5, Object obj) throws zzvs, zzjm {
        if (i5 == 1) {
            zzbv(obj);
            return;
        }
        if (i5 == 7) {
            obj.getClass();
            zzadt zzadtVar = (zzadt) obj;
            this.zzP = zzadtVar;
            zzaew zzaewVar = this.zzr;
            if (zzaewVar != null) {
                zzaewVar.zzl(zzadtVar);
                return;
            }
            return;
        }
        if (i5 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzO != iIntValue) {
                this.zzO = iIntValue;
                return;
            }
            return;
        }
        if (i5 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzz = iIntValue2;
            zzvm zzvmVarZzaK = zzaK();
            if (zzvmVarZzaK != null) {
                zzvmVarZzaK.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i5 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzA = iIntValue3;
            zzaew zzaewVar2 = this.zzr;
            if (zzaewVar2 != null) {
                zzaewVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i5 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaew zzaewVar3 = this.zzr;
                if (zzaewVar3 == null || !zzaewVar3.zze()) {
                    return;
                }
                zzaewVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaew zzaewVar4 = this.zzr;
            if (zzaewVar4 != null) {
                zzaewVar4.zzn(list);
                return;
            }
            return;
        }
        if (i5 == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.zza() == 0 || zzevVar.zzb() == 0) {
                return;
            }
            this.zzx = zzevVar;
            zzaew zzaewVar5 = this.zzr;
            if (zzaewVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaewVar5.zzp(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i5) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvm zzvmVarZzaK2 = zzaK();
                if (zzvmVarZzaK2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzvmVarZzaK2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbv(null);
                obj.getClass();
                ((zzadg) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z2 = this.zzF != null;
                zznj zznjVar = (zznj) obj;
                this.zzF = zznjVar;
                if (z2 != (zznjVar != null)) {
                    zzbf();
                    break;
                }
                break;
            default:
                super.zzx(i5, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzy(boolean z2, boolean z10) throws zzjm {
        super.zzy(z2, z10);
        zzK();
        this.zzg.zza(((zzvw) this).zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzadk zzadkVar = new zzadk(this.zze, this.zzi);
                zzadkVar.zza(true);
                zzadkVar.zzc(-this.zzl);
                zzadkVar.zzb(zzM());
                zzads zzadsVarZzd = zzadkVar.zzd();
                zzadsVarZzd.zza(1);
                this.zzr = zzadsVarZzd.zzb(0);
            }
            this.zzs = true;
        }
        int i5 = !z10 ? 1 : 0;
        zzaew zzaewVar = this.zzr;
        if (zzaewVar == null) {
            zzadw zzadwVar = this.zzi;
            zzadwVar.zzg(zzM());
            zzadwVar.zza(i5);
            return;
        }
        zzaewVar.zzc(new zzadb(this), zzhcw.zza());
        zzadt zzadtVar = this.zzP;
        if (zzadtVar != null) {
            this.zzr.zzl(zzadtVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzev.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbd());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i5;
        zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    public final void zzz(zzv[] zzvVarArr, long j8, long j10, zzxl zzxlVar) throws zzjm {
        super.zzz(zzvVarArr, j8, j10, zzxlVar);
        zzadx zzadxVar = this.zzm;
        if (zzadxVar != null) {
            zzadxVar.zzd();
        }
    }
}
