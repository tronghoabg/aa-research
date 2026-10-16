package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class exd {
    public final defpackage.afbz a;
    public final defpackage.afbz b;
    public defpackage.ewz c;
    public int d;
    public defpackage.exc e;
    public final ajba f = new ajba(defpackage.exe.a);
    private final ajay g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final ajba n;
    private final defpackage.aaq o;
    private final defpackage.aaq p;
    private final defpackage.aaq q;

    public exd() {
        ajba ajbaVar = new ajba(new defpackage.exa(null));
        this.n = ajbaVar;
        this.g = new ajak(ajbaVar, (aiwg) null);
        this.a = new defpackage.afbz();
        this.b = new defpackage.afbz();
        int i = defpackage.aar.a;
        this.o = new defpackage.aaq(6);
        this.p = new defpackage.aaq(6);
        this.q = new defpackage.aaq(6);
    }

    public final defpackage.ewz a(int i) {
        java.lang.Object next;
        java.lang.Object next2;
        defpackage.afbz afbzVar = this.a;
        java.lang.Object obj = null;
        if (i != -1) {
            java.util.Iterator<E> it = afbzVar.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!((defpackage.ewz) next2).e);
            defpackage.ewz ewzVar = (defpackage.ewz) next2;
            if (ewzVar != null) {
                return ewzVar;
            }
            for (java.lang.Object obj2 : this.b) {
                if (((defpackage.ewz) obj2).e) {
                    obj = obj2;
                    break;
                }
            }
            return (defpackage.ewz) obj;
        }
        java.util.Iterator<E> it2 = afbzVar.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((defpackage.ewz) next).e);
        defpackage.ewz ewzVar2 = (defpackage.ewz) next;
        if (ewzVar2 != null) {
            return ewzVar2;
        }
        for (java.lang.Object obj3 : this.b) {
            if (((defpackage.ewz) obj3).e) {
                obj = obj3;
                break;
            }
        }
        return (defpackage.ewz) obj;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bb A[LOOP:3: B:130:0x01b6->B:132:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x01d4 A[LOOP:4: B:134:0x01cf->B:136:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ed A[LOOP:5: B:138:0x01eb->B:139:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x01f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:150:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    public final void b() {
        boolean z;
        boolean z2;
        long j;
        java.lang.Object[] objArr;
        long[] jArr;
        int i;
        defpackage.exc excVar;
        java.lang.Object[] objArr2;
        long[] jArr2;
        int i2;
        defpackage.exc excVar2;
        boolean z3;
        defpackage.ewz ewzVarA;
        defpackage.ewz ewzVarA2;
        defpackage.exa exaVar;
        ajba ajbaVar;
        java.lang.Object[] objArr3;
        long[] jArr3;
        int i3;
        java.lang.Object[] objArr4;
        long[] jArr4;
        int i4;
        java.lang.Object[] objArr5;
        long[] jArr5;
        int i5;
        defpackage.afbz<defpackage.ewz> afbzVar = this.a;
        if (afbzVar.isEmpty()) {
            z = false;
            break;
        }
        java.util.Iterator<E> it = afbzVar.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((defpackage.ewz) it.next()).e) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!afbzVar.isEmpty()) {
            for (defpackage.ewz ewzVar : afbzVar) {
            }
        }
        defpackage.afbz<defpackage.ewz> afbzVar2 = this.b;
        if (afbzVar2.isEmpty()) {
            z2 = false;
            break;
        }
        java.util.Iterator<E> it2 = afbzVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((defpackage.ewz) it2.next()).e) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!afbzVar2.isEmpty()) {
            for (defpackage.ewz ewzVar2 : afbzVar2) {
            }
        }
        boolean z4 = z || z2;
        boolean z5 = this.j != z;
        boolean z6 = this.k != z;
        boolean z7 = this.h != z2;
        boolean z8 = this.i != z2;
        boolean z9 = this.l != z4;
        boolean z10 = this.m != z4;
        if (z5) {
            j = 2147483647L;
            defpackage.aaq aaqVar = this.q;
            objArr = aaqVar.b;
            jArr = aaqVar.c;
            i = aaqVar.e;
            for (int i6 = Integer.MAX_VALUE; i != i6; i6 = Integer.MAX_VALUE) {
                long[] jArr6 = jArr;
                long j2 = (jArr[i] >> 31) & 2147483647L;
                excVar = (defpackage.exc) objArr[i];
                if (z5) {
                    excVar.a();
                }
                if (z6) {
                    excVar.c(z);
                }
                i = (int) j2;
                jArr = jArr6;
            }
        } else if (z6) {
            z6 = true;
            j = 2147483647L;
            defpackage.aaq aaqVar2 = this.q;
            objArr = aaqVar2.b;
            jArr = aaqVar2.c;
            i = aaqVar2.e;
            while (i != i6) {
                long[] jArr7 = jArr;
                long j3 = (jArr[i] >> 31) & 2147483647L;
                excVar = (defpackage.exc) objArr[i];
                if (z5) {
                    excVar.a();
                }
                if (z6) {
                    excVar.c(z);
                }
                i = (int) j3;
                jArr = jArr7;
            }
        } else {
            j = 2147483647L;
        }
        if (z7) {
            defpackage.aaq aaqVar3 = this.p;
            objArr2 = aaqVar3.b;
            jArr2 = aaqVar3.c;
            i2 = aaqVar3.e;
            while (i2 != Integer.MAX_VALUE) {
                long j4 = (jArr2[i2] >> 31) & j;
                excVar2 = (defpackage.exc) objArr2[i2];
                if (z7) {
                    excVar2.a();
                }
                if (z8) {
                    excVar2.c(z2);
                }
                i2 = (int) j4;
            }
        } else if (z8) {
            z8 = true;
            defpackage.aaq aaqVar4 = this.p;
            objArr2 = aaqVar4.b;
            jArr2 = aaqVar4.c;
            i2 = aaqVar4.e;
            while (i2 != Integer.MAX_VALUE) {
                long j5 = (jArr2[i2] >> 31) & j;
                excVar2 = (defpackage.exc) objArr2[i2];
                if (z7) {
                    excVar2.a();
                }
                if (z8) {
                    excVar2.c(z2);
                }
                i2 = (int) j5;
            }
        }
        if (!z9) {
            if (z10) {
                z3 = true;
            }
            this.j = z;
            this.k = z;
            this.h = z2;
            this.i = z2;
            this.l = z4;
            this.m = z4;
            ewzVarA = this.c;
            if (ewzVarA == null) {
                ewzVarA = a(0);
            }
            ewzVarA2 = this.c;
            if (ewzVarA2 == null) {
                ewzVarA2 = a(0);
            }
            if (defpackage.afga.f(ewzVarA2, ewzVarA)) {
                if (ewzVarA2 == null) {
                    exaVar = new defpackage.exa(null);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (defpackage.ewz ewzVar3 : afbzVar) {
                        if (ewzVar3.e) {
                            java.util.List list = ewzVar3.c;
                        }
                    }
                    for (defpackage.ewz ewzVar4 : afbzVar2) {
                        if (ewzVar4.e) {
                            java.util.List list2 = ewzVar4.c;
                        }
                    }
                    exaVar = new defpackage.exa(ewzVarA2.b, arrayList, ewzVarA2.d, arrayList.size());
                }
                ajbaVar = this.n;
                if (defpackage.afga.f((defpackage.exa) ajbaVar.b(), exaVar)) {
                }
                ajbaVar.d(exaVar);
                defpackage.aaq aaqVar5 = this.q;
                objArr3 = aaqVar5.b;
                jArr3 = aaqVar5.c;
                i3 = aaqVar5.e;
                while (i3 != Integer.MAX_VALUE) {
                    long j6 = (jArr3[i3] >> 31) & j;
                    i3 = (int) j6;
                }
                defpackage.aaq aaqVar6 = this.p;
                objArr4 = aaqVar6.b;
                jArr4 = aaqVar6.c;
                i4 = aaqVar6.e;
                while (i4 != Integer.MAX_VALUE) {
                    long j7 = (jArr4[i4] >> 31) & j;
                    i4 = (int) j7;
                }
                defpackage.aaq aaqVar7 = this.o;
                objArr5 = aaqVar7.b;
                jArr5 = aaqVar7.c;
                i5 = aaqVar7.e;
                while (i5 != Integer.MAX_VALUE) {
                    long j8 = (jArr5[i5] >> 31) & j;
                    i5 = (int) j8;
                }
            }
            return;
        }
        z3 = z10;
        defpackage.aaq aaqVar8 = this.o;
        java.lang.Object[] objArr6 = aaqVar8.b;
        long[] jArr8 = aaqVar8.c;
        int i7 = aaqVar8.e;
        while (i7 != Integer.MAX_VALUE) {
            long j9 = (jArr8[i7] >> 31) & j;
            defpackage.exc excVar3 = (defpackage.exc) objArr6[i7];
            if (z9) {
                excVar3.a();
            }
            if (z3) {
                excVar3.c(z4);
            }
            i7 = (int) j9;
        }
        this.j = z;
        this.k = z;
        this.h = z2;
        this.i = z2;
        this.l = z4;
        this.m = z4;
        ewzVarA = this.c;
        if (ewzVarA == null) {
            ewzVarA = a(0);
        }
        ewzVarA2 = this.c;
        if (ewzVarA2 == null) {
            ewzVarA2 = a(0);
        }
        if (defpackage.afga.f(ewzVarA2, ewzVarA)) {
            return;
        }
        if (ewzVarA2 == null) {
            exaVar = new defpackage.exa(null);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (r1.hasNext()) {
                if (ewzVar3.e) {
                    java.util.List list3 = ewzVar3.c;
                }
            }
            while (r1.hasNext()) {
                if (ewzVar4.e) {
                    java.util.List list4 = ewzVar4.c;
                }
            }
            exaVar = new defpackage.exa(ewzVarA2.b, arrayList2, ewzVarA2.d, arrayList2.size());
        }
        ajbaVar = this.n;
        if (defpackage.afga.f((defpackage.exa) ajbaVar.b(), exaVar)) {
            ajbaVar.d(exaVar);
            defpackage.aaq aaqVar9 = this.q;
            objArr3 = aaqVar9.b;
            jArr3 = aaqVar9.c;
            i3 = aaqVar9.e;
            while (i3 != Integer.MAX_VALUE) {
                long j10 = (jArr3[i3] >> 31) & j;
                i3 = (int) j10;
            }
            defpackage.aaq aaqVar10 = this.p;
            objArr4 = aaqVar10.b;
            jArr4 = aaqVar10.c;
            i4 = aaqVar10.e;
            while (i4 != Integer.MAX_VALUE) {
                long j11 = (jArr4[i4] >> 31) & j;
                i4 = (int) j11;
            }
            defpackage.aaq aaqVar11 = this.o;
            objArr5 = aaqVar11.b;
            jArr5 = aaqVar11.c;
            i5 = aaqVar11.e;
            while (i5 != Integer.MAX_VALUE) {
                long j12 = (jArr5[i5] >> 31) & j;
                i5 = (int) j12;
            }
        }
    }

    public final void c(defpackage.mku mkuVar, defpackage.exc excVar, int i) {
        defpackage.aaq aaqVar;
        boolean z;
        if (i != 0) {
            aaqVar = i != 1 ? this.o : this.p;
        } else {
            aaqVar = this.q;
        }
        aaqVar.d(excVar);
        defpackage.mku mkuVar2 = excVar.d;
        if (mkuVar2 != null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bv(mkuVar2, excVar, "Input '", "' is already added to dispatcher ", "."));
        }
        excVar.d = mkuVar;
        ((defpackage.exa) this.g.b()).getClass();
        if (i != 0) {
            z = i != 1 ? this.m : this.i;
        } else {
            z = this.k;
        }
        excVar.c(z);
    }
}
