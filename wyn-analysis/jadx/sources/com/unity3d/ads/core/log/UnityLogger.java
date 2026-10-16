package com.unity3d.ads.core.log;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR$\u0010%\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/CreateFile;)V", "", "targetLogLevel", "", "canLog", "(I)Z", "", PglCryptUtils.KEY_MESSAGE, "Lef/C;", "info", "(Ljava/lang/String;)V", "debug", "", "e", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "trace", "Lkotlin/Function0;", "fb", "(Ltf/a;)V", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "_userLogLevel", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "_fileLogLevel", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "logLevel", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnityLogger implements Logger {

    @NotNull
    private static final String LOG_TAG = "UnityAds";

    @Nullable
    private LogLevelInternal _fileLogLevel;

    @NotNull
    private LogLevelInternal _userLogLevel;

    @NotNull
    private final SessionRepository sessionRepository;

    public UnityLogger(@NotNull SessionRepository sessionRepository, @NotNull CreateFile createFile) {
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(createFile, "createFile");
        this.sessionRepository = sessionRepository;
        this._userLogLevel = LogLevelInternal.INFO;
        try {
            if (createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
                this._fileLogLevel = LogLevelInternal.TRACE;
                debug("Unity logger initialized in TRACE mode");
            }
        } catch (Throwable unused) {
            Log.w(LOG_TAG, "An issue occurred reading: /data/local/tmp/UnityAdsForceDebugMode");
        }
    }

    private final boolean canLog(int targetLogLevel) {
        return targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        if (canLog(3)) {
            Log.d(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String message, @Nullable Throwable e7) {
        AbstractC3340k.e(message, "message");
        if (canLog(6)) {
            Log.e(LOG_TAG, message, e7);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevelInternal getLogLevel() {
        if (this.sessionRepository.isNativeConfigReady() && this.sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing()) {
            return LogLevelInternal.TRACE;
        }
        LogLevelInternal logLevelInternal = this._fileLogLevel;
        return logLevelInternal == null ? this._userLogLevel : logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        if (canLog(4)) {
            Log.i(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevelInternal value) {
        AbstractC3340k.e(value, "value");
        this._userLogLevel = value;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String message, @Nullable Throwable e7) {
        AbstractC3340k.e(message, "message");
        if (canLog(2)) {
            Log.v(LOG_TAG, message, e7);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull a fb2) {
        AbstractC3340k.e(fb2, "fb");
        if (canLog(3)) {
            debug((String) fb2.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull a fb2) {
        AbstractC3340k.e(fb2, "fb");
        if (canLog(2)) {
            Log.v(LOG_TAG, (String) fb2.invoke());
        }
    }
}
