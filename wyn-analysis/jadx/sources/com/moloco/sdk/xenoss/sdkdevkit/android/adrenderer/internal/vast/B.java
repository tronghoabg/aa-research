package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class B extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f31107a;

    /* renamed from: b, reason: collision with root package name */
    public C2097a f31108b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f31110d;

    /* renamed from: e, reason: collision with root package name */
    public int f31111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31110d = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31109c = obj;
        this.f31111e |= Integer.MIN_VALUE;
        return this.f31110d.h(null, 0L, this);
    }
}
