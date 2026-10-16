package com.vungle.ads.internal.signals;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class i extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(0);
        this.f33656a = context;
    }

    @Override // tf.a
    public final Object invoke() {
        return ServiceLocator.f32912d.a(this.f33656a).getService(PathProvider.class);
    }
}
