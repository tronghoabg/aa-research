package com.google.android.gms.internal.ads;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzihz extends zzihu implements Set, j$.util.Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzihz(@NotNull Collection delegate) {
        super(delegate);
        AbstractC3340k.e(delegate, "delegate");
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Spliterators.spliterator(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
