package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final String containerMimeType;
    private final TrackOutput[] outputs;
    private final ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.ts.SeiReader$$ExternalSyntheticLambda0
        @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
        public final void consume(long j2, ParsableByteArray parsableByteArray) {
            this.f$0.lambda$new$0(j2, parsableByteArray);
        }
    });

    public SeiReader(List<Format> list, String str) {
        this.closedCaptionFormats = list;
        this.containerMimeType = str;
        this.outputs = new TrackOutput[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j2, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j2, parsableByteArray, this.outputs);
    }

    public void clear() {
        this.reorderingBufferQueue.flush();
    }

    public void consume(long j2, ParsableByteArray parsableByteArray) {
        this.reorderingBufferQueue.add(j2, parsableByteArray);
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i2 = 0; i2 < this.outputs.length; i2++) {
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i2);
            String str = format.sampleMimeType;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            an.q(z, "Invalid closed caption MIME type provided: %s", str);
            String formatId = format.id;
            if (formatId == null) {
                formatId = trackIdGenerator.getFormatId();
            }
            Format.Builder builder = new Format.Builder();
            builder.setId(formatId);
            builder.setContainerMimeType(this.containerMimeType);
            builder.setSampleMimeType(str);
            builder.setSelectionFlags(format.selectionFlags);
            builder.setLanguage(format.language);
            builder.setAccessibilityChannel(format.accessibilityChannel);
            builder.setInitializationData(format.initializationData);
            trackOutputTrack.format(builder.build());
            this.outputs[i2] = trackOutputTrack;
        }
    }

    public void flush() {
        this.reorderingBufferQueue.flush();
    }

    public void setReorderingQueueSize(int i2) {
        this.reorderingBufferQueue.setMaxSize(i2);
    }
}
