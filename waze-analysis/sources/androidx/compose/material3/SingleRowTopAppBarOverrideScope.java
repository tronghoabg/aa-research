package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SingleRowTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final q<RowScope, Composer, Integer, ab> actions;
    private final TopAppBarColors colors;
    private final PaddingValues contentPadding;
    private final float expandedHeight;
    private final Modifier modifier;
    private final p<Composer, Integer, ab> navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final p<Composer, Integer, ab> subtitle;
    private final TextStyle subtitleTextStyle;
    private final p<Composer, Integer, ab> title;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private SingleRowTopAppBarOverrideScope(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, TextStyle textStyle, p<? super Composer, ? super Integer, ab> pVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, p<? super Composer, ? super Integer, ab> pVar3, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, float f2, PaddingValues paddingValues, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = pVar;
        this.titleTextStyle = textStyle;
        this.subtitle = pVar2;
        this.subtitleTextStyle = textStyle2;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = pVar3;
        this.actions = qVar;
        this.expandedHeight = f2;
        this.contentPadding = paddingValues;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public final q<RowScope, Composer, Integer, ab> getActions() {
        return this.actions;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    public final PaddingValues getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m5557getExpandedHeightD9Ej5fM() {
        return this.expandedHeight;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final p<Composer, Integer, ab> getNavigationIcon() {
        return this.navigationIcon;
    }

    public final TopAppBarScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final p<Composer, Integer, ab> getSubtitle() {
        return this.subtitle;
    }

    public final TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final p<Composer, Integer, ab> getTitle() {
        return this.title;
    }

    public final Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ SingleRowTopAppBarOverrideScope(Modifier modifier, p pVar, TextStyle textStyle, p pVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, p pVar3, q qVar, float f2, PaddingValues paddingValues, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, o oVar) {
        this(modifier, pVar, textStyle, pVar2, textStyle2, horizontal, pVar3, qVar, f2, paddingValues, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }
}
