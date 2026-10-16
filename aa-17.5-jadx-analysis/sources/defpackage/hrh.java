package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class hrh {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public hrh(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static hrh a(hri hriVar) throws IOException {
        if (tsu.a(hriVar) != 538247942) {
            throw new IOException();
        }
        String strE = tsu.e(hriVar);
        String strE2 = tsu.e(hriVar);
        long jB = tsu.b(hriVar);
        long jB2 = tsu.b(hriVar);
        long jB3 = tsu.b(hriVar);
        long jB4 = tsu.b(hriVar);
        int iA = tsu.a(hriVar);
        if (iA < 0) {
            throw new IOException(a.bp(iA, "readHeaderList size="));
        }
        List arrayList = iA == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iA; i++) {
            arrayList.add(new hqn(tsu.e(hriVar).intern(), tsu.e(hriVar).intern()));
        }
        return new hrh(strE, strE2, jB, jB2, jB3, jB4, arrayList);
    }
}
