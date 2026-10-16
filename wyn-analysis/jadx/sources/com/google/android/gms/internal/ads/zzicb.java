package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzicb extends zzicf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzicb(zzicc zziccVar) {
        super(zziccVar.zza);
        Objects.requireNonNull(zziccVar);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return zza();
    }
}
