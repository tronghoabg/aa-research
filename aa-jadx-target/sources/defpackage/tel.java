package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tel {
    public final int a;
    private final defpackage.tei b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final java.util.List g;
    private final java.util.List h;
    private final java.util.List i;
    private final java.util.List j;
    private final boolean k;
    private final int l;

    public tel(boolean z, java.lang.String... strArr) {
        byte[] bArr;
        strArr.getClass();
        this.k = z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList<java.util.List> arrayList4 = new java.util.ArrayList();
        defpackage.afgt afgtVar = new defpackage.afgt();
        for (java.lang.String str : strArr) {
            if (this.k) {
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                int length = bytes.length;
                byte b = (byte) length;
                bArr = new byte[length + 3];
                java.lang.System.arraycopy(bytes, 0, bArr, 2, b);
                bArr[1] = b;
                bArr[0] = b;
                bArr[length + 2] = 0;
            } else {
                char[] charArray = str.toCharArray();
                charArray.getClass();
                int length2 = charArray.length;
                int i = length2 + length2;
                byte[] bArr2 = new byte[i + 4];
                byte[] bArrAM = defpackage.sqs.aM((short) length2);
                bArr2[0] = bArrAM[0];
                bArr2[1] = bArrAM[1];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    byte[] bArrAL = defpackage.sqs.aL(charArray[i2]);
                    int i3 = i2 + i2;
                    bArr2[i3 + 2] = bArrAL[0];
                    bArr2[i3 + 3] = bArrAL[1];
                }
                bArr2[i + 2] = 0;
                bArr2[i + 3] = 0;
                bArr = bArr2;
            }
            b(arrayList, afgtVar, arrayList3, bArr);
            arrayList4.add(defpackage.afce.a);
        }
        int size = 0;
        for (java.util.List list : arrayList4) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                b(arrayList, afgtVar, arrayList3, (byte[]) ((defpackage.gkc) it.next()).a);
            }
            arrayList2.add(java.lang.Integer.valueOf(size));
            size += (list.size() * 12) + 4;
        }
        int i4 = afgtVar.a % 4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.l = i5;
        int size2 = arrayList3.size();
        this.c = size2;
        int size3 = arrayList3.size();
        int length3 = strArr.length;
        this.d = size3 - length3;
        boolean z2 = arrayList3.size() - length3 > 0;
        if (!z2) {
            arrayList2.clear();
            arrayList4.clear();
        }
        this.g = arrayList;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = arrayList4;
        int size4 = (size2 * 4) + 28 + (arrayList2.size() * 4);
        this.e = size4;
        int i6 = size4 + afgtVar.a + i5;
        this.f = true != z2 ? 0 : i6;
        int i7 = i6 + (true == z2 ? size : 0);
        this.a = i7;
        this.b = new defpackage.tei((short) 1, (short) 28, i7);
    }

    private static final void b(java.util.List list, defpackage.afgt afgtVar, java.util.List list2, byte[] bArr) {
        list.add(java.lang.Integer.valueOf(afgtVar.a));
        afgtVar.a += bArr.length;
        list2.add(bArr);
    }

    public final void a(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
        this.b.a(byteArrayOutputStream);
        byteArrayOutputStream.write(defpackage.a.S(this.c));
        byteArrayOutputStream.write(defpackage.a.S(this.d));
        byteArrayOutputStream.write(defpackage.a.S(true != this.k ? 0 : 256));
        byteArrayOutputStream.write(defpackage.a.S(this.e));
        byteArrayOutputStream.write(defpackage.a.S(this.f));
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(defpackage.a.S(((java.lang.Number) it.next()).intValue()));
        }
        java.util.Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(defpackage.a.S(((java.lang.Number) it2.next()).intValue()));
        }
        java.util.Iterator it3 = this.i.iterator();
        while (it3.hasNext()) {
            byteArrayOutputStream.write((byte[]) it3.next());
        }
        int i = this.l;
        if (i > 0) {
            byteArrayOutputStream.write(new byte[i]);
        }
        java.util.Iterator it4 = this.j.iterator();
        while (it4.hasNext()) {
            for (defpackage.gkc gkcVar : (java.util.List) it4.next()) {
                byteArrayOutputStream.write(defpackage.a.S(0));
                byteArrayOutputStream.write(defpackage.a.S(0));
                byteArrayOutputStream.write(defpackage.a.S(0));
            }
            byteArrayOutputStream.write(defpackage.a.S(-1));
        }
    }
}
