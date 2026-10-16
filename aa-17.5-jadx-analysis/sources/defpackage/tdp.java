package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class tdp {
    public final int a;
    public final tdl b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    public tdp(List list) {
        int i = ((char) ((tdi) list.get(list.size() - 1)).e) + 1;
        this.a = i;
        int i2 = (i * 4) + 16;
        this.g = i2;
        this.b = new tdl((short) 514, (short) 16, i2);
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new afah(((tdi) it.next()).e));
        }
        this.d = woy.cl(arrayList);
        int i3 = this.a;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = true != this.d.contains(new afah((short) i4)) ? 0 : 1073741824;
        }
        this.e = iArr;
        tdp tdpVar = new tdp(list, this.d, this.a);
        this.f = tdpVar;
        this.c = this.g + tdpVar.g;
    }

    public tdp(List list, Set set, int i) {
        int i2;
        this.c = i;
        byte[] bArr = new byte[64];
        bArr[0] = 64;
        this.f = bArr;
        int[] iArr = new int[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (set.contains(new afah((short) i3))) {
                i2 = i4 + 16;
            } else {
                i2 = i4;
                i4 = -1;
            }
            iArr[i3] = i4;
            i3++;
            i4 = i2;
        }
        this.d = iArr;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                woy.bo();
            }
            arrayList.add(new tdm(i5, ((tdi) obj).b));
            i5 = i6;
        }
        tdm[] tdmVarArr = (tdm[]) arrayList.toArray(new tdm[0]);
        this.e = tdmVarArr;
        int length = (((int[]) this.d).length * 4) + 84;
        this.a = length;
        int length2 = length + (tdmVarArr.length * 16);
        this.g = length2;
        this.b = new tdl((short) 513, (short) 84, length2);
    }
}
