package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    /* compiled from: WazeSource */
    public final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i2, byte[] bArr, int i3, int i4) {
            this.cryptoMode = i2;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i3;
            this.clearBlocks = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.cryptoMode * 31) + Arrays.hashCode(this.encryptionKey)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void durationUs(long j2);

    void format(Format format);

    int sampleData(DataReader dataReader, int i2, boolean z);

    int sampleData(DataReader dataReader, int i2, boolean z, int i3);

    void sampleData(ParsableByteArray parsableByteArray, int i2);

    void sampleData(ParsableByteArray parsableByteArray, int i2, int i3);

    void sampleMetadata(long j2, int i2, int i3, int i4, CryptoData cryptoData);

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.extractor.TrackOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$durationUs(TrackOutput trackOutput, long j2) {
        }
    }
}
