package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class b0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f32921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var) {
        super(0);
        this.f32921a = i0Var;
    }

    @Override // tf.a
    public final Object invoke() {
        BaseAdListener adListener = this.f32921a.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this.f32921a);
        }
        return C2515C.f34653a;
    }
}
