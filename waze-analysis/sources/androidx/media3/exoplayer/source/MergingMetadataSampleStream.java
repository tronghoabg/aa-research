package androidx.media3.exoplayer.source;

import android.util.LongSparseArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MergingMetadataSampleStream implements SampleStream {
    private static final int DEFAULT_MAX_NUM_REORDER_SAMPLES = 16;
    private byte[] activeMetadata;
    private final int maxCacheSize;
    private final SampleStream metadataSampleStream;
    private boolean metadataStreamEnded;
    private boolean metadataTrackInvalid;
    private final SampleStream videoSampleStream;
    private final FormatHolder metadataFormatHolder = new FormatHolder();
    private final DecoderInputBuffer metadataBuffer = new DecoderInputBuffer(1);
    private final LongSparseArray<byte[]> metadataCache = new LongSparseArray<>();
    private long lastMetadataPtsUs = C.TIME_UNSET;

    MergingMetadataSampleStream(SampleStream sampleStream, SampleStream sampleStream2, Format format) {
        this.videoSampleStream = sampleStream;
        this.metadataSampleStream = sampleStream2;
        this.maxCacheSize = getMaxCacheSize(format);
    }

    private static void attachSupplementalData(DecoderInputBuffer decoderInputBuffer, byte[] bArr) {
        decoderInputBuffer.resetSupplementalData(bArr.length);
        decoderInputBuffer.supplementalData.put(bArr);
        decoderInputBuffer.addFlag(268435456);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void evictCacheIfNeeded() {
        /*
            r2 = this;
        L0:
            android.util.LongSparseArray<byte[]> r0 = r2.metadataCache
            int r1 = r2.maxCacheSize
            int r0 = r0.size()
            if (r0 <= r1) goto L11
            android.util.LongSparseArray<byte[]> r0 = r2.metadataCache
            r1 = 0
            r0.removeAt(r1)
            goto L0
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MergingMetadataSampleStream.evictCacheIfNeeded():void");
    }

    private byte[] findActiveMetadata(long j2) {
        byte[] bArrValueAt;
        int size = this.metadataCache.size();
        while (true) {
            size--;
            if (size < 0) {
                bArrValueAt = null;
                break;
            }
            if (this.metadataCache.keyAt(size) <= j2) {
                bArrValueAt = this.metadataCache.valueAt(size);
                break;
            }
        }
        if (bArrValueAt != null) {
            this.activeMetadata = bArrValueAt;
        }
        return this.activeMetadata;
    }

    private static int getMaxCacheSize(Format format) {
        int i2 = format.maxNumReorderSamples;
        if (i2 != -1) {
            return i2 + 2;
        }
        return 18;
    }

    private void populateMetadataCache(long j2) {
        int length;
        if (this.metadataStreamEnded) {
            return;
        }
        while (true) {
            this.metadataBuffer.clear();
            int i2 = 0;
            int data = this.metadataSampleStream.readData(this.metadataFormatHolder, this.metadataBuffer, 0);
            if (data == -3) {
                return;
            }
            if (data != -5) {
                if (this.metadataBuffer.isEndOfStream()) {
                    this.metadataStreamEnded = true;
                    return;
                }
                long j3 = this.metadataBuffer.timeUs;
                long j4 = this.lastMetadataPtsUs;
                if (j4 != C.TIME_UNSET && j3 < j4) {
                    this.metadataTrackInvalid = true;
                    this.metadataCache.clear();
                    this.activeMetadata = null;
                }
                this.lastMetadataPtsUs = j3;
                DecoderInputBuffer decoderInputBuffer = this.metadataBuffer;
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                if (!this.metadataTrackInvalid && byteBuffer != null) {
                    decoderInputBuffer.flip();
                    Format format = this.metadataFormatHolder.format;
                    if (format != null) {
                        length = 0;
                        for (int i3 = 0; i3 < format.initializationData.size(); i3++) {
                            length += format.initializationData.get(i3).length;
                        }
                    } else {
                        length = 0;
                    }
                    byte[] bArr = new byte[length + byteBuffer.remaining()];
                    if (format != null) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < format.initializationData.size(); i5++) {
                            byte[] bArr2 = format.initializationData.get(i5);
                            int length2 = bArr2.length;
                            System.arraycopy(bArr2, 0, bArr, i4, length2);
                            i4 += length2;
                        }
                        i2 = i4;
                    }
                    byteBuffer.get(bArr, i2, byteBuffer.remaining());
                    this.metadataCache.put(j3, bArr);
                    evictCacheIfNeeded();
                }
                if (j3 > j2) {
                    return;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int getFlags() {
        return this.videoSampleStream.getFlags();
    }

    SampleStream getMetadataStream() {
        return this.metadataSampleStream;
    }

    SampleStream getPrimaryStream() {
        return this.videoSampleStream;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return this.videoSampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
        this.videoSampleStream.maybeThrowError();
        if (this.metadataTrackInvalid) {
            return;
        }
        this.metadataSampleStream.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        int data = this.videoSampleStream.readData(formatHolder, decoderInputBuffer, i2);
        if (data != -4) {
            return data;
        }
        if (!decoderInputBuffer.isEndOfStream() && (i2 & 4) == 0 && (i2 & 1) == 0 && !this.metadataTrackInvalid) {
            populateMetadataCache(decoderInputBuffer.timeUs);
            byte[] bArrFindActiveMetadata = findActiveMetadata(decoderInputBuffer.timeUs);
            if (bArrFindActiveMetadata == null) {
                return -4;
            }
            attachSupplementalData(decoderInputBuffer, bArrFindActiveMetadata);
        }
        return -4;
    }

    void reset() {
        this.metadataCache.clear();
        this.activeMetadata = null;
        this.lastMetadataPtsUs = C.TIME_UNSET;
        this.metadataTrackInvalid = false;
        this.metadataStreamEnded = false;
        this.metadataBuffer.clear();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j2) {
        return this.videoSampleStream.skipData(j2);
    }
}
