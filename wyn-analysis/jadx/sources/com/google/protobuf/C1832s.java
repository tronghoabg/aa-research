package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1832s extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27739a;

    public C1832s(byte[] bArr) {
        bArr.getClass();
        this.f27739a = bArr;
    }

    @Override // com.google.protobuf.r
    public final boolean a(r rVar, int i5, int i10) {
        if (i10 > rVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i10 + size());
        }
        int i11 = i5 + i10;
        if (i11 > rVar.size()) {
            StringBuilder sbH = R8.v.h("Ran off end of other: ", i5, ", ", i10, ", ");
            sbH.append(rVar.size());
            throw new IllegalArgumentException(sbH.toString());
        }
        if (!(rVar instanceof C1832s)) {
            return rVar.substring(i5, i11).equals(substring(0, i10));
        }
        C1832s c1832s = (C1832s) rVar;
        int iB = b() + i10;
        int iB2 = b();
        int iB3 = c1832s.b() + i5;
        while (iB2 < iB) {
            if (this.f27739a[iB2] != c1832s.f27739a[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.f27739a, b(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public int b() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i5) {
        return this.f27739a[i5];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f27739a, b(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.f27739a, i5, bArr, i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C1832s)) {
                return obj.equals(this);
            }
            C1832s c1832s = (C1832s) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = c1832s.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return a(c1832s, 0, size());
            }
        }
        return false;
    }

    @Override // com.google.protobuf.r, com.google.protobuf.ByteString
    public byte internalByteAt(int i5) {
        return this.f27739a[i5];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iB = b();
        return f2.f27676a.e(this.f27739a, iB, size() + iB);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f27739a, b(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.f27739a, b(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i5, int i10, int i11) {
        return Internal.partialHash(i5, this.f27739a, b() + i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i5, int i10, int i11) {
        int iB = b() + i10;
        return f2.f27676a.g(i5, this.f27739a, iB, i11 + iB);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f27739a.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i5, int i10) {
        int iCheckRange = ByteString.checkRange(i5, i10, size());
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new C1821o(this.f27739a, b() + i5, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.f27739a, b(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i5, int i10) throws IOException {
        outputStream.write(this.f27739a, b() + i5, i10);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f27739a, b(), size());
    }
}
