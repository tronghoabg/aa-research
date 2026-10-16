package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nns implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nns(defpackage.nod nodVar, defpackage.bwx bwxVar, defpackage.cit citVar, defpackage.cit citVar2, defpackage.cit citVar3, defpackage.cit citVar4, int i) {
        this.g = i;
        this.a = nodVar;
        this.b = bwxVar;
        this.c = citVar;
        this.d = citVar2;
        this.e = citVar3;
        this.f = citVar4;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        if (this.g == 0) {
            defpackage.cja cjaVar = (defpackage.cja) obj;
            int i = defpackage.nob.a;
            cjaVar.getClass();
            if (cjaVar.b() && ((defpackage.nod) this.a).j) {
                int iOrdinal = ((defpackage.nnk) this.b.a()).ordinal();
                if (iOrdinal == 1) {
                    ((defpackage.cit) this.c).a(7);
                } else if (iOrdinal == 2) {
                    ((defpackage.cit) this.d).a(7);
                } else if (iOrdinal == 3) {
                    ((defpackage.cit) this.e).a(7);
                } else if (iOrdinal == 4) {
                    ((defpackage.cit) this.f).a(7);
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.cuw cuwVar = (defpackage.cuw) obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            defpackage.cux[] cuxVarArr = (defpackage.cux[]) this.a;
            if (i2 >= cuxVarArr.length) {
                return defpackage.afbk.a;
            }
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.f;
            java.lang.Object obj4 = this.e;
            ?? r6 = this.c;
            ?? r7 = this.d;
            defpackage.cux cuxVar = cuxVarArr[i2];
            cuxVar.getClass();
            defpackage.atp.d(cuwVar, cuxVar, (defpackage.ctx) r7.get(i3), r6.p(), ((defpackage.afgt) obj4).a, ((defpackage.afgt) obj3).a, ((defpackage.atq) obj2).a);
            i2++;
            i3++;
        }
    }

    public /* synthetic */ nns(defpackage.cux[] cuxVarArr, java.util.List list, defpackage.cub cubVar, defpackage.afgt afgtVar, defpackage.afgt afgtVar2, defpackage.atq atqVar, int i) {
        this.g = i;
        this.a = cuxVarArr;
        this.d = list;
        this.c = cubVar;
        this.e = afgtVar;
        this.f = afgtVar2;
        this.b = atqVar;
    }
}
