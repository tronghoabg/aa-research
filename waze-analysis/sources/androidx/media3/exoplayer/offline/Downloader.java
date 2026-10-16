package androidx.media3.exoplayer.offline;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Downloader {

    /* compiled from: WazeSource */
    public interface ProgressListener {
        void onProgress(long j2, long j3, float f2);
    }

    void cancel();

    void download(ProgressListener progressListener);

    void remove();
}
