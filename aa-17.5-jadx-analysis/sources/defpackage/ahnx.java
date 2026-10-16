package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahnx extends ahpe {
    private final int bytesLength;
    private final int bytesOffset;

    public ahnx(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i + i2 <= bArr.length) {
            this.bytesOffset = i;
            this.bytesLength = i2;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i);
        sb3.append("+");
        sb3.append(i2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // defpackage.ahpe
    public byte byteAt(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i < size()) {
            return this.bytes[this.bytesOffset + i];
        }
        int size = size();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.ahpe, defpackage.ahoa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
    }

    @Override // defpackage.ahpe
    protected int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // defpackage.ahpe, defpackage.ahoa, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ahnw(this);
    }

    @Override // defpackage.ahpe, defpackage.ahoa
    public int size() {
        return this.bytesLength;
    }

    @Override // defpackage.ahpe, defpackage.ahoa, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return iterator2();
    }
}
