package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cey {
    public final defpackage.affc a;
    public java.lang.Object b;
    public int c = -1;
    public final defpackage.bvs d;
    public boolean e;
    public int f;
    public defpackage.aal g;
    public final defpackage.aaw h;
    public final defpackage.aau i;
    public final defpackage.aau j;
    private defpackage.bzc k;
    private defpackage.aau l;
    private defpackage.aau m;
    private defpackage.aaw n;
    private defpackage.aau o;
    private defpackage.aau p;

    public cey(defpackage.affc affcVar) {
        this.a = affcVar;
        defpackage.aaw aawVar = this.n;
        if (aawVar == null) {
            aawVar = new defpackage.aaw(6);
            this.n = aawVar;
        }
        this.h = aawVar;
        this.d = new defpackage.cex(this, 0);
        defpackage.aau aauVar = this.o;
        if (aauVar == null) {
            long[] jArr = defpackage.aav.a;
            aauVar = new defpackage.aau(6);
            this.o = aauVar;
        }
        this.i = aauVar;
        defpackage.aau aauVar2 = this.p;
        if (aauVar2 == null) {
            aauVar2 = new defpackage.aau(6);
            this.p = aauVar2;
        }
        this.j = aauVar2;
    }

    public final defpackage.bzc a() {
        defpackage.bzc bzcVar = this.k;
        if (bzcVar != null) {
            return bzcVar;
        }
        defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.bvr[16]);
        this.k = bzcVar2;
        return bzcVar2;
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.bzg.c(e(), obj2, obj);
        if (!(obj2 instanceof defpackage.bvr) || defpackage.aau.f(e(), obj2)) {
            return;
        }
        defpackage.bzg.b(this.i, obj2);
        this.j.i(obj2);
    }

    public final boolean c() {
        return d().e();
    }

    public final defpackage.aau d() {
        defpackage.aau aauVar = this.m;
        if (aauVar != null) {
            return aauVar;
        }
        defpackage.aau aauVar2 = new defpackage.aau(6);
        this.m = aauVar2;
        return aauVar2;
    }

    public final defpackage.aau e() {
        defpackage.aau aauVar = this.l;
        if (aauVar != null) {
            return aauVar;
        }
        long[] jArr = defpackage.aav.a;
        defpackage.aau aauVar2 = new defpackage.aau(6);
        this.l = aauVar2;
        return aauVar2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[LOOP:0: B:11:0x0038->B:25:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[EDGE_INSN: B:34:0x007d->B:26:0x007d BREAK  A[LOOP:0: B:11:0x0038->B:25:0x007a], SYNTHETIC] */
    public final void f(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.aal aalVar) {
        int i2;
        if (this.f > 0) {
            return;
        }
        int iH = aalVar.h(obj, i);
        if ((obj instanceof defpackage.bvr) && iH != i) {
            defpackage.bvq bvqVarE = ((defpackage.bvr) obj).e();
            this.j.m(obj, bvqVarE.e);
            defpackage.aal aalVar2 = bvqVarE.d;
            defpackage.aau aauVar = this.i;
            defpackage.bzg.b(aauVar, obj);
            java.lang.Object[] objArr = aalVar2.b;
            long[] jArr = aalVar2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = ~(i3 - length);
                        int i5 = 0;
                        while (true) {
                            i2 = 8 - (i4 >>> 31);
                            if (i5 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                defpackage.cfc cfcVar = (defpackage.cfc) objArr[(i3 << 3) + i5];
                                if (cfcVar instanceof defpackage.cfd) {
                                    ((defpackage.cfd) cfcVar).i(2);
                                }
                                defpackage.bzg.a(aauVar, cfcVar, obj);
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (iH == -1) {
            if (obj instanceof defpackage.cfd) {
                ((defpackage.cfd) obj).i(2);
            }
            defpackage.bzg.a(e(), obj, obj2);
        }
    }
}
