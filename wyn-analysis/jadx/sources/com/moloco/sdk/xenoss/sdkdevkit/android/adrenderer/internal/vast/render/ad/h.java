package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import Va.Y7;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E;
import ef.C2515C;
import java.util.ArrayList;
import java.util.List;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31622b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        h hVar = new h(this.f31622b, interfaceC3103c);
        hVar.f31621a = obj;
        return hVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        hVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.f31621a;
        boolean z2 = dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c;
        q qVar = this.f31622b;
        if (z2) {
            Y7 y72 = qVar.f31642b;
            if (y72 != null) {
                E e7 = E.f31458g;
                List list = (List) y72.f13868b;
                if (list != null) {
                    G.g((L0) y72.f13869c, list, e7, 12);
                }
            }
            qVar.c(new C2100c(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c) dVar).f32018a));
        } else if (AbstractC3340k.a(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.f32014a)) {
            qVar.c(C2098a.f31605a);
        } else if (AbstractC3340k.a(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.f32017d)) {
            qVar.c(C2099b.f31612g);
            qVar.b();
        } else if (AbstractC3340k.a(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.f32015b)) {
            qVar.c(C2099b.f31607b);
            Object value = qVar.f31644d.getValue();
            ArrayList arrayList = qVar.f31641a;
            D d3 = (D) ff.o.t0(arrayList.indexOf(value) + 1, arrayList);
            if (d3 != null) {
                qVar.d(d3);
            }
        } else {
            if (!AbstractC3340k.a(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.f32016c)) {
                throw new Q((byte) 0, 9);
            }
            Y7 y73 = qVar.f31642b;
            if (y73 != null) {
                y73.b();
            }
            qVar.c(C2099b.f31610e);
        }
        return C2515C.f34653a;
    }
}
