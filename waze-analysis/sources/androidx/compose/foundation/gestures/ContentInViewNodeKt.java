package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.IntSize;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContentInViewNodeKt {
    private static final boolean DEBUG = false;
    private static final float MinScrollThreshold = 0.5f;
    private static final String TAG = "ContentInViewModifier";
    private static final long UnspecifiedIntSize = -1;

    /* renamed from: takeOrElse-viCIZxY, reason: not valid java name */
    private static final long m2164takeOrElseviCIZxY(long j2, a<IntSize> aVar) {
        return IntSize.m11337equalsimpl0(j2, UnspecifiedIntSize) ? aVar.invoke().m11343unboximpl() : j2;
    }
}
