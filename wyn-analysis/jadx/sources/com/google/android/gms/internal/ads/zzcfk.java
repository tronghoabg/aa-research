package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n7.AbstractC3598c;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzcfk {
    private final Object zza = new Object();
    private final G6.O zzb;
    private final zzcfp zzc;
    private boolean zzd;
    private Context zze;
    private H6.a zzf;
    private String zzg;
    private zzbjc zzh;
    private zzdzt zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcfj zzm;
    private final Object zzn;
    private p8.p zzo;
    private final AtomicBoolean zzp;
    private final AtomicBoolean zzq;

    public zzcfk() {
        G6.O o7 = new G6.O();
        this.zzb = o7;
        this.zzc = new zzcfp(C0392q.f2477g.f2483f, o7);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcfj(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
        this.zzq = new AtomicBoolean(false);
    }

    public final /* synthetic */ Context zzA() {
        return this.zze;
    }

    public final /* synthetic */ H6.a zzB() {
        return this.zzf;
    }

    public final /* synthetic */ zzbjc zzC() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzD() {
        return this.zzp;
    }

    public final zzbjc zza() {
        zzbjc zzbjcVar;
        synchronized (this.zza) {
            zzbjcVar = this.zzh;
        }
        return zzbjcVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final boolean zze(boolean z2) {
        return this.zzq.getAndSet(true);
    }

    public final void zzf(Context context, H6.a aVar, zzdzt zzdztVar) {
        zzbjc zzbjcVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = aVar;
                    C6.n.f1857D.f1867g.zzb(this.zzc);
                    this.zzb.n(this.zze);
                    zzcaf.zzb(this.zze, this.zzf);
                    this.zzi = zzdztVar;
                    zzbio zzbioVar = zzbix.zzcN;
                    C0395s c0395s = C0395s.f2489e;
                    if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                        zzbjcVar = new zzbjc();
                    } else {
                        G6.L.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbjcVar = null;
                    }
                    this.zzh = zzbjcVar;
                    if (zzbjcVar != null) {
                        zzcgb.zza(new zzcfg(this).zzb(), "AppState.registerCsiReporter", zzcfy.zzh);
                    }
                    Context context2 = this.zze;
                    if (AbstractC3598c.h()) {
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjN)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcfh(this));
                            } catch (RuntimeException e7) {
                                int i5 = G6.L.f4523b;
                                H6.l.g("Failed to register network callback", e7);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzr();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpD)).booleanValue()) {
            return;
        }
        C6.n.f1857D.f1863c.E(context, aVar.f4927a);
    }

    public final Resources zzg() {
        if (this.zzf.f4930d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmz)).booleanValue()) {
                return tg.b.X(this.zze).f44536a.getResources();
            }
            tg.b.X(this.zze).f44536a.getResources();
            return null;
        } catch (H6.n e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Cannot load resource from dynamite apk or local jar", e7);
            return null;
        }
    }

    public final void zzh(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzi(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzblg.zzf.zze()).floatValue());
    }

    public final void zzj(Throwable th, String str) {
        zzcaf.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzk() {
        this.zzk.incrementAndGet();
    }

    public final void zzl() {
        this.zzk.decrementAndGet();
    }

    public final int zzm() {
        return this.zzk.get();
    }

    public final void zzn() {
        this.zzl.incrementAndGet();
    }

    public final int zzo() {
        return this.zzl.get();
    }

    public final G6.N zzp() {
        G6.O o7;
        synchronized (this.zza) {
            o7 = this.zzb;
        }
        return o7;
    }

    public final Context zzq() {
        return this.zze;
    }

    public final p8.p zzr() {
        if (this.zze != null) {
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdV)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        p8.p pVar = this.zzo;
                        if (pVar != null) {
                            return pVar;
                        }
                        p8.p pVarZzc = zzcfy.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzcfi
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzy();
                            }
                        });
                        this.zzo = pVarZzc;
                        return pVarZzc;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzhcf.zza(new ArrayList());
    }

    public final zzcfp zzs() {
        return this.zzc;
    }

    public final boolean zzt(Context context) {
        if (AbstractC3598c.h()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjN)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzu(String str) {
        this.zzg = str;
    }

    public final String zzv() {
        return this.zzg;
    }

    public final zzdzt zzw() {
        return this.zzi;
    }

    public final ActivityManager.MemoryInfo zzx() {
        return H6.f.i(this.zze);
    }

    public final /* synthetic */ ArrayList zzy() {
        Context contextZza = zzcbu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoC = C3773c.a(contextZza).c(4096, contextZza.getApplicationInfo().packageName);
            if (packageInfoC.requestedPermissions != null && packageInfoC.requestedPermissionsFlags != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr = packageInfoC.requestedPermissions;
                    if (i5 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoC.requestedPermissionsFlags[i5] & 2) != 0) {
                        arrayList.add(strArr[i5]);
                    }
                    i5++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzz() {
        return this.zza;
    }
}
