package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2083a;
import java.util.List;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class A extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f31093a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u f31094b;

    /* renamed from: c, reason: collision with root package name */
    public List f31095c;

    /* renamed from: d, reason: collision with root package name */
    public C2083a f31096d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.G f31097e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f31098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f31099g;

    /* renamed from: h, reason: collision with root package name */
    public int f31100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31099g = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31098f = obj;
        this.f31100h |= Integer.MIN_VALUE;
        return this.f31099g.f(null, null, null, null, 0.0d, null, null, false, null, this);
    }
}
