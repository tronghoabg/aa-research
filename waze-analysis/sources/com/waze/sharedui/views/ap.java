package com.waze.sharedui.views;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.webkit.WebSettings;
import android.widget.TextView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.R;
import com.waze.fa;
import com.waze.reports_v2.presentation.bq;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bb;
import com.waze.trip_overview.bc;
import com.waze.trip_overview.bg;
import com.waze.trip_overview.bl;
import com.waze.trip_overview.bw;
import com.waze.z.a.be;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.a.aqg;
import l.a.bjz;
import l.a.brd;
import l.a.brf;
import l.a.in;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ap {
    public /* synthetic */ ap(byte[] bArr) {
    }

    public static void a(TextView textView, String str, an anVar) {
        h.g.b.x.f(textView, "<this>");
        Spanned spannedN = com.waze.shared_infra.i.h.n(str);
        h.g.b.x.e(spannedN, "fromHtml(...)");
        Spanned spanned = spannedN;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spanned.length(), URLSpan.class);
        h.g.b.x.c(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            h.g.b.x.c(uRLSpan);
            r(spannableStringBuilder, uRLSpan, anVar);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(TextView textView, int i2) {
        h.g.b.x.f(textView, "<this>");
        textView.setText(com.waze.design_components.g.b.d(textView).c(i2, new Object[0]));
    }

    public static void c(TextView textView, List list) {
        h.g.b.x.f(textView, "<this>");
        h.g.b.x.f(list, "callbacks");
        int size = list.size();
        String[] strArr = new String[size];
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            strArr[i2] = ((com.waze.sharedui.profile.b) list.get(i2)).k();
        }
        Spanned spannedN = com.waze.shared_infra.i.h.n(com.waze.design_components.g.b.d(textView).c(R.string.WELCOME_SCREEN_TERMS_OF_SERVICE_FOOTER_HTML_PS_PS, Arrays.copyOf(strArr, size)));
        h.g.b.x.e(spannedN, "fromHtml(...)");
        Spanned spanned = spannedN;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        if (length == list.size()) {
            for (int i3 = 0; i3 < length; i3++) {
                URLSpan uRLSpan = uRLSpanArr[i3];
                h.g.b.x.e(uRLSpan, "get(...)");
                r(spannableStringBuilder, uRLSpan, ((com.waze.sharedui.profile.b) list.get(i3)).j());
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void d(com.waze.sharedui.web.ao aoVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aoVar, "state");
        h.g.b.x.f(lVar, "onEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(753163108);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aoVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(753163108, i3, -1, "com.waze.sharedui.web.WebPageHeaderLayout (WazeWebViewPage.kt:149)");
            }
            String strC = com.waze.ui.r.a.c.c.c(aoVar.a(), composerStartRestartGroup, 0);
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new bq(lVar, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            be.h(strC, null, (h.g.a.a) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(189490559, true, new com.waze.o.d.b.b.b(aoVar, lVar, 10, null), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24576, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(aoVar, lVar, i2, 8));
        }
    }

    public static void e(String str, Modifier modifier, final com.waze.sharedui.web.m mVar, final boolean z, final boolean z2, final h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        final String str2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        com.waze.main_screen.p.b bVar;
        h.g.b.x.f(str, "url");
        h.g.b.x.f(modifier, "modifier");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1909165082);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(false) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1909165082, i3, -1, "com.waze.sharedui.web.WazeComposeWebView (WazeWebViewPage.kt:175)");
            }
            if (str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    bVar = new com.waze.main_screen.p.b(str, modifier, mVar, z, z2, lVar, i2, 3);
                    scopeUpdateScopeEndRestartGroup.updateScope(bVar);
                }
                return;
            }
            str2 = str;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(null) | ((i3 & 7168) == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new h.g.a.l() { // from class: com.waze.sharedui.web.al
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        h.g.b.x.f(context, "context");
                        WazeWebView wazeWebView = new WazeWebView(context);
                        m mVar2 = mVar;
                        if (mVar2 != null) {
                            WebSettings webSettingsA = wazeWebView.a();
                            if (webSettingsA != null) {
                                webSettingsA.setJavaScriptEnabled(true);
                            }
                            com.waze.settings.q qVarJ = wazeWebView.J();
                            if (qVarJ != null) {
                                qVarJ.b(mVar2.a(), mVar2.b());
                            }
                        }
                        wazeWebView.D(new an(mutableState));
                        return wazeWebView;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean z3 = (i3 & 14) == 4;
            boolean z4 = (3670016 & i3) == 1048576;
            boolean z5 = (458752 & i3) == 131072;
            boolean z6 = (i3 & 29360128) == 8388608;
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((z6 | z3 | z4 | z5) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new h.g.a.l() { // from class: com.waze.sharedui.web.am
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        WazeWebView wazeWebView = (WazeWebView) obj;
                        h.g.b.x.f(wazeWebView, "webView");
                        if (wazeWebView.h() == null) {
                            wazeWebView.t(str2);
                        }
                        if (z2) {
                            wazeWebView.D(null);
                            wazeWebView.s();
                        }
                        if (z) {
                            lVar.invoke(new v(wazeWebView.I()));
                        }
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            AndroidView_androidKt.AndroidView(lVar2, modifierFillMaxSize$default2, (h.g.a.l) objRememberedValue3, composer2, 0, 0);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer2.startReplaceGroup(-1177878381);
                ProgressIndicatorKt.m4151CircularProgressIndicatorLxG7B9w(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter()), com.waze.bz.a.d(composer2, 0).E(), 0.0f, 0L, 0, composer2, 0, 28);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1177740958);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str2 = str;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            bVar = new com.waze.main_screen.p.b(str2, modifier, mVar, z, z2, lVar, i2, 2);
            scopeUpdateScopeEndRestartGroup.updateScope(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(androidx.compose.ui.Modifier r29, com.waze.sharedui.web.aq r30, h.g.a.l r31, com.waze.sharedui.web.m r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.views.ap.f(androidx.compose.ui.Modifier, com.waze.sharedui.web.aq, h.g.a.l, com.waze.sharedui.web.m, androidx.compose.runtime.Composer, int, int):void");
    }

    public static String g(com.waze.bw.a.c.d dVar, com.waze.shared_infra.o.a aVar) {
        String strF;
        String strD;
        h.g.b.x.f(dVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        if (h.g.b.x.n(dVar.b(), com.waze.bw.a.c.k.f17653a)) {
            return aVar.c(R.string.HOME, new Object[0]);
        }
        if (h.g.b.x.n(dVar.b(), com.waze.bw.a.c.m.f17656a)) {
            return aVar.c(R.string.WORK, new Object[0]);
        }
        if ((dVar.b() instanceof com.waze.bw.a.c.l) && ((com.waze.bw.a.c.l) dVar.b()).t().length() > 0) {
            return ((com.waze.bw.a.c.l) dVar.b()).t();
        }
        if (dVar.a().b() != null && dVar.a().b().a().length() > 0) {
            return dVar.a().b().a();
        }
        if (dVar.a().c() != null && (((strF = dVar.a().f()) != null && strF.length() != 0) || ((strD = dVar.a().d()) != null && strD.length() != 0))) {
            return j(dVar.a());
        }
        String strC = dVar.a().c();
        return strC != null ? strC : dVar.a().f();
    }

    public static String h(com.waze.bw.a.c.d dVar) {
        h.g.b.x.f(dVar, "<this>");
        if (dVar.b() == null) {
            com.waze.bw.a.c.o oVarB = dVar.a().b();
            String strA = oVarB != null ? oVarB.a() : null;
            if (strA == null || strA.length() == 0) {
                if (j(dVar.a()) == null) {
                    return null;
                }
                return i(dVar.a());
            }
        }
        com.waze.bw.a.c.c cVarA = dVar.a();
        h.g.b.x.f(cVarA, "<this>");
        String strJ = j(cVarA);
        String strI = i(cVarA);
        if (strI == null) {
            return strJ;
        }
        if (strJ == null) {
            return strI;
        }
        return strJ + ", " + strI;
    }

    public static String i(com.waze.bw.a.c.c cVar) {
        String strG;
        String strE;
        h.g.b.x.f(cVar, "<this>");
        String strC = cVar.c();
        if ((strC == null || strC.length() == 0) && (((strG = cVar.g()) == null || strG.length() == 0) && ((strE = cVar.e()) == null || strE.length() == 0))) {
            return null;
        }
        List listI = h.a.i.i(cVar.c(), cVar.g(), cVar.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        return h.a.i.aM(arrayList, ", ", null, null, 0, null, 62);
    }

    public static String j(com.waze.bw.a.c.c cVar) {
        String strD;
        h.g.b.x.f(cVar, "<this>");
        String strF = cVar.f();
        if (strF == null || strF.length() == 0 || (strD = cVar.d()) == null || strD.length() == 0) {
            return cVar.f();
        }
        return cVar.d() + " " + cVar.f();
    }

    public static /* synthetic */ void l(bl blVar, bb bbVar, bc bcVar, bw bwVar, long j2, bjz bjzVar, int i2) {
        if ((i2 & 2) != 0) {
            bcVar = null;
        }
        blVar.n(bbVar, bcVar, null, bwVar, j2, bjzVar);
    }

    public static /* synthetic */ void n(bl blVar, com.waze.modules.navigation.ah ahVar, long j2, long j3, boolean z, boolean z2, com.waze.modules.navigation.j jVar, bg bgVar, bjz bjzVar, String str, int i2) {
        if ((i2 & 256) != 0) {
            bgVar = null;
        }
        if ((i2 & 1024) != 0) {
            str = null;
        }
        blVar.A(ahVar, j2, j3, z, z2, jVar, bgVar, bjzVar, str);
    }

    public static void o(com.waze.tide.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1221226448);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221226448, i3, -1, "com.waze.tide.presentation.TideBluetoothPermissionDialog (TideBluetoothPermissionDialog.kt:8)");
            }
            if (((Boolean) SnapshotStateKt.collectAsState(aVar.b(), null, composerStartRestartGroup, 0, 1).getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1110683282);
                com.waze.l.v vVarA = aVar.a();
                boolean zE = aVar.e();
                int i5 = i3 & 14;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.settings.d.a(aVar, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                com.waze.l.m.d(vVarA, zE, (h.g.a.a) objRememberedValue, null, composerStartRestartGroup, 0, 8);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1110464174);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(aVar, i2, 20));
        }
    }

    public static /* synthetic */ in p(com.waze.l.t tVar) {
        com.waze.tide.u uVar = com.waze.tide.u.f40959a;
        com.waze.tide.v vVar = com.waze.tide.v.f40964a;
        com.waze.l.t tVar2 = com.waze.l.t.f25123a;
        int iOrdinal = tVar.ordinal();
        if (iOrdinal == 0) {
            return in.BEACONS;
        }
        if (iOrdinal == 1) {
            return in.TIDE;
        }
        throw new h.i();
    }

    public static /* synthetic */ void q(ax axVar, aqg aqgVar) {
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.F(aqgVar);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(axVar, brfVarBuild);
    }

    private static void r(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan, an anVar) {
        spannableStringBuilder.setSpan(new ao(anVar, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    private ap() {
        throw null;
    }
}
