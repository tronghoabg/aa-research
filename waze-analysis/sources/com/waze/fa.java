package com.waze;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.reports_v2.presentation.ConversationalReportingFteTooltipCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class fa implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23774b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23775c;

    public /* synthetic */ fa(int i2, Integer num, int i3) {
        this.f23775c = i3;
        this.f23773a = i2;
        this.f23774b = num;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [com.waze.sharedrive.e.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.waze.tide.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer;
        switch (this.f23775c) {
            case 0:
                ((Integer) obj2).intValue();
                break;
            case 1:
                ((Integer) obj2).intValue();
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((MapCoverView) this.f23774b).Content((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 3:
                ((Integer) obj2).intValue();
                com.waze.beacons.n.a((com.waze.beacons.a.f) this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 4:
                ((Integer) obj2).intValue();
                com.waze.car_lib.r.bq.l(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 5:
                ((Integer) obj2).intValue();
                com.waze.o.d.b.b.c.e((com.waze.o.d.b.b.h) this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 6:
                ((Integer) obj2).intValue();
                com.waze.z.a.be.x(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 7:
                ((Integer) obj2).intValue();
                com.waze.z.a.be.l(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 8:
                ((Integer) obj2).intValue();
                com.waze.z.a.b.y.e(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 9:
                ((Integer) obj2).intValue();
                com.waze.ab.a.l.c(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 10:
                ((Integer) obj2).intValue();
                com.waze.location.bg.g((com.waze.main_screen.be) this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 11:
                ((Integer) obj2).intValue();
                com.waze.main_screen.t.al.g((com.waze.main_screen.t.as) this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 12:
                ((Integer) obj2).intValue();
                com.waze.main_screen.aa.c.b((Color) this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 13:
                ((Integer) obj2).intValue();
                com.waze.main_screen.aa.c.a(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ((LocationPreviewActivity) this.f23774b).r((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 15:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-580109235, iIntValue, -1, "com.waze.reports_v2.presentation.createContent.<anonymous> (ConversationalReportingActivationDialog.kt:278)");
                    }
                    Object obj3 = this.f23774b;
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(this.f23773a, composer2, 0), (Modifier) null, com.waze.bz.a.d(composer2, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11016getStarte0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).a(), composer2, 0, 0, 65018);
                    if (obj3 == null) {
                        composer2.startReplaceGroup(914375264);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(914375265);
                        ((Number) obj3).intValue();
                        String strB = com.waze.ui.r.a.c.c.b(((Integer) obj3).intValue(), composer2, 0);
                        if (true == h.n.o.G(strB)) {
                            strB = null;
                        }
                        if (strB == null) {
                            composer2.startReplaceGroup(-1136778465);
                            composer2.endReplaceGroup();
                            composer = composer2;
                        } else {
                            composer2.startReplaceGroup(-1136778464);
                            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer2, 6);
                            int iM11016getStarte0LSkKk = TextAlign.Companion.m11016getStarte0LSkKk();
                            composer = composer2;
                            TextKt.m4275Text4IGK_g(strB, (Modifier) null, com.waze.bz.a.d(composer2, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(iM11016getStarte0LSkKk), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).b(), composer, 0, 0, 65018);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 16:
                ((Integer) obj2).intValue();
                ((ConversationalReportingFteTooltipCompat) this.f23774b).Content((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 17:
                ((Integer) obj2).intValue();
                com.waze.reports_v2.presentation.bx.c(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 18:
                ((Integer) obj2).intValue();
                com.waze.search.b.a(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            case 19:
                ((Integer) obj2).intValue();
                com.waze.sharedrive.g.bf.w(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
            default:
                ((Integer) obj2).intValue();
                com.waze.sharedui.views.ap.o(this.f23774b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | this.f23773a));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ fa(Object obj, int i2, int i3) {
        this.f23775c = i3;
        this.f23774b = obj;
        this.f23773a = i2;
    }
}
