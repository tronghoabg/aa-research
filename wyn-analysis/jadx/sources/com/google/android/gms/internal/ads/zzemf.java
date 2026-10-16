package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import D6.z1;
import Va.M6;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzemf {
    private final String zzc;
    private zzfkq zzd = null;
    private zzfkn zze = null;
    private z1 zzf = null;
    private final Map zzb = M6.v();
    private final List zza = DesugarCollections.synchronizedList(new ArrayList());

    public zzemf(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfkn zzfknVar, int i5) {
        Map map = this.zzb;
        String strZzl = zzl(zzfknVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfknVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        z1 z1Var = new z1(zzfknVar.zzE, 0L, null, bundle, zzfknVar.zzF, zzfknVar.zzG, zzfknVar.zzH, zzfknVar.zzI);
        try {
            this.zza.add(i5, z1Var);
        } catch (IndexOutOfBoundsException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, z1Var);
    }

    private final void zzk(zzfkn zzfknVar, long j8, K0 k02, boolean z2) {
        Map map = this.zzb;
        String strZzl = zzl(zzfknVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfknVar;
            }
            z1 z1Var = (z1) map.get(strZzl);
            z1Var.f2550b = j8;
            z1Var.f2551c = k02;
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhP)).booleanValue() && z2) {
                this.zzf = z1Var;
            }
        }
    }

    private static String zzl(zzfkn zzfknVar) {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeE)).booleanValue() ? zzfknVar.zzap : zzfknVar.zzw;
    }

    public final void zza(zzfkq zzfkqVar) {
        this.zzd = zzfkqVar;
    }

    public final void zzb(zzfkn zzfknVar) {
        zzj(zzfknVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            z1 z1Var = (z1) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(z1Var);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfkn) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzfkn zzfknVar, long j8, K0 k02) {
        zzk(zzfknVar, j8, null, true);
    }

    public final void zze(zzfkn zzfknVar, long j8, K0 k02) {
        zzk(zzfknVar, j8, k02, false);
    }

    public final zzdcs zzf() {
        return new zzdcs(this.zze, "", this, this.zzd, this.zzc);
    }

    public final z1 zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfkn zzfknVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfknVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (z1) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            z1 z1Var = (z1) list.get(iIndexOf);
            z1Var.f2550b = 0L;
            z1Var.f2551c = null;
        }
    }
}
