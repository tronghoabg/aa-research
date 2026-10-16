package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class azg {
    public defpackage.dlm b;
    public int c;
    public int d;
    public int f;
    public int g;
    final /* synthetic */ defpackage.azi h;
    public defpackage.azf[] a = defpackage.azj.a;
    public int e = 1;

    public azg(defpackage.azi aziVar) {
        this.h = aziVar;
    }

    public final void a(defpackage.axp axpVar, aiuw aiuwVar, defpackage.cjq cjqVar, int i, int i2, int i3) {
        defpackage.azf[] azfVarArr;
        defpackage.azf[] azfVarArr2 = this.a;
        int length = azfVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                defpackage.azf azfVar = azfVarArr2[i4];
                if (azfVar != null && azfVar.f) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        java.util.List list = axpVar.b;
        int size = list.size();
        int length2 = this.a.length;
        while (true) {
            azfVarArr = this.a;
            if (size >= length2) {
                break;
            }
            defpackage.azf azfVar2 = azfVarArr[size];
            if (azfVar2 != null) {
                azfVar2.c();
            }
            size++;
        }
        if (azfVarArr.length != list.size()) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.a, list.size());
            objArrCopyOf.getClass();
            this.a = (defpackage.azf[]) objArrCopyOf;
        }
        this.b = new defpackage.dlm(axpVar.g);
        this.c = i3;
        this.d = 0;
        this.e = 1;
        int size2 = list.size();
        defpackage.azi aziVar = this.h;
        for (int i5 = 0; i5 < size2; i5++) {
            java.lang.Object objG = ((defpackage.cux) list.get(i5)).g();
            defpackage.ayt aytVar = objG instanceof defpackage.ayt ? (defpackage.ayt) objG : null;
            defpackage.azf[] azfVarArr3 = this.a;
            if (aytVar == null) {
                defpackage.azf azfVar3 = azfVarArr3[i5];
                if (azfVar3 != null) {
                    azfVar3.c();
                }
                this.a[i5] = null;
            } else {
                defpackage.azf azfVar4 = azfVarArr3[i5];
                if (azfVar4 == null) {
                    azfVar4 = new defpackage.azf(aiuwVar, cjqVar, new defpackage.aln(aziVar, 16));
                    this.a[i5] = azfVar4;
                }
                azfVar4.c = aytVar.a;
                azfVar4.d = aytVar.b;
                azfVar4.e = aytVar.c;
            }
        }
    }
}
