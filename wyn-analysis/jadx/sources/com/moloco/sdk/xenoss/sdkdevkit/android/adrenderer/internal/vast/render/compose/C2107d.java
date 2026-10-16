package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2042c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import vf.AbstractC4345a;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2107d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31867a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i f31869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.a f31870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2107d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, tf.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31869c = iVar;
        this.f31870d = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2107d c2107d = new C2107d(this.f31869c, this.f31870d, interfaceC3103c);
        c2107d.f31868b = obj;
        return c2107d;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2107d) create((p0.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31867a;
        if (i5 == 0) {
            Fe.e.U(obj);
            p0.t tVar = (p0.t) this.f31868b;
            C2042c c2042c = new C2042c(2, this.f31869c, this.f31870d);
            this.f31867a = 1;
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
