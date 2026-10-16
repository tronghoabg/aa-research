package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfqt implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final H6.a zzf;
    private int zzi;
    private final zzdxh zzj;
    private final List zzk;
    private final zzcnn zzl;
    private final zzcbs zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfqx zzg = zzfra.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfqt(Context context, H6.a aVar, zzdxh zzdxhVar, zzeiv zzeivVar, zzcbs zzcbsVar, zzcnn zzcnnVar) {
        this.zze = context;
        this.zzf = aVar;
        this.zzj = zzdxhVar;
        this.zzn = zzcbsVar;
        this.zzl = zzcnnVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkk)).booleanValue()) {
            this.zzk = U.H();
        } else {
            this.zzk = zzgwt.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbkq.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbkq.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfqx zzfqxVar = this.zzg;
                            bArrZzaN = ((zzfra) zzfqxVar.zzbu()).zzaN();
                            zzfqxVar.zzc();
                        }
                        new zzeiu(this.zze, this.zzf.f4927a, this.zzn, Binder.getCallingUid(), null).zza(new zzeis((String) C0395s.f2489e.f2492c.zzd(zzbix.zzke), 60000, new HashMap(), bArrZzaN, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e7) {
                        if ((e7 instanceof zzeel) && ((zzeel) e7).zza() == 3) {
                            return;
                        }
                        C6.n.f1857D.f1868h.zzi(e7, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfqj zzfqjVar) {
        zzcfy.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfqjVar);
            }
        });
    }

    public final void zzc(zzfqj zzfqjVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            U u10 = C6.n.f1857D.f1863c;
                            this.zzh = U.M(this.zze);
                        } catch (RemoteException | RuntimeException e7) {
                            C6.n.f1857D.f1868h.zzh(e7, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        d7.f fVar = d7.f.f34129b;
                        Context context = this.zze;
                        fVar.getClass();
                        this.zzi = d7.f.a(context);
                        zzbio zzbioVar = zzbix.zzkf;
                        C0395s c0395s = C0395s.f2489e;
                        int iIntValue = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zznB)).booleanValue()) {
                            long j8 = iIntValue;
                            zzcfy.zzd.scheduleWithFixedDelay(this, j8, j8, TimeUnit.MILLISECONDS);
                        } else {
                            long j10 = iIntValue;
                            zzcfy.zzd.scheduleAtFixedRate(this, j10, j10, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkl)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfqjVar != null) {
            synchronized (zzc) {
                try {
                    zzfqx zzfqxVar = this.zzg;
                    int iZza = zzfqxVar.zza();
                    zzbio zzbioVar2 = zzbix.zzkg;
                    C0395s c0395s2 = C0395s.f2489e;
                    if (iZza >= ((Integer) c0395s2.f2492c.zzd(zzbioVar2)).intValue()) {
                        return;
                    }
                    zzfqu zzfquVarZza = zzfqw.zza();
                    zzfquVarZza.zzv(zzfqjVar.zzm());
                    zzfquVarZza.zza(zzfqjVar.zzb());
                    zzfquVarZza.zzb(zzfqjVar.zza());
                    zzfquVarZza.zzw(3);
                    zzfquVarZza.zzd(this.zzf.f4927a);
                    zzfquVarZza.zze(this.zzh);
                    zzfquVarZza.zzf(Build.VERSION.RELEASE);
                    zzfquVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfquVarZza.zzx(zzfqjVar.zzo());
                    zzfquVarZza.zzi(zzfqjVar.zzc());
                    zzfquVarZza.zzj(this.zzi);
                    zzfquVarZza.zzy(zzfqjVar.zzn());
                    zzfquVarZza.zzk(zzfqjVar.zzd());
                    zzfquVarZza.zzl(zzfqjVar.zze());
                    zzfquVarZza.zzm(zzfqjVar.zzf());
                    zzfquVarZza.zzn(this.zzj.zzd(zzfqjVar.zzf()));
                    zzfquVarZza.zzo(zzfqjVar.zzg());
                    zzfquVarZza.zzs(zzfqjVar.zzh());
                    zzfquVarZza.zzr(zzfqjVar.zzk());
                    zzfquVarZza.zzp(zzfqjVar.zzi());
                    zzfquVarZza.zzq(zzfqjVar.zzj());
                    zzfquVarZza.zzc(zzfqjVar.zzl());
                    if (((Boolean) c0395s2.f2492c.zzd(zzbix.zzkk)).booleanValue()) {
                        zzfquVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) c0395s2.f2492c.zzd(zzbix.zzkl)).booleanValue()) {
                        zzcnn zzcnnVar = this.zzl;
                        zziid zziidVarZzd = zzcnnVar.zzd();
                        String strZzc = zzcnnVar.zzc();
                        if (zziidVarZzd != null) {
                            zzfquVarZza.zzt(zziidVarZzd);
                        }
                        if (strZzc != null) {
                            zzfquVarZza.zzu(strZzc);
                        }
                    }
                    zzfqy zzfqyVarZza = zzfqz.zza();
                    zzfqyVarZza.zza(zzfquVarZza);
                    zzfqxVar.zzb(zzfqyVarZza);
                } finally {
                }
            }
        }
    }
}
