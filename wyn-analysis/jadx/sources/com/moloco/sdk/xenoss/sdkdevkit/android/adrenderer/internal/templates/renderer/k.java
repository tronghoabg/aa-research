package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Ef.E;
import Ef.H;
import Ef.H0;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f30738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, WebView webView, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30737b = oVar;
        this.f30738c = webView;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f30737b, this.f30738c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30736a;
        o oVar = this.f30737b;
        if (i5 == 0) {
            Fe.e.U(obj);
            long j8 = (oVar.k * 1000) + 1000;
            this.f30736a = 1;
            if (H.m(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        boolean zBooleanValue = ((Boolean) oVar.f30750e.getValue()).booleanValue();
        C2515C c2515c = C2515C.f34653a;
        if (zBooleanValue) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Skip reload; content already loaded after backoff", null, false, 12, null);
            return c2515c;
        }
        H0 h02 = oVar.f30759o;
        if (h02 != null) {
            h02.cancel(null);
        }
        H0 h03 = oVar.f30757m;
        if (h03 != null) {
            h03.cancel(null);
        }
        this.f30738c.reload();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Reload attempt: " + oVar.k, null, false, 12, null);
        return c2515c;
    }
}
