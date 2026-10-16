package androidx.compose.foundation.gestures;

import h.g.b.o;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 8;

    public /* synthetic */ GestureCancellationException(String str, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : str);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
