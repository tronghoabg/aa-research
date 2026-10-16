package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2094o extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f31536a;

    /* renamed from: b, reason: collision with root package name */
    public String f31537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31538c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f31540e;

    /* renamed from: f, reason: collision with root package name */
    public int f31541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2094o(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31540e = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31539d = obj;
        this.f31541f |= Integer.MIN_VALUE;
        return this.f31540e.i(null, null, false, this);
    }
}
