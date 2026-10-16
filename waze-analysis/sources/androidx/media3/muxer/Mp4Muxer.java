package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.muxer.SeekableMuxerOutput;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Mp4Muxer implements Muxer {
    public static final int FILE_FORMAT_DEFAULT = 0;
    public static final int FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION = 1;
    public static final int LAST_SAMPLE_DURATION_BEHAVIOR_SET_FROM_END_OF_STREAM_BUFFER_OR_DUPLICATE_PREVIOUS = 1;
    public static final int LAST_SAMPLE_DURATION_BEHAVIOR_SET_TO_ZERO = 0;
    private static final String TAG = "Mp4Muxer";
    public static final int TRACK_REFERENCE_TYPE_CDSC = 1667527523;
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private final boolean attemptStreamableOutputEnabled;
    private final List<Track> auxiliaryTracks;
    private MetadataCollector auxiliaryTracksMetadataCollector;
    private Mp4Writer auxiliaryTracksMp4Writer;
    private String cacheFilePath;
    private final aj<String> cacheFileSupplier;
    private SeekableMuxerOutput cacheMuxerOutput;
    private final int freeSpaceAfterFtypInBytes;
    private final int lastSampleDurationBehavior;
    private final MetadataCollector metadataCollector;
    private final Mp4AtFileParameters mp4AtFileParameters;
    private final Mp4Writer mp4Writer;
    private final SeekableMuxerOutput muxerOutput;
    private int nextTrackId;
    private final int outputFileFormat;
    private final boolean sampleBatchingEnabled;
    private final boolean sampleCopyEnabled;
    private final List<Track> trackIdToTrack;
    public static final bn<String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = bn.A();
    public static final bn<String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = bn.v("audio/mp4a-latm", MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB, MimeTypes.AUDIO_OPUS, MimeTypes.AUDIO_VORBIS, MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_IAMF);

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FileFormat {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LastSampleDurationBehavior {
    }

    /* compiled from: WazeSource */
    public final class Mp4AtFileParameters {
        public final boolean shouldInterleaveSamples;

        public Mp4AtFileParameters(boolean z) {
            this.shouldInterleaveSamples = z;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TrackReferenceType {
    }

    private Mp4Muxer(SeekableMuxerOutput seekableMuxerOutput, aj<String> ajVar, int i2, AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z2, boolean z3, int i3, Mp4AtFileParameters mp4AtFileParameters, int i4) {
        this.muxerOutput = seekableMuxerOutput;
        this.cacheFileSupplier = ajVar;
        this.lastSampleDurationBehavior = i2;
        this.annexBToAvccConverter = annexBToAvccConverter;
        boolean z4 = false;
        if (z2 && z) {
            z4 = true;
        }
        this.sampleCopyEnabled = z4;
        this.sampleBatchingEnabled = z2;
        this.attemptStreamableOutputEnabled = z3;
        this.outputFileFormat = i3;
        this.mp4AtFileParameters = mp4AtFileParameters;
        this.freeSpaceAfterFtypInBytes = i4;
        MetadataCollector metadataCollector = new MetadataCollector();
        this.metadataCollector = metadataCollector;
        this.mp4Writer = new Mp4Writer(seekableMuxerOutput, metadataCollector, annexBToAvccConverter, i2, z, z2, z3, i4);
        this.trackIdToTrack = new ArrayList();
        this.auxiliaryTracks = new ArrayList();
    }

    private void appendAuxiliaryTracksDataToTheOutputFile() throws IOException {
        if (this.auxiliaryTracksMp4Writer == null) {
            return;
        }
        SeekableMuxerOutput seekableMuxerOutput = this.muxerOutput;
        seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
        String str = this.cacheFilePath;
        an.B(str);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
            this.muxerOutput.write(Boxes.getAxteBoxHeader(size));
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.transferTo(0L, size, this.muxerOutput);
            fileInputStream.close();
        } finally {
        }
    }

    private void ensureSetupForAuxiliaryTracks() {
        if (this.auxiliaryTracksMp4Writer == null) {
            aj<String> ajVar = this.cacheFileSupplier;
            an.B(ajVar);
            String str = ajVar.get();
            this.cacheFilePath = str;
            this.cacheMuxerOutput = SeekableMuxerOutput.CC.of(str);
            this.auxiliaryTracksMetadataCollector = new MetadataCollector();
            SeekableMuxerOutput seekableMuxerOutput = this.cacheMuxerOutput;
            MetadataCollector metadataCollector = this.auxiliaryTracksMetadataCollector;
            an.B(metadataCollector);
            this.auxiliaryTracksMp4Writer = new Mp4Writer(seekableMuxerOutput, metadataCollector, this.annexBToAvccConverter, this.lastSampleDurationBehavior, this.sampleCopyEnabled, this.sampleBatchingEnabled, this.attemptStreamableOutputEnabled, this.freeSpaceAfterFtypInBytes);
        }
    }

    private void finishWritingAuxiliaryTracks() {
        if (this.auxiliaryTracksMp4Writer == null) {
            return;
        }
        MetadataCollector metadataCollector = this.auxiliaryTracksMetadataCollector;
        an.B(metadataCollector);
        MetadataCollector metadataCollector2 = this.metadataCollector;
        MuxerUtil.populateAuxiliaryTracksMetadata(metadataCollector, metadataCollector2.timestampData, false, this.auxiliaryTracks);
        Mp4Writer mp4Writer = this.auxiliaryTracksMp4Writer;
        an.B(mp4Writer);
        mp4Writer.finishWritingSamplesAndFinalizeMoovBox();
    }

    private void finishWritingPrimaryVideoTracks() {
        MdtaMetadataEntry auxiliaryTracksOffsetMetadata = MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
        if (this.auxiliaryTracksMp4Writer != null) {
            SeekableMuxerOutput seekableMuxerOutput = this.cacheMuxerOutput;
            an.B(seekableMuxerOutput);
            this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksLengthMetadata(seekableMuxerOutput.getSize() + 16));
            this.metadataCollector.addMetadata(auxiliaryTracksOffsetMetadata);
        }
        this.mp4Writer.finishWritingSamplesAndFinalizeMoovBox();
        if (this.auxiliaryTracksMp4Writer != null) {
            SeekableMuxerOutput seekableMuxerOutput2 = this.muxerOutput;
            MetadataCollector metadataCollector = this.metadataCollector;
            long size = seekableMuxerOutput2.getSize();
            metadataCollector.removeMdtaMetadataEntry(auxiliaryTracksOffsetMetadata);
            this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksOffsetMetadata(size));
            this.mp4Writer.finalizeMoovBox();
            an.v(this.muxerOutput.getSize() == size, "The auxiliary tracks offset should remain the same");
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        an.m(MuxerUtil.isMetadataSupported(entry), "Unsupported metadata");
        this.metadataCollector.addMetadata(entry);
    }

    public int addTrack(int i2, Format format) throws MuxerException {
        Track trackAddTrack;
        if (this.outputFileFormat == 1 && MuxerUtil.isAuxiliaryTrack(format)) {
            Mp4AtFileParameters mp4AtFileParameters = this.mp4AtFileParameters;
            an.B(mp4AtFileParameters);
            if (mp4AtFileParameters.shouldInterleaveSamples) {
                Mp4Writer mp4Writer = this.mp4Writer;
                int i3 = this.nextTrackId;
                this.nextTrackId = i3 + 1;
                trackAddTrack = mp4Writer.addAuxiliaryTrack(i3, i2, format);
            } else {
                try {
                    ensureSetupForAuxiliaryTracks();
                    Mp4Writer mp4Writer2 = this.auxiliaryTracksMp4Writer;
                    int i4 = this.nextTrackId;
                    this.nextTrackId = i4 + 1;
                    trackAddTrack = mp4Writer2.addTrack(i4, i2, format);
                    this.auxiliaryTracks.add(trackAddTrack);
                } catch (FileNotFoundException e2) {
                    throw new MuxerException("Cache file not found", e2);
                }
            }
        } else {
            Mp4Writer mp4Writer3 = this.mp4Writer;
            int i5 = this.nextTrackId;
            this.nextTrackId = i5 + 1;
            trackAddTrack = mp4Writer3.addTrack(i5, i2, format);
        }
        this.trackIdToTrack.add(trackAddTrack);
        return trackAddTrack.id;
    }

    public void addTrackReference(int i2, int i3, List<Integer> list) {
        an.A(i2, this.trackIdToTrack.size());
        an.l(i3 == 1667527523);
        for (int i4 = 0; i4 < list.size(); i4++) {
            an.A(list.get(i4).intValue(), this.trackIdToTrack.size());
        }
        this.trackIdToTrack.get(i2).addTrackReference(i3, bn.n(list));
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        MuxerException muxerException;
        try {
            finishWritingAuxiliaryTracks();
            finishWritingPrimaryVideoTracks();
            appendAuxiliaryTracksDataToTheOutputFile();
            muxerException = null;
        } catch (IOException e2) {
            muxerException = new MuxerException("Failed to finish writing data", e2);
        }
        try {
            this.muxerOutput.close();
        } catch (IOException e3) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e3);
            } else {
                Log.e(TAG, "Failed to close output stream", e3);
            }
        }
        SeekableMuxerOutput seekableMuxerOutput = this.cacheMuxerOutput;
        if (seekableMuxerOutput != null) {
            try {
                seekableMuxerOutput.close();
            } catch (IOException e4) {
                if (muxerException == null) {
                    muxerException = new MuxerException("Failed to close the cache file output stream", e4);
                } else {
                    Log.e(TAG, "Failed to close cache file output stream", e4);
                }
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        an.m(i2 < this.trackIdToTrack.size(), "Track id is invalid");
        an.B(byteBuffer);
        an.B(bufferInfo);
        an.l(byteBuffer.remaining() == bufferInfo.size);
        Track track = this.trackIdToTrack.get(i2);
        try {
            if (!this.auxiliaryTracks.contains(track)) {
                this.mp4Writer.writeSampleData(track, byteBuffer, bufferInfo);
                return;
            }
            Mp4Writer mp4Writer = this.auxiliaryTracksMp4Writer;
            an.B(mp4Writer);
            mp4Writer.writeSampleData(track, byteBuffer, bufferInfo);
        } catch (IOException e2) {
            throw new MuxerException(a.a(bufferInfo), e2);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private AnnexBToAvccConverter annexBToAvccConverter;
        private boolean attemptStreamableOutputEnabled;
        private aj<String> cacheFileSupplier;
        private int freeSpaceAfterFtypInBytes;
        private int lastSampleDurationBehavior;
        private Mp4AtFileParameters mp4AtFileParameters;
        private int outputFileFormat;
        private boolean sampleBatchingEnabled;
        private boolean sampleCopyEnabled;
        private final SeekableMuxerOutput seekableMuxerOutput;

        public Builder(SeekableMuxerOutput seekableMuxerOutput) {
            this.seekableMuxerOutput = seekableMuxerOutput;
            this.lastSampleDurationBehavior = 1;
            this.attemptStreamableOutputEnabled = true;
            this.outputFileFormat = 0;
        }

        public Mp4Muxer build() {
            boolean z = true;
            if (this.outputFileFormat == 1) {
                an.m(this.mp4AtFileParameters != null, "Mp4AtFileParameters must be set for FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION");
                if (!this.mp4AtFileParameters.shouldInterleaveSamples && this.cacheFileSupplier == null) {
                    z = false;
                }
                an.m(z, "CacheFileSupplier must be set when Mp4AtFileParameters.shouldInterleaveSamples is set to false");
            }
            SeekableMuxerOutput seekableMuxerOutput = this.seekableMuxerOutput;
            aj<String> ajVar = this.cacheFileSupplier;
            int i2 = this.lastSampleDurationBehavior;
            AnnexBToAvccConverter annexBToAvccConverter = this.annexBToAvccConverter;
            if (annexBToAvccConverter == null) {
                annexBToAvccConverter = AnnexBToAvccConverter.DEFAULT;
            }
            return new Mp4Muxer(seekableMuxerOutput, ajVar, i2, annexBToAvccConverter, this.sampleCopyEnabled, this.sampleBatchingEnabled, this.attemptStreamableOutputEnabled, this.outputFileFormat, this.mp4AtFileParameters, this.freeSpaceAfterFtypInBytes);
        }

        public Builder experimentalSetFreeSpaceAfterFileTypeBox(int i2) {
            an.l(i2 >= 0);
            this.freeSpaceAfterFtypInBytes = i2;
            return this;
        }

        public Builder setAnnexBToAvccConverter(AnnexBToAvccConverter annexBToAvccConverter) {
            this.annexBToAvccConverter = annexBToAvccConverter;
            return this;
        }

        public Builder setAttemptStreamableOutputEnabled(boolean z) {
            this.attemptStreamableOutputEnabled = z;
            return this;
        }

        public Builder setCacheFileSupplier(aj<String> ajVar) {
            this.cacheFileSupplier = ajVar;
            return this;
        }

        public Builder setLastSampleDurationBehavior(int i2) {
            this.lastSampleDurationBehavior = i2;
            return this;
        }

        public Builder setMp4AtFileParameters(Mp4AtFileParameters mp4AtFileParameters) {
            this.mp4AtFileParameters = mp4AtFileParameters;
            return this;
        }

        public Builder setOutputFileFormat(int i2) {
            this.outputFileFormat = i2;
            return this;
        }

        public Builder setSampleBatchingEnabled(boolean z) {
            this.sampleBatchingEnabled = z;
            return this;
        }

        public Builder setSampleCopyingEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }

        @Deprecated
        public Builder(FileOutputStream fileOutputStream) {
            this(SeekableMuxerOutput.CC.of(fileOutputStream));
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) {
        return addTrack(1, format);
    }
}
