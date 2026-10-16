package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ErrorEvent extends AnalyticsEvent {
    public static final int ERROR_CODE_INVALID_BUNDLE = 1;
    public static final int ERROR_CODE_INVALID_EVENT = 2;
    public static final int ERROR_CODE_INVALID_EXTRAS = 0;
    private int mErrorCode;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public ErrorEvent(Bundle bundle, int i2) {
        super(bundle, 5);
        this.mErrorCode = i2;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        return "ErrorEvent{mErrorCode=" + this.mErrorCode + '}';
    }
}
