package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class G extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30803a;

    /* renamed from: b, reason: collision with root package name */
    public int f30804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f30805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f30805c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30803a = obj;
        this.f30804b |= Integer.MIN_VALUE;
        return this.f30805c.emit(null, this);
    }
}
