package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.io.StringReader;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class H extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public StringReader f31168a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f31170c;

    /* renamed from: d, reason: collision with root package name */
    public int f31171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31170c = i5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31169b = obj;
        this.f31171d |= Integer.MIN_VALUE;
        return this.f31170c.a(null, this);
    }
}
