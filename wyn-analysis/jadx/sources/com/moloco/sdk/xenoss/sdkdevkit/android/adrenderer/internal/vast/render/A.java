package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Ef.E;
import Hf.x0;
import R8.C0805a;
import android.content.Context;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0805a f31589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f31591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f31592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0805a c0805a, Context context, Integer num, Integer num2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31589b = c0805a;
        this.f31590c = context;
        this.f31591d = num;
        this.f31592e = num2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new A(this.f31589b, this.f31590c, this.f31591d, this.f31592e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31588a;
        C0805a c0805a = this.f31589b;
        t tVar = null;
        try {
        } catch (Exception unused) {
            if (tVar != null) {
                tVar.destroy();
            }
            c0805a.destroy();
        }
        if (i5 == 0) {
            Fe.e.U(obj);
            I i10 = (I) c0805a.f10437b;
            if (i10 != null) {
                Context context = this.f31590c;
                com.moloco.sdk.internal.services.events.c cVar = (com.moloco.sdk.internal.services.events.c) c0805a.f10438c;
                G0 g02 = (G0) c0805a.f10439d;
                Integer num = this.f31591d;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = this.f31592e;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                com.moloco.sdk.service_locator.h hVar = new com.moloco.sdk.service_locator.h(14);
                C1915d c1915d = new C1915d(20);
                this.f31588a = 1;
                objE = xg.g.e(i10, context, cVar, g02, iIntValue, iIntValue2, hVar, c1915d, false, null, this);
                if (objE == aVar) {
                    return aVar;
                }
            }
            ((x0) c0805a.f10442g).j(tVar);
            return C2515C.f34653a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Fe.e.U(obj);
        objE = obj;
        tVar = (t) objE;
        ((x0) c0805a.f10442g).j(tVar);
        return C2515C.f34653a;
    }
}
