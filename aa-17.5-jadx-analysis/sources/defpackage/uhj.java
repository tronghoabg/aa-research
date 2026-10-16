package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uhj implements uhc {
    public static float a = 1.0f;
    public final uhg b;
    private final List e;
    private umi d = umi.a;
    public final ArrayList c = new ArrayList(2);

    private uhj(List list, uhg uhgVar) {
        this.e = list;
        this.b = uhgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uhj c(defpackage.ukq r41, defpackage.roa r42, defpackage.utz r43, java.util.List r44, defpackage.uhg r45, defpackage.utf r46, defpackage.tzm r47, defpackage.uvx r48, defpackage.uwt r49, java.util.List r50, java.util.List r51) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhj.c(ukq, roa, utz, java.util.List, uhg, utf, tzm, uvx, uwt, java.util.List, java.util.List):uhj");
    }

    @Override // defpackage.uhc
    public final int a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((uws) arrayList.get(i2)).q;
        }
        return i;
    }

    @Override // defpackage.uhc
    public final int b() {
        int length = 608;
        for (uhf uhfVar : this.e) {
            int length2 = 208;
            for (toq toqVar : uhfVar.b) {
                length2 += (toqVar.d.length * 4) + 160;
            }
            length += length2 + (uhfVar.c.e().length * 24);
        }
        return length;
    }
}
