package com.qonversion.android.sdk.internal.logger;

import N0.a;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "<init>", "()V", "", "logLevel", "", PglCryptUtils.KEY_MESSAGE, "Lef/C;", "log", "(ILjava/lang/String;)V", "format", "(Ljava/lang/String;)Ljava/lang/String;", "error", "(Ljava/lang/String;)V", "warn", "release", "debug", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConsoleLogger implements Logger {

    @NotNull
    private static final String TAG = "Qonversion";

    private final String format(String message) {
        return a.h("[Thread - ", Thread.currentThread().getName(), "] ", message);
    }

    private final void log(int logLevel, String message) {
        Log.println(logLevel, TAG, format(message));
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void debug(@NotNull String message) {
        AbstractC3340k.e(message, "message");
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void error(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        log(6, message);
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void release(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        log(4, message);
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void warn(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        log(5, message);
    }
}
