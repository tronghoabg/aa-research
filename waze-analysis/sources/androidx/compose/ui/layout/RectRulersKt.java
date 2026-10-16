package androidx.compose.ui.layout;

import androidx.compose.ui.layout.RectRulers;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectRulersKt {
    public static final RectRulers RectRulers() {
        return new RectRulersImpl(null);
    }

    public static final RectRulers innermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new InnerRectRulers(rectRulersArr);
    }

    public static final RectRulers outermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new OuterRectRulers(rectRulersArr);
    }

    public static final RectRulers RectRulers(String str) {
        return new RectRulersImpl(str);
    }
}
