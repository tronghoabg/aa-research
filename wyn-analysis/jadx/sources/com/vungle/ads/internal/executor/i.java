package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class i extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f32992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f32992a = jVar;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = l.a("submit callable error in ");
        sbA.append(this.f32992a.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
        return C2515C.f34653a;
    }
}
