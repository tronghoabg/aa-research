package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class enj {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public enj(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static defpackage.enj b(java.lang.String str) {
        byte[] bytes = (str + (char) 0).getBytes(defpackage.enl.h);
        return new defpackage.enj(2, bytes.length, -1L, bytes);
    }

    public static defpackage.enj c(long j, java.nio.ByteOrder byteOrder) {
        long[] jArr = {j};
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.enl.f[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new defpackage.enj(4, 1, -1L, byteBufferWrap.array());
    }

    public static defpackage.enj d(defpackage.enk enkVar, java.nio.ByteOrder byteOrder) {
        defpackage.enk[] enkVarArr = {enkVar};
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.enl.f[5]]);
        byteBufferWrap.order(byteOrder);
        defpackage.enk enkVar2 = enkVarArr[0];
        byteBufferWrap.putInt((int) enkVar2.a);
        byteBufferWrap.putInt((int) enkVar2.b);
        return new defpackage.enj(5, 1, -1L, byteBufferWrap.array());
    }

    public static defpackage.enj e(int i, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[defpackage.enl.f[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new defpackage.enj(3, 1, -1L, byteBufferWrap.array());
    }

    public final int a(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objF = f(byteOrder);
        if (objF == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objF instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) objF);
        }
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(objF instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objF;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0135: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:310), block:B:90:0x0135 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [enk[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v16, types: [enk[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v19, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    final java.lang.Object f(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        defpackage.eni eniVar;
        defpackage.eni eniVar2;
        java.lang.Object str;
        byte b;
        java.lang.String str2;
        defpackage.eni eniVar3 = null;
        try {
            try {
                eniVar = new defpackage.eni(this.d);
                try {
                    eniVar.c = byteOrder;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new java.lang.String(this.d, defpackage.enl.h);
                                try {
                                    eniVar.close();
                                    return str;
                                } catch (java.io.IOException e) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            str2 = new java.lang.String(new char[]{(char) (b + 48)});
                            try {
                                eniVar.close();
                                return str2;
                            } catch (java.io.IOException e2) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            int i2 = this.b;
                            byte[] bArr2 = defpackage.enl.g;
                            int length = bArr2.length;
                            if (i2 >= 8) {
                                int i3 = 0;
                                while (true) {
                                    int length2 = bArr2.length;
                                    if (i3 >= 8) {
                                        i = 8;
                                    } else if (this.d[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            while (i < i2) {
                                byte b2 = this.d[i];
                                if (b2 == 0) {
                                    str2 = sb.toString();
                                    eniVar.close();
                                    return str2;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            str2 = sb.toString();
                            eniVar.close();
                            return str2;
                        case 3:
                            int i4 = this.b;
                            str = new int[i4];
                            while (i < i4) {
                                str[i] = eniVar.readUnsignedShort();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 4:
                            int i5 = this.b;
                            str = new long[i5];
                            while (i < i5) {
                                str[i] = eniVar.a();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 5:
                            int i6 = this.b;
                            str = new defpackage.enk[i6];
                            while (i < i6) {
                                str[i] = new defpackage.enk(eniVar.a(), eniVar.a());
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 8:
                            int i7 = this.b;
                            str = new int[i7];
                            while (i < i7) {
                                str[i] = eniVar.readShort();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 9:
                            int i8 = this.b;
                            str = new int[i8];
                            while (i < i8) {
                                str[i] = eniVar.readInt();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 10:
                            int i9 = this.b;
                            str = new defpackage.enk[i9];
                            while (i < i9) {
                                str[i] = new defpackage.enk(eniVar.readInt(), eniVar.readInt());
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 11:
                            int i10 = this.b;
                            str = new double[i10];
                            while (i < i10) {
                                str[i] = eniVar.readFloat();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        case 12:
                            int i11 = this.b;
                            str = new double[i11];
                            while (i < i11) {
                                str[i] = eniVar.readDouble();
                                i++;
                            }
                            eniVar.close();
                            return str;
                        default:
                            try {
                                eniVar.close();
                                break;
                            } catch (java.io.IOException e3) {
                                android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return null;
                    }
                } catch (java.io.IOException e4) {
                    e = e4;
                    android.util.Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (eniVar != null) {
                        try {
                            eniVar.close();
                        } catch (java.io.IOException e5) {
                            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                eniVar3 = eniVar2;
                if (eniVar3 != null) {
                    try {
                        eniVar3.close();
                    } catch (java.io.IOException e6) {
                        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e7) {
            e = e7;
            eniVar = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (eniVar3 != null) {
                eniVar3.close();
            }
            throw th;
        }
    }

    public final java.lang.String g(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objF = f(byteOrder);
        if (objF == null) {
            return null;
        }
        if (objF instanceof java.lang.String) {
            return (java.lang.String) objF;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof int[]) {
            int[] iArr = (int[]) objF;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof double[]) {
            double[] dArr = (double[]) objF;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(objF instanceof defpackage.enk[])) {
                return null;
            }
            defpackage.enk[] enkVarArr = (defpackage.enk[]) objF;
            while (true) {
                int length4 = enkVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(enkVarArr[i].a);
                sb.append('/');
                sb.append(enkVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final java.lang.String toString() {
        return "(" + defpackage.enl.e[this.a] + ", data length:" + this.d.length + ")";
    }
}
