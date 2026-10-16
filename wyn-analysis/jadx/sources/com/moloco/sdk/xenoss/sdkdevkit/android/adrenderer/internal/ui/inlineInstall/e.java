package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import E5.Q;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X8.c f30897b;

    public /* synthetic */ e(X8.c cVar, int i5) {
        this.f30896a = i5;
        this.f30897b = cVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2515C c2515c = C2515C.f34653a;
        h hVar = h.f30901a;
        g gVar = g.f30900a;
        X8.c cVar = this.f30897b;
        i iVar = i.f30902a;
        switch (this.f30896a) {
            case 0:
                j outcome = (j) obj;
                AbstractC3340k.e(outcome, "outcome");
                if (!outcome.equals(iVar)) {
                    boolean zEquals = outcome.equals(gVar);
                    com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) cVar.f16189f;
                    if (zEquals) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fullsheet_shown", null, false, 12, null);
                        if (cVar2 != null) {
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                            com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("store_launch_complete");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                            hVar2.a("result", "auto_fullsheet_shown");
                            cVar2.a(hVar2);
                        }
                    } else {
                        if (!outcome.equals(hVar)) {
                            throw new Q((byte) 0, 9);
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "auto_fallback_shown", null, false, 12, null);
                        if (cVar2 != null) {
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                            com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("store_launch_complete");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                            hVar3.a("result", "auto_fallback_shown");
                            cVar2.a(hVar3);
                        }
                    }
                }
                return c2515c;
            default:
                j outcome2 = (j) obj;
                AbstractC3340k.e(outcome2, "outcome");
                boolean zEquals2 = outcome2.equals(iVar);
                com.moloco.sdk.acm.recorder.c cVar3 = (com.moloco.sdk.acm.recorder.c) cVar.f16189f;
                if (zEquals2) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "click_inline_halfsheet_shown", null, false, 12, null);
                    if (cVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        com.moloco.sdk.acm.h hVar4 = new com.moloco.sdk.acm.h("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                        hVar4.a("result", "click_inline_halfsheet_shown");
                        cVar3.a(hVar4);
                    }
                    if (((AtomicBoolean) cVar.f16190g).compareAndSet(false, true)) {
                        String str = ((c) cVar.f16187d).f30886b;
                        if (str != null) {
                            com.moloco.sdk.service_locator.j.b().a(str);
                            MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success fire this event once: ".concat(str), null, false, 12, null);
                        }
                    } else {
                        MolocoLogger.info$default(molocoLogger, "InlineInstallLauncher", "inline_install_success already fired", null, false, 12, null);
                    }
                } else if (outcome2.equals(gVar)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fullsheet_shown", null, false, 12, null);
                    if (cVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        com.moloco.sdk.acm.h hVar5 = new com.moloco.sdk.acm.h("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                        hVar5.a("result", "click_inline_fullsheet_shown");
                        cVar3.a(hVar5);
                    }
                } else {
                    if (!outcome2.equals(hVar)) {
                        throw new Q((byte) 0, 9);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InlineInstallLauncher", "click_inline_fallback_shown", null, false, 12, null);
                    if (cVar3 != null) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr5 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        com.moloco.sdk.acm.h hVar6 = new com.moloco.sdk.acm.h("store_launch_complete");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                        hVar6.a("result", "click_inline_fallback_shown");
                        cVar3.a(hVar6);
                    }
                }
                return c2515c;
        }
    }
}
