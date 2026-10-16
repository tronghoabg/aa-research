package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import uf.InterfaceC4291a;

/* loaded from: classes3.dex */
public final class zzihy implements Map.Entry, InterfaceC4291a {
    private final /* synthetic */ Map.Entry zza;

    public zzihy(@NotNull Map.Entry delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
