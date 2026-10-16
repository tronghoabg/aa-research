package com.google.android.apps.auto.components.ace;

import android.service.personalcontext.PersonalContextManager;
import android.service.personalcontext.RenderToken;
import android.service.personalcontext.insight.InsightFilter;
import android.service.personalcontext.insight.PublishedContextInsight;
import android.service.personalcontext.renderer.InsightRendererService;
import defpackage.hdd;
import defpackage.hpk;
import defpackage.jre;
import defpackage.yfq;
import defpackage.yls;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class AceInsightRendererService extends InsightRendererService {
    private static final yph a = yph.c("GH.AceInsights");

    public final void onConnected() {
        super.onConnected();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2693)).u("Connected");
        PersonalContextManager personalContextManager = (PersonalContextManager) getSystemService(PersonalContextManager.class);
        if (personalContextManager != null) {
            RenderToken renderTokenMintRenderToken = mintRenderToken("AAP_RENDERER");
            ((ype) yphVar.l().ai(2694)).M("Publishing render token Component ID: %s Token ID: %s", renderTokenMintRenderToken.getRendererComponentId(), renderTokenMintRenderToken.getTokenId());
            personalContextManager.publishTriggeringHint(yfq.q(hdd.e(new hpk(renderTokenMintRenderToken))), yls.a);
        }
    }

    public final InsightFilter onInitializeFilter() {
        ((ype) a.l().ai((char) 2695)).u("Initializing filter");
        return new InsightFilter.Builder().build();
    }

    public final void onRender(PublishedContextInsight publishedContextInsight, RenderToken renderToken) {
        ((ype) a.l().ai((char) 2696)).y("Rendering %s", publishedContextInsight);
        jre.a().e(publishedContextInsight.getInsight());
    }
}
