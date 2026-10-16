package com.waze.ui.v;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.common.util.WavUtil;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.tide.s;
import com.waze.ui.e.w;
import com.waze.ui.f.aa;
import com.waze.ui.f.ak;
import com.waze.uid.b.m;
import com.waze.uid.c.bm;
import com.waze.uid.d.n;
import com.waze.uid.d.r;
import com.waze.z.a.ag;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {
    public static final void a(l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, Composer composer, int i2) {
        int i3;
        x.f(lVar, "state");
        x.f(aVar, "onBackPressed");
        x.f(aVar2, "approvedClicked");
        x.f(aVar3, "refusedClicked");
        x.f(aVar4, "onBottomLinkClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1448979564);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(lVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1448979564, i3, -1, "com.waze.ui.qr_login.QrLoginScreen (QrLogin.kt:37)");
            }
            if (lVar instanceof h) {
                composerStartRestartGroup.startReplaceGroup(-899949553);
                o((h) lVar, aVar, aVar2, aVar3, aVar4, composerStartRestartGroup, i3 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i5 = i3;
                if (x.n(lVar, k.f43510a)) {
                    composerStartRestartGroup.startReplaceGroup(-899941596);
                    r(aVar, composerStartRestartGroup, (i5 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (x.n(lVar, g.f43506a)) {
                    composerStartRestartGroup.startReplaceGroup(-899939138);
                    m(aVar, composerStartRestartGroup, (i5 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (x.n(lVar, i.f43508a)) {
                    composerStartRestartGroup.startReplaceGroup(-899936800);
                    p(aVar, composerStartRestartGroup, (i5 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!x.n(lVar, j.f43509a)) {
                        composerStartRestartGroup.startReplaceGroup(-899950919);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new h.i();
                    }
                    composerStartRestartGroup.startReplaceGroup(-899934400);
                    q(aVar, composerStartRestartGroup, (i5 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(lVar, aVar, aVar2, aVar3, aVar4, i2, 10));
        }
    }

    static final ab b(h.g.a.a aVar, int i2, Composer composer) {
        m(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab c(h.g.a.a aVar, p pVar, q qVar, int i2, int i3, Composer composer) {
        n(aVar, pVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab d(h hVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2, Composer composer) {
        o(hVar, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab e(h.g.a.a aVar, int i2, Composer composer) {
        p(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab f(h.g.a.a aVar, int i2, Composer composer) {
        q(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab g(h.g.a.a aVar, int i2, Composer composer) {
        r(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void h(Modifier modifier, ak akVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        x.f(akVar, "state");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1040585143);
        int i5 = 2;
        int i6 = 4;
        int i7 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(akVar) : composerStartRestartGroup.changedInstance(akVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            aVar2 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        } else {
            aVar2 = aVar;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040585143, i3, -1, "com.waze.ui.reports.agent.ReportAgentComposable (ReportAgentComposable.kt:33)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1816232722, 0, -1, "com.waze.ui.reports.agent.reportAgentUiProviders (ReportAgentComposable.kt:115)");
            }
            aa aaVarJ = s.j(new com.waze.ui.g(i5), new com.waze.ui.g(3), new com.waze.ui.g(i6), new com.waze.ui.g(5), null, new com.waze.ui.g(6), new com.waze.ui.g(7), new com.waze.ui.g(i7), 0, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            w.c(akVar, modifierFillMaxWidth$default, aVar2, aaVarJ, composerStartRestartGroup, ((i3 >> 3) & 14) | (i3 & DisplayStrings.DS_TAP_TO_VERIFY), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(modifier, akVar, aVar, i2, 12));
        }
    }

    public static final Intent j(Context context, com.waze.shared_infra.o.a aVar, n nVar) {
        x.f(context, "context");
        x.f(aVar, "stringProvider");
        x.f(nVar, "supportPage");
        return com.waze.uid.d.q.f44463a.a().f44466d.a(context, new r(aVar.c(nVar.a(), new Object[0]), true), nVar.c());
    }

    public static final void k(Context context, com.waze.shared_infra.o.a aVar, n nVar) {
        x.f(context, "context");
        x.f(aVar, "stringProvider");
        x.f(nVar, "supportPage");
        try {
            context.startActivity(j(context, aVar, nVar));
        } catch (ActivityNotFoundException e2) {
            com.waze.shared_infra.i.h.f("openContactSupportActivity", "Bad URL configuration for " + nVar.b().j() + ": " + nVar.c(), e2);
        }
    }

    public static final com.waze.uid.d.l l(bm bmVar, m mVar, s sVar, h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(bmVar, "viewType");
        x.f(mVar, "controller");
        x.f(aVar, "onPinCodeTokenCallback");
        x.f(aVar2, "cleanupCallback");
        return new com.waze.uid.d.m(new com.waze.uid.state_impl.email.ab(bmVar, mVar, sVar, aVar, aVar2));
    }

    private static final void m(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1175755485);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1175755485, i3, -1, "com.waze.ui.qr_login.ErrorScreen (QrLogin.kt:220)");
            }
            aVar2 = aVar;
            n(aVar2, null, ComposableLambdaKt.rememberComposableLambda(919782095, true, new com.waze.main_screen.c.d.a(aVar, 9), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(aVar2, i2, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void n(final h.g.a.a r32, h.g.a.p r33, final h.g.a.q r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.v.f.n(h.g.a.a, h.g.a.p, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void o(final h hVar, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, Composer composer, final int i2) {
        int i3;
        h.g.a.a aVar5;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(14785659);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            aVar5 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 16 : 32;
        } else {
            aVar5 = aVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(14785659, i3, -1, "com.waze.ui.qr_login.InitialScreen (QrLogin.kt:95)");
            }
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            composerStartRestartGroup.startReplaceGroup(1324124792);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(1324125625);
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(com.waze.bz.a.d(composerStartRestartGroup, 0).E(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (o) null), null, null, null, 14, null);
            boolean zChangedInstance = ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(uriHandler);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LinkInteractionListener() { // from class: com.waze.ui.v.c
                    @Override // androidx.compose.ui.text.LinkInteractionListener
                    public final void onClick(LinkAnnotation linkAnnotation) {
                        x.f(linkAnnotation, "it");
                        aVar4.invoke();
                        uriHandler.openUri(hVar.a());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("URL", textLinkStyles, (LinkInteractionListener) objRememberedValue));
            try {
                builder.append(com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_BOTTOM_TEXT_LINKED, composerStartRestartGroup, 0));
                builder.pop(iPushLink);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                n(aVar5, ComposableLambdaKt.rememberComposableLambda(-562422250, true, new com.waze.main_screen.o(annotatedString, i5), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-167453145, true, new com.waze.o.d.b.b.b(aVar2, aVar3, 20, null), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | DisplayStrings.DS_DIRT_ROADS, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushLink);
                throw th;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.ui.v.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return f.d(hVar, aVar, aVar2, aVar3, aVar4, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void p(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2145367255);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2145367255, i3, -1, "com.waze.ui.qr_login.LoadingScreen (QrLogin.kt:250)");
            }
            int i5 = a.f43484a;
            aVar2 = aVar;
            n(aVar2, null, a.c(), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(aVar2, i2, 2));
        }
    }

    private static final void q(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1130143394);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1130143394, i3, -1, "com.waze.ui.qr_login.SuccessScreen (QrLogin.kt:264)");
            }
            int i5 = a.f43484a;
            aVar2 = aVar;
            n(aVar2, null, a.b(), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(aVar2, i2, 1));
        }
    }

    private static final void r(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645152928);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645152928, i3, -1, "com.waze.ui.qr_login.UserRefusedScreen (QrLogin.kt:187)");
            }
            int i5 = a.f43484a;
            aVar2 = aVar;
            n(aVar2, null, a.a(), composerStartRestartGroup, (i3 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(aVar2, i2, 0));
        }
    }
}
