package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1987d0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C1995h0 f30079a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1995h0 f30081c;

    /* renamed from: d, reason: collision with root package name */
    public int f30082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1987d0(C1995h0 c1995h0, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30081c = c1995h0;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30080b = obj;
        this.f30082d |= Integer.MIN_VALUE;
        return C1995h0.b(this.f30081c, this);
    }
}
