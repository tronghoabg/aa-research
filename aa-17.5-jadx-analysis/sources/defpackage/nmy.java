package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nmy implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nmy(nnl nnlVar, bwq bwqVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, int i) {
        this.g = i;
        this.a = nnlVar;
        this.b = bwqVar;
        this.c = cilVar;
        this.d = cilVar2;
        this.e = cilVar3;
        this.f = cilVar4;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cts, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.g == 0) {
            cis cisVar = (cis) obj;
            int i = nni.a;
            cisVar.getClass();
            if (cisVar.b() && ((nnl) this.a).j) {
                int iOrdinal = ((nmr) this.b.a()).ordinal();
                if (iOrdinal == 1) {
                    ((cil) this.c).a(7);
                } else if (iOrdinal == 2) {
                    ((cil) this.d).a(7);
                } else if (iOrdinal == 3) {
                    ((cil) this.e).a(7);
                } else if (iOrdinal == 4) {
                    ((cil) this.f).a(7);
                }
            }
            return afak.a;
        }
        cun cunVar = (cun) obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            cuo[] cuoVarArr = (cuo[]) this.a;
            if (i2 >= cuoVarArr.length) {
                return afak.a;
            }
            Object obj2 = this.b;
            Object obj3 = this.f;
            Object obj4 = this.e;
            ?? r6 = this.c;
            ?? r7 = this.d;
            cuo cuoVar = cuoVarArr[i2];
            cuoVar.getClass();
            atk.d(cunVar, cuoVar, (cto) r7.get(i3), r6.p(), ((afft) obj4).a, ((afft) obj3).a, ((atl) obj2).a);
            i2++;
            i3++;
        }
    }

    public /* synthetic */ nmy(cuo[] cuoVarArr, List list, cts ctsVar, afft afftVar, afft afftVar2, atl atlVar, int i) {
        this.g = i;
        this.a = cuoVarArr;
        this.d = list;
        this.c = ctsVar;
        this.e = afftVar;
        this.f = afftVar2;
        this.b = atlVar;
    }
}
