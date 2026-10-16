package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableNode;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Density density;
    private FlingBehavior flingBehavior;
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;
    private Boolean reverseDirection;
    private Boolean startDragImmediately;
    private AnchoredDraggableState<T> state;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> {
        final /* synthetic */ p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, AnchoredDraggableNode<T> anchoredDraggableNode, e<? super AnonymousClass2> eVar) {
            super(3, eVar);
            this.$forEachDelta = pVar;
            this.this$0 = anchoredDraggableNode;
        }

        static final ab invokeSuspend$lambda$0(final AnchoredDraggableNode anchoredDraggableNode, final AnchoredDragScope anchoredDragScope, DragEvent.DragDelta dragDelta) {
            float fM2142toFloatk4lQ0M = anchoredDraggableNode.m2142toFloatk4lQ0M(anchoredDraggableNode.m2140reverseIfNeededMKHz9U(dragDelta.m2180getDeltaF1C5BW0()));
            if (anchoredDraggableNode.overscrollEffect == null) {
                AnchoredDragScope.CC.dragTo$default(anchoredDragScope, anchoredDraggableNode.state.newOffsetForDelta$foundation(fM2142toFloatk4lQ0M), 0.0f, 2, null);
            } else {
                OverscrollEffect overscrollEffect = anchoredDraggableNode.overscrollEffect;
                if (overscrollEffect == null) {
                    x.g();
                }
                overscrollEffect.mo1950applyToScrollRhakbz0(anchoredDraggableNode.m2143toOffsettuRUvjQ(fM2142toFloatk4lQ0M), NestedScrollSource.Companion.m9476getUserInputWNlRxjI(), new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AnchoredDraggableNode.AnonymousClass2.invokeSuspend$lambda$0$0(anchoredDraggableNode, anchoredDragScope, (Offset) obj);
                    }
                });
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Offset invokeSuspend$lambda$0$0(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope, Offset offset) {
            float fNewOffsetForDelta$foundation = anchoredDraggableNode.state.newOffsetForDelta$foundation(anchoredDraggableNode.m2142toFloatk4lQ0M(offset.m7990unboximpl()));
            long jM2143toOffsettuRUvjQ = anchoredDraggableNode.m2143toOffsettuRUvjQ(fNewOffsetForDelta$foundation - anchoredDraggableNode.state.requireOffset());
            AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fNewOffsetForDelta$foundation, 0.0f, 2, null);
            return Offset.m7969boximpl(jM2143toOffsettuRUvjQ);
        }

        @Override // h.g.a.q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, eVar);
            anonymousClass2.L$0 = anchoredDragScope;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> pVar = this.$forEachDelta;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                l<? super DragEvent.DragDelta, ab> lVar = new l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return AnchoredDraggableNode.AnonymousClass2.invokeSuspend$lambda$0(anchoredDraggableNode, anchoredDragScope, (DragEvent.DragDelta) obj2);
                    }
                };
                this.label = 1;
                if (pVar.invoke(lVar, this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fling(0.0f, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2, reason: invalid class name and case insensitive filesystem */
    final class C02302 extends g implements q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> {
        final /* synthetic */ an $leftoverVelocity;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02302(AnchoredDraggableNode<T> anchoredDraggableNode, an anVar, float f2, e<? super C02302> eVar) {
            super(3, eVar);
            this.this$0 = anchoredDraggableNode;
            this.$leftoverVelocity = anVar;
            this.$velocity = f2;
        }

        @Override // h.g.a.q
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, e<? super ab> eVar) {
            C02302 c02302 = new C02302(this.this$0, this.$leftoverVelocity, this.$velocity, eVar);
            c02302.L$0 = anchoredDragScope;
            return c02302.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            an anVar;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                    @Override // androidx.compose.foundation.gestures.ScrollScope
                    public float scrollBy(float f2) {
                        float fNewOffsetForDelta$foundation = ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation(f2);
                        float offset = fNewOffsetForDelta$foundation - ((AnchoredDraggableNode) anchoredDraggableNode).state.getOffset();
                        AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fNewOffsetForDelta$foundation, 0.0f, 2, null);
                        return offset;
                    }
                };
                an anVar2 = this.$leftoverVelocity;
                float f2 = this.$velocity;
                this.L$0 = anVar2;
                this.label = 1;
                Object objPerformFling = anchoredDraggableNode.getResolvedFlingBehavior().performFling(scrollScope, f2, this);
                if (objPerformFling == aVar) {
                    return aVar;
                }
                obj = objPerformFling;
                anVar = anVar2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anVar = (an) this.L$0;
                c.b(obj);
            }
            anVar.f48102a = ((Number) obj).floatValue();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1, reason: invalid class name and case insensitive filesystem */
    final class C02311 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ DragEvent.DragStopped $event;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name and collision with other inner class name */
        final class C00301 extends g implements p<Velocity, e<? super Velocity>, Object> {
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ AnchoredDraggableNode<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00301(AnchoredDraggableNode<T> anchoredDraggableNode, e<? super C00301> eVar) {
                super(2, eVar);
                this.this$0 = anchoredDraggableNode;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00301 c00301 = new C00301(this.this$0, eVar);
                c00301.J$0 = ((Velocity) obj).m11415unboximpl();
                return c00301;
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, e<? super Velocity> eVar) {
                return m2147invokesFctU(velocity.m11415unboximpl(), eVar);
            }

            /* renamed from: invoke-sF-c-tU, reason: not valid java name */
            public final Object m2147invokesFctU(long j2, e<? super Velocity> eVar) {
                return ((C00301) create(Velocity.m11397boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                long jM2144toVelocityadjELrA;
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    long j2 = this.J$0;
                    AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                    this.J$0 = j2;
                    this.label = 1;
                    obj = anchoredDraggableNode.fling(anchoredDraggableNode.m2141toFloatTH1AsA0(j2), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jM2144toVelocityadjELrA = j2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jM2144toVelocityadjELrA = this.J$0;
                    c.b(obj);
                }
                float fFloatValue = ((Number) obj).floatValue();
                float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
                float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
                if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                    jM2144toVelocityadjELrA = this.this$0.m2144toVelocityadjELrA(fFloatValue);
                }
                return Velocity.m11397boximpl(jM2144toVelocityadjELrA);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02311(AnchoredDraggableNode<T> anchoredDraggableNode, DragEvent.DragStopped dragStopped, e<? super C02311> eVar) {
            super(2, eVar);
            this.this$0 = anchoredDraggableNode;
            this.$event = dragStopped;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02311(this.this$0, this.$event, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02311) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r4.fling(r8, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r1.mo1949applyToFlingBMRW4eQ(r7.this$0.m2144toVelocityadjELrA(r8), new androidx.compose.foundation.gestures.AnchoredDraggableNode.C02311.C00301(r7.this$0, null), r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        
            return r0;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L15:
                e.b.c.b(r8)
                goto L67
            L19:
                e.b.c.b(r8)
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
                androidx.compose.foundation.gestures.DragEvent$DragStopped r1 = r7.$event
                long r4 = r1.m2182getVelocity9UxMQ8M()
                long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m2133access$reverseIfNeededAH228Gc(r8, r4)
                float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m2135access$toFloatTH1AsA0(r8, r4)
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
                androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r4 = r7.this$0
                if (r1 != 0) goto L42
                r1 = r7
                h.c.e r1 = (h.c.e) r1
                r7.label = r3
                java.lang.Object r7 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$fling(r4, r8, r1)
                if (r7 != r0) goto L67
                goto L66
            L42:
                androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r4)
                if (r1 != 0) goto L4b
                h.g.b.x.g()
            L4b:
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
                long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m2138access$toVelocityadjELrA(r3, r8)
                androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
                androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r5 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
                r6 = 0
                r5.<init>(r8, r6)
                h.g.a.p r5 = (h.g.a.p) r5
                r8 = r7
                h.c.e r8 = (h.c.e) r8
                r7.label = r2
                java.lang.Object r7 = r1.mo1949applyToFlingBMRW4eQ(r3, r5, r8)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                h.ab r7 = h.ab.f48028a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.C02311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AnchoredDraggableNode(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.AlwaysDrag, z, mutableInteractionSource, orientation);
        this.state = anchoredDraggableState;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = bool2;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(float r8, h.c.e<? super java.lang.Float> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r0.<init>(r7, r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.L$0
            h.g.b.an r7 = (h.g.b.an) r7
            e.b.c.b(r9)
            goto L71
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            e.b.c.b(r9)
            return r9
        L3b:
            e.b.c.b(r9)
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            boolean r9 = r9.getUsePreModifierChangeBehavior$foundation()
            if (r9 == 0) goto L52
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r7 = r7.state
            r4.label = r3
            java.lang.Object r7 = r7.settle(r8, r4)
            if (r7 != r0) goto L51
            goto L79
        L51:
            return r7
        L52:
            h.g.b.an r9 = new h.g.b.an
            r9.<init>()
            r9.f48102a = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r1 = r7.state
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 r3 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            h.g.a.q r3 = (h.g.a.q) r3
            r4.L$0 = r9
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            java.lang.Object r7 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r7 == r0) goto L79
            r7 = r9
        L71:
            float r7 = r7.f48102a
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.fling(float, h.c.e):java.lang.Object");
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        return bool == null ? DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && getOrientation() == Orientation.Horizontal : bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m2139reverseIfNeededAH228Gc(long j2) {
        return Velocity.m11412timesadjELrA(j2, true != isReverseDirection() ? 1.0f : -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m2140reverseIfNeededMKHz9U(long j2) {
        return Offset.m7987timestuRUvjQ(j2, true != isReverseDirection() ? 1.0f : -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m2141toFloatTH1AsA0(long j2) {
        return getOrientation() == Orientation.Vertical ? Velocity.m11407getYimpl(j2) : Velocity.m11406getXimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m2142toFloatk4lQ0M(long j2) {
        return Float.intBitsToFloat(getOrientation() == Orientation.Vertical ? (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) : (int) (j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m2143toOffsettuRUvjQ(float f2) {
        float f3 = getOrientation() == Orientation.Horizontal ? f2 : 0.0f;
        Orientation orientation = getOrientation();
        Orientation orientation2 = Orientation.Vertical;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
        if (orientation != orientation2) {
            f2 = 0.0f;
        }
        return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m2144toVelocityadjELrA(float f2) {
        Orientation orientation = getOrientation();
        Orientation orientation2 = Orientation.Horizontal;
        Orientation orientation3 = getOrientation();
        Orientation orientation4 = Orientation.Vertical;
        float f3 = orientation == orientation2 ? f2 : 0.0f;
        if (orientation3 != orientation4) {
            f2 = 0.0f;
        }
        return VelocityKt.Velocity(f3, f2);
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        Density density = this.density;
        if (density == null || !x.n(density, densityRequireDensity)) {
            this.density = densityRequireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnimationSpec<Float> snapAnimationSpec = AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
            l<Float, Float> positionalThreshold = AnchoredDraggableDefaults.INSTANCE.getPositionalThreshold();
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = densityRequireDensity;
            flingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, densityRequireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new AnonymousClass2(pVar, this, null), eVar, 1, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        x.j("resolvedFlingBehavior");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (isAttached()) {
            aj.z(getCoroutineScope(), null, null, new C02311(this, dragStopped, null), 3);
        }
    }

    public final void setResolvedFlingBehavior(FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void update(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        boolean z2;
        boolean z3;
        this.flingBehavior = flingBehavior;
        if (x.n(this.state, anchoredDraggableState)) {
            z2 = false;
        } else {
            this.state = anchoredDraggableState;
            updateFlingBehavior(flingBehavior);
            z2 = true;
        }
        if (getOrientation() != orientation) {
            setOrientation(orientation);
            z2 = true;
        }
        if (x.n(this.reverseDirection, bool)) {
            z3 = z2;
        } else {
            this.reverseDirection = bool;
            z3 = true;
        }
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, z, mutableInteractionSource, orientation, z3, 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo2145onDragStartedk4lQ0M(long j2) {
    }
}
