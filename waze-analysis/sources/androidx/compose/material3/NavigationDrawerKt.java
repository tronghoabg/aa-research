package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationDrawerKt {
    private static final TweenSpec<Float> AnchoredDraggableDefaultAnimationSpec = new TweenSpec<>(256, 0, null, 6, null);
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = 400.0f;
    private static final float MinimumDrawerWidth = 240.0f;
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = 12.0f;
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = 24.0f;
    private static final float PredictiveBackDrawerMaxScaleYDistance = 48.0f;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1664a = 0;

    public static /* synthetic */ boolean $r8$lambda$13JMe1l6kN6y5ryAMThr9VBcGZs(DrawerValue drawerValue) {
        return true;
    }

    public static /* synthetic */ float $r8$lambda$JTzl3xWHZ37yIMxKF6wq5_Q5_Zk() {
        return 0.0f;
    }

    public static /* synthetic */ boolean $r8$lambda$MOJhqdVusFQGx8KQz07FKTWlwdA(DrawerState drawerState, af afVar) {
        DismissibleNavigationDrawer$lambda$6$0$0$0$0(drawerState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$bhebIJ8w9Ytv9hqew5Qk1kPFv9k(DrawerState drawerState, af afVar) {
        ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0(drawerState, afVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5275DismissibleDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r20, androidx.compose.ui.Modifier r21, androidx.compose.ui.graphics.Shape r22, long r23, long r25, float r27, androidx.compose.foundation.layout.WindowInsets r28, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5275DismissibleDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5276DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5276DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab DismissibleDrawerSheet_Snr_uVM$lambda$0(WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, final DrawerState drawerState, q qVar, DrawerPredictiveBackState drawerPredictiveBackState, Composer composer, int i2) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        int i3;
        if ((i2 & 6) == 0) {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i3 = i2 | (true != composer.changed(drawerPredictiveBackState2) ? 2 : 4);
        } else {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623455535, i3, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
            }
            boolean zChanged = composer.changed(drawerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda4
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0(drawerState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m5277DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j2, j3, f2, (FloatProducer) objRememberedValue, qVar, composer, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState drawerState) {
        return drawerState.getAnchoredDraggableState$material3().getOffset();
    }

    static final ab DismissibleDrawerSheet_Snr_uVM$lambda$1(DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5275DismissibleDrawerSheetSnr_uVM(drawerState, modifier, shape, j2, j3, f2, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab DismissibleDrawerSheet_afqeVBk$lambda$0(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5276DismissibleDrawerSheetafqeVBk(modifier, shape, j2, j3, f2, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DismissibleNavigationDrawer(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.ui.Modifier r28, androidx.compose.material3.DrawerState r29, boolean r30, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DismissibleNavigationDrawer$lambda$4$0(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DismissibleNavigationDrawer$lambda$6$0$0$0(String str, final DrawerState drawerState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda18
                @Override // h.g.a.a
                public final Object invoke() {
                    NavigationDrawerKt.$r8$lambda$MOJhqdVusFQGx8KQz07FKTWlwdA(drawerState, afVar);
                    return true;
                }
            }, 1, null);
        }
        return ab.f48028a;
    }

    private static final boolean DismissibleNavigationDrawer$lambda$6$0$0$0$0(DrawerState drawerState, af afVar) {
        if (!drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new NavigationDrawerKt$DismissibleNavigationDrawer$3$1$1$1$1$1(drawerState, null), 3);
        return true;
    }

    static final ab DismissibleNavigationDrawer$lambda$7(p pVar, Modifier modifier, DrawerState drawerState, boolean z, p pVar2, int i2, int i3, Composer composer, int i4) {
        DismissibleNavigationDrawer(pVar, modifier, drawerState, z, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final q<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        int i4;
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-383087355);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(drawerState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 16 : 32;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-383087355, i6, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.kt:995)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new DrawerPredictiveBackState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            af afVar = (af) objRememberedValue2;
            boolean z = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            an anVar = new an();
            an anVar2 = new an();
            an anVar3 = new an();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            anVar.f48102a = density.mo2127toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            anVar2.f48102a = density.mo2127toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            anVar3.f48102a = density.mo2127toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean z2 = drawerState.getTargetValue() == DrawerValue.Open;
            boolean zChanged = composerStartRestartGroup.changed(anVar.f48102a) | composerStartRestartGroup.changed(z) | composerStartRestartGroup.changed(anVar2.f48102a) | composerStartRestartGroup.changed(anVar3.f48102a) | composerStartRestartGroup.changedInstance(afVar);
            int i7 = i6 & 14;
            boolean z3 = i7 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChanged || z3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i4 = i7;
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, afVar, drawerState, z, anVar, anVar2, anVar3, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawerKt$DrawerPredictiveBackHandler$2$1);
            } else {
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = objRememberedValue3;
                i4 = i7;
            }
            BackHandler_androidKt.PredictiveBackHandler(z2, (p) navigationDrawerKt$DrawerPredictiveBackHandler$2$1, composerStartRestartGroup, 0, 0);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            NavigationDrawerKt$DrawerPredictiveBackHandler$3$1 navigationDrawerKt$DrawerPredictiveBackHandler$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i4 == 4 || navigationDrawerKt$DrawerPredictiveBackHandler$3$1RememberedValue == Composer.Companion.getEmpty()) {
                navigationDrawerKt$DrawerPredictiveBackHandler$3$1RememberedValue = new NavigationDrawerKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawerKt$DrawerPredictiveBackHandler$3$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) navigationDrawerKt$DrawerPredictiveBackHandler$3$1RememberedValue, composerStartRestartGroup, 0);
            qVar.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((i6 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationDrawerKt.DrawerPredictiveBackHandler$lambda$4(drawerState, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DrawerPredictiveBackHandler$lambda$4(DrawerState drawerState, q qVar, int i2, Composer composer, int i3) {
        DrawerPredictiveBackHandler(drawerState, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* renamed from: DrawerSheet-cm3T3N0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5277DrawerSheetcm3T3N0(final androidx.compose.material3.DrawerPredictiveBackState r32, final androidx.compose.foundation.layout.WindowInsets r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, float r40, androidx.compose.material3.internal.FloatProducer r41, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5277DrawerSheetcm3T3N0(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.material3.internal.FloatProducer, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float DrawerSheet_cm3T3N0$lambda$0$0() {
        return 0.0f;
    }

    static final ab DrawerSheet_cm3T3N0$lambda$2(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, float f2, FloatProducer floatProducer, float f3, WindowInsets windowInsets, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-315420087, i2, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:881)");
            }
            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(horizontalScaleDown(SizeKt.m2826sizeInqDBjuR0$default(Modifier.Companion, MinimumDrawerWidth, 0.0f, f2, 0.0f, 10, null), floatProducer, f3, z).then(drawerPredictiveBackState != null ? predictiveBackDrawerChild(Modifier.Companion, drawerPredictiveBackState, z) : Modifier.Companion), windowInsets);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = NavigationDrawerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierWindowInsetsPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DrawerSheet_cm3T3N0$lambda$3(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, FloatProducer floatProducer, q qVar, int i2, int i3, Composer composer, int i4) {
        m5277DrawerSheetcm3T3N0(drawerPredictiveBackState, windowInsets, modifier, shape, j2, j3, f2, floatProducer, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5278ModalDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, float r33, androidx.compose.foundation.layout.WindowInsets r34, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5278ModalDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5279ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5279ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ModalDrawerSheet_Snr_uVM$lambda$0(WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, final DrawerState drawerState, q qVar, DrawerPredictiveBackState drawerPredictiveBackState, Composer composer, int i2) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        int i3;
        if ((i2 & 6) == 0) {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i3 = i2 | (true != composer.changed(drawerPredictiveBackState2) ? 2 : 4);
        } else {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(797187326, i3, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:697)");
            }
            boolean zChanged = composer.changed(drawerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda8
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$0$0$0(drawerState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m5277DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j2, j3, f2, (FloatProducer) objRememberedValue, qVar, composer, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState drawerState) {
        return drawerState.getAnchoredDraggableState$material3().getOffset();
    }

    static final ab ModalDrawerSheet_Snr_uVM$lambda$1(DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5278ModalDrawerSheetSnr_uVM(drawerState, modifier, shape, j2, j3, f2, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ModalDrawerSheet_afqeVBk$lambda$0(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5279ModalDrawerSheetafqeVBk(modifier, shape, j2, j3, f2, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5280ModalNavigationDrawerFHprtrg(h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.DrawerState r34, boolean r35, long r36, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5280ModalNavigationDrawerFHprtrg(h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    static final ab ModalNavigationDrawer_FHprtrg$lambda$10(p pVar, Modifier modifier, DrawerState drawerState, boolean z, long j2, p pVar2, int i2, int i3, Composer composer, int i4) {
        m5280ModalNavigationDrawerFHprtrg(pVar, modifier, drawerState, z, j2, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalNavigationDrawer_FHprtrg$lambda$7$0(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        drawerState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalNavigationDrawer_FHprtrg$lambda$9$1$0(boolean z, DrawerState drawerState, af afVar) {
        if (z && drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            aj.z(afVar, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$onDismissRequest$1$1$1(drawerState, null), 3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$9$2$0(float f2, DrawerState drawerState, MutableFloatState mutableFloatState) {
        return calculateFraction(ModalNavigationDrawer_FHprtrg$lambda$4(mutableFloatState), f2, drawerState.requireOffset$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ModalNavigationDrawer_FHprtrg$lambda$9$3$0(DrawerState drawerState, Density density) {
        return IntOffset.m11287boximpl((!Float.isNaN(drawerState.getCurrentOffset()) ? h.h.a.b(r0) : drawerState.isOpen() ? 0 : -density.mo2121roundToPx0680j_4(DrawerDefaults.INSTANCE.m4789getMaximumDrawerWidthD9Ej5fM())) << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalNavigationDrawer_FHprtrg$lambda$9$4$0(String str, final DrawerState drawerState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda22
                @Override // h.g.a.a
                public final Object invoke() {
                    NavigationDrawerKt.$r8$lambda$bhebIJ8w9Ytv9hqew5Qk1kPFv9k(drawerState, afVar);
                    return true;
                }
            }, 1, null);
        }
        return ab.f48028a;
    }

    private static final boolean ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0(DrawerState drawerState, af afVar) {
        if (!drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$4$1$1$1(drawerState, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationDrawerItem(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, final boolean r34, final h.g.a.a<h.ab> r35, androidx.compose.ui.Modifier r36, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.ui.graphics.Shape r39, androidx.compose.material3.NavigationDrawerItemColors r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(h.g.a.p, boolean, h.g.a.a, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab NavigationDrawerItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10323getTabo7Vup1c());
        return ab.f48028a;
    }

    static final ab NavigationDrawerItem$lambda$1(p pVar, NavigationDrawerItemColors navigationDrawerItemColors, boolean z, p pVar2, p pVar3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1173018444, i2, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:1144)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 24.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
            int iM = NavigationDrawerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar != null) {
                composer.startReplaceGroup(-2013920011);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(navigationDrawerItemColors.iconColor(z, composer, 0).getValue().m8238unboximpl())), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 12.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2013707630);
                composer.endReplaceGroup();
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = NavigationDrawerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(navigationDrawerItemColors.textColor(z, composer, 0).getValue().m8238unboximpl())), (p<? super Composer, ? super Integer, ab>) pVar3, composer, ProvidedValue.$stable);
            composer.endNode();
            if (pVar2 != null) {
                composer.startReplaceGroup(-2013454639);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 12.0f), composer, 6);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(navigationDrawerItemColors.badgeColor(z, composer, 0).getValue().m8238unboximpl())), (p<? super Composer, ? super Integer, ab>) pVar2, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2013238414);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab NavigationDrawerItem$lambda$2(p pVar, boolean z, a aVar, Modifier modifier, p pVar2, p pVar3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        NavigationDrawerItem(pVar, z, aVar, modifier, pVar2, pVar3, shape, navigationDrawerItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5281PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m5281PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PermanentDrawerSheet_afqeVBk$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab PermanentDrawerSheet_afqeVBk$lambda$1(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m5281PermanentDrawerSheetafqeVBk(modifier, shape, j2, j3, f2, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void PermanentNavigationDrawer(final p<? super Composer, ? super Integer, ab> pVar, Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(89297160);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(89297160, i4, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:615)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iM = NavigationDrawerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i4 & 14));
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = NavigationDrawerKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationDrawerKt.PermanentNavigationDrawer$lambda$1(pVar, modifier2, pVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab PermanentNavigationDrawer$lambda$1(p pVar, Modifier modifier, p pVar2, int i2, int i3, Composer composer, int i4) {
        PermanentNavigationDrawer(pVar, modifier, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f2, float f3, float f4) {
        return n.g((f4 - f2) / (f3 - f2), 0.0f, 1.0f);
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return ((drawerPredictiveBackState.getScaleXDistance() * (true != drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? -1 : 1)) / fIntBitsToFloat) + 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / fIntBitsToFloat);
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }

    private static final Modifier horizontalScaleDown(Modifier modifier, final FloatProducer floatProducer, final float f2, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt.horizontalScaleDown$lambda$0(floatProducer, f2, z, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab horizontalScaleDown$lambda$0(FloatProducer floatProducer, float f2, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float fInvoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(fInvoke > 0.0f ? 1.0f / ((fInvoke / f2) + 1.0f) : 1.0f);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true == z ? 0.0f : 1.0f, 0.0f));
        return ab.f48028a;
    }

    private static final Modifier horizontalScaleUp(Modifier modifier, final FloatProducer floatProducer, final float f2, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda23
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt.horizontalScaleUp$lambda$0(floatProducer, f2, z, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab horizontalScaleUp$lambda$0(FloatProducer floatProducer, float f2, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float fInvoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(fInvoke > 0.0f ? (fInvoke / f2) + 1.0f : 1.0f);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true != z ? 1.0f : 0.0f, 0.5f));
        return ab.f48028a;
    }

    private static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda21
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt.predictiveBackDrawerChild$lambda$0(drawerPredictiveBackState, z, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab predictiveBackDrawerChild$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float fCalculatePredictiveBackScaleX = calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
        graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / fCalculatePredictiveBackScaleX);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true == z ? 0.0f : 1.0f, 0.0f));
        return ab.f48028a;
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda30
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NavigationDrawerKt.predictiveBackDrawerContainer$lambda$0(drawerPredictiveBackState, z, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab predictiveBackDrawerContainer$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true != z ? 0.0f : 1.0f, 0.5f));
        return ab.f48028a;
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final l<? super DrawerValue, Boolean> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        int i4 = NavigationDrawerKt.f1664a;
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i2, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:307)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(lVar);
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(drawerValue.ordinal())) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(lVar)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda7
                @Override // h.g.a.a
                public final Object invoke() {
                    return NavigationDrawerKt.rememberDrawerState$lambda$1$0(drawerValue, lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }

    private static final boolean rememberDrawerState$lambda$0$0(DrawerValue drawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawerState rememberDrawerState$lambda$1$0(DrawerValue drawerValue, l lVar) {
        return new DrawerState(drawerValue, lVar);
    }
}
