package androidx.webkit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JavaScriptExecutionException extends Exception {
    public static final int ERROR_FRAME_DESTROYED = 1;
    public static final int ERROR_GENERIC = 0;
    private final int mErrorType;

    /* compiled from: WazeSource */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorType {
    }

    public JavaScriptExecutionException(int i2, String str) {
        super(str == null ? "" : str);
        this.mErrorType = i2;
    }

    public int getErrorType() {
        return this.mErrorType;
    }
}
