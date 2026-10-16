package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super br>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, eVar);
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
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, this) == aVar) {
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
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name and collision with other inner class name */
        final class C00432 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00432(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super C00432> eVar) {
                super(2, eVar);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00432(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00432) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDragGesturesWithObserver(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, this) == aVar) {
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
        AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, eVar);
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
            c.b(obj);
            af afVar = (af) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
            TextDragObserver textDragObserver = this.$observer;
            ag agVar = ag.f51345d;
            aj.z(afVar, null, agVar, new AnonymousClass1(pointerInputScope, textDragObserver, null), 1);
            return aj.z(afVar, null, agVar, new C00432(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2, reason: invalid class name and case insensitive filesystem */
    final class C03072 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03072(TextDragObserver textDragObserver, e<? super C03072> eVar) {
            super(2, eVar);
            this.$observer = textDragObserver;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03072 c03072 = new C03072(this.$observer, eVar);
            c03072.L$0 = obj;
            return c03072;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C03072) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        
            if (r13 == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:16:0x005f). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r12.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                e.b.c.b(r13)
                goto L5f
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L20:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r13)
                goto L42
            L28:
                e.b.c.b(r13)
                java.lang.Object r13 = r12.L$0
                r4 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                r7 = r12
                h.c.e r7 = (h.c.e) r7
                r12.L$0 = r4
                r12.label = r3
                r8 = 2
                r9 = 0
                r5 = 0
                r6 = 0
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r13 == r0) goto L95
                r1 = r4
            L42:
                androidx.compose.foundation.text.TextDragObserver r4 = r12.$observer
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                long r5 = r13.m9608getPositionF1C5BW0()
                r4.mo3385onDownk4lQ0M(r5)
                r4 = r1
                r1 = r13
            L4f:
                r13 = r12
                h.c.e r13 = (h.c.e) r13
                r12.L$0 = r4
                r12.L$1 = r1
                r12.label = r2
                r5 = 0
                java.lang.Object r13 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(r4, r5, r13, r3, r5)
                if (r13 == r0) goto L95
            L5f:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                java.util.List r13 = r13.getChanges()
                r5 = r13
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L6d:
                if (r6 >= r5) goto L8d
                java.lang.Object r7 = r13.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                long r8 = r7.m9605getIdJ3iCeTQ()
                long r10 = r1.m9605getIdJ3iCeTQ()
                boolean r8 = androidx.compose.ui.input.pointer.PointerId.m9587equalsimpl0(r8, r10)
                if (r8 == 0) goto L8a
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L8a
                goto L4f
            L8a:
                int r6 = r6 + 1
                goto L6d
            L8d:
                androidx.compose.foundation.text.TextDragObserver r12 = r12.$observer
                r12.onUp()
                h.ab r12 = h.ab.f48028a
                return r12
            L95:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt.C03072.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(pointerInputScope, textDragObserver, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, e<? super ab> eVar) {
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new l() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$0(textDragObserver, (Offset) obj);
            }
        }, new h.g.a.a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$1(textDragObserver);
            }
        }, new h.g.a.a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$2(textDragObserver);
            }
        }, new p() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$3(textDragObserver, (PointerInputChange) obj, (Offset) obj2);
            }
        }, eVar);
        return objDetectDragGestures == a.f48038a ? objDetectDragGestures : ab.f48028a;
    }

    static final ab detectDragGesturesWithObserver$lambda$0(TextDragObserver textDragObserver, Offset offset) {
        textDragObserver.mo3387onStart3MmeM6k(offset.m7990unboximpl(), SelectionAdjustment.Companion.getNone());
        return ab.f48028a;
    }

    static final ab detectDragGesturesWithObserver$lambda$1(TextDragObserver textDragObserver) {
        textDragObserver.onStop();
        return ab.f48028a;
    }

    static final ab detectDragGesturesWithObserver$lambda$2(TextDragObserver textDragObserver) {
        textDragObserver.onCancel();
        return ab.f48028a;
    }

    static final ab detectDragGesturesWithObserver$lambda$3(TextDragObserver textDragObserver, PointerInputChange pointerInputChange, Offset offset) {
        textDragObserver.mo3386onDragk4lQ0M(offset.m7990unboximpl());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C03072(textDragObserver, null), eVar);
        return objAwaitEachGesture == a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }
}
