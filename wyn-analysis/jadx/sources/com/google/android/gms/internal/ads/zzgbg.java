package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgbg extends zziej implements zziga {
    private zzgbg() {
        throw null;
    }

    public final zzgbg zza(String str) {
        str.getClass();
        zzbg();
        ((zzgbi) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return DesugarCollections.unmodifiableMap(((zzgbi) this.zza).zzb());
    }

    public final zzgbg zzc(String str, zzgbe zzgbeVar) {
        str.getClass();
        zzgbeVar.getClass();
        zzbg();
        ((zzgbi) this.zza).zze().put(str, zzgbeVar);
        return this;
    }

    public /* synthetic */ zzgbg(byte[] bArr) {
        super(zzgbi.zzb);
    }
}
