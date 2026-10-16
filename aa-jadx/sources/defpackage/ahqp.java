package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqp extends defpackage.ahpa {
    private static final int[] minLengthByDepth;
    private int hash;
    private final defpackage.ahpa left;
    private final int leftLength;
    private final defpackage.ahpa right;
    private final int totalLength;
    private final int treeDepth;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(java.lang.Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(java.lang.Integer.valueOf(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((java.lang.Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    private ahqp(defpackage.ahpa ahpaVar, defpackage.ahpa ahpaVar2) {
        this.hash = 0;
        this.left = ahpaVar;
        this.right = ahpaVar2;
        int size = ahpaVar.size();
        this.leftLength = size;
        this.totalLength = size + ahpaVar2.size();
        this.treeDepth = java.lang.Math.max(ahpaVar.getTreeDepth(), ahpaVar2.getTreeDepth()) + 1;
    }

    static defpackage.ahpa concatenate(defpackage.ahpa ahpaVar, defpackage.ahpa ahpaVar2) {
        defpackage.ahqp ahqpVar = ahpaVar instanceof defpackage.ahqp ? (defpackage.ahqp) ahpaVar : null;
        if (ahpaVar2.size() == 0) {
            return ahpaVar;
        }
        if (ahpaVar.size() == 0) {
            return ahpaVar2;
        }
        int size = ahpaVar.size() + ahpaVar2.size();
        if (size < 128) {
            return concatenateBytes(ahpaVar, ahpaVar2);
        }
        if (ahqpVar != null && ahqpVar.right.size() + ahpaVar2.size() < 128) {
            return new defpackage.ahqp(ahqpVar.left, concatenateBytes(ahqpVar.right, ahpaVar2));
        }
        if (ahqpVar != null) {
            if (ahqpVar.left.getTreeDepth() > ahqpVar.right.getTreeDepth() && ahqpVar.getTreeDepth() > ahpaVar2.getTreeDepth()) {
                return new defpackage.ahqp(ahqpVar.left, new defpackage.ahqp(ahqpVar.right, ahpaVar2));
            }
        }
        return size >= minLengthByDepth[java.lang.Math.max(ahpaVar.getTreeDepth(), ahpaVar2.getTreeDepth()) + 1] ? new defpackage.ahqp(ahpaVar, ahpaVar2) : new defpackage.ahql().balance(ahpaVar, ahpaVar2);
    }

    private static defpackage.ahqe concatenateBytes(defpackage.ahpa ahpaVar, defpackage.ahpa ahpaVar2) {
        int size = ahpaVar.size();
        int size2 = ahpaVar2.size();
        byte[] bArr = new byte[size + size2];
        ahpaVar.copyTo(bArr, 0, 0, size);
        ahpaVar2.copyTo(bArr, 0, size, size2);
        return new defpackage.ahqe(bArr);
    }

    private boolean equalsFragments(defpackage.ahpa ahpaVar) {
        defpackage.ahqk ahqkVar = null;
        defpackage.ahqm ahqmVar = new defpackage.ahqm(this);
        defpackage.ahqe ahqeVar = (defpackage.ahqe) ahqmVar.next();
        defpackage.ahqm ahqmVar2 = new defpackage.ahqm(ahpaVar);
        defpackage.ahqe ahqeVar2 = (defpackage.ahqe) ahqmVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = ahqeVar.size() - i;
            int size2 = ahqeVar2.size() - i2;
            int iMin = java.lang.Math.min(size, size2);
            if (!(i == 0 ? ahqeVar.equalsRange(ahqeVar2, i2, iMin) : ahqeVar2.equalsRange(ahqeVar, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == size) {
                ahqeVar = (defpackage.ahqe) ahqmVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                ahqeVar2 = (defpackage.ahqe) ahqmVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.ahpa
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public boolean equals(java.lang.Object obj) {
        int iPeekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ahpa)) {
            return false;
        }
        defpackage.ahpa ahpaVar = (defpackage.ahpa) obj;
        if (this.totalLength != ahpaVar.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        if (this.hash == 0 || (iPeekCachedHashCode = ahpaVar.peekCachedHashCode()) == 0 || this.hash == iPeekCachedHashCode) {
            return equalsFragments(ahpaVar);
        }
        return false;
    }

    @Override // defpackage.ahpa
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    public int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int i = this.totalLength;
            iPartialHash = partialHash(i, 0, i);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // defpackage.ahpa
    protected boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // defpackage.ahpa
    public boolean isValidUtf8() {
        defpackage.ahpa ahpaVar = this.left;
        defpackage.ahpa ahpaVar2 = this.right;
        return ahpaVar2.partialIsValidUtf8(ahpaVar.partialIsValidUtf8(0, 0, this.leftLength), 0, ahpaVar2.size()) == 0;
    }

    @Override // defpackage.ahpa, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator<java.lang.Byte> iterator() {
        return new defpackage.ahqn(this);
    }

    @Override // defpackage.ahpa
    public defpackage.ahpc newCodedInput() {
        return defpackage.ahpc.newInstance(new defpackage.ahqo(this));
    }

    @Override // defpackage.ahpa
    protected int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ahpa
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.ahpa
    protected int peekCachedHashCode() {
        return this.hash;
    }

    @Override // defpackage.ahpa
    public int size() {
        return this.totalLength;
    }

    @Override // defpackage.ahpa
    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(toByteArray(), str);
    }

    @Override // defpackage.ahpa
    public void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }
}
