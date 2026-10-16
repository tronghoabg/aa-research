package androidx.compose.runtime;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Composition {
    void dispose();

    boolean getHasInvalidations();

    boolean isDisposed();

    void setContent(p<? super Composer, ? super Integer, ab> pVar);
}
