package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HorizontalFloatingToolbarOverrideScope {
    public static final int $stable = 0;
    private final float collapsedShadowElevation;
    private final FloatingToolbarColors colors;
    private final q<RowScope, Composer, Integer, ab> content;
    private final PaddingValues contentPadding;
    private final float expandedShadowElevation;
    private final boolean isExpanded;
    private final q<RowScope, Composer, Integer, ab> leadingContent;
    private final Modifier modifier;
    private final FloatingToolbarScrollBehavior scrollBehavior;
    private final Shape shape;
    private final q<RowScope, Composer, Integer, ab> trailingContent;

    /* JADX WARN: Multi-variable type inference failed */
    private HorizontalFloatingToolbarOverrideScope(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar2, float f2, float f3, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar3) {
        this.isExpanded = z;
        this.modifier = modifier;
        this.colors = floatingToolbarColors;
        this.contentPadding = paddingValues;
        this.scrollBehavior = floatingToolbarScrollBehavior;
        this.shape = shape;
        this.leadingContent = qVar;
        this.trailingContent = qVar2;
        this.expandedShadowElevation = f2;
        this.collapsedShadowElevation = f3;
        this.content = qVar3;
    }

    /* renamed from: getCollapsedShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m4975getCollapsedShadowElevationD9Ej5fM() {
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
    public final float m4976getExpandedShadowElevationD9Ej5fM() {
        return this.expandedShadowElevation;
    }

    public final q<RowScope, Composer, Integer, ab> getLeadingContent() {
        return this.leadingContent;
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

    public final q<RowScope, Composer, Integer, ab> getTrailingContent() {
        return this.trailingContent;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public /* synthetic */ HorizontalFloatingToolbarOverrideScope(boolean z, Modifier modifier, FloatingToolbarColors floatingToolbarColors, PaddingValues paddingValues, FloatingToolbarScrollBehavior floatingToolbarScrollBehavior, Shape shape, q qVar, q qVar2, float f2, float f3, q qVar3, o oVar) {
        this(z, modifier, floatingToolbarColors, paddingValues, floatingToolbarScrollBehavior, shape, qVar, qVar2, f2, f3, qVar3);
    }
}
