package com.vungle.ads.internal;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class n1 extends AbstractC3343n implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f33371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var) {
        super(2);
        this.f33371a = r1Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        if (iIntValue > 0 && iIntValue2 > 0) {
            this.f33371a.f33609x = iIntValue / iIntValue2;
        }
        return C2515C.f34653a;
    }
}
