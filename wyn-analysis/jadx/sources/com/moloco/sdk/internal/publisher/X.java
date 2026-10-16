package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class X extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public a0 f28973a;

    /* renamed from: b, reason: collision with root package name */
    public String f28974b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f28976d;

    /* renamed from: e, reason: collision with root package name */
    public int f28977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(a0 a0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28976d = a0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28975c = obj;
        this.f28977e |= Integer.MIN_VALUE;
        return this.f28976d.a(null, null, this);
    }
}
