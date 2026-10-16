package androidx.compose.ui.input.pointer;

import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.c;
import h.a.i;
import h.ab;
import h.g.a.q;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j2, long j3, float f2, float f3, List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(j2, j3, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), true, 1.0f, j3, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), false, false, 0, 0L, 0.0f, 0L, 7680, (o) null);
        List<HistoricalChange> list2 = list;
        return (list2 == null || list2.isEmpty()) ? pointerInputChange : PointerInputChange.m9594copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, DisplayStrings.DS_RANK, null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j2, long j3, float f2, float f3, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = 0;
        }
        long j4 = j3;
        float f4 = (i2 & 4) != 0 ? 0.0f : f2;
        float f5 = (i2 & 8) != 0 ? 0.0f : f3;
        if ((i2 & 16) != 0) {
            list = null;
        }
        return down(j2, j4, f4, f5, list);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m9661invokeOverAllPassesH0pRuoY(q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab> qVar, PointerEvent pointerEvent, long j2) {
        m9665invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) i.i(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j2);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m9662invokeOverAllPassesH0pRuoY$default(q qVar, PointerEvent pointerEvent, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 9223372034707292159L;
        }
        m9661invokeOverAllPassesH0pRuoY(qVar, pointerEvent, j2);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m9663invokeOverPasshUlJWOE(q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab> qVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        m9665invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) i.d(pointerEventPass), j2);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m9664invokeOverPasshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = 9223372034707292159L;
        }
        m9663invokeOverPasshUlJWOE(qVar, pointerEvent, pointerEventPass, j2);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m9665invokeOverPasseshUlJWOE(q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab> qVar, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j2) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        List<? extends PointerEventPass> list2 = list;
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.invoke(pointerEvent, list.get(i2), IntSize.m11331boximpl(j2));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m9667invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, List list, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = 9223372034707292159L;
        }
        m9665invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab>) qVar, pointerEvent, (List<? extends PointerEventPass>) list, j2);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        long jM9605getIdJ3iCeTQ = pointerInputChange.m9605getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long jM9608getPositionF1C5BW0 = pointerInputChange.m9608getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m9608getPositionF1C5BW0() >> 32)) + f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.m9608getPositionF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f3;
        return new PointerInputChange(jM9605getIdJ3iCeTQ, uptimeMillis2, (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), true, 1.0f, uptimeMillis, jM9608getPositionF1C5BW0, pressed, false, 0, 0L, 0.0f, 0L, 7680, (o) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveBy(pointerInputChange, j2, f2, f3);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j2, float f2, float f3) {
        long jM9605getIdJ3iCeTQ = pointerInputChange.m9605getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM9605getIdJ3iCeTQ, j2, (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32), true, 1.0f, uptimeMillis, pointerInputChange.m9608getPositionF1C5BW0(), pressed, false, 0, 0L, 0.0f, 0L, 7680, (o) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return moveTo(pointerInputChange, j2, f2, f3);
    }

    public static final PointerInputChange up(PointerInputChange pointerInputChange, long j2) {
        long jM9605getIdJ3iCeTQ = pointerInputChange.m9605getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(jM9605getIdJ3iCeTQ, j2, pointerInputChange.m9608getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m9608getPositionF1C5BW0(), pressed, false, 0, 0L, 0.0f, 0L, 7680, (o) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m9668invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = 9223372034707292159L;
        }
        m9666invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab>) qVar, pointerEvent, pointerEventPassArr, j2);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m9666invokeOverPasseshUlJWOE(q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, ab> qVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j2) {
        m9665invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) c.X(pointerEventPassArr), j2);
    }
}
