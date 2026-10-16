package androidx.compose.material3.internal.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.compose.material3.internal.ripple.RippleNodeConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedFocusRingInterpolation;
    private final boolean bounded;
    private final ColorProducer color;
    private Interaction currentInteraction;
    private BorderLogicLayerDelegate focusedBorderLogic;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final List<Interaction> interactions;
    private final MutableState isFocused$delegate;
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;
    private final a<RippleNodeConfig> rippleNodeConfig;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private float targetRadius;

    /* compiled from: WazeSource */
    public final class BorderLogicLayerDelegate {
        private final BorderLogic borderLogic = new BorderLogic();
        private GraphicsLayer layer;

        public BorderLogicLayerDelegate() {
        }

        static final GraphicsLayer drawBorder$lambda$0(BorderLogicLayerDelegate borderLogicLayerDelegate) {
            GraphicsLayer graphicsLayer = borderLogicLayerDelegate.layer;
            if (graphicsLayer != null) {
                return graphicsLayer;
            }
            GraphicsLayer graphicsLayerObtainGraphicsLayer = borderLogicLayerDelegate.obtainGraphicsLayer();
            borderLogicLayerDelegate.layer = graphicsLayerObtainGraphicsLayer;
            return graphicsLayerObtainGraphicsLayer;
        }

        public final void drawBorder(DrawScope drawScope, a<Dp> aVar, a<Dp> aVar2, Brush brush, Outline outline) {
            this.borderLogic.drawBorder$material3(drawScope, aVar, aVar2, brush, new a() { // from class: androidx.compose.material3.internal.ripple.RippleNode$BorderLogicLayerDelegate$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return RippleNode.BorderLogicLayerDelegate.drawBorder$lambda$0(this.f$0);
                }
            }, outline);
        }

        public final BorderLogic getBorderLogic() {
            return this.borderLogic;
        }

        public final GraphicsLayer getLayer() {
            return this.layer;
        }

        public final GraphicsLayer obtainGraphicsLayer() {
            return DelegatableNodeKt.requireGraphicsContext(RippleNode.this).createGraphicsLayer();
        }

        public final void release() {
            GraphicsLayer graphicsLayer = this.layer;
            if (graphicsLayer != null) {
                DelegatableNodeKt.requireGraphicsContext(RippleNode.this).releaseGraphicsLayer(graphicsLayer);
            }
        }

        public final void setLayer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.internal.ripple.RippleNode$onAttach$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = RippleNode.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final af afVar = (af) this.L$0;
                k<Interaction> interactions = RippleNode.this.interactionSource.getInteractions();
                final RippleNode rippleNode = RippleNode.this;
                this.label = 1;
                if (interactions.collect(new l() { // from class: androidx.compose.material3.internal.ripple.RippleNode.onAttach.1.1

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ AnimationSpec<Float> $incomingAnimationSpec;
                        final /* synthetic */ float $targetAlpha;
                        int label;
                        final /* synthetic */ RippleNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(RippleNode rippleNode, float f2, AnimationSpec<Float> animationSpec, e<? super AnonymousClass2> eVar) {
                            super(2, eVar);
                            this.this$0 = rippleNode;
                            this.$targetAlpha = f2;
                            this.$incomingAnimationSpec = animationSpec;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass2(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                RippleNode rippleNode = this.this$0;
                                float f2 = this.$targetAlpha;
                                this.label = 1;
                                if (Animatable.animateTo$default(rippleNode.animatedAlpha, new Float(f2), this.$incomingAnimationSpec, null, null, this, 12, null) == aVar) {
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
                    /* renamed from: androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$3, reason: invalid class name */
                    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ AnimationSpec<Float> $outgoingAnimationSpec;
                        int label;
                        final /* synthetic */ RippleNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(RippleNode rippleNode, AnimationSpec<Float> animationSpec, e<? super AnonymousClass3> eVar) {
                            super(2, eVar);
                            this.this$0 = rippleNode;
                            this.$outgoingAnimationSpec = animationSpec;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass3(this.this$0, this.$outgoingAnimationSpec, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (Animatable.animateTo$default(this.this$0.animatedAlpha, new Float(0.0f), this.$outgoingAnimationSpec, null, null, this, 12, null) == aVar) {
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
                    /* renamed from: androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$4, reason: invalid class name */
                    final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ boolean $isFocusing;
                        final /* synthetic */ RippleNodeConfig $rippleNodeConfig;
                        int label;
                        final /* synthetic */ RippleNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(RippleNode rippleNode, boolean z, RippleNodeConfig rippleNodeConfig, e<? super AnonymousClass4> eVar) {
                            super(2, eVar);
                            this.this$0 = rippleNode;
                            this.$isFocusing = z;
                            this.$rippleNodeConfig = rippleNodeConfig;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass4(this.this$0, this.$isFocusing, this.$rippleNodeConfig, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                RippleNode rippleNode = this.this$0;
                                float f2 = true != this.$isFocusing ? 0.0f : 1.0f;
                                Animatable animatable = rippleNode.animatedFocusRingInterpolation;
                                Float f3 = new Float(f2);
                                boolean z = this.$isFocusing;
                                RippleNodeConfig rippleNodeConfig = this.$rippleNodeConfig;
                                FiniteAnimationSpec<Float> focusingAnimationSpec = z ? ((RippleNodeConfig.Focus.InsetRing) rippleNodeConfig.getFocus()).getFocusingAnimationSpec() : ((RippleNodeConfig.Focus.InsetRing) rippleNodeConfig.getFocus()).getUnfocusingAnimationSpec();
                                this.label = 1;
                                if (Animatable.animateTo$default(animatable, f3, focusingAnimationSpec, null, null, this, 12, null) == aVar) {
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
                    /* renamed from: androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$5, reason: invalid class name */
                    final class AnonymousClass5 extends g implements p<af, e<? super ab>, Object> {
                        int label;
                        final /* synthetic */ RippleNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass5(RippleNode rippleNode, e<? super AnonymousClass5> eVar) {
                            super(2, eVar);
                            this.this$0 = rippleNode;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new AnonymousClass5(this.this$0, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((AnonymousClass5) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.this$0.animatedFocusRingInterpolation.snapTo(new Float(0.0f), this) == aVar) {
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

                    public final Object emit(Interaction interaction, e<? super ab> eVar) {
                        if (interaction instanceof PressInteraction) {
                            boolean z = rippleNode.hasValidSize;
                            RippleNode rippleNode2 = rippleNode;
                            if (z) {
                                rippleNode2.handlePressInteraction((PressInteraction) interaction);
                            } else {
                                rippleNode2.pendingInteractions.add(interaction);
                            }
                        }
                        boolean z2 = interaction instanceof HoverInteraction.Enter;
                        boolean zIsFocused = rippleNode.isFocused();
                        if (z2) {
                            rippleNode.interactions.add(interaction);
                        } else if (interaction instanceof HoverInteraction.Exit) {
                            rippleNode.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
                        } else if (interaction instanceof FocusInteraction.Focus) {
                            rippleNode.interactions.add(interaction);
                            rippleNode.setFocused(true);
                        } else if (interaction instanceof FocusInteraction.Unfocus) {
                            rippleNode.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                            List list = rippleNode.interactions;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    rippleNode.setFocused(false);
                                    break;
                                }
                                if (((Interaction) list.get(i3)) instanceof FocusInteraction.Focus) {
                                    break;
                                }
                                i3++;
                            }
                        } else if (interaction instanceof DragInteraction.Start) {
                            rippleNode.interactions.add(interaction);
                        } else {
                            if (!(interaction instanceof DragInteraction.Stop)) {
                                if (interaction instanceof DragInteraction.Cancel) {
                                    rippleNode.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
                                }
                                return ab.f48028a;
                            }
                            rippleNode.interactions.remove(((DragInteraction.Stop) interaction).getStart());
                        }
                        Interaction interaction2 = (Interaction) i.U(rippleNode.interactions);
                        RippleNodeConfig rippleNodeConfigInvoke = rippleNode.getRippleNodeConfig().invoke();
                        if (!x.n(rippleNode.currentInteraction, interaction2)) {
                            if (interaction2 != null) {
                                float alpha = 0.0f;
                                if (interaction2 instanceof HoverInteraction.Enter) {
                                    if (rippleNodeConfigInvoke.getHover() instanceof RippleNodeConfig.Hover.Opacity) {
                                        alpha = ((RippleNodeConfig.Hover.Opacity) rippleNodeConfigInvoke.getHover()).getAlpha();
                                    }
                                } else if (interaction2 instanceof FocusInteraction.Focus) {
                                    if (rippleNodeConfigInvoke.getFocus() instanceof RippleNodeConfig.Focus.Opacity) {
                                        alpha = ((RippleNodeConfig.Focus.Opacity) rippleNodeConfigInvoke.getFocus()).getAlpha();
                                    }
                                } else if ((interaction2 instanceof DragInteraction.Start) && (rippleNodeConfigInvoke.getDrag() instanceof RippleNodeConfig.Drag.Opacity)) {
                                    alpha = ((RippleNodeConfig.Drag.Opacity) rippleNodeConfigInvoke.getDrag()).getAlpha();
                                }
                                aj.z(afVar, null, null, new AnonymousClass2(rippleNode, alpha, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3);
                            } else {
                                aj.z(afVar, null, null, new AnonymousClass3(rippleNode, RippleKt.outgoingStateLayerAnimationSpecFor(rippleNode.currentInteraction), null), 3);
                            }
                            if (!(rippleNodeConfigInvoke.getFocus() instanceof RippleNodeConfig.Focus.InsetRing)) {
                                aj.z(afVar, null, null, new AnonymousClass5(rippleNode, null), 3);
                            } else if (zIsFocused != rippleNode.isFocused()) {
                                aj.z(afVar, null, null, new AnonymousClass4(rippleNode, interaction2 instanceof FocusInteraction.Focus, rippleNodeConfigInvoke, null), 3);
                            }
                            rippleNode.currentInteraction = interaction2;
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

    private RippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a<RippleNodeConfig> aVar) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f2;
        this.color = colorProducer;
        this.rippleNodeConfig = aVar;
        this.rippleSize = Size.Companion.m8058getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
        this.animatedFocusRingInterpolation = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.isFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private final void drawStateLayers(DrawScope drawScope) throws Throwable {
        long j2;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue > 0.0f) {
            long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(this.color.mo4059invoke0d7_KjU(), fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.bounded) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                int iM8217getIntersectrtfAjoo = ClipOp.Companion.m8217getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo8761clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iM8217getIntersectrtfAjoo);
                    j2 = jMo8758getSizeNHjbRc;
                    try {
                        DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, this.targetRadius, 0L, 0.0f, null, null, 0, 124, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(j2);
                    } catch (Throwable th) {
                        th = th;
                        drawContext.getCanvas().restore();
                        drawContext.mo8759setSizeuvyYCjk(j2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = jMo8758getSizeNHjbRc;
                }
            } else {
                DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, jM8227copywmQWz5c$default, this.targetRadius, 0L, 0.0f, null, null, 0, 124, null);
            }
        }
        if (this.animatedFocusRingInterpolation.getValue().floatValue() > 0.0f) {
            BorderLogicLayerDelegate borderLogicLayerDelegate = this.focusedBorderLogic;
            if (borderLogicLayerDelegate == null) {
                borderLogicLayerDelegate = new BorderLogicLayerDelegate();
            }
            this.focusedBorderLogic = borderLogicLayerDelegate;
            RippleNodeConfig.Focus focus = this.rippleNodeConfig.invoke().getFocus();
            final RippleNodeConfig.Focus.InsetRing insetRing = focus instanceof RippleNodeConfig.Focus.InsetRing ? (RippleNodeConfig.Focus.InsetRing) focus : null;
            if (insetRing == null) {
                return;
            }
            Outline outlineMo2037createOutlinePq9zytI = insetRing.getShape().mo2037createOutlinePq9zytI(drawScope.mo8751getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope);
            BorderLogicLayerDelegate borderLogicLayerDelegate2 = this.focusedBorderLogic;
            x.c(borderLogicLayerDelegate2);
            borderLogicLayerDelegate2.drawBorder(drawScope, new a() { // from class: androidx.compose.material3.internal.ripple.RippleNode$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Dp.m11162boximpl(insetRing.m6405getInnerStrokeWidthD9Ej5fM() * this.animatedFocusRingInterpolation.getValue().floatValue());
                }
            }, new a() { // from class: androidx.compose.material3.internal.ripple.RippleNode$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return Dp.m11162boximpl(insetRing.m6404getInnerStrokeInsetD9Ej5fM() * this.animatedFocusRingInterpolation.getValue().floatValue());
                }
            }, new SolidColor(insetRing.getInnerStrokeColor().mo4059invoke0d7_KjU(), null), outlineMo2037createOutlinePq9zytI);
            BorderLogicLayerDelegate borderLogicLayerDelegate3 = this.focusedBorderLogic;
            x.c(borderLogicLayerDelegate3);
            borderLogicLayerDelegate3.drawBorder(drawScope, new a() { // from class: androidx.compose.material3.internal.ripple.RippleNode$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return Dp.m11162boximpl(insetRing.m6407getOuterStrokeWidthD9Ej5fM() * this.animatedFocusRingInterpolation.getValue().floatValue());
                }
            }, new a() { // from class: androidx.compose.material3.internal.ripple.RippleNode$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return Dp.m11162boximpl(insetRing.m6406getOuterStrokeInsetD9Ej5fM() * this.animatedFocusRingInterpolation.getValue().floatValue());
                }
            }, new SolidColor(insetRing.getOuterStrokeColor().mo4059invoke0d7_KjU(), null), outlineMo2037createOutlinePq9zytI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo6390addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFocused() {
        return ((Boolean) this.isFocused$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFocused(boolean z) {
        this.isFocused$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo6390addRipple12SF9DM(PressInteraction.Press press, long j2, float f2);

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) throws Throwable {
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        drawRipples(contentDrawScope2);
        drawStateLayers(contentDrawScope2);
    }

    public abstract void drawRipples(DrawScope drawScope);

    protected final boolean getBounded() {
        return this.bounded;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m6402getRippleColor0d7_KjU() {
        return this.color.mo4059invoke0d7_KjU();
    }

    protected final a<RippleNodeConfig> getRippleNodeConfig() {
        return this.rippleNodeConfig;
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name */
    protected final long m6403getRippleSizeNHjbRc() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        BorderLogicLayerDelegate borderLogicLayerDelegate = this.focusedBorderLogic;
        if (borderLogicLayerDelegate != null) {
            borderLogicLayerDelegate.release();
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m11351toSizeozmzZPI(j2);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m6397getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize) : densityRequireDensity.mo2127toPx0680j_4(this.radius);
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i2 = mutableObjectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            handlePressInteraction((PressInteraction) objArr[i3]);
        }
        this.pendingInteractions.clear();
    }

    public abstract void removeRipple(PressInteraction.Press press);

    protected final void setTargetRadius(float f2) {
        this.targetRadius = f2;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public /* synthetic */ void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a aVar, o oVar) {
        this(interactionSource, z, f2, colorProducer, aVar);
    }
}
