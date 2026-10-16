package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbud implements zzbsu, zzbuc {
    private final zzbuc zza;
    private final HashSet zzb = new HashSet();

    public zzbud(zzbuc zzbucVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbtf
    public final /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        AbstractC1748l.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbtf
    public final /* synthetic */ void zzc(String str, String str2) {
        AbstractC1748l.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbst
    public final /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        AbstractC1748l.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbst
    public final /* synthetic */ void zze(String str, Map map) {
        AbstractC1748l.d(this, str, map);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            G6.L.k("Unregistering eventhandler: ".concat(String.valueOf(((zzbpx) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbpx) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzm(String str, zzbpx zzbpxVar) {
        this.zza.zzm(str, zzbpxVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzn(String str, zzbpx zzbpxVar) {
        this.zza.zzn(str, zzbpxVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }
}
