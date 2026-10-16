package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzgfx implements zzgfs, zzgfo, zzggd {
    private static final zziib zza;
    private final Context zzb;
    private final zzgew zzc;
    private final ExecutorService zzd;
    private final zzgep zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzaww zzq = zzawx.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();
    private final int zzu;

    static {
        zziia zziiaVarZzc = zziib.zzc();
        zziiaVarZzc.zza(17);
        zza = (zziib) zziiaVarZzc.zzbu();
    }

    public zzgfx(Context context, zzgew zzgewVar, ExecutorService executorService, zzgep zzgepVar, Random random, String str, long j8, long j10, double d3, String str2, int i5, long j11) {
        this.zzb = context;
        this.zzc = zzgewVar;
        this.zzd = executorService;
        this.zze = zzgepVar;
        this.zzg = str;
        this.zzh = j8;
        this.zzi = j10;
        this.zzj = d3;
        this.zzk = str2;
        this.zzu = i5;
        this.zzl = j11;
        this.zzf = random.nextDouble() < d3;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final p8.p zza() {
        return zzhcf.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final void zzb(int i5, long j8, Throwable th, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i5);
                            Long l10 = (Long) map.get(numValueOf);
                            if (l10 == null) {
                                l10 = 0L;
                            }
                            jLongValue = 1 + l10.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    list.add(new zzgfu(i5, j8, th, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IOException {
                                this.zza.zze();
                            }
                        }, this.zzi);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final void zzc(zzggc zzggcVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzggcVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggd
    public final void zzd(List list) {
        synchronized (this.zzn) {
            this.zzq.zzm(list);
        }
    }

    public final void zze() throws IOException {
        zzaww zzawwVar;
        zzgwt zzgwtVarZzq;
        String string;
        synchronized (this.zzn) {
            zzawwVar = (zzaww) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgwtVarZzq = zzgwt.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgwtVarZzq.size();
        int i5 = 0;
        int i10 = 0;
        while (i5 < size) {
            zzgfu zzgfuVar = (zzgfu) zzgwtVarZzq.get(i5);
            if (i10 >= this.zzh) {
                zzf((zzawx) zzawwVar.zzbu());
                zzawwVar.zzb();
                i10 = 0;
            }
            zzaxo zzaxoVarZza = zzaxp.zza();
            zzaxoVarZza.zza(zzgfuVar.zza);
            zzaxoVarZza.zzb(zzgfuVar.zzb);
            zzaxoVarZza.zze(zzgfuVar.zze);
            String str = zzgfuVar.zzd;
            if (str != null) {
                zzaxoVarZza.zzf(str);
            }
            Throwable th = zzgfuVar.zzc;
            zzaxoVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzaxoVarZza.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                zzaxoVarZza.zzd(string);
            }
            zzawwVar.zza((zzaxp) zzaxoVarZza.zzbu());
            i5++;
            i10++;
        }
        if (i10 > 0) {
            zzf((zzawx) zzawwVar.zzbu());
            zzawwVar.zzb();
        }
    }

    public final void zzf(zzawx zzawxVar) {
        try {
            zzbdw zzbdwVarZza = zzbdx.zza();
            zzbdwVarZza.zzb(zza);
            zzbdu zzbduVarZza = zzbdv.zza();
            zzbduVarZza.zza(zzawxVar);
            zzbdwVarZza.zza((zzbdv) zzbduVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzbdx) zzbdwVarZza.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzg() {
        int i5;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        int i10 = this.zzu;
        double d3 = this.zzj;
        long j8 = this.zzl;
        Locale locale = Locale.getDefault();
        int iZzb = zzbec.zzb(zzgdp.zza(i10));
        zzaww zzawwVarZza = zzawx.zza();
        zzawwVarZza.zzc(Build.VERSION.SDK_INT);
        zzawwVarZza.zzd(Build.MODEL);
        zzawwVarZza.zze(locale.getLanguage());
        zzawwVarZza.zzf(locale.getCountry());
        zzawwVarZza.zzi(str);
        zzawwVarZza.zzo(iZzb);
        zzawwVarZza.zzp(3);
        zzawwVarZza.zzg(context.getPackageName());
        zzawwVarZza.zzl(j8);
        if (d3 > 0.0d) {
            zzawwVarZza.zzk((int) (1.0d / d3));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzawwVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i5 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i5 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i5 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i5 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzawwVarZza.zzn(i5);
        } catch (RuntimeException unused2) {
        }
        zzawx zzawxVar = (zzawx) zzawwVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzawxVar);
        }
    }
}
