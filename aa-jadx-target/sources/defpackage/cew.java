package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cew implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cew(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [fir, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        long j;
        int i;
        long j2;
        int i2;
        long j3;
        defpackage.cuw cuwVar;
        char c = 7;
        long j4 = -9187201950435737472L;
        int i3 = 8;
        android.content.Context context = null;
        java.lang.Object obj = null;
        context = null;
        boolean z = true;
        int i4 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                long j5 = 128;
                java.lang.Object obj2 = this.a;
                while (true) {
                    defpackage.cez cezVar = (defpackage.cez) obj2;
                    synchronized (cezVar.e) {
                        if (((defpackage.cez) obj2).c) {
                            j = j4;
                            i = i3;
                            j2 = j5;
                        } else {
                            ((defpackage.cez) obj2).c = z;
                            try {
                                defpackage.bzc bzcVar = ((defpackage.cez) obj2).d;
                                java.lang.Object[] objArr = bzcVar.a;
                                int i5 = bzcVar.b;
                                int i6 = i4;
                                while (i6 < i5) {
                                    defpackage.cey ceyVar = (defpackage.cey) objArr[i6];
                                    defpackage.aaw aawVar = ceyVar.h;
                                    defpackage.affc affcVar = ceyVar.a;
                                    java.lang.Object[] objArr2 = aawVar.b;
                                    long[] jArr = aawVar.a;
                                    long j6 = j4;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i7 = i4;
                                        while (true) {
                                            long j7 = jArr[i7];
                                            int i8 = i3;
                                            long[] jArr2 = jArr;
                                            if ((((~j7) << 7) & j7 & j6) != j6) {
                                                int i9 = i7 - length;
                                                j3 = j5;
                                                int i10 = 0;
                                                while (true) {
                                                    int i11 = 8 - ((~i9) >>> 31);
                                                    if (i10 < i11) {
                                                        if ((j7 & 255) < j3) {
                                                            affcVar.invoke(objArr2[(i7 << 3) + i10]);
                                                        }
                                                        j7 >>= i8;
                                                        i10++;
                                                    } else {
                                                        i2 = i8;
                                                        if (i11 == i2) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                j3 = j5;
                                                i2 = i8;
                                            }
                                            if (i7 != length) {
                                                i7++;
                                                i3 = i2;
                                                j5 = j3;
                                                jArr = jArr2;
                                            }
                                        }
                                    } else {
                                        i2 = i3;
                                        j3 = j5;
                                    }
                                    aawVar.d();
                                    i6++;
                                    i3 = i2;
                                    j4 = j6;
                                    j5 = j3;
                                    i4 = 0;
                                }
                                j = j4;
                                i = i3;
                                j2 = j5;
                                ((defpackage.cez) obj2).c = false;
                            } catch (java.lang.Throwable th) {
                                ((defpackage.cez) obj2).c = false;
                                throw th;
                            }
                        }
                    }
                    if (!cezVar.e()) {
                        return defpackage.afbk.a;
                    }
                    i3 = i;
                    j4 = j;
                    j5 = j2;
                    z = true;
                    i4 = 0;
                }
                break;
            case 1:
                defpackage.fbl fblVar = ((defpackage.cdy) this.a).a;
                if (fblVar != null) {
                    android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                    fblVar.c(bundleU);
                    if (!bundleU.isEmpty()) {
                        return bundleU;
                    }
                }
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj3 = this.a;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ((defpackage.cow) obj3).c.b(afbkVar);
                return afbkVar;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ctu ctuVarA = ((defpackage.cvl) this.a).a();
                defpackage.cxl cxlVar = ctuVarA.a;
                if (ctuVarA.i != cxlVar.x().size()) {
                    defpackage.aau aauVar = ctuVarA.l;
                    java.lang.Object[] objArr3 = aauVar.c;
                    long[] jArr3 = aauVar.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j8 = jArr3[i12];
                            if ((((~j8) << c) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = i12 - length2;
                                int i14 = 0;
                                while (true) {
                                    int i15 = 8 - ((~i13) >>> 31);
                                    if (i14 < i15) {
                                        if ((j8 & 255) < 128) {
                                            ((defpackage.ctl) objArr3[(i12 << 3) + i14]).c = true;
                                        }
                                        j8 >>= 8;
                                        i14++;
                                    } else if (i15 == 8) {
                                    }
                                }
                            }
                            if (i12 != length2) {
                                i12++;
                                c = c;
                            }
                        }
                    }
                    if (cxlVar.j != null) {
                        if (!cxlVar.ak()) {
                            cxlVar.V(false, true, true);
                        }
                    } else if (!cxlVar.al()) {
                        cxlVar.X(false, true, true);
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.cxl) this.a).w.d();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cxz cxzVar = (defpackage.cxz) this.a;
                cxzVar.q().v(cxzVar.z);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cxz cxzVar2 = (defpackage.cxz) this.a;
                cxzVar2.f.h = 0;
                defpackage.bzc bzcVarK = cxzVar2.p().k();
                java.lang.Object[] objArr4 = bzcVarK.a;
                int i16 = bzcVarK.b;
                for (int i17 = 0; i17 < i16; i17++) {
                    defpackage.cxz cxzVarO = ((defpackage.cxl) objArr4[i17]).o();
                    cxzVarO.h = cxzVarO.i;
                    cxzVarO.i = Integer.MAX_VALUE;
                    cxzVarO.t = false;
                    if (cxzVarO.G == 2) {
                        cxzVarO.G = 3;
                    }
                }
                cxzVar2.l(new defpackage.bwy(12));
                if (cxzVar2.k().m) {
                    java.util.List listV = cxzVar2.p().v();
                    int size = listV.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        ((defpackage.cxl) listV.get(i18)).q().m = true;
                    }
                }
                cxzVar2.k().K().h();
                if (cxzVar2.k().m) {
                    java.util.List listV2 = cxzVar2.p().v();
                    int size2 = listV2.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        ((defpackage.cxl) listV2.get(i19)).q().m = false;
                    }
                }
                defpackage.cxl cxlVarP = cxzVar2.p();
                defpackage.bzc bzcVarK2 = cxlVarP.k();
                java.lang.Object[] objArr5 = bzcVarK2.a;
                int i20 = bzcVarK2.b;
                for (int i21 = 0; i21 < i20; i21++) {
                    defpackage.cxl cxlVar2 = (defpackage.cxl) objArr5[i21];
                    if (cxlVar2.o().h != cxlVar2.f()) {
                        cxlVarP.Q();
                        cxlVarP.G();
                        if (cxlVar2.f() == Integer.MAX_VALUE) {
                            if (cxlVar2.w.c || defpackage.dai.C(cxlVar2)) {
                                defpackage.cxw cxwVarN = cxlVar2.n();
                                cxwVarN.getClass();
                                cxwVarN.s(false);
                            }
                            cxlVar2.o().u();
                        }
                    }
                }
                cxzVar2.l(new defpackage.bwy(13));
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cxz cxzVar3 = (defpackage.cxz) this.a;
                defpackage.cyl cylVar = cxzVar3.q().x;
                defpackage.cuw cutVar = (cylVar == null || (cuwVar = cylVar.n) == null) ? new defpackage.cut(defpackage.cxo.a(cxzVar3.p())) : cuwVar;
                defpackage.affc affcVar2 = cxzVar3.C;
                defpackage.cmq cmqVar = cxzVar3.D;
                if (cmqVar != null) {
                    cutVar.v(cxzVar3.q(), cxzVar3.E, cmqVar, cxzVar3.F);
                } else if (affcVar2 == null) {
                    cutVar.s(cxzVar3.q(), cxzVar3.E, cxzVar3.F);
                } else {
                    cutVar.u(cxzVar3.q(), cxzVar3.E, cxzVar3.F, affcVar2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cyl cylVar2 = (defpackage.cyl) this.a;
                defpackage.ckc ckcVar = cylVar2.G;
                ckcVar.getClass();
                cylVar2.ai(ckcVar, cylVar2.F);
                return defpackage.afbk.a;
            case 9:
                defpackage.cyl cylVar3 = ((defpackage.cyl) this.a).x;
                if (cylVar3 != null) {
                    cylVar3.ak();
                }
                return defpackage.afbk.a;
            case 10:
                if (android.os.Build.VERSION.SDK_INT > 28) {
                    java.lang.Object obj4 = this.a;
                    if (((defpackage.czz) obj4).isAttachedToWindow()) {
                        if (defpackage.czz.d == null) {
                            defpackage.iri iriVar = new defpackage.iri(1);
                            defpackage.czz.d = iriVar;
                            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
                            try {
                                if (defpackage.czz.a == null) {
                                    defpackage.czz.a = java.lang.Class.forName("android.os.SystemProperties");
                                }
                                if (defpackage.czz.c == null) {
                                    android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                                    java.lang.Class cls = defpackage.czz.a;
                                    defpackage.czz.c = cls != null ? cls.getDeclaredMethod("addChangeCallback", java.lang.Runnable.class) : null;
                                }
                                java.lang.reflect.Method method = defpackage.czz.c;
                                if (method != null) {
                                    method.invoke(null, iriVar);
                                }
                                break;
                            } catch (java.lang.Throwable unused) {
                            }
                            android.os.StrictMode.setVmPolicy(vmPolicy);
                        }
                        defpackage.aan aanVar = defpackage.czz.L;
                        synchronized (aanVar) {
                            aanVar.p(obj4);
                        }
                    }
                }
                return defpackage.afbk.a;
            case 11:
                java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.czz) this.a).l.a();
                bool.booleanValue();
                return bool;
            case 12:
                defpackage.dwh dwhVar = new defpackage.dwh(new defpackage.dwi(a$.ExternalSyntheticApiModelOutline2.m(((defpackage.czz) this.a).M())));
                if (dwhVar.f()) {
                    dwhVar = new defpackage.dwh(new defpackage.dwi(a$.ExternalSyntheticApiModelOutline2.m()));
                }
                int iA = dwhVar.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(iA);
                while (i4 < iA) {
                    java.util.Locale localeE = dwhVar.e(i4);
                    localeE.getClass();
                    arrayList.add(new defpackage.dkk(localeE));
                    i4++;
                }
                return new defpackage.dkl(arrayList);
            case 13:
                defpackage.czz czzVar = (defpackage.czz) this.a;
                android.view.MotionEvent motionEvent = czzVar.E;
                if (motionEvent != null) {
                    java.lang.Object[] objArr6 = defpackage.afga.ac(9, 7, 8).contains(java.lang.Integer.valueOf(motionEvent.getActionMasked())) || (motionEvent.getActionMasked() == 2 && android.os.Build.VERSION.SDK_INT >= 34 && alh$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3) == true;
                    android.view.MotionEvent motionEvent2 = czzVar.E;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        z = false;
                    }
                    if (objArr6 != false && !z) {
                        czzVar.F = android.os.SystemClock.uptimeMillis();
                        czzVar.post(czzVar.R);
                    }
                }
                czzVar.H.invoke();
                return defpackage.afbk.a;
            case 14:
                defpackage.dau dauVar = ((defpackage.czz) this.a).y;
                if (dauVar != null) {
                    int childCount = dauVar.getChildCount();
                    while (i4 < childCount) {
                        android.view.View childAt = dauVar.getChildAt(i4);
                        defpackage.dmm dmmVar = childAt instanceof defpackage.dmm ? (defpackage.dmm) childAt : null;
                        if (dmmVar != null && dmmVar.isLayoutRequested()) {
                            dmmVar.layout(dmmVar.getLeft(), dmmVar.getTop(), dmmVar.getRight(), dmmVar.getBottom());
                        }
                        i4++;
                    }
                }
                return defpackage.afbk.a;
            case 15:
                java.lang.Object obj5 = this.a;
                defpackage.bvm bvmVar = defpackage.daj.a;
                defpackage.a.al((java.lang.String) obj5);
                throw new defpackage.afap();
            case 16:
                android.content.Context context2 = ((defpackage.dbi) this.a).a.getContext();
                android.content.Context baseContext = context2;
                while (baseContext instanceof android.content.ContextWrapper) {
                    if ((baseContext instanceof android.app.Activity) || (baseContext instanceof android.inputmethodservice.InputMethodService) || (baseContext instanceof android.app.Application)) {
                        context = baseContext;
                    } else {
                        android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        int i22 = fir.a;
                        fip fipVarA = fiq.b.invoke(fiq.c).a(context);
                        long jHeight = (4294967295L & ((long) fipVarA.a().height())) | (((long) fipVarA.a().width()) << 32);
                        return new dbm(jHeight, defpackage.dln.r(defpackage.dln.t(context), defpackage.dlv.f(jHeight)));
                    }
                    android.content.res.Configuration configuration = context2.getResources().getConfiguration();
                    defpackage.dlo dloVarT = defpackage.dln.t(context2);
                    long jAK = defpackage.tna.aK(configuration.screenWidthDp, configuration.screenHeightDp);
                    long jS = defpackage.dln.s(dloVarT, jAK);
                    return new dbm((4294967295L & ((long) ((int) java.lang.Float.intBitsToFloat((int) (jS & 4294967295L))))) | (((long) ((int) java.lang.Float.intBitsToFloat((int) (jS >> 32)))) << 32), jAK);
                }
                if (context != null) {
                    int i23 = fir.a;
                    fip fipVarA2 = fiq.b.invoke(fiq.c).a(context);
                    long jHeight2 = (4294967295L & ((long) fipVarA2.a().height())) | (((long) fipVarA2.a().width()) << 32);
                    return new dbm(jHeight2, defpackage.dln.r(defpackage.dln.t(context), defpackage.dlv.f(jHeight2)));
                }
                android.content.res.Configuration configuration2 = context2.getResources().getConfiguration();
                defpackage.dlo dloVarT2 = defpackage.dln.t(context2);
                long jAK2 = defpackage.tna.aK(configuration2.screenWidthDp, configuration2.screenHeightDp);
                long jS2 = defpackage.dln.s(dloVarT2, jAK2);
                return new dbm((4294967295L & ((long) ((int) java.lang.Float.intBitsToFloat((int) (jS2 & 4294967295L))))) | (((long) ((int) java.lang.Float.intBitsToFloat((int) (jS2 >> 32)))) << 32), jAK2);
            case 17:
                java.lang.Object obj6 = this.a;
                defpackage.bvm bvmVar2 = defpackage.dbl.a;
                defpackage.a.al((java.lang.String) obj6);
                throw new defpackage.afap();
            case 18:
                ((defpackage.afer) ((defpackage.afgv) this.a).a).invoke();
                return defpackage.afbk.a;
            case 19:
                java.lang.Object obj7 = this.a;
                ((defpackage.dep) obj7).f = null;
                ((defpackage.dep) obj7).c();
                return defpackage.afbk.a;
            default:
                java.util.List list = ((defpackage.dfj) this.a).c;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                    float fB = ((defpackage.dfl) obj).a.b();
                    list.getClass();
                    int size3 = list.size() - 1;
                    if (size3 > 0) {
                        int i24 = 1;
                        while (true) {
                            java.lang.Object obj8 = list.get(i24);
                            float fB2 = ((defpackage.dfl) obj8).a.b();
                            int iCompare = java.lang.Float.compare(fB, fB2);
                            if (iCompare < 0) {
                                fB = fB2;
                            }
                            if (iCompare < 0) {
                                obj = obj8;
                            }
                            if (i24 != size3) {
                                i24++;
                            }
                        }
                    }
                }
                defpackage.dfl dflVar = (defpackage.dfl) obj;
                return java.lang.Float.valueOf(dflVar != null ? dflVar.a.b() : 0.0f);
        }
    }

    public cew(java.lang.String str, int i) {
        this.b = i;
        this.a = str;
    }
}
