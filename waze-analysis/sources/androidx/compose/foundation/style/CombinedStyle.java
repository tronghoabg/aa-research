package androidx.compose.foundation.style;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CombinedStyle implements Style {
    public static final int $stable = 8;
    private final Style[] styles;

    public CombinedStyle(Style... styleArr) {
        this.styles = styleArr;
    }

    @Override // androidx.compose.foundation.style.Style
    public void applyStyle(StyleScope styleScope) {
        for (Style style : this.styles) {
            style.applyStyle(styleScope);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CombinedStyle)) {
            return false;
        }
        return Arrays.equals(this.styles, ((CombinedStyle) obj).styles);
    }

    public final Style[] getStyles() {
        return this.styles;
    }

    public int hashCode() {
        return Arrays.hashCode(this.styles);
    }
}
