package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SearchBarScrollBehavior {
    float getContentOffset();

    NestedScrollConnection getNestedScrollConnection();

    float getScrollOffset();

    float getScrollOffsetLimit();

    Modifier searchBarScrollBehavior(Modifier modifier);

    void setContentOffset(float f2);

    void setScrollOffset(float f2);

    void setScrollOffsetLimit(float f2);
}
