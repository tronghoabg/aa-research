package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbcn extends zzbdm {
    private static final zzbdn zzh = new zzbdn();
    private final zzaxm zzi;
    private final Context zzj;
    private final zzazt zzk;

    public zzbcn(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, Context context, zzaxf zzaxfVar, zzaxm zzaxmVar, zzazt zzaztVar) {
        super(zzbbzVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxtVar, i5, 27);
        this.zzj = context;
        this.zzi = zzaxmVar;
        this.zzk = zzaztVar;
    }

    private final zzazq zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        zzbio zzbioVar = zzbix.zzdJ;
        C0395s c0395s = C0395s.f2489e;
        int iZzb = (((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue() <= 0 || ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        zzazq zzazqVar = new zzazq((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzazt zzaztVar = this.zzk;
        if (zzaztVar == null || zzaztVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzaztVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzazqVar.zza = str;
        return zzazqVar;
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            zzbbz zzbbzVar = this.zza;
            if (zzbbzVar.zzm() != null) {
                zzbbzVar.zzm().get();
            }
            zzayt zzaytVarZzl = zzbbzVar.zzl();
            if (zzaytVarZzl == null || !zzaytVarZzl.zza()) {
                return null;
            }
            return zzaytVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i5;
        zzazq zzazqVarZzc;
        zzazq zzazqVar;
        zzbdn zzbdnVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzbdnVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzazq zzazqVar2 = (zzazq) atomicReferenceZza.get();
                if (zzazqVar2 == null || zzbcc.zzc(zzazqVar2.zza) || zzazqVar2.zza.equals("E") || zzazqVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzbcc.zzc(null)) {
                        zzbcc.zzc(null);
                        i5 = 3;
                    } else {
                        i5 = 5;
                    }
                    if (this.zzk != null) {
                        zzazqVarZzc = zzc();
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(i5 == 3 && !this.zzi.zza());
                        zzbio zzbioVar = zzbix.zzdv;
                        C0395s c0395s = C0395s.f2489e;
                        Boolean bool = (Boolean) c0395s.f2492c.zzd(zzbioVar);
                        String strZzb = ((Boolean) c0395s.f2492c.zzd(zzbix.zzdu)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzbcc.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzazq zzazqVar3 = new zzazq((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        String str = zzazqVar3.zza;
                        if (zzbcc.zzc(str) || str.equals("E")) {
                            int i10 = i5 - 1;
                            if (i10 == 3) {
                                String strZzd = zzd();
                                if (!zzbcc.zzc(strZzd)) {
                                    zzazqVar3.zza = strZzd;
                                }
                            } else if (i10 == 4) {
                                throw null;
                            }
                        }
                        zzazqVarZzc = zzazqVar3;
                    }
                    atomicReferenceZza.set(zzazqVarZzc);
                }
                zzazqVar = (zzazq) atomicReferenceZza.get();
            } finally {
            }
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            if (zzazqVar != null) {
                try {
                    zzaxtVar.zzo(zzazqVar.zza);
                    zzaxtVar.zzu(zzazqVar.zzb);
                    zzaxtVar.zzt(zzazqVar.zzc);
                    zzaxtVar.zzD(zzazqVar.zzd);
                    zzaxtVar.zzE(zzazqVar.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            zzbio zzbioVar = zzbix.zzdw;
            C0395s c0395s = C0395s.f2489e;
            byte[] bArrZzb = zzbcc.zzb((String) c0395s.f2492c.zzd(zzbioVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbcc.zzb((String) c0395s.f2492c.zzd(zzbix.zzdx)))));
            }
            Context context = this.zzj;
            return zzbdp.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
