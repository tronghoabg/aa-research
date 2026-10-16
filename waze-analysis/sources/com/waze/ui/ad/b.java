package com.waze.ui.ad;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.processing.util.GLUtils;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.design_components.button.g;
import com.waze.shared_infra.q.k;
import com.waze.strings.DisplayStrings;
import com.waze.ui.ac.f;
import com.waze.ui.ac.j;
import com.waze.ui.ac.m;
import com.waze.ui.r.a.a.i;
import com.waze.ui.r.a.d.d;
import com.waze.z.a.a.h;
import com.waze.z.a.ag;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import com.waze.z.a.o;
import com.waze.z.a.s;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    public static final void a(c cVar, Composer composer, int i2) {
        int i3;
        x.f(cVar, "state");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1598385413);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598385413, i3, -1, "com.waze.ui.uid.AddHomeAndWorkOnboardingScreen (AddHomeAndWork.kt:45)");
            }
            Modifier modifierA = d.a(WindowInsetsPadding_androidKt.safeDrawingPadding(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null)), com.waze.ui.r.a.d.c.dM, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.CC.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                composerStartRestartGroup.startReplaceGroup(-1943672011);
                be.e(new f(R.drawable.t3_add_home_and_work), SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 56.0f, 0.0f, 16.0f, 4, null), 96.0f), null, null, null, composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1943468279);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_TITLE, composerStartRestartGroup, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? 24 : 0, 16.0f, 0.0f, 8, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 0, 0, 65528);
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_SUBTITLE, composerStartRestartGroup, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 32.0f, 2, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).a(), composerStartRestartGroup, 48, 0, 65528);
            i(com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_SET_HOME_BUTTON, composerStartRestartGroup, 0), cVar.a(), com.waze.design_components.b.d.f23304e, com.waze.ui.r.a.d.c.dN, cVar.d(), composerStartRestartGroup, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION);
            i(com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_SET_WORK_BUTTON, composerStartRestartGroup, 0), cVar.b(), com.waze.design_components.b.d.f23309j, com.waze.ui.r.a.d.c.dO, cVar.f(), composerStartRestartGroup, DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION);
            composerStartRestartGroup.endNode();
            Modifier modifierA2 = d.a(PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, 16.0f), com.waze.ui.r.a.d.c.dP, null);
            com.waze.design_components.g.b.i(cVar.c(), cVar.e(), com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_PRIMARY_BUTTON, composerStartRestartGroup, 0), com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_SECONDARY_BUTTON, composerStartRestartGroup, 0), ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? n.g(0.0f, 3) : com.waze.z.a.f.f46033a, modifierA2, null, n.e(g.f23358a, null, null, 6), null, (cVar.a() == null && cVar.b() == null) ? false : true, null, n.e(g.f23360c, null, null, 6), null, false, composerStartRestartGroup, 0, 0, GLUtils.EGL_GL_COLORSPACE_BT2020_HLG_EXT);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(cVar, i2, 9));
        }
    }

    static final ab b(String str, String str2, com.waze.design_components.b.d dVar, com.waze.ui.r.a.d.c cVar, h.g.a.a aVar, int i2, Composer composer) {
        i(str, str2, dVar, cVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final com.waze.ui.ac.n c(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return new j(num.intValue());
    }

    public static final com.waze.ui.ac.n d(String str) {
        if (str == null) {
            return null;
        }
        return new m(str);
    }

    public static final ManagedActivityResultLauncher e(l lVar, Composer composer, int i2) {
        x.f(lVar, "onPermissionState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-185075, i2, -1, "com.waze.utils.compose.rememberPermissionLauncher (ComposablesCompat.kt:37)");
        }
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(lVar)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new com.waze.uid.b(lVar, 3);
            composer.updateRememberedValue(objRememberedValue);
        }
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (l) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return managedActivityResultLauncherRememberLauncherForActivityResult;
    }

    public static final void f(Activity activity, com.waze.shared_infra.j.a aVar, l lVar, Composer composer, int i2) {
        int i3;
        x.f(activity, "activity");
        x.f(aVar, "permissionChecker");
        x.f(lVar, "onPermissionState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1200930539);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(activity) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1200930539, i3, -1, "com.waze.utils.compose.RequestContactsPermissions (ComposablesCompat.kt:20)");
            }
            ManagedActivityResultLauncher managedActivityResultLauncherE = e(lVar, composerStartRestartGroup, (i3 >> 6) & 14);
            ab abVar = ab.f48028a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(activity) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherE) | composerStartRestartGroup.changedInstance(aVar);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new i(activity, managedActivityResultLauncherE, aVar, lVar, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(abVar, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(activity, aVar, lVar, i2, 18));
        }
    }

    public static final /* synthetic */ k g(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2 * 1000);
        x.e(calendar, "apply(...)");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3 * 1000);
        x.e(calendar2, "apply(...)");
        int i2 = calendar.get(1);
        int i3 = calendar2.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar2.get(2);
        int i6 = i3 - i2;
        if (i5 < i4) {
            i6--;
            i5 += 12;
        }
        int actualMaximum = calendar2.get(5);
        int i7 = calendar.get(5);
        int i8 = i5 - i4;
        if (actualMaximum < i7) {
            i8--;
            actualMaximum += calendar.getActualMaximum(5);
        }
        return new k(i6, i8, actualMaximum - i7);
    }

    public static final /* synthetic */ String h(boolean z, k kVar, com.waze.shared_infra.o.a aVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(1, -kVar.c());
        gregorianCalendar.add(2, -kVar.b());
        gregorianCalendar.add(5, -kVar.a());
        gregorianCalendar.add(10, -1);
        return new h.n.l("<DAYS>").b(aVar.c(true != z ? R.string.LAST_UPDATE_DAYS_FORMAT : R.string.LAST_UPDATE_DAYS_SHORT_FORMAT, new Object[0]), String.valueOf(ChronoUnit.DAYS.between(DesugarCalendar.toInstant(gregorianCalendar), DesugarCalendar.toInstant(new GregorianCalendar()))));
    }

    private static final void i(String str, String str2, final com.waze.design_components.b.d dVar, final com.waze.ui.r.a.d.c cVar, h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        String str3;
        String str4;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071097316);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(dVar.ordinal()) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cVar.ordinal()) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            int i5 = i3 << 9;
            int i6 = i3 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1071097316, i3, -1, "com.waze.ui.uid.ActionCellHomeWork (AddHomeAndWork.kt:114)");
            }
            int i7 = i6 | 27648;
            int i8 = i5 & 29360128;
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1747924440);
                Integer numH = dVar.h();
                str3 = str;
                aVar2 = aVar;
                h.b(str3, com.waze.ui.r.a.c.c.b(R.string.ONBOARDING_ADD_HOME_WORK_SET_BUTTON, composerStartRestartGroup, 0), d.a(Modifier.Companion, cVar, null), numH != null ? new com.waze.z.a.a.a(new com.waze.ui.ac.c(numH.intValue()), (s) null, 6) : null, aVar2, composerStartRestartGroup, i7 | i8);
                composerStartRestartGroup.endReplaceGroup();
                str4 = str2;
            } else {
                aVar2 = aVar;
                composerStartRestartGroup.startReplaceGroup(-1747562577);
                Integer numH2 = dVar.h();
                str3 = str;
                str4 = str2;
                h.d(str3, str4, d.a(Modifier.Companion, cVar, null), numH2 != null ? new com.waze.z.a.a.a(new com.waze.ui.ac.c(numH2.intValue()), (s) null, 6) : null, aVar2, composerStartRestartGroup, (i3 & 112) | i7 | i8);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str3 = str;
            str4 = str2;
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str5 = str3;
            final h.g.a.a aVar3 = aVar2;
            final String str6 = str4;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.ui.ad.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return b.b(str5, str6, dVar, cVar, aVar3, i2, (Composer) obj);
                }
            });
        }
    }
}
