package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AppBarWithSearchColors {
    public static final int $stable = 0;
    private final long appBarActionIconColor;
    private final long appBarContainerColor;
    private final long appBarNavigationIconColor;
    private final long scrolledAppBarContainerColor;
    private final long scrolledSearchBarContainerColor;
    private final SearchBarColors searchBarColors;

    private AppBarWithSearchColors(SearchBarColors searchBarColors, long j2, long j3, long j4) {
        this(searchBarColors, Color.Companion.m8264getUnspecified0d7_KjU(), j2, Color.Companion.m8264getUnspecified0d7_KjU(), j3, j4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBarWithSearchColors)) {
            return false;
        }
        AppBarWithSearchColors appBarWithSearchColors = (AppBarWithSearchColors) obj;
        return x.n(this.searchBarColors, appBarWithSearchColors.searchBarColors) && Color.m8229equalsimpl0(this.scrolledSearchBarContainerColor, appBarWithSearchColors.scrolledSearchBarContainerColor) && Color.m8229equalsimpl0(this.appBarContainerColor, appBarWithSearchColors.appBarContainerColor) && Color.m8229equalsimpl0(this.scrolledAppBarContainerColor, appBarWithSearchColors.scrolledAppBarContainerColor) && Color.m8229equalsimpl0(this.appBarNavigationIconColor, appBarWithSearchColors.appBarNavigationIconColor) && Color.m8229equalsimpl0(this.appBarActionIconColor, appBarWithSearchColors.appBarActionIconColor);
    }

    /* renamed from: getAppBarActionIconColor-0d7_KjU, reason: not valid java name */
    public final long m4368getAppBarActionIconColor0d7_KjU() {
        return this.appBarActionIconColor;
    }

    /* renamed from: getAppBarContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4369getAppBarContainerColor0d7_KjU() {
        return this.appBarContainerColor;
    }

    /* renamed from: getAppBarNavigationIconColor-0d7_KjU, reason: not valid java name */
    public final long m4370getAppBarNavigationIconColor0d7_KjU() {
        return this.appBarNavigationIconColor;
    }

    /* renamed from: getScrolledAppBarContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4371getScrolledAppBarContainerColor0d7_KjU() {
        return this.scrolledAppBarContainerColor;
    }

    /* renamed from: getScrolledSearchBarContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4372getScrolledSearchBarContainerColor0d7_KjU() {
        return this.scrolledSearchBarContainerColor;
    }

    public final SearchBarColors getSearchBarColors() {
        return this.searchBarColors;
    }

    public int hashCode() {
        int iHashCode = this.searchBarColors.hashCode() * 31;
        long j2 = this.appBarActionIconColor;
        long j3 = this.appBarNavigationIconColor;
        long j4 = this.scrolledAppBarContainerColor;
        return ((((((((iHashCode + Color.m8235hashCodeimpl(this.scrolledSearchBarContainerColor)) * 31) + Color.m8235hashCodeimpl(this.appBarContainerColor)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ AppBarWithSearchColors(SearchBarColors searchBarColors, long j2, long j3, long j4, long j5, long j6, o oVar) {
        this(searchBarColors, j2, j3, j4, j5, j6);
    }

    public /* synthetic */ AppBarWithSearchColors(SearchBarColors searchBarColors, long j2, long j3, long j4, o oVar) {
        this(searchBarColors, j2, j3, j4);
    }

    private AppBarWithSearchColors(SearchBarColors searchBarColors, long j2, long j3, long j4, long j5, long j6) {
        this.searchBarColors = searchBarColors;
        this.scrolledSearchBarContainerColor = j2;
        this.appBarContainerColor = j3;
        this.scrolledAppBarContainerColor = j4;
        this.appBarNavigationIconColor = j5;
        this.appBarActionIconColor = j6;
    }
}
