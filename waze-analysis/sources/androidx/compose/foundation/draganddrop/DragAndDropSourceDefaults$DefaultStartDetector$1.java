package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends g implements p<DragAndDropStartDetectorScope, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ DragAndDropStartDetectorScope $this;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00261 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
            final /* synthetic */ af $$this$coroutineScope;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ DragAndDropStartDetectorScope $this;
            private /* synthetic */ Object L$0;
            int label;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7, reason: invalid class name */
            final class AnonymousClass7 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
                int label;

                AnonymousClass7(e<? super AnonymousClass7> eVar) {
                    super(3, eVar);
                }

                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
                    return m2115invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m2115invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
                    return new AnonymousClass7(eVar).invokeSuspend(ab.f48028a);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00261(af afVar, PressGestureScopeImpl pressGestureScopeImpl, DragAndDropStartDetectorScope dragAndDropStartDetectorScope, e<? super C00261> eVar) {
                super(2, eVar);
                this.$$this$coroutineScope = afVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$this = dragAndDropStartDetectorScope;
            }

            static final boolean invokeSuspend$lambda$0() {
                return true;
            }

            static final ab invokeSuspend$lambda$1(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                dragAndDropStartDetectorScope.mo2119requestDragAndDropTransferk4lQ0M(pointerInputChange.m9608getPositionF1C5BW0());
                return ab.f48028a;
            }

            static final ab invokeSuspend$lambda$5(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, Offset offset) {
                dragAndDropStartDetectorScope.mo2119requestDragAndDropTransferk4lQ0M(offset.m7990unboximpl());
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00261 c00261 = new C00261(this.$$this$coroutineScope, this.$pressScope, this.$this, eVar);
                c00261.L$0 = obj;
                return c00261;
            }

            @Override // h.g.a.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                return ((C00261) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
            
                if (androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r4, r5, r6, null, new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda1(r14), new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda2(), new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda3(), new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda4(), r13) == r0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
            
                if (androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(r4, r5, r6, null, new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda5(r14), new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.AnonymousClass1.C00261.AnonymousClass7(null), null, r13) == r0) goto L24;
             */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    h.c.a.a r0 = h.c.a.a.f48038a
                    int r1 = r13.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L1d
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    goto L18
                L10:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L18:
                    e.b.c.b(r14)
                    goto L9f
                L1d:
                    java.lang.Object r1 = r13.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    e.b.c.b(r14)
                    goto L3d
                L25:
                    e.b.c.b(r14)
                    java.lang.Object r14 = r13.L$0
                    r1 = r14
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r5 = r13
                    h.c.e r5 = (h.c.e) r5
                    r13.L$0 = r1
                    r13.label = r4
                    r4 = 0
                    java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r4, r14, r5)
                    if (r14 == r0) goto La2
                L3d:
                    r4 = r1
                    r5 = r14
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                    int r14 = r5.m9611getTypeT8wyACA()
                    androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.Companion
                    int r1 = r1.m9687getMouseT8wyACA()
                    boolean r14 = androidx.compose.ui.input.pointer.PointerType.m9682equalsimpl0(r14, r1)
                    r1 = 0
                    if (r14 == 0) goto L7c
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda0 r6 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda0
                    r6.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope r14 = r13.$this
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda1 r8 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda1
                    r8.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda2 r9 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda2
                    r9.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda3 r10 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda3
                    r10.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda4 r11 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda4
                    r11.<init>()
                    r12 = r13
                    h.c.e r12 = (h.c.e) r12
                    r13.L$0 = r1
                    r13.label = r3
                    r7 = 0
                    java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    if (r13 != r0) goto L9f
                    goto La2
                L7c:
                    kotlinx.coroutines.af r5 = r13.$$this$coroutineScope
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r6 = r13.$pressScope
                    androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope r14 = r13.$this
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda5 r8 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$$ExternalSyntheticLambda5
                    r8.<init>()
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7 r14 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7
                    r14.<init>(r1)
                    r9 = r14
                    h.g.a.q r9 = (h.g.a.q) r9
                    r11 = r13
                    h.c.e r11 = (h.c.e) r11
                    r13.L$0 = r1
                    r13.label = r2
                    r7 = 0
                    r10 = 0
                    java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L9f
                    goto La2
                L9f:
                    h.ab r13 = h.ab.f48028a
                    return r13
                La2:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.AnonymousClass1.C00261.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$this = dragAndDropStartDetectorScope;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this, this.$pressScope, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                c.b(obj);
                af afVar = (af) this.L$0;
                DragAndDropStartDetectorScope dragAndDropStartDetectorScope = this.$this;
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(dragAndDropStartDetectorScope, new C00261(afVar, this.$pressScope, dragAndDropStartDetectorScope, null), this) == aVar) {
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

    DragAndDropSourceDefaults$DefaultStartDetector$1(e<? super DragAndDropSourceDefaults$DefaultStartDetector$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(eVar);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // h.g.a.p
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, e<? super ab> eVar) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            this.label = 1;
            if (aj.d(new AnonymousClass1(dragAndDropStartDetectorScope, new PressGestureScopeImpl(dragAndDropStartDetectorScope), null), this) == aVar) {
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
