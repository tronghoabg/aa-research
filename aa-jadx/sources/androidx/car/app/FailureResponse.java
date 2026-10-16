package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class FailureResponse {
    public static final int BUNDLER_EXCEPTION = 1;
    public static final int ILLEGAL_STATE_EXCEPTION = 2;
    public static final int INVALID_PARAMETER_EXCEPTION = 3;
    public static final int REMOTE_EXCEPTION = 6;
    public static final int RUNTIME_EXCEPTION = 5;
    public static final int SECURITY_EXCEPTION = 4;
    public static final int UNKNOWN_ERROR = 0;
    private final int mErrorType;
    private final java.lang.String mStackTrace;

    public FailureResponse(java.lang.Throwable th) {
        th.getClass();
        this.mStackTrace = android.util.Log.getStackTraceString(th);
        this.mErrorType = th instanceof defpackage.xy ? 1 : th instanceof java.lang.IllegalStateException ? 2 : th instanceof java.security.InvalidParameterException ? 3 : th instanceof java.lang.SecurityException ? 4 : th instanceof java.lang.RuntimeException ? 5 : th instanceof android.os.RemoteException ? 6 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.car.app.FailureResponse)) {
            return false;
        }
        androidx.car.app.FailureResponse failureResponse = (androidx.car.app.FailureResponse) obj;
        return this.mErrorType == failureResponse.mErrorType && j$.util.Objects.equals(this.mStackTrace, failureResponse.mStackTrace);
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public java.lang.String getStackTrace() {
        java.lang.String str = this.mStackTrace;
        str.getClass();
        return str;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mErrorType), this.mStackTrace);
    }

    private FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
