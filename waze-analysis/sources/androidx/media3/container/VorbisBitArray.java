package androidx.media3.container;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        boolean z = false;
        if (i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0))) {
            z = true;
        }
        an.u(z);
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        int i2 = (this.data[this.byteOffset] & 255) >> this.bitOffset;
        skipBits(1);
        return 1 == (i2 & 1);
    }

    public int readBits(int i2) {
        int i3 = this.byteOffset;
        int i4 = 8 - this.bitOffset;
        int i5 = i3 + 1;
        byte[] bArr = this.data;
        int iMin = Math.min(i2, i4);
        int i6 = ((bArr[i3] & 255) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i6 |= (this.data[i5] & 255) << iMin;
            iMin += 8;
            i5++;
        }
        int i7 = i6 & ((-1) >>> (32 - i2));
        skipBits(i2);
        return i7;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i2) {
        int i3 = i2 / 8;
        this.byteOffset = i3;
        this.bitOffset = i2 - (i3 * 8);
        assertValidOffset();
    }

    public void skipBits(int i2) {
        int i3 = i2 / 8;
        int i4 = this.byteOffset + i3;
        this.byteOffset = i4;
        int i5 = this.bitOffset + (i2 - (i3 * 8));
        this.bitOffset = i5;
        if (i5 > 7) {
            this.byteOffset = i4 + 1;
            this.bitOffset = i5 - 8;
        }
        assertValidOffset();
    }
}
