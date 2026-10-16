package android.support.v7.view.menu;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ActionMenuItemView extends defpackage.kb implements android.view.View.OnClickListener, defpackage.hu, defpackage.iq {
    public defpackage.hj a;
    public defpackage.hg b;
    public defpackage.izq c;
    private java.lang.CharSequence d;
    private android.graphics.drawable.Drawable e;
    private defpackage.ky f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.Resources resources = context.getResources();
        this.g = n();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ft.c, i, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.i = -1;
        setSaveEnabled(false);
    }

    private final void m() {
        boolean z = true;
        boolean z2 = !android.text.TextUtils.isEmpty(this.d);
        if (this.e != null && ((this.a.n & 4) != 4 || !this.g)) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.d : null);
        java.lang.CharSequence charSequence = this.a.l;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.a.d);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.a.m;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            a$.ExternalSyntheticApiModelOutline1.m(this, z3 ? null : this.a.d);
        } else {
            a$.ExternalSyntheticApiModelOutline1.m(this, charSequence2);
        }
    }

    private final boolean n() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // defpackage.hu
    public final defpackage.hj a() {
        return this.a;
    }

    public final boolean b() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // defpackage.iq
    public final boolean c() {
        return b();
    }

    @Override // defpackage.iq
    public final boolean d() {
        return b() && this.a.getIcon() == null;
    }

    @Override // defpackage.hu
    public final boolean e() {
        return true;
    }

    @Override // defpackage.hu
    public final void f(defpackage.hj hjVar) {
        this.a = hjVar;
        android.graphics.drawable.Drawable icon = hjVar.getIcon();
        this.e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m();
        this.d = hjVar.f(this);
        m();
        setId(hjVar.a);
        setVisibility(true != hjVar.isVisible() ? 8 : 0);
        setEnabled(hjVar.isEnabled());
        if (hjVar.hasSubMenu() && this.f == null) {
            this.f = new gx(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.hg hgVar = this.b;
        if (hgVar != null) {
            hgVar.b(this.a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = n();
        m();
    }

    @Override // defpackage.kb, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean zB = b();
        if (zB && (i3 = this.i) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = this.h;
        if (mode == Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(size, iMin);
        }
        if (mode != 1073741824 && this.h > 0 && measuredWidth < iMin) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zB || this.e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        defpackage.ky kyVar;
        if (this.a.hasSubMenu() && (kyVar = this.f) != null && kyVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.i = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(android.content.Context context) {
        this(context, null);
    }
}
