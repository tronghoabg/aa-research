package androidx.media3.extractor.heif;

import android.util.Pair;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HeifExtractor implements Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private Extractor activeExtractor;
    private ExtractorOutput extractorOutput;
    private final Extractor imageExtractor;
    private Pair<Long, Long> pendingSeek;
    private final Extractor videoExtractor;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public HeifExtractor(int i2) {
        this.imageExtractor = new SingleSampleExtractor(-1, -1, MimeTypes.IMAGE_HEIF);
        this.videoExtractor = (i2 & 1) != 0 ? null : new HeicMotionPhotoExtractor();
    }

    private void assignActiveExtractor(ExtractorInput extractorInput) {
        an.u(this.activeExtractor == null);
        Extractor extractor = this.videoExtractor;
        an.B(extractor);
        this.activeExtractor = extractor.sniff(extractorInput) ? this.videoExtractor : this.imageExtractor;
        extractorInput.resetPeekPosition();
        Pair<Long, Long> pair = this.pendingSeek;
        if (pair != null) {
            this.activeExtractor.seek(((Long) pair.first).longValue(), ((Long) this.pendingSeek.second).longValue());
            this.pendingSeek = null;
        }
        Extractor extractor2 = this.activeExtractor;
        ExtractorOutput extractorOutput = this.extractorOutput;
        an.B(extractorOutput);
        extractor2.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ List getSniffFailureDetails() {
        return bn.p();
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.videoExtractor == null) {
            Extractor extractor = this.imageExtractor;
            this.activeExtractor = extractor;
            extractor.init(extractorOutput);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.activeExtractor == null) {
            assignActiveExtractor(extractorInput);
        }
        return this.activeExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        Extractor extractor = this.videoExtractor;
        if (extractor != null) {
            extractor.release();
        }
        this.imageExtractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        Extractor extractor = this.activeExtractor;
        if (extractor != null) {
            extractor.seek(j2, j3);
        } else {
            this.pendingSeek = Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        Extractor extractor = this.videoExtractor;
        if (extractor != null && extractor.sniff(extractorInput)) {
            return true;
        }
        extractorInput.resetPeekPosition();
        return HeifSniffer.sniff(extractorInput, false);
    }

    public HeifExtractor() {
        this(0);
    }
}
