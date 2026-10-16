package com.waze.ui.j;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.ui.r.a.d.c;
import com.waze.ui.r.a.d.d;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import com.waze.z.a.c.q;
import com.waze.z.a.d.ad;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class h {
    public /* synthetic */ h(byte[] bArr) {
    }

    static ab a(State state, RowScope rowScope, Composer composer, int i2) {
        x.f(rowScope, "$this$Button");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(rowScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747856298, i2, -1, "com.waze.ui.hamburger_button.FlatHamburgerButton.<anonymous> (HamburgerButton.kt:125)");
            }
            l(rowScope, ((i) state.getValue()).b(), composer, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(androidx.compose.ui.Modifier r22, com.waze.ui.j.j r23, h.g.a.a r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.j.h.b(androidx.compose.ui.Modifier, com.waze.ui.j.j, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    static ab c(ColumnScope columnScope, float f2, int i2, Composer composer) {
        k(columnScope, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static void d(i iVar, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        boolean z;
        h.g.a.a aVar3;
        x.f(iVar, "hamburgerButtonState");
        x.f(aVar, "onClick");
        x.f(aVar2, "onLongClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1359666049);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1359666049, i3, -1, "com.waze.ui.hamburger_button.HamburgerButton (HamburgerButton.kt:80)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(com.waze.design_components.d.b.k(SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cK, null), 56.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).j(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f)), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f));
            IndicationNodeFactory indicationNodeFactoryM4169rippleH2RKhps$default = RippleKt.m4169rippleH2RKhps$default(false, 0.0f, 0L, 7, null);
            if (true != iVar.a()) {
                z = false;
                aVar3 = aVar;
            } else {
                z = false;
                aVar3 = aVar2;
            }
            boolean z2 = z;
            composer2 = composerStartRestartGroup;
            Modifier modifierM2011combinedClickableauXiCPI$default = ClickableKt.m2011combinedClickableauXiCPI$default(modifierClip, mutableInteractionSource, indicationNodeFactoryM4169rippleH2RKhps$default, false, null, null, null, aVar3, null, false, aVar, DisplayStrings.DS_STANDSTILL, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), z2);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, z2 ? 1 : 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM2011combinedClickableauXiCPI$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, z2 ? 1 : 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, z2 ? 1 : 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            l(RowScopeInstance.INSTANCE, iVar.b(), composer2, 6);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(iVar, modifier, aVar, aVar2, i2, 17, null));
        }
    }

    static ab e(RowScope rowScope, boolean z, int i2, Composer composer) {
        l(rowScope, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab f(int i2, Composer composer) {
        m(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static ab h(BoxScope boxScope, boolean z, int i2, Composer composer) {
        n(boxScope, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static void i(final boolean z, final h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        x.f(aVar, "onUpdateButtonClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1009210984);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009210984, i3, -1, "com.waze.ui.force_upgrade.ForceUpgradeScreenLayout (ForceUpgradeScreenLayout.kt:30)");
            }
            SurfaceKt.m4216SurfaceFjzlyU(null, null, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-787360548, true, new p() { // from class: com.waze.ui.i.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-787360548, iIntValue, -1, "com.waze.ui.force_upgrade.ForceUpgradeScreenLayout.<anonymous> (ForceUpgradeScreenLayout.kt:35)");
                        }
                        Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), WindowInsetsKt.union(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer2, 6), WindowInsetsKt.m2848WindowInsetsa9UjIt4(16.0f, 16.0f, 16.0f, 24.0f)));
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWindowInsetsPadding);
                        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                            composer2.startReplaceGroup(-496578717);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_t3_cp_group_work, composer2, 0), (String) null, d.a(Modifier.Companion, c.dZ, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-496350960);
                            composer2.endReplaceGroup();
                        }
                        boolean z2 = z;
                        TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(true != z2 ? R.string.MOBILE_FORCE_UPGRADE_TITLE : R.string.MOBILE_FORCE_UPGRADE_WITH_NO_CTA_BUTTON_BECAUSE_OLD_OS_TITLE, composer2, 0), d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), c.dW, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer2).e(), composer2, 48, 0, 65532);
                        TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(true != z2 ? R.string.MOBILE_FORCE_UPGRADE_MESSAGE : R.string.MOBILE_FORCE_UPGRADE_WITH_NO_CTA_BUTTON_BECAUSE_OLD_OS_MESSAGE, composer2, 0), d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 4.0f, 0.0f, 0.0f, 13, null), c.dX, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer2).a(), composer2, 48, 0, 65532);
                        SpacerKt.Spacer(ColumnScope.CC.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                        if (z2) {
                            composer2.startReplaceGroup(-495512720);
                            composer2.endReplaceGroup();
                        } else {
                            h.g.a.a aVar2 = aVar;
                            composer2.startReplaceGroup(-495774360);
                            be.o(aVar2, d.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), c.dY, null), com.waze.ui.r.a.c.c.b(R.string.MOBILE_FORCE_UPGRADE_UPDATE_BUTTON, composer2, 0), null, null, null, false, false, composer2, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.t.p(z, aVar, i2, 6));
        }
    }

    public static void j(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        x.f(aVar, "onLeaveConfirmed");
        x.f(aVar2, "onDismissed");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1703132155);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1703132155, i3, -1, "com.waze.ui.shared_drive.ConfirmLeaveSharingDrive (ConfirmLeaveShareDriveDialog.kt:15)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_STOP_SHARING_CONFIRMATION_DIALOG_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_STOP_SHARING_CONFIRMATION_DIALOG_LEAVE_CTA_TITLE, composerStartRestartGroup, 0), n.e(com.waze.design_components.button.g.f23358a, null, com.waze.design_components.button.e.f23350b, 2), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_STOP_SHARING_CONFIRMATION_DIALOG_DISMISS_CTA_TITLE, composerStartRestartGroup, 0), n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12), false);
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar, aVar2, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.g gVar = (com.waze.z.a.c.g) objRememberedValue;
            int i5 = com.waze.ui.z.a.f43856a;
            q.c(strB, aVar3, gVar, aVar2, null, com.waze.ui.z.a.a(), composerStartRestartGroup, ((i3 << 6) & 7168) | 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(aVar, aVar2, i2, 16));
        }
    }

    private static void k(final ColumnScope columnScope, final float f2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-499758890);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(columnScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-499758890, i3, -1, "com.waze.ui.hamburger_button.Bar (HamburgerButton.kt:158)");
            }
            BoxKt.Box(BackgroundKt.m1971backgroundbw27NRU(columnScope.align(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, f2, 2.0f), Alignment.Companion.getStart()), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(1.0f)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.ui.j.c
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return h.c(columnScope, f2, i2, (Composer) obj);
                }
            });
        }
    }

    private static void l(RowScope rowScope, boolean z, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-336630701);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(rowScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336630701, i3, -1, "com.waze.ui.hamburger_button.HamburgerIcon (HamburgerButton.kt:130)");
            }
            State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(true != z ? 24.0f : 11.0f, AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), "hamburgerTopBarWidth", null, composerStartRestartGroup, 384, 8);
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(rowScope.align(Modifier.Companion, Alignment.Companion.getCenterVertically()), 56.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2822size3ABfNKs);
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
            n(boxScopeInstance, z, composerStartRestartGroup, (i3 & 112) | DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT);
            Modifier modifierAlign = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenter());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            k(columnScopeInstance, stateM1867animateDpAsStateAjpBEmI.getValue().m11178unboximpl(), composerStartRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 4.0f), composerStartRestartGroup, 6);
            k(columnScopeInstance, 24.0f, composerStartRestartGroup, 54);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 4.0f), composerStartRestartGroup, 6);
            k(columnScopeInstance, 24.0f, composerStartRestartGroup, 54);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(rowScope, z, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(438130895);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(438130895, i2, -1, "com.waze.ui.hamburger_button.NotificationDot (HamburgerButton.kt:193)");
            }
            BoxKt.Box(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).a(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.ui.j.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return h.f(i2, (Composer) obj);
                }
            });
        }
    }

    private static void n(BoxScope boxScope, boolean z, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1264476546);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(200) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1264476546, i3, -1, "com.waze.ui.hamburger_button.AnimatedNotificationDot (HamburgerButton.kt:171)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(boxScope.align(Modifier.Companion, Alignment.Companion.getTopEnd()), 0.0f, 16.0f, 16.0f, 0.0f, 9, null);
            EnterTransition enterTransitionExpandIn$default = EnterExitTransitionKt.expandIn$default(AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), Alignment.Companion.getCenter(), false, null, 12, null);
            ExitTransition exitTransitionShrinkOut$default = EnterExitTransitionKt.shrinkOut$default(AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), Alignment.Companion.getCenter(), false, null, 12, null);
            int i5 = b.f42402a;
            AnimatedVisibilityKt.AnimatedVisibility(z, modifierM2759paddingqDBjuR0$default, enterTransitionExpandIn$default, exitTransitionShrinkOut$default, (String) null, (h.g.a.q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab>) b.a(), composerStartRestartGroup, 196608 | ((i3 >> 3) & 14), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(boxScope, z, i2, 1));
        }
    }

    private h() {
        throw null;
    }
}
