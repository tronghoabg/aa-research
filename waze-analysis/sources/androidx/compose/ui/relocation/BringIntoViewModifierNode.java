package androidx.compose.ui.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import h.ab;
import h.c.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BringIntoViewModifierNode extends DelegatableNode {
    Object bringIntoView(LayoutCoordinates layoutCoordinates, a<Rect> aVar, e<? super ab> eVar);
}
