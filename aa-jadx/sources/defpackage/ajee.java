package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajee {
    private final defpackage.aitv a = new defpackage.aitv(0, defpackage.aity.a);
    public defpackage.ajef[] b;

    private final void h(int i, int i2) {
        defpackage.ajef[] ajefVarArr = this.b;
        ajefVarArr.getClass();
        defpackage.ajef ajefVar = ajefVarArr[i2];
        ajefVar.getClass();
        defpackage.ajef ajefVar2 = ajefVarArr[i];
        ajefVar2.getClass();
        ajefVarArr[i] = ajefVar;
        ajefVarArr[i2] = ajefVar2;
        ajefVar.e(i);
        ajefVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final defpackage.ajef b() {
        defpackage.ajef[] ajefVarArr = this.b;
        if (ajefVarArr != null) {
            return ajefVarArr[0];
        }
        return null;
    }

    public final defpackage.ajef c() {
        defpackage.ajef ajefVarB;
        synchronized (this) {
            ajefVarB = b();
        }
        return ajefVarB;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[LOOP:0: B:9:0x003c->B:19:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e A[EDGE_INSN: B:22:0x007e->B:20:0x007e BREAK  A[LOOP:0: B:9:0x003c->B:19:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x007e A[EDGE_INSN: B:23:0x007e->B:20:0x007e BREAK  A[LOOP:0: B:9:0x003c->B:19:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[SYNTHETIC] */
    public final defpackage.ajef d(int i) {
        int i2;
        int i3;
        defpackage.ajef[] ajefVarArr;
        int i4;
        defpackage.ajef ajefVar;
        defpackage.ajef ajefVar2;
        defpackage.ajef ajefVar3;
        defpackage.ajef ajefVar4;
        boolean z = defpackage.aiuy.a;
        defpackage.ajef[] ajefVarArr2 = this.b;
        ajefVarArr2.getClass();
        e(a() - 1);
        if (i < a()) {
            h(i, a());
            int i5 = i - 1;
            if (i <= 0) {
                while (true) {
                    i2 = i + i;
                    i3 = i2 + 1;
                    if (i3 < a()) {
                        break;
                        break;
                    }
                    ajefVarArr = this.b;
                    ajefVarArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < a()) {
                        ajefVar3 = ajefVarArr[i4];
                        ajefVar3.getClass();
                        ajefVar4 = ajefVarArr[i3];
                        ajefVar4.getClass();
                        if (((java.lang.Comparable) ajefVar3).compareTo(ajefVar4) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    ajefVar = ajefVarArr[i];
                    ajefVar.getClass();
                    ajefVar2 = ajefVarArr[i4];
                    ajefVar2.getClass();
                    if (((java.lang.Comparable) ajefVar).compareTo(ajefVar2) > 0) {
                        break;
                        break;
                    }
                    h(i, i4);
                    i = i4;
                }
            } else {
                int i6 = i5 / 2;
                defpackage.ajef ajefVar5 = ajefVarArr2[i];
                ajefVar5.getClass();
                defpackage.ajef ajefVar6 = ajefVarArr2[i6];
                ajefVar6.getClass();
                if (((java.lang.Comparable) ajefVar5).compareTo(ajefVar6) >= 0) {
                    while (true) {
                        i2 = i + i;
                        i3 = i2 + 1;
                        if (i3 < a()) {
                            break;
                        }
                        ajefVarArr = this.b;
                        ajefVarArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < a()) {
                            ajefVar3 = ajefVarArr[i4];
                            ajefVar3.getClass();
                            ajefVar4 = ajefVarArr[i3];
                            ajefVar4.getClass();
                            if (((java.lang.Comparable) ajefVar3).compareTo(ajefVar4) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        ajefVar = ajefVarArr[i];
                        ajefVar.getClass();
                        ajefVar2 = ajefVarArr[i4];
                        ajefVar2.getClass();
                        if (((java.lang.Comparable) ajefVar).compareTo(ajefVar2) > 0) {
                            break;
                        }
                        h(i, i4);
                        i = i4;
                    }
                } else {
                    h(i, i6);
                    f(i6);
                }
            }
        }
        defpackage.ajef ajefVar7 = ajefVarArr2[a()];
        ajefVar7.getClass();
        ajefVar7.d(null);
        ajefVar7.e(-1);
        ajefVarArr2[a()] = null;
        return ajefVar7;
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            defpackage.ajef[] ajefVarArr = this.b;
            ajefVarArr.getClass();
            int i2 = (i - 1) >> 1;
            defpackage.ajef ajefVar = ajefVarArr[i2];
            ajefVar.getClass();
            defpackage.ajef ajefVar2 = ajefVarArr[i];
            ajefVar2.getClass();
            if (((java.lang.Comparable) ajefVar).compareTo(ajefVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
