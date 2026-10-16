package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class p1 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context) {
        super(0);
        this.f33483a = context;
    }

    @Override // tf.a
    public final Object invoke() {
        return ServiceLocator.f32912d.a(this.f33483a).getService(com.vungle.ads.internal.executor.a.class);
    }
}
