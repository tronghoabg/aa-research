package com.google.protobuf;

import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new C1832s(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final InterfaceC1824p byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    static {
        Class cls = AbstractC1785c.f27652a;
        byteArrayCopier = new C1835t();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C1815m();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "length (", ") must be >= 1"));
        }
        if (i5 == 1) {
            return it.next();
        }
        int i10 = i5 >>> 1;
        return balancedConcat(it, i10).concat(balancedConcat(it, i5 - i10));
    }

    public static void checkIndex(int i5, int i10) {
        if (((i10 - (i5 + 1)) | i5) < 0) {
            if (i5 >= 0) {
                throw new ArrayIndexOutOfBoundsException(R8.v.e(i5, i10, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
    }

    public static int checkRange(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0279p0.i(i5, "Beginning index: ", " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(R8.v.e(i5, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(R8.v.e(i10, i11, "End index: ", " >= "));
    }

    public static ByteString copyFrom(byte[] bArr, int i5, int i10) {
        checkRange(i5, i5 + i10, bArr.length);
        return new C1832s(byteArrayCopier.a(i5, i10, bArr));
    }

    public static ByteString copyFromUtf8(String str) {
        return new C1832s(str.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i5) {
        int iHexDigit = hexDigit(str.charAt(i5));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbW.append(str.charAt(i5));
        sbW.append(" at index ");
        sbW.append(i5);
        throw new NumberFormatException(sbW.toString());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Invalid hexString ", str, " of length ");
            sbW.append(str.length());
            sbW.append(" must be even.");
            throw new NumberFormatException(sbW.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = i5 * 2;
            bArr[i5] = (byte) (extractHexDigit(str, i10 + 1) | (extractHexDigit(str, i10) << 4));
        }
        return new C1832s(bArr);
    }

    private static int hexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public static C1827q newCodedBuilder(int i5) {
        return new C1827q(i5);
    }

    public static Output newOutput(int i5) {
        return new Output(i5);
    }

    private static ByteString readChunk(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i10 = 0;
        while (i10 < i5) {
            int i11 = inputStream.read(bArr, i10, i5 - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        if (i10 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i10);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b5) {
        return b5 & ForkServer.ERROR;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return K1.d(this);
        }
        return K1.d(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C1829q1(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i5);

    public final ByteString concat(ByteString byteString) {
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - size() < byteString.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
        }
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size = byteString.size() + size();
        if (size < 128) {
            int size2 = size();
            int size3 = byteString.size();
            byte[] bArr = new byte[size2 + size3];
            copyTo(bArr, 0, 0, size2);
            byteString.copyTo(bArr, 0, size2, size3);
            return wrap(bArr);
        }
        if (this instanceof C1) {
            C1 c12 = (C1) this;
            ByteString byteString2 = c12.f27533c;
            int size4 = byteString.size() + byteString2.size();
            ByteString byteString3 = c12.f27532b;
            if (size4 < 128) {
                int size5 = byteString2.size();
                int size6 = byteString.size();
                byte[] bArr2 = new byte[size5 + size6];
                byteString2.copyTo(bArr2, 0, 0, size5);
                byteString.copyTo(bArr2, 0, size5, size6);
                return new C1(byteString3, wrap(bArr2));
            }
            if (byteString3.getTreeDepth() > byteString2.getTreeDepth()) {
                if (c12.f27535e > byteString.getTreeDepth()) {
                    return new C1(byteString3, new C1(byteString2, byteString));
                }
            }
        }
        if (size >= C1.a(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
            return new C1(this, byteString);
        }
        C1784b1 c1784b1 = new C1784b1(1);
        c1784b1.a(this);
        c1784b1.a(byteString);
        ArrayDeque arrayDeque = (ArrayDeque) c1784b1.f27650a;
        ByteString c13 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            c13 = new C1((ByteString) arrayDeque.pop(), c13);
        }
        return c13;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i5) {
        copyTo(bArr, 0, i5, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i5, int i10, int i11);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i5);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i5, int i10, int i11);

    public abstract int partialIsValidUtf8(int i5, int i10, int i11);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i5) {
        return substring(i5, size());
    }

    public abstract ByteString substring(int i5, int i10);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e7) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e7);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i5, int i10) throws IOException {
        checkRange(i5, i5 + i10, size());
        if (i10 > 0) {
            writeToInternal(outputStream, i5, i10);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i5, int i10) throws IOException;

    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i5) throws IOException {
        return readFrom(inputStream, i5, i5);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i5, int i10, int i11) {
        checkRange(i5, i5 + i11, size());
        checkRange(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            copyToInternal(bArr, i5, i10, i11);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new C1812l(this);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i5, int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i5);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i5 = Math.min(i5 * 2, i10);
        }
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i5) {
            if (i5 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i5;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i5];
        }

        private void flushFullBuffer(int i5) {
            this.flushedBuffers.add(new C1832s(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i5, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i5 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i5 >= bArr.length) {
                this.flushedBuffers.add(new C1832s(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i5 > 0) {
                this.flushedBuffers.add(new C1832s(Arrays.copyOf(bArr, i5)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i5) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i10 = this.bufferPos;
                this.bufferPos = i10 + 1;
                bArr[i10] = (byte) i5;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i5;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i10 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i10));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i5, int i10) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i11 = this.bufferPos;
                if (i10 <= length - i11) {
                    System.arraycopy(bArr, i5, bArr2, i11, i10);
                    this.bufferPos += i10;
                } else {
                    int length2 = bArr2.length - i11;
                    System.arraycopy(bArr, i5, bArr2, i11, length2);
                    int i12 = i10 - length2;
                    flushFullBuffer(i12);
                    System.arraycopy(bArr, i5 + length2, this.buffer, 0, i12);
                    this.bufferPos = i12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i5) {
        checkRange(0, i5, byteBuffer.remaining());
        byte[] bArr = new byte[i5];
        byteBuffer.get(bArr);
        return new C1832s(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new C1832s(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i5, int i10) {
        return new C1821o(bArr, i5, i10);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        return wg.b.c(AbstractC1593a.k(size, "<ByteString@", hexString, " size=", " contents=\""), truncateAndEscapeForDisplay(), "\">");
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new C1832s(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new C1832s(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
