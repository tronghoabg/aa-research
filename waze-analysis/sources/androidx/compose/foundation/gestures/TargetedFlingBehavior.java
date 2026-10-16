package androidx.compose.foundation.gestures;

import h.ab;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TargetedFlingBehavior$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f2, e<? super Float> eVar) {
            return targetedFlingBehavior.performFling(scrollScope, f2, TargetedFlingBehaviorKt.NoOnReport, eVar);
        }
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    Object performFling(ScrollScope scrollScope, float f2, e<? super Float> eVar);

    Object performFling(ScrollScope scrollScope, float f2, l<? super Float, ab> lVar, e<? super Float> eVar);
}
