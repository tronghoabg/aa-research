package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class C1 extends ByteString {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f27530f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* renamed from: a, reason: collision with root package name */
    public final int f27531a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteString f27532b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteString f27533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27535e;

    public C1(ByteString byteString, ByteString byteString2) {
        this.f27532b = byteString;
        this.f27533c = byteString2;
        int size = byteString.size();
        this.f27534d = size;
        this.f27531a = byteString2.size() + size;
        this.f27535e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int a(int i5) {
        return i5 >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : f27530f[i5];
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        r rVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f27535e);
        arrayDeque.push(this);
        ByteString byteString = this.f27532b;
        while (byteString instanceof C1) {
            C1 c12 = (C1) byteString;
            arrayDeque.push(c12);
            byteString = c12.f27532b;
        }
        r rVar2 = (r) byteString;
        while (true) {
            if (!(rVar2 != null)) {
                return arrayList;
            }
            if (rVar2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    rVar = null;
                    break;
                }
                ByteString byteString2 = ((C1) arrayDeque.pop()).f27533c;
                while (byteString2 instanceof C1) {
                    C1 c13 = (C1) byteString2;
                    arrayDeque.push(c13);
                    byteString2 = c13.f27532b;
                }
                rVar = (r) byteString2;
                if (!rVar.isEmpty()) {
                    break;
                }
            }
            arrayList.add(rVar2.asReadOnlyByteBuffer());
            rVar2 = rVar;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i5) {
        ByteString.checkIndex(i5, this.f27531a);
        return internalByteAt(i5);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.f27532b.copyTo(byteBuffer);
        this.f27533c.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i5, int i10, int i11) {
        int i12 = i5 + i11;
        ByteString byteString = this.f27532b;
        int i13 = this.f27534d;
        if (i12 <= i13) {
            byteString.copyToInternal(bArr, i5, i10, i11);
            return;
        }
        ByteString byteString2 = this.f27533c;
        if (i5 >= i13) {
            byteString2.copyToInternal(bArr, i5 - i13, i10, i11);
            return;
        }
        int i14 = i13 - i5;
        byteString.copyToInternal(bArr, i5, i10, i14);
        byteString2.copyToInternal(bArr, 0, i10 + i14, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i5 = this.f27531a;
            if (i5 == size) {
                if (i5 == 0) {
                    return true;
                }
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    A1 a12 = new A1(this);
                    r rVarA = a12.a();
                    A1 a13 = new A1(byteString);
                    r rVarA2 = a13.a();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        int size2 = rVarA.size() - i10;
                        int size3 = rVarA2.size() - i11;
                        int iMin = Math.min(size2, size3);
                        if (!(i10 == 0 ? rVarA.a(rVarA2, i11, iMin) : rVarA2.a(rVarA, i10, iMin))) {
                            break;
                        }
                        i12 += iMin;
                        if (i12 >= i5) {
                            if (i12 == i5) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            rVarA = a12.a();
                            i10 = 0;
                        } else {
                            i10 += iMin;
                        }
                        if (iMin == size3) {
                            rVarA2 = a13.a();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f27535e;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i5) {
        int i10 = this.f27534d;
        return i5 < i10 ? this.f27532b.internalByteAt(i5) : this.f27533c.internalByteAt(i5 - i10);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f27531a >= a(this.f27535e);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f27532b.partialIsValidUtf8(0, 0, this.f27534d);
        ByteString byteString = this.f27533c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new C1855z1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new B1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i5, int i10, int i11) {
        int i12 = i10 + i11;
        ByteString byteString = this.f27532b;
        int i13 = this.f27534d;
        if (i12 <= i13) {
            return byteString.partialHash(i5, i10, i11);
        }
        ByteString byteString2 = this.f27533c;
        if (i10 >= i13) {
            return byteString2.partialHash(i5, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return byteString2.partialHash(byteString.partialHash(i5, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i5, int i10, int i11) {
        int i12 = i10 + i11;
        ByteString byteString = this.f27532b;
        int i13 = this.f27534d;
        if (i12 <= i13) {
            return byteString.partialIsValidUtf8(i5, i10, i11);
        }
        ByteString byteString2 = this.f27533c;
        if (i10 >= i13) {
            return byteString2.partialIsValidUtf8(i5, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i5, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f27531a;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i5, int i10) {
        int i11 = this.f27531a;
        int iCheckRange = ByteString.checkRange(i5, i10, i11);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i11) {
            return this;
        }
        ByteString byteString = this.f27532b;
        int i12 = this.f27534d;
        if (i10 <= i12) {
            return byteString.substring(i5, i10);
        }
        ByteString byteString2 = this.f27533c;
        return i5 >= i12 ? byteString2.substring(i5 - i12, i10 - i12) : new C1(byteString.substring(i5), byteString2.substring(0, i10 - i12));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.f27532b.writeTo(outputStream);
        this.f27533c.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i5, int i10) throws IOException {
        int i11 = i5 + i10;
        ByteString byteString = this.f27532b;
        int i12 = this.f27534d;
        if (i11 <= i12) {
            byteString.writeToInternal(outputStream, i5, i10);
            return;
        }
        ByteString byteString2 = this.f27533c;
        if (i5 >= i12) {
            byteString2.writeToInternal(outputStream, i5 - i12, i10);
            return;
        }
        int i13 = i12 - i5;
        byteString.writeToInternal(outputStream, i5, i13);
        byteString2.writeToInternal(outputStream, 0, i10 - i13);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.f27533c.writeToReverse(byteOutput);
        this.f27532b.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new C1855z1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        this.f27532b.writeTo(byteOutput);
        this.f27533c.writeTo(byteOutput);
    }
}
