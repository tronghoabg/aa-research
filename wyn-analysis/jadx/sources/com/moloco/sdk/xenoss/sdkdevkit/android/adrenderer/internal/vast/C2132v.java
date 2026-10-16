package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2132v extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f32156a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.G f32157b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f32159d;

    /* renamed from: e, reason: collision with root package name */
    public int f32160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132v(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f32159d = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32158c = obj;
        this.f32160e |= Integer.MIN_VALUE;
        return this.f32159d.g(null, null, 0.0d, null, false, null, this);
    }
}
