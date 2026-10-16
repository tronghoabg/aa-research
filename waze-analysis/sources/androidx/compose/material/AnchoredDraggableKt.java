package androidx.compose.material;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.AnchoredDragScope;
import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.an;
import h.g.b.aq;
import h.k;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$animateTo$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements r {
        final /* synthetic */ AnchoredDraggableState $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnchoredDraggableState anchoredDraggableState, float f2, e<? super AnonymousClass2> eVar) {
            super(4, eVar);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f2;
        }

        static final ab invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, an anVar, float f2, float f3) {
            anchoredDragScope.dragTo(f2, f3);
            anVar.f48102a = f2;
            return ab.f48028a;
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateTo, this.$velocity, eVar);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = obj;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final an anVar = new an();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    anVar.f48102a = offset;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(offset, fPositionOf, this.$velocity, this.$this_animateTo.getAnimationSpec(), new p() { // from class: androidx.compose.material.AnchoredDraggableKt$animateTo$2$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return AnchoredDraggableKt.AnonymousClass2.invokeSuspend$lambda$0(anchoredDragScope, anVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
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
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    final class C03261<I> extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        C03261(e<? super C03261> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    final class C03272 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p $block;
        final /* synthetic */ h.g.a.a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        final class AnonymousClass1<T> implements l {
            final /* synthetic */ af $$this$coroutineScope;
            final /* synthetic */ p $block;
            final /* synthetic */ aq<br> $previousDrag;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            final class C00572 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ af $$this$coroutineScope;
                final /* synthetic */ p $block;
                final /* synthetic */ Object $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00572(p pVar, Object obj, af afVar, e<? super C00572> eVar) {
                    super(2, eVar);
                    this.$block = pVar;
                    this.$latestInputs = obj;
                    this.$$this$coroutineScope = afVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00572(this.$block, this.$latestInputs, this.$$this$coroutineScope, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00572) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        p pVar = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (pVar.invoke(obj2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    aj.h(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return ab.f48028a;
                }
            }

            AnonymousClass1(aq<br> aqVar, af afVar, p pVar) {
                this.$previousDrag = aqVar;
                this.$$this$coroutineScope = afVar;
                this.$block = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.b.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, h.c.e<? super h.ab> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    h.c.a.a r1 = h.c.a.a.f48038a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.br r6 = (kotlinx.coroutines.br) r6
                    java.lang.Object r6 = r0.L$0
                    e.b.c.b(r7)
                    goto L57
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    e.b.c.b(r7)
                    h.g.b.aq<kotlinx.coroutines.br> r7 = r5.$previousDrag
                    java.lang.Object r7 = r7.f48105a
                    kotlinx.coroutines.br r7 = (kotlinx.coroutines.br) r7
                    if (r7 == 0) goto L57
                    androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                    r2.<init>()
                    java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
                    r7.s(r2)
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r7 = r7.m(r0)
                    if (r7 != r1) goto L57
                    return r1
                L57:
                    h.g.b.aq<kotlinx.coroutines.br> r7 = r5.$previousDrag
                    kotlinx.coroutines.af r0 = r5.$$this$coroutineScope
                    h.g.a.p r5 = r5.$block
                    kotlinx.coroutines.ag r1 = kotlinx.coroutines.ag.f51345d
                    androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2 r2 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2
                    r4 = 0
                    r2.<init>(r5, r6, r0, r4)
                    h.g.a.p r2 = (h.g.a.p) r2
                    kotlinx.coroutines.br r5 = kotlinx.coroutines.aj.z(r0, r4, r1, r2, r3)
                    r7.f48105a = r5
                    h.ab r5 = h.ab.f48028a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.C03272.AnonymousClass1.emit(java.lang.Object, h.c.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03272(h.g.a.a aVar, p pVar, e<? super C03272> eVar) {
            super(2, eVar);
            this.$inputs = aVar;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03272 c03272 = new C03272(this.$inputs, this.$block, eVar);
            c03272.L$0 = obj;
            return c03272;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03272) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                aq aqVar = new aq();
                h.g.a.a aVar2 = this.$inputs;
                p pVar = this.$block;
                this.label = 1;
                if (SnapshotStateKt.snapshotFlow(aVar2).collect(new AnonymousClass1(aqVar, afVar, pVar), this) == aVar) {
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
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    final class C03282 extends g implements r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C03282(e<? super C03282> eVar) {
            super(4, eVar);
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, e<? super ab> eVar) {
            C03282 c03282 = new C03282(eVar);
            c03282.L$0 = anchoredDragScope;
            c03282.L$1 = draggableAnchors;
            c03282.L$2 = obj;
            return c03282.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return ab.f48028a;
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(h.g.a.l<? super DraggableAnchorsConfig<T>, ab> lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material(), orientation, z, mutableInteractionSource, z3, null, new AnonymousClass1(anchoredDraggableState, null), z2, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z3 = anchoredDraggableState.isAnimationRunning();
        }
        boolean z4 = z3;
        int i3 = i2 & 4;
        int i4 = i2 & 16;
        int i5 = i2 & 8;
        boolean z5 = i3 == 0;
        boolean z6 = i5 == 0;
        boolean z7 = !z5;
        if (i4 != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z7 | z, z6 & z2, mutableInteractionSource, z4);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, float f2, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnonymousClass2(anchoredDraggableState, f2, null), eVar, 2, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            f2 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f2, eVar);
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, p<? super IntSize, ? super Constraints, ? extends k<? extends DraggableAnchors<T>, ? extends T>> pVar) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, pVar, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(h.a.r.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(h.g.a.a<? extends I> r4, h.g.a.p<? super I, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r5, h.c.e<? super h.ab> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.AnchoredDraggableKt.C03261
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material.AnchoredDraggableKt.C03261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            androidx.compose.material.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.aj.d(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.restartable(h.g.a.a, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new C03282(null), eVar, 2, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements q<af, Float, e<? super ab>, Object> {
        final /* synthetic */ AnchoredDraggableState $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name and collision with other inner class name */
        final class C00561 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ AnchoredDraggableState $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00561(AnchoredDraggableState anchoredDraggableState, float f2, e<? super C00561> eVar) {
                super(2, eVar);
                this.$state = anchoredDraggableState;
                this.$velocity = f2;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00561(this.$state, this.$velocity, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00561) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (this.$state.settle(this.$velocity, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState anchoredDraggableState, e<? super AnonymousClass1> eVar) {
            super(3, eVar);
            this.$state = anchoredDraggableState;
        }

        public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, eVar);
            anonymousClass1.L$0 = afVar;
            anonymousClass1.F$0 = f2;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            aj.z((af) this.L$0, null, null, new C00561(this.$state, this.F$0, null), 3);
            return ab.f48028a;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
            return invoke(afVar, f2.floatValue(), eVar);
        }
    }
}
