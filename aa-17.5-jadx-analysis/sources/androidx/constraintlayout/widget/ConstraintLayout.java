package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.cdj;
import defpackage.dqn;
import defpackage.dqo;
import defpackage.dqr;
import defpackage.dqs;
import defpackage.drl;
import defpackage.drn;
import defpackage.dro;
import defpackage.drx;
import defpackage.dry;
import defpackage.drz;
import defpackage.dsb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final dqo c;
    protected boolean d;
    public int e;
    public drx f;
    final dro g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dqo();
        this.h = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dro(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        dqo dqoVar = this.c;
        dqoVar.aq = this;
        dqoVar.af(this.g);
        this.a.put(getId(), this);
        this.f = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dsb.b, i, i2);
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
                            cdj.d(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        drx drxVar = new drx();
                        this.f = drxVar;
                        drxVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
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

    private final void g() throws Resources.NotFoundException {
        int i;
        int i2;
        dqn dqnVar;
        dqn dqnVar2;
        dqn dqnVar3;
        dqn dqnVar4;
        boolean z;
        dqn dqnVar5;
        ConstraintLayout constraintLayout = this;
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            dqn dqnVarB = constraintLayout.b(constraintLayout.getChildAt(i3));
            if (dqnVarB != null) {
                dqnVarB.u();
            }
        }
        if (zIsInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer numValueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        String strSubstring = iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName;
                        numValueOf.getClass();
                        constraintLayout.m.put(strSubstring, Integer.valueOf(id));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        dqnVar5 = constraintLayout.c;
                    } else {
                        View viewFindViewById = (View) constraintLayout.a.get(id2);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        dqnVar5 = viewFindViewById == constraintLayout ? constraintLayout.c : viewFindViewById == null ? null : ((drn) viewFindViewById.getLayoutParams()).av;
                    }
                    dqnVar5.as = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = constraintLayout.getChildAt(i5);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof dry)) {
                    throw null;
                }
            }
        }
        drx drxVar = constraintLayout.f;
        if (drxVar != null) {
            drxVar.p(constraintLayout);
        }
        dqo dqoVar = constraintLayout.c;
        dqoVar.ao();
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                drl drlVar = (drl) arrayList.get(i6);
                if (drlVar.isInEditMode()) {
                    drlVar.h(drlVar.f);
                }
                dqs dqsVar = drlVar.i;
                if (dqsVar != null) {
                    dqsVar.aM = 0;
                    Arrays.fill(dqsVar.aL, (Object) null);
                    for (int i7 = 0; i7 < drlVar.d; i7++) {
                        int i8 = drlVar.c[i7];
                        View viewA = constraintLayout.a(i8);
                        if (viewA == null) {
                            HashMap map = drlVar.h;
                            String str = (String) map.get(Integer.valueOf(i8));
                            int iD = drlVar.d(constraintLayout, str);
                            if (iD != 0) {
                                drlVar.c[i7] = iD;
                                map.put(Integer.valueOf(iD), str);
                                viewA = constraintLayout.a(iD);
                            }
                        }
                        if (viewA != null) {
                            drlVar.i.af(constraintLayout.b(viewA));
                        }
                    }
                    drlVar.i.ah();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = constraintLayout.getChildAt(i9);
            if (childAt3 instanceof drz) {
                throw null;
            }
        }
        SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, dqoVar);
        sparseArray.put(constraintLayout.getId(), dqoVar);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = constraintLayout.getChildAt(i10);
            sparseArray.put(childAt4.getId(), constraintLayout.b(childAt4));
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt5 = constraintLayout.getChildAt(i11);
            dqn dqnVarB2 = constraintLayout.b(childAt5);
            if (dqnVarB2 == null) {
                z = z2;
            } else {
                drn drnVar = (drn) childAt5.getLayoutParams();
                dqoVar.am(dqnVarB2);
                drnVar.a();
                drnVar.aw = z2;
                dqnVarB2.ar = childAt5.getVisibility();
                boolean z3 = drnVar.aj;
                dqnVarB2.aq = childAt5;
                if (childAt5 instanceof drl) {
                    ((drl) childAt5).c(dqnVarB2, dqoVar.d);
                }
                if (drnVar.ah) {
                    dqr dqrVar = (dqr) dqnVarB2;
                    int i12 = drnVar.as;
                    int i13 = drnVar.at;
                    float f = drnVar.au;
                    if (f != -1.0f) {
                        dqrVar.af(f);
                    } else if (i12 != -1) {
                        dqrVar.c(i12);
                    } else if (i13 != -1) {
                        dqrVar.ae(i13);
                    }
                    z = z2;
                } else {
                    int i14 = drnVar.al;
                    int i15 = drnVar.am;
                    int i16 = drnVar.an;
                    int i17 = drnVar.ao;
                    int i18 = drnVar.ap;
                    int i19 = drnVar.aq;
                    float f2 = drnVar.ar;
                    int i20 = drnVar.p;
                    if (i20 != -1) {
                        dqn dqnVar6 = (dqn) sparseArray.get(i20);
                        if (dqnVar6 != null) {
                            dqnVarB2.r(dqnVar6, drnVar.r, drnVar.q);
                        }
                    } else {
                        if (i14 != -1) {
                            dqn dqnVar7 = (dqn) sparseArray.get(i14);
                            if (dqnVar7 != null) {
                                i2 = i19;
                                i = i17;
                                dqnVarB2.Z(2, dqnVar7, 2, drnVar.leftMargin, i18);
                            } else {
                                i = i17;
                                i2 = i19;
                            }
                        } else {
                            i = i17;
                            i2 = i19;
                            if (i15 != -1 && (dqnVar = (dqn) sparseArray.get(i15)) != null) {
                                dqnVarB2.Z(2, dqnVar, 4, drnVar.leftMargin, i18);
                            }
                        }
                        if (i16 != -1) {
                            dqn dqnVar8 = (dqn) sparseArray.get(i16);
                            if (dqnVar8 != null) {
                                dqnVarB2.Z(4, dqnVar8, 2, drnVar.rightMargin, i2);
                            }
                        } else {
                            int i21 = i2;
                            if (i != -1 && (dqnVar2 = (dqn) sparseArray.get(i)) != null) {
                                dqnVarB2.Z(4, dqnVar2, 4, drnVar.rightMargin, i21);
                            }
                        }
                        int i22 = drnVar.i;
                        if (i22 != -1) {
                            dqn dqnVar9 = (dqn) sparseArray.get(i22);
                            if (dqnVar9 != null) {
                                dqnVarB2.Z(3, dqnVar9, 3, drnVar.topMargin, drnVar.x);
                            }
                        } else {
                            int i23 = drnVar.j;
                            if (i23 != -1 && (dqnVar3 = (dqn) sparseArray.get(i23)) != null) {
                                dqnVarB2.Z(3, dqnVar3, 5, drnVar.topMargin, drnVar.x);
                            }
                        }
                        int i24 = drnVar.k;
                        if (i24 != -1) {
                            dqn dqnVar10 = (dqn) sparseArray.get(i24);
                            if (dqnVar10 != null) {
                                dqnVarB2.Z(5, dqnVar10, 3, drnVar.bottomMargin, drnVar.z);
                            }
                        } else {
                            int i25 = drnVar.l;
                            if (i25 != -1 && (dqnVar4 = (dqn) sparseArray.get(i25)) != null) {
                                dqnVarB2.Z(5, dqnVar4, 5, drnVar.bottomMargin, drnVar.z);
                            }
                        }
                        int i26 = drnVar.m;
                        if (i26 != -1) {
                            h(dqnVarB2, drnVar, sparseArray, i26, 6);
                        } else {
                            int i27 = drnVar.n;
                            if (i27 != -1) {
                                h(dqnVarB2, drnVar, sparseArray, i27, 3);
                            } else {
                                int i28 = drnVar.o;
                                if (i28 != -1) {
                                    h(dqnVarB2, drnVar, sparseArray, i28, 5);
                                }
                            }
                        }
                        if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                            dqnVarB2.ao = f2;
                        }
                        float f3 = drnVar.H;
                        if (f3 >= BitmapDescriptorFactory.HUE_RED) {
                            dqnVarB2.ap = f3;
                        }
                    }
                    if (zIsInEditMode) {
                        int i29 = drnVar.X;
                        if (i29 != -1) {
                            int i30 = drnVar.Y;
                            dqnVarB2.aj = i29;
                            dqnVarB2.ak = i30;
                        } else if (drnVar.Y != -1) {
                            i29 = -1;
                            int i302 = drnVar.Y;
                            dqnVarB2.aj = i29;
                            dqnVarB2.ak = i302;
                        }
                    }
                    if (drnVar.ae) {
                        dqnVarB2.aa(1);
                        dqnVarB2.M(drnVar.width);
                        if (drnVar.width == -2) {
                            dqnVarB2.aa(2);
                        }
                    } else if (drnVar.width == -1) {
                        if (drnVar.aa) {
                            dqnVarB2.aa(3);
                        } else {
                            dqnVarB2.aa(4);
                        }
                        dqnVarB2.U(2).f = drnVar.leftMargin;
                        dqnVarB2.U(4).f = drnVar.rightMargin;
                    } else {
                        dqnVarB2.aa(3);
                        dqnVarB2.M(0);
                    }
                    if (drnVar.af) {
                        z = false;
                        dqnVarB2.ab(1);
                        dqnVarB2.B(drnVar.height);
                        if (drnVar.height == -2) {
                            dqnVarB2.ab(2);
                        }
                    } else if (drnVar.height == -1) {
                        if (drnVar.ab) {
                            dqnVarB2.ab(3);
                        } else {
                            dqnVarB2.ab(4);
                        }
                        dqnVarB2.U(3).f = drnVar.topMargin;
                        dqnVarB2.U(5).f = drnVar.bottomMargin;
                        z = false;
                    } else {
                        dqnVarB2.ab(3);
                        z = false;
                        dqnVarB2.B(0);
                    }
                    dqnVarB2.y(drnVar.I);
                    dqnVarB2.D(drnVar.L);
                    dqnVarB2.L(drnVar.M);
                    dqnVarB2.at = drnVar.N;
                    dqnVarB2.au = drnVar.O;
                    int i31 = drnVar.ad;
                    if (i31 >= 0 && i31 <= 3) {
                        dqnVarB2.B = i31;
                    }
                    dqnVarB2.C(drnVar.P, drnVar.R, drnVar.T, drnVar.V);
                    dqnVarB2.K(drnVar.Q, drnVar.S, drnVar.U, drnVar.W);
                }
            }
            i11++;
            z2 = z;
            constraintLayout = this;
        }
    }

    private final void h(dqn dqnVar, drn drnVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        dqn dqnVar2 = (dqn) sparseArray.get(i);
        if (dqnVar2 == null || view == null || !(view.getLayoutParams() instanceof drn)) {
            return;
        }
        drnVar.ag = true;
        if (i2 == 6) {
            drn drnVar2 = (drn) view.getLayoutParams();
            drnVar2.ag = true;
            drnVar2.av.P = true;
        }
        dqnVar.U(6).l(dqnVar2.U(i2), drnVar.D, drnVar.C, true);
        dqnVar.P = true;
        dqnVar.U(3).e();
        dqnVar.U(5).e();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final dqn b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof drn) {
            return ((drn) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new drn(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof drn) {
            return ((drn) view.getLayoutParams()).av;
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof drn;
    }

    public final Object d(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
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
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f2 = i7;
                        float f3 = i6;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float f4 = i6 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, f4, paint);
                        canvas.drawLine(f, f4, f2, f4, paint);
                        canvas.drawLine(f2, f4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, f4, paint);
                        canvas.drawLine(f2, f4, f, f3, paint);
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
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new drn();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new drn(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L4f
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            drn r0 = (defpackage.drn) r0
            dqn r1 = r0.av
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.k()
            int r2 = r1.l()
            int r3 = r1.j()
            int r3 = r3 + r0
            int r1 = r1.h()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
            boolean r0 = r9 instanceof defpackage.drz
            if (r0 != 0) goto L4b
        L48:
            int r8 = r8 + 1
            goto La
        L4b:
            drz r9 = (defpackage.drz) r9
            r4 = 0
            throw r4
        L4f:
            java.util.ArrayList r4 = r4.b
            int r5 = r4.size()
            if (r5 <= 0) goto L62
        L57:
            if (r7 >= r5) goto L62
            java.lang.Object r6 = r4.get(r7)
            drl r6 = (defpackage.drl) r6
            int r7 = r7 + 1
            goto L57
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        dqn dqnVarB = b(view);
        if (z && !(dqnVarB instanceof dqr)) {
            drn drnVar = (drn) view.getLayoutParams();
            drnVar.av = new dqr();
            drnVar.ah = true;
            ((dqr) drnVar.av).ag(drnVar.Z);
        }
        if (view instanceof drl) {
            drl drlVar = (drl) view;
            drlVar.k();
            ((drn) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(drlVar)) {
                arrayList.add(drlVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
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
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new drn(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dqo();
        this.h = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dro(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dqo();
        this.h = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dro(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new dqo();
        this.h = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = true;
        this.e = 257;
        this.f = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.g = new dro(this, this);
        e(attributeSet, i, i2);
    }
}
