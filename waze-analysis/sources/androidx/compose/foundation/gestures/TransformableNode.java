package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private l<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final l<Offset, Boolean> updatedCanPan = new l() { // from class: androidx.compose.foundation.gestures.TransformableNode$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.f$0.canPan.invoke((Offset) obj).booleanValue());
        }
    };
    private final o<TransformEvent> channel = w.c(Integer.MAX_VALUE, null, null, 6);

    public TransformableNode(TransformableState transformableState, l<? super Offset, Boolean> lVar, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00351 extends g implements p<af, e<? super ab>, Object> {
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00361 extends g implements p<TransformScope, e<? super ab>, Object> {
                        final /* synthetic */ aq<TransformEvent> $event;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        int label;
                        final /* synthetic */ TransformableNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00361(aq<TransformEvent> aqVar, TransformableNode transformableNode, e<? super C00361> eVar) {
                            super(2, eVar);
                            this.$event = aqVar;
                            this.this$0 = transformableNode;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            C00361 c00361 = new C00361(this.$event, this.this$0, eVar);
                            c00361.L$0 = obj;
                            return c00361;
                        }

                        @Override // h.g.a.p
                        public final Object invoke(TransformScope transformScope, e<? super ab> eVar) {
                            return ((C00361) create(transformScope, eVar)).invokeSuspend(ab.f48028a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:20:0x0062). Please report as a decompilation issue!!! */
                        @Override // h.c.b.a.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                            /*
                                r10 = this;
                                h.c.a.a r0 = h.c.a.a.f48038a
                                int r1 = r10.label
                                r2 = 1
                                if (r1 == 0) goto L1d
                                if (r1 != r2) goto L15
                                java.lang.Object r1 = r10.L$1
                                h.g.b.aq r1 = (h.g.b.aq) r1
                                java.lang.Object r3 = r10.L$0
                                androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                                e.b.c.b(r11)
                                goto L62
                            L15:
                                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                                r10.<init>(r11)
                                throw r10
                            L1d:
                                e.b.c.b(r11)
                                java.lang.Object r11 = r10.L$0
                                androidx.compose.foundation.gestures.TransformScope r11 = (androidx.compose.foundation.gestures.TransformScope) r11
                                r3 = r11
                            L25:
                                h.g.b.aq<androidx.compose.foundation.gestures.TransformEvent> r11 = r10.$event
                                java.lang.Object r11 = r11.f48105a
                                boolean r1 = r11 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                                if (r1 != 0) goto L65
                                boolean r1 = r11 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                                if (r1 == 0) goto L34
                                androidx.compose.foundation.gestures.TransformEvent$TransformDelta r11 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r11
                                goto L35
                            L34:
                                r11 = 0
                            L35:
                                if (r11 == 0) goto L4a
                                long r4 = r11.m2341getCentroidF1C5BW0()
                                float r6 = r11.getZoomChange()
                                long r7 = r11.m2342getPanChangeF1C5BW0()
                                float r9 = r11.getRotationChange()
                                r3.mo2171transformByWithCentroidIEwrmTk(r4, r6, r7, r9)
                            L4a:
                                h.g.b.aq<androidx.compose.foundation.gestures.TransformEvent> r1 = r10.$event
                                androidx.compose.foundation.gestures.TransformableNode r11 = r10.this$0
                                kotlinx.coroutines.a.o r11 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r11)
                                r4 = r10
                                h.c.e r4 = (h.c.e) r4
                                r10.L$0 = r3
                                r10.L$1 = r1
                                r10.label = r2
                                java.lang.Object r11 = r11.d(r4)
                                if (r11 != r0) goto L62
                                return r0
                            L62:
                                r1.f48105a = r11
                                goto L25
                            L65:
                                h.ab r10 = h.ab.f48028a
                                return r10
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00351.C00361.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00351(TransformableNode transformableNode, e<? super C00351> eVar) {
                        super(2, eVar);
                        this.this$0 = transformableNode;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        C00351 c00351 = new C00351(this.this$0, eVar);
                        c00351.L$0 = obj;
                        return c00351;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(af afVar, e<? super ab> eVar) {
                        return ((C00351) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
                    
                        if (r9.this$0.state.transform(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00351.C00361(r4, r9.this$0, null), r9) != r0) goto L22;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:13:0x0034). Please report as a decompilation issue!!! */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                        /*
                            r9 = this;
                            h.c.a.a r0 = h.c.a.a.f48038a
                            int r1 = r9.label
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L2c
                            if (r1 == r3) goto L1c
                            if (r1 != r2) goto L14
                            java.lang.Object r1 = r9.L$0
                            kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                            e.b.c.b(r10)     // Catch: java.util.concurrent.CancellationException -> L34
                            goto L34
                        L14:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r10)
                            throw r9
                        L1c:
                            java.lang.Object r1 = r9.L$2
                            h.g.b.aq r1 = (h.g.b.aq) r1
                            java.lang.Object r4 = r9.L$1
                            h.g.b.aq r4 = (h.g.b.aq) r4
                            java.lang.Object r5 = r9.L$0
                            kotlinx.coroutines.af r5 = (kotlinx.coroutines.af) r5
                            e.b.c.b(r10)
                            goto L5a
                        L2c:
                            e.b.c.b(r10)
                            java.lang.Object r10 = r9.L$0
                            r1 = r10
                            kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                        L34:
                            boolean r10 = kotlinx.coroutines.aj.j(r1)
                            if (r10 == 0) goto L88
                            h.g.b.aq r10 = new h.g.b.aq
                            r10.<init>()
                            androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                            kotlinx.coroutines.a.o r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                            r5 = r9
                            h.c.e r5 = (h.c.e) r5
                            r9.L$0 = r1
                            r9.L$1 = r10
                            r9.L$2 = r10
                            r9.label = r3
                            java.lang.Object r4 = r4.d(r5)
                            if (r4 == r0) goto L87
                            r5 = r1
                            r1 = r10
                            r10 = r4
                            r4 = r1
                        L5a:
                            r1.f48105a = r10
                            java.lang.Object r10 = r4.f48105a
                            boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                            if (r10 == 0) goto L85
                            androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L85
                            androidx.compose.foundation.gestures.TransformableState r10 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r10)     // Catch: java.util.concurrent.CancellationException -> L85
                            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L85
                            androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r6 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L85
                            androidx.compose.foundation.gestures.TransformableNode r7 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L85
                            r8 = 0
                            r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L85
                            h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.util.concurrent.CancellationException -> L85
                            r4 = r9
                            h.c.e r4 = (h.c.e) r4     // Catch: java.util.concurrent.CancellationException -> L85
                            r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L85
                            r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L85
                            r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L85
                            r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L85
                            java.lang.Object r10 = r10.transform(r1, r6, r4)     // Catch: java.util.concurrent.CancellationException -> L85
                            if (r10 == r0) goto L87
                        L85:
                            r1 = r5
                            goto L34
                        L87:
                            return r0
                        L88:
                            h.ab r9 = h.ab.f48028a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00351.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
                final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                    final /* synthetic */ af $$this$coroutineScope;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(TransformableNode transformableNode, af afVar, e<? super AnonymousClass2> eVar) {
                        super(2, eVar);
                        this.this$0 = transformableNode;
                        this.$$this$coroutineScope = afVar;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, eVar);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                        return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        a aVar = a.f48038a;
                        int i2 = this.label;
                        try {
                            try {
                                if (i2 == 0) {
                                    c.b(obj);
                                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                    this.label = 1;
                                    if (TransformableKt.detectZoom(awaitPointerEventScope, this.this$0.lockRotationOnZoomPan, this.this$0.channel, this.this$0.updatedCanPan, this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    c.b(obj);
                                }
                            } catch (CancellationException e2) {
                                if (!aj.j(this.$$this$coroutineScope)) {
                                    throw e2;
                                }
                            }
                            this.this$0.channel.i(TransformEvent.TransformStopped.INSTANCE);
                            return ab.f48028a;
                        } catch (Throwable th) {
                            this.this$0.channel.i(TransformEvent.TransformStopped.INSTANCE);
                            throw th;
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                    this.this$0 = transformableNode;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_SuspendingPointerInputModifierNode, this.this$0, eVar);
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
                        aj.z(afVar, null, ag.f51345d, new C00351(this.this$0, null), 1);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(this.$this_SuspendingPointerInputModifierNode, new AnonymousClass2(this.this$0, afVar, null), this) == aVar) {
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

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objD;
                return (this.this$0.enabled && (objD = aj.d(new AnonymousClass1(pointerInputScope, this.this$0, null), eVar)) == a.f48038a) ? objD : ab.f48028a;
            }
        });
        delegate(SuspendingPointerInputModifierNode);
        this.pointerInputNode = SuspendingPointerInputModifierNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!PointerType.m9682equalsimpl0(changes.get(i2).m9611getTypeT8wyACA(), PointerType.Companion.m9687getMouseT8wyACA())) {
                    i2++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                            Object objDetectNonTouchGestures = TransformableKt.detectNonTouchGestures(pointerInputScope, this.this$0.channel, scrollConfig, eVar);
                            return objDetectNonTouchGestures == a.f48038a ? objDetectNonTouchGestures : ab.f48028a;
                        }
                    });
                    delegate(SuspendingPointerInputModifierNode);
                    this.pointerInputModifierMouse = SuspendingPointerInputModifierNode;
                }
            }
        }
        this.pointerInputNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public final void update(TransformableState transformableState, l<? super Offset, Boolean> lVar, boolean z, boolean z2) {
        this.canPan = lVar;
        if (x.n(this.state, transformableState) && this.enabled == z2 && this.lockRotationOnZoomPan == z) {
            return;
        }
        this.state = transformableState;
        this.enabled = z2;
        this.lockRotationOnZoomPan = z;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
