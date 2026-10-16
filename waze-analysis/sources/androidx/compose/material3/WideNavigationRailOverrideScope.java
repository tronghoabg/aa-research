package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailOverrideScope {
    public static final int $stable = 8;
    private final Arrangement.Vertical arrangement;
    private final WideNavigationRailColors colors;
    private final p<Composer, Integer, ab> content;
    private final PaddingValues contentPadding;
    private final p<Composer, Integer, ab> header;
    private final Modifier modifier;
    private final Shape shape;
    private final WideNavigationRailState state;
    private final WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public WideNavigationRailOverrideScope(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, p<? super Composer, ? super Integer, ab> pVar, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, p<? super Composer, ? super Integer, ab> pVar2) {
        this.modifier = modifier;
        this.state = wideNavigationRailState;
        this.shape = shape;
        this.colors = wideNavigationRailColors;
        this.header = pVar;
        this.windowInsets = windowInsets;
        this.arrangement = vertical;
        this.contentPadding = paddingValues;
        this.content = pVar2;
    }

    public final Arrangement.Vertical getArrangement() {
        return this.arrangement;
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

    public final p<Composer, Integer, ab> getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final WideNavigationRailState getState() {
        return this.state;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }
}
