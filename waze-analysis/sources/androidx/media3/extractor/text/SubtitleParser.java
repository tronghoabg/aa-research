package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import com.google.d.d.bi;
import com.google.d.d.bn;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SubtitleParser {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.text.SubtitleParser$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Subtitle $default$parseToLegacySubtitle(SubtitleParser subtitleParser, byte[] bArr, int i2, int i3) {
            int i4 = bn.f7456d;
            final bi biVar = new bi();
            OutputOptions outputOptions = OutputOptions.ALL;
            Objects.requireNonNull(biVar);
            subtitleParser.parse(bArr, i2, i3, outputOptions, new Consumer() { // from class: androidx.media3.extractor.text.SubtitleParser$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    biVar.g((CuesWithTiming) obj);
                }
            });
            return new CuesWithTimingSubtitle(biVar.f());
        }

        public static void $default$reset(SubtitleParser subtitleParser) {
        }
    }

    /* compiled from: WazeSource */
    public interface Factory {
        public static final Factory UNSUPPORTED = new Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(Format format) {
                return false;
            }
        };

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    /* compiled from: WazeSource */
    public class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j2, boolean z) {
            this.startTimeUs = j2;
            this.outputAllCues = z;
        }

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j2) {
            return new OutputOptions(j2, true);
        }

        public static OutputOptions onlyCuesAfter(long j2) {
            return new OutputOptions(j2, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i2, int i3, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3);

    void reset();
}
