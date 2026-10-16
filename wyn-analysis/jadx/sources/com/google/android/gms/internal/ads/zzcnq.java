package com.google.android.gms.internal.ads;

import D6.C0395s;
import U8.v0;
import android.content.Context;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class zzcnq implements zzcrx {
    private static zzcnq zza;

    /* JADX WARN: Multi-variable type inference failed */
    private static synchronized zzcnq zzH(Context context, zzbvj zzbvjVar, int i5, boolean z2, int i10, zzcpa zzcpaVar) {
        try {
            zzcnq zzcnqVar = zza;
            if (zzcnqVar != null) {
                return zzcnqVar;
            }
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbix.zza(context);
            if (((Boolean) zzbkp.zze.zze()).booleanValue()) {
                zzbii.zza(context);
            }
            zzfmc zzfmcVarZza = zzfmc.zza(context);
            int i11 = 0;
            H6.a aVarZzb = zzfmcVarZza.zzb(261710000, false, i10);
            zzfmcVarZza.zzc(zzbvjVar);
            byte[] bArr = null;
            zzcpp zzcppVar = new zzcpp(bArr);
            zzcnr zzcnrVar = new zzcnr();
            zzcnrVar.zza(aVarZzb);
            zzcnrVar.zzb(context);
            zzcnrVar.zzc(jCurrentTimeMillis);
            zzcppVar.zza(new zzcns(zzcnrVar, null));
            zzcppVar.zzb(new zzcqm(zzcpaVar));
            zzcnq zzcnqVarZzc = zzcppVar.zzc();
            zzbio zzbioVar = zzbix.zzpw;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                nVar.f1865e.zza(zzfoi.zzc(), zzcnqVarZzc.zzD(), context);
                nVar.f1865e.zzb();
            }
            ((zzeej) ((zzcpe) zzcnqVarZzc).zzs.zzb()).zza();
            ((zzcnj) ((zzcpe) zzcnqVarZzc).zzr.zzb()).zza(context, aVarZzb);
            nVar.f1868h.zzf(context, aVarZzb, zzcnqVarZzc.zzD());
            nVar.f1870j.zza(context);
            nVar.f1863c.C(context);
            nVar.f1863c.D(context);
            v0.q0(context);
            nVar.f1867g.zza(context);
            nVar.f1858A.b(context);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpS)).booleanValue()) {
                String str = (String) c0395s.f2492c.zzd(zzbix.zzpT);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcnqVarZzc.zzE().zza(nVar.f1867g);
                    }
                }
            } else {
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpR)).booleanValue()) {
                    zzcnqVarZzc.zzE().zza(nVar.f1867g);
                }
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzqc)).booleanValue()) {
                M6.d dVar = (M6.d) ((zzcpe) zzcnqVarZzc).zzm.zzb();
                AtomicBoolean atomicBoolean = dVar.f7524b;
                if (!atomicBoolean.get()) {
                    int i12 = dVar.f7523a.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0).getInt("advertised_memory_tier", 0);
                    M6.a[] aVarArrValues = M6.a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        M6.a aVar = aVarArrValues[i11];
                        if (aVar.f7516a == i12) {
                            bArr = aVar;
                            break;
                        }
                        i11++;
                    }
                    if (bArr != null) {
                        dVar.f7525c.set(bArr);
                    }
                    atomicBoolean.set(true);
                }
            }
            ((G6.G) ((zzcpe) zzcnqVarZzc).zzay.zzb()).a();
            zzceh.zzb(context);
            nVar.f1885z.zza(zzcnqVarZzc.zzD());
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzhn)).booleanValue()) {
                if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzbn)).booleanValue()) {
                    new zzekc(context, aVarZzb, new zzbhw(new zzbib(context)), new zzejh(new zzejd(context), (zzhcp) ((zzcpe) zzcnqVarZzc).zzd.zzb())).zza(((G6.O) nVar.f1868h.zzp()).D());
                }
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpL)).booleanValue()) {
                zzcnqVarZzc.zzg().zza();
            }
            zza = zzcnqVarZzc;
            return zzcnqVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcnq zza(Context context, zzbvj zzbvjVar, int i5) {
        return zzH(context, zzbvjVar, 261710000, false, i5, new zzcpa());
    }

    public abstract zzebk zzA();

    public abstract zzflw zzB();

    public abstract zzedw zzC();

    public abstract zzdzt zzD();

    public abstract zzdxc zzE();

    @Override // com.google.android.gms.internal.ads.zzcrx
    public final zzcfa zzF() {
        return zzG();
    }

    public abstract zzcfa zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdga zzd();

    public abstract zzcqy zze();

    public abstract zzftl zzf();

    public abstract zzeho zzg();

    public abstract zzehq zzh();

    public abstract zzcww zzi();

    public abstract zzfhc zzj();

    public abstract zzcvf zzk();

    public abstract zzffo zzl();

    public abstract zzdnn zzm();

    public abstract zzfis zzn();

    public abstract zzdoj zzo();

    public abstract zzdvy zzp();

    public abstract zzfkg zzq();

    public abstract N6.F zzr();

    public abstract N6.j zzs();

    public abstract N6.C zzt();

    public abstract zzekz zzu();

    public abstract zzfmf zzv();

    public abstract zzecz zzw();

    public abstract zzfqt zzx();

    @Override // com.google.android.gms.internal.ads.zzcrx
    public final zzfdu zzy(zzcbk zzcbkVar, int i5) {
        return zzz(new zzfex(zzcbkVar, i5));
    }

    public abstract zzfdu zzz(zzfex zzfexVar);
}
