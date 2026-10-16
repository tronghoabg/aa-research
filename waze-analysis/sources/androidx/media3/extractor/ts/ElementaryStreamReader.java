package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ElementaryStreamReader {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.ts.ElementaryStreamReader$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$endOfInputReached(ElementaryStreamReader elementaryStreamReader) {
        }

        public static void $default$packetFinished(ElementaryStreamReader elementaryStreamReader) {
        }
    }

    void consume(ParsableByteArray parsableByteArray);

    void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void endOfInputReached();

    void packetFinished();

    void packetStarted(long j2, int i2);

    void seek();
}
