package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.b.w;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.fo;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private Extractor extractor;
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public String getUnderlyingImplementationName() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            return extractor.getUnderlyingImplementation().getClass().getSimpleName();
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j2, long j3, ExtractorOutput extractorOutput) throws IOException {
        Extractor extractor;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j2, j3);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        int length = extractorArrCreateExtractors.length;
        bi biVarC = bn.c(length);
        if (length == 1) {
            extractor = extractorArrCreateExtractors[0];
            this.extractor = extractor;
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Extractor extractor2 = extractorArrCreateExtractors[i2];
                try {
                } catch (EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j2) {
                    }
                } catch (Throwable th) {
                    an.u(this.extractor != null || defaultExtractorInput.getPosition() == j2);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                if (extractor2.sniff(defaultExtractorInput)) {
                    this.extractor = extractor2;
                    an.u(extractor2 != null || defaultExtractorInput.getPosition() == j2);
                    defaultExtractorInput.resetPeekPosition();
                } else {
                    biVarC.i(extractor2.getSniffFailureDetails());
                    boolean z = this.extractor != null || defaultExtractorInput.getPosition() == j2;
                    an.u(z);
                    defaultExtractorInput.resetPeekPosition();
                    i2++;
                }
            }
            Extractor extractor3 = this.extractor;
            if (extractor3 == null) {
                String str = "None of the available extractors (" + w.b(", ").d(fo.G(bn.o(extractorArrCreateExtractors), new t() { // from class: androidx.media3.exoplayer.source.BundledExtractorsAdapter$$ExternalSyntheticLambda0
                    @Override // com.google.d.b.t
                    public final Object apply(Object obj) {
                        return ((Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
                    }
                })) + ") could read the stream.";
                an.B(uri);
                throw new UnrecognizedInputFormatException(str, uri, biVarC.f());
            }
            extractor = extractor3;
        }
        extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) {
        Extractor extractor = this.extractor;
        an.B(extractor);
        ExtractorInput extractorInput = this.extractorInput;
        an.B(extractorInput);
        return extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j2, long j3) {
        Extractor extractor = this.extractor;
        an.B(extractor);
        extractor.seek(j2, j3);
    }
}
