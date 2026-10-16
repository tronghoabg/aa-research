package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class gqd implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gqd(npp nppVar, npt nptVar, boolean z, int i) {
        this.d = i;
        this.b = nppVar;
        this.c = nptVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, npp] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (buxVar.I(i2 != 2, iIntValue & 1)) {
                ?? r12 = this.c;
                Object obj3 = this.b;
                if (this.a) {
                    buxVar.v(-1343778047);
                    gqk.g((fwm) obj3, r12, buxVar, 8);
                    buxVar.o();
                } else {
                    buxVar.v(-1343716574);
                    gqk.e((fwm) obj3, r12, buxVar, 8);
                    buxVar.o();
                }
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                lws.D(this.b, (npt) this.c, this.a, null, buxVar2, 0);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        int i3 = iIntValue3 & 3;
        if (buxVar3.I(i3 != 2, iIntValue3 & 1)) {
            Object obj4 = this.c;
            fwn.f((this.a || this.b == null) && obj4 != null, 0, 0, bxc.i(-195957236, true, new bol(obj4, 9), buxVar3), buxVar3, 3072, 6);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ gqd(boolean z, hju hjuVar, Object obj, int i) {
        this.d = i;
        this.a = z;
        this.b = hjuVar;
        this.c = obj;
    }
}
