package com.waze.car_lib.r;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.CarContext;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class bq {
    public bq() {
    }

    public static void h(CarContext carContext, Intent intent) {
        h.g.b.x.f(carContext, "<this>");
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        carContext.startActivity(intent, ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle());
    }

    public static boolean i(CarContext carContext) {
        h.g.b.x.f(carContext, "<this>");
        return carContext.getCarAppApiLevel() >= 7;
    }

    public static boolean j(CarContext carContext) {
        h.g.b.x.f(carContext, "<this>");
        return carContext.getCarAppApiLevel() <= 7;
    }

    public static void k(CarContext carContext) {
        h.g.b.x.f(carContext, "<this>");
        h.g.b.x.f("android.settings.APPLICATION_DETAILS_SETTINGS", "settingsAction");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", carContext.getPackageName(), null));
        intent.setFlags(268435456);
        h(carContext, intent);
    }

    public static void l(Modifier modifier, Composer composer, int i2) {
        Modifier.Companion companion;
        int i3 = i2 | 6;
        boolean z = (i3 & 3) != 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1842239542);
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1842239542, i3, -1, "com.waze.companinio.ui.mobile.ExperimentBubble (ExperimentBubble.kt:30)");
            }
            long jColorResource = ColorResources_androidKt.colorResource(R.color.experimental_background, composerStartRestartGroup, 0);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.experimental_foreground, composerStartRestartGroup, 0);
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(ClipKt.clip(BorderKt.m1983borderxT4_qwU(BackgroundKt.m1971backgroundbw27NRU(com.waze.design_components.d.b.h(companion, RoundedCornerShapeKt.getCircleShape()), jColorResource, RoundedCornerShapeKt.getCircleShape()), 1.0f, Color.m8227copywmQWz5c$default(jColorResource, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape()), null, null, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(Modifier.Companion, 8.0f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2441spacedByD5KLDUw(5.0f, Alignment.Companion.getCenterHorizontally()), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.companinio, composerStartRestartGroup, 0), com.waze.ui.r.a.c.c.b(R.string.COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, composerStartRestartGroup, 0), SizeKt.m2822size3ABfNKs(Modifier.Companion, 15.0f), jColorResource2, composerStartRestartGroup, Painter.$stable | 384, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, composerStartRestartGroup, 0), (Modifier) companion2, jColorResource2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).b(), composerStartRestartGroup, 48, 0, 65016);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            companion = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.fa(companion, i2, 4));
        }
    }

    public static /* synthetic */ com.waze.o.d.a.s m(com.waze.t.b.bw bwVar) {
        if (h.g.b.x.n(bwVar, com.waze.t.b.bu.f40761a)) {
            return com.waze.o.d.a.p.f32864a;
        }
        if (h.g.b.x.n(bwVar, com.waze.t.b.bt.f40760a)) {
            return com.waze.o.d.a.l.f32860a;
        }
        if (bwVar instanceof com.waze.t.b.br) {
            return com.waze.o.d.a.o.f32863a;
        }
        if (bwVar instanceof com.waze.t.b.bp) {
            return com.waze.o.d.a.k.f32859a;
        }
        if (bwVar instanceof com.waze.t.b.bo) {
            return com.waze.o.d.a.m.f32861a;
        }
        if (bwVar instanceof com.waze.t.b.bq) {
            return ((com.waze.t.b.bq) bwVar).c() != null ? com.waze.o.d.a.r.f32866a : com.waze.o.d.a.q.f32865a;
        }
        throw new h.i();
    }

    public boolean f() {
        throw null;
    }

    public /* synthetic */ bq(short[] sArr) {
    }
}
