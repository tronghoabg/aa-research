package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.aq;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final q<PressGestureScope, Offset, e<? super ab>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2, reason: invalid class name */
    final class AnonymousClass2 extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitPrimaryFirstDown(null, false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, reason: invalid class name and case insensitive filesystem */
    final class C02502 extends f implements p<AwaitPointerEventScope, e<? super PointerInputChange>, Object> {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02502(PointerInputChange pointerInputChange, e<? super C02502> eVar) {
            super(2, eVar);
            this.$firstUp = pointerInputChange;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02502 c02502 = new C02502(this.$firstUp, eVar);
            c02502.L$0 = obj;
            return c02502;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super PointerInputChange> eVar) {
            return ((C02502) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:11:0x0046). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                long r3 = r11.J$0
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r12)
                r5 = r1
                goto L46
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1c:
                e.b.c.b(r12)
                java.lang.Object r12 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r11.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r12.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r3 = r3 + r5
                r5 = r12
            L33:
                r8 = r11
                h.c.e r8 = (h.c.e) r8
                r11.L$0 = r5
                r11.J$0 = r3
                r11.label = r2
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 == r0) goto L52
            L46:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                long r6 = r12.getUptimeMillis()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 >= 0) goto L51
                goto L33
            L51:
                return r12
            L52:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C02502.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1, reason: invalid class name and case insensitive filesystem */
    final class C02511 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02511(e<? super C02511> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2, reason: invalid class name and case insensitive filesystem */
    final class C02522 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
        final /* synthetic */ l<Offset, ab> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
            final /* synthetic */ af $$this$coroutineScope;
            final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
            final /* synthetic */ l<Offset, ab> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C00331 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00331(q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, e<? super C00331> eVar) {
                    super(2, eVar);
                    this.$onPress = qVar;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00331(this.$onPress, this.$pressScope, this.$down, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00331) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        e.b.c.b(obj);
                        q<PressGestureScope, Offset, e<? super ab>, Object> qVar = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM7969boximpl = Offset.m7969boximpl(this.$down.m9608getPositionF1C5BW0());
                        this.label = 1;
                        if (qVar.invoke(pressGestureScopeImpl, offsetM7969boximpl, this) == aVar) {
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
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name and collision with other inner class name */
            final class C00342 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00342(PressGestureScopeImpl pressGestureScopeImpl, e<? super C00342> eVar) {
                    super(2, eVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00342(this.$pressScope, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00342) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                    this.$pressScope.cancel();
                    return ab.f48028a;
                }
            }

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass3> eVar) {
                    super(2, eVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new AnonymousClass3(this.$pressScope, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                    this.$pressScope.release();
                    return ab.f48028a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(af afVar, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar, PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$$this$coroutineScope = afVar;
                this.$onPress = qVar;
                this.$onTap = lVar;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
            
                if (r12 != r0) goto L17;
             */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 199
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C02522.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02522(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar, PressGestureScopeImpl pressGestureScopeImpl, e<? super C02522> eVar) {
            super(2, eVar);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = qVar;
            this.$onTap = lVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02522 c02522 = new C02522(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, eVar);
            c02522.L$0 = obj;
            return c02522;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02522) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                af afVar = (af) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$this_detectTapAndPress, new AnonymousClass1(afVar, this.$onPress, this.$onTap, this.$pressScope, null), this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2, reason: invalid class name and case insensitive filesystem */
    final class C02532 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ l<Offset, ab> $onDoubleTap;
        final /* synthetic */ l<Offset, ab> $onLongPress;
        final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
        final /* synthetic */ l<Offset, ab> $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
            final /* synthetic */ af $$this$coroutineScope;
            final /* synthetic */ l<Offset, ab> $onDoubleTap;
            final /* synthetic */ l<Offset, ab> $onLongPress;
            final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
            final /* synthetic */ l<Offset, ab> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(af afVar, PressGestureScopeImpl pressGestureScopeImpl, l<? super Offset, ab> lVar, l<? super Offset, ab> lVar2, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar3, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$$this$coroutineScope = afVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$onDoubleTap = lVar;
                this.$onLongPress = lVar2;
                this.$onPress = qVar;
                this.$onTap = lVar3;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    this.label = 1;
                    if (TapGestureDetectorKt.processTapGesture((AwaitPointerEventScope) this.L$0, this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02532(PointerInputScope pointerInputScope, l<? super Offset, ab> lVar, l<? super Offset, ab> lVar2, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar3, e<? super C02532> eVar) {
            super(2, eVar);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onDoubleTap = lVar;
            this.$onLongPress = lVar2;
            this.$onPress = qVar;
            this.$onTap = lVar3;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02532 c02532 = new C02532(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, eVar);
            c02532.L$0 = obj;
            return c02532;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02532) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                af afVar = (af) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$this_detectTapGestures, new AnonymousClass1(afVar, pressGestureScopeImpl, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null), this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1, reason: invalid class name and case insensitive filesystem */
    final class C02541 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<af, e<? super ab>, Object> $block;
        final /* synthetic */ br $resetJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02541(br brVar, p<? super af, ? super e<? super ab>, ? extends Object> pVar, e<? super C02541> eVar) {
            super(2, eVar);
            this.$resetJob = brVar;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02541 c02541 = new C02541(this.$resetJob, this.$block, eVar);
            c02541.L$0 = obj;
            return c02541;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02541) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r6)
                goto L45
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L18:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                e.b.c.b(r6)
                goto L37
            L20:
                e.b.c.b(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                kotlinx.coroutines.br r6 = r5.$resetJob
                r4 = r5
                h.c.e r4 = (h.c.e) r4
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.m(r4)
                if (r6 == r0) goto L48
            L37:
                h.g.a.p<kotlinx.coroutines.af, h.c.e<? super h.ab>, java.lang.Object> r6 = r5.$block
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r5 = r6.invoke(r1, r5)
                if (r5 != r0) goto L45
                goto L48
            L45:
                h.ab r5 = h.ab.f48028a
                return r5
            L48:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C02541.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$1, reason: invalid class name and case insensitive filesystem */
    final class C02551 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C02551(e<? super C02551> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.processTapGesture(null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$2, reason: invalid class name and case insensitive filesystem */
    final class C02562 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PointerInputChange $down;
        final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02562(q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, e<? super C02562> eVar) {
            super(2, eVar);
            this.$onPress = qVar;
            this.$pressScope = pressGestureScopeImpl;
            this.$down = pointerInputChange;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C02562(this.$onPress, this.$pressScope, this.$down, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02562) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                q<PressGestureScope, Offset, e<? super ab>, Object> qVar = this.$onPress;
                PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                Offset offsetM7969boximpl = Offset.m7969boximpl(this.$down.m9608getPositionF1C5BW0());
                this.label = 1;
                if (qVar.invoke(pressGestureScopeImpl, offsetM7969boximpl, this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$pressScope.release();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass4(this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$pressScope.cancel();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$5, reason: invalid class name */
    final class AnonymousClass5 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass5> eVar) {
            super(2, eVar);
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass5(this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass5) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$pressScope.release();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6, reason: invalid class name */
    final class AnonymousClass6 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ br $cancelOrReleaseJob;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(br brVar, PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass6> eVar) {
            super(2, eVar);
            this.$cancelOrReleaseJob = brVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass6(this.$cancelOrReleaseJob, this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass6) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r4.$pressScope.reset(r4) != r0) goto L15;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r5)
                goto L3a
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L18:
                e.b.c.b(r5)
                goto L2d
            L1c:
                e.b.c.b(r5)
                kotlinx.coroutines.br r5 = r4.$cancelOrReleaseJob
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r3
                java.lang.Object r5 = r5.m(r1)
                if (r5 != r0) goto L2d
                goto L3d
            L2d:
                androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r4.$pressScope
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r2
                java.lang.Object r4 = r5.reset(r1)
                if (r4 == r0) goto L3d
            L3a:
                h.ab r4 = h.ab.f48028a
                return r4
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass6.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$7, reason: invalid class name */
    final class AnonymousClass7 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q<PressGestureScope, Offset, e<? super ab>, Object> $onPress;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputChange $secondDown;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass7(q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, e<? super AnonymousClass7> eVar) {
            super(2, eVar);
            this.$onPress = qVar;
            this.$pressScope = pressGestureScopeImpl;
            this.$secondDown = pointerInputChange;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass7(this.$onPress, this.$pressScope, this.$secondDown, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass7) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                q<PressGestureScope, Offset, e<? super ab>, Object> qVar = this.$onPress;
                PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                Offset offsetM7969boximpl = Offset.m7969boximpl(this.$secondDown.m9608getPositionF1C5BW0());
                this.label = 1;
                if (qVar.invoke(pressGestureScopeImpl, offsetM7969boximpl, this) == aVar) {
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
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$8, reason: invalid class name */
    final class AnonymousClass8 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass8> eVar) {
            super(2, eVar);
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass8(this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass8) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$pressScope.release();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$9, reason: invalid class name */
    final class AnonymousClass9 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(PressGestureScopeImpl pressGestureScopeImpl, e<? super AnonymousClass9> eVar) {
            super(2, eVar);
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass9(this.$pressScope, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass9) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            this.$pressScope.cancel();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1, reason: invalid class name and case insensitive filesystem */
    final class C02571 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02571(e<? super C02571> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForLongPress(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2, reason: invalid class name and case insensitive filesystem */
    final class C02582 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ PointerEventPass $pass;
        final /* synthetic */ aq<LongPressResult> $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02582(PointerEventPass pointerEventPass, aq<LongPressResult> aqVar, e<? super C02582> eVar) {
            super(2, eVar);
            this.$pass = pointerEventPass;
            this.$result = aqVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02582 c02582 = new C02582(this.$pass, this.$result, eVar);
            c02582.L$0 = obj;
            return c02582;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C02582) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            r13.$result.f48105a = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            r14 = r14.getChanges();
            r5 = r14.size();
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            if (r6 >= r5) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        
            r7 = r14.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (r7.isConsumed() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        
            if (androidx.compose.ui.input.pointer.PointerEventKt.m9544isOutOfBoundsjwHxaWs(r7, r1.mo9479getSizeYbymL2g(), r1.mo9478getExtendedTouchPaddingNHjbRc()) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        
            r13.$result.f48105a = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
        
            r13.L$0 = r1;
            r13.label = 2;
            r14 = r1.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
        
            if (r14 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        
            r13.$result.f48105a = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
        
            return h.ab.f48028a;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ab -> B:33:0x00ad). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C02582.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2, reason: invalid class name and case insensitive filesystem */
    final class C02592 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02592(e<? super C02592> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.ui.input.pointer.PointerEventPass r9, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            e.b.c.b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L4f
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            e.b.c.b(r10)
        L40:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 != 0) goto L5b
            goto L40
        L5b:
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, 1 == ((z ? 1 : 0) | (i2 & 1)), pointerEventPass, eVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            e.b.c.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4f
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            e.b.c.b(r8)
        L40:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 != 0) goto L58
            goto L40
        L58:
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, 1 == ((z ? 1 : 0) | (i2 & 1)), pointerEventPass, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, e<? super PointerInputChange> eVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C02502(pointerInputChange, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[LOOP:0: B:19:0x0051->B:20:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, h.c.e<? super h.ab> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C02511
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C02511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            e.b.c.b(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            e.b.c.b(r9)
        L36:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L51:
            if (r6 >= r4) goto L5f
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L51
        L5f:
            java.util.List r9 = r9.getChanges()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6a:
            if (r5 >= r2) goto L7c
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L79
            goto L36
        L79:
            int r5 = r5 + 1
            goto L6a
        L7c:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, h.c.e):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar, e<? super ab> eVar) {
        Object objD = aj.d(new C02522(pointerInputScope, qVar, lVar, new PressGestureScopeImpl(pointerInputScope), null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, q qVar, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qVar = NoPressGesture;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        return detectTapAndPress(pointerInputScope, qVar, lVar, eVar);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, l<? super Offset, ab> lVar, l<? super Offset, ab> lVar2, q<? super PressGestureScope, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, l<? super Offset, ab> lVar3, e<? super ab> eVar) {
        Object objD = aj.d(new C02532(pointerInputScope, lVar, lVar2, qVar, lVar3, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, l lVar, l lVar2, q qVar, l lVar3, e eVar, int i2, Object obj) {
        l lVar4;
        PointerInputScope pointerInputScope2;
        e eVar2;
        if ((i2 & 4) != 0) {
            qVar = NoPressGesture;
        }
        q qVar2 = qVar;
        int i3 = i2 & 1;
        l lVar5 = (i2 & 2) != 0 ? null : lVar2;
        l lVar6 = 1 == i3 ? null : lVar;
        if ((i2 & 8) != 0) {
            lVar4 = null;
            eVar2 = eVar;
            pointerInputScope2 = pointerInputScope;
        } else {
            lVar4 = lVar3;
            pointerInputScope2 = pointerInputScope;
            eVar2 = eVar;
        }
        return detectTapGestures(pointerInputScope2, lVar6, lVar5, qVar2, lVar4, eVar2);
    }

    public static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (!PointerType.m9682equalsimpl0(changes.get(i2).m9611getTypeT8wyACA(), PointerType.Companion.m9687getMouseT8wyACA())) {
                        break;
                    }
                    i2++;
                } else if (!PointerEvent_androidKt.m9578isPrimaryPressedaHzCxE(pointerEvent.m9539getButtonsry648PA())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PointerInputChange pointerInputChange = changes2.get(i3);
            if (!(z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z, boolean z2, int i2, Object obj) {
        return isChangedToDown(pointerEvent, z, z2 & ((i2 & 2) == 0));
    }

    private static final br launchAwaitingReset(af afVar, br brVar, ag agVar, p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        return aj.z(afVar, null, agVar, new C02541(brVar, pVar, null), 1);
    }

    static /* synthetic */ br launchAwaitingReset$default(af afVar, br brVar, ag agVar, p pVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            agVar = ag.f51345d;
        }
        return launchAwaitingReset(afVar, brVar, agVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object processTapGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, kotlinx.coroutines.af r19, androidx.compose.foundation.gestures.PressGestureScopeImpl r20, h.g.a.l<? super androidx.compose.ui.geometry.Offset, h.ab> r21, h.g.a.l<? super androidx.compose.ui.geometry.Offset, h.ab> r22, h.g.a.q<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r23, h.g.a.l<? super androidx.compose.ui.geometry.Offset, h.ab> r24, h.c.e<? super h.ab> r25) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlinx.coroutines.af, androidx.compose.foundation.gestures.PressGestureScopeImpl, h.g.a.l, h.g.a.l, h.g.a.q, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, h.c.e<? super androidx.compose.foundation.gestures.LongPressResult> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.C02571
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.C02571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            h.g.b.aq r7 = (h.g.b.aq) r7
            e.b.c.b(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            goto L5a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            e.b.c.b(r9)
            h.g.b.aq r9 = new h.g.b.aq
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
            r9.f48105a = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.getLongPressTimeoutMillis()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.L$0 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.withTimeout(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 == r1) goto L5d
            r7 = r9
        L5a:
            java.lang.Object r7 = r7.f48105a
            return r7
        L5d:
            return r1
        L5e:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.ui.input.pointer.PointerEventPass r18, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, eVar);
    }

    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z, e eVar) {
        return awaitFirstDown(awaitPointerEventScope, z, PointerEventPass.Main, eVar);
    }
}
