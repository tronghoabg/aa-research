package androidx.datastore.core;

import h.g.b.o;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CorruptionException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th) {
        super(str, th);
        x.f(str, "message");
    }

    public /* synthetic */ CorruptionException(String str, Throwable th, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : th);
    }
}
