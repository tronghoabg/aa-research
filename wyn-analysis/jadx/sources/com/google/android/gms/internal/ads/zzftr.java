package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.o1;
import Va.M6;
import android.content.Context;
import android.net.ConnectivityManager;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n7.AbstractC3598c;
import n7.C3597b;
import n7.InterfaceC3596a;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzftr {
    private final zzfum zzc;
    private final zzftn zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final InterfaceC3596a zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzftr(zzfum zzfumVar, zzftn zzftnVar, Context context, InterfaceC3596a interfaceC3596a) {
        this.zzc = zzfumVar;
        this.zzd = zzftnVar;
        this.zze = context;
        this.zzh = interfaceC3596a;
    }

    public static String zzh(String str, EnumC4471b enumC4471b) {
        String strName = enumC4471b == null ? "NULL" : enumC4471b.name();
        return M6.t(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzC)).booleanValue()) {
            zzj(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z2) {
        try {
            if (z2) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzful) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzful) it2.next()).zzi();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003a, B:13:0x0049, B:14:0x004f, B:16:0x0057, B:18:0x0063, B:19:0x0072, B:20:0x0076, B:21:0x007a, B:22:0x0084, B:24:0x008a, B:26:0x009c, B:27:0x00b1, B:28:0x00bb, B:30:0x00c1, B:32:0x00e2, B:35:0x00f5, B:37:0x00fb, B:34:0x00f2), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L46
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L46
            D6.o1 r2 = (D6.o1) r2     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r2.f2469a     // Catch: java.lang.Throwable -> L46
            int r4 = r2.f2470b     // Catch: java.lang.Throwable -> L46
            x6.b r4 = x6.EnumC4471b.a(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = zzh(r3, r4)     // Catch: java.lang.Throwable -> L46
            r0.add(r3)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.ConcurrentMap r4 = r8.zza     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzful r5 = (com.google.android.gms.internal.ads.zzful) r5     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L4f
            boolean r6 = r5.zzk(r2)     // Catch: java.lang.Throwable -> L46
            if (r6 != 0) goto L49
            java.util.concurrent.ConcurrentMap r6 = r8.zzb     // Catch: java.lang.Throwable -> L46
            r6.put(r3, r5)     // Catch: java.lang.Throwable -> L46
            r4.remove(r3)     // Catch: java.lang.Throwable -> L46
            r1.add(r2)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L46:
            r9 = move-exception
            goto L101
        L49:
            int r2 = r2.f2472d     // Catch: java.lang.Throwable -> L46
            r5.zzA(r2)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L4f:
            java.util.concurrent.ConcurrentMap r5 = r8.zzb     // Catch: java.lang.Throwable -> L46
            boolean r6 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzful r6 = (com.google.android.gms.internal.ads.zzful) r6     // Catch: java.lang.Throwable -> L46
            boolean r7 = r6.zzk(r2)     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L72
            int r2 = r2.f2472d     // Catch: java.lang.Throwable -> L46
            r6.zzA(r2)     // Catch: java.lang.Throwable -> L46
            r6.zzj()     // Catch: java.lang.Throwable -> L46
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L46
            r5.remove(r3)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L72:
            r1.add(r2)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L76:
            r1.add(r2)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L7a:
            java.util.concurrent.ConcurrentMap r9 = r8.zza     // Catch: java.lang.Throwable -> L46
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L46
        L84:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L46
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L46
            if (r3 != 0) goto L84
            java.util.concurrent.ConcurrentMap r3 = r8.zzb     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzful r2 = (com.google.android.gms.internal.ads.zzful) r2     // Catch: java.lang.Throwable -> L46
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L46
            r9.remove()     // Catch: java.lang.Throwable -> L46
            goto L84
        Lb1:
            java.util.concurrent.ConcurrentMap r9 = r8.zzb     // Catch: java.lang.Throwable -> L46
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L46
        Lbb:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto Lff
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L46
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzful r0 = (com.google.android.gms.internal.ads.zzful) r0     // Catch: java.lang.Throwable -> L46
            r0.zzh()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzE     // Catch: java.lang.Throwable -> L46
            D6.s r3 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzbiv r4 = r3.f2492c     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r4.zzd(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto Lf2
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzF     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f2492c     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L46
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto Lf5
        Lf2:
            r0.zzv()     // Catch: java.lang.Throwable -> L46
        Lf5:
            boolean r0 = r0.zzf()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto Lbb
            r9.remove()     // Catch: java.lang.Throwable -> L46
            goto Lbb
        Lff:
            monitor-exit(r8)
            return r1
        L101:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftr.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzful zzfulVar) {
        zzfulVar.zzd();
        this.zza.put(str, zzfulVar);
    }

    private final synchronized boolean zzo(String str, EnumC4471b enumC4471b) {
        boolean z2;
        try {
            ((C3597b) this.zzh).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzful zzfulVarZzq = zzq(str, enumC4471b);
            z2 = zzfulVarZzq != null && zzfulVarZzq.zzf();
            Long lValueOf = z2 ? Long.valueOf(System.currentTimeMillis()) : null;
            zzftu zzftuVar = new zzftu(new zzftt(str, enumC4471b), null);
            int iZzt = 0;
            zzftn zzftnVar = this.zzd;
            int iZzs = zzfulVarZzq == null ? 0 : zzfulVarZzq.zzs();
            if (zzfulVarZzq != null) {
                iZzt = zzfulVarZzq.zzt();
            }
            zzftnVar.zzd(iZzs, iZzt, jCurrentTimeMillis, lValueOf, zzfulVarZzq != null ? zzfulVarZzq.zzl() : null, zzftuVar, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    private final synchronized Object zzp(Class cls, String str, EnumC4471b enumC4471b) {
        zzftu zzftuVar = new zzftu(new zzftt(str, enumC4471b), null);
        zzftn zzftnVar = this.zzd;
        ((C3597b) this.zzh).getClass();
        zzftnVar.zzf(System.currentTimeMillis(), zzftuVar, -1, -1, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzful zzfulVarZzq = zzq(str, enumC4471b);
        if (zzfulVarZzq == null) {
            return null;
        }
        try {
            String strZzl = zzfulVarZzq.zzl();
            Object objZzg = zzfulVarZzq.zzg();
            Object objCast = objZzg == null ? null : cls.cast(objZzg);
            if (objCast != null) {
                zzftnVar.zzh(System.currentTimeMillis(), zzfulVarZzq.zzs(), zzfulVarZzq.zzt(), strZzl, zzftuVar, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            return objCast;
        } catch (ClassCastException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "PreloadAdManager.pollAd");
            G6.L.l("Unable to cast ad to the requested type:".concat(cls.getName()), e7);
            return null;
        }
    }

    private final synchronized zzful zzq(String str, EnumC4471b enumC4471b) {
        return (zzful) this.zza.get(zzh(str, enumC4471b));
    }

    public final synchronized void zza(List list, D6.S s10) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e7) {
                                int i5 = G6.L.f4523b;
                                H6.l.g("Failed to get connectivity manager", e7);
                            }
                        }
                    }
                }
                if (!AbstractC3598c.h() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzL)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzftq(this));
                    } catch (RuntimeException e10) {
                        int i10 = G6.L.f4523b;
                        H6.l.g("Failed to register network callback", e10);
                        this.zzi = new AtomicInteger(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzL)).intValue());
                    }
                }
                C6.n.f1857D.f1867g.zzb(new zzftp(this));
            }
            List<o1> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(EnumC4471b.class);
            for (o1 o1Var : listZzm) {
                String str = o1Var.f2469a;
                EnumC4471b enumC4471bA = EnumC4471b.a(o1Var.f2470b);
                zzful zzfulVarZza = this.zzc.zza(o1Var, s10);
                if (enumC4471bA != null && zzfulVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzfulVarZza.zzn(atomicInteger.get());
                    }
                    zzftn zzftnVar = this.zzd;
                    zzfulVarZza.zzm(zzftnVar);
                    zzn(zzh(str, enumC4471bA), zzfulVarZza);
                    zzgax zzgaxVar = H6.f.f4939b;
                    enumMap.put((EnumMap) enumC4471bA, (EnumC4471b) Integer.valueOf(((Integer) (enumMap.containsKey(enumC4471bA) ? enumMap.get(enumC4471bA) : 0)).intValue() + 1));
                    zzftu zzftuVar = new zzftu(new zzftt(str, enumC4471bA), null);
                    int i11 = o1Var.f2472d;
                    ((C3597b) this.zzh).getClass();
                    zzftnVar.zza(i11, System.currentTimeMillis(), zzftuVar, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                }
            }
            zzftn zzftnVar2 = this.zzd;
            ((C3597b) this.zzh).getClass();
            zzftnVar2.zzb(enumMap, System.currentTimeMillis(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, EnumC4471b.REWARDED);
    }

    public final synchronized zzccp zzc(String str) {
        return (zzccp) zzp(zzccp.class, str, EnumC4471b.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, EnumC4471b.APP_OPEN_AD);
    }

    public final synchronized zzbgq zze(String str) {
        return (zzbgq) zzp(zzbgq.class, str, EnumC4471b.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, EnumC4471b.INTERSTITIAL);
    }

    public final synchronized D6.L zzg(String str) {
        return (D6.L) zzp(D6.L.class, str, EnumC4471b.INTERSTITIAL);
    }
}
