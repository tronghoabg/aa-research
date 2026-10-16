package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.E;
import Hf.j0;
import com.moloco.sdk.internal.services.B;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f30669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30669b = cVar;
        this.f30670c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f30669b, this.f30670c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30668a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        c cVar = this.f30669b;
        B b5 = cVar.f30671a;
        String str = this.f30670c;
        AbstractC3340k.b(str);
        j0 j0Var = cVar.f30673c;
        this.f30668a = 1;
        if (!b5.f29374a.a(str) || j0Var == null || (objEmit = j0Var.emit(c2515c, this)) != aVar) {
            objEmit = c2515c;
        }
        return objEmit == aVar ? aVar : c2515c;
    }
}
