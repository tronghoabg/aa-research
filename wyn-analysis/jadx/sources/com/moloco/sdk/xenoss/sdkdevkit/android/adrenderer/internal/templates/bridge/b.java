package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

import R8.v;
import android.webkit.ValueCallback;
import ba.C1521a;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import ef.C2530n;
import kd.C3328y;
import kotlin.jvm.internal.K;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30600b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f30599a = i5;
        this.f30600b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object obj2 = this.f30600b;
        switch (this.f30599a) {
            case 0:
                C1521a c1521a = (C1521a) obj2;
                c cVar = (c) c1521a.f19415c;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                h hVar = new h("template_bridge_notify_ready_completed");
                hVar.a("attached", String.valueOf(((i) c1521a.f19414b).isAttachedToWindow()));
                cVar.a(hVar);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", v.f("notifyReadyEvent call completed, result: ", (String) obj), null, false, 12, null);
                break;
            case 1:
                C3328y c3328y = (C3328y) obj2;
                K.e(1, c3328y);
                c3328y.invoke(new C2530n((Boolean) obj));
                break;
            default:
                C3328y c3328y2 = (C3328y) obj2;
                K.e(1, c3328y2);
                c3328y2.invoke(new C2530n((String) obj));
                break;
        }
    }
}
