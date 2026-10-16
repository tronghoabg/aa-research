package com.waze.z.a.d;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.car_lib.ar;
import com.waze.lm;
import com.waze.map.gu;
import com.waze.navigate.fr;
import com.waze.navigate.location_preview.ba;
import com.waze.strings.DisplayStrings;
import com.waze.ui.z.as;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ai {
    public /* synthetic */ ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(al alVar, boolean z, boolean z2, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        long jColor;
        long jA;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(649048871);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(649048871, i3, -1, "com.waze.design_components_compose.components.search_field.StatusChip (SearchField.kt:1065)");
            }
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(965715598);
                jColor = com.waze.bz.a.d(composerStartRestartGroup, 0).E();
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(965716728);
                composerStartRestartGroup.endReplaceGroup();
                jColor = ColorKt.Color(4293848814L);
            } else {
                composerStartRestartGroup.startReplaceGroup(965718008);
                composerStartRestartGroup.endReplaceGroup();
                jColor = ColorKt.Color(4294572537L);
            }
            Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(ClickableKt.m2007clickableoSLSa3U$default(BackgroundKt.m1971backgroundbw27NRU(companion, jColor, RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(16.0f)), z2, null, null, null, aVar, 14, null), 12.0f, 6.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
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
            String strName = alVar.name();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-983979374);
                composerStartRestartGroup.endReplaceGroup();
                jA = Color.Companion.m8265getWhite0d7_KjU();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(-983977893);
                jA = com.waze.bz.a.d(composerStartRestartGroup, 0).o();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-983976299);
                jA = com.waze.bz.a.d(composerStartRestartGroup, 0).A();
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(strName, (Modifier) null, jA, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composer2, 0, 0, 65530);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new z(alVar, z, z2, aVar, i2, 0));
        }
    }

    private static void B(an anVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(792043307);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(anVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(792043307, i3, -1, "com.waze.design_components_compose.components.search_field.TrailingIconPart (SearchField.kt:482)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new d(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 48);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.asks.ak(anVar, aVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-787398941);
                int i7 = i3 & 112;
                h.ab abVar = h.ab.f48028a;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (i7 == 32 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = (h.g.a.p) new ah(lVar, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i7 == 32 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new ar(lVar, mutableState, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                h.g.a.a aVar3 = (h.g.a.a) objRememberedValue5;
                boolean zChangedInstance = (i7 == 32) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    Object bVar = new com.waze.ads.c.b(lVar, context, managedActivityResultLauncherRememberLauncherForActivityResult, mutableState, 2);
                    composerStartRestartGroup.updateRememberedValue(bVar);
                    objRememberedValue6 = bVar;
                }
                w(aVar3, (h.g.a.a) objRememberedValue6, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-786764681);
                composerStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new d(3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = new d(4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            AnimatedContentKt.AnimatedContent(anVar, null, lVar2, null, null, (h.g.a.l) objRememberedValue8, ComposableLambdaKt.rememberComposableLambda(-2084550269, true, new t(aVar, context, managedActivityResultLauncherRememberLauncherForActivityResult2, aVar2, mutableState, 0), composerStartRestartGroup, 54), composer2, 1769856 | i6, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u(anVar, lVar, aVar, aVar2, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ContentTransform C(AnimatedContentTransitionScope animatedContentTransitionScope) {
        h.g.b.x.f(animatedContentTransitionScope, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m1752scaleInL8ZKhE$default(AnimationSpecKt.spring$default(0.75f, 400.0f, null, 4, null), 0.0f, 0L, 6, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m1754scaleOutL8ZKhE$default(AnimationSpecKt.spring$default(0.75f, 400.0f, null, 4, null), 0.0f, 0L, 6, null)));
    }

    private static void D(final Modifier modifier, final h.g.a.p pVar, final h.g.a.p pVar2, final h.g.a.a aVar, final h.g.a.p pVar3, Composer composer, final int i2) {
        int i3;
        h.g.a.a aVar2;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-165772849);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            aVar2 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-165772849, i3, -1, "com.waze.design_components_compose.components.search_field.SearchFieldLayout (SearchField.kt:357)");
            }
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(modifier, 56.0f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m4216SurfaceFjzlyU(ClickableKt.m2003clickableO2vRcR0$default(modifierM2808height3ABfNKs, (MutableInteractionSource) objRememberedValue, null, false, null, Role.m10309boximpl(Role.Companion.m10316getButtono7Vup1c()), aVar2, 12, null), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(32.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1133070355, true, new h.g.a.p() { // from class: com.waze.z.a.d.r
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1133070355, iIntValue, -1, "com.waze.design_components_compose.components.search_field.SearchFieldLayout.<anonymous> (SearchField.kt:371)");
                        }
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 4.0f, 0.0f, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM2757paddingVpY3zN4$default);
                        h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        h.g.a.p pVar4 = pVar;
                        Updater.m7351setimpl(composer3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer3, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer3, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer3, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (pVar4 == null) {
                            composer3.startReplaceGroup(496801610);
                        } else {
                            composer3.startReplaceGroup(496801611);
                            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 12.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM2759paddingqDBjuR0$default);
                            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Updater.m7351setimpl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m7351setimpl(composer3, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Updater.m7351setimpl(composer3, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                            Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                            Updater.m7351setimpl(composer3, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            pVar4.invoke(composer3, 0);
                            composer3.endNode();
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM2757paddingVpY3zN4$default2 = PaddingKt.m2757paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), 12.0f, 0.0f, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
                        int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM2757paddingVpY3zN4$default2);
                        h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        h.g.a.p pVar5 = pVar3;
                        h.g.a.p pVar6 = pVar2;
                        Updater.m7351setimpl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m7351setimpl(composer3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Updater.m7351setimpl(composer3, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                        Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                        Updater.m7351setimpl(composer3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        pVar5.invoke(composer3, 0);
                        composer3.endNode();
                        if (pVar6 == null) {
                            composer3.startReplaceGroup(497049517);
                        } else {
                            composer3.startReplaceGroup(497049518);
                            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 4.0f, 0.0f, 11, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM2759paddingqDBjuR0$default2);
                            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Updater.m7351setimpl(composer3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m7351setimpl(composer3, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Updater.m7351setimpl(composer3, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                            Updater.m7349reconcileimpl(composer3, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                            Updater.m7351setimpl(composer3, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            pVar6.invoke(composer3, 0);
                            composer3.endNode();
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composer2, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.d.s
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.j(modifier, pVar, pVar2, aVar, pVar3, i2, (Composer) obj);
                }
            });
        }
    }

    private static com.waze.shared_infra.i.e E(org.a.d.k.b bVar) {
        org.a.d.i.b bVarF = com.waze.ch.a.a.f.f("com.waze.map.main.MainMapFragmentDi.UNIQUE");
        int i2 = h.g.b.ar.f48106a;
        return (com.waze.shared_infra.i.e) bVar.a(new h.g.b.m(com.waze.shared_infra.i.e.class), bVarF, null);
    }

    public static /* synthetic */ h.ab c(an anVar, h.g.a.l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1222503447, i2, -1, "com.waze.design_components_compose.components.search_field.SearchField.<anonymous>.<anonymous> (SearchField.kt:237)");
            }
            boolean zChanged = composer.changed(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.authentication.am(lVar, 19);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChanged2 = composer.changed(lVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.authentication.am(lVar, 20);
                composer.updateRememberedValue(objRememberedValue2);
            }
            B(anVar, lVar, aVar, (h.g.a.a) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(String str, h.g.a.l lVar, AnimatedContentScope animatedContentScope, an anVar, Composer composer, int i2) {
        h.g.b.x.f(animatedContentScope, "$this$AnimatedContent");
        h.g.b.x.f(anVar, "targetState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1560293187, i2, -1, "com.waze.design_components_compose.components.search_field.SearchField.<anonymous>.<anonymous>.<anonymous> (SearchField.kt:267)");
        }
        if (anVar instanceof ak) {
            composer.startReplaceGroup(-1736621843);
            z((ak) anVar, str, lVar, composer, (i2 >> 3) & 14);
            composer.endReplaceGroup();
        } else {
            if (!(anVar instanceof am)) {
                composer.startReplaceGroup(498167468);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-1736496355);
            y(((am) anVar).a(), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    static h.ab e(h.g.a.a aVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, h.g.a.a aVar2, MutableState mutableState, AnimatedContentScope animatedContentScope, an anVar, Composer composer, int i2) {
        com.waze.z.a.e.c cVar;
        h.g.b.x.f(animatedContentScope, "$this$AnimatedContent");
        h.g.b.x.f(anVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2084550269, i2, -1, "com.waze.design_components_compose.components.search_field.TrailingIconPart.<anonymous> (SearchField.kt:539)");
        }
        if (anVar instanceof ak) {
            composer.startReplaceGroup(95165001);
            aj ajVarA = ((ak) anVar).a();
            boolean z = true;
            if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(anVar)) && (i2 & 48) != 32) {
                z = false;
            }
            boolean zChanged = composer.changed(aVar) | z | composer.changedInstance(context) | composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new y(anVar, aVar, context, managedActivityResultLauncher, mutableState, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            x(ajVarA, (h.g.a.a) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(anVar instanceof am)) {
                composer.startReplaceGroup(-1798046797);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(96126280);
            al alVarA = ((am) anVar).a();
            al alVar = al.f45928a;
            switch (alVarA.ordinal()) {
                case 0:
                    cVar = com.waze.z.a.e.c.f46025a;
                    break;
                case 1:
                    cVar = com.waze.z.a.e.c.f46026b;
                    break;
                case 2:
                    cVar = com.waze.z.a.e.c.f46027c;
                    break;
                case 3:
                    cVar = com.waze.z.a.e.c.f46028d;
                    break;
                case 4:
                    cVar = com.waze.z.a.e.c.f46029e;
                    break;
                case 5:
                    cVar = com.waze.z.a.e.c.f46030f;
                    break;
                case 6:
                    cVar = com.waze.z.a.e.c.f46031g;
                    break;
                default:
                    throw new h.i();
            }
            com.waze.z.a.e.b.a(cVar, aVar, com.waze.main_screen.ac.b.a(SizeKt.m2822size3ABfNKs(Modifier.Companion, 42.0f), aVar2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    static h.ab f(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        w(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(androidx.compose.ui.Modifier r25, final java.lang.String r26, java.lang.String r27, final com.waze.z.a.d.ao r28, final h.g.a.a r29, final h.g.a.l r30, h.g.a.a r31, h.g.a.l r32, h.g.a.p r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.d.ai.g(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, com.waze.z.a.d.ao, h.g.a.a, h.g.a.l, h.g.a.a, h.g.a.l, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void h(an anVar, h.g.a.l lVar, Modifier modifier, String str, h.g.a.p pVar, Composer composer, int i2) {
        int i3;
        h.g.a.p pVar2;
        h.g.b.x.f(anVar, "state");
        h.g.b.x.f(lVar, "onEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-986596514);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(anVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            pVar2 = pVar;
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 8192 : 16384;
        } else {
            pVar2 = pVar;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986596514, i3, -1, "com.waze.design_components_compose.components.search_field.SearchField (SearchField.kt:229)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM8394graphicsLayer56HxDYs$default = GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1044479, null);
            h.g.b.x.f(modifierM8394graphicsLayer56HxDYs$default, "<this>");
            h.g.b.x.f(anVar, "state");
            Modifier modifierComposed$default = ComposedModifierKt.composed$default(modifierM8394graphicsLayer56HxDYs$default, null, new com.waze.ads.c.a(anVar, 13), 1, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1222503447, true, new com.waze.v.a(anVar, lVar, 5), composerStartRestartGroup, 54);
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.authentication.am(lVar, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            D(modifierComposed$default, pVar2, composableLambdaRememberComposableLambda, (h.g.a.a) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(73951467, true, new com.waze.c.e.x(anVar, str, lVar, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 112) | 24960);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(anVar, lVar, modifier, str, pVar, i2, 3));
        }
    }

    static h.ab i(aj ajVar, h.g.a.a aVar, int i2, Composer composer) {
        x(ajVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab j(Modifier modifier, h.g.a.p pVar, h.g.a.p pVar2, h.g.a.a aVar, h.g.a.p pVar3, int i2, Composer composer) {
        D(modifier, pVar, pVar2, aVar, pVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab k(al alVar, int i2, Composer composer) {
        y(alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab l(ak akVar, String str, h.g.a.l lVar, int i2, Composer composer) {
        z(akVar, str, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab m(al alVar, boolean z, boolean z2, h.g.a.a aVar, int i2, Composer composer) {
        A(alVar, z, z2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab n(an anVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        B(anVar, lVar, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static com.waze.z.a.b.ab p(com.waze.z.a.b.ad adVar, com.waze.z.a.b.m mVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            adVar = com.waze.z.a.b.ad.f45734b;
        }
        if ((i3 & 2) != 0) {
            mVar = com.waze.z.a.b.n.b(null, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 7);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(520679581, i2, -1, "com.waze.design_components_compose.components.bottom_sheet.rememberWazeBottomSheetState (WazeBottomSheetState.kt:21)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new com.waze.z.a.b.ab(adVar, mVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        com.waze.z.a.b.ab abVar = (com.waze.z.a.b.ab) objRememberedValue;
        abVar.r(AnchoredDraggableDefaults.INSTANCE.flingBehavior(abVar.d(), null, null, composer, (AnchoredDraggableDefaults.$stable << 9) | 6, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return abVar;
    }

    public static Dialog q(com.waze.ab.o oVar) {
        return r(oVar, null);
    }

    public static Dialog r(com.waze.ab.o oVar, com.waze.sharedui.a.e eVar) {
        if (eVar == null) {
            eVar = lm.d().e();
        }
        if (eVar == null || !eVar.aK()) {
            return null;
        }
        com.waze.ab.s sVar = new com.waze.ab.s(eVar, oVar);
        eVar.aI(sVar);
        sVar.show();
        return sVar;
    }

    public static void s(com.waze.sharedui.a.e eVar, com.waze.shared_infra.o.a aVar) {
        if (ba.g(eVar) || eVar == null || !eVar.aK()) {
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
        oVar.P(aVar.c(R.string.NETWORK_CONNECTION_PROBLEMS__PLEASE_TRY_AGAIN_LATER_, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        r(oVar, eVar);
    }

    public static /* synthetic */ int t(Resources resources, gu guVar) {
        gu guVar2 = gu.f29181a;
        int i2 = -32;
        switch (guVar.ordinal()) {
            case 0:
            case 1:
            case 9:
            case 11:
            case 12:
                i2 = 0;
                break;
            case 2:
            case 3:
            case 4:
            case 7:
                break;
            case 5:
            case 6:
                i2 = -38;
                break;
            case 8:
            case 10:
                i2 = -24;
                break;
            default:
                throw new h.i();
        }
        return as.h(resources, i2);
    }

    public static /* synthetic */ com.waze.map.g.g u(org.a.d.k.b bVar, org.a.d.h.a aVar) {
        h.g.b.x.f(bVar, "$this$factory");
        h.g.b.x.f(aVar, "it");
        int i2 = h.g.b.ar.f48106a;
        com.waze.map.isolated.k kVar = (com.waze.map.isolated.k) bVar.a(new h.g.b.m(com.waze.map.isolated.k.class), null, null);
        com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
        com.waze.map.g.h hVar = (com.waze.map.g.h) bVar.a(new h.g.b.m(com.waze.map.g.h.class), null, null);
        com.waze.map.ai aiVar = (com.waze.map.ai) bVar.a(new h.g.b.m(com.waze.map.ai.class), null, null);
        com.waze.map.g.t tVar = (com.waze.map.g.t) bVar.a(new h.g.b.m(com.waze.map.g.t.class), null, null);
        com.waze.map.g.f fVar = (com.waze.map.g.f) bVar.a(new h.g.b.m(com.waze.map.g.f.class), null, null);
        com.waze.shared_infra.i.e eVarE = E(bVar);
        int i3 = av.f51370a;
        return new com.waze.map.g.g(kVar, eVar, hVar, aiVar, tVar, fVar, eVarE, kotlinx.coroutines.e.ac.f51860a, (com.waze.map.g.x) bVar.a(new h.g.b.m(com.waze.map.g.x.class), null, null), (fr) bVar.a(new h.g.b.m(fr.class), null, null));
    }

    public static /* synthetic */ com.waze.shared_infra.i.e v(org.a.d.k.b bVar, org.a.d.h.a aVar) {
        h.g.b.x.f(bVar, "$this$scoped");
        h.g.b.x.f(aVar, "it");
        return E(bVar);
    }

    private static void w(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-711239999);
        int i5 = 4;
        int i6 = 1;
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
                ComposerKt.traceEventStart(-711239999, i3, -1, "com.waze.design_components_compose.components.search_field.MicPermissionDialog (SearchField.kt:644)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.SEARCH_MATE_MIC_PERMISSION_DIALOG_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SEARCH_MATE_MIC_PERMISSION_DIALOG_GO_TO_SETTINGS, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SEARCH_MATE_MIC_PERMISSION_DIALOG_NOT_NOW, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar2, aVar, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i7 = e.f45945a;
            com.waze.z.a.c.q.c(strB, aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar, null, e.r(), composerStartRestartGroup, 196608 | ((i3 << 9) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(aVar, aVar2, i2, i6));
        }
    }

    private static void x(aj ajVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1943148913);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(ajVar == null ? -1 : ajVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1943148913, i3, -1, "com.waze.design_components_compose.components.search_field.SearchFieldIdleAction (SearchField.kt:584)");
            }
            if (ajVar == null) {
                composerStartRestartGroup.startReplaceGroup(781165837);
                composerStartRestartGroup.endReplaceGroup();
                aVar2 = aVar;
            } else {
                al alVar = al.f45928a;
                int iOrdinal = ajVar.ordinal();
                if (iOrdinal == 0) {
                    aVar2 = aVar;
                    composerStartRestartGroup.startReplaceGroup(780162398);
                    int i6 = e.f45945a;
                    IconButtonKt.IconButton(aVar2, null, false, null, e.s(), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    int i7 = ((i3 >> 3) & 14) | 24576;
                    composerStartRestartGroup.startReplaceGroup(780459223);
                    h.k kVar = ajVar.ordinal() != 2 ? new h.k(Integer.valueOf(com.waze.design_components.b.d.ac.b()), 0) : new h.k(Integer.valueOf(com.waze.design_components.b.d.ad.b()), -4);
                    final int iIntValue = ((Number) kVar.a()).intValue();
                    final int iIntValue2 = ((Number) kVar.b()).intValue();
                    aVar2 = aVar;
                    IconButtonKt.IconButton(aVar2, null, false, null, ComposableLambdaKt.rememberComposableLambda(294267540, true, new h.g.a.p() { // from class: com.waze.z.a.d.ac
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (composer2.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(294267540, iIntValue3, -1, "com.waze.design_components_compose.components.search_field.SearchFieldIdleAction.<anonymous> (SearchField.kt:604)");
                                }
                                ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composer2, 0), (String) null, OffsetKt.m2715offsetVpY3zN4$default(Modifier.Companion, iIntValue2, 0.0f, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return h.ab.f48028a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, i7, 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (iOrdinal != 3) {
                        composerStartRestartGroup.startReplaceGroup(-944665097);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new h.i();
                    }
                    int i8 = (i3 >> 3) & 14;
                    composerStartRestartGroup.startReplaceGroup(780919232);
                    Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(Modifier.Companion, 40.0f);
                    int i9 = e.f45945a;
                    aVar2 = aVar;
                    IconButtonKt.IconButton(aVar2, modifierM2822size3ABfNKs, false, null, e.t(), composerStartRestartGroup, i8 | 24624, 12);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(ajVar, aVar2, i2, i5));
        }
    }

    private static void y(final al alVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        boolean z;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(747589727);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(747589727, i3, -1, "com.waze.design_components_compose.components.search_field.SearchMateCenterBars (SearchField.kt:428)");
            }
            int i5 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                aj ajVar = aj.f45920a;
                al alVar2 = al.f45928a;
                switch (alVar.ordinal()) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                        z = false;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        z = true;
                        break;
                    default:
                        throw new h.i();
                }
                objRememberedValue = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            com.airbnb.lottie.b.w wVarD = com.airbnb.lottie.b.an.d(com.airbnb.lottie.b.ab.b(R.raw.search_mate_agent_bars_listening), composerStartRestartGroup);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            com.airbnb.lottie.b.o.b(a.a.G(wVarD), com.waze.ui.r.a.d.d.a(RowScopeInstance.INSTANCE.weight(SizeKt.m2808height3ABfNKs(Modifier.Companion, 24.0f), 1.0f, false), com.waze.ui.r.a.d.c.ee, null), zBooleanValue, false, 0.0f, Integer.MAX_VALUE, null, true, null, null, ContentScale.Companion.getFit(), false, null, composerStartRestartGroup, 1572864, 196656, 0, 2062264);
            composer2 = composerStartRestartGroup;
            al alVar3 = al.f45928a;
            composer2.startReplaceGroup(-1408045793);
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.d.v
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.k(alVar, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void z(final com.waze.z.a.d.ak r68, final java.lang.String r69, final h.g.a.l r70, androidx.compose.runtime.Composer r71, final int r72) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.d.ai.z(com.waze.z.a.d.ak, java.lang.String, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public /* synthetic */ ai(byte[] bArr, byte[] bArr2) {
    }
}
