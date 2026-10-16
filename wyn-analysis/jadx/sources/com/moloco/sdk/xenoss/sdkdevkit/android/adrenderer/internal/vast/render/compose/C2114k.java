package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2042c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import vf.AbstractC4345a;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2114k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31896a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.a f31898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c f31899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2114k(tf.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31898c = aVar;
        this.f31899d = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2114k c2114k = new C2114k(this.f31898c, this.f31899d, interfaceC3103c);
        c2114k.f31897b = obj;
        return c2114k;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2114k) create((p0.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31896a;
        if (i5 == 0) {
            Fe.e.U(obj);
            p0.t tVar = (p0.t) this.f31897b;
            int i10 = 3;
            C2042c c2042c = new C2042c(i10, this.f31898c, this.f31899d);
            this.f31896a = 1;
            if (AbstractC4345a.e(tVar, c2042c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
