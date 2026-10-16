package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zztu implements zzsg {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private boolean zzQ;
    private zze zzR;
    private AudioDeviceInfo zzS;
    private int zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private Handler zzZ;
    private final zztp zzaa;
    private final Context zzb;
    private final zztj zzc;
    private final zzug zzd;
    private final zzcw zze;
    private final zzuf zzf;
    private final zzgwt zzg;
    private final ArrayDeque zzh;
    private zztl zzi;
    private final zztt zzj;
    private final zztt zzk;
    private zzqh zzl;
    private zzsd zzm;
    private zzto zzn;
    private zzto zzo;
    private zzck zzp;
    private final zzrh zzq;
    private zzre zzr;
    private zzqx zzs;
    private zzd zzt;
    private zzts zzu;
    private zzts zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    public /* synthetic */ zztu(zztn zztnVar, byte[] bArr) {
        this.zzb = zztnVar.zzb() == null ? null : zztnVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzaa = zztnVar.zzd();
        this.zzq = zztnVar.zzc();
        zztj zztjVar = new zztj();
        this.zzc = zztjVar;
        zzug zzugVar = new zzug();
        this.zzd = zzugVar;
        this.zze = new zzcw();
        this.zzf = new zzuf();
        this.zzg = zzgwt.zzk(zzugVar, zztjVar);
        this.zzH = 1.0f;
        this.zzP = 0;
        this.zzR = new zze(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzts(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zztt();
        this.zzk = new zztt();
        int iZzai = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztnVar.zzb() != null) {
            iZzai = zzai(zztnVar.zzb().getDeviceId());
        }
        this.zzT = iZzai;
    }

    public static int zzF(int i5, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        byte b5;
        int i12;
        int i13;
        if (i5 == 20) {
            return zzgx.zzb(byteBuffer);
        }
        if (i5 != 30) {
            switch (i5) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzagy.zzb(zzfm.zzO(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return Segment.SHARE_MINIMUM;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i5) {
                        case 14:
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i14 = iPosition;
                            while (true) {
                                if (i14 > iLimit) {
                                    i13 = -1;
                                } else if ((zzfm.zzO(byteBuffer, i14 + 4) & (-2)) == -126718022) {
                                    i13 = i14 - iPosition;
                                } else {
                                    i14++;
                                }
                            }
                            if (i13 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & ForkServer.ERROR) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return Segment.SHARE_MINIMUM;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzafd.zzb(new zzet(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(N0.a.d(i5, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i5).length() + 27)));
                    }
            }
            return zzafa.zze(byteBuffer);
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return Segment.SHARE_MINIMUM;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b10 = byteBuffer.get(iPosition3);
        if (b10 != -2) {
            if (b10 == -1) {
                i11 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b5 = byteBuffer.get(iPosition3 + 7);
            } else if (b10 != 31) {
                i11 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                i12 = byteBuffer.get(iPosition3 + 5) & 252;
                i10 = (i12 >> 2) | i11;
            } else {
                i11 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                b5 = byteBuffer.get(iPosition3 + 6);
            }
            i12 = b5 & 60;
            i10 = (i12 >> 2) | i11;
        } else {
            i10 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i10 + 1) * 32;
    }

    public static /* synthetic */ boolean zzI() {
        return zza.get() > 0;
    }

    private final void zzS(long j8) {
        long j10;
        this.zzp = this.zzo.zzk();
        if (j8 == -9223372036854775807L) {
            j10 = 0;
        } else {
            j10 = j8 - this.zzG;
            if (this.zzo.zzl() != zzbf.zza && this.zzo.zzm() != null) {
                this.zzo.zzl().zzo(this.zzo.zzm(), new zzbd());
            }
        }
        zzck zzckVar = this.zzp;
        zzcm zzcmVar = new zzcm();
        zzcmVar.zzb(this.zzo.zzl());
        zzcmVar.zzc(this.zzo.zzm());
        zzcmVar.zza(j10);
        zzckVar.zzb(zzcmVar.zzd());
    }

    private final zzqx zzT(zzrg zzrgVar) throws zzsc {
        try {
            return ((zztg) this.zzq).zzf(zzrgVar);
        } catch (zzrd e7) {
            zzsc zzscVar = new zzsc(0, zzrgVar.zzb, zzrgVar.zzc, zzrgVar.zza, zzrgVar.zze, this.zzo.zzf(), false, e7);
            zzsd zzsdVar = this.zzm;
            if (zzsdVar == null) {
                throw zzscVar;
            }
            zzsdVar.zza(zzscVar);
            throw zzscVar;
        }
    }

    private final void zzU(long j8) throws Exception {
        zzX(j8);
        if (this.zzK != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzI;
            if (byteBuffer != null) {
                zzW(byteBuffer);
                zzX(j8);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzp.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzW(byteBufferZze);
                    zzX(j8);
                } else {
                    ByteBuffer byteBuffer2 = this.zzI;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzI);
                    }
                }
            } while (this.zzK == null);
            return;
        }
    }

    private final boolean zzV() throws Exception {
        if (!this.zzp.zzc()) {
            zzX(Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzp.zzf();
        zzU(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzK;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[PHI: r14
  0x00b1: PHI (r14v19 double) = (r14v15 double), (r14v28 double) binds: [B:46:0x00f2, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[PHI: r14
  0x00b7: PHI (r14v16 double) = (r14v15 double), (r14v28 double) binds: [B:46:0x00f2, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[PHI: r11
  0x00db: PHI (r11v16 float) = (r11v11 float), (r11v43 float) binds: [B:56:0x0191, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[PHI: r11
  0x00e1: PHI (r11v12 float) = (r11v11 float), (r11v43 float) binds: [B:56:0x0191, B:41:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzW(java.nio.ByteBuffer r33) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztu.zzW(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(long r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.zzK
            if (r0 != 0) goto L6
            goto Lbb
        L6:
            com.google.android.gms.internal.ads.zztt r0 = r8.zzk
            boolean r0 = r0.zzb()
            if (r0 != 0) goto Lbb
            java.nio.ByteBuffer r0 = r8.zzK
            int r0 = r0.remaining()
            r1 = 0
            r3 = 1
            r4 = 0
            com.google.android.gms.internal.ads.zzqx r5 = r8.zzs     // Catch: com.google.android.gms.internal.ads.zzqw -> L83
            java.nio.ByteBuffer r6 = r8.zzK     // Catch: com.google.android.gms.internal.ads.zzqw -> L83
            int r7 = r8.zzJ     // Catch: com.google.android.gms.internal.ads.zzqw -> L83
            boolean r9 = r5.zzc(r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzqw -> L83
            long r5 = android.os.SystemClock.elapsedRealtime()
            r8.zzU = r5
            com.google.android.gms.internal.ads.zztt r10 = r8.zzk
            r10.zzc()
            com.google.android.gms.internal.ads.zzqx r10 = r8.zzs
            boolean r10 = r10.zzg()
            if (r10 == 0) goto L49
            long r5 = r8.zzB
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 <= 0) goto L3d
            r8.zzW = r4
        L3d:
            boolean r10 = r8.zzO
            if (r10 == 0) goto L49
            com.google.android.gms.internal.ads.zzsd r10 = r8.zzm
            if (r10 == 0) goto L49
            if (r9 != 0) goto L49
            com.google.android.gms.internal.ads.zztz r10 = (com.google.android.gms.internal.ads.zztz) r10
        L49:
            com.google.android.gms.internal.ads.zzto r10 = r8.zzo
            boolean r10 = r10.zze()
            if (r10 == 0) goto L5e
            long r1 = r8.zzA
            java.nio.ByteBuffer r10 = r8.zzK
            int r10 = r10.remaining()
            int r0 = r0 - r10
            long r5 = (long) r0
            long r1 = r1 + r5
            r8.zzA = r1
        L5e:
            if (r9 == 0) goto Lbb
            com.google.android.gms.internal.ads.zzto r9 = r8.zzo
            boolean r9 = r9.zze()
            if (r9 != 0) goto L7f
            java.nio.ByteBuffer r9 = r8.zzK
            java.nio.ByteBuffer r10 = r8.zzI
            if (r9 != r10) goto L6f
            goto L70
        L6f:
            r3 = r4
        L70:
            com.google.android.gms.internal.ads.zzgtr.zzi(r3)
            long r9 = r8.zzB
            int r0 = r8.zzC
            long r0 = (long) r0
            int r2 = r8.zzJ
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r9
            r8.zzB = r0
        L7f:
            r9 = 0
            r8.zzK = r9
            return
        L83:
            r9 = move-exception
            boolean r10 = r9.zzb
            if (r10 == 0) goto L9d
            long r5 = r8.zzaf()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            goto L9e
        L91:
            com.google.android.gms.internal.ads.zzqx r0 = r8.zzs
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L9d
            r8.zzY()
            goto L9e
        L9d:
            r3 = r4
        L9e:
            int r9 = r9.zza
            com.google.android.gms.internal.ads.zzsf r0 = new com.google.android.gms.internal.ads.zzsf
            com.google.android.gms.internal.ads.zzto r1 = r8.zzo
            com.google.android.gms.internal.ads.zzv r1 = r1.zzf()
            r0.<init>(r9, r1, r3)
            com.google.android.gms.internal.ads.zzsd r9 = r8.zzm
            if (r9 == 0) goto Lb2
            r9.zza(r0)
        Lb2:
            if (r10 != 0) goto Lba
            com.google.android.gms.internal.ads.zztt r9 = r8.zzk
            r9.zza(r0)
            return
        Lba:
            throw r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztu.zzX(long):void");
    }

    private final void zzY() {
        this.zzo.zzj();
    }

    private final void zzZ() {
        if (zzae()) {
            this.zzs.zzf(this.zzH);
        }
    }

    private final void zzaa() {
        if (this.zzo != null) {
            zzto zztoVar = this.zzn;
            if (zztoVar != null) {
                this.zzo = zztoVar;
                this.zzn = null;
            }
            try {
                this.zzo = this.zzo.zza(this.zzq.zzb(zzag(this.zzo.zzg(), -1)));
            } catch (zzqy e7) {
                throw new IllegalStateException(new zzsb(e7, this.zzo.zzf()));
            }
        }
        zzC();
    }

    private final void zzab(zzav zzavVar) {
        zzts zztsVar = new zzts(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzae()) {
            this.zzu = zztsVar;
        } else {
            this.zzv = zztsVar;
        }
    }

    private final void zzac(long j8) {
        zzav zzavVar;
        boolean z2;
        if (zzad()) {
            zztp zztpVar = this.zzaa;
            zzavVar = this.zzw;
            zztpVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzad()) {
            zztp zztpVar2 = this.zzaa;
            z2 = this.zzx;
            zztpVar2.zzc(z2);
        } else {
            z2 = false;
        }
        this.zzx = z2;
        this.zzh.add(new zzts(zzavVar2, Math.max(0L, j8), this.zzo.zzc(zzaf()), null));
        zzS(j8);
        zzsd zzsdVar = this.zzm;
        if (zzsdVar != null) {
            ((zztz) zzsdVar).zza.zzaB().zzh(this.zzx);
        }
    }

    private final boolean zzad() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i5 = this.zzo.zzf().zzK;
        return true;
    }

    private final boolean zzae() {
        return this.zzs != null;
    }

    private final long zzaf() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j8 = this.zzA;
        long jZzi = this.zzo.zzi();
        String str = zzfm.zza;
        return ((j8 + jZzi) - 1) / jZzi;
    }

    private final zzra zzag(zzv zzvVar, int i5) {
        zzqz zzqzVar = new zzqz(zzvVar);
        zzqzVar.zza(this.zzt);
        zzqzVar.zzb(this.zzS);
        zzqzVar.zzc(this.zzP);
        zzqzVar.zze(-1);
        zzqzVar.zzd(this.zzT);
        return new zzra(zzqzVar, null);
    }

    private final void zzah() {
        if (this.zzM) {
            return;
        }
        this.zzM = true;
        if (this.zzs.zzg()) {
            this.zzN = false;
        }
        this.zzs.zzd();
    }

    private static int zzai(int i5) {
        if (i5 == 0 || i5 == -1) {
            return -1;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzA(float f10) {
        if (this.zzH != f10) {
            this.zzH = f10;
            zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzB() {
        this.zzO = false;
        if (zzae()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzC() {
        if (zzae()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzW = false;
            this.zzC = 0;
            this.zzv = new zzts(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzM = false;
            this.zzL = false;
            this.zzN = false;
            this.zzd.zzr();
            zzS(-9223372036854775807L);
            this.zzi = null;
            zzto zztoVar = this.zzn;
            if (zztoVar != null) {
                this.zzo = zztoVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzX = 0L;
        this.zzY = 0L;
        Handler handler = this.zzZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzD() {
        zzC();
        zzgwt zzgwtVar = this.zzg;
        int size = zzgwtVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzcp) zzgwtVar.get(i5)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzO = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzE() {
        this.zzq.zze();
    }

    public final /* synthetic */ void zzG() {
        if (this.zzY >= 300000) {
            ((zztz) this.zzm).zza.zzaD(true);
            this.zzY = 0L;
        }
    }

    public final /* synthetic */ void zzH() {
        zzsd zzsdVar = this.zzm;
        if (zzsdVar != null) {
            ((zztz) zzsdVar).zza.zzU();
        }
    }

    public final /* synthetic */ zztl zzK() {
        return this.zzi;
    }

    public final /* synthetic */ zzsd zzL() {
        return this.zzm;
    }

    public final /* synthetic */ zzto zzM() {
        return this.zzo;
    }

    public final /* synthetic */ zzqx zzN() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzO() {
        return this.zzM;
    }

    public final /* synthetic */ void zzP(boolean z2) {
        this.zzN = true;
    }

    public final /* synthetic */ boolean zzQ() {
        return this.zzO;
    }

    public final /* synthetic */ long zzR() {
        return this.zzU;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zza(zzsd zzsdVar) {
        this.zzm = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzb(zzqh zzqhVar) {
        this.zzl = zzqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzc(zzdp zzdpVar) {
        this.zzq.zzd(zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final int zze(zzv zzvVar) {
        boolean z2;
        int i5 = zzvVar.zzK;
        if (!zzfm.zzE(i5) || i5 == 2) {
            z2 = false;
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzJ(2);
            zzvVar = zztVarZza.zzP();
            z2 = true;
        }
        int i10 = this.zzq.zza(zzag(zzvVar, -1)).zzd;
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            return 0;
        }
        return z2 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzqu zzf(zzv zzvVar) {
        if (this.zzV) {
            return zzqu.zza;
        }
        zzrc zzrcVarZza = this.zzq.zza(zzag(zzvVar, -1));
        zzqt zzqtVar = new zzqt();
        zzqtVar.zza(zzrcVarZza.zza);
        zzqtVar.zzb(zzrcVarZza.zzb);
        zzqtVar.zzc(zzrcVarZza.zzc);
        return zzqtVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzg(boolean z2) {
        ArrayDeque arrayDeque;
        long j8;
        if (!zzae() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzo.zzc(zzaf()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || jMin < ((zzts) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzts) arrayDeque.remove();
        }
        zzts zztsVar = this.zzv;
        long j10 = jMin - zztsVar.zzc;
        long jZzy = zzfm.zzy(j10, zztsVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzaa.zzd(j10);
            zzts zztsVar2 = this.zzv;
            j8 = zztsVar2.zzb + jZzd;
            zztsVar2.zzd = jZzd - jZzy;
        } else {
            zzts zztsVar3 = this.zzv;
            j8 = zztsVar3.zzb + jZzy + zztsVar3.zzd;
        }
        long jZze = this.zzaa.zze();
        long jZzc = j8 + this.zzo.zzc(jZze);
        long j11 = this.zzX;
        if (jZze > j11) {
            long jZzc2 = this.zzo.zzc(jZze - j11);
            this.zzX = jZze;
            this.zzY += jZzc2;
            if (this.zzZ == null) {
                this.zzZ = new Handler(Looper.myLooper());
            }
            this.zzZ.removeCallbacksAndMessages(null);
            this.zzZ.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzG();
                }
            }, 100L);
        }
        return jZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzh(zzrz zzrzVar) throws zzsb {
        int i5;
        zzv zzvVar;
        zzck zzckVar;
        int iZzI;
        if (this.zzr == null && this.zzb != null) {
            zzre zzreVar = new zzre() { // from class: com.google.android.gms.internal.ads.zztq
                @Override // com.google.android.gms.internal.ads.zzre
                public final /* synthetic */ void zza() {
                    this.zza.zzH();
                }
            };
            this.zzr = zzreVar;
            this.zzq.zzc(zzreVar);
        }
        zzv zzvVar2 = zzrzVar.zza;
        if ("audio/raw".equals(zzvVar2.zzp)) {
            int i10 = zzvVar2.zzK;
            zzgtr.zza(zzfm.zzE(i10));
            int i11 = zzvVar2.zzH;
            int iZzI2 = zzfm.zzI(i10) * i11;
            zzgwq zzgwqVar = new zzgwq();
            zzgwqVar.zzh(this.zzg);
            zzgwqVar.zzf(this.zze);
            zzgwqVar.zzg(this.zzaa.zza());
            zzck zzckVar2 = new zzck(zzgwqVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar2.zzL, zzvVar2.zzM);
            this.zzc.zzq(zzrzVar.zzc);
            try {
                zzcl zzclVarZza = zzckVar2.zza(new zzcl(zzvVar2.zzJ, i11, i10));
                zzt zztVarZza = zzvVar2.zza();
                int i12 = zzclVarZza.zzd;
                zztVarZza.zzJ(i12);
                zztVarZza.zzI(zzclVarZza.zzb);
                int i13 = zzclVarZza.zzc;
                zztVarZza.zzG(i13);
                zztVarZza.zzH(i13 == zzvVar2.zzH ? zzvVar2.zzI : -1);
                zzv zzvVarZzP = zztVarZza.zzP();
                zzckVar = zzckVar2;
                iZzI = zzfm.zzI(i12) * i13;
                i5 = iZzI2;
                zzvVar = zzvVarZzP;
            } catch (zzco e7) {
                throw new zzsb(e7, zzvVar2);
            }
        } else {
            i5 = -1;
            zzvVar = zzvVar2;
            zzckVar = new zzck(zzgwt.zzi());
            iZzI = -1;
        }
        zzra zzraVarZzag = zzag(zzvVar, -1);
        try {
            zzrg zzrgVarZzb = this.zzq.zzb(zzraVarZzag);
            if (zzrgVarZzb.zza == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=false)");
                throw new zzsb(sb2.toString(), zzraVarZzag.zza);
            }
            if (zzrgVarZzb.zzc == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=false)");
                throw new zzsb(sb3.toString(), zzraVarZzag.zza);
            }
            this.zzV = false;
            zzbf zzbfVar = zzrzVar.zzd;
            zzxl zzxlVar = zzrzVar.zze;
            zzto zztoVar = new zzto(zzvVar2, zzvVar, i5, iZzI, zzrgVarZzb, zzckVar, zzbfVar, zzxlVar != null ? zzxlVar.zza : null, null);
            if (zzae()) {
                this.zzn = zztoVar;
            } else {
                this.zzo = zztoVar;
            }
        } catch (zzqy e10) {
            throw new zzsb(e10, zzvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzi() {
        this.zzO = true;
        if (zzae()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj() {
        this.zzD = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.google.android.gms.internal.ads.zzsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.nio.ByteBuffer r19, long r20, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztu.zzk(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl() throws zzsf {
        if (!this.zzL && zzae() && zzV()) {
            zzah();
            this.zzL = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzm() {
        if (zzae()) {
            return this.zzL && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final boolean zzn() {
        if (!zzae()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzN) {
            return false;
        }
        long jZzaf = zzaf();
        long jZzk = this.zzs.zzk();
        zzqx zzqxVar = this.zzs;
        zzqxVar.getClass();
        return jZzaf > zzfm.zzv(jZzk, zzqxVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzo(zzav zzavVar) {
        float f10 = zzavVar.zzb;
        String str = zzfm.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzab(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzq(boolean z2) {
        this.zzx = z2;
        zzab(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzqj zzs() {
        zzrh zzrhVar = this.zzq;
        if (zzrhVar instanceof zztg) {
            return ((zztg) zzrhVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzt(int i5) {
        if (this.zzQ) {
            if (this.zzP != i5) {
                return;
            } else {
                this.zzQ = false;
            }
        }
        if (this.zzP != i5) {
            this.zzP = i5;
            zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzu(zze zzeVar) {
        if (this.zzR.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i5 = this.zzR.zza;
        }
        this.zzR = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzS = audioDeviceInfo;
        zzqx zzqxVar = this.zzs;
        if (zzqxVar != null) {
            zzqxVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzw(int i5) {
        int i10 = this.zzT;
        int iZzai = zzai(i5);
        if (i10 == iZzai) {
            return;
        }
        this.zzT = iZzai;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzx(long j8) {
        this.zzG = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzy() {
        if (!zzae()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzage.zzf(this.zzo.zzj().zza);
        zzgtr.zzi(iZzf != -2147483647);
        return zzfm.zzw(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzz(int i5, int i10) {
        zzqx zzqxVar = this.zzs;
        if (zzqxVar != null) {
            zzqxVar.zzg();
        }
    }
}
