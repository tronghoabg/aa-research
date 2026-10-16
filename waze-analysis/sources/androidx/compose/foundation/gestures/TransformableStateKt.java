package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.an;
import h.g.b.ap;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformableStateKt {
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m7996getZeroF1C5BW0(), 0.0f, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<TransformScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ long $centroid;
        final /* synthetic */ float $degrees;
        final /* synthetic */ an $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(an anVar, float f2, AnimationSpec<Float> animationSpec, long j2, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$previous = anVar;
            this.$degrees = f2;
            this.$animationSpec = animationSpec;
            this.$centroid = j2;
        }

        static final ab invokeSuspend$lambda$0(an anVar, TransformScope transformScope, long j2, AnimationScope animationScope) {
            TransformScope.CC.m2347transformByWithCentroidIEwrmTk$default(transformScope, j2, 0.0f, 0L, ((Number) animationScope.getValue()).floatValue() - anVar.f48102a, 6, null);
            anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$previous, this.$degrees, this.$animationSpec, this.$centroid, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
            return ((AnonymousClass3) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f48102a, 0.0f, 0L, 0L, false, 30, null);
                Float f2 = new Float(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final an anVar = this.$previous;
                final long j2 = this.$centroid;
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f2, animationSpec, false, new l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$3$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TransformableStateKt.AnonymousClass3.invokeSuspend$lambda$0(anVar, transformScope, j2, (AnimationScope) obj2);
                    }
                }, this, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<TransformScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ long $centroid;
        final /* synthetic */ an $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(an anVar, float f2, AnimationSpec<Float> animationSpec, long j2, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$previous = anVar;
            this.$zoomFactor = f2;
            this.$animationSpec = animationSpec;
            this.$centroid = j2;
        }

        static final ab invokeSuspend$lambda$0(an anVar, TransformScope transformScope, long j2, AnimationScope animationScope) {
            TransformScope.CC.m2347transformByWithCentroidIEwrmTk$default(transformScope, j2, anVar.f48102a == 0.0f ? 1.0f : ((Number) animationScope.getValue()).floatValue() / anVar.f48102a, 0L, 0.0f, 12, null);
            anVar.f48102a = ((Number) animationScope.getValue()).floatValue();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$previous, this.$zoomFactor, this.$animationSpec, this.$centroid, eVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // h.g.a.p
        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
            return ((AnonymousClass4) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.f48102a, 0.0f, 0L, 0L, false, 30, null);
                Float f2 = new Float(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final an anVar = this.$previous;
                final long j2 = this.$centroid;
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f2, animationSpec, false, new l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$4$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TransformableStateKt.AnonymousClass4.invokeSuspend$lambda$0(anVar, transformScope, j2, (AnimationScope) obj2);
                    }
                }, this, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$3, reason: invalid class name and case insensitive filesystem */
    final class C02613 extends g implements p<TransformScope, e<? super ab>, Object> {
        final /* synthetic */ long $centroid;
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02613(long j2, float f2, e<? super C02613> eVar) {
            super(2, eVar);
            this.$centroid = j2;
            this.$degrees = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02613 c02613 = new C02613(this.$centroid, this.$degrees, eVar);
            c02613.L$0 = obj;
            return c02613;
        }

        @Override // h.g.a.p
        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
            return ((C02613) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            ((TransformScope) this.L$0).mo2171transformByWithCentroidIEwrmTk(this.$centroid, 1.0f, Offset.Companion.m7996getZeroF1C5BW0(), this.$degrees);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<TransformScope, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$3, reason: invalid class name and case insensitive filesystem */
    final class C02623 extends g implements p<TransformScope, e<? super ab>, Object> {
        final /* synthetic */ long $centroid;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02623(long j2, float f2, e<? super C02623> eVar) {
            super(2, eVar);
            this.$centroid = j2;
            this.$zoomFactor = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02623 c02623 = new C02623(this.$centroid, this.$zoomFactor, eVar);
            c02623.L$0 = obj;
            return c02623;
        }

        @Override // h.g.a.p
        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
            return ((C02623) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            ((TransformScope) this.L$0).mo2171transformByWithCentroidIEwrmTk(this.$centroid, this.$zoomFactor, Offset.Companion.m7996getZeroF1C5BW0(), 0.0f);
            return ab.f48028a;
        }
    }

    public static final TransformableState TransformableState(final q<? super Float, ? super Offset, ? super Float, ab> qVar) {
        return TransformableState((r<? super Offset, ? super Float, ? super Offset, ? super Float, ab>) new r() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return TransformableStateKt.TransformableState$lambda$0(qVar, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
            }
        });
    }

    static final ab TransformableState$lambda$0(q qVar, Offset offset, float f2, Offset offset2, float f3) {
        qVar.invoke(Float.valueOf(f2), offset2, Float.valueOf(f3));
        return ab.f48028a;
    }

    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final /* synthetic */ Object m2351animateBySu4bsnU(TransformableState transformableState, float f2, long j2, float f3, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, e eVar) {
        Object objM2353animateByjlnHOkQ = m2353animateByjlnHOkQ(transformableState, f2, j2, f3, animationSpec, animationSpec2, animationSpec3, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2353animateByjlnHOkQ == a.f48038a ? objM2353animateByjlnHOkQ : ab.f48028a;
    }

    /* renamed from: animateBy-jlnHOkQ, reason: not valid java name */
    public static final Object m2353animateByjlnHOkQ(TransformableState transformableState, float f2, long j2, float f3, AnimationSpec<Float> animationSpec, AnimationSpec<Offset> animationSpec2, AnimationSpec<Float> animationSpec3, long j3, e<? super ab> eVar) {
        if (f2 <= 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        aq aqVar = new aq();
        aqVar.f48105a = new AnimationData(1.0f, Offset.Companion.m7996getZeroF1C5BW0(), 0.0f, null);
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new TransformableStateKt$animateBy$4(aqVar, new AnimationData(f2, j2, f3, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), j3, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: animateBy-jlnHOkQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2354animateByjlnHOkQ$default(TransformableState transformableState, float f2, long j2, float f3, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, long j3, e eVar, int i2, Object obj) {
        long jM7995getUnspecifiedF1C5BW0;
        TransformableState transformableState2;
        float f4;
        long j4;
        float f5;
        e eVar2;
        AnimationSpec springSpec = (i2 & 8) != 0 ? new SpringSpec(0.0f, 200.0f, null, 5, null) : animationSpec;
        AnimationSpec springSpec2 = (i2 & 16) != 0 ? new SpringSpec(0.0f, 200.0f, null, 5, null) : animationSpec2;
        AnimationSpec springSpec3 = (i2 & 32) != 0 ? new SpringSpec(0.0f, 200.0f, null, 5, null) : animationSpec3;
        if ((i2 & 64) != 0) {
            jM7995getUnspecifiedF1C5BW0 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            f4 = f2;
            j4 = j2;
            f5 = f3;
            eVar2 = eVar;
            transformableState2 = transformableState;
        } else {
            jM7995getUnspecifiedF1C5BW0 = j3;
            transformableState2 = transformableState;
            f4 = f2;
            j4 = j2;
            f5 = f3;
            eVar2 = eVar;
        }
        return m2353animateByjlnHOkQ(transformableState2, f4, j4, f5, springSpec, springSpec2, springSpec3, jM7995getUnspecifiedF1C5BW0, eVar2);
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final /* synthetic */ Object m2355animatePanByubNVwUQ(TransformableState transformableState, long j2, AnimationSpec animationSpec, e eVar) {
        Object objM2357animatePanByumk_asQ = m2357animatePanByumk_asQ(transformableState, j2, animationSpec, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2357animatePanByumk_asQ == a.f48038a ? objM2357animatePanByumk_asQ : ab.f48028a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2356animatePanByubNVwUQ$default(TransformableState transformableState, long j2, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m2355animatePanByubNVwUQ(transformableState, j2, animationSpec, eVar);
    }

    /* renamed from: animatePanBy-umk_asQ, reason: not valid java name */
    public static final Object m2357animatePanByumk_asQ(TransformableState transformableState, long j2, AnimationSpec<Offset> animationSpec, long j3, e<? super ab> eVar) {
        ap apVar = new ap();
        apVar.f48104a = Offset.Companion.m7996getZeroF1C5BW0();
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$3(apVar, j2, animationSpec, j3, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: animatePanBy-umk_asQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2358animatePanByumk_asQ$default(TransformableState transformableState, long j2, AnimationSpec animationSpec, long j3, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            j3 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2357animatePanByumk_asQ(transformableState, j2, animationSpec2, j3, eVar);
    }

    public static final /* synthetic */ Object animateRotateBy(TransformableState transformableState, float f2, AnimationSpec animationSpec, e eVar) {
        Object objM2359animateRotateByFgt4K4Q = m2359animateRotateByFgt4K4Q(transformableState, f2, animationSpec, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2359animateRotateByFgt4K4Q == a.f48038a ? objM2359animateRotateByFgt4K4Q : ab.f48028a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f2, animationSpec, eVar);
    }

    /* renamed from: animateRotateBy-Fgt4K4Q, reason: not valid java name */
    public static final Object m2359animateRotateByFgt4K4Q(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, long j2, e<? super ab> eVar) {
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new AnonymousClass3(new an(), f2, animationSpec, j2, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: animateRotateBy-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ Object m2360animateRotateByFgt4K4Q$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, long j2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2359animateRotateByFgt4K4Q(transformableState, f2, animationSpec2, j2, eVar);
    }

    public static final /* synthetic */ Object animateZoomBy(TransformableState transformableState, float f2, AnimationSpec animationSpec, e eVar) {
        Object objM2361animateZoomByFgt4K4Q = m2361animateZoomByFgt4K4Q(transformableState, f2, animationSpec, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2361animateZoomByFgt4K4Q == a.f48038a ? objM2361animateZoomByFgt4K4Q : ab.f48028a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f2, animationSpec, eVar);
    }

    /* renamed from: animateZoomBy-Fgt4K4Q, reason: not valid java name */
    public static final Object m2361animateZoomByFgt4K4Q(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, long j2, e<? super ab> eVar) {
        if (f2 <= 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        an anVar = new an();
        anVar.f48102a = 1.0f;
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new AnonymousClass4(anVar, f2, animationSpec, j2, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: animateZoomBy-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ Object m2362animateZoomByFgt4K4Q$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, long j2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2361animateZoomByFgt4K4Q(transformableState, f2, animationSpec2, j2, eVar);
    }

    /* renamed from: panBy-DUneCvk, reason: not valid java name */
    public static final Object m2363panByDUneCvk(TransformableState transformableState, long j2, long j3, e<? super ab> eVar) {
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new TransformableStateKt$panBy$3(j3, j2, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: panBy-DUneCvk$default, reason: not valid java name */
    public static /* synthetic */ Object m2364panByDUneCvk$default(TransformableState transformableState, long j2, long j3, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2363panByDUneCvk(transformableState, j2, j3, eVar);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ Object m2365panByd4ec7I(TransformableState transformableState, long j2, e eVar) {
        Object objM2363panByDUneCvk = m2363panByDUneCvk(transformableState, j2, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2363panByDUneCvk == a.f48038a ? objM2363panByDUneCvk : ab.f48028a;
    }

    public static final TransformableState rememberTransformableState(final q<? super Float, ? super Offset, ? super Float, ab> qVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i2, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:189)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(qVar)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new r() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$$ExternalSyntheticLambda2
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return TransformableStateKt.rememberTransformableState$lambda$0$0(qVar, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableStateRememberTransformableState = rememberTransformableState((r<? super Offset, ? super Float, ? super Offset, ? super Float, ab>) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableStateRememberTransformableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberTransformableState$lambda$0$0(q qVar, Offset offset, float f2, Offset offset2, float f3) {
        qVar.invoke(Float.valueOf(f2), offset2, Float.valueOf(f3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberTransformableState$lambda$1$0(State state, Offset offset, float f2, Offset offset2, float f3) {
        ((r) state.getValue()).invoke(offset, Float.valueOf(f2), offset2, Float.valueOf(f3));
        return ab.f48028a;
    }

    public static final /* synthetic */ Object rotateBy(TransformableState transformableState, float f2, e eVar) {
        Object objM2366rotateByRg1IO4c = m2366rotateByRg1IO4c(transformableState, f2, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2366rotateByRg1IO4c == a.f48038a ? objM2366rotateByRg1IO4c : ab.f48028a;
    }

    /* renamed from: rotateBy-Rg1IO4c, reason: not valid java name */
    public static final Object m2366rotateByRg1IO4c(TransformableState transformableState, float f2, long j2, e<? super ab> eVar) {
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new C02613(j2, f2, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: rotateBy-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ Object m2367rotateByRg1IO4c$default(TransformableState transformableState, float f2, long j2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2366rotateByRg1IO4c(transformableState, f2, j2, eVar);
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, e<? super ab> eVar) {
        Object objTransform = transformableState.transform(mutatePriority, new AnonymousClass2(null), eVar);
        return objTransform == a.f48038a ? objTransform : ab.f48028a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, eVar);
    }

    public static final /* synthetic */ Object zoomBy(TransformableState transformableState, float f2, e eVar) {
        Object objM2368zoomByRg1IO4c = m2368zoomByRg1IO4c(transformableState, f2, Offset.Companion.m7995getUnspecifiedF1C5BW0(), eVar);
        return objM2368zoomByRg1IO4c == a.f48038a ? objM2368zoomByRg1IO4c : ab.f48028a;
    }

    /* renamed from: zoomBy-Rg1IO4c, reason: not valid java name */
    public static final Object m2368zoomByRg1IO4c(TransformableState transformableState, float f2, long j2, e<? super ab> eVar) {
        Object objTransform$default = TransformableState.CC.transform$default(transformableState, null, new C02623(j2, f2, null), eVar, 1, null);
        return objTransform$default == a.f48038a ? objTransform$default : ab.f48028a;
    }

    /* renamed from: zoomBy-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ Object m2369zoomByRg1IO4c$default(TransformableState transformableState, float f2, long j2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        return m2368zoomByRg1IO4c(transformableState, f2, j2, eVar);
    }

    public static final TransformableState TransformableState(r<? super Offset, ? super Float, ? super Offset, ? super Float, ab> rVar) {
        return new DefaultTransformableState(rVar);
    }

    public static final TransformableState rememberTransformableState(r<? super Offset, ? super Float, ? super Offset, ? super Float, ab> rVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-963411216, i2, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:210)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = TransformableState((r<? super Offset, ? super Float, ? super Offset, ? super Float, ab>) new r() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$$ExternalSyntheticLambda1
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return TransformableStateKt.rememberTransformableState$lambda$1$0(stateRememberUpdatedState, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }
}
