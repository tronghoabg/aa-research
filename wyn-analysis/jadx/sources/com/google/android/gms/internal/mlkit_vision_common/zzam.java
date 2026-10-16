package com.google.android.gms.internal.mlkit_vision_common;

import h9.b;
import h9.e;
import h9.g;
import i9.InterfaceC2860b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzam implements InterfaceC2860b {
    public static final /* synthetic */ int zza = 0;
    private static final e zzb = new e() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // h9.InterfaceC2794a
        public final void encode(Object obj, Object obj2) {
            int i5 = zzam.zza;
            throw new b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final e zze = zzb;

    @Override // i9.InterfaceC2860b
    public final /* bridge */ /* synthetic */ InterfaceC2860b registerEncoder(Class cls, e eVar) {
        this.zzc.put(cls, eVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ InterfaceC2860b registerEncoder(Class cls, g gVar) {
        this.zzd.put(cls, gVar);
        this.zzc.remove(cls);
        return this;
    }
}
