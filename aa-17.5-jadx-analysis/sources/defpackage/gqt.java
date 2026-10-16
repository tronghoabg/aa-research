package defpackage;

/* loaded from: classes2.dex */
public final class gqt extends afde implements afeh {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqt(afck afckVar, int i) {
        super(3, afckVar);
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        flq flqVar = null;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                ?? r9 = this.c;
                aiyb aiybVar = new aiyb(new dmx((gre) this.b, (afck) null, 9));
                this.a = 1;
                if (aimr.c(r9, aiybVar, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i != 1) {
            afcr afcrVar2 = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            if (i2 == 0) {
                ?? r92 = this.c;
                fmn fmnVar = new fmn((aiyk) this.b, 15);
                this.a = 1;
                if (aimr.c(r92, fmnVar, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        afcr afcrVar3 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            ?? r93 = this.c;
            flq[] flqVarArr = (flq[]) this.b;
            int length = flqVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                flq flqVar2 = flqVarArr[i3];
                if (!affa.f(flqVar2, fmg.a)) {
                    flqVar = flqVar2;
                    break;
                }
                i3++;
            }
            if (flqVar == null) {
                flqVar = fmg.a;
            }
            this.a = 1;
            if (r93.a(flqVar, this) == afcrVar3) {
                return afcrVar3;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i == 0) {
            gqt gqtVar = new gqt((afck) obj3, 0);
            gqtVar.c = (aiyl) obj;
            gqtVar.b = obj2;
            return gqtVar.hT(afak.a);
        }
        if (i != 1) {
            gqt gqtVar2 = new gqt((afck) obj3, 2, (char[]) null);
            gqtVar2.c = (aiyl) obj;
            gqtVar2.b = obj2;
            return gqtVar2.hT(afak.a);
        }
        gqt gqtVar3 = new gqt((afck) obj3, 1, (byte[]) null);
        gqtVar3.c = (aiyl) obj;
        gqtVar3.b = (Object[]) obj2;
        return gqtVar3.hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqt(afck afckVar, int i, byte[] bArr) {
        super(3, afckVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqt(afck afckVar, int i, char[] cArr) {
        super(3, afckVar);
        this.d = i;
    }
}
