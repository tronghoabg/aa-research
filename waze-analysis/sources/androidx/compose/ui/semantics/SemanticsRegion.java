package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SemanticsRegion {
    boolean difference(IntRect intRect);

    IntRect getBounds();

    boolean intersect(SemanticsRegion semanticsRegion);

    boolean isEmpty();

    void set(IntRect intRect);
}
