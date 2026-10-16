package com.waze.ui.l;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements h.g.a.r {
    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1258036027, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValue.<anonymous>.<anonymous> (AnimatedValueVisibility.kt:41)");
        }
        w wVar = (w) obj2;
        composer.startReplaceGroup(-1418434980);
        if (wVar instanceof u) {
            composer.startReplaceGroup(-1418382188);
            ImageKt.Image(PainterResources_androidKt.painterResource(((u) wVar).a(), composer, 0), (String) null, SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cC, null), l.f42710j), Alignment.Companion.getCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE, 112);
            composer.endReplaceGroup();
        } else {
            if (!(wVar instanceof v)) {
                composer.startReplaceGroup(-1985418617);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-1418076838);
            com.airbnb.lottie.b.w wVarD = com.airbnb.lottie.b.an.d(com.airbnb.lottie.b.ab.b(((v) wVar).a()), composer);
            com.airbnb.lottie.b.o.b(a.a.G(wVarD), SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cC, null), l.f42710j), false, false, 0.0f, 1, null, false, null, null, ContentScale.Companion.getFit(), false, null, composer, 1572912, 196608, 0, 2064316);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}
