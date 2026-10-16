package com.applovin.shadow.okio.internal;

import A7.AbstractC0279p0;
import Va.M6;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tg.b;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001c\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a,\u0010\u0005\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\b\u0005\u0010\"\u001a$\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020$H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010'*\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010-\u001a\u00020'*\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u000200*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00104\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010/\u001a\u0014\u00105\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u0010/\u001a\u0014\u00106\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00107\u001a\u0014\u0010:\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00107\u001a\u001c\u0010;\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b;\u0010\f\u001a,\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010@\u001a$\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010A\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b?\u0010B\u001a$\u0010D\u001a\u00020\u0003*\u00020\u00002\u0006\u0010C\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bD\u0010B\u001a4\u0010F\u001a\u00020\u0007*\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010I\u001a\u00020H*\u00020\u0000H\u0080\b¢\u0006\u0004\bI\u0010J\u001a\u0014\u0010K\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020'*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010)¨\u0006Q"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSource;", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "commonRead", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Buffer;J)J", "", "commonExhausted", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Z", "Lef/C;", "commonRequire", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)V", "commonRequest", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Z", "", "commonReadByte", "(Lcom/applovin/shadow/okio/RealBufferedSource;)B", "Lcom/applovin/shadow/okio/ByteString;", "commonReadByteString", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/ByteString;", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "", "commonSelect", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Options;)I", "", "commonReadByteArray", "(Lcom/applovin/shadow/okio/RealBufferedSource;)[B", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)[B", "commonReadFully", "(Lcom/applovin/shadow/okio/RealBufferedSource;[B)V", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "(Lcom/applovin/shadow/okio/RealBufferedSource;[BII)I", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "commonReadAll", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/Sink;)J", "", "commonReadUtf8", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Ljava/lang/String;", "(Lcom/applovin/shadow/okio/RealBufferedSource;J)Ljava/lang/String;", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "(Lcom/applovin/shadow/okio/RealBufferedSource;)I", "", "commonReadShort", "(Lcom/applovin/shadow/okio/RealBufferedSource;)S", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "(Lcom/applovin/shadow/okio/RealBufferedSource;)J", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", "b", "fromIndex", "toIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/RealBufferedSource;BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/RealBufferedSource;Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "(Lcom/applovin/shadow/okio/RealBufferedSource;JLcom/applovin/shadow/okio/ByteString;II)Z", "Lcom/applovin/shadow/okio/BufferedSource;", "commonPeek", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/BufferedSource;", "commonClose", "(Lcom/applovin/shadow/okio/RealBufferedSource;)V", "Lcom/applovin/shadow/okio/Timeout;", "commonTimeout", "(Lcom/applovin/shadow/okio/RealBufferedSource;)Lcom/applovin/shadow/okio/Timeout;", "commonToString", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes.dex */
public final class RealBufferedSource {
    public static final void commonClose(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte b5, long j8, long j10) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j8 || j8 > j10) {
            StringBuilder sbU = M6.u(j8, "fromIndex=", " toIndex=");
            sbU.append(j10);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        long jMax = j8;
        while (jMax < j10) {
            byte b10 = b5;
            long j11 = j10;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b10, jMax, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j11 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b5 = b10;
            j10 = j11;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull ByteString targetBytes, long j8) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j8);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8, @NotNull ByteString bytes, int i5, int i10) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j8 < 0 || i5 < 0 || i10 < 0 || bytes.size() - i5 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = i11 + j8;
            if (!realBufferedSource.request(1 + j10) || realBufferedSource.bufferField.getByte(j10) != bytes.getByte(i5 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j8) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j8, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Sink sink) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(sink, "sink");
        long j8 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j8 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j8;
        }
        long size = realBufferedSource.bufferField.size() + j8;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(j8);
        return realBufferedSource.bufferField.readByteArray(j8);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(j8);
        return realBufferedSource.bufferField.readByteString(j8);
    }

    public static final long commonReadDecimalLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b5;
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j8 = 0;
        while (true) {
            long j10 = j8 + 1;
            if (!realBufferedSource.request(j10)) {
                break;
            }
            b5 = realBufferedSource.bufferField.getByte(j8);
            if ((b5 < 48 || b5 > 57) && !(j8 == 0 && b5 == 45)) {
                break;
            }
            j8 = j10;
        }
        if (j8 == 0) {
            b.t(16);
            b.t(16);
            String string = Integer.toString(b5, 16);
            AbstractC3340k.d(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e7) {
            int i5 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i10 = buffer.read(sink, i5, (int) buffer.size());
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i5 += i10;
            }
            throw e7;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b5;
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i5 = 0;
        while (true) {
            int i10 = i5 + 1;
            if (!realBufferedSource.request(i10)) {
                break;
            }
            b5 = realBufferedSource.bufferField.getByte(i5);
            if ((b5 < 48 || b5 > 57) && ((b5 < 97 || b5 > 102) && (b5 < 65 || b5 > 70))) {
                break;
            }
            i5 = i10;
        }
        if (i5 == 0) {
            b.t(16);
            b.t(16);
            String string = Integer.toString(b5, 16);
            AbstractC3340k.d(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(j8);
        return realBufferedSource.bufferField.readUtf8(j8);
    }

    public static final int commonReadUtf8CodePoint(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b5 = realBufferedSource.bufferField.getByte(0L);
        if ((b5 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b5 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b5 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "limit < 0: ").toString());
        }
        long j10 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && realBufferedSource.request(j10) && realBufferedSource.bufferField.getByte(j10 - 1) == 13 && realBufferedSource.request(j10 + 1) && realBufferedSource.bufferField.getByte(j10) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j10);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j8) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j8) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j8)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Options options) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j8) throws EOFException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j8, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j8 -= jMin;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        return realBufferedSource.source.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j8) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(sink, "sink");
        try {
            realBufferedSource.require(j8);
            realBufferedSource.bufferField.readFully(sink, j8);
        } catch (EOFException e7) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e7;
        }
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull ByteString bytes, long j8) throws IOException {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j8);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, (size - bytes.size()) + 1);
        }
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink, int i5, int i10) {
        AbstractC3340k.e(realBufferedSource, "<this>");
        AbstractC3340k.e(sink, "sink");
        long j8 = i10;
        SegmentedByteString.checkOffsetAndCount(sink.length, i5, j8);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i5, (int) Math.min(j8, realBufferedSource.bufferField.size()));
    }
}
