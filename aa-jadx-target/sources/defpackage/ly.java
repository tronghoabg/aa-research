package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ly {
    public ly() {
    }

    public static float A(defpackage.ly lyVar, int i) {
        if (lyVar instanceof fts) {
            return ((fts) lyVar).a;
        }
        return i + (-1) != 0 ? Float.MAX_VALUE : Float.MIN_VALUE;
    }

    public static void l(android.view.View view, float f) {
        try {
            hz$.ExternalSyntheticApiModelOutline2.m$1(view, f);
        } catch (java.lang.LinkageError unused) {
        }
    }

    static void m(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, android.view.View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof nq) {
                editorInfo.hintText = ((nq) parent).a();
                return;
            }
        }
    }

    public static java.lang.Object n(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void o(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static boolean p(int i) {
        return i == 1 || i == 2;
    }

    public static defpackage.cgf q(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new cia(affcVar));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a4 A[PHI: r0
  0x00a4: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:55:0x00a2, B:58:0x00ab, B:61:0x00b3, B:64:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public static java.lang.Object r(defpackage.cjc cjcVar, int i, defpackage.affc affcVar) {
        int i2;
        int i3;
        java.lang.Object objInvoke;
        defpackage.cge cgeVarO;
        defpackage.ayy ayyVarW;
        defpackage.cyg cygVar;
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar = cjcVar.q.t;
        defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVar);
        loop0: while (true) {
            i3 = 1;
            objInvoke = null;
            if (cxlVarR == null) {
                cgeVarO = null;
                break;
            }
            if ((cxlVarR.v.f.s & 1024) != 0) {
                while (cgeVar != null) {
                    if ((cgeVar.r & 1024) != 0) {
                        cgeVarO = cgeVar;
                        defpackage.bzc bzcVar = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.cjc) {
                                break loop0;
                            }
                            if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                int i4 = 0;
                                for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                    if ((cgeVar2.r & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cgeVarO = cgeVar2;
                                        } else {
                                            if (bzcVar == null) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar.n(cgeVarO);
                                            }
                                            bzcVar.n(cgeVar2);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar);
                        }
                    }
                    cgeVar = cgeVar.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
        defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
        if ((cjcVar2 != null && defpackage.afga.f(defpackage.cjv.w(cjcVar2), defpackage.cjv.w(cjcVar))) || (ayyVarW = defpackage.cjv.w(cjcVar)) == null) {
            return null;
        }
        int i5 = 5;
        if (defpackage.a.X(i, 5)) {
            i3 = i5;
        } else {
            i5 = 6;
            if (defpackage.a.X(i, 6)) {
                i3 = i5;
            } else {
                i5 = 3;
                if (defpackage.a.X(i, 3)) {
                    i3 = i5;
                } else {
                    i5 = 4;
                    if (defpackage.a.X(i, 4)) {
                        i3 = i5;
                    } else if (defpackage.a.X(i, 1)) {
                        i3 = 2;
                    } else if (!defpackage.a.X(i, 2)) {
                        throw new java.lang.IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        if (ayyVarW.b.b() <= 0 || !ayyVarW.b.e() || !ayyVarW.A) {
            return affcVar.invoke(defpackage.ayy.a);
        }
        int iC = ayyVarW.f(i3) ? ayyVarW.b.c() : ayyVarW.b.a();
        defpackage.afgv afgvVar = new defpackage.afgv();
        afgvVar.a = ayyVarW.d.P(iC, iC);
        int iD = ayyVarW.b.d();
        int i6 = iD + iD;
        int iB = ayyVarW.b.b();
        if (i6 > iB) {
            i6 = iB;
        }
        for (i2 = 0; objInvoke == null && ayyVarW.d((defpackage.ayu) afgvVar.a, i3) && i2 < i6; i2++) {
            defpackage.ayu ayuVar = (defpackage.ayu) afgvVar.a;
            int i7 = ayuVar.a;
            int i8 = ayuVar.b;
            if (ayyVarW.f(i3)) {
                i8++;
            } else {
                i7--;
            }
            defpackage.ayu ayuVarP = ayyVarW.d.P(i7, i8);
            ayyVarW.d.Q((defpackage.ayu) afgvVar.a);
            afgvVar.a = ayuVarP;
            defpackage.cjv.r(ayyVarW).D();
            objInvoke = affcVar.invoke(new defpackage.ayx(ayyVarW, afgvVar, i3));
        }
        ayyVarW.d.Q((defpackage.ayu) afgvVar.a);
        defpackage.cjv.r(ayyVarW).D();
        return objInvoke;
    }

    public static /* synthetic */ defpackage.cgf s(defpackage.cgf cgfVar, float f) {
        defpackage.cld cldVar = new chd(defpackage.cky.a).a;
        if (defpackage.dlr.a(f, 0.0f) > 0) {
            defpackage.dlr.a(f, 0.0f);
        }
        return defpackage.cjv.g(cgfVar, new chc(f, f, cldVar, 0));
    }

    public static fvl t(gfa gfaVar, androidx.car.app.model.Action action) {
        return new fvl(hlc.h(gfaVar, action.getTitle()).toString(), action.isEnabled(), new defpackage.bso(action, gfaVar, 19, null));
    }

    public static fwv u(gfa gfaVar) {
        androidx.car.app.model.Action action = androidx.car.app.model.Action.BACK;
        action.getClass();
        return fvv.d(fvv.c(action, gfaVar, gfaVar.F(ggq.class).f(), (defpackage.afer) null, false, 12), gfaVar, fxg.d, false, fwr.a, (hly) null, (fwo) null, false, 0, 244);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (defpackage.a.bi(r0.getWidth(), r0.getHeight(), z(r7) ? r0.getWidth() : fug.g(r7.b, r8), z(r7) ? r0.getHeight() : fug.g(r7.c, r8), r8) != 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap v(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, ftx r7, int r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.v(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ftx, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object w(defpackage.epy epyVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        fuc fucVar;
        java.lang.Object obj;
        defpackage.afgv afgvVar;
        java.lang.Throwable th;
        defpackage.eqf eqfVar;
        defpackage.eqf eqfVar2;
        if (afdkVar instanceof fuc) {
            fucVar = (fuc) afdkVar;
            int i = fucVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fucVar.c = i - Integer.MIN_VALUE;
            } else {
                fucVar = new fuc(afdkVar);
            }
        } else {
            fucVar = new fuc(afdkVar);
        }
        java.lang.Object obj2 = fucVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = fucVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj2);
            if (!epyVar.a().a(defpackage.epx.d)) {
                defpackage.afgv afgvVar2 = new defpackage.afgv();
                try {
                    fucVar.a = epyVar;
                    fucVar.d = afgvVar2;
                    fucVar.c = 1;
                    aiug aiugVar = new aiug(defpackage.afga.s(fucVar), 1);
                    aiugVar.z();
                    afgvVar2.a = new fud(aiugVar);
                    java.lang.Object obj3 = afgvVar2.a;
                    obj3.getClass();
                    epyVar.c((defpackage.eqf) obj3);
                    if (aiugVar.k() == afdrVar) {
                        return afdrVar;
                    }
                    obj = epyVar;
                    afgvVar = afgvVar2;
                    eqfVar2 = (defpackage.eqf) afgvVar.a;
                    if (eqfVar2 != null) {
                        ((defpackage.epy) obj).d(eqfVar2);
                    }
                } catch (java.lang.Throwable th2) {
                    obj = epyVar;
                    afgvVar = afgvVar2;
                    th = th2;
                    eqfVar = (defpackage.eqf) afgvVar.a;
                    if (eqfVar != null) {
                        ((defpackage.epy) obj).d(eqfVar);
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgvVar = fucVar.d;
            obj = fucVar.a;
            try {
                defpackage.afga.cz(obj2);
                eqfVar2 = (defpackage.eqf) afgvVar.a;
                if (eqfVar2 != null) {
                    ((defpackage.epy) obj).d(eqfVar2);
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                eqfVar = (defpackage.eqf) afgvVar.a;
                if (eqfVar != null) {
                    ((defpackage.epy) obj).d(eqfVar);
                }
                throw th;
            }
        }
        return defpackage.afbk.a;
    }

    public static void x(ajof ajofVar, ajor ajorVar) {
        ajorVar.getClass();
        if (ajofVar.i(ajorVar)) {
            return;
        }
        ajpa ajpaVarA = ajofVar.a(ajorVar);
        android.graphics.Bitmap.Config[] configArr = fug.a;
        defpackage.a.d(ajpaVarA);
    }

    public static void y(ajof ajofVar, ajor ajorVar) throws java.io.IOException {
        ajorVar.getClass();
        try {
            java.util.List<ajor> listB = ((ajog) ajofVar).c.b(ajorVar);
            java.util.ArrayList<ajor> arrayList = new java.util.ArrayList();
            for (ajor ajorVar2 : listB) {
                ajorVar2.getClass();
                arrayList.add(ajorVar2);
            }
            defpackage.afga.al(arrayList);
            java.io.IOException iOException = null;
            for (ajor ajorVar3 : arrayList) {
                try {
                    if (ajofVar.d(ajorVar3).b) {
                        y(ajofVar, ajorVar3);
                    }
                    ajofVar.h(ajorVar3);
                } catch (java.io.IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    public static boolean z(ftx ftxVar) {
        return defpackage.afga.f(ftxVar, ftx.a);
    }

    public void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, defpackage.mo moVar) {
        ((defpackage.md) view.getLayoutParams()).eX();
        rect.set(0, 0, 0, 0);
    }

    public ly(byte[] bArr) {
    }

    public void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void i(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
    }
}
