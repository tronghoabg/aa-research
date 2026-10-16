package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wva {
    public static boolean A(xrr xrrVar) {
        xsa xsaVar = xrrVar.b;
        if ((xsaVar != null ? xsaVar.e : 1.0f) > 1.0f) {
            return true;
        }
        xsc xscVar = xrrVar.d;
        if ((xscVar != null ? xscVar.d : 1.0f) > 1.0f) {
            return true;
        }
        xsf xsfVar = xrrVar.e;
        if ((xsfVar != null ? xsfVar.d : 1.0f) > 1.0f) {
            return true;
        }
        xrn xrnVar = xrrVar.f;
        if ((xrnVar != null ? xrnVar.l : 1.0f) > 1.0f) {
            return true;
        }
        xrn xrnVar2 = xrrVar.g;
        if ((xrnVar2 != null ? xrnVar2.l : 1.0f) > 1.0f) {
            return true;
        }
        xsd xsdVar = xrrVar.h;
        if ((xsdVar != null ? xsdVar.h : 1.0f) > 1.0f) {
            return true;
        }
        xrt xrtVar = xrrVar.i;
        if ((xrtVar != null ? xrtVar.b : 1.0f) > 1.0f) {
            return true;
        }
        xro xroVar = xrrVar.j;
        return (xroVar != null ? xroVar.m : 1.0f) > 1.0f;
    }

    public static void B(boolean z) {
        xrq.a.b(java.lang.Boolean.valueOf(z));
    }

    public static /* synthetic */ java.lang.String C(int i) {
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "STATUS_PHONE_WIFI_DISABLED";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "STATUS_INSTRUCT_USER_TO_CHECK_THE_PHONE";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "STATUS_NO_SUPPORTED_WIFI_CHANNELS";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "STATUS_INVALID_HOST";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STATUS_WIFI_NOT_YET_STARTED";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return "STATUS_WIFI_DISABLED";
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return "STATUS_PROJECTION_ALREADY_STARTED";
            case 9:
                return "STATUS_WIFI_INCORRECT_CREDENTIALS";
            case 10:
                return "STATUS_WIFI_INACCESSIBLE_CHANNEL";
            case 11:
                return "STATUS_NO_COMPATIBLE_VERSION";
            case 12:
                return "STATUS_SUCCESS";
            case 13:
                return "STATUS_UNSOLICITED_MESSAGE";
            default:
                return "STATUS_WIFI_NETWORK_UNAVAILABLE";
        }
    }

    public static int D(int i) {
        switch (i) {
            case -11:
                return 1;
            case -10:
                return 2;
            case -9:
                return 3;
            case -8:
                return 4;
            case -7:
                return 5;
            case -6:
                return 6;
            case -5:
                return 7;
            case -4:
                return 8;
            case -3:
                return 9;
            case -2:
                return 10;
            case -1:
                return 11;
            case defpackage.abnt.b /* 0 */:
                return 12;
            case 1:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ java.lang.String E(int i) {
        if (i != 1) {
            return i != 2 ? "CONNECTION_REJECTION_REASON_INVALID_SETUP_TOKEN" : "CONNECTION_REJECTION_REASON_MOBILE_DEVICE_ID_NOT_FOUND";
        }
        return "CONNECTION_REJECTION_REASON_UNKNOWN";
    }

    public static void d(android.view.View view, float f) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof defpackage.wvd) {
            ((defpackage.wvd) background).N(f);
        }
    }

    public static void e(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof defpackage.wvd) {
            f(view, (defpackage.wvd) background);
        }
    }

    public static void f(android.view.View view, defpackage.wvd wvdVar) {
        defpackage.wpw wpwVar = wvdVar.p.b;
        if (wpwVar == null || !wpwVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            elevation += ((android.view.View) parent).getElevation();
        }
        defpackage.wvb wvbVar = wvdVar.p;
        if (wvbVar.n != elevation) {
            wvbVar.n = elevation;
            wvdVar.W();
        }
    }

    public static android.graphics.RectF g(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view) {
        if (view == null) {
            return new android.graphics.RectF();
        }
        if (tabLayout.w || !(view instanceof wxf)) {
            return new android.graphics.RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        wxf wxfVar = (wxf) view;
        android.view.View[] viewArr = {wxfVar.a, wxfVar.b, wxfVar.c};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            android.view.View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? java.lang.Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? java.lang.Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        android.view.View[] viewArr2 = {wxfVar.a, wxfVar.b, wxfVar.c};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            android.view.View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? java.lang.Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? java.lang.Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iE = (int) defpackage.wqn.e(wxfVar.getContext(), 24);
        if (i2 < iE) {
            i2 = iE;
        }
        int left = (wxfVar.getLeft() + wxfVar.getRight()) / 2;
        int top = (wxfVar.getTop() + wxfVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new android.graphics.RectF(left - i5, top - (i4 / 2), left + i5, (left / 2) + top);
    }

    public static boolean i(float f, float f2) {
        return java.lang.Math.abs(f) > java.lang.Math.abs(f2);
    }

    public static /* synthetic */ xjd j(defpackage.abor aborVar) {
        xjd xjdVarQ = aborVar.q();
        xjdVarQ.getClass();
        return xjdVarQ;
    }

    public static void k(xhm xhmVar, defpackage.abor aborVar) {
        aborVar.t();
        xjd xjdVar = aborVar.b;
        defpackage.abpg abpgVar = xjd.a;
        xjdVar.e = xhmVar;
        xjdVar.d = 1;
    }

    public static /* synthetic */ void l(xhi xhiVar, defpackage.abor aborVar) {
        aborVar.t();
        xjd xjdVar = aborVar.b;
        defpackage.abpg abpgVar = xjd.a;
        defpackage.abpf abpfVar = xjdVar.g;
        if (!abpfVar.c()) {
            xjdVar.g = defpackage.abox.G(abpfVar);
        }
        xjdVar.g.g(xhiVar.a());
    }

    public static void m(int i, defpackage.abor aborVar) {
        aborVar.t();
        xjd xjdVar = aborVar.b;
        defpackage.abpg abpgVar = xjd.a;
        xjdVar.h = defpackage.adrq.x(i);
        xjdVar.c |= 2;
    }

    public static /* synthetic */ void n(defpackage.abor aborVar) {
        new abrl(new defpackage.abph(aborVar.b.g, xjd.a));
    }

    public static /* synthetic */ xhb o(defpackage.abor aborVar) {
        xhb xhbVarQ = aborVar.q();
        xhbVarQ.getClass();
        return xhbVarQ;
    }

    public static void p(int i, defpackage.abor aborVar) {
        aborVar.t();
        xhb xhbVar = aborVar.b;
        xhb xhbVar2 = xhb.a;
        xhbVar.c = defpackage.adrq.A(i);
        xhbVar.b |= 1;
    }

    public static /* synthetic */ xhc q(defpackage.abor aborVar) {
        xhc xhcVarQ = aborVar.q();
        xhcVarQ.getClass();
        return xhcVarQ;
    }

    public static void r(xhb xhbVar, defpackage.abor aborVar) {
        aborVar.t();
        xhc xhcVar = aborVar.b;
        xhc xhcVar2 = xhc.a;
        xhcVar.c = xhbVar;
        xhcVar.b |= 1;
    }

    public static /* synthetic */ int s(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ boolean t(int i) {
        return s(i) != 0;
    }

    static defpackage.wpu u(int i) {
        return i != 1 ? new defpackage.wvg() : new wuz();
    }

    public static xrr v(java.util.List list) {
        xrr xrrVar = (xrr) defpackage.afga.aB(list);
        if (xrrVar == null) {
            xrrVar = new xrr((byte[]) null);
        }
        return defpackage.wpu.R(xrrVar, new xsy(list));
    }

    public static xsj w(defpackage.affc affcVar) {
        xsj xsjVar = new xsj();
        affcVar.invoke(xsjVar);
        return xsjVar;
    }

    public static java.lang.Object x(java.util.Map map, xud xudVar, java.lang.Object obj) {
        xudVar.getClass();
        return map.containsKey(xudVar) ? map.get(xudVar) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List y(xrr xrrVar) {
        char c;
        java.lang.String str;
        char c2;
        xrp xrpVar;
        xse xseVar = new xse(xrrVar.a.l);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(xrrVar.b != null);
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(xrrVar.c != null);
        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(xrrVar.d != null);
        java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(xrrVar.e != null);
        java.lang.Boolean boolValueOf5 = java.lang.Boolean.valueOf(xrrVar.f != null);
        java.lang.Boolean boolValueOf6 = java.lang.Boolean.valueOf(xrrVar.g != null);
        java.lang.Boolean boolValueOf7 = java.lang.Boolean.valueOf(xrrVar.h != null);
        java.lang.Boolean boolValueOf8 = java.lang.Boolean.valueOf(xrrVar.i != null);
        xro xroVar = xrrVar.j;
        java.lang.Boolean boolValueOf9 = java.lang.Boolean.valueOf(xroVar != null);
        xrz xrzVar = xrrVar.k;
        java.lang.Boolean boolValueOf10 = java.lang.Boolean.valueOf(xrzVar != null);
        if (xroVar != null) {
            c = 0;
            str = xroVar.a;
        } else {
            c = 0;
            str = null;
            xroVar = null;
        }
        if (str != null) {
            c2 = 1;
            xrpVar = new xrp(str);
        } else {
            c2 = 1;
            xrpVar = null;
        }
        java.lang.Boolean bool = xroVar != null ? java.lang.Boolean.FALSE : null;
        java.lang.Boolean boolValueOf11 = java.lang.Boolean.valueOf(!defpackage.afga.e(xrzVar != null ? java.lang.Float.valueOf(xrzVar.l) : null, 0.0f));
        java.lang.Boolean boolValueOf12 = java.lang.Boolean.valueOf(xrrVar.l != null ? c2 : c);
        java.lang.Boolean boolValueOf13 = java.lang.Boolean.valueOf(A(xrrVar));
        java.lang.Object[] objArr = new java.lang.Object[17];
        objArr[c] = xseVar;
        objArr[c2] = boolValueOf;
        objArr[2] = boolValueOf2;
        objArr[3] = boolValueOf3;
        objArr[4] = boolValueOf4;
        objArr[5] = boolValueOf5;
        objArr[6] = boolValueOf6;
        objArr[7] = boolValueOf7;
        objArr[8] = boolValueOf8;
        objArr[9] = boolValueOf9;
        objArr[10] = boolValueOf10;
        objArr[11] = xrpVar;
        objArr[12] = bool;
        objArr[13] = boolValueOf11;
        objArr[14] = java.lang.Boolean.FALSE;
        objArr[15] = boolValueOf12;
        objArr[16] = boolValueOf13;
        return defpackage.afga.ac(objArr);
    }

    public static void z(xrn xrnVar, java.util.Map map) {
        xua xuaVar = new xua(xrnVar.a);
        map.put(xuaVar.c, java.lang.Float.valueOf(xrnVar.b));
        map.put(xuaVar.d, java.lang.Float.valueOf(xrnVar.c));
        map.put(xuaVar.e, java.lang.Float.valueOf(xrnVar.d));
        map.put(xuaVar.f, java.lang.Float.valueOf(xrnVar.e));
        map.put(xuaVar.g, java.lang.Float.valueOf(xrnVar.f));
        map.put(xuaVar.h, java.lang.Integer.valueOf(xrnVar.j));
        map.put(xuaVar.k, java.lang.Float.valueOf(xrnVar.g));
        map.put(xuaVar.i, java.lang.Float.valueOf(xrnVar.i));
        map.put(xuaVar.j, java.lang.Float.valueOf(xrnVar.h));
        map.put(xuaVar.b, java.lang.Float.valueOf(xrnVar.k));
        map.put(xuaVar.l, java.lang.Float.valueOf(xrnVar.l));
    }

    public void a(float f, float f2, float f3, defpackage.wvs wvsVar) {
        wvsVar.d(f, 0.0f);
    }

    public void h(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        android.graphics.RectF rectFG = g(tabLayout, view);
        android.graphics.RectF rectFG2 = g(tabLayout, view2);
        drawable.setBounds(wlm.b((int) rectFG.left, (int) rectFG2.left, f), drawable.getBounds().top, wlm.b((int) rectFG.right, (int) rectFG2.right, f), drawable.getBounds().bottom);
    }

    public void b() {
    }

    public void c(int i) {
    }
}
