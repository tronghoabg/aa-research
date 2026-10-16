package defpackage;

/* loaded from: classes.dex */
public final class aqd extends afde implements afeg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqd(adu aduVar, long j, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = aduVar;
        this.b = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new aqd((aqe) this.c, this.b, afckVar, 0);
        }
        if (i == 1) {
            return new aqd((aqe) this.c, this.b, afckVar, 1, (byte[]) null);
        }
        Object obj2 = this.c;
        if (i != 2) {
            return new aqd((adu) obj2, this.b, afckVar, 3);
        }
        return new aqd((aqe) obj2, this.b, afckVar, 2, (char[]) null);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                Object obj2 = this.c;
                long j = this.b;
                this.a = 1;
                if (((aqe) obj2).i.h(j, true, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                Object obj3 = this.c;
                long j2 = this.b;
                akq akqVar = akq.b;
                aqc aqcVar = new aqc(j2, null);
                this.a = 1;
                if (((aqe) obj3).i.i(akqVar, aqcVar, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        if (i == 2) {
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                Object obj4 = this.c;
                long j3 = this.b;
                this.a = 1;
                if (((aqe) obj4).i.h(j3, false, this) == afcrVar3) {
                    return afcrVar3;
                }
            }
            return afak.a;
        }
        afcr afcrVar4 = afcr.a;
        int i2 = this.a;
        woy.dF(obj);
        if (i2 == 0) {
            Object obj5 = this.c;
            cja cjaVar = new cja(this.b);
            aft aftVar = blc.c;
            this.a = 1;
            if (adu.k((adu) obj5, cjaVar, aftVar, null, this, 12) == afcrVar4) {
                return afcrVar4;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((aqd) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((aqd) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((aqd) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((aqd) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqd(aqe aqeVar, long j, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = aqeVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqd(aqe aqeVar, long j, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.c = aqeVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqd(aqe aqeVar, long j, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.d = i;
        this.c = aqeVar;
        this.b = j;
    }
}
