package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class f extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33046a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(0);
        this.f33046a = context;
    }

    @Override // tf.a
    public final Object invoke() {
        return ServiceLocator.f32912d.a(this.f33046a).getService(com.vungle.ads.internal.task.h.class);
    }
}
