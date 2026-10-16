package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DeferredTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize = -9223372034707292160L;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$SizeTransform$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<IntSize, IntSize, SpringSpec<IntSize>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
            return m1703invokeTemP2vQ(intSize.m11343unboximpl(), intSize2.m11343unboximpl());
        }

        /* renamed from: invoke-TemP2vQ, reason: not valid java name */
        public final SpringSpec<IntSize> m1703invokeTemP2vQ(long j2, long j3) {
            int i2 = VisibilityThresholdsKt.f1650a;
            return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(S r19, androidx.compose.ui.Modifier r20, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, androidx.compose.ui.Alignment r22, java.lang.String r23, h.g.a.l<? super S, ? extends java.lang.Object> r24, h.g.a.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, java.lang.String, h.g.a.l, h.g.a.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContentImpl(androidx.compose.animation.core.Transition<S> r19, androidx.compose.ui.Modifier r20, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, androidx.compose.ui.Alignment r22, h.g.a.l<? super S, ? extends java.lang.Object> r23, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.MutableContentTransform> r24, h.g.a.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContentImpl(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void DeferredAnimatedContent(androidx.compose.animation.core.DeferredTransition<S> r20, androidx.compose.ui.Modifier r21, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r22, androidx.compose.ui.Alignment r23, h.g.a.l<? super S, ? extends java.lang.Object> r24, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.MutableContentTransform> r25, h.g.a.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.DeferredAnimatedContent(androidx.compose.animation.core.DeferredTransition, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.r, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SizeTransform SizeTransform(boolean z, p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        return new SizeTransformImpl(z, pVar);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, p pVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = AnonymousClass1.INSTANCE;
        }
        return SizeTransform(1 == ((z ? 1 : 0) | (i2 & 1)), pVar);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$7, reason: invalid class name */
    final class AnonymousClass7 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ l $contentKey;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Transition $this_AnimatedContent;
        final /* synthetic */ l<AnimatedContentTransitionScope, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass7(Transition transition, Modifier modifier, l<? super AnimatedContentTransitionScope, ContentTransform> lVar, Alignment alignment, l lVar2, r rVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedContent = transition;
            this.$modifier = modifier;
            this.$transitionSpec = lVar;
            this.$contentAlignment = alignment;
            this.$contentKey = lVar2;
            this.$content = rVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.AnimatedContent(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3, reason: invalid class name */
    final class AnonymousClass3 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ l $contentKey;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ l<AnimatedContentTransitionScope, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Object obj, Modifier modifier, l<? super AnimatedContentTransitionScope, ContentTransform> lVar, Alignment alignment, String str, l lVar2, r rVar, int i2, int i3) {
            super(2);
            this.$targetState = obj;
            this.$modifier = modifier;
            this.$transitionSpec = lVar;
            this.$contentAlignment = alignment;
            this.$label = str;
            this.$contentKey = lVar2;
            this.$content = rVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.AnimatedContent(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContentImpl$8, reason: invalid class name */
    final class AnonymousClass8 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ l $contentKey;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ l<AnimatedContentTransitionScope, MutableContentTransform> $mutableTransformSpec;
        final /* synthetic */ Transition $this_AnimatedContentImpl;
        final /* synthetic */ l<AnimatedContentTransitionScope, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass8(Transition transition, Modifier modifier, l<? super AnimatedContentTransitionScope, ContentTransform> lVar, Alignment alignment, l lVar2, l<? super AnimatedContentTransitionScope, MutableContentTransform> lVar3, r rVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedContentImpl = transition;
            this.$modifier = modifier;
            this.$transitionSpec = lVar;
            this.$contentAlignment = alignment;
            this.$contentKey = lVar2;
            this.$mutableTransformSpec = lVar3;
            this.$content = rVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.AnimatedContentImpl(this.$this_AnimatedContentImpl, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$mutableTransformSpec, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$DeferredAnimatedContent$4, reason: invalid class name */
    final class AnonymousClass4 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ r $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ l $contentKey;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ l<AnimatedContentTransitionScope, MutableContentTransform> $mutableTransformSpec;
        final /* synthetic */ DeferredTransition $this_DeferredAnimatedContent;
        final /* synthetic */ l<AnimatedContentTransitionScope, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(DeferredTransition deferredTransition, Modifier modifier, l<? super AnimatedContentTransitionScope, ContentTransform> lVar, Alignment alignment, l lVar2, l<? super AnimatedContentTransitionScope, MutableContentTransform> lVar3, r rVar, int i2, int i3) {
            super(2);
            this.$this_DeferredAnimatedContent = deferredTransition;
            this.$modifier = modifier;
            this.$transitionSpec = lVar;
            this.$contentAlignment = alignment;
            this.$contentKey = lVar2;
            this.$mutableTransformSpec = lVar3;
            this.$content = rVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.DeferredAnimatedContent(this.$this_DeferredAnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$mutableTransformSpec, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(androidx.compose.animation.core.Transition<S> r19, androidx.compose.ui.Modifier r20, h.g.a.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, androidx.compose.ui.Alignment r22, h.g.a.l<? super S, ? extends java.lang.Object> r23, h.g.a.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.r, androidx.compose.runtime.Composer, int, int):void");
    }
}
