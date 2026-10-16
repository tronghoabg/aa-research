package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bba {
    public final int a;
    public final java.util.List b;
    public final long c;
    public final java.lang.Object d;
    public final boolean e;
    public final int f;
    public final int[] g;
    public int h;
    public int i;
    private final defpackage.cft j;
    private final defpackage.dlz k;
    private final defpackage.cfy l;

    public bba(int i, java.util.List list, long j, java.lang.Object obj, defpackage.apn apnVar, defpackage.cft cftVar, defpackage.cfy cfyVar, defpackage.dlz dlzVar) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.j = cftVar;
        this.l = cfyVar;
        this.k = dlzVar;
        this.e = apnVar == defpackage.apn.a;
        int size = list.size();
        int iMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cux cuxVar = (defpackage.cux) list.get(i2);
            iMax = java.lang.Math.max(iMax, !this.e ? cuxVar.b : cuxVar.a);
        }
        this.f = iMax;
        int size2 = this.b.size();
        this.g = new int[size2 + size2];
        this.i = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    public final void a(int i) {
        this.h += i;
        int i2 = 0;
        while (true) {
            int[] iArr = this.g;
            if (i2 >= iArr.length) {
                return;
            }
            if (this.e) {
                if (i2 % 2 == 1) {
                    iArr[i2] = iArr[i2] + i;
                }
            } else if (i2 % 2 == 0) {
                iArr[i2] = iArr[i2] + i;
            }
            i2++;
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.h = i;
        boolean z = this.e;
        this.i = true != z ? i2 : i3;
        java.util.List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            defpackage.cux cuxVar = (defpackage.cux) list.get(i5);
            int i6 = i5 + i5;
            int[] iArr = this.g;
            if (z) {
                defpackage.cft cftVar = this.j;
                if (cftVar == null) {
                    defpackage.asq.a("null horizontalAlignment");
                    throw new defpackage.afap();
                }
                iArr[i6] = cftVar.a(cuxVar.a, i2, this.k);
                iArr[i6 + 1] = i;
                i4 = cuxVar.b;
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i;
                defpackage.cfy cfyVar = this.l;
                if (cfyVar == null) {
                    defpackage.asq.a("null verticalAlignment");
                    throw new defpackage.afap();
                }
                iArr[i7] = cfyVar.a(cuxVar.b, i3);
                i4 = cuxVar.a;
            }
            i += i4;
        }
    }
}
