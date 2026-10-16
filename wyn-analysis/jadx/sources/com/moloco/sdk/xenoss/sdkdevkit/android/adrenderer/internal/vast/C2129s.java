package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Hf.InterfaceC0603m;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2129s extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32101a;

    /* renamed from: b, reason: collision with root package name */
    public int f32102b;

    /* renamed from: c, reason: collision with root package name */
    public C2130t f32103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2130t f32104d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0603m f32105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2129s(C2130t c2130t, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f32104d = c2130t;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32101a = obj;
        this.f32102b |= Integer.MIN_VALUE;
        return this.f32104d.emit(null, this);
    }
}
