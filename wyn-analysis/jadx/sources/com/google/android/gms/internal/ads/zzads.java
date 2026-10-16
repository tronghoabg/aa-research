package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class zzads implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaew zze;
    private final zzdp zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadx zzi;
    private zzfi zzj = new zzfi(10);
    private zzv zzk;
    private zzea zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzads(zzadk zzadkVar, byte[] bArr) {
        this.zza = zzadkVar.zze();
        zzbs zzbsVarZzg = zzadkVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgwt.zzi();
        this.zzd = zzadkVar.zzh();
        zzdp zzdpVarZzi = zzadkVar.zzi();
        this.zzf = zzdpVarZzi;
        this.zzh = -zzadkVar.zzj();
        zzadx zzadxVarZzk = zzadkVar.zzk();
        this.zzi = zzadxVarZzk;
        this.zze = new zzacx(zzadkVar.zzf(), zzadxVarZzk, zzdpVarZzi);
        new zzadj(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzP();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j8) {
        this.zzq = j8;
    }

    public final void zza(int i5) {
        this.zzr = 1;
    }

    public final zzaew zzb(int i5) {
        SparseArray sparseArray = this.zzc;
        if (zzfm.zza(sparseArray, 0)) {
            return (zzaew) sparseArray.get(0);
        }
        zzadm zzadmVar = new zzadm(this, this.zza, 0);
        this.zzg.add(zzadmVar);
        sparseArray.put(0, zzadmVar);
        return zzadmVar;
    }

    public final void zzc(Surface surface, zzev zzevVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) this.zzm.second).equals(zzevVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzevVar);
        zzevVar.zza();
        zzevVar.zzb();
    }

    public final void zzd() {
        zzev zzevVar = zzev.zza;
        zzevVar.zza();
        zzevVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzea zzeaVar = this.zzl;
        if (zzeaVar != null) {
            zzeaVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: zzdx -> 0x0033, TRY_LEAVE, TryCatch #0 {zzdx -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0067), top: B:38:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r12, int r13) throws com.google.android.gms.internal.ads.zzaev {
        /*
            r11 = this;
            java.lang.String r13 = "Color transfer "
            int r0 = r11.zzo
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzgtr.zzi(r0)
            com.google.android.gms.internal.ads.zzi r0 = r12.zzF
            com.google.android.gms.internal.ads.zzi r0 = zzC(r0)
            int r1 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r2 = 7
            if (r1 != r2) goto L36
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r3 = 34
            if (r1 >= r3) goto L23
            boolean r1 = com.google.android.gms.internal.ads.zzdy.zzd()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            if (r1 != 0) goto L25
        L23:
            r1 = r2
            goto L36
        L25:
            com.google.android.gms.internal.ads.zzh r13 = r0.zzd()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r0 = 6
            r13.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzi r0 = r13.zzg()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
        L31:
            r3 = r0
            goto L6a
        L33:
            r0 = move-exception
            r13 = r0
            goto L98
        L36:
            boolean r2 = com.google.android.gms.internal.ads.zzdy.zzc(r1)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            if (r2 != 0) goto L60
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r3 = 29
            if (r2 >= r3) goto L43
            goto L60
        L43:
            java.lang.String r0 = "PlaybackVidGraphWrapper"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfm.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.util.Locale r2 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r2.<init>(r13)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            r2.append(r1)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.String r13 = " is not supported. Falling back to OpenGl tone mapping."
            r2.append(r13)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            java.lang.String r13 = r2.toString()     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzeh.zzc(r0, r13)     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            com.google.android.gms.internal.ads.zzi r0 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            goto L31
        L60:
            r13 = 2
            if (r1 == r13) goto L67
            r13 = 10
            if (r1 != r13) goto L31
        L67:
            com.google.android.gms.internal.ads.zzi r0 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdx -> L33
            goto L31
        L6a:
            com.google.android.gms.internal.ads.zzdp r13 = r11.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r10 = 0
            com.google.android.gms.internal.ads.zzea r13 = r13.zzd(r0, r10)
            r11.zzl = r13
            com.google.android.gms.internal.ads.zzbs r1 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            android.content.Context r2 = r11.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            com.google.android.gms.internal.ads.zzl r4 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            j$.util.Objects.requireNonNull(r13)     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            com.google.android.gms.internal.ads.zzadl r6 = new com.google.android.gms.internal.ads.zzadl     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            r7 = 0
            r9 = 0
            r5 = r11
            r1.zza(r2, r3, r4, r5, r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            throw r10     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
        L90:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.internal.ads.zzaev r0 = new com.google.android.gms.internal.ads.zzaev
            r0.<init>(r13, r12)
            throw r0
        L98:
            com.google.android.gms.internal.ads.zzaev r0 = new com.google.android.gms.internal.ads.zzaev
            r0.<init>(r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzads.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z2) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j8, long j10) throws zzaev {
        this.zze.zzv(j8, j10);
    }

    public final /* synthetic */ void zzm(boolean z2) {
        if (this.zzo == 1) {
            this.zzn++;
            zzaew zzaewVar = this.zze;
            zzaewVar.zzg(z2);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzadr zzadrVar = (zzadr) this.zzj.zzd();
                zzadrVar.getClass();
                zzaewVar.zzs(1, this.zzk, zzadrVar.zza, zzadrVar.zzb, zzgwt.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z2) {
                this.zzq = -9223372036854775807L;
            }
            zzea zzeaVar = this.zzl;
            zzeaVar.getClass();
            zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z2) {
        this.zze.zzw(z2);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzadt zzadtVar) {
        this.zze.zzl(zzadtVar);
    }

    public final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    public final /* synthetic */ void zzr(int i5) {
        this.zze.zzr(i5);
    }

    public final /* synthetic */ boolean zzs() {
        int i5 = this.zzr;
        return i5 != -1 && i5 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzadx zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzfi zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzfi zzfiVar) {
        this.zzj = zzfiVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
