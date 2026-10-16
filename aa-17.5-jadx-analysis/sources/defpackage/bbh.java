package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bbh implements afeh {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ azk d;
    private final /* synthetic */ int e;

    public /* synthetic */ bbh(azk azkVar, long j, int i, int i2, int i3) {
        this.e = i3;
        this.d = azkVar;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            int iIntValue = ((Integer) obj).intValue();
            int iIntValue2 = ((Integer) obj2).intValue();
            int i = iIntValue + this.b;
            afec afecVar = (afec) obj3;
            long j = this.a;
            int iD = dle.d(j);
            if (i < iD) {
                i = iD;
            }
            int iB = dle.b(j);
            if (i > iB) {
                i = iB;
            }
            int i2 = iIntValue2 + this.c;
            int iC = dle.c(j);
            int iA = dle.a(j);
            if (i2 < iC) {
                i2 = iC;
            }
            if (i2 <= iA) {
                iA = i2;
            }
            return this.d.eK(i, iA, afbf.a, afecVar);
        }
        int iIntValue3 = ((Integer) obj).intValue();
        int iIntValue4 = ((Integer) obj2).intValue();
        int i3 = iIntValue3 + this.b;
        afec afecVar2 = (afec) obj3;
        long j2 = this.a;
        int iD2 = dle.d(j2);
        if (i3 < iD2) {
            i3 = iD2;
        }
        int iB2 = dle.b(j2);
        if (i3 > iB2) {
            i3 = iB2;
        }
        int i4 = iIntValue4 + this.c;
        int iC2 = dle.c(j2);
        int iA2 = dle.a(j2);
        if (i4 < iC2) {
            i4 = iC2;
        }
        if (i4 <= iA2) {
            iA2 = i4;
        }
        return this.d.eK(i3, iA2, afbf.a, afecVar2);
    }
}
