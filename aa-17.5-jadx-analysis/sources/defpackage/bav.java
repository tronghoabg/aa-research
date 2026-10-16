package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bav {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final boolean e;
    public final int f;
    public final int[] g;
    public int h;
    public int i;
    private final cfm j;
    private final dlr k;
    private final cfr l;

    public bav(int i, List list, long j, Object obj, api apiVar, cfm cfmVar, cfr cfrVar, dlr dlrVar) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.j = cfmVar;
        this.l = cfrVar;
        this.k = dlrVar;
        this.e = apiVar == api.a;
        int size = list.size();
        int iMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cuo cuoVar = (cuo) list.get(i2);
            iMax = Math.max(iMax, !this.e ? cuoVar.b : cuoVar.a);
        }
        this.f = iMax;
        int size2 = this.b.size();
        this.g = new int[size2 + size2];
        this.i = Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r5) {
        /*
            r4 = this;
            int r0 = r4.h
            int r0 = r0 + r5
            r4.h = r0
            r0 = 0
        L6:
            int[] r1 = r4.g
            int r2 = r1.length
            if (r0 >= r2) goto L21
            boolean r2 = r4.e
            if (r2 == 0) goto L15
            int r2 = r0 % 2
            r3 = 1
            if (r2 != r3) goto L1e
            goto L19
        L15:
            int r2 = r0 % 2
            if (r2 != 0) goto L1e
        L19:
            r2 = r1[r0]
            int r2 = r2 + r5
            r1[r0] = r2
        L1e:
            int r0 = r0 + 1
            goto L6
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.a(int):void");
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.h = i;
        boolean z = this.e;
        this.i = true != z ? i2 : i3;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            cuo cuoVar = (cuo) list.get(i5);
            int i6 = i5 + i5;
            int[] iArr = this.g;
            if (z) {
                cfm cfmVar = this.j;
                if (cfmVar == null) {
                    asl.a("null horizontalAlignment");
                    throw new aezp();
                }
                iArr[i6] = cfmVar.a(cuoVar.a, i2, this.k);
                iArr[i6 + 1] = i;
                i4 = cuoVar.b;
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i;
                cfr cfrVar = this.l;
                if (cfrVar == null) {
                    asl.a("null verticalAlignment");
                    throw new aezp();
                }
                iArr[i7] = cfrVar.a(cuoVar.b, i3);
                i4 = cuoVar.a;
            }
            i += i4;
        }
    }
}
