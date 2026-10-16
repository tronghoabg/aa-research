package androidx.media3.datasource;

import androidx.media3.common.util.Util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AesCipherDataSink implements DataSink {
    private AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() {
        this.cipher = null;
        this.wrappedDataSink.close();
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.position + dataSpec.uriPositionOffset);
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i2, int i3) {
        if (this.scratch == null) {
            AesFlushingCipher aesFlushingCipher = this.cipher;
            int i4 = Util.SDK_INT;
            aesFlushingCipher.updateInPlace(bArr, i2, i3);
            this.wrappedDataSink.write(bArr, i2, i3);
            return;
        }
        int i5 = 0;
        while (i5 < i3) {
            int iMin = Math.min(i3 - i5, this.scratch.length);
            AesFlushingCipher aesFlushingCipher2 = this.cipher;
            int i6 = Util.SDK_INT;
            byte[] bArr2 = bArr;
            aesFlushingCipher2.update(bArr2, i2 + i5, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i5 += iMin;
            bArr = bArr2;
        }
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }
}
