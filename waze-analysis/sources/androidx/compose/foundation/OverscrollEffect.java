package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo1949applyToFlingBMRW4eQ(long j2, p<? super Velocity, ? super e<? super Velocity>, ? extends Object> pVar, e<? super ab> eVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo1950applyToScrollRhakbz0(long j2, int i2, l<? super Offset, Offset> lVar);

    Modifier getEffectModifier();

    DelegatableNode getNode();

    boolean isInProgress();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.OverscrollEffect$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static DelegatableNode $default$getNode(OverscrollEffect overscrollEffect) {
            return new Modifier.Node() { // from class: androidx.compose.foundation.OverscrollEffect$node$1
            };
        }

        public static /* synthetic */ void getEffectModifier$annotations() {
        }
    }
}
