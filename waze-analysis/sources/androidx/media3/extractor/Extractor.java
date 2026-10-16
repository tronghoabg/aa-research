package androidx.media3.extractor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Extractor {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_SEEK = 1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.Extractor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Extractor $default$getUnderlyingImplementation(Extractor extractor) {
            return extractor;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    List<SniffFailure> getSniffFailureDetails();

    Extractor getUnderlyingImplementation();

    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, PositionHolder positionHolder);

    void release();

    void seek(long j2, long j3);

    boolean sniff(ExtractorInput extractorInput);
}
