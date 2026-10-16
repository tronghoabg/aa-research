package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OggMuxer implements Muxer {
    private boolean isTrackAdded;
    private final OggWriter writer;

    /* compiled from: WazeSource */
    public final class Builder {
        private final WritableByteChannel outputChannel;
        private String vendorString = MediaLibraryInfo.VERSION_SLASHY;

        public Builder(WritableByteChannel writableByteChannel) {
            this.outputChannel = writableByteChannel;
        }

        public OggMuxer build() {
            return new OggMuxer(this.outputChannel, this.vendorString);
        }

        public Builder setVendorString(String str) {
            this.vendorString = str;
            return this;
        }
    }

    private OggMuxer(WritableByteChannel writableByteChannel, String str) {
        this.writer = new OggWriter(writableByteChannel, str);
    }

    private boolean isMimeTypeSupported(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) || Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_VORBIS);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) throws MuxerException {
        an.l(isMimeTypeSupported(format));
        an.u(!this.isTrackAdded);
        try {
            this.writer.setFormat(format);
            this.isTrackAdded = true;
            return 0;
        } catch (IOException e2) {
            throw new MuxerException("Failed to add track to the OggMuxer", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        try {
            this.writer.close();
        } catch (IOException e2) {
            throw new MuxerException("Failed to close the OggMuxer", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        try {
            an.u(this.isTrackAdded);
            an.l(i2 == 0);
            this.writer.writeSampleData(byteBuffer, bufferInfo);
        } catch (IOException e2) {
            throw new MuxerException(a.a(bufferInfo), e2);
        }
    }
}
