package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BoundsProvider {
    Rect calculateAlternativeTargetBounds(Rect rect);

    Rect getLastBoundsInSharedTransitionScope();
}
