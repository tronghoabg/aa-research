package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;
    private final TextFieldColors inputFieldColors;

    private SearchBarColors(long j2, long j3) {
        this(j2, j3, SearchBarKt.UnspecifiedTextFieldColors, null);
    }

    /* renamed from: copy-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ SearchBarColors m5438copyjxsXWHM$default(SearchBarColors searchBarColors, long j2, long j3, TextFieldColors textFieldColors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = searchBarColors.containerColor;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = searchBarColors.dividerColor;
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            textFieldColors = searchBarColors.inputFieldColors;
        }
        return searchBarColors.m5439copyjxsXWHM(j4, j5, textFieldColors);
    }

    /* renamed from: copy-jxsXWHM, reason: not valid java name */
    public final SearchBarColors m5439copyjxsXWHM(long j2, long j3, TextFieldColors textFieldColors) {
        return new SearchBarColors(j2, j3, textFieldColors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m8229equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && x.n(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5440getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m5441getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.containerColor) * 31) + Color.m8235hashCodeimpl(this.dividerColor)) * 31) + this.inputFieldColors.hashCode();
    }

    public /* synthetic */ SearchBarColors(long j2, long j3, TextFieldColors textFieldColors, o oVar) {
        this(j2, j3, textFieldColors);
    }

    public /* synthetic */ SearchBarColors(long j2, long j3, o oVar) {
        this(j2, j3);
    }

    private SearchBarColors(long j2, long j3, TextFieldColors textFieldColors) {
        this.containerColor = j2;
        this.dividerColor = j3;
        this.inputFieldColors = textFieldColors;
    }
}
