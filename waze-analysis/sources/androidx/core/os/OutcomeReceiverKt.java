package androidx.core.os;

import android.os.OutcomeReceiver;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import h.c.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(e<? super R> eVar) {
        x.f(eVar, "<this>");
        return bi$$ExternalSyntheticApiModelOutline0.m128m((Object) new ContinuationOutcomeReceiver(eVar));
    }
}
