package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return ExtractorsFactory.CC.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return createExtractors();
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.ExtractorsFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ExtractorsFactory $default$experimentalSetCodecsToParseWithinGopSampleDependencies(ExtractorsFactory extractorsFactory, int i2) {
            return extractorsFactory;
        }

        @Deprecated
        public static ExtractorsFactory $default$experimentalSetTextTrackTranscodingEnabled(ExtractorsFactory extractorsFactory, boolean z) {
            return extractorsFactory;
        }

        public static ExtractorsFactory $default$setSubtitleParserFactory(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
            return extractorsFactory;
        }

        public static /* synthetic */ Extractor[] lambda$static$0() {
            return new Extractor[0];
        }
    }

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2);

    @Deprecated
    ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z);

    ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory);
}
