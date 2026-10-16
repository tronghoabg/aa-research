package androidx.compose.runtime;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ReusableComposition extends Composition {
    void deactivate();

    void setContentWithReuse(p<? super Composer, ? super Integer, ab> pVar);
}
