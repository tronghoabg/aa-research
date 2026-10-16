package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.a.r;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec;
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec;
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<Color> DefaultColorAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<IntSize, IntSize> {
        final /* synthetic */ l<Integer, Integer> $initialWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super Integer, Integer> lVar) {
            super(1);
            this.$initialWidth = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m11331boximpl(m1762invokemzRDjE0(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1762invokemzRDjE0(long j2) {
            return (((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (this.$initialWidth.invoke(Integer.valueOf((int) (j2 >> 32))).intValue() << 32);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandIn$1, reason: invalid class name and case insensitive filesystem */
    public final class C01801 extends y implements l<IntSize, IntSize> {
        public static final C01801 INSTANCE = new C01801();

        C01801() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            intSize.m11343unboximpl();
            return IntSize.m11331boximpl(0L);
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1763invokemzRDjE0(long j2) {
            return 0L;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2, reason: invalid class name and case insensitive filesystem */
    final class C01822 extends y implements l<IntSize, IntSize> {
        final /* synthetic */ l<Integer, Integer> $initialHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01822(l<? super Integer, Integer> lVar) {
            super(1);
            this.$initialHeight = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m11331boximpl(m1764invokemzRDjE0(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1764invokemzRDjE0(long j2) {
            return (((int) (j2 >> 32)) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.$initialHeight.invoke(Integer.valueOf((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))).intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2, reason: invalid class name and case insensitive filesystem */
    final class C01842 extends y implements l<IntSize, IntSize> {
        final /* synthetic */ l<Integer, Integer> $targetWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01842(l<? super Integer, Integer> lVar) {
            super(1);
            this.$targetWidth = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m11331boximpl(m1765invokemzRDjE0(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1765invokemzRDjE0(long j2) {
            return (((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (this.$targetWidth.invoke(Integer.valueOf((int) (j2 >> 32))).intValue() << 32);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C01851 extends y implements l<IntSize, IntSize> {
        public static final C01851 INSTANCE = new C01851();

        C01851() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            intSize.m11343unboximpl();
            return IntSize.m11331boximpl(0L);
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1766invokemzRDjE0(long j2) {
            return 0L;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2, reason: invalid class name and case insensitive filesystem */
    final class C01872 extends y implements l<IntSize, IntSize> {
        final /* synthetic */ l<Integer, Integer> $targetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01872(l<? super Integer, Integer> lVar) {
            super(1);
            this.$targetHeight = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m11331boximpl(m1767invokemzRDjE0(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m1767invokemzRDjE0(long j2) {
            return (((int) (j2 >> 32)) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & this.$targetHeight.invoke(Integer.valueOf((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))).intValue());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2, reason: invalid class name and case insensitive filesystem */
    final class C01892 extends y implements l<IntSize, IntOffset> {
        final /* synthetic */ l<Integer, Integer> $initialOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01892(l<? super Integer, Integer> lVar) {
            super(1);
            this.$initialOffsetX = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m11287boximpl(m1768invokemHKZG7I(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mHKZG7I, reason: not valid java name */
        public final long m1768invokemHKZG7I(long j2) {
            return this.$initialOffsetX.invoke(Integer.valueOf((int) (j2 >> 32))).intValue() << 32;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2, reason: invalid class name and case insensitive filesystem */
    final class C01912 extends y implements l<IntSize, IntOffset> {
        final /* synthetic */ l<Integer, Integer> $initialOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01912(l<? super Integer, Integer> lVar) {
            super(1);
            this.$initialOffsetY = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m11287boximpl(m1769invokemHKZG7I(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mHKZG7I, reason: not valid java name */
        public final long m1769invokemHKZG7I(long j2) {
            return this.$initialOffsetY.invoke(Integer.valueOf((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2, reason: invalid class name and case insensitive filesystem */
    final class C01932 extends y implements l<IntSize, IntOffset> {
        final /* synthetic */ l<Integer, Integer> $targetOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01932(l<? super Integer, Integer> lVar) {
            super(1);
            this.$targetOffsetX = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m11287boximpl(m1770invokemHKZG7I(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mHKZG7I, reason: not valid java name */
        public final long m1770invokemHKZG7I(long j2) {
            return this.$targetOffsetX.invoke(Integer.valueOf((int) (j2 >> 32))).intValue() << 32;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2, reason: invalid class name and case insensitive filesystem */
    final class C01952 extends y implements l<IntSize, IntOffset> {
        final /* synthetic */ l<Integer, Integer> $targetOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01952(l<? super Integer, Integer> lVar) {
            super(1);
            this.$targetOffsetY = lVar;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m11287boximpl(m1771invokemHKZG7I(intSize.m11343unboximpl()));
        }

        /* renamed from: invoke-mHKZG7I, reason: not valid java name */
        public final long m1771invokemHKZG7I(long j2) {
            return this.$targetOffsetY.invoke(Integer.valueOf((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))).intValue() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        }
    }

    static {
        int i2 = VisibilityThresholdsKt.f1650a;
        DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
    }

    public static final <S> void DeferredTransitionCleanupEffect(Transition<S> transition, a<ab> aVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1186853286);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(transition) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1186853286, i3, -1, "androidx.compose.animation.DeferredTransitionCleanupEffect (EnterExitTransition.kt:1024)");
            }
            boolean z = transition.getPendingTargetState() != null;
            if (x.n(transition.getCurrentState(), transition.getTargetState()) && !z) {
                aVar.invoke();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                boolean[] zArr = {z};
                composerStartRestartGroup.updateRememberedValue(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Object[1];
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Object[] objArr = (Object[]) objRememberedValue2;
            if (!x.n(objArr[0], transition.getTargetState())) {
                if (!z && !zArr2[0]) {
                    aVar.invoke();
                }
                objArr[0] = transition.getTargetState();
            }
            zArr2[0] = z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass1(transition, aVar, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[PHI: r1
  0x0115: PHI (r1v7 androidx.compose.animation.EnterTransition) = (r1v5 androidx.compose.animation.EnterTransition), (r1v8 androidx.compose.animation.EnterTransition) binds: [B:46:0x0113, B:42:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130 A[PHI: r2
  0x0130: PHI (r2v8 androidx.compose.animation.ExitTransition) = (r2v6 androidx.compose.animation.ExitTransition), (r2v9 androidx.compose.animation.ExitTransition) binds: [B:56:0x012e, B:52:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[PHI: r4
  0x0154: PHI (r4v10 androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>) = 
  (r4v8 androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>)
  (r4v11 androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>)
 binds: [B:66:0x0152, B:62:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, final androidx.compose.animation.SharedMutableTransformState r23, java.lang.String r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.SharedMutableTransformState, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.GraphicsLayerBlockForEnterExit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.g.a.l createGraphicsLayerBlock$lambda$2$0(androidx.compose.animation.core.Transition.DeferredAnimation r9, androidx.compose.animation.SharedMutableTransformState r10, androidx.compose.animation.core.Transition.DeferredAnimation r11, androidx.compose.animation.core.Transition r12, androidx.compose.animation.EnterTransition r13, androidx.compose.animation.ExitTransition r14, androidx.compose.animation.core.Transition.DeferredAnimation r15) {
        /*
            r0 = 0
            if (r9 == 0) goto L20
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            r1.<init>(r13, r14)
            r3 = r1
            h.g.a.l r3 = (h.g.a.l) r3
            java.lang.Float r4 = r10.getAlphaHandoffValue()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            r1.<init>(r13, r14, r10)
            r6 = r1
            h.g.a.l r6 = (h.g.a.l) r6
            r7 = 4
            r8 = 0
            r5 = 0
            r2 = r9
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.Transition.DeferredAnimation.animate$default(r2, r3, r4, r5, r6, r7, r8)
            goto L21
        L20:
            r9 = r0
        L21:
            if (r11 == 0) goto L40
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            r1.<init>(r13, r14)
            r3 = r1
            h.g.a.l r3 = (h.g.a.l) r3
            java.lang.Float r4 = r10.getScaleHandoffValue()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            r1.<init>(r13, r14, r10)
            r6 = r1
            h.g.a.l r6 = (h.g.a.l) r6
            r7 = 4
            r8 = 0
            r5 = 0
            r2 = r11
            androidx.compose.runtime.State r11 = androidx.compose.animation.core.Transition.DeferredAnimation.animate$default(r2, r3, r4, r5, r6, r7, r8)
            goto L41
        L40:
            r11 = r0
        L41:
            java.lang.Object r12 = r12.getCurrentState()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r12 != r1) goto L67
            androidx.compose.animation.TransitionData r12 = r13.getData$animation()
            androidx.compose.animation.Scale r12 = r12.getScale()
            if (r12 == 0) goto L5c
        L53:
            long r1 = r12.m1806getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r12 = androidx.compose.ui.graphics.TransformOrigin.m8658boximpl(r1)
            goto L86
        L5c:
            androidx.compose.animation.TransitionData r12 = r14.getData$animation()
            androidx.compose.animation.Scale r12 = r12.getScale()
            if (r12 == 0) goto L85
            goto L53
        L67:
            androidx.compose.animation.TransitionData r12 = r14.getData$animation()
            androidx.compose.animation.Scale r12 = r12.getScale()
            if (r12 == 0) goto L7a
        L71:
            long r1 = r12.m1806getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r12 = androidx.compose.ui.graphics.TransformOrigin.m8658boximpl(r1)
            goto L86
        L7a:
            androidx.compose.animation.TransitionData r12 = r13.getData$animation()
            androidx.compose.animation.Scale r12 = r12.getScale()
            if (r12 == 0) goto L85
            goto L71
        L85:
            r12 = r0
        L86:
            if (r15 == 0) goto La1
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE
            r2 = r0
            h.g.a.l r2 = (h.g.a.l) r2
            androidx.compose.ui.graphics.TransformOrigin r3 = r10.m1818getTransformOriginHandoffValue0uW6WK0()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            r0.<init>(r12, r13, r14, r10)
            r5 = r0
            h.g.a.l r5 = (h.g.a.l) r5
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r15
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.Transition.DeferredAnimation.animate$default(r1, r2, r3, r4, r5, r6, r7)
        La1:
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r12 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            r12.<init>(r10, r9, r11, r0)
            h.g.a.l r12 = (h.g.a.l) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock$lambda$2$0(androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.SharedMutableTransformState, androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.core.Transition$DeferredAnimation):h.g.a.l");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r21, androidx.compose.animation.EnterTransition r22, androidx.compose.animation.ExitTransition r23, boolean r24, h.g.a.a<java.lang.Boolean> r25, androidx.compose.animation.SharedMutableTransformState r26, java.lang.String r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, boolean, h.g.a.a, androidx.compose.animation.SharedMutableTransformState, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.Modifier");
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new AnonymousClass2(lVar));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01791.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z2, lVar);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, l<? super IntSize, IntSize> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01801.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z2, lVar);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new C01822(lVar));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01811.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z2, lVar);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f2);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f2);
    }

    public static final <T extends TransitionEffect> T get(EnterTransition enterTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m1751scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2, long j2) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m1752scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
        }
        return m1751scaleInL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m1753scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f2, long j2) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m1754scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
        }
        return m1753scaleOutL8ZKhE(finiteAnimationSpec, f2, j2);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new C01842(lVar));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01831.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z2, lVar);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, l<? super IntSize, IntSize> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01851.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z2, lVar);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new C01872(lVar));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            lVar = C01861.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z2, lVar);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super IntSize, IntOffset> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        return slideIn(finiteAnimationSpec, lVar);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new C01892(lVar));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = C01881.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, lVar);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new C01912(lVar));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = C01901.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, lVar);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super IntSize, IntOffset> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        return slideOut(finiteAnimationSpec, lVar);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new C01932(lVar));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = C01921.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, lVar);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new C01952(lVar));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            int i3 = VisibilityThresholdsKt.f1650a;
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
        if ((i2 & 2) != 0) {
            lVar = C01941.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, lVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        return x.n(horizontal, Alignment.Companion.getStart()) ? Alignment.Companion.getCenterStart() : x.n(horizontal, Alignment.Companion.getEnd()) ? Alignment.Companion.getCenterEnd() : Alignment.Companion.getCenter();
    }

    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> transition, EnterTransition enterTransition, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i2, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1054)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(transition)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.PostExit) {
            mutableState.setValue(trackActiveEnter$lambda$1(mutableState).plus(enterTransition));
        }
        EnterTransition enterTransitionTrackActiveEnter$lambda$1 = trackActiveEnter$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransitionTrackActiveEnter$lambda$1;
    }

    private static final EnterTransition trackActiveEnter$lambda$1(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final ExitTransition trackActiveExit(Transition<EnterExitState> transition, ExitTransition exitTransition, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i2, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1074)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(transition)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$1(mutableState).plus(exitTransition));
        }
        ExitTransition exitTransitionTrackActiveExit$lambda$1 = trackActiveExit$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransitionTrackActiveExit$lambda$1;
    }

    private static final ExitTransition trackActiveExit$lambda$1(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final SharedMutableTransformState trackActiveMutableState(Transition<EnterExitState> transition, SharedMutableTransformState sharedMutableTransformState, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1698354667, i2, -1, "androidx.compose.animation.trackActiveMutableState (EnterExitTransition.kt:1045)");
        }
        int i3 = i2 & 14;
        if (sharedMutableTransformState == null) {
            composer.startReplaceGroup(-968938819);
            boolean z = ((i3 ^ 6) > 4 && composer.changed(transition)) || (i2 & 6) == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SharedMutableTransformState();
                composer.updateRememberedValue(objRememberedValue);
            }
            sharedMutableTransformState = (SharedMutableTransformState) objRememberedValue;
        } else {
            composer.startReplaceGroup(-31257052);
        }
        composer.endReplaceGroup();
        sharedMutableTransformState.setMutating(transition.getPendingTargetState() != null);
        boolean zChangedInstance = composer.changedInstance(sharedMutableTransformState);
        EnterExitTransitionKt$trackActiveMutableState$1$1 enterExitTransitionKt$trackActiveMutableState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || enterExitTransitionKt$trackActiveMutableState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            enterExitTransitionKt$trackActiveMutableState$1$1RememberedValue = new EnterExitTransitionKt$trackActiveMutableState$1$1(sharedMutableTransformState);
            composer.updateRememberedValue(enterExitTransitionKt$trackActiveMutableState$1$1RememberedValue);
        }
        DeferredTransitionCleanupEffect(transition, (a) enterExitTransitionKt$trackActiveMutableState$1$1RememberedValue, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedMutableTransformState;
    }

    /* renamed from: unveilIn-bw27NRU, reason: not valid java name */
    public static final EnterTransition m1755unveilInbw27NRU(FiniteAnimationSpec<Color> finiteAnimationSpec, long j2, boolean z) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, new Veil(j2, Color.m8227copywmQWz5c$default(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), finiteAnimationSpec, z, null), false, null, 111, null));
    }

    /* renamed from: unveilIn-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m1756unveilInbw27NRU$default(FiniteAnimationSpec finiteAnimationSpec, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            j2 = Color.m8227copywmQWz5c$default(Color.Companion.m8254getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return m1755unveilInbw27NRU(finiteAnimationSpec, j2, z & ((i2 & 4) == 0));
    }

    /* renamed from: veilOut-bw27NRU, reason: not valid java name */
    public static final ExitTransition m1757veilOutbw27NRU(FiniteAnimationSpec<Color> finiteAnimationSpec, long j2, boolean z) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, new Veil(Color.m8227copywmQWz5c$default(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j2, finiteAnimationSpec, z, null), false, null, 111, null));
    }

    /* renamed from: veilOut-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m1758veilOutbw27NRU$default(FiniteAnimationSpec finiteAnimationSpec, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            j2 = Color.m8227copywmQWz5c$default(Color.Companion.m8254getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return m1757veilOutbw27NRU(finiteAnimationSpec, j2, z & ((i2 & 4) == 0));
    }

    public static final EnterTransition withEffect(EnterTransition enterTransition, TransitionEffect transitionEffect) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, null, false, r.e(new k(transitionEffect.getKey$animation(), transitionEffect)), 63, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1, reason: invalid class name and case insensitive filesystem */
    public final class C01791 extends y implements l<Integer, Integer> {
        public static final C01791 INSTANCE = new C01791();

        C01791() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1, reason: invalid class name and case insensitive filesystem */
    public final class C01811 extends y implements l<Integer, Integer> {
        public static final C01811 INSTANCE = new C01811();

        C01811() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1, reason: invalid class name and case insensitive filesystem */
    public final class C01831 extends y implements l<Integer, Integer> {
        public static final C01831 INSTANCE = new C01831();

        C01831() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1, reason: invalid class name and case insensitive filesystem */
    public final class C01861 extends y implements l<Integer, Integer> {
        public static final C01861 INSTANCE = new C01861();

        C01861() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1, reason: invalid class name and case insensitive filesystem */
    public final class C01881 extends y implements l<Integer, Integer> {
        public static final C01881 INSTANCE = new C01881();

        C01881() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1, reason: invalid class name and case insensitive filesystem */
    public final class C01901 extends y implements l<Integer, Integer> {
        public static final C01901 INSTANCE = new C01901();

        C01901() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1, reason: invalid class name and case insensitive filesystem */
    public final class C01921 extends y implements l<Integer, Integer> {
        public static final C01921 INSTANCE = new C01921();

        C01921() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1, reason: invalid class name and case insensitive filesystem */
    public final class C01941 extends y implements l<Integer, Integer> {
        public static final C01941 INSTANCE = new C01941();

        C01941() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i2) {
            return Integer.valueOf((-i2) / 2);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$DeferredTransitionCleanupEffect$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a<ab> $effect;
        final /* synthetic */ Transition $this_DeferredTransitionCleanupEffect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition transition, a<ab> aVar, int i2) {
            super(2);
            this.$this_DeferredTransitionCleanupEffect = transition;
            this.$effect = aVar;
            this.$$changed = i2;
        }

        public final void invoke(Composer composer, int i2) {
            EnterExitTransitionKt.DeferredTransitionCleanupEffect(this.$this_DeferredTransitionCleanupEffect, this.$effect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    public static final <T extends TransitionEffect> T get(ExitTransition exitTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final ExitTransition withEffect(ExitTransition exitTransition, TransitionEffect transitionEffect) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, null, false, r.e(new k(transitionEffect.getKey$animation(), transitionEffect)), 63, null));
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        return x.n(vertical, Alignment.Companion.getTop()) ? Alignment.Companion.getTopCenter() : x.n(vertical, Alignment.Companion.getBottom()) ? Alignment.Companion.getBottomCenter() : Alignment.Companion.getCenter();
    }
}
