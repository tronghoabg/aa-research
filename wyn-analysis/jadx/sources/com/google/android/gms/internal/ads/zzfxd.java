package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zzfxd extends zzfxe {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfxd(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(zzfwwVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j8;
    }
}
