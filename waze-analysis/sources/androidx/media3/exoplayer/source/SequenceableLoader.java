package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.LoadingInfo;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SequenceableLoader {

    /* compiled from: WazeSource */
    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t);
    }

    boolean continueLoading(LoadingInfo loadingInfo);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j2);
}
