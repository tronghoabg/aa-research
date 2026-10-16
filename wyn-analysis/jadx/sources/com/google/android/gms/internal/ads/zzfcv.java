package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfcv {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfqq zzd;

    public zzfcv(Context context, Executor executor, Set set, zzfqq zzfqqVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfqqVar;
    }

    public final p8.p zza(final Object obj, final Bundle bundle) {
        zzfqg zzfqgVarA = u.a(this.zza, 8);
        zzfqgVarA.zza();
        Set<zzfcs> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbio zzbioVar = zzbix.zznt;
        C0395s c0395s = C0395s.f2489e;
        boolean zIsEmpty = ((String) c0395s.f2492c.zzd(zzbioVar)).isEmpty();
        zzbiv zzbivVar = c0395s.f2492c;
        if (!zIsEmpty) {
            arrayList2 = Arrays.asList(((String) zzbivVar.zzd(zzbioVar)).split(","));
        }
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbivVar.zzd(zzbix.zzcS)).booleanValue() && bundle != null) {
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdzc.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdzc.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzfcs zzfcsVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfcsVar.zzb()))) {
                C6.n.f1857D.k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                p8.p pVarZza = zzfcsVar.zza();
                pVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6.n.f1857D.k.getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        boolean zBooleanValue = ((Boolean) zzbkz.zza.zze()).booleanValue();
                        Bundle bundle3 = bundle2;
                        zzfcs zzfcsVar2 = zzfcsVar;
                        if (zBooleanValue) {
                            String strZza = zzgui.zza(zzfcsVar2.getClass().getCanonicalName());
                            StringBuilder sb2 = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime2).length());
                            N0.a.r(sb2, "Signal runtime (ms) : ", strZza, " = ");
                            sb2.append(jElapsedRealtime2);
                            G6.L.k(sb2.toString());
                        }
                        zzbio zzbioVar2 = zzbix.zzcS;
                        C0395s c0395s2 = C0395s.f2489e;
                        if (((Boolean) c0395s2.f2492c.zzd(zzbioVar2)).booleanValue()) {
                            if (((Boolean) c0395s2.f2492c.zzd(zzbix.zzcY)).booleanValue()) {
                                synchronized (this.zza) {
                                    int iZzb = zzfcsVar2.zzb();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                                    sb3.append("sig");
                                    sb3.append(iZzb);
                                    bundle3.putLong(sb3.toString(), jElapsedRealtime2);
                                }
                            }
                        }
                    }
                }, zzcfy.zzh);
                arrayList.add(pVarZza);
            }
        }
        p8.p pVarZza2 = zzhcf.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfcq zzfcqVar = (zzfcq) ((p8.p) it.next()).get();
                    if (zzfcqVar != null) {
                        zzfcqVar.zza(obj2);
                    }
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    C6.n.f1857D.k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdzc.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdzc.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfqt.zza()) {
            zzfqp.zzd(pVarZza2, this.zzd, zzfqgVarA);
        }
        return pVarZza2;
    }
}
