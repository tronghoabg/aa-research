package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyLayoutMeasuredItem {
    /* renamed from: getConstraints-msEJaDk */
    long mo2887getConstraintsmsEJaDk();

    int getHorizontalAxisSize();

    int getHorizontalAxisSpacing();

    int getIndex();

    Object getKey();

    int getLane();

    /* renamed from: getOffset-Bjo55l4 */
    long mo2888getOffsetBjo55l4(int i2);

    List<Placeable> getPlaceables();

    int getSpan();

    int getVerticalAxisSize();

    int getVerticalAxisSpacing();

    void makeNonScrollable();

    void position(int i2, int i3, int i4, int i5);
}
