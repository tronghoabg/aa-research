package androidx.collection.internal;

import h.g.a.a;
import h.g.b.x;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z, a<String> aVar) {
        x.f(aVar, "lazyMessage");
        if (z) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final void requirePrecondition(boolean z, a<String> aVar) {
        x.f(aVar, "lazyMessage");
        if (z) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        x.f(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        x.f(str, "message");
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        x.f(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(String str) {
        x.f(str, "message");
        throw new NoSuchElementException(str);
    }

    public static final Void throwNoSuchElementExceptionForInline(String str) {
        x.f(str, "message");
        throw new NoSuchElementException(str);
    }
}
