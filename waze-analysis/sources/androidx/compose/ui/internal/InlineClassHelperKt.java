package androidx.compose.ui.internal;

import h.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
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

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final void checkPrecondition(boolean z) {
        if (z) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final <T> T checkPreconditionNotNull(T t) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new e();
    }
}
