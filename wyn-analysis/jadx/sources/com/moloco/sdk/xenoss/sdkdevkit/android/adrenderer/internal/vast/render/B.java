package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class B extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31593a;

    /* renamed from: b, reason: collision with root package name */
    public int f31594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f31595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f31595c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31593a = obj;
        this.f31594b |= Integer.MIN_VALUE;
        return this.f31595c.emit(null, this);
    }
}
