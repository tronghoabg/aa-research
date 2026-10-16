package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f32021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f32022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32022b = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        f fVar = new f(this.f32022b, interfaceC3103c);
        fVar.f32021a = ((Boolean) obj).booleanValue();
        return fVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        f fVar = (f) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        fVar.invokeSuspend(c2515c);
        return c2515c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f32021a;
        h hVar = this.f32022b;
        if (z2) {
            l lVar = hVar.f32049x;
            Integer num = new Integer(hVar.f32026A);
            ?? r22 = lVar.f32062f;
            if (r22 != 0) {
                lVar.k.a(r22, null, num, hVar.f32034h);
            }
        } else {
            l lVar2 = hVar.f32049x;
            Integer num2 = new Integer(hVar.f32026A);
            ?? r23 = lVar2.f32061e;
            if (r23 != 0) {
                lVar2.k.a(r23, null, num2, hVar.f32034h);
            }
        }
        return C2515C.f34653a;
    }
}
