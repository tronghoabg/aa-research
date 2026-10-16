package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AacMuxer implements Muxer {
    private boolean isTrackAdded;
    private final FileOutputStream outputStream;
    private final AacWriter writer;

    public AacMuxer(FileOutputStream fileOutputStream) {
        this.outputStream = fileOutputStream;
        this.writer = new AacWriter(fileOutputStream);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        throw new UnsupportedOperationException("Writing metadata is not supported for AacMuxer.");
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) {
        an.l(Objects.equals(format.sampleMimeType, "audio/mp4a-latm"));
        an.m(!this.isTrackAdded, "Only one track is supported.");
        this.writer.setFormat(format);
        this.isTrackAdded = true;
        return 0;
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException, IOException {
        try {
            this.outputStream.close();
        } catch (IOException e2) {
            throw new MuxerException("Failed to close the muxer", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        try {
            an.m(this.isTrackAdded, "Track must be added before writing samples.");
            an.m(i2 == 0, "This track has not been added to the muxer.");
            this.writer.writeSampleData(byteBuffer, bufferInfo);
        } catch (IOException e2) {
            throw new MuxerException(a.a(bufferInfo), e2);
        }
    }
}
