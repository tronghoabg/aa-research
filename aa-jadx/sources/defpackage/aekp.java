package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aekp implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected transient int[] a;
    public int b;
    protected defpackage.aekj c;

    public aekp(int i, defpackage.aekj aekjVar) {
        this.a = defpackage.aekc.a;
        if (i > 0) {
            this.a = new int[i];
        }
        this.c = aekjVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[objectInputStream.readInt()];
        this.a = iArr;
        for (int i = 0; i < this.b; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.a.length);
        int[] iArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    public final int a() {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            throw new java.util.NoSuchElementException();
        }
        int[] iArr = this.a;
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = i2 - 1;
        this.b = i5;
        int i6 = iArr[i5];
        iArr[0] = i6;
        if (i5 != 0) {
            if (this.c != null) {
                while (true) {
                    int i7 = i3 + i3;
                    int i8 = i7 + 1;
                    if (i8 >= i5) {
                        break;
                    }
                    int i9 = iArr[i8];
                    int i10 = i7 + 2;
                    if (i10 >= i5 || (-java.lang.Integer.compare(iArr[i10], i9)) >= 0) {
                        i10 = i8;
                    } else {
                        i9 = iArr[i10];
                    }
                    if ((-java.lang.Integer.compare(i6, i9)) <= 0) {
                        break;
                    }
                    iArr[i3] = i9;
                    i3 = i10;
                }
            } else {
                while (true) {
                    int i11 = i3 + i3;
                    int i12 = i11 + 1;
                    if (i12 >= i5) {
                        break;
                    }
                    int i13 = iArr[i12];
                    int i14 = i11 + 2;
                    if (i14 >= i5 || (i = iArr[i14]) >= i13) {
                        i14 = i12;
                    } else {
                        i13 = i;
                    }
                    if (i6 <= i13) {
                        break;
                    }
                    iArr[i3] = i13;
                    i3 = i14;
                }
            }
            iArr[i3] = i6;
        }
        return i4;
    }

    public final int b() {
        if (this.b != 0) {
            return this.a[0];
        }
        throw new java.util.NoSuchElementException();
    }

    public final void c(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = i2 + 1;
            if (i3 > length) {
                int[] iArr2 = new int[(int) java.lang.Math.max(java.lang.Math.min(((long) length) + ((long) (length >> 1)), 2147483639L), i3)];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
                iArr = iArr2;
            }
            this.a = iArr;
        }
        int i4 = this.b;
        this.b = i4 + 1;
        iArr[i4] = i;
        defpackage.aekj aekjVar = this.c;
        int i5 = iArr[i4];
        if (aekjVar != null) {
            while (i4 != 0) {
                int i6 = (i4 - 1) >>> 1;
                int i7 = iArr[i6];
                if ((-java.lang.Integer.compare(i7, i5)) <= 0) {
                    break;
                }
                iArr[i4] = i7;
                i4 = i6;
            }
        } else {
            while (i4 != 0) {
                int i8 = (i4 - 1) >>> 1;
                int i9 = iArr[i8];
                if (i9 <= i5) {
                    break;
                }
                iArr[i4] = i9;
                i4 = i8;
            }
        }
        iArr[i4] = i5;
    }

    public aekp() {
        this(0, null);
    }
}
