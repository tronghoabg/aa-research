package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class ahoe {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;
    private int totalBytesWritten;

    private ahoe(byte[] bArr, int i, int i2) {
        this.totalBytesWritten = 0;
        this.output = null;
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + 1;
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        int length = bArr.length;
        return computeRawVarint32Size(length) + length;
    }

    public static int computeBytesSize(int i, ahoa ahoaVar) {
        return computeTagSize(i) + computeBytesSizeNoTag(ahoaVar);
    }

    public static int computeBytesSizeNoTag(ahoa ahoaVar) {
        return computeRawVarint32Size(ahoaVar.size()) + ahoaVar.size();
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + 8;
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + 4;
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    public static int computeGroupSizeNoTag(ahpg ahpgVar) {
        return ahpgVar.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeLazyFieldSizeNoTag(ahoz ahozVar) {
        int serializedSize = ahozVar.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i, ahpg ahpgVar) {
        return computeTagSize(i) + computeMessageSizeNoTag(ahpgVar);
    }

    public static int computeMessageSizeNoTag(ahpg ahpgVar) {
        int serializedSize = ahpgVar.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            int length = str.getBytes(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE).length;
            return computeRawVarint32Size(length) + length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(ahqk.makeTag(i, 0));
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static ahoe newInstance(OutputStream outputStream, int i) {
        return new ahoe(outputStream, new byte[i]);
    }

    private void refreshBuffer() throws IOException {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new ahod();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeBoolNoTag(boolean z) throws IOException {
        writeRawByte(z ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i, ahoa ahoaVar) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(ahoaVar);
    }

    public void writeBytesNoTag(ahoa ahoaVar) throws IOException {
        writeRawVarint32(ahoaVar.size());
        writeRawBytes(ahoaVar);
    }

    public void writeDouble(int i, double d) throws IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeDoubleNoTag(double d) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public void writeEnum(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public void writeFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeFloat(int i, float f) throws IOException {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeFloatNoTag(float f) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public void writeGroup(int i, ahpg ahpgVar) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(ahpgVar);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(ahpg ahpgVar) throws IOException {
        ahpgVar.writeTo(this);
    }

    public void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public void writeMessage(int i, ahpg ahpgVar) throws IOException {
        writeTag(i, 2);
        writeMessageNoTag(ahpgVar);
    }

    public void writeMessageNoTag(ahpg ahpgVar) throws IOException {
        writeRawVarint32(ahpgVar.getSerializedSize());
        ahpgVar.writeTo(this);
    }

    public void writeMessageSetExtension(int i, ahpg ahpgVar) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, ahpgVar);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
        this.totalBytesWritten++;
    }

    public void writeRawBytes(ahoa ahoaVar, int i, int i2) throws IOException {
        int i3 = this.limit;
        int i4 = this.position;
        int i5 = i3 - i4;
        byte[] bArr = this.buffer;
        if (i5 >= i2) {
            ahoaVar.copyTo(bArr, i, i4, i2);
            this.position += i2;
            this.totalBytesWritten += i2;
            return;
        }
        ahoaVar.copyTo(bArr, i, i4, i5);
        int i6 = i + i5;
        this.position = this.limit;
        this.totalBytesWritten += i5;
        refreshBuffer();
        int i7 = i2 - i5;
        if (i7 <= this.limit) {
            ahoaVar.copyTo(this.buffer, i6, 0, i7);
            this.position = i7;
        } else {
            ahoaVar.writeTo(this.output, i6, i7);
        }
        this.totalBytesWritten += i7;
    }

    public void writeRawLittleEndian32(int i) throws IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j) throws IOException {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }

    public void writeRawVarint32(int i) throws IOException {
        while ((i & (-128)) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j) throws IOException {
        while (true) {
            int i = (int) j;
            if (((-128) & j) == 0) {
                writeRawByte(i);
                return;
            } else {
                writeRawByte((i & 127) | 128);
                j >>>= 7;
            }
        }
    }

    public void writeSFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32NoTag(int i) throws IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public void writeSInt64NoTag(long j) throws IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i, int i2) throws IOException {
        writeRawVarint32(ahqk.makeTag(i, i2));
    }

    public void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeUInt32NoTag(int i) throws IOException {
        writeRawVarint32(i);
    }

    public void writeUInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public static ahoe newInstance(byte[] bArr, int i, int i2) {
        return new ahoe(bArr, i, i2);
    }

    public static ahoe newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private ahoe(OutputStream outputStream, byte[] bArr) {
        this.totalBytesWritten = 0;
        this.output = outputStream;
        this.buffer = bArr;
        this.position = 0;
        this.limit = bArr.length;
    }

    public void writeRawByte(int i) throws IOException {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(ahoa ahoaVar) throws IOException {
        writeRawBytes(ahoaVar, 0, ahoaVar.size());
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.limit;
        int i4 = this.position;
        int i5 = i3 - i4;
        byte[] bArr2 = this.buffer;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.position += i2;
            this.totalBytesWritten += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.position = this.limit;
        this.totalBytesWritten += i5;
        refreshBuffer();
        int i7 = i2 - i5;
        if (i7 <= this.limit) {
            System.arraycopy(bArr, i6, this.buffer, 0, i7);
            this.position = i7;
        } else {
            this.output.write(bArr, i6, i7);
        }
        this.totalBytesWritten += i7;
    }
}
