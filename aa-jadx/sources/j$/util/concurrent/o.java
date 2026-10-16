package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class o {
    public j$.util.concurrent.k[] a;
    public j$.util.concurrent.k b = null;
    public j$.util.concurrent.n c;
    public j$.util.concurrent.n d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public o(j$.util.concurrent.k[] kVarArr, int i, int i2, int i3) {
        this.a = kVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    public final j$.util.concurrent.k a() {
        j$.util.concurrent.k[] kVarArr;
        int length;
        int i;
        j$.util.concurrent.n nVar;
        int i2;
        int i3;
        int i4;
        int i5;
        j$.util.concurrent.k kVar = this.b;
        if (kVar != null) {
            kVar = kVar.d;
        }
        while (kVar == null) {
            if (this.f >= this.g || (kVarArr = this.a) == null || (length = kVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            j$.util.concurrent.k kVarK = j$.util.concurrent.ConcurrentHashMap.k(kVarArr, i);
            if (kVarK == null || kVarK.a >= 0) {
                kVar = kVarK;
                if (this.c != null) {
                    while (true) {
                        nVar = this.c;
                        if (nVar != null) {
                            break;
                        }
                        int i6 = this.e;
                        i3 = nVar.a;
                        i4 = i6 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.e = nVar.b;
                        this.a = nVar.c;
                        nVar.c = null;
                        j$.util.concurrent.n nVar2 = nVar.d;
                        nVar.d = this.d;
                        this.c = nVar2;
                        this.d = nVar;
                        length = i3;
                    }
                    if (nVar == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i7 = this.f + 1;
                            this.f = i7;
                            this.e = i7;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else if (kVarK instanceof j$.util.concurrent.g) {
                this.a = ((j$.util.concurrent.g) kVarK).e;
                j$.util.concurrent.n nVar3 = this.d;
                if (nVar3 != null) {
                    this.d = nVar3.d;
                } else {
                    nVar3 = new j$.util.concurrent.n();
                }
                nVar3.c = kVarArr;
                nVar3.a = length;
                nVar3.b = i;
                nVar3.d = this.c;
                this.c = nVar3;
                kVar = null;
            } else {
                kVar = kVarK instanceof j$.util.concurrent.p ? ((j$.util.concurrent.p) kVarK).f : null;
                if (this.c != null) {
                    while (true) {
                        nVar = this.c;
                        if (nVar != null) {
                            break;
                            break;
                        }
                        int i9 = this.e;
                        i3 = nVar.a;
                        i4 = i9 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                            break;
                        }
                        this.e = nVar.b;
                        this.a = nVar.c;
                        nVar.c = null;
                        j$.util.concurrent.n nVar4 = nVar.d;
                        nVar.d = this.d;
                        this.c = nVar4;
                        this.d = nVar;
                        length = i3;
                    }
                    if (nVar == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i10 = this.f + 1;
                            this.f = i10;
                            this.e = i10;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i11 = this.f + 1;
                        this.f = i11;
                        this.e = i11;
                    }
                }
            }
        }
        this.b = kVar;
        return kVar;
    }
}
