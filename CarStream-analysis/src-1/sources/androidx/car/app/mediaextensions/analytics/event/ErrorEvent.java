package androidx.car.app.mediaextensions.analytics.event;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ErrorEvent extends AnalyticsEvent {
    public static final int ERROR_CODE_INVALID_BUNDLE = 1;
    public static final int ERROR_CODE_INVALID_EVENT = 2;
    public static final int ERROR_CODE_INVALID_EXTRAS = 0;
    private int mErrorCode;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public ErrorEvent(Bundle bundle, int i) {
        super(bundle, 5);
        this.mErrorCode = i;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // androidx.car.app.mediaextensions.analytics.event.AnalyticsEvent
    public String toString() {
        return "ErrorEvent{mErrorCode=" + this.mErrorCode + '}';
    }
}
