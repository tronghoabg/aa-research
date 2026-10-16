package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ChunkExtractor {

    /* compiled from: WazeSource */
    public interface Factory {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Factory $default$experimentalParseSubtitlesDuringExtraction(Factory factory, boolean z) {
                return factory;
            }

            public static Factory $default$experimentalSetCodecsToParseWithinGopSampleDependencies(Factory factory, int i2) {
                return factory;
            }

            public static Format $default$getOutputTextFormat(Factory factory, Format format) {
                return format;
            }

            public static Factory $default$setSubtitleParserFactory(Factory factory, SubtitleParser.Factory factory2) {
                return factory;
            }
        }

        ChunkExtractor createProgressiveMediaExtractor(int i2, Format format, boolean z, List<Format> list, TrackOutput trackOutput, PlayerId playerId);

        Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2);

        Format getOutputTextFormat(Format format);

        Factory setSubtitleParserFactory(SubtitleParser.Factory factory);
    }

    /* compiled from: WazeSource */
    public interface TrackOutputProvider {
        TrackOutput track(int i2, int i3);
    }

    ChunkIndex getChunkIndex();

    Format[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j2, long j3);

    boolean read(ExtractorInput extractorInput);

    void release();
}
