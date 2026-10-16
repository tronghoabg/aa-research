package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eoy extends android.view.ViewGroup.MarginLayoutParams {
    private static final defpackage.eox c;
    private static final int d;
    public defpackage.epa a;
    public defpackage.epa b;

    static {
        defpackage.eox eoxVar = new defpackage.eox(Integer.MIN_VALUE, -2147483647);
        c = eoxVar;
        d = eoxVar.a();
        int[] iArr = defpackage.eoh.a;
    }

    public eoy(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        defpackage.epa epaVar = defpackage.epa.a;
        this.a = epaVar;
        this.b = epaVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eoh.b);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
            this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
            this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.eoh.b);
            try {
                int i = typedArrayObtainStyledAttributes2.getInt(10, 0);
                int i2 = typedArrayObtainStyledAttributes2.getInt(7, Integer.MIN_VALUE);
                int i3 = d;
                this.b = androidx.gridlayout.widget.GridLayout.e(i2, typedArrayObtainStyledAttributes2.getInt(8, i3), androidx.gridlayout.widget.GridLayout.d(i, true), typedArrayObtainStyledAttributes2.getFloat(9, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
                this.a = androidx.gridlayout.widget.GridLayout.e(typedArrayObtainStyledAttributes2.getInt(11, Integer.MIN_VALUE), typedArrayObtainStyledAttributes2.getInt(12, i3), androidx.gridlayout.widget.GridLayout.d(i, false), typedArrayObtainStyledAttributes2.getFloat(13, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
            } finally {
                typedArrayObtainStyledAttributes2.recycle();
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eoy)) {
            return false;
        }
        defpackage.eoy eoyVar = (defpackage.eoy) obj;
        return this.b.equals(eoyVar.b) && this.a.equals(eoyVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(android.content.res.TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, -2);
        this.height = typedArray.getLayoutDimension(i2, -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoy() {
        super(-2, -2);
        defpackage.epa epaVar = defpackage.epa.a;
        this.a = epaVar;
        this.b = epaVar;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = epaVar;
        this.b = epaVar;
    }

    public eoy(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        defpackage.epa epaVar = defpackage.epa.a;
        this.a = epaVar;
        this.b = epaVar;
    }

    public eoy(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        defpackage.epa epaVar = defpackage.epa.a;
        this.a = epaVar;
        this.b = epaVar;
    }

    public eoy(defpackage.eoy eoyVar) {
        super((android.view.ViewGroup.MarginLayoutParams) eoyVar);
        defpackage.epa epaVar = defpackage.epa.a;
        this.a = epaVar;
        this.b = epaVar;
        this.a = eoyVar.a;
        this.b = eoyVar.b;
    }
}
