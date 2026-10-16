package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.c.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    Object bringChildIntoView(a<Rect> aVar, e<? super ab> eVar);

    Rect calculateRectForParent(Rect rect);
}
