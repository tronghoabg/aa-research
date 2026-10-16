package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.U;
import D6.o1;
import android.content.Context;
import android.net.ConnectivityManager;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n7.AbstractC3598c;
import n7.C3597b;
import n7.InterfaceC3596a;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzftc {
    private final Map zza;
    private final zzfum zzb;
    private final zzftn zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final InterfaceC3596a zzg;
    private AtomicInteger zzh;
    private final zzfsx zzi;
    private final G6.N zzj;

    public zzftc(zzfum zzfumVar, zzftn zzftnVar, Context context, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar, G6.N n10) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(EnumC4471b.APP_OPEN_AD, new HashMap());
        map.put(EnumC4471b.INTERSTITIAL, new HashMap());
        map.put(EnumC4471b.REWARDED, new HashMap());
        this.zzb = zzfumVar;
        this.zzc = zzftnVar;
        this.zzd = context;
        this.zzg = interfaceC3596a;
        this.zzi = zzfsxVar;
        this.zzj = n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z2) {
        ArrayList arrayList = new ArrayList();
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzful zzfulVar = (zzful) arrayList.get(i5);
            if (z2) {
                zzfulVar.zzj();
            } else {
                zzfulVar.zzi();
            }
        }
    }

    private final Object zzn(Class cls, EnumC4471b enumC4471b, String str) {
        zzftn zzftnVar = this.zzc;
        ((C3597b) this.zzg).getClass();
        zzftnVar.zze(System.currentTimeMillis(), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(enumC4471b)) {
                    return null;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(enumC4471b)).get(str);
                if (zzfulVar != null && enumC4471b.equals(zzfulVar.zzq())) {
                    zzftt zzfttVar = new zzftt(zzfulVar.zzr(), zzfulVar.zzq());
                    zzfttVar.zza(str);
                    zzftu zzftuVar = new zzftu(zzfttVar, null);
                    zzftnVar.zzf(System.currentTimeMillis(), zzftuVar, zzfulVar.zzs(), zzfulVar.zzt(), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                    try {
                        String strZzl = zzfulVar.zzl();
                        Object objZzg = zzfulVar.zzg();
                        Object objCast = objZzg == null ? null : cls.cast(objZzg);
                        if (objCast == null) {
                            return objCast;
                        }
                        zzftnVar.zzh(System.currentTimeMillis(), zzfulVar.zzs(), zzfulVar.zzt(), strZzl, zzftuVar, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                        return objCast;
                    } catch (ClassCastException e7) {
                        C6.n.f1857D.f1868h.zzh(e7, "PreloadAdManager.pollAd");
                        G6.L.l("Unable to cast ad to the requested type:".concat(cls.getName()), e7);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    private final boolean zzo(EnumC4471b enumC4471b) {
        Map map = this.zza;
        int size = map.containsKey(enumC4471b) ? ((Map) map.get(enumC4471b)).size() : 0;
        int iOrdinal = enumC4471b.ordinal();
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzfD)).intValue(), 1) : Math.max(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzfC)).intValue(), 1) : Math.max(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzfB)).intValue(), 1));
    }

    public final boolean zza(String str, o1 o1Var, U u10) {
        int iK;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e7) {
                            int i5 = G6.L.f4523b;
                            H6.l.g("Failed to get connectivity manager", e7);
                        }
                    }
                }
            }
            if (!AbstractC3598c.h() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzL)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfta(this));
                } catch (RuntimeException e10) {
                    int i10 = G6.L.f4523b;
                    H6.l.g("Failed to register network callback", e10);
                    this.zzh = new AtomicInteger(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzL)).intValue());
                }
            }
            C6.n.f1857D.f1867g.zzb(new zzftb(this));
        }
        EnumC4471b enumC4471bA = EnumC4471b.a(o1Var.f2470b);
        if (enumC4471bA == null) {
            return false;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(enumC4471bA)) {
                    if (!((Map) map.get(enumC4471bA)).containsKey(str)) {
                        if (zzo(enumC4471bA)) {
                            if (o1Var.f2473e) {
                                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzT)).booleanValue() && (iK = ((G6.O) this.zzj).k()) > 0) {
                                    if (iK <= 0) {
                                        iK = o1Var.f2472d;
                                    }
                                    o1Var = new o1(o1Var.f2469a, o1Var.f2470b, o1Var.f2471c, iK, o1Var.f2473e);
                                }
                            }
                            zzful zzfulVarZzb = this.zzb.zzb(str, o1Var, u10);
                            if (zzfulVarZzb != null) {
                                AtomicInteger atomicInteger = this.zzh;
                                if (atomicInteger != null) {
                                    zzfulVarZzb.zzn(atomicInteger.get());
                                }
                                zzftn zzftnVar = this.zzc;
                                zzfulVarZzb.zzm(zzftnVar);
                                synchronized (map) {
                                    if (!((Map) map.get(enumC4471bA)).containsKey(str) && zzo(enumC4471bA)) {
                                        ((Map) map.get(enumC4471bA)).put(str, zzfulVarZzb);
                                        zzfsx zzfsxVar = this.zzi;
                                        if (zzfsxVar != null) {
                                            zzfsxVar.zze(str, enumC4471bA, zzfulVarZzb);
                                        } else {
                                            zzfulVarZzb.zzd();
                                        }
                                        zzftt zzfttVar = new zzftt(o1Var.f2469a, enumC4471bA);
                                        zzfttVar.zza(str);
                                        zzftu zzftuVar = new zzftu(zzfttVar, null);
                                        int i11 = o1Var.f2472d;
                                        ((C3597b) this.zzg).getClass();
                                        zzftnVar.zza(i11, System.currentTimeMillis(), zzftuVar, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
        return false;
    }

    public final boolean zzb(EnumC4471b enumC4471b, String str) {
        zzftu zzftuVar;
        ((C3597b) this.zzg).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(enumC4471b)) {
                    return false;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(enumC4471b)).get(str);
                String strZzl = zzfulVar == null ? null : zzfulVar.zzl();
                boolean z2 = strZzl != null && enumC4471b.equals(zzfulVar.zzq());
                Long lValueOf = z2 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (zzfulVar == null) {
                    zzftuVar = null;
                } else {
                    zzftt zzfttVar = new zzftt(zzfulVar.zzr(), enumC4471b);
                    zzfttVar.zza(str);
                    zzftuVar = new zzftu(zzfttVar, null);
                }
                this.zzc.zzd(zzfulVar == null ? 0 : zzfulVar.zzs(), zzfulVar != null ? zzfulVar.zzt() : 0, jCurrentTimeMillis, lValueOf, strZzl, zzftuVar, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzccp zzc(String str) {
        return (zzccp) zzn(zzccp.class, EnumC4471b.REWARDED, str);
    }

    public final zzbgq zzd(String str) {
        return (zzbgq) zzn(zzbgq.class, EnumC4471b.APP_OPEN_AD, str);
    }

    public final D6.L zze(String str) {
        return (D6.L) zzn(D6.L.class, EnumC4471b.INTERSTITIAL, str);
    }

    public final o1 zzf(EnumC4471b enumC4471b, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(enumC4471b)) {
                    zzful zzfulVar = (zzful) ((Map) map.get(enumC4471b)).get(str);
                    zzftn zzftnVar = this.zzc;
                    ((C3597b) this.zzg).getClass();
                    zzftnVar.zzo(System.currentTimeMillis(), str, zzfulVar == null ? null : zzfulVar.zzr(), enumC4471b, zzfulVar == null ? -1 : zzfulVar.zzs(), zzfulVar != null ? zzfulVar.zzt() : -1);
                    if (zzfulVar != null) {
                        return zzfulVar.zzo();
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public final int zzg(EnumC4471b enumC4471b, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(enumC4471b)) {
                    return 0;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(enumC4471b)).get(str);
                int iZzt = zzfulVar != null ? zzfulVar.zzt() : 0;
                zzftn zzftnVar = this.zzc;
                ((C3597b) this.zzg).getClass();
                zzftnVar.zzp(iZzt, System.currentTimeMillis(), str, zzfulVar == null ? null : zzfulVar.zzr(), enumC4471b, zzfulVar == null ? -1 : zzfulVar.zzs());
                return iZzt;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map zzh(int i5) {
        HashMap map = new HashMap();
        Map map2 = this.zza;
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        synchronized (map2) {
            if (enumC4471bA != null) {
                try {
                    if (map2.containsKey(enumC4471bA)) {
                        for (zzful zzfulVar : ((Map) map2.get(enumC4471bA)).values()) {
                            map.put(zzfulVar.zzp(), zzfulVar.zzo());
                        }
                        zzftn zzftnVar = this.zzc;
                        ((C3597b) this.zzg).getClass();
                        zzftnVar.zzn(enumC4471bA, System.currentTimeMillis(), map.size());
                        return map;
                    }
                } finally {
                }
            }
            return map;
        }
    }

    public final boolean zzi(EnumC4471b enumC4471b, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(enumC4471b)) {
                    return false;
                }
                zzful zzfulVar = (zzful) ((Map) map.get(enumC4471b)).remove(str);
                if (zzfulVar == null) {
                    return false;
                }
                zzfulVar.zzh();
                zzfsx zzfsxVar = this.zzi;
                if (zzfsxVar != null) {
                    zzfsxVar.zzf(zzfulVar);
                }
                int iZzt = zzfulVar.zzt();
                zzfulVar.zzv();
                zzftn zzftnVar = this.zzc;
                ((C3597b) this.zzg).getClass();
                zzftnVar.zzm(System.currentTimeMillis(), str, zzfulVar.zzr(), enumC4471b, zzfulVar.zzs(), iZzt);
                return true;
            } finally {
            }
        }
    }

    public final void zzj(int i5) {
        EnumC4471b enumC4471bA = EnumC4471b.a(i5);
        if (enumC4471bA == null) {
            return;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(enumC4471bA)) {
                    Map map2 = (Map) map.get(enumC4471bA);
                    int size = map2.size();
                    if (size == 0) {
                        return;
                    }
                    zzgwt zzgwtVarZzq = zzgwt.zzq(map2.values());
                    map2.clear();
                    int size2 = zzgwtVarZzq.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        zzful zzfulVar = (zzful) zzgwtVarZzq.get(i10);
                        if (zzfulVar != null) {
                            zzfulVar.zzh();
                            zzfsx zzfsxVar = this.zzi;
                            if (zzfsxVar != null) {
                                zzfsxVar.zzf(zzfulVar);
                            }
                            zzfulVar.zzv();
                            String strValueOf = String.valueOf(zzfulVar.zzp());
                            int i11 = G6.L.f4523b;
                            H6.l.e("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(enumC4471bA.toString());
                    int i12 = G6.L.f4523b;
                    H6.l.e(strConcat);
                    zzftn zzftnVar = this.zzc;
                    ((C3597b) this.zzg).getClass();
                    zzftnVar.zzl(System.currentTimeMillis(), enumC4471bA, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk(boolean z2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzC)).booleanValue()) {
            zzl(z2);
        }
    }
}
