package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i5) {
        int[] iArr = this.tags;
        if (i5 > iArr.length) {
            int i10 = this.count;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i5);
            this.objects = Arrays.copyOf(this.objects, i5);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i5) {
        int i10 = 17;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) throws IOException {
        int tag;
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, codedInputStream));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i5 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.tags, i5);
        System.arraycopy(unknownFieldSetLite2.tags, 0, iArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.objects, i5);
        System.arraycopy(unknownFieldSetLite2.objects, 0, objArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i5, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i5, Object obj, q2 q2Var) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            ((L) q2Var).f(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            ((L) q2Var).c(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            ((L) q2Var).a(tagFieldNumber, (ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            ((L) q2Var).b(tagFieldNumber, ((Integer) obj).intValue());
            return;
        }
        L l10 = (L) q2Var;
        l10.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        l10.f27587a.writeTag(tagFieldNumber, 3);
        ((UnknownFieldSetLite) obj).writeTo(q2Var);
        l10.f27587a.writeTag(tagFieldNumber, 4);
    }

    public void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i5 = this.count;
        return i5 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i5) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i5 = this.memoizedSerializedSize;
        if (i5 != -1) {
            return i5;
        }
        int serializedSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i10]);
            } else if (tagWireType == 3) {
                serializedSize = ((UnknownFieldSetLite) this.objects[i10]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + serializedSize;
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.memoizedSerializedSize = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i5 = this.memoizedSerializedSize;
        if (i5 != -1) {
            return i5;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i10]), (ByteString) this.objects[i10]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(int i5, CodedInputStream codedInputStream) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            storeField(i5, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i5, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i5, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(codedInputStream);
            codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(i5, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(i5, Integer.valueOf(codedInputStream.readFixed32()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(int i5, ByteString byteString) {
        checkMutable();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i5, 2), byteString);
        return this;
    }

    public UnknownFieldSetLite mergeVarintField(int i5, int i10) {
        checkMutable();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i5, 0), Long.valueOf(i10));
        return this;
    }

    public final void printWithIndent(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.count; i10++) {
            AbstractC1805i1.b(sb2, i5, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i10])), this.objects[i10]);
        }
    }

    public void storeField(int i5, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i10 = this.count;
        iArr[i10] = i5;
        this.objects[i10] = obj;
        this.count = i10 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.count; i5++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i5]), (ByteString) this.objects[i5]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.count; i5++) {
            int i10 = this.tags[i5];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i5]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i5]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i5]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i5]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i5]).intValue());
            }
        }
    }

    private UnknownFieldSetLite(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.memoizedSerializedSize = -1;
        this.count = i5;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z2;
    }

    private static int hashCode(Object[] objArr, int i5) {
        int iHashCode = 17;
        for (int i10 = 0; i10 < i5; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i5 = this.count;
        return ((((527 + i5) * 31) + hashCode(this.tags, i5)) * 31) + hashCode(this.objects, this.count);
    }

    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i5 = this.count + unknownFieldSetLite.count;
        ensureCapacity(i5);
        System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i5;
        return this;
    }

    public void writeAsMessageSetTo(q2 q2Var) throws IOException {
        ((L) q2Var).getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i5 = this.count - 1; i5 >= 0; i5--) {
                ((L) q2Var).h(WireFormat.getTagFieldNumber(this.tags[i5]), this.objects[i5]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            ((L) q2Var).h(WireFormat.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
        }
    }

    public void writeTo(q2 q2Var) throws IOException {
        if (this.count == 0) {
            return;
        }
        ((L) q2Var).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i5 = 0; i5 < this.count; i5++) {
            writeField(this.tags[i5], this.objects[i5], q2Var);
        }
    }
}
