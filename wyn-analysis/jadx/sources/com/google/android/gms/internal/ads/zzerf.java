package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzerf extends zzcvz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzerf(zzerj zzerjVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzfko zzfkoVar) {
        super(view, null, zzcxyVar, zzfkoVar);
        Objects.requireNonNull(zzerjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final zzdel zze(Set set) {
        return new zzdel(Collections.EMPTY_SET);
    }
}
