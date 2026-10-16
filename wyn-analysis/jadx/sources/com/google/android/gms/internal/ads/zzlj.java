package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzlj extends zzf implements zzjx {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdn zzB;
    private final zzfd zzC;
    private final zzli zzD;
    private final zzjz zzE;
    private final zzjz zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznj zzJ;
    private zznk zzK;
    private zzjw zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzev zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzmu zzaa;
    private int zzab;
    private long zzac;
    private zzzg zzad;
    final zzabj zzb;
    final zzax zzc;
    private final zzdt zze = new zzdt(zzdp.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zznc[] zzh;
    private final zznc[] zzi;
    private final zzabi zzj;
    private final zzea zzk;
    private final zzlu zzl;
    private final zzlw zzm;
    private final zzeg zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzno zzs;
    private final Looper zzt;
    private final zzabr zzu;
    private final zzdp zzv;
    private final zzkf zzw;
    private final zzle zzx;
    private final zzfs zzy;
    private final zzfu zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlj(zzjv zzjvVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfm.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.10.0] [");
            sb2.append(str);
            sb2.append("]");
            zzeh.zzb("ExoPlayerImpl", sb2.toString());
            this.zzf = zzjvVar.zza.getApplicationContext();
            this.zzs = (zzno) zzjvVar.zzh.apply(zzjvVar.zzb);
            this.zzX = zzjvVar.zzj;
            this.zzS = zzjvVar.zzk;
            this.zzQ = zzjvVar.zzl;
            this.zzU = false;
            this.zzA = zzjvVar.zzq;
            zzkf zzkfVar = new zzkf(this, null);
            this.zzw = zzkfVar;
            this.zzx = new zzle(null);
            zznc[] zzncVarArrZza = ((zznh) zzjvVar.zzc.zza()).zza(new Handler(zzjvVar.zzi), zzkfVar, zzkfVar, zzkfVar, zzkfVar);
            this.zzh = zzncVarArrZza;
            int length = zzncVarArrZza.length;
            this.zzi = new zznc[2];
            int i5 = 0;
            while (true) {
                zznc[] zzncVarArr = this.zzi;
                int length2 = zzncVarArr.length;
                if (i5 >= 2) {
                    break;
                }
                zznc zzncVar = this.zzh[i5];
                zzncVarArr[i5] = null;
                i5++;
            }
            zzabi zzabiVar = (zzabi) zzjvVar.zze.zza();
            this.zzj = zzabiVar;
            zzabr zzabrVar = (zzabr) zzjvVar.zzg.zza();
            this.zzu = zzabrVar;
            this.zzr = zzjvVar.zzm;
            this.zzK = zzjvVar.zzn;
            this.zzJ = zzjvVar.zzo;
            Looper looper = zzjvVar.zzi;
            this.zzt = looper;
            zzdp zzdpVar = zzjvVar.zzb;
            this.zzv = zzdpVar;
            this.zzg = zzbbVar;
            this.zzn = new zzeg(looper, zzdpVar, new zzec() { // from class: com.google.android.gms.internal.ads.zzld
                @Override // com.google.android.gms.internal.ads.zzec
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzzg(0);
            this.zzL = zzjw.zza;
            int length3 = this.zzh.length;
            zzabj zzabjVar = new zzabj(new zznf[2], new zzabb[2], zzbn.zza, null);
            this.zzb = zzabjVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzabiVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzM = zzawVar2.zze();
            this.zzk = zzdpVar.zzd(looper, null);
            zzlu zzluVar = new zzlu() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzlu
                public final /* synthetic */ void zza(zzlt zzltVar) {
                    this.zza.zzK(zzltVar);
                }
            };
            this.zzl = zzluVar;
            this.zzaa = zzmu.zza(zzabjVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzqh zzqhVar = new zzqh(zzjvVar.zzx);
            zzlw zzlwVar = new zzlw(this.zzf, this.zzh, this.zzi, zzabiVar, zzabjVar, (zzma) zzjvVar.zzf.zza(), zzabrVar, 0, false, this.zzs, this.zzK, zzjvVar.zzz, zzjvVar.zzp, false, zzjvVar.zzy, looper, zzdpVar, zzluVar, zzqhVar, null, this.zzL, this.zzx);
            this.zzm = zzlwVar;
            Looper looperZzn = zzlwVar.zzn();
            this.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzN = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i10 = zzda.zza;
            this.zzV = true;
            zze(this.zzs);
            zzabrVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                final Context context = this.zzf;
                final boolean z2 = zzjvVar.zzv;
                zzdpVar.zzd(zzlwVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqd zzqdVarZza = zzqd.zza(context);
                        if (zzqdVarZza == null) {
                            zzeh.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            this.zzD(zzqdVarZza);
                        }
                        zzqhVar.zzb(zzqdVarZza.zzb());
                    }
                });
            }
            zzdn zzdnVar = new zzdn(0, looperZzn, looper, zzdpVar, new zzdm() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdnVar;
            zzdnVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjvVar.zza, looperZzn, zzjvVar.zzi, this.zzw, zzdpVar);
            boolean z10 = (zzjvVar.zzs == Integer.MAX_VALUE || zzjvVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfs zzfsVar = new zzfs(zzjvVar.zza, looperZzn, zzdpVar);
            this.zzy = zzfsVar;
            zzfsVar.zza(z10);
            this.zzz = new zzfu(zzjvVar.zza, looperZzn, zzdpVar);
            int i12 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzR = zzev.zza;
            this.zzD = i11 >= 34 ? new zzli(this, zzjvVar.zza, null) : null;
            this.zzE = new zzjz(this, 1, null);
            this.zzF = new zzjz(this, 2, null);
            this.zzC = new zzfd(this, this.zzw, zzdpVar, zzjvVar.zzr, zzjvVar.zzs, zzjvVar.zzt, zzjvVar.zzu);
            zzlwVar.zzg(this.zzJ);
            zzlwVar.zzi(this.zzS, false);
            zzau(1, 3, this.zzS);
            zzau(2, 4, Integer.valueOf(this.zzQ));
            zzau(2, 5, 0);
            zzau(1, 9, Boolean.valueOf(this.zzU));
            zzau(6, 8, this.zzx);
            zzau(-1, 16, Integer.valueOf(this.zzX));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzjm zzjmVar) {
        zzmu zzmuVar = this.zzaa;
        zzmu zzmuVarZzh = zzmuVar.zzh(zzmuVar.zzb);
        zzmuVarZzh.zzq = zzmuVarZzh.zzs;
        zzmuVarZzh.zzr = 0L;
        zzmu zzmuVarZzam = zzam(zzmuVarZzh, 1);
        if (zzjmVar != null) {
            zzmuVarZzam = zzmuVarZzam.zzf(zzjmVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzmuVarZzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmuVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzmu zzmuVar) {
        zzxl zzxlVar = zzmuVar.zzb;
        if (!zzxlVar.zzb()) {
            return zzfm.zzs(zzai(zzmuVar));
        }
        zzbf zzbfVar = zzmuVar.zza;
        zzbfVar.zzo(zzxlVar.zza, this.zzp);
        long j8 = zzmuVar.zzc;
        if (j8 == -9223372036854775807L) {
            long j10 = zzbfVar.zzb(zzag(zzmuVar), this.zza, 0L).zzl;
            return zzfm.zzs(0L);
        }
        return zzfm.zzs(j8) + zzfm.zzs(0L);
    }

    private final long zzai(zzmu zzmuVar) {
        zzbf zzbfVar = zzmuVar.zza;
        if (zzbfVar.zzg()) {
            return zzfm.zzt(this.zzac);
        }
        long j8 = zzmuVar.zzs;
        zzxl zzxlVar = zzmuVar.zzb;
        if (zzxlVar.zzb()) {
            return j8;
        }
        zzao(zzbfVar, zzxlVar, j8);
        return j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0509 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaj(final com.google.android.gms.internal.ads.zzmu r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zzaj(com.google.android.gms.internal.ads.zzmu, int, boolean, int, long, int, boolean):void");
    }

    private static long zzak(zzmu zzmuVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmuVar.zza;
        zzbfVar.zzo(zzmuVar.zzb.zza, zzbdVar);
        long j8 = zzmuVar.zzc;
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        long j10 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzmu zzal(com.google.android.gms.internal.ads.zzmu r23, com.google.android.gms.internal.ads.zzbf r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zzal(com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzbf, android.util.Pair):com.google.android.gms.internal.ads.zzmu");
    }

    private static zzmu zzam(zzmu zzmuVar, int i5) {
        zzmu zzmuVarZze = zzmuVar.zze(i5);
        return (i5 == 1 || i5 == 4) ? zzmuVarZze.zzg(false) : zzmuVarZze;
    }

    private final Pair zzan(zzbf zzbfVar, int i5, long j8) {
        if (zzbfVar.zzg()) {
            this.zzab = i5;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.zzac = j8;
            return null;
        }
        if (i5 == -1 || i5 >= zzbfVar.zza()) {
            i5 = zzbfVar.zzk(false);
            long j10 = zzbfVar.zzb(i5, this.zza, 0L).zzl;
            j8 = zzfm.zzs(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i5, zzfm.zzt(j8));
    }

    private final long zzao(zzbf zzbfVar, zzxl zzxlVar, long j8) {
        zzbfVar.zzo(zzxlVar.zza, this.zzp);
        return j8;
    }

    private final zzmy zzap(zzmx zzmxVar) {
        int iZzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzag == -1) {
            iZzag = 0;
        }
        zzdp zzdpVar = this.zzv;
        zzlw zzlwVar = this.zzm;
        return new zzmy(zzlwVar, zzmxVar, zzbfVar, iZzag, zzdpVar, zzlwVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z2 = false;
        if (obj2 != null && obj2 != obj) {
            z2 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z2 ? this.zzA : -9223372036854775807L);
        if (z2) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zZzl) {
            return;
        }
        zzP(zzjm.zzc(new zzlx(3), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i5, final int i10) {
        if (i5 == this.zzR.zza() && i10 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzev(i5, i10);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(24, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i11 = zzlj.zzd;
                ((zzaz) obj).zzu(i5, i10);
            }
        });
        zzegVar.zzf();
        zzau(2, 14, new zzev(i5, i10));
    }

    private final void zzas() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z2 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfm.zza;
            Locale locale = Locale.US;
            String strG = R8.v.g("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzV) {
                throw new IllegalStateException(strG);
            }
            zzeh.zzd("ExoPlayerImpl", strG, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i5, int i10, Object obj) {
        zznc[] zzncVarArr = this.zzh;
        int length = zzncVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            zznc zzncVar = zzncVarArr[i11];
            if (i5 == -1 || zzncVar.zza() == i5) {
                zzmy zzmyVarZzap = zzap(zzncVar);
                zzmyVarZzap.zzb(i10);
                zzmyVarZzap.zzd(obj);
                zzmyVarZzap.zzg();
            }
        }
        zznc[] zzncVarArr2 = this.zzi;
        int length2 = zzncVarArr2.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zznc zzncVar2 = zzncVarArr2[i12];
            if (zzncVar2 != null && (i5 == -1 || zzncVar2.zza() == i5)) {
                zzmy zzmyVarZzap2 = zzap(zzncVar2);
                zzmyVarZzap2.zzb(i10);
                zzmyVarZzap2.zzd(obj);
                zzmyVarZzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f10) {
        zzat();
        String str = zzfm.zza;
        final float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f10, 1.0f));
        if (this.zzT == fMax) {
            return;
        }
        this.zzT = fMax;
        this.zzm.zzj(fMax);
        zzeg zzegVar = this.zzn;
        zzegVar.zze(22, new zzeb() { // from class: com.google.android.gms.internal.ads.zzky
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i5 = zzlj.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzegVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i5 = surface == null ? 0 : -1;
        zzS(i5, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzD(zznr zznrVar) {
        this.zzs.zzv(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzE(zznr zznrVar) {
        zzat();
        this.zzs.zzw(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzG(com.google.android.gms.internal.ads.zzxn r14) {
        /*
            r13 = this;
            r13.zzat()
            java.util.List r1 = java.util.Collections.singletonList(r14)
            r13.zzat()
            r13.zzat()
            com.google.android.gms.internal.ads.zzmu r2 = r13.zzaa
            r13.zzag(r2)
            r13.zzu()
            int r2 = r13.zzG
            r3 = 1
            int r2 = r2 + r3
            r13.zzG = r2
            java.util.List r2 = r13.zzq
            r2.clear()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r10 = 0
            r4 = r10
        L27:
            int r6 = r1.size()
            if (r4 >= r6) goto L4c
            com.google.android.gms.internal.ads.zzmq r6 = new com.google.android.gms.internal.ads.zzmq
            java.lang.Object r7 = r1.get(r4)
            com.google.android.gms.internal.ads.zzxn r7 = (com.google.android.gms.internal.ads.zzxn) r7
            boolean r8 = r13.zzr
            r6.<init>(r7, r8)
            r5.add(r6)
            java.lang.Object r7 = r6.zzb
            com.google.android.gms.internal.ads.zzxg r6 = r6.zza
            com.google.android.gms.internal.ads.zzlf r8 = new com.google.android.gms.internal.ads.zzlf
            r8.<init>(r7, r6)
            r2.add(r4, r8)
            int r4 = r4 + 1
            goto L27
        L4c:
            com.google.android.gms.internal.ads.zzzg r1 = r13.zzad
            int r4 = r5.size()
            com.google.android.gms.internal.ads.zzzg r1 = r1.zzg()
            com.google.android.gms.internal.ads.zzzg r1 = r1.zzf(r10, r4)
            r13.zzad = r1
            com.google.android.gms.internal.ads.zzna r1 = new com.google.android.gms.internal.ads.zzna
            com.google.android.gms.internal.ads.zzzg r4 = r13.zzad
            r1.<init>(r2, r4)
            boolean r2 = r1.zzg()
            r4 = -1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L7c
            int r2 = r1.zza()
            if (r2 < 0) goto L76
            goto L7c
        L76:
            com.google.android.gms.internal.ads.zzw r2 = new com.google.android.gms.internal.ads.zzw
            r2.<init>(r1, r4, r6)
            throw r2
        L7c:
            int r2 = r1.zzk(r10)
            com.google.android.gms.internal.ads.zzmu r8 = r13.zzaa
            android.util.Pair r9 = r13.zzan(r1, r2, r6)
            com.google.android.gms.internal.ads.zzmu r8 = r13.zzal(r8, r1, r9)
            int r9 = r8.zze
            if (r9 != r3) goto L90
            r9 = r3
            goto La4
        L90:
            boolean r11 = r1.zzg()
            r12 = 4
            if (r11 == 0) goto L99
        L97:
            r9 = r12
            goto La4
        L99:
            if (r2 != r4) goto L9c
            goto La4
        L9c:
            int r1 = r1.zza()
            if (r2 < r1) goto La3
            goto L97
        La3:
            r9 = 2
        La4:
            com.google.android.gms.internal.ads.zzmu r1 = zzam(r8, r9)
            com.google.android.gms.internal.ads.zzlw r4 = r13.zzm
            long r7 = com.google.android.gms.internal.ads.zzfm.zzt(r6)
            com.google.android.gms.internal.ads.zzzg r9 = r13.zzad
            r6 = r2
            r4.zzy(r5, r6, r7, r9)
            com.google.android.gms.internal.ads.zzmu r2 = r13.zzaa
            com.google.android.gms.internal.ads.zzxl r2 = r2.zzb
            java.lang.Object r2 = r2.zza
            com.google.android.gms.internal.ads.zzxl r4 = r1.zzb
            java.lang.Object r4 = r4.zza
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lcf
            com.google.android.gms.internal.ads.zzmu r2 = r13.zzaa
            com.google.android.gms.internal.ads.zzbf r2 = r2.zza
            boolean r2 = r2.zzg()
            if (r2 != 0) goto Lcf
            goto Ld0
        Lcf:
            r3 = r10
        Ld0:
            long r5 = r13.zzai(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r13
            r0.zzaj(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zzG(com.google.android.gms.internal.ads.zzxn):void");
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfm.zza;
        String strZza = zzal.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        AbstractC3256n.p(sb2, "Release ", hexString, " [AndroidXMedia3/1.10.0] [", str);
        sb2.append("] [");
        sb2.append(strZza);
        sb2.append("]");
        zzeh.zzb("ExoPlayerImpl", sb2.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzli zzliVar = this.zzD;
        if (zzliVar != null && Build.VERSION.SDK_INT >= 34) {
            zzliVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzeg zzegVar = this.zzn;
            zzegVar.zze(10, zzkx.zza);
            zzegVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabr zzabrVar = this.zzu;
        zzno zznoVar = this.zzs;
        zzabrVar.zzg(zznoVar);
        zzmu zzmuVar = this.zzaa;
        boolean z2 = zzmuVar.zzp;
        zzmu zzmuVarZzam = zzam(zzmuVar, 1);
        this.zzaa = zzmuVarZzam;
        zzmu zzmuVarZzh = zzmuVarZzam.zzh(zzmuVarZzam.zzb);
        this.zzaa = zzmuVarZzh;
        zzmuVarZzh.zzq = zzmuVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zznoVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i5 = zzda.zza;
        this.zzY = true;
        if (this.zzaa.zza.zzg()) {
            return;
        }
        zzmu zzmuVar2 = this.zzaa;
        boolean z10 = zzmuVar2.zza.zze(zzmuVar2.zzb.zza) != -1;
        Locale locale = Locale.US;
        zzmu zzmuVar3 = this.zzaa;
        zzgtr.zzj(z10, String.format(locale, "periodUid %s not found in timeline %s with size %d", zzmuVar3.zzb.zza, zzmuVar3.zza.getClass().getName(), Integer.valueOf(this.zzaa.zza.zza())));
    }

    public final zzjm zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzlt zzltVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzltVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i5, final int i10) {
        zzat();
        Integer numValueOf = Integer.valueOf(i10);
        zzau(1, 10, numValueOf);
        zzau(2, 10, numValueOf);
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i11 = zzlj.zzd;
                ((zzaz) obj).zzq(i10);
            }
        };
        zzeg zzegVar = this.zzn;
        zzegVar.zze(21, zzebVar);
        zzegVar.zzf();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfm.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        zzdn zzdnVar = this.zzB;
        if (((Integer) zzdnVar.zza()).intValue() != iGenerateAudioSessionId) {
            Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
            zzdnVar.zzc(numValueOf);
            zzau(1, 10, numValueOf);
            zzau(2, 10, numValueOf);
        }
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    public final /* synthetic */ void zzO(zzlt zzltVar) {
        int i5;
        long j8;
        boolean z2;
        int i10 = this.zzG - zzltVar.zzb;
        this.zzG = i10;
        boolean z10 = true;
        if (zzltVar.zzc) {
            this.zzH = zzltVar.zzd;
            this.zzI = true;
        }
        if (i10 == 0) {
            zzbf zzbfVar = zzltVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzna) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgtr.zzi(size == list.size());
                for (int i11 = 0; i11 < listZzw.size(); i11++) {
                    ((zzlf) list.get(i11)).zzc((zzbf) listZzw.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.zzI) {
                boolean z11 = zzltVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzltVar.zza.zzb.equals(this.zzaa.zzb);
                long j11 = zzltVar.zza.zzd;
                long j12 = this.zzaa.zzs;
                if (z11 || (zEquals && j11 == j12)) {
                    z10 = false;
                }
                if (z10) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzltVar.zza.zzb.zzb()) {
                        j10 = zzltVar.zza.zzd;
                    } else {
                        zzmu zzmuVar = zzltVar.zza;
                        zzxl zzxlVar = zzmuVar.zzb;
                        long j13 = zzmuVar.zzd;
                        zzao(zzbfVar, zzxlVar, j13);
                        j10 = j13;
                    }
                }
                z2 = z10;
                long j14 = j10;
                i5 = iZzs;
                j8 = j14;
            } else {
                i5 = -1;
                j8 = -9223372036854775807L;
                z2 = false;
            }
            this.zzI = false;
            zzaj(zzltVar.zza, 1, z2, this.zzH, j8, i5, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    public final /* synthetic */ void zzT(int i5, int i10, Object obj) {
        zzau(1, 19, obj);
    }

    public final /* synthetic */ zzeg zzU() {
        return this.zzn;
    }

    public final /* synthetic */ zzno zzV() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    public final /* synthetic */ zzdp zzX() {
        return this.zzv;
    }

    public final /* synthetic */ zzdn zzY() {
        return this.zzB;
    }

    public final /* synthetic */ zzjz zzZ() {
        return this.zzE;
    }

    public final /* synthetic */ zzjz zzaa() {
        return this.zzF;
    }

    public final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    public final /* synthetic */ void zzad(boolean z2) {
        this.zzU = z2;
    }

    public final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i5, long j8, int i10, boolean z2) {
        zzat();
        if (i5 == -1) {
            return;
        }
        zzgtr.zza(i5 >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i5 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzeh.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlt zzltVar = new zzlt(this.zzaa);
                zzltVar.zza(1);
                this.zzl.zza(zzltVar);
                return;
            }
            zzmu zzmuVarZzam = this.zzaa;
            int i11 = zzmuVarZzam.zze;
            if (i11 == 3 || (i11 == 4 && !zzbfVar.zzg())) {
                zzmuVarZzam = zzam(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmu zzmuVarZzal = zzal(zzmuVarZzam, zzbfVar, zzan(zzbfVar, i5, j8));
            this.zzm.zzf(zzbfVar, i5, zzfm.zzt(j8));
            zzaj(zzmuVarZzal, 0, true, 1, zzai(zzmuVarZzal), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzmu zzmuVar = this.zzaa;
        if (zzmuVar.zze != 1) {
            return;
        }
        zzmu zzmuVarZzf = zzmuVar.zzf(null);
        zzmu zzmuVarZzam = zzam(zzmuVarZzf, true != zzmuVarZzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzmuVarZzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z2) {
        zzat();
        zzmu zzmuVar = this.zzaa;
        int i5 = zzmuVar.zzn;
        int i10 = 0;
        if (i5 == 1) {
            if (z2) {
                i5 = 1;
            } else {
                i5 = 1;
                i10 = 1;
            }
        }
        if (zzmuVar.zzl == z2 && i5 == i10 && zzmuVar.zzm == 1) {
            return;
        }
        this.zzG++;
        zzmu zzmuVarZzi = zzmuVar.zzi(z2, 1, i10);
        this.zzm.zze(z2, 1, i10);
        zzaj(zzmuVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzda(zzgwt.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzmu zzmuVar = this.zzaa;
            return zzmuVar.zza.zze(zzmuVar.zzb.zza);
        }
        int i5 = this.zzab;
        if (i5 == -1) {
            return 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int iZzag = zzag(this.zzaa);
        if (iZzag == -1) {
            return 0;
        }
        return iZzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfm.zzs(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmu zzmuVar = this.zzaa;
        zzxl zzxlVar = zzmuVar.zzb;
        zzbf zzbfVar = zzmuVar.zza;
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfm.zzs(zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfm.zzs(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzmu zzmuVar = this.zzaa;
            return zzmuVar.zzk.equals(zzmuVar.zzb) ? zzfm.zzs(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmu zzmuVar2 = this.zzaa;
        long j8 = 0;
        if (zzmuVar2.zzk.zzd != zzmuVar2.zzb.zzd) {
            return zzfm.zzs(zzmuVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j10 = zzmuVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmu zzmuVar3 = this.zzaa;
            zzmuVar3.zza.zzo(zzmuVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j8 = j10;
        }
        zzmu zzmuVar4 = this.zzaa;
        zzao(zzmuVar4.zza, zzmuVar4.zzk, j8);
        return zzfm.zzs(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfm.zzs(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
