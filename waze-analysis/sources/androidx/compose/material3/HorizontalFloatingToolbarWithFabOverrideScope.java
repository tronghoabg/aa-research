package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HorizontalFloatingToolbarWithFabOverrideScope {
    public static final int $stable = 8;
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float collapsedShadowElevation;
    private final FloatingToolbarColors colors;
    private final q<RowScope, Composer, Integer, ab> content;
    private final PaddingValues contentPadding;
    private final float expandedShadowElevation;
    private final p<Composer, Integer, ab> floatingActionButton;
    private final int floatingActionButtonPosition;
    private final boolean isExpanded;
    private final Modifier modifier;
    private final FloatingToolbarScrollBehavior scrollBehavior;
    private final Shape shape;

    /* JADX WARN: Multi-variable type inference failed */
    private HorizontalFloatingToolbarWithFabOverrideScope(boolean z, p<? super Composer, ? super Integer, ab> pVar, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i2, FiniteAnimationSpec<Float> finiteAnimationSpec, float f2, float f3, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar) {
        this.isExpanded = z;
        this.floatingActionButton = pVar;
        this.modifier = modifier;
        this.colors = floatingToolbarColors;
        this.contentPadding = paddingValues;
        this.scrollBehavior = floatingToolbarScrollBehavior;
        this.shape = shape;
        this.floatingActionButtonPosition = i2;
        this.animationSpec = finiteAnimationSpec;
        this.expandedShadowElevation = f2;
        this.collapsedShadowElevation = f3;
        this.content = qVar;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    /* renamed from: getCollapsedShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m4977getCollapsedShadowElevationD9Ej5fM() {
        return this.collapsedShadowElevation;
    }

    public final FloatingToolbarColors getColors() {
        return this.colors;
    }

    public final q<RowScope, Composer, Integer, ab> getContent() {
        return this.content;
    }

    public final PaddingValues getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getExpandedShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m4978getExpandedShadowElevationD9Ej5fM() {
        return this.expandedShadowElevation;
    }

    public final p<Composer, Integer, ab> getFloatingActionButton() {
        return this.floatingActionButton;
    }

    /* renamed from: getFloatingActionButtonPosition-EdPuMIg, reason: not valid java name */
    public final int m4979getFloatingActionButtonPositionEdPuMIg() {
        return this.floatingActionButtonPosition;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final FloatingToolbarScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public /* synthetic */ HorizontalFloatingToolbarWithFabOverrideScope(boolean z, p pVar, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, int i2, FiniteAnimationSpec finiteAnimationSpec, float f2, float f3, q qVar, o oVar) {
        this(z, pVar, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, i2, finiteAnimationSpec, f2, f3, qVar);
    }
}
