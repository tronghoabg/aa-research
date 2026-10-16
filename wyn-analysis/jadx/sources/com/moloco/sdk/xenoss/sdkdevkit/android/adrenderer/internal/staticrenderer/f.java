package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Ef.E;
import Hf.x0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.l;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f30536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30536b = gVar;
        this.f30537c = str;
        this.f30538d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f30536b, this.f30537c, this.f30538d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30535a;
        g gVar = this.f30536b;
        if (i5 == 0) {
            Fe.e.U(obj);
            try {
                l htmlCssFixer = gVar.getHtmlCssFixer();
                String toHtml = this.f30537c;
                htmlCssFixer.getClass();
                AbstractC3340k.e(toHtml, "toHtml");
                H.L(gVar, "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ".concat(toHtml));
                e eVar = new e(gVar, null);
                this.f30535a = 1;
                obj = Ef.H.S(this.f30538d, eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticWebView", "loadHtml", e7, false, 8, null);
                return new y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f30124b);
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        i iVar = gVar.f30541d;
        if (obj == null) {
            x0 x0Var = iVar.f30552d;
            Boolean bool = Boolean.TRUE;
            x0Var.getClass();
            x0Var.k(null, bool);
        }
        boolean zBooleanValue = ((Boolean) iVar.f30553e.getValue()).booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) ((x0) iVar.f30557i.f5122a).getValue();
        return gVar2 != null ? new y(gVar2) : zBooleanValue ? new z(C2515C.f34653a) : new y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f30123a);
    }
}
