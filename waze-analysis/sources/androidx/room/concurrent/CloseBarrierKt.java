package androidx.room.concurrent;

import h.ab;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(CloseBarrier closeBarrier, a<ab> aVar) {
        x.f(closeBarrier, "<this>");
        x.f(aVar, "action");
        if (closeBarrier.block$room_runtime()) {
            try {
                aVar.invoke();
            } finally {
                closeBarrier.unblock$room_runtime();
            }
        }
    }
}
