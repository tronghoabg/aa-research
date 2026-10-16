package androidx.media3.extractor;

import androidx.media3.common.DataReader;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i2);

    boolean advancePeekPosition(int i2, boolean z);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i2, int i3);

    void peekFully(byte[] bArr, int i2, int i3);

    boolean peekFully(byte[] bArr, int i2, int i3, boolean z);

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i2, int i3);

    void readFully(byte[] bArr, int i2, int i3);

    boolean readFully(byte[] bArr, int i2, int i3, boolean z);

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j2, E e2);

    int skip(int i2);

    void skipFully(int i2);

    boolean skipFully(int i2, boolean z);
}
