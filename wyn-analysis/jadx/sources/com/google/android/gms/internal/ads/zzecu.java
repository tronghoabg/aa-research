package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzecu {
    private final zzece zza;
    private final zzdxh zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzecu(zzece zzeceVar, zzdxh zzdxhVar) {
        this.zza = zzeceVar;
        this.zzb = zzdxhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdxg zzdxgVarZzc;
        zzdxg zzdxgVarZzc2;
        zzbxx zzbxxVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbrw zzbrwVar = (zzbrw) it.next();
                    zzbio zzbioVar = zzbix.zzkR;
                    C0395s c0395s = C0395s.f2489e;
                    String string = (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || (zzdxgVarZzc2 = this.zzb.zzc(zzbrwVar.zza)) == null || (zzbxxVar = zzdxgVarZzc2.zzc) == null) ? "" : zzbxxVar.toString();
                    String str = string;
                    boolean z2 = ((Boolean) c0395s.f2492c.zzd(zzbix.zzkS)).booleanValue() && (zzdxgVarZzc = this.zzb.zzc(zzbrwVar.zza)) != null && zzdxgVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbrwVar.zza;
                    list2.add(new zzect(str2, str, this.zzb.zzd(str2), zzbrwVar.zzb ? 1 : 0, zzbrwVar.zzd, zzbrwVar.zzc, z2));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzecs(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzece zzeceVar = this.zza;
                    if (!zzeceVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzeceVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzect) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
