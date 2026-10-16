package com.bytedance.sdk.component.oa.uef.oa;

import R8.v;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import pd.f;

/* loaded from: classes.dex */
public final class uef implements oa, yo, Cloneable, ByteChannel {
    private static final byte[] yo = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: oa, reason: collision with root package name */
    long f25064oa;
    lw uef;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uef)) {
            return false;
        }
        uef uefVar = (uef) obj;
        long j8 = this.f25064oa;
        if (j8 != uefVar.f25064oa) {
            return false;
        }
        long j10 = 0;
        if (j8 == 0) {
            return true;
        }
        lw lwVar = this.uef;
        lw lwVar2 = uefVar.uef;
        int i5 = lwVar.f25062oa;
        int i10 = lwVar2.f25062oa;
        while (j10 < this.f25064oa) {
            long jMin = Math.min(lwVar.yo - i5, lwVar2.yo - i10);
            int i11 = 0;
            while (i11 < jMin) {
                int i12 = i5 + 1;
                int i13 = i10 + 1;
                if (lwVar.uef[i5] != lwVar2.uef[i10]) {
                    return false;
                }
                i11++;
                i5 = i12;
                i10 = i13;
            }
            if (i5 == lwVar.yo) {
                lwVar = lwVar.ivm;
                i5 = lwVar.f25062oa;
            }
            if (i10 == lwVar2.yo) {
                lwVar2 = lwVar2.ivm;
                i10 = lwVar2.f25062oa;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        lw lwVar = this.uef;
        if (lwVar == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i10 = lwVar.yo;
            for (int i11 = lwVar.f25062oa; i11 < i10; i11++) {
                i5 = (i5 * 31) + lwVar.uef[i11];
            }
            lwVar = lwVar.ivm;
        } while (lwVar != this.uef);
        return i5;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final moa lw() {
        long j8 = this.f25064oa;
        if (j8 <= 2147483647L) {
            return moa((int) j8);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f25064oa);
    }

    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public uef clone() {
        uef uefVar = new uef();
        if (this.f25064oa == 0) {
            return uefVar;
        }
        lw lwVarUef = this.uef.uef();
        uefVar.uef = lwVarUef;
        lwVarUef.xs = lwVarUef;
        lwVarUef.ivm = lwVarUef;
        lw lwVar = this.uef;
        while (true) {
            lwVar = lwVar.ivm;
            if (lwVar == this.uef) {
                uefVar.f25064oa = this.f25064oa;
                return uefVar;
            }
            uefVar.uef.xs.uef(lwVar.uef());
        }
    }

    public byte oa() {
        long j8 = this.f25064oa;
        if (j8 == 0) {
            throw new IllegalStateException("size == 0");
        }
        lw lwVar = this.uef;
        int i5 = lwVar.f25062oa;
        int i10 = lwVar.yo;
        int i11 = i5 + 1;
        byte b5 = lwVar.uef[i5];
        this.f25064oa = j8 - 1;
        if (i11 != i10) {
            lwVar.f25062oa = i11;
            return b5;
        }
        this.uef = lwVar.oa();
        ivm.uef(lwVar);
        return b5;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        lw lwVar = this.uef;
        if (lwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), lwVar.yo - lwVar.f25062oa);
        byteBuffer.put(lwVar.uef, lwVar.f25062oa, iMin);
        int i5 = lwVar.f25062oa + iMin;
        lwVar.f25062oa = i5;
        this.f25064oa -= iMin;
        if (i5 == lwVar.yo) {
            this.uef = lwVar.oa();
            ivm.uef(lwVar);
        }
        return iMin;
    }

    public String toString() {
        return lw().toString();
    }

    public boolean uef() {
        return this.f25064oa == 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i5 = iRemaining;
        while (i5 > 0) {
            lw lwVarYo = yo(1);
            int iMin = Math.min(i5, 8192 - lwVarYo.yo);
            byteBuffer.get(lwVarYo.uef, lwVarYo.yo, iMin);
            i5 -= iMin;
            lwVarYo.yo += iMin;
        }
        this.f25064oa += iRemaining;
        return iRemaining;
    }

    public String yo() {
        try {
            return uef(this.f25064oa, cz.uef);
        } catch (EOFException e7) {
            throw new AssertionError(e7);
        }
    }

    public String uef(long j8, Charset charset) throws EOFException {
        cz.uef(this.f25064oa, 0L, j8);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j8 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j8)));
        }
        if (j8 == 0) {
            return "";
        }
        lw lwVar = this.uef;
        int i5 = lwVar.f25062oa;
        if (i5 + j8 > lwVar.yo) {
            return new String(uef(j8), charset);
        }
        String str = new String(lwVar.uef, i5, (int) j8, charset);
        int i10 = (int) (lwVar.f25062oa + j8);
        lwVar.f25062oa = i10;
        this.f25064oa -= j8;
        if (i10 == lwVar.yo) {
            this.uef = lwVar.oa();
            ivm.uef(lwVar);
        }
        return str;
    }

    public lw yo(int i5) {
        if (i5 > 0 && i5 <= 8192) {
            lw lwVar = this.uef;
            if (lwVar == null) {
                lw lwVarUef = ivm.uef();
                this.uef = lwVarUef;
                lwVarUef.xs = lwVarUef;
                lwVarUef.ivm = lwVarUef;
                return lwVarUef;
            }
            lw lwVar2 = lwVar.xs;
            return (lwVar2.yo + i5 > 8192 || !lwVar2.lw) ? lwVar2.uef(ivm.uef()) : lwVar2;
        }
        throw new IllegalArgumentException();
    }

    public final moa moa(int i5) {
        if (i5 == 0) {
            return moa.yo;
        }
        return new xs(this, i5);
    }

    public uef oa(byte[] bArr, int i5, int i10) {
        if (bArr != null) {
            long j8 = i10;
            cz.uef(bArr.length, i5, j8);
            int i11 = i10 + i5;
            while (i5 < i11) {
                lw lwVarYo = yo(1);
                int iMin = Math.min(i11 - i5, 8192 - lwVarYo.yo);
                System.arraycopy(bArr, i5, lwVarYo.uef, lwVarYo.yo, iMin);
                i5 += iMin;
                lwVarYo.yo += iMin;
            }
            this.f25064oa += j8;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] uef(long j8) throws EOFException {
        cz.uef(this.f25064oa, 0L, j8);
        if (j8 <= 2147483647L) {
            byte[] bArr = new byte[(int) j8];
            uef(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j8)));
    }

    public uef oa(int i5) {
        lw lwVarYo = yo(1);
        byte[] bArr = lwVarYo.uef;
        int i10 = lwVarYo.yo;
        lwVarYo.yo = i10 + 1;
        bArr[i10] = (byte) i5;
        this.f25064oa++;
        return this;
    }

    public void uef(byte[] bArr) throws EOFException {
        int i5 = 0;
        while (i5 < bArr.length) {
            int iUef = uef(bArr, i5, bArr.length - i5);
            if (iUef == -1) {
                throw new EOFException();
            }
            i5 += iUef;
        }
    }

    public uef oa(long j8) {
        if (j8 == 0) {
            return oa(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j8)) / 4) + 1;
        lw lwVarYo = yo(iNumberOfTrailingZeros);
        byte[] bArr = lwVarYo.uef;
        int i5 = lwVarYo.yo;
        for (int i10 = (i5 + iNumberOfTrailingZeros) - 1; i10 >= i5; i10--) {
            bArr[i10] = yo[(int) (15 & j8)];
            j8 >>>= 4;
        }
        lwVarYo.yo += iNumberOfTrailingZeros;
        this.f25064oa += iNumberOfTrailingZeros;
        return this;
    }

    public int uef(byte[] bArr, int i5, int i10) {
        cz.uef(bArr.length, i5, i10);
        lw lwVar = this.uef;
        if (lwVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, lwVar.yo - lwVar.f25062oa);
        System.arraycopy(lwVar.uef, lwVar.f25062oa, bArr, i5, iMin);
        int i11 = lwVar.f25062oa + iMin;
        lwVar.f25062oa = i11;
        this.f25064oa -= iMin;
        if (i11 == lwVar.yo) {
            this.uef = lwVar.oa();
            ivm.uef(lwVar);
        }
        return iMin;
    }

    public uef uef(String str) {
        return uef(str, 0, str.length());
    }

    public uef uef(String str, int i5, int i10) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i5)));
        }
        if (i10 >= i5) {
            if (i10 > str.length()) {
                StringBuilder sbL = f.l(i10, "endIndex > string.length: ", " > ");
                sbL.append(str.length());
                throw new IllegalArgumentException(sbL.toString());
            }
            while (i5 < i10) {
                char cCharAt2 = str.charAt(i5);
                if (cCharAt2 < 128) {
                    lw lwVarYo = yo(1);
                    byte[] bArr = lwVarYo.uef;
                    int i11 = lwVarYo.yo - i5;
                    int iMin = Math.min(i10, 8192 - i11);
                    int i12 = i5 + 1;
                    bArr[i5 + i11] = (byte) cCharAt2;
                    while (true) {
                        i5 = i12;
                        if (i5 >= iMin || (cCharAt = str.charAt(i5)) >= 128) {
                            break;
                        }
                        i12 = i5 + 1;
                        bArr[i5 + i11] = (byte) cCharAt;
                    }
                    int i13 = lwVarYo.yo;
                    int i14 = (i11 + i5) - i13;
                    lwVarYo.yo = i13 + i14;
                    this.f25064oa += i14;
                } else {
                    if (cCharAt2 < 2048) {
                        oa((cCharAt2 >> 6) | 192);
                        oa((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i15 = i5 + 1;
                        char cCharAt3 = i15 < i10 ? str.charAt(i15) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i16 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            oa((i16 >> 18) | 240);
                            oa(((i16 >> 12) & 63) | 128);
                            oa(((i16 >> 6) & 63) | 128);
                            oa((i16 & 63) | 128);
                            i5 += 2;
                        } else {
                            oa(63);
                            i5 = i15;
                        }
                    } else {
                        oa((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                        oa(((cCharAt2 >> 6) & 63) | 128);
                        oa((cCharAt2 & '?') | 128);
                    }
                    i5++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(v.e(i10, i5, "endIndex < beginIndex: ", " < "));
    }

    public uef uef(int i5) {
        if (i5 < 128) {
            oa(i5);
            return this;
        }
        if (i5 < 2048) {
            oa((i5 >> 6) | 192);
            oa((i5 & 63) | 128);
            return this;
        }
        if (i5 < 65536) {
            if (i5 >= 55296 && i5 <= 57343) {
                oa(63);
                return this;
            }
            oa((i5 >> 12) | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
            oa(((i5 >> 6) & 63) | 128);
            oa((i5 & 63) | 128);
            return this;
        }
        if (i5 <= 1114111) {
            oa((i5 >> 18) | 240);
            oa(((i5 >> 12) & 63) | 128);
            oa(((i5 >> 6) & 63) | 128);
            oa((i5 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i5));
    }

    public uef uef(String str, int i5, int i10, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i5 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i5)));
        }
        if (i10 >= i5) {
            if (i10 > str.length()) {
                StringBuilder sbL = f.l(i10, "endIndex > string.length: ", " > ");
                sbL.append(str.length());
                throw new IllegalArgumentException(sbL.toString());
            }
            if (charset != null) {
                if (charset.equals(cz.uef)) {
                    return uef(str, i5, i10);
                }
                byte[] bytes = str.substring(i5, i10).getBytes(charset);
                return oa(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(v.e(i10, i5, "endIndex < beginIndex: ", " < "));
    }
}
