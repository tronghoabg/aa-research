package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cxk extends cuo implements cxr, cxu, cyn {
    private static final afec f = new bwr(11);
    private cxi g;
    private cyr h;
    public afec i;
    public afeg j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final cun n = new ctm(this);
    public cyt o;
    private aan p;

    protected static final void W(cyc cycVar) {
        cvv cvvVar;
        cyc cycVar2 = cycVar.w;
        if (!affa.f(cycVar2 != null ? cycVar2.t : null, cycVar.t)) {
            ((cxq) cycVar.ae()).w.e();
            return;
        }
        cvw cvwVarJ = cycVar.ae().j();
        if (cvwVarJ == null || (cvvVar = ((cxq) cvwVarJ).w) == null) {
            return;
        }
        cvvVar.e();
    }

    private final void eO(aap aapVar) {
        int i;
        cxb cxbVar;
        Object[] objArr = aapVar.b;
        long[] jArr = aapVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128 && (cxbVar = (cxb) ((czc) objArr[(i2 << 3) + i4]).get()) != null) {
                        if (eM()) {
                            cxbVar.U(false);
                        } else {
                            cxbVar.W(false);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public abstract long I();

    public abstract cst J();

    public abstract ctq K();

    @Override // defpackage.cxr
    public abstract cxb L();

    public final cxi M() {
        cxi cxiVar = this.g;
        if (cxiVar != null) {
            return cxiVar;
        }
        cxi cxiVar2 = new cxi(this);
        this.g = cxiVar2;
        return cxiVar2;
    }

    public abstract cxk N();

    public abstract cxk O();

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.cxb r32, defpackage.cuu r33) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxk.P(cxb, cuu):void");
    }

    public final void Q(final cyr cyrVar, final long j, final long j2) {
        boolean z;
        long j3;
        long j4;
        long j5;
        char c;
        cxb cxbVar;
        boolean z2;
        int i;
        char c2;
        cxk cxkVar;
        cyp cypVar;
        aan aanVar = this.p;
        cyt cytVar = this.o;
        if (cytVar == null) {
            cytVar = new cyt();
            this.o = cytVar;
        }
        cyt cytVar2 = cytVar;
        cym cymVar = L().k;
        if (cymVar != null && (cypVar = ((czq) cymVar).w) != null) {
            ((ces) cypVar.a).b(cyrVar, f, new afdr() { // from class: cxh
                @Override // defpackage.afdr
                public final Object invoke() {
                    cxk cxkVar2 = this.a;
                    cxkVar2.M().p();
                    cxkVar2.M().b = j;
                    cxkVar2.M().c = j2;
                    afec afecVarG = cyrVar.a.g();
                    if (afecVarG != null) {
                        afecVarG.invoke(cxkVar2.M());
                    }
                    return afak.a;
                }
            });
        }
        boolean zEM = eM();
        int i2 = cytVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = cytVar2.d[i3];
            if (b == 3) {
                aap aapVar = cytVar2.f;
                cuu cuuVar = cytVar2.b[i3];
                cuuVar.getClass();
                aapVar.h(cuuVar);
            } else if (b != 0 && aanVar != null) {
                cuu cuuVar2 = cytVar2.b[i3];
                cuuVar2.getClass();
                aap aapVar2 = (aap) aanVar.i(cuuVar2);
                if (aapVar2 != null) {
                    cytVar2.e.f(aapVar2);
                }
            }
        }
        int i4 = cytVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = cytVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                cuu[] cuuVarArr = cytVar2.b;
                cuuVarArr[i6 - i5] = cuuVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = cytVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            cytVar2.b[i8] = null;
        }
        cytVar2.a -= i5;
        cxk cxkVarO = O();
        aap aapVar3 = cytVar2.f;
        Object[] objArr = aapVar3.b;
        long[] jArr = aapVar3.a;
        int length = jArr.length - 2;
        int i9 = 8;
        if (length >= 0) {
            j3 = 128;
            j4 = 255;
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                char c3 = 7;
                j5 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j6 & 255) < 128) {
                            cuu cuuVar3 = (cuu) objArr[(i10 << 3) + i12];
                            if (cxkVarO == null) {
                                c2 = c3;
                                cxkVar = this;
                            } else {
                                c2 = c3;
                                cxkVar = cxkVarO;
                            }
                            i = i9;
                            cxk cxkVar2 = cxkVar;
                            while (true) {
                                cyt cytVar3 = cxkVar2.o;
                                if (cytVar3 != null) {
                                    z2 = zEM;
                                    if (!woy.dm(cytVar3.b, cuuVar3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zEM;
                                cxk cxkVarO2 = cxkVar2.O();
                                if (cxkVarO2 == null) {
                                    break;
                                }
                                cxkVar2 = cxkVarO2;
                                zEM = z2;
                            }
                            aan aanVar2 = cxkVar2.p;
                            aap aapVar4 = aanVar2 != null ? (aap) aanVar2.i(cuuVar3) : null;
                            if (aapVar4 != null) {
                                cxkVar.eO(aapVar4);
                            }
                        } else {
                            z2 = zEM;
                            i = i9;
                            c2 = c3;
                        }
                        j6 >>= i;
                        i12++;
                        c3 = c2;
                        i9 = i;
                        zEM = z2;
                    }
                    z = zEM;
                    c = c3;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zEM;
                    c = 7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                zEM = z;
                i9 = 8;
            }
        } else {
            z = zEM;
            j3 = 128;
            j4 = 255;
            j5 = -9187201950435737472L;
            c = 7;
        }
        aapVar3.d();
        aap aapVar5 = cytVar2.e;
        Object[] objArr2 = aapVar5.b;
        long[] jArr2 = aapVar5.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr2[i13];
                if ((((~j7) << c) & j7 & j5) != j5) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j7 & j4) < j3 && (cxbVar = (cxb) ((czc) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                cxbVar.U(false);
                            } else {
                                cxbVar.W(false);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        aapVar5.d();
    }

    public final void R(ctq ctqVar) {
        long j;
        long j2;
        if (this.m) {
            return;
        }
        afec afecVarG = ctqVar.g();
        ctqVar.i();
        ctqVar.j();
        if (afecVarG == null) {
            T();
            this.i = null;
            this.j = null;
            cxi cxiVar = this.g;
            if (cxiVar != null) {
                cxiVar.p();
            }
            cxi cxiVar2 = this.g;
            if (cxiVar2 != null) {
                cxiVar2.b = 9223372034707292159L;
                return;
            }
            return;
        }
        this.j = null;
        boolean z = this.i != afecVarG;
        if (z || !M().a) {
            j = 9223372034707292159L;
            j2 = 0;
        } else {
            cst cstVarJ = J();
            long jS = dlf.s(cstVarJ.k(0L));
            long jH = cstVarJ.h();
            z = (jS == M().b && jH == M().c) ? false : true;
            j2 = jH;
            j = jS;
        }
        if (z) {
            cyr cyrVar = this.h;
            if (cyrVar != null) {
                cyrVar.a = ctqVar;
            } else {
                cyrVar = new cyr(ctqVar, this);
                this.h = cyrVar;
            }
            Q(cyrVar, j, j2);
            this.i = ctqVar.g();
        }
    }

    public abstract void S();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            r17 = this;
            r0 = r17
            cyt r1 = r0.o
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = r1.a
            r4 = r2
        La:
            if (r4 >= r3) goto L1e
            cuu[] r5 = r1.b
            r6 = 0
            r5[r4] = r6
            float[] r5 = r1.c
            r6 = 2143289344(0x7fc00000, float:NaN)
            r5[r4] = r6
            byte[] r5 = r1.d
            r5[r4] = r2
            int r4 = r4 + 1
            goto La
        L1e:
            r1.a = r2
        L20:
            aan r1 = r0.p
            if (r1 != 0) goto L25
            return
        L25:
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L69
            r6 = r2
        L2f:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L64
            int r9 = r6 - r5
            r10 = r2
        L42:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L62
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            aap r11 = (defpackage.aap) r11
            r0.eO(r11)
        L5e:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L42
        L62:
            if (r11 != r12) goto L69
        L64:
            if (r6 == r5) goto L69
            int r6 = r6 + 1
            goto L2f
        L69:
            r1.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxk.T():void");
    }

    @Override // defpackage.cxu
    public final void U(boolean z) {
        cxk cxkVarO = O();
        cxb cxbVarL = cxkVarO != null ? cxkVarO.L() : null;
        if (affa.f(cxbVarL, L())) {
            this.k = z;
        } else {
            if ((cxbVarL == null || cxbVarL.av() != 3) && (cxbVarL == null || cxbVarL.av() != 4)) {
                return;
            }
            this.k = z;
        }
    }

    public abstract boolean V();

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f2) {
        return f2 * a();
    }

    @Override // defpackage.ctt
    public final int eB(crw crwVar) {
        int iR;
        if (V() && (iR = r(crwVar)) != Integer.MIN_VALUE) {
            return iR + ((int) (crwVar instanceof cvg ? this.e >> 32 : this.e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        return Math.round(ez(j));
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f2) {
        return dlf.l(this, f2);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f2) {
        return dln.d(this, f2);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f2) {
        return eI(ex(f2));
    }

    @Override // defpackage.cts
    public final /* synthetic */ ctq eK(int i, int i2, Map map, afec afecVar) {
        return eL(i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            crt.c(a.bB(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new cxj(i, i2, map, afecVar, afecVar2, this);
    }

    @Override // defpackage.csq
    public boolean eM() {
        return false;
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f2) {
        return (f2 / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    public abstract int r(crw crwVar);

    @Override // defpackage.cyn
    public boolean w() {
        return L().am();
    }
}
