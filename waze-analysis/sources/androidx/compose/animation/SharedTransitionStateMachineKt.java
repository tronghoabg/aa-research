package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import h.g.a.a;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedTransitionStateMachineKt {
    public static final boolean SharedTransitionDebug = false;

    public static final long calculateOffsetFromDirectManipulation(TargetData targetData, Rect rect) {
        return Offset.m7985plusMKHz9U(Offset.m7984minusMKHz9U(rect.m8015getTopLeftF1C5BW0(), targetData.m1845getInitialMfrOffsetF1C5BW0()), targetData.m1844getCurrentMfrOffsetF1C5BW0());
    }

    public static final Rect getTargetBounds(TargetData targetData) {
        return RectKt.m8020Recttz77jQw(Offset.m7985plusMKHz9U(targetData.m1845getInitialMfrOffsetF1C5BW0(), targetData.m1847getTargetStructuralOffsetF1C5BW0()), targetData.m1846getSizeNHjbRc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect obtainBoundsFromLastTarget(SharedElement sharedElement, BoundsProvider boundsProvider) {
        if (boundsProvider != null) {
            List<SharedElementEntry> allEntries = sharedElement.getAllEntries();
            int size = allEntries.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (x.n(allEntries.get(i2).getBoundsProvider(), boundsProvider)) {
                    return boundsProvider.getLastBoundsInSharedTransitionScope();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: updateTargetData-BGTQxF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1831updateTargetDataBGTQxF0(androidx.compose.animation.TargetData r4, long r5, long r7, long r9, boolean r11) {
        /*
            long r0 = r4.m1847getTargetStructuralOffsetF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m7977equalsimpl0(r0, r9)
            if (r0 == 0) goto L17
            long r0 = r4.m1846getSizeNHjbRc()
            boolean r0 = androidx.compose.ui.geometry.Size.m8045equalsimpl0(r0, r5)
            if (r0 == 0) goto L17
            if (r11 == 0) goto L36
            r11 = 1
        L17:
            r4.m1850setSizeuvyYCjk(r5)
            r4.m1851setTargetStructuralOffsetk4lQ0M(r9)
            if (r11 == 0) goto L36
            long r5 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r7, r9)
            long r0 = r4.m1844getCurrentMfrOffsetF1C5BW0()
            long r2 = r4.m1845getInitialMfrOffsetF1C5BW0()
            long r0 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r0, r2)
            long r5 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r5, r0)
            r4.m1849setInitialMfrOffsetk4lQ0M(r5)
        L36:
            long r5 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r7, r9)
            r4.m1848setCurrentMfrOffsetk4lQ0M(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionStateMachineKt.m1831updateTargetDataBGTQxF0(androidx.compose.animation.TargetData, long, long, long, boolean):void");
    }

    public static final void sharedTransitionDebug(a<String> aVar) {
    }
}
