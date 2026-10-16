package androidx.media3.muxer;

import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentedMp4Muxer implements Muxer {
    public static final long DEFAULT_FRAGMENT_DURATION_MS = 2000;
    private final FragmentedMp4Writer fragmentedMp4Writer;
    private final MetadataCollector metadataCollector;
    private final SparseArray<Track> trackIdToTrack;
    public static final bn<String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = bn.A();
    public static final bn<String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = bn.v("audio/mp4a-latm", MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB, MimeTypes.AUDIO_IAMF, MimeTypes.AUDIO_OPUS, MimeTypes.AUDIO_VORBIS, MimeTypes.AUDIO_RAW);

    private FragmentedMp4Muxer(WritableByteChannel writableByteChannel, long j2, boolean z) {
        MetadataCollector metadataCollector = new MetadataCollector();
        this.metadataCollector = metadataCollector;
        this.fragmentedMp4Writer = new FragmentedMp4Writer(writableByteChannel, metadataCollector, AnnexBToAvccConverter.DEFAULT, j2, z);
        this.trackIdToTrack = new SparseArray<>();
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        an.m(MuxerUtil.isMetadataSupported(entry), "Unsupported metadata");
        this.metadataCollector.addMetadata(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) {
        Track trackAddTrack = this.fragmentedMp4Writer.addTrack(1, format);
        this.trackIdToTrack.append(trackAddTrack.id, trackAddTrack);
        return trackAddTrack.id;
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        try {
            this.fragmentedMp4Writer.close();
        } catch (IOException e2) {
            throw new MuxerException("Failed to close the muxer", e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        try {
            this.fragmentedMp4Writer.writeSampleData(this.trackIdToTrack.get(i2), byteBuffer, bufferInfo);
        } catch (IOException e2) {
            throw new MuxerException(a.a(bufferInfo), e2);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private long fragmentDurationMs;
        private final WritableByteChannel outputChannel;
        private boolean sampleCopyEnabled;

        public Builder(WritableByteChannel writableByteChannel) {
            this.outputChannel = writableByteChannel;
            this.fragmentDurationMs = 2000L;
            this.sampleCopyEnabled = true;
        }

        public FragmentedMp4Muxer build() {
            return new FragmentedMp4Muxer(this.outputChannel, this.fragmentDurationMs, this.sampleCopyEnabled);
        }

        public Builder setFragmentDurationMs(long j2) {
            this.fragmentDurationMs = j2;
            return this;
        }

        public Builder setSampleCopyingEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }

        @Deprecated
        public Builder(OutputStream outputStream) {
            this(Channels.newChannel(outputStream));
        }
    }
}
