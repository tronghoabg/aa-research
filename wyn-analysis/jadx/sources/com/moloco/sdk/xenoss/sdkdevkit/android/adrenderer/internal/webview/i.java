package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import Ef.E;
import Hf.InterfaceC0592c0;
import Hf.f0;
import N.C0718d;
import N.V;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2054o;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f32329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f32330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(V v2, InterfaceC0592c0 interfaceC0592c0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32329b = v2;
        this.f32330c = interfaceC0592c0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f32329b, this.f32330c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32328a;
        if (i5 == 0) {
            Fe.e.U(obj);
            f0 f0VarN = C0718d.N(new C2054o(this.f32329b, 2));
            B3.a aVar2 = new B3.a(this.f32330c, 8);
            this.f32328a = 1;
            if (f0VarN.collect(aVar2, this) == aVar) {
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
