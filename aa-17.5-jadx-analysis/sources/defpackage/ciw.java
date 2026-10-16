package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ciw implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ciw(ciu ciuVar, ciu ciuVar2, Object obj, int i, afec afecVar, int i2) {
        this.f = i2;
        this.b = ciuVar;
        this.c = ciuVar2;
        this.d = obj;
        this.a = i;
        this.e = afecVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.f;
        if (i2 == 0) {
            ?? r0 = this.c;
            csd csdVar = (csd) obj;
            if (this.b != ((czq) bzi.s(r0)).J.b()) {
                return true;
            }
            ciu ciuVar = (ciu) r0;
            boolean zN = mt.n(ciuVar, (ciu) this.d, this.a, this.e);
            Boolean boolValueOf = Boolean.valueOf(zN);
            boolValueOf.getClass();
            if (zN || !csdVar.a()) {
                return boolValueOf;
            }
            return null;
        }
        if (i2 != 1) {
            ?? r02 = this.c;
            csd csdVar2 = (csd) obj;
            if (this.b != ((czq) bzi.s(r02)).J.b()) {
                return true;
            }
            ciu ciuVar2 = (ciu) r02;
            boolean zN2 = re.n(ciuVar2, (cjb) this.d, this.a, this.e);
            Boolean boolValueOf2 = Boolean.valueOf(zN2);
            boolValueOf2.getClass();
            if (zN2 || !csdVar2.a()) {
                return boolValueOf2;
            }
            return null;
        }
        cun cunVar = (cun) obj;
        ?? r03 = this.b;
        int size = r03.size();
        for (int i3 = 0; i3 < size; i3++) {
            cunVar.x((cuo) r03.get(i3), ((afft) this.e).a * i3, 0);
        }
        ?? r04 = this.c;
        int size2 = r04.size();
        int i4 = 0;
        while (true) {
            i = this.a;
            if (i4 >= size2) {
                break;
            }
            cuo cuoVar = (cuo) r04.get(i4);
            cunVar.x(cuoVar, 0, i - cuoVar.b);
            i4++;
        }
        ?? r7 = this.d;
        int size3 = r7.size();
        for (int i5 = 0; i5 < size3; i5++) {
            cuo cuoVar2 = (cuo) r7.get(i5);
            cunVar.x(cuoVar2, 0, i - cuoVar2.b);
        }
        return afak.a;
    }

    public /* synthetic */ ciw(List list, List list2, List list3, afft afftVar, int i, int i2) {
        this.f = i2;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = afftVar;
        this.a = i;
    }
}
