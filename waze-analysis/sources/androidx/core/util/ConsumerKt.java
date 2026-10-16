package androidx.core.util;

import a.a$$ExternalSyntheticApiModelOutline0;
import h.c.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConsumerKt {
    public static final <T> java.util.function.Consumer<T> asConsumer(e<? super T> eVar) {
        x.f(eVar, "<this>");
        return a$$ExternalSyntheticApiModelOutline0.m20m((Object) new ContinuationConsumer(eVar));
    }
}
