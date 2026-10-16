package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f30529b;

    /* renamed from: c, reason: collision with root package name */
    public int f30530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30529b = cVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30528a = obj;
        this.f30530c |= Integer.MIN_VALUE;
        return this.f30529b.a(null, null, null, null, null, null, null, null, this);
    }
}
