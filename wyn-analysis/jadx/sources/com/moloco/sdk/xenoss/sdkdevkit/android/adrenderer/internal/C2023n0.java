package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2023n0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public s0 f30469a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f30471c;

    /* renamed from: d, reason: collision with root package name */
    public int f30472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2023n0(s0 s0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30471c = s0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30470b = obj;
        this.f30472d |= Integer.MIN_VALUE;
        return s0.b(this.f30471c, this);
    }
}
