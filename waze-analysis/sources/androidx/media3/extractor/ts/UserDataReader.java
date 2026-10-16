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
final class UserDataReader {
    private static final int USER_DATA_START_CODE = 434;
    private final List<Format> closedCaptionFormats;
    private final String containerMimeType;
    private final TrackOutput[] outputs;
    private final ReorderingBufferQueue reorderingBufferQueue;

    public UserDataReader(List<Format> list, String str) {
        this.closedCaptionFormats = list;
        this.containerMimeType = str;
        this.outputs = new TrackOutput[list.size()];
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.ts.UserDataReader$$ExternalSyntheticLambda0
            @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
            public final void consume(long j2, ParsableByteArray parsableByteArray) {
                this.f$0.lambda$new$0(j2, parsableByteArray);
            }
        });
        this.reorderingBufferQueue = reorderingBufferQueue;
        reorderingBufferQueue.setMaxSize(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j2, ParsableByteArray parsableByteArray) {
        CeaUtil.consumeCcData(j2, parsableByteArray, this.outputs);
    }

    public void consume(long j2, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int i2 = parsableByteArray.readInt();
        int i3 = parsableByteArray.readInt();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (i2 == 434 && i3 == 1195456820 && unsignedByte == 3) {
            this.reorderingBufferQueue.add(j2, parsableByteArray);
        }
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
            Format.Builder builder = new Format.Builder();
            builder.setId(trackIdGenerator.getFormatId());
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
}
