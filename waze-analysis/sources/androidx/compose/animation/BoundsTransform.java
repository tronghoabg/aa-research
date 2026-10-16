package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BoundsTransform {
    FiniteAnimationSpec<Rect> createAnimationSpec(Rect rect, Rect rect2);
}
