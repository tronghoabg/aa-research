package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class s extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30444a;

    /* renamed from: b, reason: collision with root package name */
    public int f30445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f30446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f30446c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30444a = obj;
        this.f30445b |= Integer.MIN_VALUE;
        return this.f30446c.emit(null, this);
    }
}
