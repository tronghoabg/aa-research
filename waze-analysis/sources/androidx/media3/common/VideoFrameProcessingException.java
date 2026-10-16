package androidx.media3.common;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str, long j2) {
        super(String.valueOf(str).concat(getPresentationTimeUsString(j2)));
        this.presentationTimeUs = j2;
    }

    public static VideoFrameProcessingException from(Exception exc, long j2) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j2);
    }

    private static String getPresentationTimeUsString(long j2) {
        if (j2 == C.TIME_UNSET) {
            return " @UNSET";
        }
        return " @" + j2;
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j2) {
        super(String.valueOf(str).concat(getPresentationTimeUsString(j2)), th);
        this.presentationTimeUs = j2;
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th, long j2) {
        super(getPresentationTimeUsString(j2), th);
        this.presentationTimeUs = j2;
    }
}
