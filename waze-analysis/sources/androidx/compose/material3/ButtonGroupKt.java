package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ButtonGroupKt {
    private static final long MAX_WAIT_TIME_MILLIS = 1000;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ButtonGroupKt$waitUntil$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ButtonGroupKt.waitUntil(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ButtonGroup(final h.g.a.q<? super androidx.compose.material3.ButtonGroupMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r17, androidx.compose.ui.Modifier r18, float r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, androidx.compose.ui.Alignment.Vertical r21, final h.g.a.l<? super androidx.compose.material3.ButtonGroupScope, h.ab> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonGroupKt.ButtonGroup(h.g.a.q, androidx.compose.ui.Modifier, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ButtonGroup$lambda$10(q qVar, Modifier modifier, float f2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, l lVar, int i2, int i3, Composer composer, int i4) {
        ButtonGroup(qVar, modifier, f2, horizontal, vertical, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ButtonGroup$lambda$3(Modifier modifier, float f2, Arrangement.Horizontal horizontal, q qVar, int i2, int i3, Composer composer, int i4) {
        ButtonGroup(modifier, f2, horizontal, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ButtonGroup$lambda$4(q qVar, Modifier modifier, float f2, Arrangement.Horizontal horizontal, l lVar, int i2, int i3, Composer composer, int i4) {
        ButtonGroup(qVar, modifier, f2, horizontal, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final ButtonGroupScopeImpl ButtonGroup$lambda$5(State<ButtonGroupScopeImpl> state) {
        return state.getValue();
    }

    static final ab ButtonGroup$lambda$8(State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1700074793, i2, -1, "androidx.compose.material3.ButtonGroup.<anonymous> (ButtonGroup.kt:268)");
            }
            List<ButtonGroupItem> items = ButtonGroup$lambda$5(state).getItems();
            int size = items.size();
            for (int i3 = 0; i3 < size; i3++) {
                items.get(i3).ButtonGroupContent(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ButtonGroup$lambda$9(q qVar, final ButtonGroupMenuState buttonGroupMenuState, final ButtonGroupOverflowState buttonGroupOverflowState, final State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431404714, i2, -1, "androidx.compose.material3.ButtonGroup.<anonymous> (ButtonGroup.kt:270)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = ButtonGroupKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            qVar.invoke(buttonGroupMenuState, composer, 0);
            boolean zIsExpanded = buttonGroupMenuState.isExpanded();
            boolean zChangedInstance = composer.changedInstance(buttonGroupMenuState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ButtonGroupKt.ButtonGroup$lambda$9$0$0$0(buttonGroupMenuState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            AndroidMenu_androidKt.m4337DropdownMenuIlH_yew(zIsExpanded, (a) objRememberedValue, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1656627541, true, new q() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda10
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ButtonGroupKt.ButtonGroup$lambda$9$0$1(buttonGroupOverflowState, buttonGroupMenuState, state, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 0, 48, 2044);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ButtonGroup$lambda$9$0$0$0(ButtonGroupMenuState buttonGroupMenuState) {
        buttonGroupMenuState.dismiss();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ButtonGroup$lambda$9$0$1(ButtonGroupOverflowState buttonGroupOverflowState, ButtonGroupMenuState buttonGroupMenuState, State state, ColumnScope columnScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1656627541, i2, -1, "androidx.compose.material3.ButtonGroup.<anonymous>.<anonymous>.<anonymous> (ButtonGroup.kt:276)");
            }
            int totalItemCount = buttonGroupOverflowState.getTotalItemCount();
            for (int visibleItemCount = buttonGroupOverflowState.getVisibleItemCount(); visibleItemCount < totalItemCount; visibleItemCount++) {
                ButtonGroup$lambda$5(state).getItems().get(visibleItemCount).MenuContent(buttonGroupMenuState, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final ButtonGroupParentData getButtonGroupParentData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof ButtonGroupParentData) {
            return (ButtonGroupParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(ButtonGroupParentData buttonGroupParentData) {
        if (buttonGroupParentData != null) {
            return buttonGroupParentData.getWeight();
        }
        return 0.0f;
    }

    private static final State<ButtonGroupScopeImpl> rememberButtonGroupScopeState(l<? super ButtonGroupScope, ab> lVar, final AnimationSpec<Float> animationSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(97726316, i2, -1, "androidx.compose.material3.rememberButtonGroupScopeState (ButtonGroup.kt:1379)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda7
                @Override // h.g.a.a
                public final Object invoke() {
                    return ButtonGroupKt.rememberButtonGroupScopeState$lambda$0$0(animationSpec, stateRememberUpdatedState);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        State<ButtonGroupScopeImpl> state = (State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonGroupScopeImpl rememberButtonGroupScopeState$lambda$0$0(AnimationSpec animationSpec, State state) {
        ButtonGroupScopeImpl buttonGroupScopeImpl = new ButtonGroupScopeImpl(animationSpec);
        ((l) state.getValue()).invoke(buttonGroupScopeImpl);
        return buttonGroupScopeImpl;
    }

    private static final ButtonGroupOverflowState rememberOverflowState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1571410000, i2, -1, "androidx.compose.material3.rememberOverflowState (ButtonGroup.kt:1337)");
        }
        Object[] objArr = new Object[0];
        Saver<OverflowStateImpl, ?> saver = OverflowStateImpl.Companion.getSaver();
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda6
                @Override // h.g.a.a
                public final Object invoke() {
                    return ButtonGroupKt.rememberOverflowState$lambda$0$0();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        OverflowStateImpl overflowStateImpl = (OverflowStateImpl) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return overflowStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverflowStateImpl rememberOverflowState$lambda$0$0() {
        return new OverflowStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r11 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:23:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitUntil(h.g.a.a<java.lang.Boolean> r10, h.c.e<? super h.ab> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.material3.ButtonGroupKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.material3.ButtonGroupKt$waitUntil$1 r0 = (androidx.compose.material3.ButtonGroupKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ButtonGroupKt$waitUntil$1 r0 = new androidx.compose.material3.ButtonGroupKt$waitUntil$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            long r4 = r0.J$0
            java.lang.Object r10 = r0.L$0
            h.g.a.a r10 = (h.g.a.a) r10
            e.b.c.b(r11)
            goto L75
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r0.L$0
            h.g.a.a r10 = (h.g.a.a) r10
            e.b.c.b(r11)
            goto L52
        L40:
            e.b.c.b(r11)
            androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda4 r11 = new androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda4
            r11.<init>()
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r11, r0)
            if (r11 == r1) goto L86
        L52:
            java.lang.Number r11 = (java.lang.Number) r11
            long r4 = r11.longValue()
        L58:
            java.lang.Object r11 = r10.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L83
            androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda5 r11 = new androidx.compose.material3.ButtonGroupKt$$ExternalSyntheticLambda5
            r11.<init>()
            r0.L$0 = r10
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r11 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r11, r0)
            if (r11 == r1) goto L86
        L75:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r6 = r6 - r4
            r8 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L83
            goto L58
        L83:
            h.ab r10 = h.ab.f48028a
            return r10
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonGroupKt.waitUntil(h.g.a.a, h.c.e):java.lang.Object");
    }

    static final long waitUntil$lambda$0(long j2) {
        return j2;
    }

    static final long waitUntil$lambda$1(long j2) {
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ButtonGroup(androidx.compose.ui.Modifier r16, float r17, androidx.compose.foundation.layout.Arrangement.Horizontal r18, final h.g.a.q<? super androidx.compose.material3.ButtonGroupScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonGroupKt.ButtonGroup(androidx.compose.ui.Modifier, float, androidx.compose.foundation.layout.Arrangement$Horizontal, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ButtonGroup(final h.g.a.q r17, androidx.compose.ui.Modifier r18, float r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, final h.g.a.l r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonGroupKt.ButtonGroup(h.g.a.q, androidx.compose.ui.Modifier, float, androidx.compose.foundation.layout.Arrangement$Horizontal, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
