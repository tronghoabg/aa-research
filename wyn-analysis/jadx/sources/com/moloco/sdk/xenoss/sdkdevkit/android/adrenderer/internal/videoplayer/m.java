package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import E5.I;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.q;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f32256a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f32257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f32258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f32258c = oVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        m mVar = new m(this.f32258c, (InterfaceC3103c) obj3);
        mVar.f32256a = zBooleanValue;
        mVar.f32257b = zBooleanValue2;
        C2515C c2515c = C2515C.f34653a;
        mVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f32256a;
        boolean z10 = this.f32257b;
        o oVar = this.f32258c;
        if (z2 && z10) {
            j jVar = oVar.f32261a;
            jVar.f32247r = true;
            I i5 = jVar.f32245p;
            if (i5 != null) {
                i5.I0(true);
            }
        } else {
            j jVar2 = oVar.f32261a;
            jVar2.f32247r = false;
            I i10 = jVar2.f32245p;
            if (i10 != null) {
                i10.I0(false);
            }
        }
        return C2515C.f34653a;
    }
}
