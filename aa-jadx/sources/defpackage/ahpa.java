package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahpa implements java.lang.Iterable<java.lang.Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final defpackage.ahpa EMPTY = new defpackage.ahqe(new byte[0]);

    private static defpackage.ahpa balancedConcat(java.util.Iterator<defpackage.ahpa> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static defpackage.ahpa copyFrom(java.lang.Iterable<defpackage.ahpa> iterable) {
        java.util.Collection arrayList;
        if (iterable instanceof java.util.Collection) {
            arrayList = (java.util.Collection) iterable;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<defpackage.ahpa> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? EMPTY : balancedConcat(arrayList.iterator(), arrayList.size());
    }

    public static defpackage.ahpa copyFromUtf8(java.lang.String str) {
        try {
            return new defpackage.ahqe(str.getBytes(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static defpackage.ahoz newOutput() {
        return new defpackage.ahoz(128);
    }

    public defpackage.ahpa concat(defpackage.ahpa ahpaVar) {
        int size = size();
        int size2 = ahpaVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return defpackage.ahqp.concatenate(this, ahpaVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                copyToInternal(bArr, i, i2, i3);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    protected abstract int getTreeDepth();

    protected abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public abstract java.util.Iterator<java.lang.Byte> iterator();

    public abstract defpackage.ahpc newCodedInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return defpackage.ahpt.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    public abstract java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException;

    public java.lang.String toStringUtf8() {
        try {
            return toString(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    public void writeTo(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= size()) {
            if (i2 > 0) {
                writeToInternal(outputStream, i, i2);
            }
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
    }

    public abstract void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException;

    public static defpackage.ahpa copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static defpackage.ahpa copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new defpackage.ahqe(bArr2);
    }
}
