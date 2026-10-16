package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FabVisibleNode extends DelegatingNode implements LayoutModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Alignment alignment;
    private final Animatable<Float, AnimationVector1D> alphaAnimatable;
    private AnimationSpec<Float> alphaAnimationSpec;
    private final Animatable<Float, AnimationVector1D> scaleAnimatable;
    private AnimationSpec<Float> scaleAnimationSpec;
    private float targetScale;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.FabVisibleNode$updateNode$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $scaleAnimationSpec;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, AnimationSpec<Float> animationSpec, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$visible = z;
            this.$scaleAnimationSpec = animationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FabVisibleNode.this.new AnonymousClass1(this.$visible, this.$scaleAnimationSpec, eVar);
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
                FabVisibleNode fabVisibleNode = FabVisibleNode.this;
                float f2 = true != this.$visible ? 0.0f : 1.0f;
                Animatable animatable = fabVisibleNode.scaleAnimatable;
                Float f3 = new Float(f2);
                FiniteAnimationSpec finiteAnimationSpecFastSpatialSpec = this.$scaleAnimationSpec;
                if (finiteAnimationSpecFastSpatialSpec == null) {
                    finiteAnimationSpecFastSpatialSpec = ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(FabVisibleNode.this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme().fastSpatialSpec();
                }
                this.label = 1;
                if (Animatable.animateTo$default(animatable, f3, finiteAnimationSpecFastSpatialSpec, null, null, this, 12, null) == aVar) {
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
    /* renamed from: androidx.compose.material3.FabVisibleNode$updateNode$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $alphaAnimationSpec;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z, AnimationSpec<Float> animationSpec, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$visible = z;
            this.$alphaAnimationSpec = animationSpec;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FabVisibleNode.this.new AnonymousClass2(this.$visible, this.$alphaAnimationSpec, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                FabVisibleNode fabVisibleNode = FabVisibleNode.this;
                float f2 = true != this.$visible ? 0.0f : 1.0f;
                Animatable animatable = fabVisibleNode.alphaAnimatable;
                Float f3 = new Float(f2);
                FiniteAnimationSpec finiteAnimationSpecFastEffectsSpec = this.$alphaAnimationSpec;
                if (finiteAnimationSpecFastEffectsSpec == null) {
                    finiteAnimationSpecFastEffectsSpec = ((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(FabVisibleNode.this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme().fastEffectsSpec();
                }
                this.label = 1;
                if (Animatable.animateTo$default(animatable, f3, finiteAnimationSpecFastEffectsSpec, null, null, this, 12, null) == aVar) {
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

    public FabVisibleNode(boolean z, Alignment alignment, float f2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this.alignment = alignment;
        this.targetScale = f2;
        this.scaleAnimationSpec = animationSpec;
        this.alphaAnimationSpec = animationSpec2;
        float f3 = true != z ? 0.0f : 1.0f;
        this.scaleAnimatable = AnimatableKt.Animatable$default(f3, 0.0f, 2, null);
        this.alphaAnimatable = AnimatableKt.Animatable$default(f3, 0.0f, 2, null);
        delegate(DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FabVisibleNode._init_$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        }));
    }

    static final DrawResult _init_$lambda$0(FabVisibleNode fabVisibleNode, CacheDrawScope cacheDrawScope) {
        final GraphicsLayer graphicsLayerObtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        int iMo2127toPx0680j_4 = (int) cacheDrawScope.mo2127toPx0680j_4(16.0f);
        final float f2 = iMo2127toPx0680j_4;
        float f3 = f2 + f2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)) + f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f3;
        long jM11350toIntSizeuvyYCjk = IntSizeKt.m11350toIntSizeuvyYCjk((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jM11350toIntSizeuvyYCjk2 = IntSizeKt.m11350toIntSizeuvyYCjk(cacheDrawScope.m7760getSizeNHjbRc());
        long j2 = -iMo2127toPx0680j_4;
        graphicsLayerObtainGraphicsLayer.m8941setTopLeftgyyYBs((j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (j2 << 32));
        graphicsLayerObtainGraphicsLayer.setAlpha(fabVisibleNode.alphaAnimatable.getValue().floatValue());
        long jMo7648alignKFBX0sM = fabVisibleNode.alignment.mo7648alignKFBX0sM(InlineClassHelperKt.Uint64Low32, jM11350toIntSizeuvyYCjk2, cacheDrawScope.getLayoutDirection());
        int iM11296getXimpl = IntOffset.m11296getXimpl(jMo7648alignKFBX0sM);
        int iM11297getYimpl = IntOffset.m11297getYimpl(jMo7648alignKFBX0sM);
        long jFloatToRawIntBits = Float.floatToRawIntBits(iM11296getXimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(iM11297getYimpl);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        graphicsLayerObtainGraphicsLayer.m8937setPivotOffsetk4lQ0M(Offset.m7985plusMKHz9U((jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits3 << 32)));
        graphicsLayerObtainGraphicsLayer.setScaleX(MathHelpersKt.lerp(fabVisibleNode.targetScale, 1.0f, fabVisibleNode.scaleAnimatable.getValue().floatValue()));
        graphicsLayerObtainGraphicsLayer.setScaleY(MathHelpersKt.lerp(fabVisibleNode.targetScale, 1.0f, fabVisibleNode.scaleAnimatable.getValue().floatValue()));
        CacheDrawScope.m7759recordTdoYBX4$default(cacheDrawScope, graphicsLayerObtainGraphicsLayer, null, null, jM11350toIntSizeuvyYCjk, new l() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FabVisibleNode.lambda$0$0$0(f2, (ContentDrawScope) obj);
            }
        }, 3, null);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FabVisibleNode.lambda$0$1(graphicsLayerObtainGraphicsLayer, (ContentDrawScope) obj);
            }
        });
    }

    static final ab lambda$0$0$0(float f2, ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        float f3 = -f2;
        try {
            contentDrawScope.drawContent();
            contentDrawScope2.getDrawContext().getTransform().inset(f3, f3, f3, f3);
            return ab.f48028a;
        } catch (Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().inset(f3, f3, f3, f3);
            throw th;
        }
    }

    static final ab lambda$0$1(GraphicsLayer graphicsLayer, ContentDrawScope contentDrawScope) {
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return ab.f48028a;
    }

    static final ab measure_3p2s80s$lambda$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
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
        if (this.alphaAnimatable.getValue().floatValue() == 0.0f) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FabVisibleNode.measure_3p2s80s$lambda$1(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
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

    public final void updateNode(boolean z, Alignment alignment, float f2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this.alignment = alignment;
        this.targetScale = f2;
        this.scaleAnimationSpec = animationSpec;
        this.alphaAnimationSpec = animationSpec2;
        aj.z(getCoroutineScope(), null, null, new AnonymousClass1(z, animationSpec, null), 3);
        aj.z(getCoroutineScope(), null, null, new AnonymousClass2(z, animationSpec2, null), 3);
    }

    public /* synthetic */ FabVisibleNode(boolean z, Alignment alignment, float f2, AnimationSpec animationSpec, AnimationSpec animationSpec2, int i2, o oVar) {
        this(z, alignment, f2, (i2 & 8) != 0 ? null : animationSpec, (i2 & 16) != 0 ? null : animationSpec2);
    }
}
