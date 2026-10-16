package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahox extends defpackage.ahqe {
    private final int bytesLength;
    private final int bytesOffset;

    public ahox(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (((long) i) + ((long) i2) <= bArr.length) {
            this.bytesOffset = i;
            this.bytesLength = i2;
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i);
        sb3.append("+");
        sb3.append(i2);
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    @Override // defpackage.ahqe
    public byte byteAt(int i) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i < size()) {
            return this.bytes[this.bytesOffset + i];
        }
        int size = size();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.ahqe, defpackage.ahpa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // defpackage.ahqe
    protected int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // defpackage.ahqe, defpackage.ahpa, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new defpackage.ahow(this);
    }

    @Override // defpackage.ahqe, defpackage.ahpa
    public int size() {
        return this.bytesLength;
    }

    @Override // defpackage.ahqe, defpackage.ahpa, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return iterator2();
    }
}
