package androidx.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexProvider;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {

    @Deprecated
    public static final Factory FACTORY = new Factory();
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs;
    private long endTimeUs;
    private final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final ManifestFormatMerger primaryTrackManifestFormatInfoMerger;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    /* compiled from: WazeSource */
    public interface ManifestFormatMerger {
        public static final ManifestFormatMerger DEFAULT = new ManifestFormatMerger() { // from class: androidx.media3.exoplayer.source.chunk.BundledChunkExtractor$ManifestFormatMerger$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger
            public final Format merge(Format format, Format format2) {
                return BundledChunkExtractor.ManifestFormatMerger.CC.lambda$static$0(format, format2);
            }
        };

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.chunk.BundledChunkExtractor$ManifestFormatMerger$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* synthetic */ Format lambda$static$0(Format format, Format format2) {
                return format2 != null ? format.withManifestFormatInfo(format2) : format;
            }
        }

        Format merge(Format format, Format format2);
    }

    public BundledChunkExtractor(Extractor extractor, int i2, Format format, ManifestFormatMerger manifestFormatMerger) {
        this.extractor = extractor;
        this.primaryTrackType = i2;
        this.primaryTrackManifestFormat = format;
        this.bindingTrackOutputs = new SparseArray<>();
        this.primaryTrackManifestFormatInfoMerger = manifestFormatMerger;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i2 = 0; i2 < this.bindingTrackOutputs.size(); i2++) {
            Format format = this.bindingTrackOutputs.valueAt(i2).sampleFormat;
            an.B(format);
            formatArr[i2] = format;
        }
        this.sampleFormats = formatArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.seekMap;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        if (seekMap instanceof ChunkIndexProvider) {
            return ((ChunkIndexProvider) seekMap).getChunkIndex();
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2, long j3) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j3;
        boolean z = this.extractorInitialized;
        Extractor extractor = this.extractor;
        if (!z) {
            extractor.init(this);
            if (j2 != C.TIME_UNSET) {
                this.extractor.seek(0L, j2);
            }
            this.extractorInitialized = true;
            return;
        }
        if (j2 == C.TIME_UNSET) {
            j2 = 0;
        }
        extractor.seek(0L, j2);
        for (int i2 = 0; i2 < this.bindingTrackOutputs.size(); i2++) {
            this.bindingTrackOutputs.valueAt(i2).bind(trackOutputProvider, j3);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) {
        int i2 = this.extractor.read(extractorInput, POSITION_HOLDER);
        an.u(i2 != 1);
        return i2 == 0;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i2);
        if (bindingTrackOutput != null) {
            return bindingTrackOutput;
        }
        an.u(this.sampleFormats == null);
        BindingTrackOutput bindingTrackOutput2 = new BindingTrackOutput(i2, i3, i3 == this.primaryTrackType ? this.primaryTrackManifestFormat : null, this.primaryTrackManifestFormatInfoMerger);
        bindingTrackOutput2.bind(this.trackOutputProvider, this.endTimeUs);
        this.bindingTrackOutputs.put(i2, bindingTrackOutput2);
        return bindingTrackOutput2;
    }

    /* compiled from: WazeSource */
    public final class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();
        private int codecsToParseWithinGopSampleDependencies = 3;

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public ChunkExtractor createProgressiveMediaExtractor(int i2, Format format, boolean z, List<Format> list, TrackOutput trackOutput, PlayerId playerId) {
            Extractor fragmentedMp4Extractor;
            String str = format.containerMimeType;
            if (!MimeTypes.isText(str)) {
                if (MimeTypes.isMatroska(str)) {
                    fragmentedMp4Extractor = new MatroskaExtractor(this.subtitleParserFactory, true != this.parseSubtitlesDuringExtraction ? 3 : 1);
                } else if (Objects.equals(str, MimeTypes.IMAGE_JPEG)) {
                    fragmentedMp4Extractor = new JpegExtractor(1);
                } else if (Objects.equals(str, MimeTypes.IMAGE_PNG)) {
                    fragmentedMp4Extractor = new PngExtractor();
                } else {
                    int i3 = true != z ? 0 : 4;
                    if (!this.parseSubtitlesDuringExtraction) {
                        i3 |= 32;
                    }
                    fragmentedMp4Extractor = new FragmentedMp4Extractor(this.subtitleParserFactory, i3 | FragmentedMp4Extractor.codecsToParseWithinGopSampleDependenciesAsFlags(this.codecsToParseWithinGopSampleDependencies), null, null, list, trackOutput);
                }
            } else {
                if (!this.parseSubtitlesDuringExtraction) {
                    return null;
                }
                fragmentedMp4Extractor = new SubtitleExtractor(this.subtitleParserFactory.create(format), format);
            }
            return new BundledChunkExtractor(fragmentedMp4Extractor, i2, format);
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public /* bridge */ /* synthetic */ ChunkExtractor.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public /* bridge */ /* synthetic */ ChunkExtractor.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            experimentalSetCodecsToParseWithinGopSampleDependencies(i2);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Format getOutputTextFormat(Format format) {
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
                return format;
            }
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES);
            builderBuildUpon.setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
            String str = format.sampleMimeType;
            String str2 = format.codecs;
            builderBuildUpon.setCodecs(String.valueOf(str).concat(str2 != null ? " ".concat(str2) : ""));
            builderBuildUpon.setSubsampleOffsetUs(Long.MAX_VALUE);
            return builderBuildUpon.build();
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            an.B(factory);
            this.subtitleParserFactory = factory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.parseSubtitlesDuringExtraction = z;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            this.codecsToParseWithinGopSampleDependencies = i2;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public /* bridge */ /* synthetic */ ChunkExtractor.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            setSubtitleParserFactory(factory);
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class BindingTrackOutput implements TrackOutput {
        private long endTimeUs;
        private final DiscardingTrackOutput fakeTrackOutput;
        private final int id;
        private final Format manifestFormat;
        private final ManifestFormatMerger manifestFormatMerger;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        private BindingTrackOutput(int i2, int i3, Format format, ManifestFormatMerger manifestFormatMerger) {
            this.id = i2;
            this.type = i3;
            this.manifestFormat = format;
            this.fakeTrackOutput = new DiscardingTrackOutput();
            this.manifestFormatMerger = manifestFormatMerger;
        }

        public void bind(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j2;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.id, this.type);
            this.trackOutput = trackOutputTrack;
            Format format = this.sampleFormat;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // androidx.media3.extractor.TrackOutput
        public /* synthetic */ void durationUs(long j2) {
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(Format format) {
            this.sampleFormat = this.manifestFormatMerger.merge(format, this.manifestFormat);
            TrackOutput trackOutput = this.trackOutput;
            int i2 = Util.SDK_INT;
            trackOutput.format(this.sampleFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i2, boolean z, int i3) {
            TrackOutput trackOutput = this.trackOutput;
            int i4 = Util.SDK_INT;
            return trackOutput.sampleData(dataReader, i2, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j2, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
            long j3 = this.endTimeUs;
            if (j3 != C.TIME_UNSET && j2 >= j3) {
                this.trackOutput = this.fakeTrackOutput;
            }
            TrackOutput trackOutput = this.trackOutput;
            int i5 = Util.SDK_INT;
            trackOutput.sampleMetadata(j2, i2, i3, i4, cryptoData);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
            sampleData(parsableByteArray, i2, 0);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
            return sampleData(dataReader, i2, z, 0);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
            TrackOutput trackOutput = this.trackOutput;
            int i4 = Util.SDK_INT;
            trackOutput.sampleData(parsableByteArray, i2);
        }
    }

    public BundledChunkExtractor(Extractor extractor, int i2, Format format) {
        this(extractor, i2, format, ManifestFormatMerger.DEFAULT);
    }
}
