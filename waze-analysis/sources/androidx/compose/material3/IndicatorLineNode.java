package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IndicatorLineNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private TextFieldColors _colors;
    private Shape _shape;
    private Animatable<Color, AnimationVector4D> colorAnimatable;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private boolean enabled;
    private boolean focused;
    private float focusedIndicatorWidth;
    private InteractionSource interactionSource;
    private boolean isError;
    private br trackFocusStateJob;
    private float unfocusedIndicatorWidth;
    private final Animatable<Dp, AnimationVector1D> widthAnimatable;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return IndicatorLineNode.this.new AnonymousClass1(eVar);
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
                Animatable animatable = IndicatorLineNode.this.colorAnimatable;
                if (animatable != null) {
                    IndicatorLineNode indicatorLineNode = IndicatorLineNode.this;
                    Color colorM8218boximpl = Color.m8218boximpl(indicatorLineNode.getColors().m5775indicatorColorXeAY9LY(indicatorLineNode.enabled, indicatorLineNode.isError, indicatorLineNode.focused));
                    SnapSpec snapSpecFromToken = IndicatorLineNode.this.enabled ? MotionSchemeKt.fromToken(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(IndicatorLineNode.this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme(), MotionSchemeKeyTokens.FastEffects) : AnimationSpecKt.snap$default(0, 1, null);
                    this.label = 1;
                    obj = Animatable.animateTo$default(animatable, colorM8218boximpl, snapSpecFromToken, null, null, this, 12, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ab.f48028a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return IndicatorLineNode.this.new AnonymousClass2(eVar);
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
                IndicatorLineNode indicatorLineNode = IndicatorLineNode.this;
                Animatable animatable = indicatorLineNode.widthAnimatable;
                float f2 = (indicatorLineNode.focused && IndicatorLineNode.this.enabled) ? IndicatorLineNode.this.focusedIndicatorWidth : IndicatorLineNode.this.unfocusedIndicatorWidth;
                IndicatorLineNode indicatorLineNode2 = IndicatorLineNode.this;
                Dp dpM11162boximpl = Dp.m11162boximpl(f2);
                SnapSpec snapSpecFromToken = indicatorLineNode2.enabled ? MotionSchemeKt.fromToken(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(IndicatorLineNode.this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme(), MotionSchemeKeyTokens.FastSpatial) : AnimationSpecKt.snap$default(0, 1, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, dpM11162boximpl, snapSpecFromToken, null, null, this, 12, null) == aVar) {
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
    /* renamed from: androidx.compose.material3.IndicatorLineNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    final class C03421 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C03421(e<? super C03421> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return IndicatorLineNode.this.new C03421(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03421) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (IndicatorLineNode.this.trackFocusState(this) == aVar) {
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

    private IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.focusedIndicatorWidth = f2;
        this.unfocusedIndicatorWidth = f3;
        this._colors = textFieldColors;
        this._shape = shape;
        this.widthAnimatable = new Animatable<>(Dp.m11162boximpl((this.focused && z) ? f2 : f3), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        CacheDrawModifierNode CacheDrawModifierNode = DrawModifierKt.CacheDrawModifierNode(new l() { // from class: androidx.compose.material3.IndicatorLineNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$0(this.f$0, (CacheDrawScope) obj);
            }
        });
        delegate(CacheDrawModifierNode);
        this.drawWithCacheModifierNode = CacheDrawModifierNode;
    }

    static final DrawResult drawWithCacheModifierNode$lambda$0(final IndicatorLineNode indicatorLineNode, CacheDrawScope cacheDrawScope) {
        float fMo2127toPx0680j_4 = cacheDrawScope.mo2127toPx0680j_4(indicatorLineNode.widthAnimatable.getValue().m11178unboximpl());
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, indicatorLineNode.getShape().mo2037createOutlinePq9zytI(cacheDrawScope.m7760getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope));
        Path Path2 = AndroidPath_androidKt.Path();
        Path.CC.addRect$default(Path2, new Rect(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - fMo2127toPx0680j_4, Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & cacheDrawScope.m7760getSizeNHjbRc()))), null, 2, null);
        final Path pathAnd = Path2.and(Path);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.material3.IndicatorLineNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$0$2(pathAnd, indicatorLineNode, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab drawWithCacheModifierNode$lambda$0$2(Path path, IndicatorLineNode indicatorLineNode, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Animatable<Color, AnimationVector4D> animatable = indicatorLineNode.colorAnimatable;
        x.c(animatable);
        DrawScope.CC.m8831drawPathGBMwjPU$default(contentDrawScope, path, new SolidColor(animatable.getValue().m8238unboximpl(), null), 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldColors getColors() {
        TextFieldColors textFieldColors = this._colors;
        if (textFieldColors != null) {
            return textFieldColors;
        }
        IndicatorLineNode indicatorLineNode = this;
        return TextFieldDefaults.INSTANCE.defaultTextFieldColors$material3(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(indicatorLineNode, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getColorScheme(), (TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(indicatorLineNode, TextSelectionColorsKt.getLocalTextSelectionColors()));
    }

    private final Shape getShape() {
        Shape shape = this._shape;
        return shape == null ? ShapesKt.fromToken(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getShapes(), FilledTextFieldTokens.INSTANCE.getContainerShape()) : shape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateIndicator() {
        aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
        aj.z(getCoroutineScope(), null, null, new AnonymousClass2(null), 3);
    }

    private final void set_shape(Shape shape) {
        if (x.n(this._shape, shape)) {
            return;
        }
        this._shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackFocusState(e<? super ab> eVar) {
        this.focused = false;
        final ArrayList arrayList = new ArrayList();
        Object objCollect = this.interactionSource.getInteractions().collect(new kotlinx.coroutines.b.l() { // from class: androidx.compose.material3.IndicatorLineNode.trackFocusState.2
            public final Object emit(Interaction interaction, e<? super ab> eVar2) {
                if (interaction instanceof FocusInteraction.Focus) {
                    arrayList.add(interaction);
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                }
                boolean z = !arrayList.isEmpty();
                if (z != this.focused) {
                    this.focused = z;
                    this.invalidateIndicator();
                }
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((Interaction) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.trackFocusStateJob = aj.z(getCoroutineScope(), null, null, new C03421(null), 3);
        if (this.colorAnimatable == null) {
            long jM5775indicatorColorXeAY9LY = getColors().m5775indicatorColorXeAY9LY(this.enabled, this.isError, this.focused);
            this.colorAnimatable = new Animatable<>(Color.m8218boximpl(jM5775indicatorColorXeAY9LY), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m8232getColorSpaceimpl(jM5775indicatorColorXeAY9LY)), null, null, 12, null);
        }
    }

    /* renamed from: update-gv0btCI, reason: not valid java name */
    public final void m5055updategv0btCI(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        boolean z3;
        boolean z4 = true;
        if (this.enabled != z) {
            this.enabled = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.isError != z2) {
            this.isError = z2;
            z3 = true;
        }
        if (this.interactionSource != interactionSource) {
            this.interactionSource = interactionSource;
            br brVar = this.trackFocusStateJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.trackFocusStateJob = aj.z(getCoroutineScope(), null, null, new IndicatorLineNode$update$1(this, null), 3);
        }
        if (!x.n(this._colors, textFieldColors)) {
            this._colors = textFieldColors;
            z3 = true;
        }
        if (!x.n(this._shape, shape)) {
            set_shape(shape);
            z3 = true;
        }
        if (Dp.m11169equalsimpl0(this.focusedIndicatorWidth, f2)) {
            z4 = z3;
        } else {
            this.focusedIndicatorWidth = f2;
        }
        if (!Dp.m11169equalsimpl0(this.unfocusedIndicatorWidth, f3)) {
            this.unfocusedIndicatorWidth = f3;
        } else if (!z4) {
            return;
        }
        invalidateIndicator();
    }

    public /* synthetic */ IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, o oVar) {
        this(z, z2, interactionSource, textFieldColors, shape, f2, f3);
    }
}
