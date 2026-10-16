package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ D f31629a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Boolean f31630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f31631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f31631c = qVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = new m(this.f31631c, (InterfaceC3103c) obj3);
        mVar.f31629a = (D) obj;
        mVar.f31630b = (Boolean) obj2;
        return mVar.invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        D d3 = this.f31629a;
        return Boolean.valueOf((d3 == null || !d3.equals(ff.o.y0(this.f31631c.f31641a)) || AbstractC3340k.a(this.f31630b, Boolean.TRUE)) ? false : true);
    }
}
