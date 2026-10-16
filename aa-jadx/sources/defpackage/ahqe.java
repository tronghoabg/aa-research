package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ahqe extends defpackage.ahpa {
    protected final byte[] bytes;
    private int hash = 0;

    public ahqe(byte[] bArr) {
        this.bytes = bArr;
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    @Override // defpackage.ahpa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ahpa) || size() != ((defpackage.ahpa) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof defpackage.ahqe) {
            return equalsRange((defpackage.ahqe) obj, 0, size());
        }
        if (obj instanceof defpackage.ahqp) {
            return obj.equals(this);
        }
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()));
        strValueOf.length();
        throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(strValueOf)));
    }

    public boolean equalsRange(defpackage.ahqe ahqeVar, int i, int i2) {
        if (i2 > ahqeVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i + i2 > ahqeVar.size()) {
            int size2 = ahqeVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.bytes;
        byte[] bArr2 = ahqeVar.bytes;
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        int offsetIntoBytes2 = getOffsetIntoBytes();
        int offsetIntoBytes3 = ahqeVar.getOffsetIntoBytes() + i;
        while (offsetIntoBytes2 < offsetIntoBytes) {
            if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                return false;
            }
            offsetIntoBytes2++;
            offsetIntoBytes3++;
        }
        return true;
    }

    protected int getOffsetIntoBytes() {
        return 0;
    }

    @Override // defpackage.ahpa
    protected int getTreeDepth() {
        return 0;
    }

    public int hashCode() {
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

    @Override // defpackage.ahpa
    protected boolean isBalanced() {
        return true;
    }

    @Override // defpackage.ahpa
    public boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return defpackage.ahrc.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ahpa, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public java.util.Iterator<java.lang.Byte> iterator() {
        return new defpackage.ahqd(this);
    }

    @Override // defpackage.ahpa
    public defpackage.ahpc newCodedInput() {
        return defpackage.ahpc.newInstance(this);
    }

    @Override // defpackage.ahpa
    protected int partialHash(int i, int i2, int i3) {
        return hashCode(i, this.bytes, getOffsetIntoBytes() + i2, i3);
    }

    @Override // defpackage.ahpa
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        return defpackage.ahrc.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
    }

    @Override // defpackage.ahpa
    protected int peekCachedHashCode() {
        return this.hash;
    }

    @Override // defpackage.ahpa
    public int size() {
        return this.bytes.length;
    }

    @Override // defpackage.ahpa
    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(this.bytes, getOffsetIntoBytes(), size(), str);
    }

    @Override // defpackage.ahpa
    public void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
    }

    static int hashCode(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
