package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import E5.Q;
import Ef.E;
import Ef.H;
import Ef.S;
import Fe.e;
import Hf.x0;
import Jf.n;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f30583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f30585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, long j8, g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30583b = bVar;
        this.f30584c = j8;
        this.f30585d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f30583b, this.f30584c, this.f30585d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30582a;
        b bVar = this.f30583b;
        if (i5 == 0) {
            e.U(obj);
            i iVar = bVar.f30588c;
            this.f30582a = 1;
            iVar.getClass();
            Lf.e eVar = S.f3698a;
            obj = H.P(n.f6132a, new d(iVar, bVar.f30586a, this.f30584c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        A a5 = (A) obj;
        boolean z2 = a5 instanceof z;
        g gVar = this.f30585d;
        if (z2) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load success", null, false, 12, null);
            x0 x0Var = bVar.f30589d;
            Boolean bool = Boolean.TRUE;
            x0Var.getClass();
            x0Var.k(null, bool);
            gVar.a();
        } else {
            if (!(a5 instanceof y)) {
                throw new Q((byte) 0, 9);
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load failure", null, false, 12, null);
            x0 x0Var2 = bVar.f30589d;
            Boolean bool2 = Boolean.FALSE;
            x0Var2.getClass();
            x0Var2.k(null, bool2);
            gVar.e((c) ((y) a5).f29793a);
        }
        return C2515C.f34653a;
    }
}
