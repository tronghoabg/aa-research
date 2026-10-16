package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gs extends android.view.MenuInflater {
    static final java.lang.Class[] a;
    static final java.lang.Class[] b;
    final java.lang.Object[] c;
    final java.lang.Object[] d;
    final android.content.Context e;
    public java.lang.Object f;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        a = clsArr;
        b = clsArr;
    }

    public gs(android.content.Context context) {
        super(context);
        this.e = context;
        java.lang.Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    private final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        boolean z;
        android.content.res.ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        defpackage.gr grVar = new defpackage.gr(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(java.lang.String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z5 = false;
        java.lang.String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    z4 = z4;
                    z3 = z2;
                    z4 = z4;
                    z3 = z2;
                    z = z3;
                    xmlPullParser = xmlPullParser;
                } else {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (!z5) {
                        z2 = false;
                    } else if (name2.equals(str)) {
                        xmlPullParser = xmlPullParser;
                        z = false;
                        str = null;
                    } else {
                        z2 = true;
                    }
                    if (name2.equals("group")) {
                        grVar.c();
                        z4 = z4;
                        z3 = z2;
                    } else if (name2.equals("item")) {
                        if (!grVar.h) {
                            dsy dsyVar = grVar.F;
                            if (dsyVar == null || !dsyVar.c()) {
                                z4 = z4;
                                z3 = z2;
                                z4 = z4;
                                z3 = z2;
                                grVar.h = true;
                                grVar.d(grVar.a.add(grVar.b, grVar.i, grVar.j, grVar.k));
                                z4 = z4;
                                z3 = z2;
                            } else {
                                z4 = z4;
                                z3 = z2;
                                grVar.a();
                                z4 = z4;
                                z3 = z2;
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z4 = z4;
                        z3 = z2;
                        z4 = true;
                        z3 = z2;
                    }
                    z4 = z4;
                    z3 = z2;
                    z4 = z4;
                    z3 = z2;
                    z = z3;
                    xmlPullParser = xmlPullParser;
                }
            } else if (z5) {
                z = true;
            } else {
                java.lang.String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes = grVar.E.e.obtainStyledAttributes(attributeSet, defpackage.ft.q);
                    grVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    grVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    grVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    grVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    grVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    grVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    z = false;
                } else {
                    if (name3.equals("item")) {
                        defpackage.gs gsVar = grVar.E;
                        int[] iArr = defpackage.ft.r;
                        android.content.Context context = gsVar.e;
                        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr));
                        grVar.i = lamVar.q(2, 0);
                        grVar.j = (lamVar.n(5, grVar.c) & (-65536)) | ((char) lamVar.n(6, grVar.d));
                        grVar.k = lamVar.u(7);
                        grVar.l = lamVar.u(8);
                        grVar.m = lamVar.q(0, 0);
                        java.lang.String strV = lamVar.v(9);
                        grVar.n = strV == null ? (char) 0 : strV.charAt(0);
                        grVar.o = lamVar.n(16, 4096);
                        java.lang.String strV2 = lamVar.v(10);
                        grVar.p = strV2 == null ? (char) 0 : strV2.charAt(0);
                        grVar.q = lamVar.n(20, 4096);
                        if (lamVar.y(11)) {
                            grVar.r = lamVar.x(11, false) ? 1 : 0;
                        } else {
                            grVar.r = grVar.e;
                        }
                        grVar.s = lamVar.x(3, false);
                        grVar.t = lamVar.x(4, grVar.f);
                        grVar.u = lamVar.x(1, grVar.g);
                        grVar.v = lamVar.n(21, -1);
                        grVar.z = lamVar.v(12);
                        grVar.w = lamVar.q(13, 0);
                        grVar.x = lamVar.v(15);
                        grVar.y = lamVar.v(14);
                        java.lang.String str2 = grVar.y;
                        if (str2 == null) {
                            grVar.F = null;
                        } else if (grVar.w == 0 && grVar.x == null) {
                            grVar.F = (dsy) grVar.b(str2, b, gsVar.d);
                        } else {
                            android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            grVar.F = null;
                        }
                        grVar.A = lamVar.u(17);
                        grVar.B = lamVar.u(22);
                        if (lamVar.y(19)) {
                            int iN = lamVar.n(19, -1);
                            android.graphics.PorterDuff.Mode mode = grVar.D;
                            android.graphics.Rect rect = defpackage.kp.a;
                            grVar.D = defpackage.a.Q(iN, mode);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            grVar.D = null;
                        }
                        if (lamVar.y(18)) {
                            grVar.C = lamVar.r(18);
                        } else {
                            grVar.C = colorStateList;
                        }
                        lamVar.w();
                        grVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name3.equals("menu")) {
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, grVar.a());
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name3;
                        z = true;
                    }
                    z = false;
                }
            }
            int next = xmlPullParser.next();
            z5 = z;
            eventType = next;
            z4 = z4;
        }
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof defpackage.dwa)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(layout);
                if (menu instanceof defpackage.hh) {
                    defpackage.hh hhVar = (defpackage.hh) menu;
                    if (!hhVar.h) {
                        hhVar.s();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((defpackage.hh) menu).r();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (java.io.IOException e) {
                throw new android.view.InflateException("Error inflating menu XML", e);
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                throw new android.view.InflateException("Error inflating menu XML", e2);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                ((defpackage.hh) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
