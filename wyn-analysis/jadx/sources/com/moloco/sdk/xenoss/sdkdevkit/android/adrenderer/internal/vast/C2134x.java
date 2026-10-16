package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Hf.InterfaceC0603m;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2134x extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32185a;

    /* renamed from: b, reason: collision with root package name */
    public int f32186b;

    /* renamed from: c, reason: collision with root package name */
    public C2135y f32187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2135y f32188d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f32189e;

    /* renamed from: f, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v f32190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2134x(C2135y c2135y, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f32188d = c2135y;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32185a = obj;
        this.f32186b |= Integer.MIN_VALUE;
        return this.f32188d.emit(null, this);
    }
}
