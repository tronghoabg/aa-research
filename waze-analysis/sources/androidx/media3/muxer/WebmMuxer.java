package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WebmMuxer implements Muxer {
    private int nextTrackId;
    private final SeekableMuxerOutput seekableMuxerOutput;
    private final List<Track> trackIdToTrack;
    private final WebmWriter writer;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean sampleCopyEnabled = true;
        private final SeekableMuxerOutput seekableMuxerOutput;

        public Builder(SeekableMuxerOutput seekableMuxerOutput) {
            this.seekableMuxerOutput = seekableMuxerOutput;
        }

        public WebmMuxer build() {
            return new WebmMuxer(this.seekableMuxerOutput, this.sampleCopyEnabled);
        }

        public Builder setSampleCopyEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }
    }

    private WebmMuxer(SeekableMuxerOutput seekableMuxerOutput, boolean z) {
        this.seekableMuxerOutput = seekableMuxerOutput;
        this.trackIdToTrack = new ArrayList();
        this.writer = new WebmWriter(seekableMuxerOutput, z);
    }

    private boolean isMimeTypeSupported(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_VP9) || Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_VP8) || Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) || Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_VORBIS);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) {
        an.l(isMimeTypeSupported(format));
        int i2 = this.nextTrackId;
        this.nextTrackId = i2 + 1;
        Track trackAddTrack = this.writer.addTrack(i2, format);
        this.trackIdToTrack.add(trackAddTrack);
        return trackAddTrack.id;
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        try {
            this.writer.close();
            try {
                this.seekableMuxerOutput.close();
            } catch (IOException e2) {
                throw new MuxerException("Failed to close the output.", e2);
            }
        } catch (IOException e3) {
            throw new MuxerException("Failed to close the writer.", e3);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        try {
            this.writer.writeSampleData(this.trackIdToTrack.get(i2), byteBuffer, bufferInfo);
        } catch (IOException e2) {
            throw new MuxerException(a.a(bufferInfo), e2);
        }
    }
}
