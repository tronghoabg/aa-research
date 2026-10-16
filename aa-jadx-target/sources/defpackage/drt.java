package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class drt extends android.view.View {
    public int[] c;
    public int d;
    protected final android.content.Context e;
    public java.lang.String f;
    protected java.lang.String g;
    public final java.util.HashMap h;
    public defpackage.dra i;

    public drt(android.content.Context context) {
        super(context);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    private final void b(java.lang.String str) {
        int iD;
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (!isInEditMode() || constraintLayout == null) {
            iD = 0;
        } else {
            java.lang.Object objD = constraintLayout.d(strTrim);
            if (objD instanceof java.lang.Integer) {
                iD = ((java.lang.Integer) objD).intValue();
            } else {
                iD = 0;
            }
        }
        if (iD == 0) {
            iD = constraintLayout != null ? d(constraintLayout, strTrim) : 0;
        }
        if (iD == 0) {
            try {
                identifier = dsi.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
            }
        } else {
            identifier = iD;
        }
        if (identifier == 0) {
            android.content.Context context = this.e;
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier == 0) {
            android.util.Log.w("ConstraintHelper", defpackage.a.bp(strTrim, "Could not find id of \"", "\""));
        } else {
            this.h.put(java.lang.Integer.valueOf(identifier), strTrim);
            l(identifier);
        }
    }

    private final void l(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.d + 1;
        int[] iArrCopyOf = this.c;
        int length = iArrCopyOf.length;
        if (i2 > length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, length + length);
            this.c = iArrCopyOf;
        }
        int i3 = this.d;
        iArrCopyOf[i3] = i;
        this.d = i3 + 1;
    }

    private final void m(java.lang.String str) {
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            android.util.Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof defpackage.drv) && strTrim.equals(((defpackage.drv) layoutParams).ac)) {
                if (childAt.getId() == -1) {
                    android.util.Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    l(childAt.getId());
                }
            }
        }
    }

    protected void a(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dsj.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(35);
                    this.f = string;
                    h(string);
                } else if (index == 36) {
                    java.lang.String string2 = typedArrayObtainStyledAttributes.getString(36);
                    this.g = string2;
                    i(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.String resourceEntryName;
        if (str != null && (resources = this.e.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    protected final void e() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            return;
        }
        f((androidx.constraintlayout.widget.ConstraintLayout) parent);
    }

    protected final void f(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.d; i++) {
            android.view.View viewA = constraintLayout.a(this.c[i]);
            if (viewA != null) {
                viewA.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void h(java.lang.String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected final void i(java.lang.String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m(str.substring(i));
                return;
            } else {
                m(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public final void j(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            l(i);
        }
    }

    public final void k() {
        if (this.i == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof defpackage.drv) {
            ((defpackage.drv) layoutParams).av = this.i;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.f;
        if (str != null) {
            h(str);
        }
        java.lang.String str2 = this.g;
        if (str2 != null) {
            i(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, java.lang.Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            l(i);
        }
    }

    public drt(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(attributeSet);
    }

    public drt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(attributeSet);
    }

    protected void g(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
    }

    public void c(defpackage.dqv dqvVar, boolean z) {
    }
}
