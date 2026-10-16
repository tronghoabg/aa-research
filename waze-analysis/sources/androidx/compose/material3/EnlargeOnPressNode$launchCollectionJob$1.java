package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EnlargeOnPressNode$launchCollectionJob$1 extends g implements p<af, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EnlargeOnPressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnlargeOnPressNode$launchCollectionJob$1(EnlargeOnPressNode enlargeOnPressNode, e<? super EnlargeOnPressNode$launchCollectionJob$1> eVar) {
        super(2, eVar);
        this.this$0 = enlargeOnPressNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        EnlargeOnPressNode$launchCollectionJob$1 enlargeOnPressNode$launchCollectionJob$1 = new EnlargeOnPressNode$launchCollectionJob$1(this.this$0, eVar);
        enlargeOnPressNode$launchCollectionJob$1.L$0 = obj;
        return enlargeOnPressNode$launchCollectionJob$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((EnlargeOnPressNode$launchCollectionJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        aj.z((af) this.L$0, null, null, new AnonymousClass1(this.this$0, new ArrayList(), null), 3);
        return ab.f48028a;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<PressInteraction.Press> $pressInteractions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EnlargeOnPressNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EnlargeOnPressNode enlargeOnPressNode, List<PressInteraction.Press> list, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = enlargeOnPressNode;
            this.$pressInteractions = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pressInteractions, eVar);
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
                final k<Interaction> interactions = this.this$0.getInteractionSource().getInteractions();
                final List<PressInteraction.Press> list = this.$pressInteractions;
                this.label = 1;
                if (ai.e(ai.y(new k<Boolean>() { // from class: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements l {
                        final /* synthetic */ List $pressInteractions$inlined;
                        final /* synthetic */ l $this_unsafeFlow;

                        /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends h.c.b.a.c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(e eVar) {
                                super(eVar);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(l lVar, List list) {
                            this.$this_unsafeFlow = lVar;
                            this.$pressInteractions$inlined = list;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.b.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                h.c.a.a r1 = h.c.a.a.f48038a
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                e.b.c.b(r6)
                                goto L78
                            L27:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L2f:
                                e.b.c.b(r6)
                                kotlinx.coroutines.b.l r6 = r4.$this_unsafeFlow
                                r2 = r0
                                h.c.e r2 = (h.c.e) r2
                                androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
                                boolean r2 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                                if (r2 == 0) goto L43
                                java.util.List r2 = r4.$pressInteractions$inlined
                                r2.add(r5)
                                goto L62
                            L43:
                                boolean r2 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                                if (r2 == 0) goto L53
                                java.util.List r2 = r4.$pressInteractions$inlined
                                androidx.compose.foundation.interaction.PressInteraction$Release r5 = (androidx.compose.foundation.interaction.PressInteraction.Release) r5
                                androidx.compose.foundation.interaction.PressInteraction$Press r5 = r5.getPress()
                                r2.remove(r5)
                                goto L62
                            L53:
                                boolean r2 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                                if (r2 == 0) goto L62
                                java.util.List r2 = r4.$pressInteractions$inlined
                                androidx.compose.foundation.interaction.PressInteraction$Cancel r5 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r5
                                androidx.compose.foundation.interaction.PressInteraction$Press r5 = r5.getPress()
                                r2.remove(r5)
                            L62:
                                java.util.List r4 = r4.$pressInteractions$inlined
                                java.util.Collection r4 = (java.util.Collection) r4
                                boolean r4 = r4.isEmpty()
                                r4 = r4 ^ r3
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                r0.label = r3
                                java.lang.Object r4 = r6.emit(r4, r0)
                                if (r4 != r1) goto L78
                                return r1
                            L78:
                                h.ab r4 = h.ab.f48028a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.b.k
                    public Object collect(l<? super Boolean> lVar, e eVar) {
                        Object objCollect = interactions.collect(new AnonymousClass2(lVar, list), eVar);
                        return objCollect == a.f48038a ? objCollect : ab.f48028a;
                    }
                }), new AnonymousClass2(afVar, this.this$0, null), this) == aVar) {
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

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<Boolean, e<? super ab>, Object> {
            final /* synthetic */ af $$this$launch;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EnlargeOnPressNode this$0;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$1, reason: invalid class name and collision with other inner class name */
            final class C00671 extends g implements p<af, e<? super ab>, Object> {
                int label;
                final /* synthetic */ EnlargeOnPressNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00671(EnlargeOnPressNode enlargeOnPressNode, e<? super C00671> eVar) {
                    super(2, eVar);
                    this.this$0 = enlargeOnPressNode;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    return new C00671(this.this$0, eVar);
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00671) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.this$0.pressedAnimatable, new Float(1.0f), this.this$0.getAnimationSpec(), null, null, this, 12, null) == aVar) {
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
            AnonymousClass2(af afVar, EnlargeOnPressNode enlargeOnPressNode, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$$this$launch = afVar;
                this.this$0 = enlargeOnPressNode;
            }

            static final boolean invokeSuspend$lambda$0(EnlargeOnPressNode enlargeOnPressNode) {
                return ((Number) enlargeOnPressNode.pressedAnimatable.getValue()).floatValue() > 0.75f;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$launch, this.this$0, eVar);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public final Object invoke(boolean z, e<? super ab> eVar) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r11.this$0.pressedAnimatable, new java.lang.Float(0.0f), r11.this$0.getAnimationSpec(), null, null, r11, 12, null) != r0) goto L19;
             */
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
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    e.b.c.b(r12)
                    goto L6a
                L10:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L18:
                    e.b.c.b(r12)
                    goto L47
                L1c:
                    e.b.c.b(r12)
                    boolean r12 = r11.Z$0
                    if (r12 == 0) goto L34
                    kotlinx.coroutines.af r12 = r11.$$this$launch
                    androidx.compose.material3.EnlargeOnPressNode r11 = r11.this$0
                    androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$1 r0 = new androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$1
                    r1 = 0
                    r0.<init>(r11, r1)
                    h.g.a.p r0 = (h.g.a.p) r0
                    r11 = 3
                    kotlinx.coroutines.aj.z(r12, r1, r1, r0, r11)
                    goto L6a
                L34:
                    androidx.compose.material3.EnlargeOnPressNode r12 = r11.this$0
                    androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$$ExternalSyntheticLambda0 r1 = new androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$$ExternalSyntheticLambda0
                    r1.<init>()
                    r12 = r11
                    h.c.e r12 = (h.c.e) r12
                    r11.label = r3
                    java.lang.Object r12 = androidx.compose.material3.ButtonGroupKt.access$waitUntil(r1, r12)
                    if (r12 != r0) goto L47
                    goto L69
                L47:
                    androidx.compose.material3.EnlargeOnPressNode r12 = r11.this$0
                    androidx.compose.animation.core.Animatable r3 = androidx.compose.material3.EnlargeOnPressNode.access$getPressedAnimatable$p(r12)
                    java.lang.Float r4 = new java.lang.Float
                    r12 = 0
                    r4.<init>(r12)
                    androidx.compose.material3.EnlargeOnPressNode r12 = r11.this$0
                    androidx.compose.animation.core.AnimationSpec r5 = r12.getAnimationSpec()
                    r8 = r11
                    h.c.e r8 = (h.c.e) r8
                    r11.label = r2
                    r9 = 12
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                    if (r11 != r0) goto L6a
                L69:
                    return r0
                L6a:
                    h.ab r11 = h.ab.f48028a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, e<? super ab> eVar) {
                return invoke(bool.booleanValue(), eVar);
            }
        }
    }
}
