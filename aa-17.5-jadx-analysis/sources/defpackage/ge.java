package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ge {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final gd d;
    private final int e;
    private final int f;

    public ge(gd gdVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = gdVar;
        int iB = gdVar.b();
        this.e = iB;
        int iA = gdVar.a();
        this.f = iA;
        xuh xuhVar = list.isEmpty() ? null : (xuh) list.get(0);
        if (xuhVar == null || xuhVar.b != 0 || xuhVar.c != 0) {
            list.add(0, new xuh(0, 0, 0, null, null));
        }
        list.add(new xuh(iB, iA, 0, null, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xuh xuhVar2 = (xuh) it.next();
            for (int i = 0; i < xuhVar2.a; i++) {
                int i2 = xuhVar2.b + i;
                int i3 = xuhVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int iA2 = 0;
        for (xuh xuhVar3 : this.a) {
            while (iA2 < xuhVar3.b) {
                if (this.b[iA2] == 0) {
                    int size = this.a.size();
                    int i5 = 0;
                    int iB2 = 0;
                    while (true) {
                        if (i5 < size) {
                            xuh xuhVar4 = (xuh) this.a.get(i5);
                            while (iB2 < xuhVar4.c) {
                                if (this.c[iB2] == 0 && this.d.d(iA2, iB2)) {
                                    int i6 = true != this.d.c(iA2, iB2) ? 4 : 8;
                                    this.b[iA2] = (iB2 << 4) | i6;
                                    this.c[iB2] = i6 | (iA2 << 4);
                                } else {
                                    iB2++;
                                }
                            }
                            iB2 = xuhVar4.b();
                            i5++;
                        }
                    }
                }
                iA2++;
            }
            iA2 = xuhVar3.a();
        }
    }

    private static gg b(Collection collection, int i, boolean z) {
        gg ggVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                ggVar = null;
                break;
            }
            ggVar = (gg) it.next();
            if (ggVar.a == i && ggVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            gg ggVar2 = (gg) it.next();
            if (z) {
                ggVar2.b--;
            } else {
                ggVar2.b++;
            }
        }
        return ggVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.gj r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge.a(gj):void");
    }
}
