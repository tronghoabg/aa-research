package androidx.media3.container;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;
    private int startOffset;

    public ParsableNalUnitBitArray(byte[] bArr, int i2, int i3) {
        reset(bArr, i2, i3);
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

    private int readExpGolombCodeNum() {
        int i2 = 0;
        while (!readBit()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? readBits(i2) : 0);
    }

    private boolean shouldSkipByte(int i2) {
        int i3 = i2 - 2;
        if (this.startOffset > i3 || i2 >= this.byteLimit) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i2] == 3 && bArr[i3] == 0 && bArr[i2 + (-1)] == 0;
    }

    public void byteAlign() {
        int i2 = this.bitOffset;
        if (i2 > 0) {
            skipBits(8 - i2);
        }
    }

    public boolean canReadBits(int i2) {
        int i3 = this.byteOffset;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.bitOffset + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 > this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.byteLimit;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i2 = this.byteOffset;
        int i3 = this.bitOffset;
        int i4 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i4++;
        }
        int i5 = this.byteOffset;
        int i6 = this.byteLimit;
        this.byteOffset = i2;
        this.bitOffset = i3;
        return i5 != i6 && canReadBits((i4 + i4) + 1);
    }

    public boolean readBit() {
        int i2 = this.data[this.byteOffset] & (128 >> this.bitOffset);
        skipBit();
        return i2 != 0;
    }

    public int readBits(int i2) {
        int i3;
        this.bitOffset += i2;
        int i4 = 0;
        while (true) {
            i3 = this.bitOffset;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.bitOffset = i5;
            byte[] bArr = this.data;
            int i6 = this.byteOffset;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != shouldSkipByte(i6 + 1)) {
                i = 1;
            }
            this.byteOffset = i6 + i;
        }
        byte[] bArr2 = this.data;
        int i7 = this.byteOffset;
        int i8 = i4 | ((bArr2[i7] & 255) >> (8 - i3));
        int i9 = 32 - i2;
        if (i3 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i7 + (true != shouldSkipByte(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        assertValidOffset();
        return i10;
    }

    public int readSignedExpGolombCodedInt() {
        int expGolombCodeNum = readExpGolombCodeNum();
        return (expGolombCodeNum % 2 == 0 ? -1 : 1) * ((expGolombCodeNum + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr, int i2, int i3) {
        this.data = bArr;
        this.startOffset = i2;
        this.byteOffset = i2;
        this.byteLimit = i3;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i2 = this.bitOffset + 1;
        this.bitOffset = i2;
        if (i2 == 8) {
            this.bitOffset = 0;
            int i3 = this.byteOffset;
            this.byteOffset = i3 + (true == shouldSkipByte(i3 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i2) {
        int i3 = this.byteOffset;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.byteOffset = i5;
        int i6 = this.bitOffset + (i2 - (i4 * 8));
        this.bitOffset = i6;
        if (i6 > 7) {
            this.byteOffset = i5 + 1;
            this.bitOffset = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.byteOffset) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i3)) {
                this.byteOffset++;
                i3 += 2;
            }
        }
    }
}
