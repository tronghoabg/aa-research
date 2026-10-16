package androidx.compose.runtime;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PausableComposition extends ReusableComposition {
    PausedComposition setPausableContent(p<? super Composer, ? super Integer, ab> pVar);

    PausedComposition setPausableContentWithReuse(p<? super Composer, ? super Integer, ab> pVar);
}
