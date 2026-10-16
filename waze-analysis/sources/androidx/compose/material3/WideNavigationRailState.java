package androidx.compose.material3;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface WideNavigationRailState {
    Object collapse(e<? super ab> eVar);

    Object expand(e<? super ab> eVar);

    WideNavigationRailValue getCurrentValue();

    WideNavigationRailValue getTargetValue();

    boolean isAnimating();

    Object snapTo(WideNavigationRailValue wideNavigationRailValue, e<? super ab> eVar);

    Object toggle(e<? super ab> eVar);
}
