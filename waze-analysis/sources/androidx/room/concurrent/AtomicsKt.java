package androidx.room.concurrent;

import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, l<? super Integer, ab> lVar) {
        x.f(atomicInteger, "<this>");
        x.f(lVar, "action");
        while (true) {
            lVar.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
