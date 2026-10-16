package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.p0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class d extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(0);
        this.f33509a = rVar;
    }

    @Override // tf.a
    public final Object invoke() {
        Context context = this.f33509a.f33540a.getContext();
        AbstractC3340k.d(context, "adWidget.context");
        return new p0(context, this.f33509a.f33541b);
    }
}
