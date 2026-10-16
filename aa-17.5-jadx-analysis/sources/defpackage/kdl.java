package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kdl {
    public final List a;
    public final int b;
    public final int c;

    private kdl(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public static List a(geu geuVar, List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(((yls) list).c, geuVar.w().a(1));
        int i3 = 0;
        while (i3 < iMin) {
            int i4 = i3 + i;
            arrayList.add(new kdl(((yfq) list).subList(i3, Math.min(iMin, i4)), i, i2));
            i3 = i4;
        }
        return arrayList;
    }
}
