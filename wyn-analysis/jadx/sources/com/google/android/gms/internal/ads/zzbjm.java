package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbjm {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbjm(boolean z2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put(HandleInvocationsFromAdViewer.KEY_ACTION, "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjj zzf() {
        C6.n.f1857D.k.getClass();
        return new zzbjj(SystemClock.elapsedRealtime(), null, null);
    }

    public final void zza(zzbjm zzbjmVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjj zzbjjVar, long j8, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbjj(j8, strArr[0], zzbjjVar));
        }
        return true;
    }

    public final zzbjl zzc() {
        zzbjl zzbjlVar;
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbjj> list = this.zza;
                for (zzbjj zzbjjVar : list) {
                    long jZza = zzbjjVar.zza();
                    String strZzb = zzbjjVar.zzb();
                    zzbjj zzbjjVarZzc = zzbjjVar.zzc();
                    if (zzbjjVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbjjVarZzc.zza();
                        sb2.append(strZzb);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbjjVarZzc.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbjjVarZzc.zza()));
                                sb3.append('+');
                                sb3.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbjjVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        C6.n nVar = C6.n.f1857D;
                        nVar.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        nVar.k.getClass();
                        sb4.append(jCurrentTimeMillis + (jLongValue - SystemClock.elapsedRealtime()));
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbjlVar = new zzbjl(sb2.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbjlVar;
    }

    public final void zzd(String str, String str2) {
        zzbjc zzbjcVarZza;
        if (TextUtils.isEmpty(str2) || (zzbjcVarZza = C6.n.f1857D.f1868h.zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbji zzbjiVarZzd = zzbjcVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbjiVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            C6.n.f1857D.f1868h.zza();
            map = this.zzb;
        }
        return map;
    }
}
