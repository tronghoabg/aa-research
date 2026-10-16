package com.vungle.ads.internal;

import com.vungle.ads.internal.model.i3;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class z0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f33901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f33902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.model.h0 f33903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f33904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, a1 a1Var, com.vungle.ads.internal.model.h0 h0Var, i3 i3Var) {
        super(0);
        this.f33901a = b1Var;
        this.f33902b = a1Var;
        this.f33903c = h0Var;
        this.f33904d = i3Var;
    }

    @Override // tf.a
    public final Object invoke() {
        b1.a(this.f33901a, this.f33902b, this.f33903c, this.f33904d);
        return C2515C.f34653a;
    }
}
