package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class k extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31699a;

    /* renamed from: b, reason: collision with root package name */
    public int f31700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f31701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f31701c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31699a = obj;
        this.f31700b |= Integer.MIN_VALUE;
        return this.f31701c.emit(null, this);
    }
}
