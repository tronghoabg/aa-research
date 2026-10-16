package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class m0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f29087b;

    /* renamed from: c, reason: collision with root package name */
    public int f29088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29087b = r0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29086a = obj;
        this.f29088c |= Integer.MIN_VALUE;
        return this.f29087b.c(this);
    }
}
