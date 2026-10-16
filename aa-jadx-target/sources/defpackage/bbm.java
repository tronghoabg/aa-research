package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bbm implements defpackage.affh {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ defpackage.azp d;
    private final /* synthetic */ int e;

    public /* synthetic */ bbm(defpackage.azp azpVar, long j, int i, int i2, int i3) {
        this.e = i3;
        this.d = azpVar;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.e != 0) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            int i = iIntValue + this.b;
            defpackage.affc affcVar = (defpackage.affc) obj3;
            long j = this.a;
            int iD = defpackage.dlm.d(j);
            if (i < iD) {
                i = iD;
            }
            int iB = defpackage.dlm.b(j);
            if (i > iB) {
                i = iB;
            }
            int i2 = iIntValue2 + this.c;
            int iC = defpackage.dlm.c(j);
            int iA = defpackage.dlm.a(j);
            if (i2 < iC) {
                i2 = iC;
            }
            if (i2 <= iA) {
                iA = i2;
            }
            return this.d.dS(i, iA, defpackage.afcf.a, affcVar);
        }
        int iIntValue3 = ((java.lang.Integer) obj).intValue();
        int iIntValue4 = ((java.lang.Integer) obj2).intValue();
        int i3 = iIntValue3 + this.b;
        defpackage.affc affcVar2 = (defpackage.affc) obj3;
        long j2 = this.a;
        int iD2 = defpackage.dlm.d(j2);
        if (i3 < iD2) {
            i3 = iD2;
        }
        int iB2 = defpackage.dlm.b(j2);
        if (i3 > iB2) {
            i3 = iB2;
        }
        int i4 = iIntValue4 + this.c;
        int iC2 = defpackage.dlm.c(j2);
        int iA2 = defpackage.dlm.a(j2);
        if (i4 < iC2) {
            i4 = iC2;
        }
        if (i4 <= iA2) {
            iA2 = i4;
        }
        return this.d.dS(i3, iA2, defpackage.afcf.a, affcVar2);
    }
}
