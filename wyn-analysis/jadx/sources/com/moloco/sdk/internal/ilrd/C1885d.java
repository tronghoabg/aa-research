package com.moloco.sdk.internal.ilrd;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.internal.ilrd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1885d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public m f28555a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28556b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f28558d;

    /* renamed from: e, reason: collision with root package name */
    public int f28559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885d(m mVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28558d = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28557c = obj;
        this.f28559e |= Integer.MIN_VALUE;
        return m.b(this.f28558d, this);
    }
}
