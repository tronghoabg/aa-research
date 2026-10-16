package pd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import k8.AbstractC3198g;
import m8.C3498e;
import od.Z1;
import rd.C3967b;

/* loaded from: classes5.dex */
public abstract class w {
    static {
        Logger.getLogger(w.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            C3967b c3967b = (C3967b) it.next();
            int i10 = i5 + 1;
            bArr[i5] = c3967b.f44759a.s();
            i5 += 2;
            bArr[i10] = c3967b.f44760b.s();
        }
        Logger logger = Z1.f41868a;
        int i11 = 0;
        while (i11 < size) {
            byte[] bArr2 = bArr[i11];
            int i12 = i11 + 1;
            byte[] bArr3 = bArr[i12];
            byte[] bArr4 = Z1.f41869b;
            if (Z1.a(bArr2, bArr4)) {
                for (byte b5 : bArr3) {
                    if (b5 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i13 = 0; i13 < i11; i13++) {
                            arrayList2.add(bArr[i13]);
                        }
                        while (i11 < size) {
                            byte[] bArr5 = bArr[i11];
                            byte[] bArr6 = bArr[i11 + 1];
                            if (Z1.a(bArr5, bArr4)) {
                                int i14 = 0;
                                for (int i15 = 0; i15 <= bArr6.length; i15++) {
                                    if (i15 == bArr6.length || bArr6[i15] == 44) {
                                        byte[] bArrA = C3498e.f40402d.a(new String(bArr6, i14, i15 - i14, AbstractC3198g.f39299a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i14 = i15 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i11 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i12] = C3498e.f40402d.a(new String(bArr3, AbstractC3198g.f39299a));
            }
            i11 += 2;
        }
        return bArr;
    }
}
