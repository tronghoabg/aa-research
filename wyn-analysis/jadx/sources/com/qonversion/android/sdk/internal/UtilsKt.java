package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"daysToMs", "", "", "getDaysToMs", "(I)J", "daysToSeconds", "getDaysToSeconds", "shouldFireFallback", "", "Lcom/qonversion/android/sdk/dto/QonversionError;", "getShouldFireFallback", "(Lcom/qonversion/android/sdk/dto/QonversionError;)Z", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {
    public static final long getDaysToMs(int i5) {
        return getDaysToSeconds(i5) * 1000;
    }

    public static final long getDaysToSeconds(int i5) {
        long j8 = 60;
        return i5 * 24 * j8 * j8;
    }

    public static final boolean getShouldFireFallback(@NotNull QonversionError qonversionError) {
        Integer httpCode$sdk_release;
        AbstractC3340k.e(qonversionError, "<this>");
        return qonversionError.getCode() == QonversionErrorCode.NetworkConnectionFailed || ((httpCode$sdk_release = qonversionError.getHttpCode$sdk_release()) != null && ExtensionsKt.isInternalServerError(httpCode$sdk_release.intValue()));
    }
}
