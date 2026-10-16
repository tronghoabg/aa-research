package com.unity3d.services.core.di;

import ef.InterfaceC2525i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lef/i;", "factoryOf", "(Ltf/a;)Lef/i;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceFactoryKt {
    @NotNull
    public static final <T> InterfaceC2525i factoryOf(@NotNull a initializer) {
        AbstractC3340k.e(initializer, "initializer");
        return new Factory(initializer);
    }
}
