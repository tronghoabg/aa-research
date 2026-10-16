package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    final android.util.SparseArray a;
    public final java.util.ArrayList b;
    protected final defpackage.dqw c;
    protected boolean d;
    public int e;
    public defpackage.dsf f;
    final defpackage.drw g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private java.util.HashMap m;
    private final android.util.SparseArray n;

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dqw();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.g = new defpackage.drw(this, this);
        e(null, 0, 0);
    }

    private final void e(android.util.AttributeSet attributeSet, int i, int i2) {
        defpackage.dqw dqwVar = this.c;
        dqwVar.aq = this;
        dqwVar.af(this.g);
        this.a.put(getId(), this);
        this.f = null;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dsj.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.h);
                } else if (index == 17) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.i);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.e = typedArrayObtainStyledAttributes.getInt(113, this.e);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            defpackage.dsn.t(getContext(), resourceId, new android.util.SparseArray(), new android.util.SparseArray());
                        } catch (android.content.res.Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        defpackage.dsf dsfVar = new defpackage.dsf();
                        this.f = dsfVar;
                        dsfVar.k(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.f = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.ag(this.e);
    }

    private final void f() {
        this.d = true;
    }

    private final void g() {
        int i;
        int i2;
        defpackage.dqv dqvVar;
        defpackage.dqv dqvVar2;
        defpackage.dqv dqvVar3;
        defpackage.dqv dqvVar4;
        boolean z;
        defpackage.dqv dqvVar5;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this;
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            defpackage.dqv dqvVarB = constraintLayout.b(constraintLayout.getChildAt(i3));
            if (dqvVarB != null) {
                dqvVarB.u();
            }
        }
        if (zIsInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt = constraintLayout.getChildAt(i4);
                try {
                    java.lang.String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
                    if (resourceName instanceof java.lang.String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new java.util.HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        java.lang.String strSubstring = iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName;
                        numValueOf.getClass();
                        constraintLayout.m.put(strSubstring, java.lang.Integer.valueOf(id));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        dqvVar5 = constraintLayout.c;
                    } else {
                        android.view.View viewFindViewById = (android.view.View) constraintLayout.a.get(id2);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        dqvVar5 = viewFindViewById == constraintLayout ? constraintLayout.c : viewFindViewById == null ? null : ((defpackage.drv) viewFindViewById.getLayoutParams()).av;
                    }
                    dqvVar5.as = resourceName;
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                dsg childAt2 = constraintLayout.getChildAt(i5);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof dsg)) {
                    throw null;
                }
            }
        }
        defpackage.dsf dsfVar = constraintLayout.f;
        if (dsfVar != null) {
            dsfVar.q(constraintLayout);
        }
        defpackage.dqw dqwVar = constraintLayout.c;
        dqwVar.ao();
        java.util.ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                defpackage.drt drtVar = (defpackage.drt) arrayList.get(i6);
                if (drtVar.isInEditMode()) {
                    drtVar.h(drtVar.f);
                }
                defpackage.dra draVar = drtVar.i;
                if (draVar != null) {
                    draVar.aM = 0;
                    java.util.Arrays.fill(draVar.aL, (java.lang.Object) null);
                    for (int i7 = 0; i7 < drtVar.d; i7++) {
                        int i8 = drtVar.c[i7];
                        android.view.View viewA = constraintLayout.a(i8);
                        if (viewA == null) {
                            java.util.HashMap map = drtVar.h;
                            java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i8));
                            int iD = drtVar.d(constraintLayout, str);
                            if (iD != 0) {
                                drtVar.c[i7] = iD;
                                map.put(java.lang.Integer.valueOf(iD), str);
                                viewA = constraintLayout.a(iD);
                            }
                        }
                        if (viewA != null) {
                            drtVar.i.af(constraintLayout.b(viewA));
                        }
                    }
                    drtVar.i.ah();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt3 = constraintLayout.getChildAt(i9);
            if (childAt3 instanceof defpackage.dsh) {
                throw null;
            }
        }
        android.util.SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, dqwVar);
        sparseArray.put(constraintLayout.getId(), dqwVar);
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt4 = constraintLayout.getChildAt(i10);
            sparseArray.put(childAt4.getId(), constraintLayout.b(childAt4));
        }
        int i11 = 0;
        while (i11 < childCount) {
            android.view.View childAt5 = constraintLayout.getChildAt(i11);
            defpackage.dqv dqvVarB2 = constraintLayout.b(childAt5);
            if (dqvVarB2 == null) {
                z = z2;
            } else {
                defpackage.drv drvVar = (defpackage.drv) childAt5.getLayoutParams();
                dqwVar.am(dqvVarB2);
                drvVar.a();
                drvVar.aw = z2;
                dqvVarB2.ar = childAt5.getVisibility();
                boolean z3 = drvVar.aj;
                dqvVarB2.aq = childAt5;
                if (childAt5 instanceof defpackage.drt) {
                    ((defpackage.drt) childAt5).c(dqvVarB2, dqwVar.d);
                }
                if (drvVar.ah) {
                    defpackage.dqz dqzVar = (defpackage.dqz) dqvVarB2;
                    int i12 = drvVar.as;
                    int i13 = drvVar.at;
                    float f = drvVar.au;
                    if (f != -1.0f) {
                        dqzVar.af(f);
                    } else if (i12 != -1) {
                        dqzVar.c(i12);
                    } else if (i13 != -1) {
                        dqzVar.ae(i13);
                    }
                    z = z2;
                } else {
                    int i14 = drvVar.al;
                    int i15 = drvVar.am;
                    int i16 = drvVar.an;
                    int i17 = drvVar.ao;
                    int i18 = drvVar.ap;
                    int i19 = drvVar.aq;
                    float f2 = drvVar.ar;
                    int i20 = drvVar.p;
                    if (i20 != -1) {
                        defpackage.dqv dqvVar6 = (defpackage.dqv) sparseArray.get(i20);
                        if (dqvVar6 != null) {
                            dqvVarB2.r(dqvVar6, drvVar.r, drvVar.q);
                        }
                    } else {
                        if (i14 != -1) {
                            defpackage.dqv dqvVar7 = (defpackage.dqv) sparseArray.get(i14);
                            if (dqvVar7 != null) {
                                i2 = i19;
                                i = i17;
                                dqvVarB2.Z(2, dqvVar7, 2, drvVar.leftMargin, i18);
                            } else {
                                i = i17;
                                i2 = i19;
                            }
                        } else {
                            i = i17;
                            i2 = i19;
                            if (i15 != -1 && (dqvVar = (defpackage.dqv) sparseArray.get(i15)) != null) {
                                dqvVarB2.Z(2, dqvVar, 4, drvVar.leftMargin, i18);
                            }
                        }
                        if (i16 != -1) {
                            defpackage.dqv dqvVar8 = (defpackage.dqv) sparseArray.get(i16);
                            if (dqvVar8 != null) {
                                dqvVarB2.Z(4, dqvVar8, 2, drvVar.rightMargin, i2);
                            }
                        } else {
                            int i21 = i2;
                            if (i != -1 && (dqvVar2 = (defpackage.dqv) sparseArray.get(i)) != null) {
                                dqvVarB2.Z(4, dqvVar2, 4, drvVar.rightMargin, i21);
                            }
                        }
                        int i22 = drvVar.i;
                        if (i22 != -1) {
                            defpackage.dqv dqvVar9 = (defpackage.dqv) sparseArray.get(i22);
                            if (dqvVar9 != null) {
                                dqvVarB2.Z(3, dqvVar9, 3, drvVar.topMargin, drvVar.x);
                            }
                        } else {
                            int i23 = drvVar.j;
                            if (i23 != -1 && (dqvVar3 = (defpackage.dqv) sparseArray.get(i23)) != null) {
                                dqvVarB2.Z(3, dqvVar3, 5, drvVar.topMargin, drvVar.x);
                            }
                        }
                        int i24 = drvVar.k;
                        if (i24 != -1) {
                            defpackage.dqv dqvVar10 = (defpackage.dqv) sparseArray.get(i24);
                            if (dqvVar10 != null) {
                                dqvVarB2.Z(5, dqvVar10, 3, drvVar.bottomMargin, drvVar.z);
                            }
                        } else {
                            int i25 = drvVar.l;
                            if (i25 != -1 && (dqvVar4 = (defpackage.dqv) sparseArray.get(i25)) != null) {
                                dqvVarB2.Z(5, dqvVar4, 5, drvVar.bottomMargin, drvVar.z);
                            }
                        }
                        int i26 = drvVar.m;
                        if (i26 != -1) {
                            h(dqvVarB2, drvVar, sparseArray, i26, 6);
                        } else {
                            int i27 = drvVar.n;
                            if (i27 != -1) {
                                h(dqvVarB2, drvVar, sparseArray, i27, 3);
                            } else {
                                int i28 = drvVar.o;
                                if (i28 != -1) {
                                    h(dqvVarB2, drvVar, sparseArray, i28, 5);
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            dqvVarB2.ao = f2;
                        }
                        float f3 = drvVar.H;
                        if (f3 >= 0.0f) {
                            dqvVarB2.ap = f3;
                        }
                    }
                    if (zIsInEditMode) {
                        int i29 = drvVar.X;
                        if (i29 != -1) {
                            int i30 = drvVar.Y;
                            dqvVarB2.aj = i29;
                            dqvVarB2.ak = i30;
                        } else if (drvVar.Y != -1) {
                            i29 = -1;
                            int i31 = drvVar.Y;
                            dqvVarB2.aj = i29;
                            dqvVarB2.ak = i31;
                        }
                    }
                    if (drvVar.ae) {
                        dqvVarB2.aa(1);
                        dqvVarB2.M(drvVar.width);
                        if (drvVar.width == -2) {
                            dqvVarB2.aa(2);
                        }
                    } else if (drvVar.width == -1) {
                        if (drvVar.aa) {
                            dqvVarB2.aa(3);
                        } else {
                            dqvVarB2.aa(4);
                        }
                        dqvVarB2.U(2).f = drvVar.leftMargin;
                        dqvVarB2.U(4).f = drvVar.rightMargin;
                    } else {
                        dqvVarB2.aa(3);
                        dqvVarB2.M(0);
                    }
                    if (drvVar.af) {
                        z = false;
                        dqvVarB2.ab(1);
                        dqvVarB2.B(drvVar.height);
                        if (drvVar.height == -2) {
                            dqvVarB2.ab(2);
                        }
                    } else if (drvVar.height == -1) {
                        if (drvVar.ab) {
                            dqvVarB2.ab(3);
                        } else {
                            dqvVarB2.ab(4);
                        }
                        dqvVarB2.U(3).f = drvVar.topMargin;
                        dqvVarB2.U(5).f = drvVar.bottomMargin;
                        z = false;
                    } else {
                        dqvVarB2.ab(3);
                        z = false;
                        dqvVarB2.B(0);
                    }
                    dqvVarB2.y(drvVar.I);
                    dqvVarB2.D(drvVar.L);
                    dqvVarB2.L(drvVar.M);
                    dqvVarB2.at = drvVar.N;
                    dqvVarB2.au = drvVar.O;
                    int i32 = drvVar.ad;
                    if (i32 >= 0 && i32 <= 3) {
                        dqvVarB2.B = i32;
                    }
                    dqvVarB2.C(drvVar.P, drvVar.R, drvVar.T, drvVar.V);
                    dqvVarB2.K(drvVar.Q, drvVar.S, drvVar.U, drvVar.W);
                }
            }
            i11++;
            z2 = z;
            constraintLayout = this;
        }
    }

    private final void h(defpackage.dqv dqvVar, defpackage.drv drvVar, android.util.SparseArray sparseArray, int i, int i2) {
        android.view.View view = (android.view.View) this.a.get(i);
        defpackage.dqv dqvVar2 = (defpackage.dqv) sparseArray.get(i);
        if (dqvVar2 == null || view == null || !(view.getLayoutParams() instanceof defpackage.drv)) {
            return;
        }
        drvVar.ag = true;
        if (i2 == 6) {
            defpackage.drv drvVar2 = (defpackage.drv) view.getLayoutParams();
            drvVar2.ag = true;
            drvVar2.av.P = true;
        }
        dqvVar.U(6).l(dqvVar2.U(i2), drvVar.D, drvVar.C, true);
        dqvVar.P = true;
        dqvVar.U(3).e();
        dqvVar.U(5).e();
    }

    public final android.view.View a(int i) {
        return (android.view.View) this.a.get(i);
    }

    public final defpackage.dqv b(android.view.View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof defpackage.drv) {
            return ((defpackage.drv) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new defpackage.drv(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof defpackage.drv) {
            return ((defpackage.drv) view.getLayoutParams()).av;
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.drv;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        java.util.HashMap map;
        if ((obj instanceof java.lang.String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        int size;
        java.util.ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] strArrSplit = ((java.lang.String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i4 = java.lang.Integer.parseInt(strArrSplit[1]);
                        int i5 = java.lang.Integer.parseInt(strArrSplit[2]);
                        float f = (java.lang.Integer.parseInt(strArrSplit[3]) / 1920.0f) * height;
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f2 = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f3 = i7;
                        float f4 = i6;
                        canvas.drawLine(f3, f4, f2, f4, paint);
                        float f5 = i6 + ((int) f);
                        canvas.drawLine(f2, f4, f2, f5, paint);
                        canvas.drawLine(f2, f5, f3, f5, paint);
                        canvas.drawLine(f3, f5, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f2, f5, paint);
                        canvas.drawLine(f3, f5, f2, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.drv();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.drv(getContext(), attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            defpackage.drv drvVar = (defpackage.drv) childAt.getLayoutParams();
            defpackage.dqv dqvVar = drvVar.av;
            if (childAt.getVisibility() != 8 || drvVar.ah || drvVar.ai) {
                boolean z2 = drvVar.aj;
                int iK = dqvVar.k();
                int iL = dqvVar.l();
                childAt.layout(iK, iL, dqvVar.j() + iK, dqvVar.h() + iL);
                if (!(childAt instanceof defpackage.dsh)) {
                    throw null;
                }
            } else {
                boolean z3 = drvVar.ak;
                if (zIsInEditMode) {
                    boolean z4 = drvVar.aj;
                    int iK2 = dqvVar.k();
                    int iL2 = dqvVar.l();
                    childAt.layout(iK2, iL2, dqvVar.j() + iK2, dqvVar.h() + iL2);
                    if (!(childAt instanceof defpackage.dsh)) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0172  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int i4;
        int i5;
        int iMax2;
        int i6;
        boolean z;
        boolean z2;
        int iMin;
        int iMin2;
        if (!this.d) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (getChildAt(i7).isLayoutRequested()) {
                    this.d = true;
                    break;
                }
            }
        }
        defpackage.dqw dqwVar = this.c;
        dqwVar.d = c();
        if (this.d) {
            this.d = false;
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                if (getChildAt(i8).isLayoutRequested()) {
                    g();
                    dqwVar.ah();
                    break;
                }
            }
        }
        defpackage.dpg dpgVar = dqwVar.e;
        int i9 = this.e;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int iMax3 = java.lang.Math.max(0, getPaddingTop());
        int iMax4 = java.lang.Math.max(0, getPaddingBottom());
        int i10 = iMax3 + iMax4;
        int iMax5 = java.lang.Math.max(0, getPaddingLeft()) + java.lang.Math.max(0, getPaddingRight());
        int iMax6 = java.lang.Math.max(0, getPaddingStart()) + java.lang.Math.max(0, getPaddingEnd());
        if (iMax6 > 0) {
            iMax5 = iMax6;
        }
        defpackage.drw drwVar = this.g;
        drwVar.b = iMax3;
        drwVar.c = iMax4;
        drwVar.d = iMax5;
        drwVar.e = i10;
        drwVar.f = i;
        drwVar.g = i2;
        int iMax7 = java.lang.Math.max(0, getPaddingStart());
        int iMax8 = java.lang.Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = java.lang.Math.max(0, getPaddingLeft());
        } else if (c()) {
            iMax7 = iMax8;
        }
        int i11 = size - iMax5;
        int i12 = size2 - i10;
        int i13 = drwVar.e;
        int i14 = drwVar.d;
        int childCount3 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount3 == 0) {
                i3 = i11;
                i13 = i13;
                iMax = java.lang.Math.max(0, this.h);
                i4 = 2;
                i5 = Integer.MIN_VALUE;
                childCount3 = 0;
            } else {
                iMax = i11;
                i3 = iMax;
            }
            if (mode2 == i5) {
                if (childCount3 == 0) {
                    iMax2 = java.lang.Math.max(0, this.i);
                } else {
                    iMax2 = i12;
                }
                i6 = 2;
            } else if (mode2 == 0) {
                if (childCount3 == 0) {
                    iMax2 = java.lang.Math.max(0, this.i);
                } else {
                    iMax2 = 0;
                }
                i6 = 2;
            } else if (mode2 != 1073741824) {
                i9 = i9;
                i6 = 1;
                iMax2 = 0;
            } else {
                iMax2 = java.lang.Math.min(this.k - i13, i12);
                i9 = i9;
                i6 = 1;
            }
            if (iMax == dqwVar.j()) {
                dqwVar.a.c = true;
            } else {
                dqwVar.a.c = true;
            }
            dqwVar.aj = 0;
            dqwVar.ak = 0;
            dqwVar.H(this.j - i14);
            dqwVar.G(this.k - i13);
            dqwVar.J(0);
            dqwVar.I(0);
            dqwVar.aa(i4);
            dqwVar.M(iMax);
            dqwVar.ab(i6);
            dqwVar.B(iMax2);
            dqwVar.J(this.h - i14);
            dqwVar.I(this.i - i13);
            dqwVar.ak(i9, mode, i3, mode2, i12, iMax7, iMax3);
            int iJ = dqwVar.j();
            int iH = dqwVar.h();
            z = dqwVar.aC;
            z2 = dqwVar.aD;
            int i15 = drwVar.e;
            int iResolveSizeAndState = resolveSizeAndState(iJ + drwVar.d, i, 0);
            int iResolveSizeAndState2 = resolveSizeAndState(iH + i15, i2, 0) & 16777215;
            iMin = java.lang.Math.min(this.j, iResolveSizeAndState & 16777215);
            iMin2 = java.lang.Math.min(this.k, iResolveSizeAndState2);
            if (z) {
                iMin |= 16777216;
            }
            if (z2) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        if (mode == 0) {
            if (childCount3 == 0) {
                childCount3 = 0;
                i3 = i11;
                iMax = java.lang.Math.max(0, this.h);
            } else {
                iMax = 0;
                i3 = i11;
            }
            i4 = 2;
        } else if (mode != 1073741824) {
            i3 = i11;
            i13 = i13;
            i4 = 1;
            iMax = 0;
        } else {
            iMax = java.lang.Math.min(this.j - i14, i11);
            i3 = i11;
            i13 = i13;
            i4 = 1;
        }
        i5 = Integer.MIN_VALUE;
        if (mode2 == i5) {
            if (childCount3 == 0) {
                iMax2 = java.lang.Math.max(0, this.i);
            } else {
                iMax2 = i12;
            }
            i6 = 2;
        } else if (mode2 == 0) {
            if (childCount3 == 0) {
                iMax2 = java.lang.Math.max(0, this.i);
            } else {
                iMax2 = 0;
            }
            i6 = 2;
        } else if (mode2 != 1073741824) {
            i9 = i9;
            i6 = 1;
            iMax2 = 0;
        } else {
            iMax2 = java.lang.Math.min(this.k - i13, i12);
            i9 = i9;
            i6 = 1;
        }
        if (iMax == dqwVar.j() || iMax2 != dqwVar.h()) {
            dqwVar.a.c = true;
        }
        dqwVar.aj = 0;
        dqwVar.ak = 0;
        dqwVar.H(this.j - i14);
        dqwVar.G(this.k - i13);
        dqwVar.J(0);
        dqwVar.I(0);
        dqwVar.aa(i4);
        dqwVar.M(iMax);
        dqwVar.ab(i6);
        dqwVar.B(iMax2);
        dqwVar.J(this.h - i14);
        dqwVar.I(this.i - i13);
        dqwVar.ak(i9, mode, i3, mode2, i12, iMax7, iMax3);
        int iJ2 = dqwVar.j();
        int iH2 = dqwVar.h();
        z = dqwVar.aC;
        z2 = dqwVar.aD;
        int i16 = drwVar.e;
        int iResolveSizeAndState3 = resolveSizeAndState(iJ2 + drwVar.d, i, 0);
        int iResolveSizeAndState4 = resolveSizeAndState(iH2 + i16, i2, 0) & 16777215;
        iMin = java.lang.Math.min(this.j, iResolveSizeAndState3 & 16777215);
        iMin2 = java.lang.Math.min(this.k, iResolveSizeAndState4);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        i4 = 2;
        i5 = Integer.MIN_VALUE;
        if (mode2 == i5) {
            if (childCount3 == 0) {
                iMax2 = java.lang.Math.max(0, this.i);
            } else {
                iMax2 = i12;
            }
            i6 = 2;
        } else if (mode2 == 0) {
            if (childCount3 == 0) {
                iMax2 = java.lang.Math.max(0, this.i);
            } else {
                iMax2 = 0;
            }
            i6 = 2;
        } else if (mode2 != 1073741824) {
            i9 = i9;
            i6 = 1;
            iMax2 = 0;
        } else {
            iMax2 = java.lang.Math.min(this.k - i13, i12);
            i9 = i9;
            i6 = 1;
        }
        if (iMax == dqwVar.j()) {
            dqwVar.a.c = true;
        } else {
            dqwVar.a.c = true;
        }
        dqwVar.aj = 0;
        dqwVar.ak = 0;
        dqwVar.H(this.j - i14);
        dqwVar.G(this.k - i13);
        dqwVar.J(0);
        dqwVar.I(0);
        dqwVar.aa(i4);
        dqwVar.M(iMax);
        dqwVar.ab(i6);
        dqwVar.B(iMax2);
        dqwVar.J(this.h - i14);
        dqwVar.I(this.i - i13);
        dqwVar.ak(i9, mode, i3, mode2, i12, iMax7, iMax3);
        int iJ3 = dqwVar.j();
        int iH3 = dqwVar.h();
        z = dqwVar.aC;
        z2 = dqwVar.aD;
        int i17 = drwVar.e;
        int iResolveSizeAndState5 = resolveSizeAndState(iJ3 + drwVar.d, i, 0);
        int iResolveSizeAndState6 = resolveSizeAndState(iH3 + i17, i2, 0) & 16777215;
        iMin = java.lang.Math.min(this.j, iResolveSizeAndState5 & 16777215);
        iMin2 = java.lang.Math.min(this.k, iResolveSizeAndState6);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        boolean z = view instanceof androidx.constraintlayout.widget.Guideline;
        defpackage.dqv dqvVarB = b(view);
        if (z && !(dqvVarB instanceof defpackage.dqz)) {
            defpackage.drv drvVar = (defpackage.drv) view.getLayoutParams();
            drvVar.av = new defpackage.dqz();
            drvVar.ah = true;
            ((defpackage.dqz) drvVar.av).ag(drvVar.Z);
        }
        if (view instanceof defpackage.drt) {
            defpackage.drt drtVar = (defpackage.drt) view;
            drtVar.k();
            ((defpackage.drv) view.getLayoutParams()).ai = true;
            java.util.ArrayList arrayList = this.b;
            if (!arrayList.contains(drtVar)) {
                arrayList.add(drtVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.an(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        android.util.SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.drv(layoutParams);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dqw();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.g = new defpackage.drw(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dqw();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.g = new defpackage.drw(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new android.util.SparseArray();
        this.b = new java.util.ArrayList(4);
        this.c = new defpackage.dqw();
        this.h = 0;
        this.i = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new java.util.HashMap();
        this.n = new android.util.SparseArray();
        this.g = new defpackage.drw(this, this);
        e(attributeSet, i, i2);
    }
}
