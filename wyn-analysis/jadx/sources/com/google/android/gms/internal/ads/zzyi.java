package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzyi implements zzacb, zzxa {
    final /* synthetic */ zzyr zza;
    private final long zzb;
    private final Uri zzc;
    private final zzio zzd;
    private final zzye zze;
    private final zzagd zzf;
    private final zzdt zzg;
    private final zzaha zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhv zzl;
    private zzahm zzm;
    private boolean zzn;

    public zzyi(zzyr zzyrVar, Uri uri, zzhr zzhrVar, zzye zzyeVar, zzagd zzagdVar, zzdt zzdtVar) {
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
        this.zzc = uri;
        this.zzd = new zzio(zzhrVar);
        this.zze = zzyeVar;
        this.zzf = zzagdVar;
        this.zzg = zzdtVar;
        this.zzh = new zzaha();
        this.zzj = true;
        this.zzb = zzxc.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhv zzi(long j8, String str) {
        Map mapZzd = zzyr.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgwv zzgwvVar = new zzgwv();
            zzgwvVar.zzb(mapZzd.entrySet());
            zzgwvVar.zza("If-Range", str);
            mapZzd = zzgwvVar.zzd();
        }
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(this.zzc);
        zzhuVar.zzc(j8);
        zzhuVar.zzd(6);
        zzhuVar.zzb(mapZzd);
        return zzhuVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zza(zzeu zzeuVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzeuVar.zzd();
        zzahm zzahmVar = this.zzm;
        zzahmVar.getClass();
        zzahmVar.zzc(zzeuVar, iZzd);
        zzahmVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e A[EDGE_INSN: B:140:0x020e->B:99:0x020e BREAK  A[LOOP:1: B:86:0x01d5->B:143:0x01d5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0 A[Catch: all -> 0x00b2, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #3 {all -> 0x00b2, blocks: (B:28:0x0080, B:29:0x0086, B:39:0x00c5, B:41:0x00cf, B:43:0x00dc, B:45:0x00e6, B:47:0x00f3, B:49:0x00fd, B:51:0x010a, B:53:0x0114, B:55:0x0127, B:57:0x0131, B:58:0x0138, B:66:0x0171, B:68:0x017a, B:70:0x0187, B:72:0x0190, B:74:0x01ab, B:76:0x01c0, B:77:0x01c3, B:79:0x01c7, B:61:0x0142, B:64:0x0162, B:33:0x0092, B:38:0x00b7), top: B:122:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    @Override // com.google.android.gms.internal.ads.zzacb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyi.zzc():void");
    }

    public final /* synthetic */ void zzd(long j8, long j10) {
        this.zzh.zza = j8;
        this.zzk = j10;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzio zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhv zzh() {
        return this.zzl;
    }
}
