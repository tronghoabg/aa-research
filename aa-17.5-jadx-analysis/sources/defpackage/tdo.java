package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class tdo {
    public final int a;
    private final tdl b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final List g;
    private final List h;
    private final List i;
    private final List j;
    private final boolean k;
    private final int l;

    public tdo(boolean z, String... strArr) {
        byte[] bArr;
        strArr.getClass();
        this.k = z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<List> arrayList4 = new ArrayList();
        afft afftVar = new afft();
        for (String str : strArr) {
            if (this.k) {
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                int length = bytes.length;
                byte b = (byte) length;
                bArr = new byte[length + 3];
                System.arraycopy(bytes, 0, bArr, 2, b);
                bArr[1] = b;
                bArr[0] = b;
                bArr[length + 2] = 0;
            } else {
                char[] charArray = str.toCharArray();
                charArray.getClass();
                int length2 = charArray.length;
                int i = length2 + length2;
                byte[] bArr2 = new byte[i + 4];
                byte[] bArrAW = spu.aW((short) length2);
                bArr2[0] = bArrAW[0];
                bArr2[1] = bArrAW[1];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    byte[] bArrAV = spu.aV(charArray[i2]);
                    int i3 = i2 + i2;
                    bArr2[i3 + 2] = bArrAV[0];
                    bArr2[i3 + 3] = bArrAV[1];
                }
                bArr2[i + 2] = 0;
                bArr2[i + 3] = 0;
                bArr = bArr2;
            }
            b(arrayList, afftVar, arrayList3, bArr);
            arrayList4.add(afbe.a);
        }
        int size = 0;
        for (List list : arrayList4) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b(arrayList, afftVar, arrayList3, (byte[]) ((gjv) it.next()).a);
            }
            arrayList2.add(Integer.valueOf(size));
            size += (list.size() * 12) + 4;
        }
        int i4 = afftVar.a % 4;
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
        int i6 = size4 + afftVar.a + i5;
        this.f = true != z2 ? 0 : i6;
        int i7 = i6 + (true == z2 ? size : 0);
        this.a = i7;
        this.b = new tdl((short) 1, (short) 28, i7);
    }

    private static final void b(List list, afft afftVar, List list2, byte[] bArr) {
        list.add(Integer.valueOf(afftVar.a));
        afftVar.a += bArr.length;
        list2.add(bArr);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        this.b.a(byteArrayOutputStream);
        byteArrayOutputStream.write(a.T(this.c));
        byteArrayOutputStream.write(a.T(this.d));
        byteArrayOutputStream.write(a.T(true != this.k ? 0 : 256));
        byteArrayOutputStream.write(a.T(this.e));
        byteArrayOutputStream.write(a.T(this.f));
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(a.T(((Number) it.next()).intValue()));
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(a.T(((Number) it2.next()).intValue()));
        }
        Iterator it3 = this.i.iterator();
        while (it3.hasNext()) {
            byteArrayOutputStream.write((byte[]) it3.next());
        }
        int i = this.l;
        if (i > 0) {
            byteArrayOutputStream.write(new byte[i]);
        }
        Iterator it4 = this.j.iterator();
        while (it4.hasNext()) {
            for (gjv gjvVar : (List) it4.next()) {
                byteArrayOutputStream.write(a.T(0));
                byteArrayOutputStream.write(a.T(0));
                byteArrayOutputStream.write(a.T(0));
            }
            byteArrayOutputStream.write(a.T(-1));
        }
    }
}
