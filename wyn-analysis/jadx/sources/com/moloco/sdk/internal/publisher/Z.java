package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class Z extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public String f28983a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f28985c;

    /* renamed from: d, reason: collision with root package name */
    public int f28986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28985c = a0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28984b = obj;
        this.f28986d |= Integer.MIN_VALUE;
        return this.f28985c.b(null, this);
    }
}
