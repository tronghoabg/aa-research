package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class brw implements afeg {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ brw(long j, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (buxVar.I(i2 != 2, iIntValue & 1)) {
                czz.ao(this.a, czz.av(buxVar).m, bxc.i(1921972184, true, new bmc(this.b, this.c, 7), buxVar), buxVar, 384);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                czz.ao(this.a, (dfw) this.b, bxc.i(-1767363041, true, new bly(this.c, 6), buxVar2), buxVar2, 384);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i == 2) {
            return mcd.j(this.c, this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
        }
        if (i == 3) {
            return mcd.j(this.c, this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        int i3 = iIntValue3 & 3;
        int i4 = iIntValue3 & 1;
        yph yphVar = myi.a;
        if (buxVar3.I(i3 != 2, i4)) {
            this.c.invoke(new myy(this.a, (mwy) this.b), buxVar3, 0);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ brw(afeh afehVar, long j, Object obj, int i) {
        this.d = i;
        this.c = afehVar;
        this.a = j;
        this.b = obj;
    }
}
