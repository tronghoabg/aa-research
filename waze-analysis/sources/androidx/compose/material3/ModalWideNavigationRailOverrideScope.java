package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModalWideNavigationRailOverrideScope {
    public static final int $stable = 8;
    private final Arrangement.Vertical arrangement;
    private final Shape collapsedShape;
    private final WideNavigationRailColors colors;
    private final p<Composer, Integer, ab> content;
    private final PaddingValues contentPadding;
    private final float expandedHeaderTopPadding;
    private final ModalWideNavigationRailProperties expandedProperties;
    private final Shape expandedShape;
    private final p<Composer, Integer, ab> header;
    private final Modifier modifier;
    private final boolean shouldHideOnCollapse;
    private final WideNavigationRailState state;
    private final WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private ModalWideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, p<? super Composer, ? super Integer, ab> pVar, float f2, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, PaddingValues paddingValues, p<? super Composer, ? super Integer, ab> pVar2) {
        this.modifier = modifier;
        this.state = wideNavigationRailState;
        this.shouldHideOnCollapse = z;
        this.collapsedShape = shape;
        this.expandedShape = shape2;
        this.colors = wideNavigationRailColors;
        this.header = pVar;
        this.expandedHeaderTopPadding = f2;
        this.windowInsets = windowInsets;
        this.arrangement = vertical;
        this.expandedProperties = modalWideNavigationRailProperties;
        this.contentPadding = paddingValues;
        this.content = pVar2;
    }

    public final Arrangement.Vertical getArrangement() {
        return this.arrangement;
    }

    public final Shape getCollapsedShape() {
        return this.collapsedShape;
    }

    public final WideNavigationRailColors getColors() {
        return this.colors;
    }

    public final p<Composer, Integer, ab> getContent() {
        return this.content;
    }

    public final PaddingValues getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getExpandedHeaderTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m5242getExpandedHeaderTopPaddingD9Ej5fM() {
        return this.expandedHeaderTopPadding;
    }

    public final ModalWideNavigationRailProperties getExpandedProperties() {
        return this.expandedProperties;
    }

    public final Shape getExpandedShape() {
        return this.expandedShape;
    }

    public final p<Composer, Integer, ab> getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final boolean getShouldHideOnCollapse() {
        return this.shouldHideOnCollapse;
    }

    public final WideNavigationRailState getState() {
        return this.state;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ ModalWideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, p pVar, float f2, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, PaddingValues paddingValues, p pVar2, o oVar) {
        this(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, pVar, f2, windowInsets, vertical, modalWideNavigationRailProperties, paddingValues, pVar2);
    }
}
