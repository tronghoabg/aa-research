package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import vf.AbstractC4345a;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2106c extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31859a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i f31861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2106c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31861c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2106c c2106c = new C2106c(this.f31861c, interfaceC3103c);
        c2106c.f31860b = obj;
        return c2106c;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2106c) create((p0.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31859a;
        if (i5 == 0) {
            Fe.e.U(obj);
            p0.t tVar = (p0.t) this.f31860b;
            Bf.s sVar = new Bf.s(this.f31861c, 10);
            this.f31859a = 1;
            if (AbstractC4345a.e(tVar, sVar, this) == aVar) {
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
