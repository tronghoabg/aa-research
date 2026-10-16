package com.google.android.gms.internal.p002firebaseauthapi;

import N0.a;
import R8.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import s8.g;
import x.C4412e;

/* loaded from: classes.dex */
public final class zzafb {
    private static final Map<String, zzafe> zza = new C4412e(0);
    private static final Map<String, List<WeakReference<zzafd>>> zzb = new C4412e(0);

    private static String zza(String str, int i5, boolean z2) {
        if (z2) {
            return "http://[" + str + "]:" + i5 + "/";
        }
        return "http://" + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i5 + "/";
    }

    public static String zzb(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return a.f(zzafeVar != null ? v.f("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return a.f(zzafeVar != null ? v.f("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        return a.f(zzafeVar != null ? v.f("", zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzafe zzafeVar;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            zzafeVar = map.get(str);
        }
        if (zzafeVar != null) {
            return a.f(zza(zzafeVar.zzb(), zzafeVar.zza(), zzafeVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzafd zzafdVar) {
        Map<String, List<WeakReference<zzafd>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzafdVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzafdVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(g gVar) {
        Map<String, zzafe> map = zza;
        gVar.a();
        return map.containsKey(gVar.f45330c.f45343a);
    }

    public static void zza(g gVar, String str, int i5) {
        gVar.a();
        String str2 = gVar.f45330c.f45343a;
        Map<String, zzafe> map = zza;
        synchronized (map) {
            map.put(str2, new zzafe(str, i5));
        }
        Map<String, List<WeakReference<zzafd>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzafd>> it = map2.get(str2).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        zzafd zzafdVar = it.next().get();
                        if (zzafdVar != null) {
                            zzafdVar.zza();
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
