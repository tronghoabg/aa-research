package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.List;
import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2096q extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f31559a;

    /* renamed from: b, reason: collision with root package name */
    public List f31560b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f31562d;

    /* renamed from: e, reason: collision with root package name */
    public int f31563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096q(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31562d = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31561c = obj;
        this.f31563e |= Integer.MIN_VALUE;
        return this.f31562d.e(null, null, this);
    }
}
