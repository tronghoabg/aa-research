package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import Hf.C0615z;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class o extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31635a;

    /* renamed from: b, reason: collision with root package name */
    public int f31636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0615z f31637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f31637c = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31635a = obj;
        this.f31636b |= Integer.MIN_VALUE;
        return this.f31637c.emit(null, this);
    }
}
