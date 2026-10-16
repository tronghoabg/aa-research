package androidx.compose.material3.pulltorefresh;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PullToRefreshState {
    Object animateToHidden(e<? super ab> eVar);

    Object animateToThreshold(e<? super ab> eVar);

    float getDistanceFraction();

    boolean isAnimating();

    Object snapTo(float f2, e<? super ab> eVar);
}
