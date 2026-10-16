package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final Animatable<Offset, AnimationVector2D> animatable;
    private br animationJob;
    private final MagnifierNode magnifierNode;
    private final MutableState magnifierSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m11331boximpl(IntSize.Companion.m11344getZeroYbymL2g()), null, 2, null);
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean visible;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        static final Offset invokeSuspend$lambda$0(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
            return (textFieldMagnifierNodeImpl28.visible || textFieldMagnifierNodeImpl28.textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.Touch) ? Offset.m7969boximpl(TextFieldMagnifierKt.m3742calculateSelectionMagnifierCenterAndroidhUlJWOE(textFieldMagnifierNodeImpl28.textFieldState, textFieldMagnifierNodeImpl28.textFieldSelectionState, textFieldMagnifierNodeImpl28.textLayoutState, textFieldMagnifierNodeImpl28.m3744getMagnifierSizeYbymL2g())) : Offset.m7969boximpl(Offset.Companion.m7995getUnspecifiedF1C5BW0());
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = TextFieldMagnifierNodeImpl28.this.new AnonymousClass1(eVar);
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
                final af afVar = (af) this.L$0;
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = TextFieldMagnifierNodeImpl28.this;
                k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return TextFieldMagnifierNodeImpl28.AnonymousClass1.invokeSuspend$lambda$0(textFieldMagnifierNodeImpl28);
                    }
                });
                final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = TextFieldMagnifierNodeImpl28.this;
                this.label = 1;
                if (kVarSnapshotFlow.collect(new l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28.restartAnimationJob.1.2

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name and collision with other inner class name */
                    final class C00501 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ long $targetValue;
                        int label;
                        final /* synthetic */ TextFieldMagnifierNodeImpl28 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00501(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j2, e<? super C00501> eVar) {
                            super(2, eVar);
                            this.this$0 = textFieldMagnifierNodeImpl28;
                            this.$targetValue = j2;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new C00501(this.this$0, this.$targetValue, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((C00501) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            a aVar = a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.this$0;
                                long j2 = this.$targetValue;
                                this.label = 1;
                                if (Animatable.animateTo$default(textFieldMagnifierNodeImpl28.animatable, Offset.m7969boximpl(j2), SelectionMagnifierKt.getMagnifierSpringSpec(), null, null, this, 12, null) == aVar) {
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

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return m3746emit3MmeM6k(((Offset) obj2).m7990unboximpl(), eVar);
                    }

                    /* renamed from: emit-3MmeM6k, reason: not valid java name */
                    public final Object m3746emit3MmeM6k(long j2, e<? super ab> eVar) {
                        if ((((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m7990unboximpl() & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && (j2 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                            if (Float.intBitsToFloat((int) (((Offset) textFieldMagnifierNodeImpl282.animatable.getValue()).m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))) {
                                aj.z(afVar, null, null, new C00501(textFieldMagnifierNodeImpl282, j2, null), 3);
                                return ab.f48028a;
                            }
                        }
                        Object objSnapTo = textFieldMagnifierNodeImpl282.animatable.snapTo(Offset.m7969boximpl(j2), eVar);
                        return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
                    }
                }, this) == aVar) {
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

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z;
        this.animatable = new Animatable<>(Offset.m7969boximpl(TextFieldMagnifierKt.m3742calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m3744getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m7969boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
        MagnifierNode magnifierNode = new MagnifierNode(new h.g.a.l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return this.f$0.animatable.getValue();
            }
        }, null, new h.g.a.l() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldMagnifierNodeImpl28.magnifierNode$lambda$1(this.f$0, (DpSize) obj);
            }
        }, 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null);
        delegate(magnifierNode);
        this.magnifierNode = magnifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m3744getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m11343unboximpl();
    }

    static final ab magnifierNode$lambda$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, DpSize dpSize) {
        Density density = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity());
        textFieldMagnifierNodeImpl28.m3745setMagnifierSizeozmzZPI((density.mo2121roundToPx0680j_4(DpSize.m11262getWidthD9Ej5fM(dpSize.m11270unboximpl())) << 32) | (density.mo2121roundToPx0680j_4(DpSize.m11260getHeightD9Ej5fM(dpSize.m11270unboximpl())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return ab.f48028a;
    }

    private final void restartAnimationJob() {
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.animationJob = null;
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            this.animationJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
        }
    }

    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    private final void m3745setMagnifierSizeozmzZPI(long j2) {
        this.magnifierSize$delegate.setValue(IntSize.m11331boximpl(j2));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.magnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void update(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z2 = this.visible;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z;
        if (x.n(transformedTextFieldState, transformedTextFieldState2) && x.n(textFieldSelectionState, textFieldSelectionState2) && x.n(textLayoutState, textLayoutState2) && z == z2) {
            return;
        }
        restartAnimationJob();
    }
}
