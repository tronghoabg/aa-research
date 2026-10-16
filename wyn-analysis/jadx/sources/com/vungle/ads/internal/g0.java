package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class g0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f33005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VungleError f33006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, VungleError vungleError) {
        super(0);
        this.f33005a = i0Var;
        this.f33006b = vungleError;
    }

    @Override // tf.a
    public final Object invoke() {
        BaseAdListener adListener = this.f33005a.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this.f33005a, this.f33006b);
        }
        return C2515C.f34653a;
    }
}
