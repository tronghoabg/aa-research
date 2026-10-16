package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.geometry.Offset;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.an;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollExtensionsKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
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
            return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ an $previousValue;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, AnimationSpec<Float> animationSpec, an anVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$value = f2;
            this.$animationSpec = animationSpec;
            this.$previousValue = anVar;
        }

        static final ab invokeSuspend$lambda$0(an anVar, ScrollScope scrollScope, float f2, float f3) {
            float f4 = anVar.f48102a;
            anVar.f48102a = f4 + scrollScope.scrollBy(f2 - f4);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$value, this.$animationSpec, this.$previousValue, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                float f2 = this.$value;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final an anVar = this.$previousValue;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, f2, 0.0f, animationSpec, new p() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return ScrollExtensionsKt.AnonymousClass2.invokeSuspend$lambda$0(anVar, scrollScope, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                }, this, 4, null) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3, reason: invalid class name */
    final class AnonymousClass3 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.m2283animateScrollByubNVwUQ(null, 0L, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<Scroll2DScope, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Offset> $animationSpec;
        final /* synthetic */ ap $previousValue;
        final /* synthetic */ long $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(long j2, AnimationSpec<Offset> animationSpec, ap apVar, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$value = j2;
            this.$animationSpec = animationSpec;
            this.$previousValue = apVar;
        }

        static final ab invokeSuspend$lambda$0(ap apVar, Scroll2DScope scroll2DScope, Offset offset, Offset offset2) {
            apVar.f48104a = Offset.m7985plusMKHz9U(apVar.f48104a, scroll2DScope.mo2169scrollByMKHz9U(Offset.m7984minusMKHz9U(offset.m7990unboximpl(), apVar.f48104a)));
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$value, this.$animationSpec, this.$previousValue, eVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // h.g.a.p
        public final Object invoke(Scroll2DScope scroll2DScope, e<? super ab> eVar) {
            return ((AnonymousClass4) create(scroll2DScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                final Scroll2DScope scroll2DScope = (Scroll2DScope) this.L$0;
                TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
                Offset offsetM7969boximpl = Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0());
                long j2 = this.$value;
                AnimationSpec<Offset> animationSpec = this.$animationSpec;
                final ap apVar = this.$previousValue;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(vectorConverter, offsetM7969boximpl, Offset.m7969boximpl(j2), null, animationSpec, new p() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return ScrollExtensionsKt.AnonymousClass4.invokeSuspend$lambda$0(apVar, scroll2DScope, (Offset) obj2, (Offset) obj3);
                    }
                }, this, 8, null) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1, reason: invalid class name and case insensitive filesystem */
    final class C02421 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02421(e<? super C02421> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.scrollBy(null, 0.0f, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2, reason: invalid class name and case insensitive filesystem */
    final class C02432 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ an $consumed;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02432(an anVar, float f2, e<? super C02432> eVar) {
            super(2, eVar);
            this.$consumed = anVar;
            this.$value = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02432 c02432 = new C02432(this.$consumed, this.$value, eVar);
            c02432.L$0 = obj;
            return c02432;
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((C02432) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.f48102a = scrollScope.scrollBy(this.$value);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3, reason: invalid class name and case insensitive filesystem */
    final class C02443 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02443(e<? super C02443> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.m2285scrollByd4ec7I(null, 0L, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4, reason: invalid class name and case insensitive filesystem */
    final class C02454 extends g implements p<Scroll2DScope, e<? super ab>, Object> {
        final /* synthetic */ ap $consumed;
        final /* synthetic */ long $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02454(ap apVar, long j2, e<? super C02454> eVar) {
            super(2, eVar);
            this.$consumed = apVar;
            this.$value = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02454 c02454 = new C02454(this.$consumed, this.$value, eVar);
            c02454.L$0 = obj;
            return c02454;
        }

        @Override // h.g.a.p
        public final Object invoke(Scroll2DScope scroll2DScope, e<? super ab> eVar) {
            return ((C02454) create(scroll2DScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            Scroll2DScope scroll2DScope = (Scroll2DScope) this.L$0;
            this.$consumed.f48104a = scroll2DScope.mo2169scrollByMKHz9U(this.$value);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2, reason: invalid class name and case insensitive filesystem */
    final class C02462 extends g implements p<ScrollScope, e<? super ab>, Object> {
        int label;

        C02462(e<? super C02462> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02462(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((C02462) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$4, reason: invalid class name and case insensitive filesystem */
    final class C02474 extends g implements p<Scroll2DScope, e<? super ab>, Object> {
        int label;

        C02474(e<? super C02474> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02474(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(Scroll2DScope scroll2DScope, e<? super ab> eVar) {
            return ((C02474) create(scroll2DScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, h.c.e<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r4.L$0
            h.g.b.an r7 = (h.g.b.an) r7
            e.b.c.b(r10)
            goto L54
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            e.b.c.b(r10)
            h.g.b.an r10 = new h.g.b.an
            r10.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r3 = 0
            r1.<init>(r8, r9, r10, r3)
            r3 = r1
            h.g.a.p r3 = (h.g.a.p) r3
            r4.L$0 = r10
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 == r0) goto L5c
            r7 = r10
        L54:
            float r7 = r7.f48102a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f2, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f2, animationSpec, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: animateScrollBy-ubNVwUQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2283animateScrollByubNVwUQ(androidx.compose.foundation.gestures.Scrollable2DState r11, long r12, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> r14, h.c.e<? super androidx.compose.ui.geometry.Offset> r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$3
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r11 = r4.L$0
            h.g.b.ap r11 = (h.g.b.ap) r11
            e.b.c.b(r15)
            goto L5e
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            e.b.c.b(r15)
            h.g.b.ap r9 = new h.g.b.ap
            r9.<init>()
            androidx.compose.ui.geometry.Offset$Companion r15 = androidx.compose.ui.geometry.Offset.Companion
            long r5 = r15.m7996getZeroF1C5BW0()
            r9.f48104a = r5
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4
            r10 = 0
            r6 = r12
            r8 = r14
            r5.<init>(r6, r8, r9, r10)
            r3 = r5
            h.g.a.p r3 = (h.g.a.p) r3
            r4.L$0 = r9
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r11
            java.lang.Object r11 = androidx.compose.foundation.gestures.Scrollable2DState.CC.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r11 == r0) goto L65
            r11 = r9
        L5e:
            long r11 = r11.f48104a
            androidx.compose.ui.geometry.Offset r11 = androidx.compose.ui.geometry.Offset.m7969boximpl(r11)
            return r11
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.m2283animateScrollByubNVwUQ(androidx.compose.foundation.gestures.Scrollable2DState, long, androidx.compose.animation.core.AnimationSpec, h.c.e):java.lang.Object");
    }

    /* renamed from: animateScrollBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2284animateScrollByubNVwUQ$default(Scrollable2DState scrollable2DState, long j2, AnimationSpec animationSpec, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return m2283animateScrollByubNVwUQ(scrollable2DState, j2, animationSpec, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, h.c.e<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C02421
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C02421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r4.L$0
            h.g.b.an r7 = (h.g.b.an) r7
            e.b.c.b(r9)
            goto L54
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            e.b.c.b(r9)
            h.g.b.an r9 = new h.g.b.an
            r9.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r3 = 0
            r1.<init>(r9, r8, r3)
            r3 = r1
            h.g.a.p r3 = (h.g.a.p) r3
            r4.L$0 = r9
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 == r0) goto L5c
            r7 = r9
        L54:
            float r7 = r7.f48102a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: scrollBy-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2285scrollByd4ec7I(androidx.compose.foundation.gestures.Scrollable2DState r7, long r8, h.c.e<? super androidx.compose.ui.geometry.Offset> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C02443
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C02443) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$3
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r4.L$0
            h.g.b.ap r7 = (h.g.b.ap) r7
            e.b.c.b(r10)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            e.b.c.b(r10)
            h.g.b.ap r10 = new h.g.b.ap
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r5 = r1.m7996getZeroF1C5BW0()
            r10.f48104a = r5
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4 r1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4
            r3 = 0
            r1.<init>(r10, r8, r3)
            r3 = r1
            h.g.a.p r3 = (h.g.a.p) r3
            r4.L$0 = r10
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.Scrollable2DState.CC.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 == r0) goto L63
            r7 = r10
        L5c:
            long r7 = r7.f48104a
            androidx.compose.ui.geometry.Offset r7 = androidx.compose.ui.geometry.Offset.m7969boximpl(r7)
            return r7
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.m2285scrollByd4ec7I(androidx.compose.foundation.gestures.Scrollable2DState, long, h.c.e):java.lang.Object");
    }

    public static final Object stopScroll(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, e<? super ab> eVar) {
        Object objScroll = scrollable2DState.scroll(mutatePriority, new C02474(null), eVar);
        return objScroll == a.f48038a ? objScroll : ab.f48028a;
    }

    public static /* synthetic */ Object stopScroll$default(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollable2DState, mutatePriority, (e<? super ab>) eVar);
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, (e<? super ab>) eVar);
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, e<? super ab> eVar) {
        Object objScroll = scrollableState.scroll(mutatePriority, new C02462(null), eVar);
        return objScroll == a.f48038a ? objScroll : ab.f48028a;
    }
}
