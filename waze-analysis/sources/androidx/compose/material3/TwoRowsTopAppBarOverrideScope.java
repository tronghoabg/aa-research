package androidx.compose.material3;

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
public final class TwoRowsTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final q<RowScope, Composer, Integer, ab> actions;
    private final float collapsedHeight;
    private final TopAppBarColors colors;
    private final float expandedHeight;
    private final Modifier modifier;
    private final p<Composer, Integer, ab> navigationIcon;
    private final TopAppBarScrollBehavior scrollBehavior;
    private final p<Composer, Integer, ab> smallSubtitle;
    private final TextStyle smallSubtitleTextStyle;
    private final p<Composer, Integer, ab> smallTitle;
    private final TextStyle smallTitleTextStyle;
    private final p<Composer, Integer, ab> subtitle;
    private final TextStyle subtitleTextStyle;
    private final p<Composer, Integer, ab> title;
    private final float titleBottomPadding;
    private final Alignment.Horizontal titleHorizontalAlignment;
    private final TextStyle titleTextStyle;
    private final WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private TwoRowsTopAppBarOverrideScope(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, TextStyle textStyle, float f2, p<? super Composer, ? super Integer, ab> pVar2, TextStyle textStyle2, p<? super Composer, ? super Integer, ab> pVar3, TextStyle textStyle3, p<? super Composer, ? super Integer, ab> pVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, p<? super Composer, ? super Integer, ab> pVar5, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar, float f3, float f4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = pVar;
        this.titleTextStyle = textStyle;
        this.titleBottomPadding = f2;
        this.smallTitle = pVar2;
        this.smallTitleTextStyle = textStyle2;
        this.subtitle = pVar3;
        this.subtitleTextStyle = textStyle3;
        this.smallSubtitle = pVar4;
        this.smallSubtitleTextStyle = textStyle4;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = pVar5;
        this.actions = qVar;
        this.collapsedHeight = f3;
        this.expandedHeight = f4;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public final q<RowScope, Composer, Integer, ab> getActions() {
        return this.actions;
    }

    /* renamed from: getCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6097getCollapsedHeightD9Ej5fM() {
        return this.collapsedHeight;
    }

    public final TopAppBarColors getColors() {
        return this.colors;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m6098getExpandedHeightD9Ej5fM() {
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

    public final p<Composer, Integer, ab> getSmallSubtitle() {
        return this.smallSubtitle;
    }

    public final TextStyle getSmallSubtitleTextStyle() {
        return this.smallSubtitleTextStyle;
    }

    public final p<Composer, Integer, ab> getSmallTitle() {
        return this.smallTitle;
    }

    public final TextStyle getSmallTitleTextStyle() {
        return this.smallTitleTextStyle;
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

    /* renamed from: getTitleBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float m6099getTitleBottomPaddingD9Ej5fM() {
        return this.titleBottomPadding;
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

    public /* synthetic */ TwoRowsTopAppBarOverrideScope(Modifier modifier, p pVar, TextStyle textStyle, float f2, p pVar2, TextStyle textStyle2, p pVar3, TextStyle textStyle3, p pVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, p pVar5, q qVar, float f3, float f4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, o oVar) {
        this(modifier, pVar, textStyle, f2, pVar2, textStyle2, pVar3, textStyle3, pVar4, textStyle4, horizontal, pVar5, qVar, f3, f4, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }
}
