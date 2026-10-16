package com.vungle.ads.internal.platform;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes5.dex */
public final class d extends AbstractC3343n implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final d f33500a = new d();

    public d() {
        super(1);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        AbstractC3340k.e(it, "it");
        return it.getCause();
    }
}
