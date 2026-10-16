package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzicd extends zzicf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzicd(zzice zziceVar) {
        super(zziceVar.zza);
        Objects.requireNonNull(zziceVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
