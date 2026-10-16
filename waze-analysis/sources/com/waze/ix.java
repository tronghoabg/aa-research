package com.waze;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.config.ConfigValues;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;
import com.waze.sharedui.web.WazeWebView;
import com.waze.strings.DisplayStrings;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ix {
    public /* synthetic */ ix() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(boolean z) {
        l(z);
        o(true);
    }

    static h.ab a(Modifier modifier, int i2, Composer composer) {
        w(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static void b(final Modifier modifier, final boolean z, final boolean z2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-899247673);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899247673, i3, -1, "com.waze.MapCoverComposable (MapCoverComposable.kt:48)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.legacySwipePadding, composerStartRestartGroup, 0);
            float f2 = (-24.0f) + fDimensionResource;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            float f3 = f2 / 2.0f;
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1381025810);
                w(PaddingKt.m2755padding3ABfNKs(SizeKt.m2822size3ABfNKs(RotateKt.rotate(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 180.0f), fDimensionResource), f3), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1381163233);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1381187227);
                w(PaddingKt.m2755padding3ABfNKs(SizeKt.m2822size3ABfNKs(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterEnd()), fDimensionResource), f3), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1381285249);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.fb
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Modifier modifier2 = modifier;
                    boolean z3 = z;
                    int i5 = i2;
                    ix.b(modifier2, z3, z2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static String c(er erVar) {
        h.g.b.x.f(erVar, "<this>");
        if (h.g.b.x.n(erVar, em.f23661a)) {
            return "consentBump";
        }
        if (erVar instanceof en) {
            return h.n.o.ac("forceUpgrade/{isProjected}", "{isProjected}", String.valueOf(((en) erVar).a()));
        }
        if (h.g.b.x.n(erVar, eo.f23663a)) {
            return "initialising";
        }
        if (h.g.b.x.n(erVar, ep.f23664a)) {
            return "mainMobile";
        }
        if (h.g.b.x.n(erVar, eq.f23665a)) {
            return "mainProjected";
        }
        throw new h.i();
    }

    public static String d(er erVar) {
        h.g.b.x.f(erVar, "<this>");
        if (h.g.b.x.n(erVar, em.f23661a)) {
            return "consentBump";
        }
        if (erVar instanceof en) {
            return "forceUpgrade/{isProjected}";
        }
        if (h.g.b.x.n(erVar, eo.f23663a)) {
            return "initialising";
        }
        if (h.g.b.x.n(erVar, ep.f23664a)) {
            return "mainMobile";
        }
        if (h.g.b.x.n(erVar, eq.f23665a)) {
            return "mainProjected";
        }
        throw new h.i();
    }

    protected static void e() {
        com.waze.app_nav.w wVarX = x();
        com.waze.main_screen.u uVar = com.waze.main_screen.u.f27645a;
        com.waze.alerters.a.k.c(wVarX, com.waze.main_screen.u.c().a(), com.waze.app_nav.ah.f15182a);
    }

    protected static void f() {
        x().d();
    }

    public static Intent g(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static void h(Activity activity, int i2) {
        activity.startActivityForResult(g(activity), i2);
    }

    public static void i(boolean z, List list) {
        int i2 = com.waze.sharedui.b.b.f38833a;
        int i3 = com.waze.sharedui.b.d.f38836a;
        com.waze.sharedui.b.c.a().reportAuditEvent(new com.waze.sharedui.b.a(i.b.a.p.WAZE_GO_INVISIBLE, i.b.a.m.SETTINGS_MENU, z ? i.b.a.o.ENABLED : i.b.a.o.DISABLED, "", list));
    }

    public static void j() {
        NativeManager.runOnNativeManagerReady(new com.google.android.gms.common.api.internal.bc(7));
    }

    public static void k(boolean z, List list) {
        int i2 = com.waze.sharedui.b.b.f38833a;
        int i3 = com.waze.sharedui.b.d.f38836a;
        com.waze.sharedui.b.c.a().reportAuditEvent(new com.waze.sharedui.b.a(i.b.a.p.WAZE_PERSONALIZED_ADS_PERMISSION, i.b.a.m.POP_UP, z ? i.b.a.o.ENABLED : i.b.a.o.DISABLED, "", list));
    }

    public static void l(boolean z) {
        ConfigManager.getInstance().setConfigValueBool(ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING, z);
        NativeManager.getInstance().SetPrivacyConsentApproved(new com.google.android.gms.common.api.internal.bc(6));
        List listAsList = Arrays.asList(Integer.valueOf(R.string.PRIVACY_ADS_CONSENT_TITLE), Integer.valueOf(R.string.PRIVACY_ADS_CONSENT_TEXT), Integer.valueOf(R.string.PRIVACY_ADS_CONSENT_NOT_PERSONALIZED_BUTTON), Integer.valueOf(R.string.PRIVACY_ADS_CONSENT_PERSONALIZED_BUTTON));
        int i2 = com.waze.sharedui.b.b.f38833a;
        int i3 = com.waze.sharedui.b.d.f38836a;
        com.waze.sharedui.b.c.a().reportAuditEvent(new com.waze.sharedui.b.a(i.b.a.p.WAZE_PERSONALIZED_ADS_PERMISSION, i.b.a.m.POP_UP, z ? i.b.a.o.ENABLED : i.b.a.o.DISABLED, "", listAsList));
    }

    public static boolean m(Context context) {
        if (n(context)) {
            return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        }
        boolean configValueBool = ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_PRIVACY_USE_LOCATION_IN_BG);
        com.waze.shared_infra.i.h.a("PrivacyManager: IsLocationInBackgroundEnabled: " + configValueBool);
        return configValueBool;
    }

    public static boolean n(Context context) {
        return context.getSharedPreferences("pref.privacy", 0).getBoolean("hasCheckedAndroidQLocationPermission", false);
    }

    public static void o(final boolean z) {
        com.waze.shared_infra.i.h.h("ShowAndroidQLocationPopupIfNeeded");
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null) {
            MainActivity.B(new df() { // from class: com.waze.kp
                @Override // com.waze.df
                public final void a(MainActivity mainActivity) {
                    ix.o(z);
                }
            });
            return;
        }
        int i2 = 0;
        SharedPreferences sharedPreferences = mainActivityC.getSharedPreferences("pref.privacy", 0);
        if (!sharedPreferences.getBoolean("hasCheckedAndroidQLocationPermission", false) && !ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_PRIVACY_USE_LOCATION_IN_BG) && ContextCompat.checkSelfPermission(mainActivityC, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
            com.waze.ab.o oVar = new com.waze.ab.o();
            oVar.Q(aVarA.c(R.string.PRIVACY_ANDROID_Q_LOCATION_POPUP_TITLE, new Object[0]));
            oVar.P(aVarA.c(R.string.PRIVACY_ANDROID_Q_LOCATION_POPUP_TEXT, new Object[0]));
            oVar.M(aVarA.c(R.string.PRIVACY_ANDROID_Q_LOCATION_POPUP_YES_TEXT, new Object[0]));
            oVar.N(aVarA.c(R.string.PRIVACY_ANDROID_Q_LOCATION_POPUP_NO_TEXT, new Object[0]));
            oVar.R(true);
            oVar.f13808a = new dc(mainActivityC, 2);
            oVar.H(new kq(i2));
            oVar.y(false);
            com.waze.z.a.d.ai.q(oVar);
        }
        sharedPreferences.edit().putBoolean("hasCheckedAndroidQLocationPermission", true).apply();
    }

    public static Object v(iu iuVar, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        iuVar.loadServerEnv(new com.airbnb.lottie.b.q(completableDeferredJ, 5));
        return completableDeferredJ.c(eVar);
    }

    private static void w(Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1633384489);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633384489, i3, -1, "com.waze.BackIcon (MapCoverComposable.kt:66)");
            }
            modifier2 = modifier;
            IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.T.c(com.waze.design_components.b.e.f23313b), composerStartRestartGroup, 0), (String) null, modifier2, com.waze.bz.a.d(composerStartRestartGroup, 0).f(), composerStartRestartGroup, Painter.$stable | 48 | ((i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(modifier2, i2, i5));
        }
    }

    private static com.waze.app_nav.w x() {
        return com.waze.app_nav.w.f15441a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context) {
        NativeManager.getInstance();
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        WazeTextView wazeTextView = new WazeTextView(lm.d().e());
        wazeTextView.setText(aVarA.c(R.string.PRIVACY_ADS_CONSENT_PRIVACY_POLICY, new Object[0]));
        wazeTextView.setTextColor(wazeTextView.getResources().getColor(R.color.primary));
        wazeTextView.setTextSize(2, 16.0f);
        wazeTextView.setPaintFlags(wazeTextView.getPaintFlags() | 8);
        wazeTextView.setGravity(17);
        wazeTextView.setClickable(true);
        wazeTextView.setOnClickListener(new com.google.android.material.datepicker.ac(wazeTextView, 3));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int iH = com.waze.ui.z.as.h(context.getResources(), 10);
        layoutParams.setMargins(iH, iH, iH, 0);
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVarA.c(R.string.PRIVACY_ADS_CONSENT_TITLE, new Object[0]));
        oVar.P(aVarA.c(R.string.PRIVACY_ADS_CONSENT_TEXT, new Object[0]));
        oVar.f13808a = new km(0);
        oVar.M(aVarA.c(R.string.PRIVACY_ADS_CONSENT_PERSONALIZED_BUTTON, new Object[0]));
        oVar.N(aVarA.c(R.string.PRIVACY_ADS_CONSENT_NOT_PERSONALIZED_BUTTON, new Object[0]));
        oVar.R(true);
        oVar.S(wazeTextView);
        oVar.B(layoutParams);
        oVar.y(true);
        oVar.H(new kq(1));
        com.waze.z.a.d.ai.q(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(com.waze.b.u uVar) {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null) {
            return;
        }
        Dialog dialog = new Dialog(eVarE, R.style.PopInDialog);
        try {
            dialog.setContentView(R.layout.gdpr_consent_bump);
            dialog.getWindow().setLayout(-1, -1);
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            OvalButton ovalButton = (OvalButton) dialog.findViewById(R.id.nextButton);
            TextView textView = (TextView) dialog.findViewById(R.id.nextButtonText);
            ScrollView scrollView = (ScrollView) dialog.findViewById(R.id.consentScrollView);
            textView.setText(com.waze.shared_infra.o.b.a().c(R.string.CONSENT_BUMP_NEXT_BUTTON, new Object[0]));
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(201326592);
                window.getDecorView().setSystemUiVisibility(DisplayStrings.DS_BEACONS_TURN_ON_BLUETOOTH_TITLE);
                window.setNavigationBarColor(0);
                window.setStatusBarColor(0);
                View viewFindViewById = dialog.findViewById(R.id.consentContainer);
                if (viewFindViewById != null) {
                    final int paddingBottom = viewFindViewById.getPaddingBottom();
                    final int paddingTop = viewFindViewById.getPaddingTop();
                    ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.waze.kl
                        @Override // androidx.core.view.OnApplyWindowInsetsListener
                        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                            int i2 = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL).bottom;
                            view.setPadding(view.getPaddingLeft(), paddingTop + windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL).top, view.getPaddingRight(), paddingBottom + i2);
                            return windowInsetsCompat;
                        }
                    });
                }
            }
            com.google.android.libraries.phenotype.client.stable.x xVar = new com.google.android.libraries.phenotype.client.stable.x(eVarE, dialog, 6, null);
            WazeWebView wazeWebView = (WazeWebView) dialog.findViewById(R.id.consentView);
            wazeWebView.D(new ks(xVar, dialog));
            wazeWebView.setVisibility(0);
            wazeWebView.G(R.color.transparent);
            String strC = com.waze.shared_infra.o.b.a().c(R.string.CONSENT_BUMP_MAIN_TEXT, new Object[0]);
            String strReplace = wazeWebView.getResources().getString(R.color.content_default).replace("#ff", "#");
            wazeWebView.H(strC.replace("#4C4C4C", strReplace).replace("#717171", strReplace));
            Handler handler = new Handler();
            bl blVar = new bl(scrollView, handler, 19, (byte[]) null);
            handler.postDelayed(blVar, 4000L);
            ovalButton.setOnClickListener(new kr(handler, blVar, dialog, uVar));
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Could not create show privacy consent bump", e2);
        }
    }

    ix(byte[] bArr) {
    }

    public /* synthetic */ ix(byte[] bArr, char[] cArr) {
    }
}
