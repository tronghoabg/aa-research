package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.google.d.b.an;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WavMuxer implements Muxer {
    private boolean trackAdded;
    private final WavWriter wavWriter;

    public WavMuxer(SeekableMuxerOutput seekableMuxerOutput) {
        this.wavWriter = new WavWriter(seekableMuxerOutput);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) {
        an.u(!this.trackAdded);
        this.wavWriter.setFormat(format);
        this.trackAdded = true;
        return 0;
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        try {
            this.wavWriter.close();
        } catch (IOException e2) {
            throw new MuxerException("Failed to close the output.", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        try {
            an.l(i2 == 0);
            an.u(this.trackAdded);
            this.wavWriter.writeSampleData(byteBuffer);
        } catch (IOException e2) {
            throw new MuxerException("Failed to write sample", e2);
        }
    }
}
