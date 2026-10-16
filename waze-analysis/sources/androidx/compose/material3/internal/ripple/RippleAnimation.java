package androidx.compose.material3.internal.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleAnimation {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final CompletableDeferred<ab> finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$animate$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeIn$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super br>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RippleAnimation rippleAnimation, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = rippleAnimation;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.animatedAlpha, new Float(1.0f), AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null), null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name and collision with other inner class name */
        final class C00862 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00862(RippleAnimation rippleAnimation, e<? super C00862> eVar) {
                super(2, eVar);
                this.this$0 = rippleAnimation;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00862(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00862) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.animatedRadiusPercent, new Float(1.0f), AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
        final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(RippleAnimation rippleAnimation, e<? super AnonymousClass3> eVar) {
                super(2, eVar);
                this.this$0 = rippleAnimation;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass3(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.animatedCenterPercent, new Float(1.0f), AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null), null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                }
                return ab.f48028a;
            }
        }

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = RippleAnimation.this.new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            af afVar = (af) this.L$0;
            aj.z(afVar, null, null, new AnonymousClass1(RippleAnimation.this, null), 3);
            aj.z(afVar, null, null, new C00862(RippleAnimation.this, null), 3);
            return aj.z(afVar, null, null, new AnonymousClass3(RippleAnimation.this, null), 3);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeOut$2, reason: invalid class name and case insensitive filesystem */
    final class C03562 extends g implements p<af, e<? super br>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.internal.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RippleAnimation rippleAnimation, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = rippleAnimation;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.this$0, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.this$0.animatedAlpha, new Float(0.0f), AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null), null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                }
                return ab.f48028a;
            }
        }

        C03562(e<? super C03562> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03562 c03562 = RippleAnimation.this.new C03562(eVar);
            c03562.L$0 = obj;
            return c03562;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super br> eVar) {
            return ((C03562) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return aj.z((af) this.L$0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3);
        }
    }

    private RippleAnimation(Offset offset, float f2, boolean z) {
        this.origin = offset;
        this.radius = f2;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = bo.j();
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(e<? super ab> eVar) {
        Object objD = aj.d(new C03562(null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (fadeOut(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.internal.ripple.RippleAnimation.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.internal.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material3.internal.ripple.RippleAnimation.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material3.internal.ripple.RippleAnimation$animate$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r7)
            goto L56
        L39:
            e.b.c.b(r7)
            goto L49
        L3d:
            e.b.c.b(r7)
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L49
            goto L61
        L49:
            r6.setFinishedFadingIn(r5)
            kotlinx.coroutines.CompletableDeferred<h.ab> r7 = r6.finishSignalDeferred
            r0.label = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L61
        L56:
            r0.label = r3
            java.lang.Object r6 = r6.fadeOut(r0)
            if (r6 == r1) goto L61
        L5e:
            h.ab r6 = h.ab.f48028a
            return r6
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.ripple.RippleAnimation.animate(h.c.e):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m6396draw4WTKRHQ(DrawScope drawScope, long j2) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m6398getRippleStartRadiusuvyYCjk(drawScope.mo8751getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m7969boximpl(drawScope.mo8750getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) / 2.0f;
            this.targetCenter = Offset.m7969boximpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        }
        float fFloatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f2 = this.startRadius;
        x.c(f2);
        float fLerp = MathHelpersKt.lerp(f2.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        x.c(offset);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (offset.m7990unboximpl() >> 32));
        Offset offset2 = this.targetCenter;
        x.c(offset2);
        float fLerp2 = MathHelpersKt.lerp(fIntBitsToFloat2, Float.intBitsToFloat((int) (offset2.m7990unboximpl() >> 32)), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        x.c(offset3);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (offset3.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        Offset offset4 = this.targetCenter;
        x.c(offset4);
        float fLerp3 = MathHelpersKt.lerp(fIntBitsToFloat3, Float.intBitsToFloat((int) (offset4.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), this.animatedCenterPercent.getValue().floatValue());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fLerp2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fLerp3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j2, Color.m8230getAlphaimpl(j2) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        long j3 = (jFloatToRawIntBits << 32) | jFloatToRawIntBits2;
        if (!this.bounded) {
            DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, fLerp, j3, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat4, fIntBitsToFloat5, iM8217getIntersectrtfAjoo);
            DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, fLerp, j3, 0.0f, null, null, 0, 120, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.a(ab.f48028a);
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f2, boolean z, o oVar) {
        this(offset, f2, z);
    }
}
