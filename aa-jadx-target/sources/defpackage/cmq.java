package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmq {
    public static final /* synthetic */ int x = 0;
    private float A;
    private defpackage.cku B;
    private android.graphics.RectF C;
    public final defpackage.cmt a;
    public boolean h;
    public defpackage.cmj i;
    public int j;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public boolean t;
    public defpackage.cjs u;
    public defpackage.cju v;
    public defpackage.cju w;
    private android.graphics.Outline z;
    public defpackage.dlo b = defpackage.cmk.a;
    public defpackage.dlz c = defpackage.dlz.a;
    public defpackage.affc d = new defpackage.bwy(8);
    private final defpackage.affc y = new defpackage.chq(this, 6);
    public boolean e = true;
    public long f = 0;
    public long g = 9205357640488583168L;
    public final defpackage.cmp k = new defpackage.cmp();

    static {
        defpackage.afga.f(android.os.Build.FINGERPRINT, "robolectric");
    }

    public cmq(defpackage.cmt cmtVar) {
        this.a = cmtVar;
        cmtVar.x(false);
        this.m = 0L;
        this.n = 0L;
        this.s = 9205357640488583168L;
    }

    private final android.graphics.Outline m() {
        android.graphics.Outline outline = this.z;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.z = outline2;
        return outline2;
    }

    private final void n() {
        this.j--;
        e();
    }

    private final void o() {
        this.B = null;
        this.v = null;
        this.g = 9205357640488583168L;
        this.f = 0L;
        this.A = 0.0f;
        this.e = true;
        this.h = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.h();
    }

    public final defpackage.cku c() {
        defpackage.cku cksVar;
        defpackage.cku ckuVar = this.B;
        defpackage.cju cjuVar = this.v;
        if (ckuVar != null) {
            return ckuVar;
        }
        if (cjuVar != null) {
            defpackage.ckr ckrVar = new defpackage.ckr(cjuVar);
            this.B = ckrVar;
            return ckrVar;
        }
        long jF = defpackage.dlv.f(this.n);
        long j = this.f;
        long j2 = this.g;
        if (j2 != 9205357640488583168L) {
            jF = j2;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + java.lang.Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + java.lang.Float.intBitsToFloat((int) (jF & 4294967295L));
        float f = this.A;
        if (f > 0.0f) {
            cksVar = new defpackage.ckt(defpackage.bzo.A(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L)));
        } else {
            cksVar = new defpackage.cks(new defpackage.cjj(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.B = cksVar;
        return cksVar;
    }

    public final void d() {
        android.graphics.Outline outlineM;
        if (this.e) {
            boolean z = this.t;
            android.graphics.Outline outline = null;
            if (z || b() > 0.0f) {
                defpackage.cju cjuVar = this.v;
                if (cjuVar != null) {
                    android.graphics.RectF rectF = this.C;
                    if (rectF == null) {
                        rectF = new android.graphics.RectF();
                        this.C = rectF;
                    }
                    android.graphics.Path path = cjuVar.a;
                    path.computeBounds(rectF, false);
                    if (android.os.Build.VERSION.SDK_INT > 28 || path.isConvex()) {
                        outlineM = m();
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            bgp$.ExternalSyntheticApiModelOutline0.m(outlineM, path);
                        } else {
                            outlineM.setConvexPath(path);
                        }
                        outlineM.offset(this.o, this.p);
                        this.h = !outlineM.canClip();
                    } else {
                        android.graphics.Outline outline2 = this.z;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.h = true;
                        outlineM = null;
                    }
                    this.v = cjuVar;
                    if (outlineM != null) {
                        outlineM.setAlpha(a());
                        outline = outlineM;
                    }
                    defpackage.cmt cmtVar = this.a;
                    cmtVar.z(outline, (4294967295L & ((long) java.lang.Math.round(rectF.height()))) | (((long) java.lang.Math.round(rectF.width())) << 32));
                    if (this.h && this.t) {
                        cmtVar.x(false);
                        cmtVar.q();
                    } else {
                        cmtVar.x(this.t);
                    }
                } else {
                    defpackage.cmt cmtVar2 = this.a;
                    cmtVar2.x(z);
                    android.graphics.Outline outlineM2 = m();
                    long jF = defpackage.dlv.f(this.n);
                    long j = this.f;
                    long j2 = this.g;
                    if (j2 != 9205357640488583168L) {
                        jF = j2;
                    }
                    long j3 = jF & 4294967295L;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (jF >> 32);
                    int i4 = (int) j3;
                    outlineM2.setRoundRect(java.lang.Math.round(java.lang.Float.intBitsToFloat(i)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat(i3)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat(i4)), this.A);
                    outlineM2.setAlpha(a());
                    cmtVar2.z(outlineM2, (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat(i4))) & 4294967295L) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat(i3))) << 32));
                }
            } else {
                defpackage.cmt cmtVar3 = this.a;
                cmtVar3.x(false);
                cmtVar3.z(null, 0L);
            }
        }
        this.e = false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005c A[LOOP:0: B:14:0x0025->B:25:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[EDGE_INSN: B:30:0x005f->B:26:0x005f BREAK  A[LOOP:0: B:14:0x0025->B:25:0x005c], SYNTHETIC] */
    public final void e() {
        int i;
        if (this.l && this.j == 0) {
            defpackage.cmp cmpVar = this.k;
            defpackage.cmq cmqVar = cmpVar.a;
            if (cmqVar != null) {
                cmqVar.n();
                cmpVar.a = null;
            }
            defpackage.aaw aawVar = cmpVar.d;
            if (aawVar != null) {
                java.lang.Object[] objArr = aawVar.b;
                long[] jArr = aawVar.a;
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
                                    ((defpackage.cmq) objArr[(i2 << 3) + i4]).n();
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
                aawVar.d();
            }
            this.a.q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[LOOP:0: B:20:0x004a->B:31:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[EDGE_INSN: B:35:0x0084->B:32:0x0084 BREAK  A[LOOP:0: B:20:0x004a->B:31:0x0081], SYNTHETIC] */
    public final void f(defpackage.cml cmlVar) {
        int i;
        defpackage.cmp cmpVar = this.k;
        cmpVar.b = cmpVar.a;
        defpackage.aaw aawVar = cmpVar.d;
        if (aawVar != null && aawVar.c()) {
            defpackage.aaw aawVar2 = cmpVar.e;
            if (aawVar2 == null) {
                defpackage.aaw aawVar3 = defpackage.aax.a;
                aawVar2 = new defpackage.aaw(6);
                cmpVar.e = aawVar2;
            }
            aawVar2.f(aawVar);
            aawVar.d();
        }
        cmpVar.c = true;
        this.d.invoke(cmlVar);
        cmpVar.c = false;
        defpackage.cmq cmqVar = cmpVar.b;
        if (cmqVar != null) {
            cmqVar.n();
        }
        defpackage.aaw aawVar4 = cmpVar.e;
        if (aawVar4 == null || !aawVar4.c()) {
            return;
        }
        java.lang.Object[] objArr = aawVar4.b;
        long[] jArr = aawVar4.a;
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
                            ((defpackage.cmq) objArr[(i2 << 3) + i4]).n();
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
        aawVar4.d();
    }

    public final void g() {
        this.a.s(this.b, this.c, this, this.y);
    }

    public final void h(float f) {
        defpackage.cmt cmtVar = this.a;
        if (cmtVar.a() == f) {
            return;
        }
        cmtVar.t(f);
    }

    public final void i(long j) {
        if (this.s == j) {
            return;
        }
        this.s = j;
        this.a.B(j);
    }

    public final void j(long j, long j2) {
        this.a.C((int) (j >> 32), (int) (4294967295L & j), j2);
    }

    public final void k(long j, long j2, float f) {
        float f2 = this.o;
        long jAh = defpackage.a.ah(j, (((long) java.lang.Float.floatToRawIntBits(this.p)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f2) << 32));
        if (this.f == jAh && this.g == j2 && this.A == f && this.v == null) {
            return;
        }
        o();
        this.f = jAh;
        this.g = j2;
        this.A = f;
        d();
    }

    public final void l(defpackage.cju cjuVar) {
        o();
        this.v = cjuVar;
        d();
    }
}
