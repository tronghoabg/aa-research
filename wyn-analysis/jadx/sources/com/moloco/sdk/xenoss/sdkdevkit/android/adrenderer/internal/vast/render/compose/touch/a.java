package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C.e f31932a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C.e f31934c;

    /* renamed from: d, reason: collision with root package name */
    public int f31935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C.e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31934c = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31933b = obj;
        this.f31935d |= Integer.MIN_VALUE;
        return this.f31934c.a(this);
    }
}
