package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class t2 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f33680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var) {
        super(0);
        this.f33680a = w2Var;
    }

    @Override // tf.a
    public final Object invoke() {
        this.f33680a.a(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        return C2515C.f34653a;
    }
}
