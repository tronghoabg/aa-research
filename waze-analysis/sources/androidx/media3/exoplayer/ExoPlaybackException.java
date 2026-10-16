package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* compiled from: WazeSource */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(String str, Throwable th, int i2, int i3, String str2, int i4, Format format, int i5, MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z) {
        boolean z2;
        super(str, th, i2, Bundle.EMPTY, j2);
        boolean z3 = false;
        if (!z) {
            z2 = true;
        } else if (i3 == 1) {
            i3 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        an.l(z2);
        if (th != null) {
            z3 = true;
        } else if (i3 == 3) {
            i3 = 3;
            z3 = true;
        }
        an.l(z3);
        this.type = i3;
        this.rendererName = str2;
        this.rendererIndex = i4;
        this.rendererFormat = format;
        this.rendererFormatSupport = i5;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z;
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, null, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i2, Format format, int i3, MediaSource.MediaPeriodId mediaPeriodId, boolean z, int i4) {
        if (format == null) {
            i3 = 4;
        }
        return new ExoPlaybackException(1, th, null, i4, str, i2, format, i3, mediaPeriodId, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i2) {
        return new ExoPlaybackException(0, iOException, i2);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i2, String str, String str2, int i3, Format format, int i4) {
        String str3;
        if (i2 == 0) {
            str3 = "Source error";
        } else if (i2 != 1) {
            str3 = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + String.valueOf(format) + ", format_supported=" + Util.getFormatSupportString(i4);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException copyWithMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        String message = getMessage();
        int i2 = Util.SDK_INT;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        int i2 = Util.SDK_INT;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        an.u(this.type == 1);
        Throwable cause = getCause();
        an.B(cause);
        return (Exception) cause;
    }

    public IOException getSourceException() {
        an.u(this.type == 0);
        Throwable cause = getCause();
        an.B(cause);
        return (IOException) cause;
    }

    public RuntimeException getUnexpectedException() {
        an.u(this.type == 2);
        Throwable cause = getCause();
        an.B(cause);
        return (RuntimeException) cause;
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i2) {
        return new ExoPlaybackException(2, runtimeException, i2);
    }

    @Deprecated
    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i2, Format format, int i3, boolean z, int i4) {
        return createForRenderer(th, str, i2, format, i3, null, z, i4);
    }

    private ExoPlaybackException(int i2, Throwable th, String str, int i3, String str2, int i4, Format format, int i5, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        this(deriveMessage(i2, str, str2, i4, format, i5), th, i3, i2, str2, i4, format, i5, mediaPeriodId, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, null, false);
    }
}
