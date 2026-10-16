package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aafo {
    public boolean a;
    public final java.lang.Object b;

    public aafo(byte[] bArr) {
        this.b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.kel(1));
    }

    public static boolean p(java.util.List list, defpackage.igo igoVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.igo igoVar2 = (defpackage.igo) it.next();
            if (igoVar2 == defpackage.igo.a || igoVar2 == igoVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(defpackage.igr igrVar, int i, java.util.List list, int i2, defpackage.iie iieVar) {
        defpackage.igs igsVarB = igrVar.b(i);
        if (!r(igsVarB, list, i2, iieVar)) {
            return false;
        }
        int i3 = igsVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return y(igrVar, i - 1, list, i2);
            }
            int iX = x(list, i2, iieVar);
            if (iX <= 0) {
                return false;
            }
            return q(igrVar, i - 1, list, i2, (defpackage.iie) iieVar.u.n().get(iX - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (y(igrVar, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static boolean r(defpackage.igs igsVar, java.util.List list, int i, defpackage.iie iieVar) {
        java.util.List list2;
        java.lang.String str = igsVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(iieVar instanceof defpackage.ihf)) {
                    return false;
                }
            } else if (!str.equals(iieVar.getClass().getSimpleName().toLowerCase(java.util.Locale.US))) {
                return false;
            }
        }
        java.util.List<defpackage.aahg> list3 = igsVar.b;
        if (list3 != null) {
            for (defpackage.aahg aahgVar : list3) {
                java.lang.Object obj = aahgVar.b;
                if (obj == "id") {
                    if (!((java.lang.String) aahgVar.c).equals(iieVar.o)) {
                        return false;
                    }
                } else if (obj != "class" || (list2 = iieVar.s) == null || !list2.contains(aahgVar.c)) {
                    return false;
                }
            }
        }
        java.util.List list4 = igsVar.c;
        if (list4 == null) {
            return true;
        }
        java.util.Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((java.lang.String) it.next()).equals("first-child") || x(list, i, iieVar) != 0) {
                return false;
            }
        }
        return true;
    }

    public static java.util.List w(defpackage.kqn kqnVar) throws org.xml.sax.SAXException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!kqnVar.r()) {
            try {
                arrayList.add(defpackage.igo.valueOf(kqnVar.n(',')));
                if (!kqnVar.t()) {
                    break;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                throw new org.xml.sax.SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private static int x(java.util.List list, int i, defpackage.iie iieVar) {
        if (i < 0) {
            return -1;
        }
        java.lang.Object obj = list.get(i);
        defpackage.iic iicVar = iieVar.u;
        if (obj != iicVar) {
            return -1;
        }
        java.util.Iterator it = iicVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((defpackage.iig) it.next()) == iieVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean y(defpackage.igr igrVar, int i, java.util.List list, int i2) {
        defpackage.igs igsVarB = igrVar.b(i);
        defpackage.iie iieVar = (defpackage.iie) list.get(i2);
        if (!r(igsVarB, list, i2, iieVar)) {
            return false;
        }
        int i3 = igsVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return y(igrVar, i - 1, list, i2 - 1);
            }
            int iX = x(list, i2, iieVar);
            if (iX <= 0) {
                return false;
            }
            return q(igrVar, i - 1, list, i2, (defpackage.iie) iieVar.u.n().get(iX - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (y(igrVar, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized double a() {
        j();
        return ((defpackage.aafv) this.b).a();
    }

    public final double b() {
        j();
        return ((defpackage.aafv) this.b).a;
    }

    public final float c() {
        j();
        return ((defpackage.aafv) this.b).b();
    }

    public final com.google.android.libraries.maps.model.CameraPosition d() {
        j();
        return ((defpackage.aafv) this.b).d();
    }

    public final com.google.android.libraries.maps.model.LatLng e(float f, float f2, boolean z) {
        j();
        return ((defpackage.aafv) this.b).i(f, f2, z);
    }

    public final defpackage.ztf f(defpackage.ztf ztfVar) {
        j();
        return ((defpackage.aafv) this.b).j(ztfVar);
    }

    public final defpackage.ztf g() {
        j();
        return ((defpackage.aafv) this.b).k();
    }

    public final synchronized defpackage.aadu h(defpackage.ztf ztfVar) {
        j();
        return ((defpackage.aafv) this.b).m(ztfVar);
    }

    public final defpackage.aaew i() {
        j();
        return ((defpackage.aafv) this.b).o();
    }

    public final void j() {
        if (this.a) {
            throw new java.lang.IllegalStateException("called outside of scope");
        }
    }

    public final void k(java.lang.Float f) {
        j();
        ((defpackage.aafv) this.b).v(f);
    }

    public final synchronized void l() {
        if (this.a) {
            return;
        }
        java.lang.Object obj = this.b;
    }

    public final synchronized void m() {
        this.a = true;
    }

    public final synchronized void n() {
        if (this.a) {
            this.a = false;
        }
    }

    public final synchronized boolean o() {
        return this.a;
    }

    public final synchronized void s(defpackage.hxg hxgVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            hxgVar.e();
            this.a = false;
            return;
        }
        ((android.os.Handler) this.b).obtainMessage(1, hxgVar).sendToTarget();
    }

    public final void t() {
        ((android.widget.CheckedTextView) this.b).getCheckMarkDrawable();
    }

    public final void u(android.util.AttributeSet attributeSet) {
        int iQ;
        int iQ2;
        java.lang.Object obj = this.b;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) obj;
        android.content.Context context = checkedTextView.getContext();
        int[] iArr = defpackage.ft.l;
        defpackage.lam lamVarC = defpackage.lam.C(context, attributeSet, iArr, com.google.android.projection.gearhead.R.attr.checkedTextViewStyle, 0);
        defpackage.ebt.m((android.view.View) obj, checkedTextView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lamVarC.a, com.google.android.projection.gearhead.R.attr.checkedTextViewStyle, 0);
        try {
            if (lamVarC.y(1) && (iQ2 = lamVarC.q(1, 0)) != 0) {
                try {
                    ((android.widget.CheckedTextView) obj).setCheckMarkDrawable(defpackage.ca.e(((android.widget.CheckedTextView) obj).getContext(), iQ2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (lamVarC.y(0)) {
                        java.lang.Object obj2 = this.b;
                        ((android.widget.CheckedTextView) obj2).setCheckMarkDrawable(defpackage.ca.e(((android.widget.CheckedTextView) obj2).getContext(), iQ));
                    }
                }
            } else if (lamVarC.y(0) && (iQ = lamVarC.q(0, 0)) != 0) {
                java.lang.Object obj3 = this.b;
                ((android.widget.CheckedTextView) obj3).setCheckMarkDrawable(defpackage.ca.e(((android.widget.CheckedTextView) obj3).getContext(), iQ));
            }
            if (lamVarC.y(2)) {
                ((android.widget.CheckedTextView) this.b).setCheckMarkTintList(lamVarC.r(2));
            }
            if (lamVarC.y(3)) {
                java.lang.Object obj4 = this.b;
                int iN = lamVarC.n(3, -1);
                android.graphics.Rect rect = defpackage.kp.a;
                ((android.widget.CheckedTextView) obj4).setCheckMarkTintMode(defpackage.a.Q(iN, null));
            }
        } finally {
            lamVarC.w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0236  */
    /* JADX WARN: Code duplicated, block: B:140:0x0244  */
    /* JADX WARN: Code duplicated, block: B:274:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [igs] */
    /* JADX WARN: Type inference failed for: r7v16, types: [igs] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [igs] */
    /* JADX WARN: Type inference failed for: r7v19, types: [igs] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final defpackage.igq v(defpackage.kqn kqnVar) throws org.xml.sax.SAXException {
        java.util.ArrayList arrayList;
        int i;
        ?? igsVar;
        int i2;
        java.lang.String str;
        java.lang.String strM;
        ?? igsVar2;
        java.lang.String strSubstring;
        defpackage.igq igqVar = new defpackage.igq();
        while (!kqnVar.r()) {
            if (!kqnVar.q("<!--") && !kqnVar.q("-->")) {
                int i3 = 1;
                int i4 = 0;
                if (!kqnVar.p('@')) {
                    java.lang.String str2 = null;
                    if (kqnVar.r()) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(1);
                        defpackage.igr igrVar = new defpackage.igr();
                        while (true) {
                            if (!kqnVar.r() && !kqnVar.r()) {
                                int i5 = kqnVar.a;
                                int i6 = 2;
                                if (igrVar.d()) {
                                    i = i4;
                                } else if (kqnVar.p('>')) {
                                    kqnVar.o();
                                    i = 2;
                                } else if (kqnVar.p('+')) {
                                    kqnVar.o();
                                    i = 3;
                                } else {
                                    i = i4;
                                }
                                if (kqnVar.p('*')) {
                                    igsVar = new defpackage.igs(i, str2);
                                } else {
                                    java.lang.String strV = kqnVar.v();
                                    if (strV != null) {
                                        defpackage.igs igsVar3 = new defpackage.igs(i, strV);
                                        igrVar.b++;
                                        igsVar = igsVar3;
                                    } else {
                                        igsVar = str2;
                                    }
                                }
                                while (!kqnVar.r()) {
                                    if (!kqnVar.p('.')) {
                                        igsVar2 = igsVar;
                                        igsVar = igsVar;
                                        if (kqnVar.p('#')) {
                                            if (igsVar == 0) {
                                                igsVar2 = new defpackage.igs(i, str2);
                                            }
                                            java.lang.String strV2 = kqnVar.v();
                                            if (strV2 == null) {
                                                throw new org.xml.sax.SAXException("Invalid \"#id\" selector in <style> element");
                                            }
                                            igsVar2.a("id", i6, strV2);
                                            igrVar.b += 10000;
                                        }
                                        if (igsVar != 0) {
                                            if (!kqnVar.p('[')) {
                                                igsVar = igsVar2;
                                                if (!kqnVar.p(':')) {
                                                    break;
                                                }
                                                int i7 = kqnVar.a;
                                                if (kqnVar.v() == null) {
                                                    break;
                                                }
                                                if (!kqnVar.p('(')) {
                                                    java.lang.String strSubstring2 = ((java.lang.String) kqnVar.c).substring(i7, kqnVar.a);
                                                    if (igsVar.c == null) {
                                                        igsVar.c = new java.util.ArrayList();
                                                    }
                                                    igsVar.c.add(strSubstring2);
                                                    igrVar.c();
                                                    break;
                                                }
                                                kqnVar.o();
                                                if (kqnVar.v() == null) {
                                                    java.lang.String strSubstring3 = ((java.lang.String) kqnVar.c).substring(i7, kqnVar.a);
                                                    if (igsVar.c == null) {
                                                        igsVar.c = new java.util.ArrayList();
                                                    }
                                                    igsVar.c.add(strSubstring3);
                                                    igrVar.c();
                                                    break;
                                                }
                                                kqnVar.o();
                                                if (!kqnVar.p(')')) {
                                                    kqnVar.a = i7 - 1;
                                                    break;
                                                }
                                                java.lang.String strSubstring4 = ((java.lang.String) kqnVar.c).substring(i7, kqnVar.a);
                                                if (igsVar.c == null) {
                                                    igsVar.c = new java.util.ArrayList();
                                                }
                                                igsVar.c.add(strSubstring4);
                                                igrVar.c();
                                                break;
                                            }
                                            kqnVar.o();
                                            java.lang.String strV3 = kqnVar.v();
                                            if (strV3 == null) {
                                                igsVar = igsVar2;
                                                throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                            }
                                            kqnVar.o();
                                            if (kqnVar.p('=')) {
                                                i2 = i6;
                                            } else if (kqnVar.q("~=")) {
                                                i2 = 3;
                                            } else {
                                                i2 = kqnVar.q("|=") ? 4 : 0;
                                            }
                                            if (i2 != 0) {
                                                igsVar = igsVar2;
                                                igsVar = igsVar2;
                                                igsVar = igsVar2;
                                                kqnVar.o();
                                                if (kqnVar.r()) {
                                                    strM = null;
                                                } else {
                                                    strM = kqnVar.m();
                                                    if (strM == null) {
                                                        igsVar = igsVar2;
                                                        strM = kqnVar.v();
                                                    }
                                                }
                                                if (strM == null) {
                                                    igsVar = igsVar2;
                                                    throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                                }
                                                igsVar = igsVar2;
                                                kqnVar.o();
                                                str = strM;
                                            } else {
                                                igsVar = igsVar2;
                                                igsVar = igsVar2;
                                                igsVar = igsVar2;
                                                igsVar = igsVar2;
                                                i2 = 0;
                                                str = null;
                                            }
                                            if (!kqnVar.p(']')) {
                                                throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
                                            }
                                            if (i2 == 0) {
                                                i2 = i3;
                                            }
                                            igsVar.a(strV3, i2, str);
                                            igrVar.c();
                                            str2 = null;
                                            i6 = 2;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        if (igsVar == 0) {
                                            igsVar = new defpackage.igs(i, str2);
                                        }
                                        java.lang.String strV4 = kqnVar.v();
                                        if (strV4 == null) {
                                            throw new org.xml.sax.SAXException("Invalid \".class\" selector in <style> element");
                                        }
                                        igsVar.a("class", i6, strV4);
                                        igrVar.c();
                                    }
                                }
                                if (igsVar == 0) {
                                    igsVar = igsVar2;
                                    kqnVar.a = i5;
                                    break;
                                }
                                igsVar = igsVar2;
                                if (igrVar.a == null) {
                                    igrVar.a = new java.util.ArrayList();
                                }
                                igrVar.a.add(igsVar);
                                if (kqnVar.t()) {
                                    arrayList.add(igrVar);
                                    igrVar = new defpackage.igr();
                                }
                                i3 = i3;
                                i4 = 0;
                                str2 = null;
                            } else {
                                break;
                            }
                        }
                        if (!igrVar.d()) {
                            arrayList.add(igrVar);
                        }
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        break;
                    }
                    if (!kqnVar.p('{')) {
                        throw new org.xml.sax.SAXException("Malformed rule block in <style> element: missing '{'");
                    }
                    kqnVar.o();
                    defpackage.ihx ihxVar = new defpackage.ihx();
                    while (true) {
                        java.lang.String strV5 = kqnVar.v();
                        kqnVar.o();
                        if (kqnVar.p(':')) {
                            kqnVar.o();
                            if (kqnVar.r()) {
                                strSubstring = null;
                            } else {
                                int i8 = kqnVar.a;
                                int iCharAt = ((java.lang.String) kqnVar.c).charAt(i8);
                                int i9 = i8;
                                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                                    if (!defpackage.kqn.w(iCharAt)) {
                                        i9 = kqnVar.a + 1;
                                    }
                                    iCharAt = kqnVar.i();
                                }
                                if (kqnVar.a > i8) {
                                    strSubstring = ((java.lang.String) kqnVar.c).substring(i8, i9);
                                } else {
                                    kqnVar.a = i8;
                                    strSubstring = null;
                                }
                            }
                            if (strSubstring != null) {
                                kqnVar.o();
                                if (kqnVar.p('!')) {
                                    kqnVar.o();
                                    if (!kqnVar.q("important")) {
                                        throw new org.xml.sax.SAXException("Malformed rule set in <style> element: found unexpected '!'");
                                    }
                                    kqnVar.o();
                                }
                                kqnVar.p(';');
                                defpackage.ijq.c(ihxVar, strV5, strSubstring);
                                kqnVar.o();
                                if (kqnVar.p('}')) {
                                    kqnVar.o();
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        defpackage.igp igpVar = new defpackage.igp((defpackage.igr) it.next(), ihxVar);
                                        if (igqVar.a == null) {
                                            igqVar.a = new java.util.ArrayList();
                                        }
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= igqVar.a.size()) {
                                                igqVar.a.add(igpVar);
                                                break;
                                            }
                                            if (((defpackage.igp) igqVar.a.get(i10)).a.b > igpVar.a.b) {
                                                igqVar.a.add(i10, igpVar);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    break;
                                }
                                if (!kqnVar.r()) {
                                }
                            }
                        }
                        throw new org.xml.sax.SAXException("Malformed rule set in <style> element");
                    }
                }
                java.lang.String strV6 = kqnVar.v();
                kqnVar.o();
                if (strV6 == null) {
                    throw new org.xml.sax.SAXException("Invalid '@' rule in <style> element");
                }
                if (this.a || !strV6.equals("media")) {
                    android.util.Log.w("AndroidSVG CSSParser", java.lang.String.format("Ignoring @%s rule", strV6));
                    while (!kqnVar.r()) {
                        int iIntValue = kqnVar.l().intValue();
                        if (iIntValue == 59) {
                            if (i4 == 0) {
                                break;
                            }
                            iIntValue = 59;
                            if (iIntValue != 123) {
                                i4++;
                            } else if (iIntValue == 125) {
                                continue;
                            }
                        } else if (iIntValue != 123) {
                            if (iIntValue == 125 && i4 > 0 && (i4 = i4 - 1) == 0) {
                                break;
                            }
                        } else {
                            i4++;
                        }
                    }
                } else {
                    java.util.List listW = w(kqnVar);
                    if (!kqnVar.p('{')) {
                        throw new org.xml.sax.SAXException("Invalid @media rule: missing rule set");
                    }
                    kqnVar.o();
                    if (p(listW, (defpackage.igo) this.b)) {
                        this.a = true;
                        igqVar.a(v(kqnVar));
                        this.a = false;
                    } else {
                        v(kqnVar);
                    }
                    if (!kqnVar.p('}')) {
                        throw new org.xml.sax.SAXException("Invalid @media rule: expected '}' at end of rule set");
                    }
                }
                kqnVar.o();
            }
        }
        return igqVar;
    }

    public aafo(defpackage.aafv aafvVar) {
        this.a = false;
        this.b = aafvVar;
    }

    public aafo(defpackage.igo igoVar) {
        this.a = false;
        this.b = igoVar;
    }

    public aafo(java.lang.Object obj) {
        this.b = obj;
    }

    public aafo() {
        this.b = new defpackage.ptm(new defpackage.qcv(0));
    }
}
