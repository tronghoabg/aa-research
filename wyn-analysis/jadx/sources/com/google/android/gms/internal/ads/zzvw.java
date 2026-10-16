package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class zzvw extends zziz {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvs zzD;
    private zzvp zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzjd zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvv zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zzjb zzan;
    private zzjb zzao;
    private zzgxd zzap;
    private final Context zzc;
    private final zzvk zzd;
    private final zzvy zze;
    private final float zzf;
    private final zzix zzg;
    private final zzix zzh;
    private final zzix zzi;
    private final zzvd zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzub zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzuj zzq;
    private zzuj zzr;
    private zznb zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvm zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvw(Context context, int i5, zzvk zzvkVar, zzvy zzvyVar, boolean z2, float f10) {
        super(i5);
        this.zzc = context.getApplicationContext();
        this.zzd = zzvkVar;
        zzvyVar.getClass();
        this.zze = zzvyVar;
        this.zzf = f10;
        this.zzn = new AtomicInteger();
        this.zzg = new zzix(0, 0);
        this.zzh = new zzix(0, 0);
        this.zzi = new zzix(2, 0);
        zzvd zzvdVar = new zzvd();
        this.zzj = zzvdVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        this.zzah = zzvv.zza;
        zzvdVar.zzj(0);
        zzvdVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zzub();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzW = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzjd();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgxd.zzh();
        zzjb zzjbVar = zzjb.zza;
        this.zzan = zzjbVar;
        this.zzao = zzjbVar;
    }

    private final void zzaA() {
        try {
            zzvm zzvmVar = this.zzx;
            if (zzvmVar == null) {
                throw null;
            }
            zzvmVar.zzk();
        } finally {
            zzaT();
        }
    }

    private final void zzaB() {
        this.zzac = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        zzbv().zzi(-9223372036854775807L);
        this.zzai = -9223372036854775807L;
    }

    private final boolean zzaC(int i5) throws zzvs, zzjm {
        zzly zzlyVarZzI = zzI();
        zzix zzixVar = this.zzg;
        zzixVar.zza();
        int iZzR = zzR(zzlyVarZzI, zzixVar, i5 | 4);
        if (iZzR == -5) {
            zzap(zzlyVarZzI);
            return true;
        }
        if (iZzR != -4 || !zzixVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbt();
        return false;
    }

    private final boolean zzaD(long j8) {
        return this.zzu == -9223372036854775807L || zzM().zzb() - j8 < this.zzu;
    }

    private final boolean zzaE() {
        return this.zzP >= 0;
    }

    private final void zzar() {
        this.zzS = false;
        zzay();
    }

    private final void zzay() {
        zzaB();
        this.zzU = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzT = false;
        this.zzm.zzb();
    }

    private final boolean zzaz() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaQ()) {
            zzaO();
            return true;
        }
        if (zzaR()) {
            zzaA();
            return false;
        }
        this.zzal = true;
        return false;
    }

    public static boolean zzbl(zzv zzvVar) {
        return zzvVar.zzP == 0;
    }

    private final void zzbo() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbp() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbq(zzv zzvVar) throws zzvs, zzjm {
        if (this.zzx != null && this.zzY != 3 && zze() != 0) {
            float f10 = this.zzw;
            zzvVar.getClass();
            float fZzal = zzal(f10, zzvVar, zzJ());
            float f11 = this.zzB;
            if (f11 != fZzal) {
                if (fZzal == -1.0f) {
                    zzbs();
                    return false;
                }
                if (f11 != -1.0f || fZzal > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzal);
                    zzvm zzvmVar = this.zzx;
                    zzvmVar.getClass();
                    zzvmVar.zzp(bundle);
                    this.zzB = fZzal;
                }
            }
        }
        return true;
    }

    private final boolean zzbr() throws zzjm {
        if (this.zzZ) {
            this.zzX = 1;
            if (zzaQ()) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbw();
        }
        return true;
    }

    private final void zzbs() throws zzvs, zzjm {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaO();
            zzaG();
        }
    }

    private final void zzbt() throws zzvs, zzjm {
        int i5 = this.zzY;
        if (i5 == 1) {
            zzaA();
            return;
        }
        if (i5 == 2) {
            zzaA();
            zzbw();
        } else if (i5 != 3) {
            this.zzaf = true;
            zzav();
        } else {
            zzaO();
            zzaG();
        }
    }

    private final void zzbu(zzvv zzvvVar) {
        this.zzah = zzvvVar;
        if (zzvvVar.zzd() != -9223372036854775807L) {
            this.zzaj = true;
            zzaw(zzvvVar.zzd());
        }
    }

    private final zzvv zzbv() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvv) arrayDeque.getLast() : this.zzah;
    }

    private final void zzbw() throws zzjm {
        zzuj zzujVar = this.zzr;
        zzujVar.getClass();
        this.zzq = zzujVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbx(long j8, long j10) {
        if (j10 >= j8) {
            return false;
        }
        zzv zzvVar = this.zzp;
        return (zzvVar != null && Objects.equals(zzvVar.zzp, "audio/opus") && zzgx.zzf(j8, j10)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public void zzA(long j8, boolean z2, boolean z10) throws zzvs, zzjm {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvv) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z10) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzS) {
                zzay();
            } else {
                zzaP();
            }
            if (this.zzah.zze().zzc() > 0) {
                this.zzag = true;
            }
            this.zzah.zze().zzb();
            this.zzah.zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public void zzD() {
        this.zzo = null;
        zzbu(zzvv.zza);
        this.zzl.clear();
        if (this.zzS) {
            zzar();
        } else {
            zzaz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public void zzE() {
        try {
            zzar();
            zzaO();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public final void zzG(zzbf zzbfVar) {
        zzbv();
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public final long zzW(long j8, long j10) {
        return zzak(j8, j10, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    public void zzY(float f10, float f11) throws zzvs, zzjm {
        this.zzv = f10;
        this.zzw = f11;
        zzbq(this.zzy);
    }

    public final void zzaF() {
        this.zzak = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed A[Catch: Exception -> 0x0104, TryCatch #3 {Exception -> 0x0104, blocks: (B:57:0x00db, B:59:0x00e5, B:61:0x00f6, B:67:0x0136, B:69:0x0149, B:71:0x0177, B:73:0x0180, B:75:0x0188, B:77:0x0192, B:79:0x019a, B:81:0x01a2, B:101:0x01e7, B:103:0x01ed, B:107:0x01f9, B:109:0x01ff, B:113:0x020b, B:115:0x0211, B:140:0x0269, B:142:0x026f, B:144:0x0275, B:145:0x0283, B:147:0x0291, B:149:0x0299, B:151:0x029d, B:154:0x02af, B:120:0x021f, B:122:0x0227, B:124:0x022f, B:126:0x0237, B:128:0x023f, B:130:0x0247, B:132:0x024f, B:134:0x0259, B:136:0x0263, B:86:0x01b0, B:88:0x01b8, B:92:0x01c3, B:94:0x01cd, B:96:0x01d5, B:98:0x01dd), top: B:193:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026f A[Catch: Exception -> 0x0104, TryCatch #3 {Exception -> 0x0104, blocks: (B:57:0x00db, B:59:0x00e5, B:61:0x00f6, B:67:0x0136, B:69:0x0149, B:71:0x0177, B:73:0x0180, B:75:0x0188, B:77:0x0192, B:79:0x019a, B:81:0x01a2, B:101:0x01e7, B:103:0x01ed, B:107:0x01f9, B:109:0x01ff, B:113:0x020b, B:115:0x0211, B:140:0x0269, B:142:0x026f, B:144:0x0275, B:145:0x0283, B:147:0x0291, B:149:0x0299, B:151:0x029d, B:154:0x02af, B:120:0x021f, B:122:0x0227, B:124:0x022f, B:126:0x0237, B:128:0x023f, B:130:0x0247, B:132:0x024f, B:134:0x0259, B:136:0x0263, B:86:0x01b0, B:88:0x01b8, B:92:0x01c3, B:94:0x01cd, B:96:0x01d5, B:98:0x01dd), top: B:193:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e9 A[Catch: zzvs -> 0x0082, TryCatch #2 {zzvs -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:168:0x02d0, B:170:0x02e9, B:172:0x02f2, B:175:0x02f9, B:176:0x02fb, B:171:0x02ec, B:178:0x02fd, B:179:0x02fe, B:181:0x0303, B:182:0x0304, B:183:0x030e, B:38:0x008a, B:39:0x0092, B:185:0x0311), top: B:192:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ec A[Catch: zzvs -> 0x0082, TryCatch #2 {zzvs -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:168:0x02d0, B:170:0x02e9, B:172:0x02f2, B:175:0x02f9, B:176:0x02fb, B:171:0x02ec, B:178:0x02fd, B:179:0x02fe, B:181:0x0303, B:182:0x0304, B:183:0x030e, B:38:0x008a, B:39:0x0092, B:185:0x0311), top: B:192:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzvk] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzvj] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaG() throws com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zzaG():void");
    }

    public final boolean zzaH(zzv zzvVar) {
        return this.zzr == null && zzah(zzvVar);
    }

    public boolean zzaI(zzvp zzvpVar) {
        return true;
    }

    public final boolean zzaJ() {
        return this.zzS;
    }

    public final zzvm zzaK() {
        return this.zzx;
    }

    public final zzv zzaL() {
        return this.zzy;
    }

    public final MediaFormat zzaM() {
        return this.zzz;
    }

    public final zzvp zzaN() {
        return this.zzE;
    }

    public final void zzaO() {
        try {
            zzvm zzvmVar = this.zzx;
            if (zzvmVar != null) {
                zzvmVar.zzl();
                this.zza.zzb++;
                zzvp zzvpVar = this.zzE;
                if (zzvpVar == null) {
                    throw null;
                }
                zzan(zzvpVar.zza);
            }
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaU();
        } catch (Throwable th) {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaU();
            throw th;
        }
    }

    public final boolean zzaP() throws zzvs, zzjm {
        boolean zZzaz = zzaz();
        if (zZzaz) {
            zzaG();
        }
        return zZzaz;
    }

    public boolean zzaQ() {
        int i5 = this.zzY;
        if (i5 == 3 || ((this.zzG && !this.zzab) || (this.zzH && (this.zzaa || this.zzX == 1)))) {
            return true;
        }
        if (i5 != 2) {
            return false;
        }
        try {
            zzbw();
            return false;
        } catch (zzjm e7) {
            zzeh.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
            return true;
        }
    }

    public boolean zzaR() {
        return true;
    }

    public final long zzaS() {
        return this.zzam;
    }

    public void zzaT() {
        zzbo();
        zzbp();
        zzaB();
        this.zzN = -9223372036854775807L;
        this.zzaa = false;
        this.zzL = -9223372036854775807L;
        this.zzZ = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    public final void zzaU() {
        zzaT();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzab = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzvo zzaV(Throwable th, zzvp zzvpVar) {
        return new zzvo(th, zzvpVar);
    }

    public boolean zzaW(zzv zzvVar) throws zzjm {
        return true;
    }

    public void zzaX(zzix zzixVar) throws zzjm {
    }

    public int zzaY(zzix zzixVar) {
        return 0;
    }

    public boolean zzaZ(zzix zzixVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02f2, code lost:
    
        r19 = r2;
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03f3, code lost:
    
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0437, code lost:
    
        if (r25.zzK != false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0439, code lost:
    
        r25.zzaa = true;
        r2.zza(r25.zzO, 0, 0, 0, 4);
        zzbo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x044c, code lost:
    
        r25.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r25.zzaf = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0373 A[Catch: IllegalStateException -> 0x009f, CryptoException -> 0x00a4, TryCatch #13 {CryptoException -> 0x00a4, IllegalStateException -> 0x009f, blocks: (B:122:0x01df, B:47:0x009c, B:57:0x00af, B:59:0x00b3, B:62:0x00bc, B:65:0x00ca, B:66:0x00d9, B:70:0x00e6, B:72:0x00ec, B:112:0x01c7, B:114:0x01cd, B:115:0x01d0, B:117:0x01d6, B:119:0x01da, B:73:0x00f7, B:75:0x00fd, B:76:0x010a, B:78:0x011a, B:81:0x012b, B:84:0x0131, B:86:0x0135, B:88:0x013f, B:90:0x0149, B:91:0x0166, B:92:0x016e, B:93:0x016f, B:95:0x0176, B:97:0x017e, B:99:0x0184, B:100:0x018b, B:102:0x0197, B:103:0x01a0, B:108:0x01bb, B:110:0x01c1, B:106:0x01a7, B:80:0x0122, B:111:0x01c4, B:128:0x01f3, B:130:0x01fb, B:131:0x0209, B:133:0x020d, B:135:0x0219, B:139:0x0224, B:141:0x022a, B:143:0x0232, B:145:0x023c, B:147:0x0244, B:149:0x024b, B:151:0x0251, B:154:0x025b, B:155:0x0268, B:157:0x026e, B:159:0x027a, B:168:0x028b, B:169:0x0293, B:170:0x029b, B:171:0x02a3, B:172:0x02ab, B:173:0x02b3, B:175:0x02bf, B:176:0x02c4, B:177:0x02ca, B:178:0x02cb, B:180:0x02cf, B:182:0x02d3, B:184:0x02d7, B:185:0x02da, B:187:0x02e0, B:189:0x02ef, B:191:0x02f7, B:193:0x0302, B:194:0x0309, B:196:0x030d, B:198:0x0312, B:199:0x0316, B:201:0x0320, B:202:0x032f, B:204:0x033f, B:206:0x0343, B:208:0x0347, B:210:0x0355, B:215:0x0360, B:217:0x0364, B:218:0x036e, B:211:0x0358, B:213:0x035c, B:219:0x036f, B:221:0x0373, B:225:0x0382, B:227:0x038e, B:232:0x03a1), top: B:417:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ff A[LOOP:0: B:131:0x0209->B:254:0x03ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[Catch: IllegalStateException -> 0x009f, CryptoException -> 0x00a4, TryCatch #13 {CryptoException -> 0x00a4, IllegalStateException -> 0x009f, blocks: (B:122:0x01df, B:47:0x009c, B:57:0x00af, B:59:0x00b3, B:62:0x00bc, B:65:0x00ca, B:66:0x00d9, B:70:0x00e6, B:72:0x00ec, B:112:0x01c7, B:114:0x01cd, B:115:0x01d0, B:117:0x01d6, B:119:0x01da, B:73:0x00f7, B:75:0x00fd, B:76:0x010a, B:78:0x011a, B:81:0x012b, B:84:0x0131, B:86:0x0135, B:88:0x013f, B:90:0x0149, B:91:0x0166, B:92:0x016e, B:93:0x016f, B:95:0x0176, B:97:0x017e, B:99:0x0184, B:100:0x018b, B:102:0x0197, B:103:0x01a0, B:108:0x01bb, B:110:0x01c1, B:106:0x01a7, B:80:0x0122, B:111:0x01c4, B:128:0x01f3, B:130:0x01fb, B:131:0x0209, B:133:0x020d, B:135:0x0219, B:139:0x0224, B:141:0x022a, B:143:0x0232, B:145:0x023c, B:147:0x0244, B:149:0x024b, B:151:0x0251, B:154:0x025b, B:155:0x0268, B:157:0x026e, B:159:0x027a, B:168:0x028b, B:169:0x0293, B:170:0x029b, B:171:0x02a3, B:172:0x02ab, B:173:0x02b3, B:175:0x02bf, B:176:0x02c4, B:177:0x02ca, B:178:0x02cb, B:180:0x02cf, B:182:0x02d3, B:184:0x02d7, B:185:0x02da, B:187:0x02e0, B:189:0x02ef, B:191:0x02f7, B:193:0x0302, B:194:0x0309, B:196:0x030d, B:198:0x0312, B:199:0x0316, B:201:0x0320, B:202:0x032f, B:204:0x033f, B:206:0x0343, B:208:0x0347, B:210:0x0355, B:215:0x0360, B:217:0x0364, B:218:0x036e, B:211:0x0358, B:213:0x035c, B:219:0x036f, B:221:0x0373, B:225:0x0382, B:227:0x038e, B:232:0x03a1), top: B:417:0x0028 }] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzvw] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.zznc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzaa(long r26, long r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zzaa(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public boolean zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public boolean zzac() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int zzae(zzv zzvVar) throws zzjm {
        try {
            return zzaf(this.zze, zzvVar);
        } catch (zzwa e7) {
            throw zzQ(e7, zzvVar, false, 4002);
        }
    }

    public abstract int zzaf(zzvy zzvyVar, zzv zzvVar) throws zzwa;

    public abstract List zzag(zzvy zzvyVar, zzv zzvVar, boolean z2) throws zzwa;

    public boolean zzah(zzv zzvVar) {
        return false;
    }

    public abstract zzvj zzai(zzvp zzvpVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10);

    public zzje zzaj(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z2) {
        throw null;
    }

    public long zzak(long j8, long j10, boolean z2) {
        return H.a(this, j8, j10);
    }

    public float zzal(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzam(String str, zzvj zzvjVar, long j8, long j10) {
        throw null;
    }

    public void zzan(String str) {
        throw null;
    }

    public void zzao(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzje zzap(com.google.android.gms.internal.ads.zzly r15) throws com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zzap(com.google.android.gms.internal.ads.zzly):com.google.android.gms.internal.ads.zzje");
    }

    public void zzaq(zzv zzvVar, MediaFormat mediaFormat) throws zzjm {
        throw null;
    }

    public void zzas() {
    }

    public abstract boolean zzat(long j8, long j10, zzvm zzvmVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, zzv zzvVar) throws zzjm;

    public abstract void zzau(zzjb zzjbVar);

    public void zzav() throws zzjm {
        throw null;
    }

    public void zzaw(long j8) {
    }

    public void zzax(zzix zzixVar) throws zzjm {
        throw null;
    }

    public final long zzba() {
        return this.zzai;
    }

    public void zzbb(long j8) {
        this.zzai = Math.max(j8, this.zzai);
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j8 < ((zzvv) arrayDeque.peek()).zzb()) {
                return;
            }
            zzvv zzvvVar = (zzvv) arrayDeque.poll();
            zzvvVar.getClass();
            zzbu(zzvvVar);
            zzas();
        }
    }

    public final boolean zzbc() {
        if (this.zzo == null) {
            return false;
        }
        if (zzT() || zzaE()) {
            return true;
        }
        return this.zzN != -9223372036854775807L && zzM().zzb() < this.zzN;
    }

    public final float zzbd() {
        return this.zzv;
    }

    public final zznb zzbe() {
        return this.zzs;
    }

    public final boolean zzbf() throws zzjm {
        return zzbq(this.zzy);
    }

    public final long zzbg() {
        return this.zzah.zzh();
    }

    public final long zzbh() {
        return this.zzac;
    }

    public final long zzbi() {
        return this.zzah.zzd();
    }

    public final long zzbj() {
        return this.zzah.zzc();
    }

    public final void zzbk(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    public final /* synthetic */ void zzbm(zzly zzlyVar) {
        this.zzn.set(zzR(zzlyVar, this.zzh, 0));
    }

    public final /* synthetic */ zznb zzbn() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzne
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    public void zzx(int i5, Object obj) throws zzjm {
        if (i5 != 11) {
            return;
        }
        zznb zznbVar = (zznb) obj;
        zznbVar.getClass();
        this.zzs = zznbVar;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    public void zzy(boolean z2, boolean z10) throws zzjm {
        this.zza = new zzjd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zziz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r14, long r15, long r17, com.google.android.gms.internal.ads.zzxl r19) throws com.google.android.gms.internal.ads.zzjm {
        /*
            r13 = this;
            long r7 = r13.zzP()
            com.google.android.gms.internal.ads.zzvv r14 = r13.zzah
            long r0 = r14.zzd()
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto L2d
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            r9 = 0
            r10 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r13.zzbu(r0)
            boolean r14 = r13.zzak
            if (r14 == 0) goto L64
            r13.zzas()
            return
        L2d:
            java.util.ArrayDeque r14 = r13.zzl
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L65
            long r0 = r13.zzac
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L45
            long r2 = r13.zzai
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L65
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L65
        L45:
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            r9 = 0
            r10 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r13.zzbu(r0)
            com.google.android.gms.internal.ads.zzvv r14 = r13.zzah
            long r0 = r14.zzd()
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 == 0) goto L64
            r13.zzas()
        L64:
            return
        L65:
            com.google.android.gms.internal.ads.zzvv r0 = new com.google.android.gms.internal.ads.zzvv
            long r1 = r13.zzac
            r9 = 0
            r10 = 0
            r3 = r15
            r5 = r17
            r0.<init>(r1, r3, r5, r7, r9, r10)
            r14.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvw.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxl):void");
    }
}
