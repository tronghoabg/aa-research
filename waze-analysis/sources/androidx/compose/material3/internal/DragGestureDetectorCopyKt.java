package androidx.compose.material3.internal;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop = 18.0f;
    private static final float mouseSlop = 0.125f;
    private static final float mouseToTouchSlopRatio = 0.0069444445f;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0125 -> B:54:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0165 -> B:51:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x018a -> B:54:0x016e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6254awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r24, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DragGestureDetectorCopyKt.m6254awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r20.invoke(r13, java.lang.Float.valueOf(r2 - (java.lang.Math.signum(r2) * r5)));
     */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object m6255awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope r16, long r17, int r19, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r20, h.g.a.l<? super androidx.compose.ui.geometry.Offset, java.lang.Float> r21, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DragGestureDetectorCopyKt.m6255awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.g.a.p, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m6256isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        return pointerInputChange2 == null || !pointerInputChange2.getPressed();
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m6257pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9687getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
