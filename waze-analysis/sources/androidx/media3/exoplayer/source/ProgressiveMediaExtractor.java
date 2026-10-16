package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ProgressiveMediaExtractor {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.source.ProgressiveMediaExtractor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$getUnderlyingImplementationName(ProgressiveMediaExtractor progressiveMediaExtractor) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public interface Factory {
        ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    String getUnderlyingImplementationName();

    void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j2, long j3, ExtractorOutput extractorOutput);

    int read(PositionHolder positionHolder);

    void release();

    void seek(long j2, long j3);
}
