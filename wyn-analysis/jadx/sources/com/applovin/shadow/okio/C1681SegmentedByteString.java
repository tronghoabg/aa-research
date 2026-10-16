package com.applovin.shadow.okio;

import A7.AbstractC0279p0;
import R8.v;
import ff.m;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020!H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J'\u00106\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010BJ/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010CJ/\u0010F\u001a\u0002052\u0006\u0010:\u001a\u00020!2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010M\u001a\u00020\u0003H\u0010¢\u0006\u0004\bL\u0010/J\u001a\u0010O\u001a\u00020@2\b\u0010>\u001a\u0004\u0018\u00010NH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010,J\u000f\u0010R\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/applovin/shadow/okio/SegmentedByteString;", "Lcom/applovin/shadow/okio/ByteString;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "toByteString", "()Lcom/applovin/shadow/okio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "digest", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "hmac$okio", "(Ljava/lang/String;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lcom/applovin/shadow/okio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Lef/C;", "write", "(Ljava/io/OutputStream;)V", "Lcom/applovin/shadow/okio/Buffer;", "buffer", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "byteCount", "write$okio", "(Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILcom/applovin/shadow/okio/ByteString;II)Z", "(I[BII)Z", "target", "targetOffset", "copyInto", "(I[BII)V", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "[[B", "getSegments$okio", "()[[B", "[I", "getDirectory$okio", "()[I", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1681SegmentedByteString extends ByteString {

    @NotNull
    private final transient int[] directory;

    @NotNull
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.EMPTY.getData());
        AbstractC3340k.e(segments, "segments");
        AbstractC3340k.e(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        AbstractC3340k.c(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        AbstractC3340k.d(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void copyInto(int offset, @NotNull byte[] target, int targetOffset, int byteCount) {
        AbstractC3340k.e(target, "target");
        long j8 = byteCount;
        SegmentedByteString.checkOffsetAndCount(size(), offset, j8);
        SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j8);
        int i5 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i5) {
            int i10 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i11 = getDirectory()[iSegment] - i10;
            int i12 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i5, i11 + i10) - offset;
            int i13 = (offset - i10) + i12;
            m.f0(targetOffset, i13, i13 + iMin, getSegments()[iSegment], target);
            targetOffset += iMin;
            offset += iMin;
            iSegment++;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) throws NoSuchAlgorithmException {
        AbstractC3340k.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int i11 = getDirectory()[length + i5];
            int i12 = getDirectory()[i5];
            messageDigest.update(getSegments()[i5], i11, i12 - i10);
            i5++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC3340k.b(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @NotNull
    /* renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i5 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i5 < length) {
            int i12 = getDirectory()[length + i5];
            int i13 = getDirectory()[i5];
            byte[] bArr = getSegments()[i5];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i5++;
            i11 = i13;
        }
        setHashCode$okio(i10);
        return i10;
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        AbstractC3340k.e(algorithm, "algorithm");
        AbstractC3340k.e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i5 = 0;
            int i10 = 0;
            while (i5 < length) {
                int i11 = getDirectory()[length + i5];
                int i12 = getDirectory()[i5];
                mac.update(getSegments()[i5], i11, i12 - i10);
                i5++;
                i10 = i12;
            }
            byte[] bArrDoFinal = mac.doFinal();
            AbstractC3340k.d(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int indexOf(@NotNull byte[] other, int fromIndex) {
        AbstractC3340k.e(other, "other");
        return toByteString().indexOf(other, fromIndex);
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte internalGet$okio(int pos) {
        SegmentedByteString.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, pos);
        return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int lastIndexOf(@NotNull byte[] other, int fromIndex) {
        AbstractC3340k.e(other, "other");
        return toByteString().lastIndexOf(other, fromIndex);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, @NotNull ByteString other, int otherOffset, int byteCount) {
        AbstractC3340k.e(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i5 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i5) {
            int i10 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i11 = getDirectory()[iSegment] - i10;
            int i12 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i5, i11 + i10) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], (offset - i10) + i12, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        AbstractC3340k.e(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteString substring(int beginIndex, int endIndex) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(beginIndex, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbL = f.l(iResolveDefaultParameter, "endIndex=", " > length(");
            sbL.append(size());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i5 = iResolveDefaultParameter - beginIndex;
        if (i5 < 0) {
            throw new IllegalArgumentException(v.e(iResolveDefaultParameter, beginIndex, "endIndex=", " < beginIndex=").toString());
        }
        if (beginIndex == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (beginIndex == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, beginIndex);
        int iSegment2 = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.m0(getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i10 = iSegment;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(getDirectory()[i10] - beginIndex, i5);
                int i12 = i11 + 1;
                iArr[i11 + bArr.length] = getDirectory()[getSegments().length + i10];
                if (i10 == iSegment2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i13) + iArr[length];
        return new C1681SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i5 < length) {
            int i12 = getDirectory()[length + i5];
            int i13 = getDirectory()[i5];
            int i14 = i13 - i10;
            m.f0(i11, i12, i12 + i14, getSegments()[i5], bArr);
            i11 += i14;
            i5++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // com.applovin.shadow.okio.ByteString
    @NotNull
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write(@NotNull OutputStream out) throws IOException {
        AbstractC3340k.e(out, "out");
        int length = getSegments().length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int i11 = getDirectory()[length + i5];
            int i12 = getDirectory()[i5];
            out.write(getSegments()[i5], i11, i12 - i10);
            i5++;
            i10 = i12;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int offset, int byteCount) {
        AbstractC3340k.e(buffer, "buffer");
        int i5 = offset + byteCount;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i5) {
            int i10 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i11 = getDirectory()[iSegment] - i10;
            int i12 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i5, i11 + i10) - offset;
            int i13 = (offset - i10) + i12;
            Segment segment = new Segment(getSegments()[iSegment], i13, i13 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                AbstractC3340k.b(segment2);
                Segment segment3 = segment2.prev;
                AbstractC3340k.b(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + byteCount);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        AbstractC3340k.e(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i5 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i5) {
            int i10 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i11 = getDirectory()[iSegment] - i10;
            int i12 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i5, i11 + i10) - offset;
            if (!SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], (offset - i10) + i12, other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }
}
