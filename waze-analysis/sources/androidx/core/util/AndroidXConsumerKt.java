package androidx.core.util;

import h.c.e;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(e<? super T> eVar) {
        x.f(eVar, "<this>");
        return new AndroidXContinuationConsumer(eVar);
    }
}
