package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.ao;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private FiniteAnimationSpec<Float> animationSpec;
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVector1D> offsetAnim;
    private Animatable<Float, AnimationVector1D> sizeAnim;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return ThumbNode.this.new AnonymousClass1(eVar);
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
                final ao aoVar = new ao();
                k<Interaction> interactions = ThumbNode.this.getInteractionSource().getInteractions();
                final ThumbNode thumbNode = ThumbNode.this;
                this.label = 1;
                if (interactions.collect(new l() { // from class: androidx.compose.material3.ThumbNode.onAttach.1.1
                    public final Object emit(Interaction interaction, e<? super ab> eVar) {
                        if (interaction instanceof PressInteraction.Press) {
                            aoVar.f48103a++;
                        } else if (interaction instanceof PressInteraction.Release) {
                            ao aoVar2 = aoVar;
                            aoVar2.f48103a--;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            ao aoVar3 = aoVar;
                            aoVar3.f48103a--;
                        }
                        boolean z = aoVar.f48103a > 0;
                        if (thumbNode.isPressed != z) {
                            thumbNode.isPressed = z;
                            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((Interaction) obj2, (e<? super ab>) eVar);
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

    public ThumbNode(InteractionSource interactionSource, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.interactionSource = interactionSource;
        this.checked = z;
        this.animationSpec = finiteAnimationSpec;
    }

    static final ab measure_3p2s80s$lambda$0(Placeable placeable, ThumbNode thumbNode, float f2, Placeable.PlacementScope placementScope) {
        Animatable<Float, AnimationVector1D> animatable = thumbNode.offsetAnim;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, animatable != null ? (int) animatable.getValue().floatValue() : (int) f2, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public AnonymousClass1() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03831() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        boolean z = false;
        if (measurable.maxIntrinsicHeight(Constraints.m11107getMaxWidthimpl(j2)) != 0 && measurable.maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)) != 0) {
            z = true;
        }
        float f2 = measureScope.mo2127toPx0680j_4(this.isPressed ? SwitchTokens.INSTANCE.m7140getPressedHandleWidthD9Ej5fM() : (z || this.checked) ? SwitchKt.getThumbDiameter() : SwitchKt.getUncheckedThumbDiameter());
        Animatable<Float, AnimationVector1D> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.getValue().floatValue() : f2);
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(iFloatValue, iFloatValue));
        final float f3 = measureScope.mo2127toPx0680j_4((SwitchKt.SwitchHeight - measureScope.mo2123toDpu2uoSUM(f2)) / 2.0f);
        float f4 = measureScope.mo2127toPx0680j_4((SwitchKt.SwitchWidth - SwitchKt.getThumbDiameter()) - SwitchKt.ThumbPadding);
        boolean z2 = this.isPressed;
        if (z2 && this.checked) {
            f3 = f4 - measureScope.mo2127toPx0680j_4(SwitchTokens.INSTANCE.m7146getTrackOutlineWidthD9Ej5fM());
        } else if (z2 && !this.checked) {
            f3 = measureScope.mo2127toPx0680j_4(SwitchTokens.INSTANCE.m7146getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            f3 = f4;
        }
        Animatable<Float, AnimationVector1D> animatable2 = this.sizeAnim;
        if (!x.l(animatable2 != null ? animatable2.getTargetValue() : null, f2)) {
            aj.z(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, f2, null), 3);
        }
        Animatable<Float, AnimationVector1D> animatable3 = this.offsetAnim;
        if (!x.l(animatable3 != null ? animatable3.getTargetValue() : null, f3)) {
            aj.z(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, f3, null), 3);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = f2;
            this.initialOffset = f3;
        }
        return MeasureScope.CC.layout$default(measureScope, iFloatValue, iFloatValue, null, new h.g.a.l() { // from class: androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ThumbNode.measure_3p2s80s$lambda$0(placeableMo9741measureBRTryo0, this, f3, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03841() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
            /* JADX INFO: Access modifiers changed from: package-private */
            public C03851() {
            }

            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        this.offsetAnim = null;
        this.sizeAnim = null;
        this.initialSize = Float.NaN;
        this.initialOffset = Float.NaN;
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setInteractionSource(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AnimatableKt.Animatable$default(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AnimatableKt.Animatable$default(this.initialOffset, 0.0f, 2, null);
    }
}
