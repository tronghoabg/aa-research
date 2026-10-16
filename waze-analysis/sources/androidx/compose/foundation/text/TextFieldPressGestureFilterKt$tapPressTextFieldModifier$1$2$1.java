package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<l<Offset, ab>> $onTapState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    final /* synthetic */ af $scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        final /* synthetic */ af $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00441 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ long $it;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00441(MutableState<PressInteraction.Press> mutableState, long j2, MutableInteractionSource mutableInteractionSource, e<? super C00441> eVar) {
                super(2, eVar);
                this.$pressedInteraction = mutableState;
                this.$it = j2;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00441(this.$pressedInteraction, this.$it, this.$interactionSource, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00441) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
            
                if (r1.emit(r6, r7) != r0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
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
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L1d
                    if (r1 != r3) goto L15
                    java.lang.Object r0 = r7.L$0
                    androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                    e.b.c.b(r8)
                    goto L6a
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1d:
                    java.lang.Object r1 = r7.L$0
                    androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                    e.b.c.b(r8)
                    goto L4a
                L25:
                    e.b.c.b(r8)
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                    java.lang.Object r8 = r8.getValue()
                    androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                    if (r8 == 0) goto L4d
                    androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                    r6.<init>(r8)
                    if (r1 == 0) goto L49
                    androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                    r7.L$0 = r5
                    r7.label = r4
                    java.lang.Object r8 = r1.emit(r6, r7)
                    if (r8 == r0) goto L68
                L49:
                    r1 = r5
                L4a:
                    r1.setValue(r2)
                L4d:
                    long r4 = r7.$it
                    androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                    r8.<init>(r4, r2)
                    androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                    if (r1 == 0) goto L69
                    r2 = r8
                    androidx.compose.foundation.interaction.Interaction r2 = (androidx.compose.foundation.interaction.Interaction) r2
                    r4 = r7
                    h.c.e r4 = (h.c.e) r4
                    r7.L$0 = r8
                    r7.label = r3
                    java.lang.Object r1 = r1.emit(r2, r4)
                    if (r1 != r0) goto L69
                L68:
                    return r0
                L69:
                    r0 = r8
                L6a:
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r7 = r7.$pressedInteraction
                    r7.setValue(r0)
                    h.ab r7 = h.ab.f48028a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00441.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            final /* synthetic */ boolean $success;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.$pressedInteraction = mutableState;
                this.$success = z;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                MutableState<PressInteraction.Press> mutableState;
                a aVar = a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    PressInteraction.Press value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        boolean z = this.$success;
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        MutableState<PressInteraction.Press> mutableState2 = this.$pressedInteraction;
                        PressInteraction.Cancel release = z ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                        if (mutableInteractionSource != null) {
                            this.L$0 = mutableState2;
                            this.label = 1;
                            if (mutableInteractionSource.emit(release, this) == aVar) {
                                return aVar;
                            }
                        }
                        mutableState = mutableState2;
                    }
                    return ab.f48028a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) this.L$0;
                c.b(obj);
                mutableState.setValue(null);
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(af afVar, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, e<? super AnonymousClass1> eVar) {
            super(3, eVar);
            this.$scope = afVar;
            this.$pressedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
            return m3412invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m3412invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, eVar);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j2;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                aj.z(this.$scope, null, null, new C00441(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
                this.label = 1;
                obj = pressGestureScope.tryAwaitRelease(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            aj.z(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(af afVar, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends l<? super Offset, ab>> state) {
        this.$scope = afVar;
        this.$pressedInteraction = mutableState;
        this.$interactionSource = mutableInteractionSource;
        this.$onTapState = state;
    }

    static final ab invoke$lambda$0(State state, Offset offset) {
        ((l) state.getValue()).invoke(offset);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
        final State<l<Offset, ab>> state = this.$onTapState;
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, new l() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.invoke$lambda$0(state, (Offset) obj);
            }
        }, eVar);
        return objDetectTapAndPress == a.f48038a ? objDetectTapAndPress : ab.f48028a;
    }
}
