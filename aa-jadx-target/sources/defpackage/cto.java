package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cto implements defpackage.ctz {
    final /* synthetic */ defpackage.ctu a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.ctz c;
    private final /* synthetic */ defpackage.ctz d;

    public cto(defpackage.ctz ctzVar, defpackage.ctu ctuVar, int i, defpackage.ctz ctzVar2) {
        this.a = ctuVar;
        this.b = i;
        this.c = ctzVar2;
        this.d = ctzVar;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.d.f();
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.d.g();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[LOOP:0: B:5:0x0017->B:25:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[EDGE_INSN: B:29:0x0075->B:26:0x0075 BREAK  A[LOOP:0: B:5:0x0017->B:25:0x0072], SYNTHETIC] */
    @Override // defpackage.ctz
    public final void h() {
        int i;
        defpackage.ctu ctuVar = this.a;
        ctuVar.e = this.b;
        this.c.h();
        defpackage.aau aauVar = ctuVar.o;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            java.lang.Object obj = aauVar.b[i5];
                            defpackage.cvk cvkVar = (defpackage.cvk) aauVar.c[i5];
                            defpackage.bzc bzcVar = ctuVar.h;
                            int iA = bzcVar.a(obj);
                            if (iA < 0 || iA >= ctuVar.e) {
                                if (iA >= 0) {
                                    bzcVar.d(iA, defpackage.cvh.b);
                                }
                                if (defpackage.aau.f(ctuVar.n, obj)) {
                                    cvkVar.b();
                                }
                                aauVar.j(i5);
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ctuVar.h(ctuVar.d);
    }

    @Override // defpackage.ctz
    public final void i() {
        this.d.i();
    }

    @Override // defpackage.ctz
    public final void j() {
        this.d.j();
    }
}
