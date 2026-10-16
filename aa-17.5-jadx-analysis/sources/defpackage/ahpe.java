package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* loaded from: classes3.dex */
class ahpe extends ahoa {
    protected final byte[] bytes;
    private int hash = 0;

    public ahpe(byte[] bArr) {
        this.bytes = bArr;
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    @Override // defpackage.ahoa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahoa) || size() != ((ahoa) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof ahpe) {
            return equalsRange((ahpe) obj, 0, size());
        }
        if (obj instanceof ahpp) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(String.valueOf(obj.getClass()));
        strValueOf.length();
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(strValueOf)));
    }

    public boolean equalsRange(ahpe ahpeVar, int i, int i2) {
        if (i2 > ahpeVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > ahpeVar.size()) {
            int size2 = ahpeVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.bytes;
        byte[] bArr2 = ahpeVar.bytes;
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        int offsetIntoBytes2 = getOffsetIntoBytes();
        int offsetIntoBytes3 = ahpeVar.getOffsetIntoBytes() + i;
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

    @Override // defpackage.ahoa
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

    @Override // defpackage.ahoa
    protected boolean isBalanced() {
        return true;
    }

    @Override // defpackage.ahoa
    public boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return ahqc.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ahoa, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator() {
        return new ahpd(this);
    }

    @Override // defpackage.ahoa
    public ahoc newCodedInput() {
        return ahoc.newInstance(this);
    }

    @Override // defpackage.ahoa
    protected int partialHash(int i, int i2, int i3) {
        return hashCode(i, this.bytes, getOffsetIntoBytes() + i2, i3);
    }

    @Override // defpackage.ahoa
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int offsetIntoBytes = getOffsetIntoBytes() + i2;
        return ahqc.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
    }

    @Override // defpackage.ahoa
    protected int peekCachedHashCode() {
        return this.hash;
    }

    @Override // defpackage.ahoa
    public int size() {
        return this.bytes.length;
    }

    @Override // defpackage.ahoa
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, getOffsetIntoBytes(), size(), str);
    }

    @Override // defpackage.ahoa
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
    }

    static int hashCode(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
