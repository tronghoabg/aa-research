package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Hf.C0615z;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class g extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0615z f30717a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j f30718b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0615z f30720d;

    /* renamed from: e, reason: collision with root package name */
    public int f30721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f30720d = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30719c = obj;
        this.f30721e |= Integer.MIN_VALUE;
        return this.f30720d.a(null, this);
    }
}
