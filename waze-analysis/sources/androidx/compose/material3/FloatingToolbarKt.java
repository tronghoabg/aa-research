package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.k.f;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FloatingToolbarKt {
    private static final ProvidableCompositionLocal<HorizontalFloatingToolbarOverride> LocalHorizontalFloatingToolbarOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda10
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultHorizontalFloatingToolbarOverride.INSTANCE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<HorizontalFloatingToolbarWithFabOverride> LocalHorizontalFloatingToolbarWithFabOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda11
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultHorizontalFloatingToolbarWithFabOverride.INSTANCE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<VerticalFloatingToolbarOverride> LocalVerticalToolbarOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda12
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultVerticalFloatingToolbarOverride.INSTANCE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<VerticalFloatingToolbarWithFabOverride> LocalVerticalToolbarWithFabOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda13
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultVerticalFloatingToolbarWithFabOverride.INSTANCE;
        }
    }, 1, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.FloatingToolbarKt$settleFloatingToolbar$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingToolbarKt.settleFloatingToolbar(null, 0.0f, null, null, this);
        }
    }

    /* renamed from: $r8$lambda$2k_yTQaXIPb-PHEBVHamy2dzW8Y, reason: not valid java name */
    public static /* synthetic */ boolean m4938$r8$lambda$2k_yTQaXIPbPHEBVHamy2dzW8Y(l lVar) {
        VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$3d-n-HDwzqa4ZqWIgEx01D3gtlM, reason: not valid java name */
    public static /* synthetic */ boolean m4939$r8$lambda$3dnHDwzqa4ZqWIgEx01D3gtlM(l lVar) {
        HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$FiDHnW_ow-hAMNYh7De4l8GtcW8, reason: not valid java name */
    public static /* synthetic */ boolean m4940$r8$lambda$FiDHnW_owhAMNYh7De4l8GtcW8(l lVar) {
        HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$PTKFiVro-v8rzSOhueAL3BbNBNg, reason: not valid java name */
    public static /* synthetic */ boolean m4941$r8$lambda$PTKFiVrov8rzSOhueAL3BbNBNg(l lVar) {
        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$f83W-8rXn-EsPMb4nRnUploHLm8, reason: not valid java name */
    public static /* synthetic */ boolean m4943$r8$lambda$f83W8rXnEsPMb4nRnUploHLm8(l lVar) {
        HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(lVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$huVKtQ12ZRJaoOm7rBlnGun30BU(l lVar) {
        VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$lg0MKf-Z_NLN_9OmfrNzCQM5VJA, reason: not valid java name */
    public static /* synthetic */ boolean m4944$r8$lambda$lg0MKfZ_NLN_9OmfrNzCQM5VJA(l lVar) {
        VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0(lVar);
        return true;
    }

    /* renamed from: $r8$lambda$rR0MNI-0RZh4ufpexbHm6IPQZKQ, reason: not valid java name */
    public static /* synthetic */ boolean m4945$r8$lambda$rR0MNI0RZh4ufpexbHm6IPQZKQ(l lVar) {
        VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1(lVar);
        return true;
    }

    public static final FloatingToolbarState FloatingToolbarState(float f2, float f3, float f4) {
        return new FloatingToolbarStateImpl(f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* renamed from: HorizontalFloatingToolbar-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4947HorizontalFloatingToolbarLJWHXA8(final boolean r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.FloatingToolbarColors r30, androidx.compose.foundation.layout.PaddingValues r31, androidx.compose.material3.FloatingToolbarScrollBehavior r32, androidx.compose.ui.graphics.Shape r33, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, float r36, float r37, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarKt.m4947HorizontalFloatingToolbarLJWHXA8(boolean, androidx.compose.ui.Modifier, androidx.compose.material3.FloatingToolbarColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.FloatingToolbarScrollBehavior, androidx.compose.ui.graphics.Shape, h.g.a.q, h.g.a.q, float, float, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* renamed from: HorizontalFloatingToolbar-ekznXB8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4948HorizontalFloatingToolbarekznXB8(final boolean r31, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.FloatingToolbarColors r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.material3.FloatingToolbarScrollBehavior r36, androidx.compose.ui.graphics.Shape r37, int r38, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r39, float r40, float r41, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarKt.m4948HorizontalFloatingToolbarekznXB8(boolean, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.material3.FloatingToolbarColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.FloatingToolbarScrollBehavior, androidx.compose.ui.graphics.Shape, int, androidx.compose.animation.core.FiniteAnimationSpec, float, float, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HorizontalFloatingToolbarLayout-yndP2WQ, reason: not valid java name */
    public static final void m4949HorizontalFloatingToolbarLayoutyndP2WQ(final Modifier modifier, final boolean z, final l<? super Boolean, ab> lVar, final FloatingToolbarColors floatingToolbarColors, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar2, final float f2, float f3, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar3, Composer composer, final int i2, final int i3) {
        int i4;
        float f4;
        float f5;
        int i5;
        Composer composer2;
        Modifier.Companion companionFloatingScrollBehavior;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1009218538);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(floatingToolbarColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(paddingValues) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(floatingToolbarScrollBehavior) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(shape) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            f4 = f2;
            i4 |= true != composerStartRestartGroup.changed(f4) ? 268435456 : 536870912;
        } else {
            f4 = f2;
        }
        if ((i3 & 6) == 0) {
            f5 = f3;
            i5 = i3 | (true != composerStartRestartGroup.changed(f5) ? 2 : 4);
        } else {
            f5 = f3;
            i5 = i3;
        }
        int i7 = i5;
        if ((i3 & 48) == 0) {
            i5 = i7 | (true != composerStartRestartGroup.changedInstance(qVar3) ? 16 : 32);
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009218538, i4, i5, "androidx.compose.material3.HorizontalFloatingToolbarLayout (FloatingToolbar.kt:1593)");
            }
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_expand, composerStartRestartGroup, 0);
            final String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_collapse, composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, (i4 >> 3) & 14);
            final State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(true != z ? f5 : f4, FloatingToolbarDefaults.INSTANCE.animationSpec(composerStartRestartGroup, 6), null, null, composerStartRestartGroup, 0, 12);
            if (floatingToolbarScrollBehavior == null || (companionFloatingScrollBehavior = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.Companion)) == null) {
                companionFloatingScrollBehavior = Modifier.Companion;
            }
            Modifier modifierThen = modifier.then(companionFloatingScrollBehavior);
            boolean zChanged = ((i4 & 3670016) == 1048576) | composerStartRestartGroup.changed(stateM1867animateDpAsStateAjpBEmI);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda20
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0(shape, stateM1867animateDpAsStateAjpBEmI, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierPadding = PaddingKt.padding(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2810heightInVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(modifierThen, (l) objRememberedValue), FloatingToolbarDefaults.INSTANCE.m4905getContainerSizeD9Ej5fM(), 0.0f, 2, null), floatingToolbarColors.m4894getToolbarContainerColor0d7_KjU(), shape), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(floatingToolbarColors.m4895getToolbarContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-113592250, true, new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda21
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0(qVar, stateRememberUpdatedState, lVar, strM6375getString2EP1pXo, strM6375getString2EP1pXo2, z, qVar2, qVar3, rowScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            final float f6 = f5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5(modifier, z, lVar, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f6, qVar3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float HorizontalFloatingToolbarLayout_yndP2WQ$lambda$1(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$1(state)));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0(final q qVar, final State state, final l lVar, final String str, final String str2, boolean z, final q qVar2, q qVar3, RowScope rowScope, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        if (composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-113592250, i2, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous> (FloatingToolbar.kt:1621)");
            }
            if (qVar == null) {
                composer2.startReplaceGroup(407549954);
                composer2.endReplaceGroup();
                i3 = 0;
            } else {
                composer2.startReplaceGroup(407549955);
                i3 = 0;
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.horizontalEnterTransition(Alignment.Companion.getStart(), composer2, 54), FloatingToolbarDefaults.INSTANCE.horizontalExitTransition(Alignment.Companion.getEnd(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-119614617, true, new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda35
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(qVar, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer, 1572864, 18);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer2.changed(state) | composer2.changed(lVar) | composer2.changed(str) | composer2.changed(str2);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda36
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(str, str2, state, lVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierMinimumInteractiveBalancedPadding = minimumInteractiveBalancedPadding(ChildParentSemanticsKt.parentSemantics(companion, (l) objRememberedValue), (!z || qVar == null) ? i3 : 1, (!z || qVar2 == null) ? i3 : 1, MaterialTheme.INSTANCE.getMotionScheme(composer2, 6).defaultEffectsSpec());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, i3);
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i3));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierMinimumInteractiveBalancedPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar3.invoke(RowScopeInstance.INSTANCE, composer2, 6);
            composer2.endNode();
            if (qVar2 == null) {
                composer2.startReplaceGroup(409301826);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(409301827);
                AnimatedVisibilityKt.AnimatedVisibility(rowScope, HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.horizontalEnterTransition(Alignment.Companion.getEnd(), composer2, 54), FloatingToolbarDefaults.INSTANCE.horizontalExitTransition(Alignment.Companion.getStart(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-1208541936, true, new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda37
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingToolbarKt.HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(qVar2, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer2, 1572864, 18);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-119614617, i2, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1627)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
        int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        qVar.invoke(RowScopeInstance.INSTANCE, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(String str, String str2, State state, final l lVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(HorizontalFloatingToolbarLayout_yndP2WQ$lambda$0(state), new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda17
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4943$r8$lambda$f83W8rXnEsPMb4nRnUploHLm8(lVar);
                return true;
            }
        }, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda18
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4941$r8$lambda$PTKFiVrov8rzSOhueAL3BbNBNg(lVar);
                return true;
            }
        }, str, str2));
        return ab.f48028a;
    }

    private static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(l lVar) {
        lVar.invoke(false);
        return true;
    }

    private static final boolean HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(l lVar) {
        lVar.invoke(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1208541936, i2, -1, "androidx.compose.material3.HorizontalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1662)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
        int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        qVar.invoke(RowScopeInstance.INSTANCE, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab HorizontalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier modifier, boolean z, l lVar, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q qVar, q qVar2, float f2, float f3, q qVar3, int i2, int i3, Composer composer, int i4) {
        m4949HorizontalFloatingToolbarLayoutyndP2WQ(modifier, z, lVar, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f3, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HorizontalFloatingToolbarWithFabLayout-z3vpotQ, reason: not valid java name */
    public static final void m4950HorizontalFloatingToolbarWithFabLayoutz3vpotQ(final Modifier modifier, final boolean z, final l<? super Boolean, ab> lVar, final FloatingToolbarColors floatingToolbarColors, final float f2, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final FiniteAnimationSpec<Float> finiteAnimationSpec, p<? super Composer, ? super Integer, ab> pVar, final int i2, final float f3, final float f4, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        Composer composer2;
        Object currentState;
        Modifier.Companion companionFloatingScrollBehavior;
        final p<? super Composer, ? super Integer, ab> pVar2 = pVar;
        int i9 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1184580879);
        if (i9 == 0) {
            i5 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(floatingToolbarColors) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(f2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(paddingValues) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(floatingToolbarScrollBehavior) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            int i10 = i5;
            z2 = true;
            i6 = i10 | (true != composerStartRestartGroup.changed(shape) ? 4194304 : 8388608);
        } else {
            i6 = i5;
            z2 = true;
        }
        if ((100663296 & i3) == 0) {
            i6 |= z2 != composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 268435456 : 536870912;
        }
        int i11 = i6;
        if ((i4 & 6) == 0) {
            z3 = true;
            i7 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i4;
        } else {
            z3 = true;
            i7 = i4;
        }
        int i12 = i7;
        if ((i4 & 48) == 0) {
            i8 = i12 | (z3 == composerStartRestartGroup.changed(f3) ? 32 : 16);
        } else {
            i8 = i12;
        }
        if ((i4 & 384) == 0) {
            z4 = true;
            i8 |= true == composerStartRestartGroup.changed(f4) ? 256 : 128;
        } else {
            z4 = true;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i8 |= z4 == composerStartRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i11) == 306783378 && (i8 & DisplayStrings.DS_DONT_SHOW_AGAIN) == 1170) ? false : true, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184580879, i11, i8, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout (FloatingToolbar.kt:1687)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Float.valueOf(true != z ? 0.0f : 1.0f), "expanded state", composerStartRestartGroup, 48, 0);
            q qVar2 = new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda31
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
                    FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0(finiteAnimationSpec2, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec2;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion = Snapshot.Companion;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        currentState = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState);
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            float fFloatValue = ((Number) currentState).floatValue();
            composerStartRestartGroup.startReplaceGroup(-1645362842);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645362842, 0, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(fFloatValue);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a<Float>() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout-z3vpotQ$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Float invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue2 = ((Number) ((State) objRememberedValue).getValue()).floatValue();
            composerStartRestartGroup.startReplaceGroup(-1645362842);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645362842, 0, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(fFloatValue2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout-z3vpotQ$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Float> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, fValueOf2, (FiniteAnimationSpec) qVar2.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_expand, composer2, 0);
            final String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_collapse, composer2, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, (i11 >> 3) & 14);
            Modifier modifierM2807defaultMinSizeVpY3zN4$default = SizeKt.m2807defaultMinSizeVpY3zN4$default(modifier, 0.0f, ((Dp) FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getEndInclusive()).m11178unboximpl(), 1, null);
            if (floatingToolbarScrollBehavior == null || (companionFloatingScrollBehavior = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.Companion)) == null) {
                companionFloatingScrollBehavior = Modifier.Companion;
            }
            Modifier modifierThen = modifierM2807defaultMinSizeVpY3zN4$default.then(companionFloatingScrollBehavior);
            boolean zChanged4 = composer2.changed(stateCreateTransitionAnimation) | ((57344 & i11) == 16384);
            boolean z5 = (i8 & 14) == 4;
            boolean z6 = (i8 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z7 = (i8 & 112) == 32;
            boolean z8 = z6;
            boolean z9 = (29360128 & i11) == 8388608;
            FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1 floatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1RememberedValue = composer2.rememberedValue();
            if ((z9 | zChanged4 | z5 | z8 | z7) || floatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1RememberedValue == Composer.Companion.getEmpty()) {
                floatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1RememberedValue = new FloatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1(stateCreateTransitionAnimation, f2, i2, f4, f3, shape);
                composer2.updateRememberedValue(floatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) floatingToolbarKt$HorizontalFloatingToolbarWithFabLayout$3$1RememberedValue;
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(PaddingKt.padding(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, floatingToolbarColors.m4894getToolbarContainerColor0d7_KjU(), null, 2, null), paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
            int iM2 = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierHorizontalScroll$default);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer2, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(floatingToolbarColors.m4895getToolbarContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-1494029974, true, new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda32
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0(qVar, rowScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            composer2.endNode();
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged5 = composer2.changed(stateRememberUpdatedState) | ((i11 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composer2.changed(strM6375getString2EP1pXo) | composer2.changed(strM6375getString2EP1pXo2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda33
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0(strM6375getString2EP1pXo, strM6375getString2EP1pXo2, stateRememberUpdatedState, lVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierParentSemantics = ChildParentSemanticsKt.parentSemantics(companion2, (l) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierParentSemantics);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar2 = pVar;
            pVar2.invoke(composer2, Integer.valueOf((i11 >> 27) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda34
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6(modifier, z, lVar, floatingToolbarColors, f2, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, pVar2, i2, f3, f4, qVar, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final FiniteAnimationSpec HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1765630817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1765630817, i2, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1689)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$0$0(q qVar, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494029974, i2, -1, "androidx.compose.material3.HorizontalFloatingToolbarWithFabLayout.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1703)");
            }
            qVar.invoke(rowScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0(String str, String str2, State state, final l lVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$2(state), new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda38
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4939$r8$lambda$3dnHDwzqa4ZqWIgEx01D3gtlM(lVar);
                return true;
            }
        }, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda39
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4940$r8$lambda$FiDHnW_owhAMNYh7De4l8GtcW8(lVar);
                return true;
            }
        }, str, str2));
        return ab.f48028a;
    }

    private static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$0(l lVar) {
        lVar.invoke(false);
        return true;
    }

    private static final boolean HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$3$1$0$1(l lVar) {
        lVar.invoke(true);
        return true;
    }

    static final ab HorizontalFloatingToolbarWithFabLayout_z3vpotQ$lambda$6(Modifier modifier, boolean z, l lVar, FloatingToolbarColors floatingToolbarColors, float f2, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i2, float f3, float f4, q qVar, int i3, int i4, Composer composer, int i5) {
        m4950HorizontalFloatingToolbarWithFabLayoutz3vpotQ(modifier, z, lVar, floatingToolbarColors, f2, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, pVar, i2, f3, f4, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    static final ab HorizontalFloatingToolbar_LJWHXA8$lambda$1(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q qVar, q qVar2, float f2, float f3, q qVar3, int i2, int i3, int i4, Composer composer, int i5) {
        m4947HorizontalFloatingToolbarLJWHXA8(z, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f3, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab HorizontalFloatingToolbar_ekznXB8$lambda$1(boolean z, p pVar, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i2, FiniteAnimationSpec finiteAnimationSpec, float f2, float f3, q qVar, int i3, int i4, int i5, Composer composer, int i6) {
        m4948HorizontalFloatingToolbarekznXB8(z, pVar, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, i2, finiteAnimationSpec, f2, f3, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* renamed from: VerticalFloatingToolbar-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4951VerticalFloatingToolbarLJWHXA8(final boolean r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.FloatingToolbarColors r30, androidx.compose.foundation.layout.PaddingValues r31, androidx.compose.material3.FloatingToolbarScrollBehavior r32, androidx.compose.ui.graphics.Shape r33, h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, float r36, float r37, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarKt.m4951VerticalFloatingToolbarLJWHXA8(boolean, androidx.compose.ui.Modifier, androidx.compose.material3.FloatingToolbarColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.FloatingToolbarScrollBehavior, androidx.compose.ui.graphics.Shape, h.g.a.q, h.g.a.q, float, float, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* renamed from: VerticalFloatingToolbar-NTTHHFE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4952VerticalFloatingToolbarNTTHHFE(final boolean r31, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.FloatingToolbarColors r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.material3.FloatingToolbarScrollBehavior r36, androidx.compose.ui.graphics.Shape r37, int r38, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r39, float r40, float r41, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarKt.m4952VerticalFloatingToolbarNTTHHFE(boolean, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.material3.FloatingToolbarColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.FloatingToolbarScrollBehavior, androidx.compose.ui.graphics.Shape, int, androidx.compose.animation.core.FiniteAnimationSpec, float, float, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VerticalFloatingToolbarLayout-yndP2WQ, reason: not valid java name */
    public static final void m4953VerticalFloatingToolbarLayoutyndP2WQ(final Modifier modifier, final boolean z, final l<? super Boolean, ab> lVar, final FloatingToolbarColors floatingToolbarColors, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar2, final float f2, float f3, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar3, Composer composer, final int i2, final int i3) {
        int i4;
        float f4;
        float f5;
        int i5;
        Composer composer2;
        Modifier.Companion companionFloatingScrollBehavior;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1640070852);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(floatingToolbarColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(paddingValues) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(floatingToolbarScrollBehavior) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(shape) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            f4 = f2;
            i4 |= true != composerStartRestartGroup.changed(f4) ? 268435456 : 536870912;
        } else {
            f4 = f2;
        }
        if ((i3 & 6) == 0) {
            f5 = f3;
            i5 = i3 | (true != composerStartRestartGroup.changed(f5) ? 2 : 4);
        } else {
            f5 = f3;
            i5 = i3;
        }
        int i7 = i5;
        if ((i3 & 48) == 0) {
            i5 = i7 | (true != composerStartRestartGroup.changedInstance(qVar3) ? 16 : 32);
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640070852, i4, i5, "androidx.compose.material3.VerticalFloatingToolbarLayout (FloatingToolbar.kt:1824)");
            }
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_expand, composerStartRestartGroup, 0);
            final String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_collapse, composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, (i4 >> 3) & 14);
            final State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(true != z ? f5 : f4, FloatingToolbarDefaults.INSTANCE.animationSpec(composerStartRestartGroup, 6), null, null, composerStartRestartGroup, 0, 12);
            if (floatingToolbarScrollBehavior == null || (companionFloatingScrollBehavior = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.Companion)) == null) {
                companionFloatingScrollBehavior = Modifier.Companion;
            }
            Modifier modifierThen = modifier.then(companionFloatingScrollBehavior);
            boolean zChanged = ((i4 & 3670016) == 1048576) | composerStartRestartGroup.changed(stateM1867animateDpAsStateAjpBEmI);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda28
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0(shape, stateM1867animateDpAsStateAjpBEmI, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierPadding = PaddingKt.padding(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2829widthInVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(modifierThen, (l) objRememberedValue), FloatingToolbarDefaults.INSTANCE.m4905getContainerSizeD9Ej5fM(), 0.0f, 2, null), floatingToolbarColors.m4894getToolbarContainerColor0d7_KjU(), shape), paddingValues);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(floatingToolbarColors.m4895getToolbarContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-2087045178, true, new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda29
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0(qVar, stateRememberUpdatedState, lVar, strM6375getString2EP1pXo, strM6375getString2EP1pXo2, z, qVar2, qVar3, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
            final float f6 = f5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda30
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$5(modifier, z, lVar, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f6, qVar3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float VerticalFloatingToolbarLayout_yndP2WQ$lambda$1(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$3$0(Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(VerticalFloatingToolbarLayout_yndP2WQ$lambda$1(state)));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0(final q qVar, final State state, final l lVar, final String str, final String str2, boolean z, final q qVar2, q qVar3, ColumnScope columnScope, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        if (composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087045178, i2, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous> (FloatingToolbar.kt:1853)");
            }
            if (qVar == null) {
                composer2.startReplaceGroup(-1216280353);
                composer2.endReplaceGroup();
                i3 = 0;
            } else {
                composer2.startReplaceGroup(-1216280352);
                i3 = 0;
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.verticalEnterTransition(Alignment.Companion.getBottom(), composer2, 54), FloatingToolbarDefaults.INSTANCE.verticalExitTransition(Alignment.Companion.getBottom(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(-1886791065, true, new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(qVar, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer, 1572864, 18);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer2.changed(state) | composer2.changed(lVar) | composer2.changed(str) | composer2.changed(str2);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(str, str2, state, lVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierMinimumInteractiveBalancedPadding = minimumInteractiveBalancedPadding(ChildParentSemanticsKt.parentSemantics(companion, (l) objRememberedValue), (!z || qVar == null) ? i3 : 1, (!z || qVar2 == null) ? i3 : 1, MaterialTheme.INSTANCE.getMotionScheme(composer2, 6).defaultEffectsSpec());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i3);
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i3));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierMinimumInteractiveBalancedPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composer2, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar3.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
            composer2.endNode();
            if (qVar2 == null) {
                composer2.startReplaceGroup(-1214522715);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1214522714);
                AnimatedVisibilityKt.AnimatedVisibility(columnScope, VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), (Modifier) null, FloatingToolbarDefaults.INSTANCE.verticalEnterTransition(Alignment.Companion.getTop(), composer2, 54), FloatingToolbarDefaults.INSTANCE.verticalExitTransition(Alignment.Companion.getTop(), composer2, 54), (String) null, ComposableLambdaKt.rememberComposableLambda(279127952, true, new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingToolbarKt.VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(qVar2, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), composer2, 1572864, 18);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$0$0(q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1886791065, i2, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1859)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0(String str, String str2, State state, final l lVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(VerticalFloatingToolbarLayout_yndP2WQ$lambda$0(state), new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda15
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.$r8$lambda$huVKtQ12ZRJaoOm7rBlnGun30BU(lVar);
                return true;
            }
        }, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda16
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4938$r8$lambda$2k_yTQaXIPbPHEBVHamy2dzW8Y(lVar);
                return true;
            }
        }, str, str2));
        return ab.f48028a;
    }

    private static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$0(l lVar) {
        lVar.invoke(false);
        return true;
    }

    private static final boolean VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$1$0$1(l lVar) {
        lVar.invoke(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$4$0$2$0(q qVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(279127952, i2, -1, "androidx.compose.material3.VerticalFloatingToolbarLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1894)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        return ab.f48028a;
    }

    static final ab VerticalFloatingToolbarLayout_yndP2WQ$lambda$5(Modifier modifier, boolean z, l lVar, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q qVar, q qVar2, float f2, float f3, q qVar3, int i2, int i3, Composer composer, int i4) {
        m4953VerticalFloatingToolbarLayoutyndP2WQ(modifier, z, lVar, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f3, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VerticalFloatingToolbarWithFabLayout-Nur2B3k, reason: not valid java name */
    public static final void m4954VerticalFloatingToolbarWithFabLayoutNur2B3k(final Modifier modifier, final boolean z, final l<? super Boolean, ab> lVar, final FloatingToolbarColors floatingToolbarColors, final float f2, final PaddingValues paddingValues, final FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, final Shape shape, final FiniteAnimationSpec<Float> finiteAnimationSpec, p<? super Composer, ? super Integer, ab> pVar, final int i2, final float f3, final float f4, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        Composer composer2;
        Object currentState;
        Modifier.Companion companionFloatingScrollBehavior;
        final p<? super Composer, ? super Integer, ab> pVar2 = pVar;
        int i9 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909369813);
        if (i9 == 0) {
            i5 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(floatingToolbarColors) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(f2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(paddingValues) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i5 |= true != composerStartRestartGroup.changed(floatingToolbarScrollBehavior) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            int i10 = i5;
            z2 = true;
            i6 = i10 | (true != composerStartRestartGroup.changed(shape) ? 4194304 : 8388608);
        } else {
            i6 = i5;
            z2 = true;
        }
        if ((100663296 & i3) == 0) {
            i6 |= z2 != composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 268435456 : 536870912;
        }
        int i11 = i6;
        if ((i4 & 6) == 0) {
            z3 = true;
            i7 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i4;
        } else {
            z3 = true;
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 = i7 | (z3 == composerStartRestartGroup.changed(f3) ? 32 : 16);
        } else {
            i8 = i7;
        }
        if ((i4 & 384) == 0) {
            i8 |= z3 == composerStartRestartGroup.changed(f4) ? 256 : 128;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i8 |= z3 == composerStartRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        int i12 = i8;
        if (composerStartRestartGroup.shouldExecute(((306783379 & i11) == 306783378 && (i12 & DisplayStrings.DS_DONT_SHOW_AGAIN) == 1170) ? false : true, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909369813, i11, i12, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout (FloatingToolbar.kt:1919)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(Float.valueOf(true != z ? 0.0f : 1.0f), "expanded state", composerStartRestartGroup, 48, 0);
            q qVar2 = new q() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda24
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
                    FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0(finiteAnimationSpec2, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec2;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion = Snapshot.Companion;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState2 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState2);
                        currentState = currentState2;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            float fFloatValue = ((Number) currentState).floatValue();
            composerStartRestartGroup.startReplaceGroup(1541772290);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541772290, 0, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(fFloatValue);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a<Float>() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout-Nur2B3k$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Float invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue2 = ((Number) ((State) objRememberedValue).getValue()).floatValue();
            composerStartRestartGroup.startReplaceGroup(1541772290);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541772290, 0, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(fFloatValue2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Float>>() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout-Nur2B3k$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Float> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, fValueOf2, (FiniteAnimationSpec) qVar2.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_expand, composer2, 0);
            final String strM6375getString2EP1pXo2 = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_floating_toolbar_collapse, composer2, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, (i11 >> 3) & 14);
            Modifier modifierM2807defaultMinSizeVpY3zN4$default = SizeKt.m2807defaultMinSizeVpY3zN4$default(modifier, ((Dp) FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getEndInclusive()).m11178unboximpl(), 0.0f, 2, null);
            if (floatingToolbarScrollBehavior == null || (companionFloatingScrollBehavior = floatingToolbarScrollBehavior.floatingScrollBehavior(Modifier.Companion)) == null) {
                companionFloatingScrollBehavior = Modifier.Companion;
            }
            Modifier modifierThen = modifierM2807defaultMinSizeVpY3zN4$default.then(companionFloatingScrollBehavior);
            boolean zChanged4 = composer2.changed(stateCreateTransitionAnimation) | ((57344 & i11) == 16384);
            boolean z4 = (i12 & 14) == 4;
            boolean z5 = (i12 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z6 = (i12 & 112) == 32;
            boolean z7 = z5;
            boolean z8 = (29360128 & i11) == 8388608;
            FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1 floatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1RememberedValue = composer2.rememberedValue();
            if ((z8 | z6 | zChanged4 | z4 | z7) || floatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1RememberedValue == Composer.Companion.getEmpty()) {
                floatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1RememberedValue = new FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1(stateCreateTransitionAnimation, f2, i2, f4, f3, shape);
                composer2.updateRememberedValue(floatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) floatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1RememberedValue;
            int iM = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, floatingToolbarColors.m4894getToolbarContainerColor0d7_KjU(), null, 2, null), paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer2, 48);
            int iM2 = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(floatingToolbarColors.m4895getToolbarContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-845993064, true, new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda25
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0(qVar, columnScopeInstance, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            composer2.endNode();
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged5 = composer2.changed(stateRememberUpdatedState) | ((i11 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composer2.changed(strM6375getString2EP1pXo) | composer2.changed(strM6375getString2EP1pXo2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda26
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0(strM6375getString2EP1pXo, strM6375getString2EP1pXo2, stateRememberUpdatedState, lVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierParentSemantics = ChildParentSemanticsKt.parentSemantics(companion2, (l) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = FloatingToolbarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierParentSemantics);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar2 = pVar;
            pVar2.invoke(composer2, Integer.valueOf((i11 >> 27) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda27
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingToolbarKt.VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6(modifier, z, lVar, floatingToolbarColors, f2, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, pVar2, i2, f3, f4, qVar, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final FiniteAnimationSpec VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(240317371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(240317371, i2, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous> (FloatingToolbar.kt:1921)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$0$0(q qVar, ColumnScope columnScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-845993064, i2, -1, "androidx.compose.material3.VerticalFloatingToolbarWithFabLayout.<anonymous>.<anonymous>.<anonymous> (FloatingToolbar.kt:1935)");
            }
            qVar.invoke(columnScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0(String str, String str2, State state, final l lVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, customToolbarActions(VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$2(state), new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4944$r8$lambda$lg0MKfZ_NLN_9OmfrNzCQM5VJA(lVar);
                return true;
            }
        }, new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                FloatingToolbarKt.m4945$r8$lambda$rR0MNI0RZh4ufpexbHm6IPQZKQ(lVar);
                return true;
            }
        }, str, str2));
        return ab.f48028a;
    }

    private static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$0(l lVar) {
        lVar.invoke(false);
        return true;
    }

    private static final boolean VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$3$1$0$1(l lVar) {
        lVar.invoke(true);
        return true;
    }

    static final ab VerticalFloatingToolbarWithFabLayout_Nur2B3k$lambda$6(Modifier modifier, boolean z, l lVar, FloatingToolbarColors floatingToolbarColors, float f2, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i2, float f3, float f4, q qVar, int i3, int i4, Composer composer, int i5) {
        m4954VerticalFloatingToolbarWithFabLayoutNur2B3k(modifier, z, lVar, floatingToolbarColors, f2, paddingValues, floatingToolbarScrollBehavior, shape, finiteAnimationSpec, pVar, i2, f3, f4, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    static final ab VerticalFloatingToolbar_LJWHXA8$lambda$1(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q qVar, q qVar2, float f2, float f3, q qVar3, int i2, int i3, int i4, Composer composer, int i5) {
        m4951VerticalFloatingToolbarLJWHXA8(z, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f3, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab VerticalFloatingToolbar_NTTHHFE$lambda$1(boolean z, p pVar, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i2, FiniteAnimationSpec finiteAnimationSpec, float f2, float f3, q qVar, int i3, int i4, int i5, Composer composer, int i6) {
        m4952VerticalFloatingToolbarNTTHHFE(z, pVar, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, i2, finiteAnimationSpec, f2, f3, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    private static final float collapsedFraction(FloatingToolbarState floatingToolbarState) {
        if (floatingToolbarState.getOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return floatingToolbarState.getOffset() / floatingToolbarState.getOffsetLimit();
    }

    private static final List<CustomAccessibilityAction> customToolbarActions(boolean z, a<Boolean> aVar, a<Boolean> aVar2, String str, String str2) {
        return i.d(z ? new CustomAccessibilityAction(str2, aVar2) : new CustomAccessibilityAction(str, aVar));
    }

    public static final ProvidableCompositionLocal<HorizontalFloatingToolbarOverride> getLocalHorizontalFloatingToolbarOverride() {
        return LocalHorizontalFloatingToolbarOverride;
    }

    public static final ProvidableCompositionLocal<HorizontalFloatingToolbarWithFabOverride> getLocalHorizontalFloatingToolbarWithFabOverride() {
        return LocalHorizontalFloatingToolbarWithFabOverride;
    }

    public static final ProvidableCompositionLocal<VerticalFloatingToolbarOverride> getLocalVerticalToolbarOverride() {
        return LocalVerticalToolbarOverride;
    }

    public static final ProvidableCompositionLocal<VerticalFloatingToolbarWithFabOverride> getLocalVerticalToolbarWithFabOverride() {
        return LocalVerticalToolbarWithFabOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(f<Dp> fVar, float f2) {
        return DpKt.m11207lerpMdfbLM(((Dp) fVar.getStart()).m11178unboximpl(), ((Dp) fVar.getEndInclusive()).m11178unboximpl(), f2);
    }

    private static final Modifier minimumInteractiveBalancedPadding(Modifier modifier, boolean z, boolean z2, AnimationSpec<Float> animationSpec) {
        return modifier.then(new MinimumInteractiveBalancedPaddingElement(z, z2, animationSpec));
    }

    public static final FloatingToolbarState rememberFloatingToolbarState(final float f2, final float f3, final float f4, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1765068805, i2, -1, "androidx.compose.material3.rememberFloatingToolbarState (FloatingToolbar.kt:1388)");
        }
        boolean z = true;
        if (1 == (i3 & 1)) {
            f2 = -3.4028235E38f;
        }
        Object[] objArr = new Object[0];
        Saver<FloatingToolbarState, ?> saver$material3 = FloatingToolbarState.Companion.getSaver$material3();
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(f2)) || (i2 & 6) == 4;
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(f3)) || (i2 & 48) == 32;
        if ((i3 & 4) != 0) {
            f4 = 0.0f;
        }
        boolean z4 = z2 | z3;
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(f4)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z5 = z4 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.FloatingToolbarKt$$ExternalSyntheticLambda14
                @Override // h.g.a.a
                public final Object invoke() {
                    return FloatingToolbarKt.FloatingToolbarState(f2, f3, f4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        FloatingToolbarState floatingToolbarState = (FloatingToolbarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver$material3, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingToolbarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberTouchExplorationService(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1073697211, i2, -1, "androidx.compose.material3.rememberTouchExplorationService (FloatingToolbar.kt:2184)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, false, false, composer, DisplayStrings.DS_NONE, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberAccessibilityServiceState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r24, false, r6, r7, 2, null) != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r3, r6, r5, false, r4, r7, 4, null) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleFloatingToolbar(androidx.compose.material3.FloatingToolbarState r21, float r22, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, h.c.e<? super androidx.compose.ui.unit.Velocity> r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingToolbarKt.settleFloatingToolbar(androidx.compose.material3.FloatingToolbarState, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, h.c.e):java.lang.Object");
    }

    static final ab settleFloatingToolbar$lambda$0(an anVar, FloatingToolbarState floatingToolbarState, an anVar2, AnimationScope animationScope) {
        float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
        float offset = floatingToolbarState.getOffset();
        floatingToolbarState.setOffset(offset + fFloatValue);
        float fAbs = Math.abs(offset - floatingToolbarState.getOffset());
        anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
        anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return ab.f48028a;
    }

    static final ab settleFloatingToolbar$lambda$1(FloatingToolbarState floatingToolbarState, AnimationScope animationScope) {
        floatingToolbarState.setOffset(((Number) animationScope.getValue()).floatValue());
        return ab.f48028a;
    }

    public static /* synthetic */ void getLocalHorizontalFloatingToolbarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalHorizontalFloatingToolbarWithFabOverride$annotations() {
    }

    public static /* synthetic */ void getLocalVerticalToolbarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalVerticalToolbarWithFabOverride$annotations() {
    }
}
