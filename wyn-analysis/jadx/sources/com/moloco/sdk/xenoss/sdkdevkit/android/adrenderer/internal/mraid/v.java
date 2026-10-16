package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class v extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public w f30458a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f30460c;

    /* renamed from: d, reason: collision with root package name */
    public int f30461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30460c = wVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30459b = obj;
        this.f30461d |= Integer.MIN_VALUE;
        return this.f30460c.e(this);
    }
}
