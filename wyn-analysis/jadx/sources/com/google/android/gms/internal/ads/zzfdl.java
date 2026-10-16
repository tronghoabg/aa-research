package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes3.dex */
final /* synthetic */ class zzfdl implements zzhbn {
    static final /* synthetic */ zzfdl zza = new zzfdl();

    private /* synthetic */ zzfdl() {
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.zzhbn
    public final p8.p zza(Object obj) {
        h3.b bVar = (h3.b) obj;
        if (bVar == null) {
            return zzhcf.zza(new zzfdn("", 1, null));
        }
        zziii zziiiVarZzc = zziij.zzc();
        for (h3.c cVar : bVar.f36044a) {
            zziig zziigVarZzc = zziih.zzc();
            zziigVarZzc.zza(cVar.f36047c);
            zziigVarZzc.zzb(cVar.f36046b);
            zziigVarZzc.zzc(cVar.f36045a);
            zziiiVarZzc.zza((zziih) zziigVarZzc.zzbu());
        }
        return zzhcf.zza(new zzfdn(Base64.encodeToString(((zziij) zziiiVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
