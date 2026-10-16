package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.gas.GasNativeManager;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding = 4.0f;
    private static final float BottomAppBarVerticalPadding = 4.0f;
    private static final float FABHorizontalPadding = 12.0f;
    private static final float FABVerticalPadding = 8.0f;
    private static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> LocalSingleRowTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda41
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultSingleRowTopAppBarOverride.INSTANCE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> LocalTwoRowsTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda42
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultTwoRowsTopAppBarOverride.INSTANCE;
        }
    }, 1, null);
    private static final CubicBezierEasing TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
    private static final float MediumTitleBottomPadding = 24.0f;
    private static final float LargeTitleBottomPadding = 28.0f;
    private static final float TopAppBarHorizontalPadding = 4.0f;
    private static final float TopAppBarTitleInset = 12.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1, reason: invalid class name */
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
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1, reason: invalid class name and case insensitive filesystem */
    final class C03391 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C03391(e<? super C03391> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4347BottomAppBar1oL4kX8(androidx.compose.ui.Modifier r24, long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.foundation.layout.WindowInsets r31, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4347BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4348BottomAppBarSnr_uVM(final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.ui.Modifier r28, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4348BottomAppBarSnr_uVM(h.g.a.q, androidx.compose.ui.Modifier, h.g.a.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4349BottomAppBare3WI5M(androidx.compose.ui.Modifier r27, long r28, long r30, float r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.BottomAppBarScrollBehavior r35, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4349BottomAppBare3WI5M(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4350BottomAppBarqhFBPw4(final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.ui.Modifier r28, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.material3.BottomAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4350BottomAppBarqhFBPw4(h.g.a.q, androidx.compose.ui.Modifier, h.g.a.p, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* renamed from: BottomAppBarLayout-t5fmz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m4351BottomAppBarLayoutt5fmz9U(final float r31, final androidx.compose.foundation.layout.Arrangement.Horizontal r32, androidx.compose.ui.Modifier r33, final long r34, final long r36, final float r38, final androidx.compose.foundation.layout.PaddingValues r39, final androidx.compose.foundation.layout.WindowInsets r40, final androidx.compose.material3.BottomAppBarScrollBehavior r41, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4351BottomAppBarLayoutt5fmz9U(float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean BottomAppBarLayout_t5fmz9U$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomAppBarLayout_t5fmz9U$lambda$1$0(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, float f2) {
        BottomAppBarState state = bottomAppBarScrollBehavior.getState();
        state.setHeightOffset(state.getHeightOffset() - f2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BottomAppBarLayout_t5fmz9U$lambda$3$0(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        BottomAppBarState state;
        BottomAppBarState state2;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        if (bottomAppBarScrollBehavior != null && (state2 = bottomAppBarScrollBehavior.getState()) != null) {
            state2.setHeightOffsetLimit(-placeableMo9741measureBRTryo0.getHeight());
        }
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), h.h.a.b(n.e(placeableMo9741measureBRTryo0.getHeight() + ((bottomAppBarScrollBehavior == null || (state = bottomAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()), 0.0f)), null, new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda36
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$3$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomAppBarLayout_t5fmz9U$lambda$3$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab BottomAppBarLayout_t5fmz9U$lambda$4(WindowInsets windowInsets, float f2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1054101083, i2, -1, "androidx.compose.material3.BottomAppBarLayout.<anonymous> (AppBar.kt:1340)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2808height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), windowInsets), f2), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getCenterVertically(), composer, 48);
            int iM = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab BottomAppBarLayout_t5fmz9U$lambda$5(float f2, Arrangement.Horizontal horizontal, Modifier modifier, long j2, long j3, float f3, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, q qVar, int i2, int i3, Composer composer, int i4) {
        m4351BottomAppBarLayoutt5fmz9U(f2, horizontal, modifier, j2, j3, f3, paddingValues, windowInsets, bottomAppBarScrollBehavior, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final BottomAppBarState BottomAppBarState(float f2, float f3, float f4) {
        return new BottomAppBarStateImpl(f2, f3, f4);
    }

    static final ab BottomAppBar_1oL4kX8$lambda$0(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, q qVar, int i2, int i3, Composer composer, int i4) {
        m4347BottomAppBar1oL4kX8(modifier, j2, j3, f2, paddingValues, windowInsets, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab BottomAppBar_Snr_uVM$lambda$0(q qVar, Modifier modifier, p pVar, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, int i2, int i3, Composer composer, int i4) {
        m4348BottomAppBarSnr_uVM(qVar, modifier, pVar, j2, j3, f2, paddingValues, windowInsets, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab BottomAppBar_e_3WI5M$lambda$0(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, q qVar, int i2, int i3, Composer composer, int i4) {
        m4349BottomAppBare3WI5M(modifier, j2, j3, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab BottomAppBar_qhFBPw4$lambda$0(q qVar, p pVar, RowScope rowScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(rowScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1943077286, i2, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:1072)");
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 54);
            int iM = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
            if (pVar != null) {
                composer.startReplaceGroup(1354051795);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.0f, FABVerticalPadding, FABHorizontalPadding, 0.0f, 9, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
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
                pVar.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1354317992);
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

    static final ab BottomAppBar_qhFBPw4$lambda$1(q qVar, Modifier modifier, p pVar, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m4350BottomAppBarqhFBPw4(qVar, modifier, pVar, j2, j3, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m4352CenterAlignedTopAppBarGHTll3U(final h.g.a.p r23, androidx.compose.ui.Modifier r24, h.g.a.p r25, h.g.a.q r26, float r27, androidx.compose.foundation.layout.WindowInsets r28, androidx.compose.material3.TopAppBarColors r29, androidx.compose.material3.TopAppBarScrollBehavior r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4352CenterAlignedTopAppBarGHTll3U(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* renamed from: CenterAlignedTopAppBar-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4353CenterAlignedTopAppBargNPyAyM(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.ui.Modifier r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, float r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4353CenterAlignedTopAppBargNPyAyM(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab CenterAlignedTopAppBar_GHTll3U$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m4352CenterAlignedTopAppBarGHTll3U(pVar, modifier, pVar2, qVar, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab CenterAlignedTopAppBar_gNPyAyM$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        m4353CenterAlignedTopAppBargNPyAyM(pVar, modifier, pVar2, qVar, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* renamed from: FlexibleBottomAppBar-wBhsO_E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4354FlexibleBottomAppBarwBhsO_E(androidx.compose.ui.Modifier r29, long r30, long r32, androidx.compose.foundation.layout.PaddingValues r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, float r36, androidx.compose.foundation.layout.WindowInsets r37, androidx.compose.material3.BottomAppBarScrollBehavior r38, final h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4354FlexibleBottomAppBarwBhsO_E(androidx.compose.ui.Modifier, long, long, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Horizontal, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.BottomAppBarScrollBehavior, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab FlexibleBottomAppBar_wBhsO_E$lambda$0(Modifier modifier, long j2, long j3, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f2, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, q qVar, int i2, int i3, Composer composer, int i4) {
        m4354FlexibleBottomAppBarwBhsO_E(modifier, j2, j3, paddingValues, horizontal, f2, windowInsets, bottomAppBarScrollBehavior, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* renamed from: LargeFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4355LargeFlexibleTopAppBareXZ4JBQ(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, androidx.compose.ui.Modifier r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.Alignment.Horizontal r42, float r43, float r44, androidx.compose.foundation.layout.WindowInsets r45, androidx.compose.material3.TopAppBarColors r46, androidx.compose.material3.TopAppBarScrollBehavior r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4355LargeFlexibleTopAppBareXZ4JBQ(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.q, androidx.compose.ui.Alignment$Horizontal, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab LargeFlexibleTopAppBar_eXZ4JBQ$lambda$0(p pVar, Modifier modifier, p pVar2, p pVar3, q qVar, Alignment.Horizontal horizontal, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m4355LargeFlexibleTopAppBareXZ4JBQ(pVar, modifier, pVar2, pVar3, qVar, horizontal, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4356LargeTopAppBaroKE7A98(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.ui.Modifier r35, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, float r38, float r39, androidx.compose.foundation.layout.WindowInsets r40, androidx.compose.material3.TopAppBarColors r41, androidx.compose.material3.TopAppBarScrollBehavior r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4356LargeTopAppBaroKE7A98(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LargeTopAppBar_oKE7A98$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m4356LargeTopAppBaroKE7A98(pVar, modifier, pVar2, qVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* renamed from: MediumFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4357MediumFlexibleTopAppBareXZ4JBQ(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, androidx.compose.ui.Modifier r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.Alignment.Horizontal r42, float r43, float r44, androidx.compose.foundation.layout.WindowInsets r45, androidx.compose.material3.TopAppBarColors r46, androidx.compose.material3.TopAppBarScrollBehavior r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4357MediumFlexibleTopAppBareXZ4JBQ(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.q, androidx.compose.ui.Alignment$Horizontal, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab MediumFlexibleTopAppBar_eXZ4JBQ$lambda$0(p pVar, Modifier modifier, p pVar2, p pVar3, q qVar, Alignment.Horizontal horizontal, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m4357MediumFlexibleTopAppBareXZ4JBQ(pVar, modifier, pVar2, pVar3, qVar, horizontal, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4358MediumTopAppBaroKE7A98(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.ui.Modifier r35, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, float r38, float r39, androidx.compose.foundation.layout.WindowInsets r40, androidx.compose.material3.TopAppBarColors r41, androidx.compose.material3.TopAppBarScrollBehavior r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4358MediumTopAppBaroKE7A98(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab MediumTopAppBar_oKE7A98$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m4358MediumTopAppBaroKE7A98(pVar, modifier, pVar2, qVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: SingleRowTopAppBar-TCVpFMg, reason: not valid java name */
    private static final void m4359SingleRowTopAppBarTCVpFMg(Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final TextStyle textStyle, final p<? super Composer, ? super Integer, ab> pVar2, final TextStyle textStyle2, final Alignment.Horizontal horizontal, final p<? super Composer, ? super Integer, ab> pVar3, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, final float f2, final PaddingValues paddingValues, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        p<? super Composer, ? super Integer, ab> pVar4;
        TextStyle textStyle3;
        Alignment.Horizontal horizontal2;
        p<? super Composer, ? super Integer, ab> pVar5;
        q<? super RowScope, ? super Composer, ? super Integer, ab> qVar2;
        float f3;
        int i6;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int i8;
        final Modifier modifier3;
        int i9 = i4 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(703932376);
        if (i9 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            pVar4 = pVar;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 16 : 32;
        } else {
            pVar4 = pVar;
        }
        if ((i2 & 384) == 0) {
            textStyle3 = textStyle;
            i5 |= true != composerStartRestartGroup.changed(textStyle3) ? 128 : 256;
        } else {
            textStyle3 = textStyle;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(textStyle2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            horizontal2 = horizontal;
            i5 |= true != composerStartRestartGroup.changed(horizontal2) ? 65536 : 131072;
        } else {
            horizontal2 = horizontal;
        }
        if ((1572864 & i2) == 0) {
            pVar5 = pVar3;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 524288 : 1048576;
        } else {
            pVar5 = pVar3;
        }
        if ((12582912 & i2) == 0) {
            qVar2 = qVar;
            i5 |= true != composerStartRestartGroup.changedInstance(qVar2) ? 4194304 : 8388608;
        } else {
            qVar2 = qVar;
        }
        if ((100663296 & i2) == 0) {
            f3 = f2;
            i5 |= true != composerStartRestartGroup.changed(f3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            f3 = f2;
        }
        if ((805306368 & i2) == 0) {
            i6 = i9;
            i5 |= true != composerStartRestartGroup.changed(paddingValues) ? 268435456 : 536870912;
        } else {
            i6 = i9;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (true != composerStartRestartGroup.changed(windowInsets) ? 2 : 4);
        } else {
            i7 = i3;
        }
        int i10 = i7;
        if ((i3 & 48) == 0) {
            i7 = i10 | (true != composerStartRestartGroup.changed(topAppBarColors) ? 16 : 32);
        }
        if ((i3 & 384) == 0) {
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            i8 = i7 | (true != composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 128 : 256);
        } else {
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true, i5 & 1)) {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703932376, i5, i8, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:2757)");
            }
            TextStyle textStyle4 = textStyle3;
            ((SingleRowTopAppBarOverride) composerStartRestartGroup.consume(LocalSingleRowTopAppBarOverride)).SingleRowTopAppBar(new SingleRowTopAppBarOverrideScope(modifier4, pVar4, textStyle4, pVar2, textStyle2, horizontal2, pVar5, qVar2, f3, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda31
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AppBarKt.SingleRowTopAppBar_TCVpFMg$lambda$1(modifier3, pVar, textStyle, pVar2, textStyle2, horizontal, pVar3, qVar, f2, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SingleRowTopAppBar_TCVpFMg$lambda$1(Modifier modifier, p pVar, TextStyle textStyle, p pVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, p pVar3, q qVar, float f2, PaddingValues paddingValues, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m4359SingleRowTopAppBarTCVpFMg(modifier, pVar, textStyle, pVar2, textStyle2, horizontal, pVar3, qVar, f2, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* renamed from: TopAppBar-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4360TopAppBar121YqSk(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.ui.Modifier r34, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, androidx.compose.ui.Alignment.Horizontal r37, float r38, androidx.compose.foundation.layout.WindowInsets r39, androidx.compose.material3.TopAppBarColors r40, androidx.compose.material3.TopAppBarScrollBehavior r41, androidx.compose.foundation.layout.PaddingValues r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4360TopAppBar121YqSk(h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, androidx.compose.ui.Alignment$Horizontal, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m4361TopAppBarGHTll3U(final h.g.a.p r23, androidx.compose.ui.Modifier r24, h.g.a.p r25, h.g.a.q r26, float r27, androidx.compose.foundation.layout.WindowInsets r28, androidx.compose.material3.TopAppBarColors r29, androidx.compose.material3.TopAppBarScrollBehavior r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4361TopAppBarGHTll3U(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* renamed from: TopAppBar-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4362TopAppBargNPyAyM(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.ui.Modifier r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, float r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4362TopAppBargNPyAyM(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.q, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* renamed from: TopAppBarLayout-_5F1rQI, reason: not valid java name */
    public static final void m4363TopAppBarLayout_5F1rQI(final Modifier modifier, final FloatProducer floatProducer, final long j2, final long j3, final long j4, final long j5, final p<? super Composer, ? super Integer, ab> pVar, final TextStyle textStyle, final p<? super Composer, ? super Integer, ab> pVar2, final TextStyle textStyle2, final a<Float> aVar, final Arrangement.Vertical vertical, Alignment.Horizontal horizontal, final int i2, boolean z, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, final float f2, final PaddingValues paddingValues, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        boolean z5;
        boolean z6;
        Alignment.Horizontal horizontal2;
        p<? super Composer, ? super Integer, ab> pVar5;
        final boolean z7;
        int i10;
        int i11;
        Composer composer2;
        int i12;
        int i13;
        ?? r11;
        boolean z8;
        Modifier.Companion companionClearAndSetSemantics;
        Modifier.Companion companionClearAndSetSemantics2;
        p<? super Composer, ? super Integer, ab> pVar6 = pVar4;
        int i14 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(239553141);
        if (i14 == 0) {
            i5 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != ((i3 & 64) == 0 ? composerStartRestartGroup.changed(floatProducer) : composerStartRestartGroup.changedInstance(floatProducer)) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(j2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i15 = i5;
            z2 = true;
            i6 = i15 | (true != composerStartRestartGroup.changed(j3) ? 1024 : 2048);
        } else {
            i6 = i5;
            z2 = true;
        }
        if ((i3 & 24576) == 0) {
            i6 |= z2 != composerStartRestartGroup.changed(j4) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            i7 = 196608;
            i6 |= true != composerStartRestartGroup.changed(j5) ? 65536 : 131072;
        } else {
            i7 = 196608;
        }
        if ((1572864 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(pVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            z3 = true;
            i6 |= true != composerStartRestartGroup.changed(textStyle) ? 4194304 : 8388608;
        } else {
            z3 = true;
        }
        if ((100663296 & i3) == 0) {
            i6 |= z3 != composerStartRestartGroup.changedInstance(pVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changed(textStyle2) ? 268435456 : 536870912;
        }
        int i16 = i6;
        if ((i4 & 6) == 0) {
            z4 = true;
            i8 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i4;
        } else {
            z4 = true;
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            vertical2 = vertical;
            i8 |= z4 == composerStartRestartGroup.changed(vertical2) ? 32 : 16;
        } else {
            vertical2 = vertical;
        }
        if ((i4 & 384) == 0) {
            i9 = i8 | (true == composerStartRestartGroup.changed(horizontal) ? 256 : 128);
        } else {
            i9 = i8;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            z5 = true;
            i9 |= true == composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        } else {
            z5 = true;
        }
        if ((i4 & 24576) == 0) {
            i9 |= z5 != composerStartRestartGroup.changed(z) ? 8192 : 16384;
        }
        if ((i4 & i7) == 0) {
            i9 |= z5 != composerStartRestartGroup.changedInstance(pVar3) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i9 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            z6 = true;
            i9 |= true != composerStartRestartGroup.changed(f2) ? 4194304 : 8388608;
        } else {
            z6 = true;
        }
        if ((100663296 & i4) == 0) {
            i9 |= z6 != composerStartRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        int i17 = i9;
        if (composerStartRestartGroup.shouldExecute(((306783379 & i16) == 306783378 && (38347923 & i17) == 38347922) ? false : true, i16 & 1)) {
            int i18 = i16 >> 12;
            int i19 = i16 >> 18;
            int i20 = i16 >> 9;
            int i21 = i17 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(239553141, i16, i17, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:3285)");
            }
            boolean z9 = (i16 & 112) == 32 || ((i16 & 64) != 0 && composerStartRestartGroup.changed(floatProducer));
            boolean z10 = (i17 & 112) == 32;
            int i22 = i17 & DisplayStrings.DS_TAP_TO_VERIFY;
            boolean z11 = z10;
            boolean z12 = i22 == 256;
            boolean z13 = (i17 & 7168) == 2048;
            boolean z14 = (29360128 & i17) == 8388608;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z14 || (z9 | z11 | z12 | z13)) || objRememberedValue == Composer.Companion.getEmpty()) {
                pVar5 = pVar3;
                i10 = i22;
                i11 = i17;
                composer2 = composerStartRestartGroup;
                i12 = i21;
                i13 = i16;
                r11 = 0;
                z8 = true;
                objRememberedValue = new TopAppBarMeasurePolicy(floatProducer, vertical2, horizontal, i2, f2, paddingValues, null);
                horizontal2 = horizontal;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                horizontal2 = horizontal;
                pVar5 = pVar3;
                i11 = i17;
                composer2 = composerStartRestartGroup;
                i12 = i21;
                i10 = i22;
                i13 = i16;
                r11 = 0;
                z8 = true;
            }
            TopAppBarMeasurePolicy topAppBarMeasurePolicy = (TopAppBarMeasurePolicy) objRememberedValue;
            int iM = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r11));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
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
            Updater.m7351setimpl(composer2, topAppBarMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifierLayoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), r11);
            int iM2 = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r11));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM2759paddingqDBjuR0$default);
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
            int i23 = i18 & DisplayStrings.DS_TAP_TO_VERIFY;
            Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer2, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), pVar5, composer2, ((i11 >> 12) & 112) | ProvidedValue.$stable);
            composer2.endNode();
            int i24 = (i20 & 14) | (i19 & 112);
            if (pVar2 != null) {
                composer2.startReplaceGroup(407501183);
                Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE), f3, 0.0f, 2, null);
                if (z) {
                    composer2.startReplaceGroup(-402488651);
                    Modifier.Companion companion = Modifier.Companion;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda1
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$1$0((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    companionClearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue2);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-402486714);
                    composer2.endReplaceGroup();
                    companionClearAndSetSemantics2 = Modifier.Companion;
                    z8 = false;
                }
                Modifier modifierThen = modifierM2757paddingVpY3zN4$default.then(companionClearAndSetSemantics2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (i12 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda2
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$2$0(aVar, (GraphicsLayerScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierThen, (l) objRememberedValue3);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal2, composer2, (i10 >> 3) & 112);
                int iM3 = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierGraphicsLayer);
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
                Updater.m7351setimpl(composer2, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer2, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer2, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer2, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Composer composer3 = composer2;
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, textStyle, pVar, composer3, i24 | i23);
                composerStartRestartGroup = composer3;
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j4, textStyle2, pVar2, composerStartRestartGroup, (i18 & 14) | ((i13 >> 24) & 112) | (i19 & DisplayStrings.DS_TAP_TO_VERIFY));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.startReplaceGroup(408520308);
                Modifier modifierM2757paddingVpY3zN4$default2 = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE), f3, 0.0f, 2, null);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-402453739);
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda3
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$4$0((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (l) objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-402451802);
                    composerStartRestartGroup.endReplaceGroup();
                    companionClearAndSetSemantics = Modifier.Companion;
                    z8 = false;
                }
                Modifier modifierThen2 = modifierM2757paddingVpY3zN4$default2.then(companionClearAndSetSemantics);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i12 == 4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda4
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return AppBarKt.TopAppBarLayout__5F1rQI$lambda$0$5$0(aVar, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierThen2, (l) objRememberedValue5);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM4 = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, textStyle, pVar, composerStartRestartGroup, i24 | i23);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM5 = AppBarKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default2);
            a<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM5), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            pVar6 = pVar4;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j5)), pVar6, composerStartRestartGroup, ((i11 >> 15) & 112) | ProvidedValue.$stable);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z8;
        } else {
            horizontal2 = horizontal;
            pVar5 = pVar3;
            composerStartRestartGroup.skipToGroupEnd();
            z7 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Alignment.Horizontal horizontal3 = horizontal2;
            final p<? super Composer, ? super Integer, ab> pVar7 = pVar6;
            final p<? super Composer, ? super Integer, ab> pVar8 = pVar5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AppBarKt.TopAppBarLayout__5F1rQI$lambda$2(modifier, floatProducer, j2, j3, j4, j5, pVar, textStyle, pVar2, textStyle2, aVar, vertical, horizontal3, i2, z7, pVar8, pVar7, f2, paddingValues, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TopAppBarLayout__5F1rQI$lambda$0$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TopAppBarLayout__5F1rQI$lambda$0$2$0(a aVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) aVar.invoke()).floatValue());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TopAppBarLayout__5F1rQI$lambda$0$4$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TopAppBarLayout__5F1rQI$lambda$0$5$0(a aVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) aVar.invoke()).floatValue());
        return ab.f48028a;
    }

    static final ab TopAppBarLayout__5F1rQI$lambda$2(Modifier modifier, FloatProducer floatProducer, long j2, long j3, long j4, long j5, p pVar, TextStyle textStyle, p pVar2, TextStyle textStyle2, a aVar, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, boolean z, p pVar3, p pVar4, float f2, PaddingValues paddingValues, int i3, int i4, Composer composer, int i5) {
        m4363TopAppBarLayout_5F1rQI(modifier, floatProducer, j2, j3, j4, j5, pVar, textStyle, pVar2, textStyle2, aVar, vertical, horizontal, i2, z, pVar3, pVar4, f2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    static final ab TopAppBar_121YqSk$lambda$0(p pVar, p pVar2, Modifier modifier, p pVar3, q qVar, Alignment.Horizontal horizontal, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i2, int i3, int i4, Composer composer, int i5) {
        m4360TopAppBar121YqSk(pVar, pVar2, modifier, pVar3, qVar, horizontal, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab TopAppBar_GHTll3U$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, Composer composer, int i4) {
        m4361TopAppBarGHTll3U(pVar, modifier, pVar2, qVar, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab TopAppBar_gNPyAyM$lambda$0(p pVar, Modifier modifier, p pVar2, q qVar, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        m4362TopAppBargNPyAyM(pVar, modifier, pVar2, qVar, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* renamed from: TwoRowsTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4364TwoRowsTopAppBareXZ4JBQ(final h.g.a.q<? super java.lang.Boolean, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, androidx.compose.ui.Modifier r38, h.g.a.q<? super java.lang.Boolean, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.Alignment.Horizontal r42, float r43, float r44, androidx.compose.foundation.layout.WindowInsets r45, androidx.compose.material3.TopAppBarColors r46, androidx.compose.material3.TopAppBarScrollBehavior r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m4364TwoRowsTopAppBareXZ4JBQ(h.g.a.q, androidx.compose.ui.Modifier, h.g.a.q, h.g.a.p, h.g.a.q, androidx.compose.ui.Alignment$Horizontal, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: TwoRowsTopAppBar-pJA5dT0, reason: not valid java name */
    private static final void m4365TwoRowsTopAppBarpJA5dT0(Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final TextStyle textStyle, final float f2, final p<? super Composer, ? super Integer, ab> pVar2, final TextStyle textStyle2, final p<? super Composer, ? super Integer, ab> pVar3, final TextStyle textStyle3, final p<? super Composer, ? super Integer, ab> pVar4, final TextStyle textStyle4, final Alignment.Horizontal horizontal, final p<? super Composer, ? super Integer, ab> pVar5, final q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, final float f3, final float f4, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        TextStyle textStyle5;
        float f5;
        p<? super Composer, ? super Integer, ab> pVar6;
        int i6;
        TextStyle textStyle6;
        int i7;
        p<? super Composer, ? super Integer, ab> pVar7;
        int i8;
        TextStyle textStyle7;
        int i9;
        int i10;
        q<? super RowScope, ? super Composer, ? super Integer, ab> qVar2;
        int i11;
        boolean z;
        int i12;
        final Modifier modifier3;
        int i13 = i4 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1092180406);
        if (i13 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            textStyle5 = textStyle;
            i5 |= true != composerStartRestartGroup.changed(textStyle5) ? 128 : 256;
        } else {
            textStyle5 = textStyle;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f5 = f2;
            i5 |= true != composerStartRestartGroup.changed(f5) ? 1024 : 2048;
        } else {
            f5 = f2;
        }
        if ((i2 & 24576) == 0) {
            pVar6 = pVar2;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 8192 : 16384;
        } else {
            pVar6 = pVar2;
        }
        if ((i2 & 196608) == 0) {
            i6 = 196608;
            textStyle6 = textStyle2;
            i5 |= true != composerStartRestartGroup.changed(textStyle6) ? 65536 : 131072;
        } else {
            i6 = 196608;
            textStyle6 = textStyle2;
        }
        if ((i2 & 1572864) == 0) {
            i7 = 1572864;
            pVar7 = pVar3;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 524288 : 1048576;
        } else {
            i7 = 1572864;
            pVar7 = pVar3;
        }
        if ((i2 & 12582912) == 0) {
            i8 = 12582912;
            i5 |= true != composerStartRestartGroup.changed(textStyle3) ? 4194304 : 8388608;
        } else {
            i8 = 12582912;
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar4) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            textStyle7 = textStyle4;
            i5 |= true != composerStartRestartGroup.changed(textStyle7) ? 268435456 : 536870912;
        } else {
            textStyle7 = textStyle4;
        }
        if ((i3 & 6) == 0) {
            i9 = i13;
            i10 = i3 | (true != composerStartRestartGroup.changed(horizontal) ? 2 : 4);
        } else {
            i9 = i13;
            i10 = i3;
        }
        int i14 = i10;
        if ((i3 & 48) == 0) {
            i10 = i14 | (true != composerStartRestartGroup.changedInstance(pVar5) ? 16 : 32);
        }
        if ((i3 & 384) == 0) {
            qVar2 = qVar;
            i11 = i10 | (true != composerStartRestartGroup.changedInstance(qVar2) ? 128 : 256);
        } else {
            qVar2 = qVar;
            i11 = i10;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i11 |= true == composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            z = true;
            i11 |= true == composerStartRestartGroup.changed(f4) ? 16384 : 8192;
        } else {
            z = true;
        }
        int i15 = i11;
        if ((i3 & i6) == 0) {
            i12 = i15 | (z == composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536);
        } else {
            i12 = i15;
        }
        int i16 = i12;
        if ((i3 & i7) == 0) {
            i12 = i16 | (z != composerStartRestartGroup.changed(topAppBarColors) ? 524288 : 1048576);
        }
        int i17 = i12;
        if ((i3 & i8) == 0) {
            i12 = i17 | (z != composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 4194304 : 8388608);
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (4793491 & i12) == 4793490) ? false : true, i5 & 1)) {
            Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092180406, i5, i12, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:2982)");
            }
            ((TwoRowsTopAppBarOverride) composerStartRestartGroup.consume(LocalTwoRowsTopAppBarOverride)).TwoRowsTopAppBar(new TwoRowsTopAppBarOverrideScope(modifier4, pVar, textStyle5, f5, pVar6, textStyle6, pVar7, textStyle3, pVar4, textStyle7, horizontal, pVar5, qVar2, f3, f4, windowInsets, topAppBarColors, topAppBarScrollBehavior, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda43
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AppBarKt.TwoRowsTopAppBar_pJA5dT0$lambda$1(modifier3, pVar, textStyle, f2, pVar2, textStyle2, pVar3, textStyle3, pVar4, textStyle4, horizontal, pVar5, qVar, f3, f4, windowInsets, topAppBarColors, topAppBarScrollBehavior, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TwoRowsTopAppBar_eXZ4JBQ$lambda$0(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1674885936, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:917)");
            }
            qVar.invoke(true, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TwoRowsTopAppBar_eXZ4JBQ$lambda$1(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295408045, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:921)");
            }
            qVar.invoke(false, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TwoRowsTopAppBar_eXZ4JBQ$lambda$2(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1843948267, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:923)");
            }
            if (qVar == null) {
                composer.startReplaceGroup(431118634);
            } else {
                composer.startReplaceGroup(-1787208265);
                qVar.invoke(true, composer, 6);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TwoRowsTopAppBar_eXZ4JBQ$lambda$3(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902478807, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:925)");
            }
            if (qVar == null) {
                composer.startReplaceGroup(-357689013);
            } else {
                composer.startReplaceGroup(1373934966);
                qVar.invoke(false, composer, 6);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TwoRowsTopAppBar_eXZ4JBQ$lambda$4(q qVar, Modifier modifier, q qVar2, p pVar, q qVar3, Alignment.Horizontal horizontal, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m4364TwoRowsTopAppBareXZ4JBQ(qVar, modifier, qVar2, pVar, qVar3, horizontal, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab TwoRowsTopAppBar_pJA5dT0$lambda$1(Modifier modifier, p pVar, TextStyle textStyle, float f2, p pVar2, TextStyle textStyle2, p pVar3, TextStyle textStyle3, p pVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, p pVar5, q qVar, float f3, float f4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3, int i4, Composer composer, int i5) {
        m4365TwoRowsTopAppBarpJA5dT0(modifier, pVar, textStyle, f2, pVar2, textStyle2, pVar3, textStyle3, pVar4, textStyle4, horizontal, pVar5, qVar, f3, f4, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier adjustHeightOffsetLimit(Modifier modifier, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        final TopAppBarState state;
        Modifier modifierOnSizeChanged;
        return (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null || (modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, new l() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda29
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AppBarKt.adjustHeightOffsetLimit$lambda$0$0(state, (IntSize) obj);
            }
        })) == null) ? modifier : modifierOnSizeChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab adjustHeightOffsetLimit$lambda$0$0(TopAppBarState topAppBarState, IntSize intSize) {
        topAppBarState.setHeightOffsetLimit(-(((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - topAppBarState.getHeightOffset()));
        return ab.f48028a;
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    public static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> getLocalSingleRowTopAppBarOverride() {
        return LocalSingleRowTopAppBarOverride;
    }

    public static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> getLocalTwoRowsTopAppBarOverride() {
        return LocalTwoRowsTopAppBarOverride;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f2, final float f3, final float f4, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i2, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:2502)");
        }
        boolean z = true;
        if (1 == (i3 & 1)) {
            f2 = -3.4028235E38f;
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.Companion.getSaver();
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
            objRememberedValue = new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda6
                @Override // h.g.a.a
                public final Object invoke() {
                    return AppBarKt.BottomAppBarState(f2, f3, f4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberIsScrollingContentAtStart(final ScrollState scrollState, final boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2111817842, i2, -1, "androidx.compose.material3.rememberIsScrollingContentAtStart (AppBar.kt:2087)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(scrollState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda22
                @Override // h.g.a.a
                public final Object invoke() {
                    return Boolean.valueOf(AppBarKt.rememberIsScrollingContentAtStart$lambda$1$0(z, scrollState));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        State<Boolean> state = (State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIsScrollingContentAtStart$lambda$0$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getReverseLayout() ? !lazyListState.getCanScrollForward() : !lazyListState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIsScrollingContentAtStart$lambda$1$0(boolean z, ScrollState scrollState) {
        return z ? !scrollState.getCanScrollForward() : !scrollState.getCanScrollBackward();
    }

    public static final TopAppBarState rememberTopAppBarState(final float f2, final float f3, final float f4, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i2, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:2112)");
        }
        boolean z = true;
        if (1 == (i3 & 1)) {
            f2 = -3.4028235E38f;
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
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
            objRememberedValue = new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda9
                @Override // h.g.a.a
                public final Object invoke() {
                    return AppBarKt.rememberTopAppBarState$lambda$0$0(f2, f3, f4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState rememberTopAppBarState$lambda$0$0(float f2, float f3, float f4) {
        return new TopAppBarState(f2, f3, f4);
    }

    private static final State<Boolean> rememberTouchExplorationService(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1660719518, i2, -1, "androidx.compose.material3.rememberTouchExplorationService (AppBar.kt:3891)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, false, false, composer, DisplayStrings.DS_NONE, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberAccessibilityServiceState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r23, false, r6, r7, 2, null) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r3, r6, r5, false, r4, r7, 4, null) == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r21, float r22, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, h.c.e<? super androidx.compose.ui.unit.Velocity> r25) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    static final ab settleAppBar$lambda$0(an anVar, TopAppBarState topAppBarState, an anVar2, AnimationScope animationScope) {
        float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
        float heightOffset = topAppBarState.getHeightOffset();
        topAppBarState.setHeightOffset(heightOffset + fFloatValue);
        float fAbs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
        anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
        anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return ab.f48028a;
    }

    static final ab settleAppBar$lambda$1(TopAppBarState topAppBarState, AnimationScope animationScope) {
        topAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r5, r23, false, r6, r7, 2, null) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r3, r6, r5, false, r4, r7, 4, null) == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object settleAppBarBottom(androidx.compose.material3.BottomAppBarState r21, float r22, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, h.c.e<? super androidx.compose.ui.unit.Velocity> r25) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBarBottom(androidx.compose.material3.BottomAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    static final ab settleAppBarBottom$lambda$0(an anVar, BottomAppBarState bottomAppBarState, an anVar2, AnimationScope animationScope) {
        float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
        float heightOffset = bottomAppBarState.getHeightOffset();
        bottomAppBarState.setHeightOffset(heightOffset + fFloatValue);
        float fAbs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
        anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
        anVar2.f48102a = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return ab.f48028a;
    }

    static final ab settleAppBarBottom$lambda$1(BottomAppBarState bottomAppBarState, AnimationScope animationScope) {
        bottomAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return ab.f48028a;
    }

    public static /* synthetic */ void getLocalSingleRowTopAppBarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalTwoRowsTopAppBarOverride$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Boolean> rememberIsScrollingContentAtStart(final LazyListState lazyListState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-191857171, i2, -1, "androidx.compose.material3.rememberIsScrollingContentAtStart (AppBar.kt:2067)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(lazyListState)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.AppBarKt$$ExternalSyntheticLambda25
                @Override // h.g.a.a
                public final Object invoke() {
                    return Boolean.valueOf(AppBarKt.rememberIsScrollingContentAtStart$lambda$0$0(lazyListState));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        State<Boolean> state = (State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }
}
