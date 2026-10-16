package com.vungle.ads.internal.ui;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class q extends AbstractC3343n implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f33743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar) {
        super(2);
        this.f33743a = zVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String errorMessage = (String) obj2;
        AbstractC3340k.e(errorMessage, "errorMessage");
        this.f33743a.a(errorMessage, iIntValue);
        return C2515C.f34653a;
    }
}
