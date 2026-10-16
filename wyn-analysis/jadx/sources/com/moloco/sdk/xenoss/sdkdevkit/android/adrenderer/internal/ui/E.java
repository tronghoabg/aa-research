package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class E extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f30793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(boolean z2, Activity activity, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30792a = z2;
        this.f30793b = activity;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new E(this.f30792a, this.f30793b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        E e7 = (E) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        e7.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        if (this.f30792a) {
            android.support.v4.media.session.b.I(this.f30793b);
        }
        return C2515C.f34653a;
    }
}
