package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public class EndianUtils {
    private static final int LONG_SIZE = 8;

    public static class BufferUnderrunException extends TikaException {
        private static final long serialVersionUID = 8358288231138076276L;

        public BufferUnderrunException() {
            super("Insufficient data left in stream for required read");
        }
    }

    public static int getIntBE(byte[] bArr) {
        return getIntBE(bArr, 0);
    }

    public static int getIntLE(byte[] bArr) {
        return getIntLE(bArr, 0);
    }

    public static long getLongLE(byte[] bArr, int i5) {
        long j8 = 0;
        for (int i10 = i5 + 7; i10 >= i5; i10--) {
            j8 = (j8 << 8) | (bArr[i10] & ForkServer.ERROR);
        }
        return j8;
    }

    public static short getShortBE(byte[] bArr) {
        return getShortBE(bArr, 0);
    }

    public static short getShortLE(byte[] bArr) {
        return getShortLE(bArr, 0);
    }

    public static short getUByte(byte[] bArr, int i5) {
        return (short) (bArr[i5] & ForkServer.ERROR);
    }

    public static long getUIntBE(byte[] bArr) {
        return getUIntBE(bArr, 0);
    }

    public static long getUIntLE(byte[] bArr) {
        return getUIntLE(bArr, 0);
    }

    public static int getUShortBE(byte[] bArr) {
        return getUShortBE(bArr, 0);
    }

    public static int getUShortLE(byte[] bArr) {
        return getUShortLE(bArr, 0);
    }

    public static int readIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        if ((i5 | i10 | i11 | i12) >= 0) {
            return (i5 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        if ((i5 | i10 | i11 | i12) >= 0) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i5;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntME(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        if ((i5 | i10 | i11 | i12) >= 0) {
            return (i10 << 24) + (i5 << 16) + (i12 << 8) + i11;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        int i14 = inputStream.read();
        int i15 = inputStream.read();
        int i16 = inputStream.read();
        if ((i5 | i10 | i11 | i12 | i13 | i14 | i15 | i16) >= 0) {
            return (i5 << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        int i12 = inputStream.read();
        int i13 = inputStream.read();
        int i14 = inputStream.read();
        int i15 = inputStream.read();
        int i16 = inputStream.read();
        if ((i5 | i10 | i11 | i12 | i13 | i14 | i15 | i16) >= 0) {
            return (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8) + i5;
        }
        throw new BufferUnderrunException();
    }

    public static short readShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        return (short) readUShortBE(inputStream);
    }

    public static short readShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        return (short) readUShortLE(inputStream);
    }

    public static long readUE7(InputStream inputStream) throws IOException {
        int i5;
        long j8 = 0;
        int i10 = 0;
        while (true) {
            i5 = inputStream.read();
            if (i5 < 0) {
                break;
            }
            int i11 = i10 + 1;
            if (i10 >= 6) {
                break;
            }
            long j10 = j8 << 7;
            if ((i5 & 128) != 128) {
                j8 = j10 + i5;
                break;
            }
            j8 = j10 + (i5 & 127);
            i10 = i11;
        }
        if (i5 >= 0) {
            return j8;
        }
        throw new IOException("Buffer underun; expected one more byte");
    }

    public static long readUIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        if ((i5 | i10 | i11 | inputStream.read()) >= 0) {
            return ((i5 << 24) + (i10 << 16) + (i11 << 8) + r4) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static long readUIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        int i11 = inputStream.read();
        if ((i5 | i10 | i11 | inputStream.read()) >= 0) {
            return ((r4 << 24) + (i11 << 16) + (i10 << 8) + i5) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        if ((i5 | i10) >= 0) {
            return (i5 << 8) + i10;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i5 = inputStream.read();
        int i10 = inputStream.read();
        if ((i5 | i10) >= 0) {
            return (i10 << 8) + i5;
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b5) {
        return b5 & ForkServer.ERROR;
    }

    public static int getIntBE(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        int i12 = bArr[i5 + 2] & ForkServer.ERROR;
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + (bArr[i5 + 3] & ForkServer.ERROR);
    }

    public static int getIntLE(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        int i11 = bArr[i5 + 1] & ForkServer.ERROR;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) + ((bArr[i5 + 2] & ForkServer.ERROR) << 16) + (i11 << 8) + i10;
    }

    public static short getShortBE(byte[] bArr, int i5) {
        return (short) getUShortBE(bArr, i5);
    }

    public static short getShortLE(byte[] bArr, int i5) {
        return (short) getUShortLE(bArr, i5);
    }

    public static long getUIntBE(byte[] bArr, int i5) {
        return getIntBE(bArr, i5) & 4294967295L;
    }

    public static long getUIntLE(byte[] bArr, int i5) {
        return getIntLE(bArr, i5) & 4294967295L;
    }

    public static int getUShortBE(byte[] bArr, int i5) {
        int i10 = bArr[i5] & ForkServer.ERROR;
        return (i10 << 8) + (bArr[i5 + 1] & ForkServer.ERROR);
    }

    public static int getUShortLE(byte[] bArr, int i5) {
        return ((bArr[i5 + 1] & ForkServer.ERROR) << 8) + (bArr[i5] & ForkServer.ERROR);
    }
}
