package androidx.compose.ui.text.internal;

import h.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t, a<String> aVar) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck(aVar.invoke());
        throw new e();
    }

    public static final void requirePrecondition(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final <T> T requirePreconditionNotNull(T t, a<String> aVar) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck(aVar.invoke());
        throw new e();
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }
}
