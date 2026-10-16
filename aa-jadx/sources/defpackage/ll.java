package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ll implements defpackage.hx {
    private static java.lang.reflect.Method a;
    private static java.lang.reflect.Method b;
    private final android.content.Context c;
    private android.widget.ListAdapter d;
    public defpackage.kt e;
    public int g;
    public boolean h;
    public boolean i;
    public android.view.View k;
    public android.widget.AdapterView.OnItemClickListener l;
    public android.widget.AdapterView.OnItemSelectedListener m;
    public final android.os.Handler n;
    public boolean o;
    public final android.widget.PopupWindow p;
    private int r;
    private boolean s;
    private android.database.DataSetObserver t;
    private android.graphics.Rect w;
    public int f = -2;
    public int j = 0;
    public final defpackage.ku q = new defpackage.ku(this, 5);
    private final defpackage.jzx x = new defpackage.jzx(this, 1);
    private final defpackage.lk u = new defpackage.lk(this);
    private final defpackage.ku y = new defpackage.ku(this, 4);
    private final android.graphics.Rect v = new android.graphics.Rect();

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                a = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ll(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this.c = context;
        this.n = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ft.p, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        defpackage.ji jiVar = new defpackage.ji(context, attributeSet, i);
        this.p = jiVar;
        jiVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.s) {
            return this.r;
        }
        return 0;
    }

    public final android.graphics.drawable.Drawable c() {
        return this.p.getBackground();
    }

    @Override // defpackage.hx
    public final android.widget.ListView dh() {
        return this.e;
    }

    public void e(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new defpackage.lj(this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        defpackage.kt ktVar = this.e;
        if (ktVar != null) {
            ktVar.setAdapter(this.d);
        }
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.r = i;
        this.s = true;
    }

    @Override // defpackage.hx
    public final void k() {
        android.widget.PopupWindow popupWindow = this.p;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.q);
    }

    public final int o() {
        if (u()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public defpackage.kt p(android.content.Context context, boolean z) {
        return new defpackage.kt(context, z);
    }

    public final void q() {
        defpackage.kt ktVar = this.e;
        if (ktVar != null) {
            ktVar.a = true;
            ktVar.requestLayout();
        }
    }

    public final void r(int i) {
        android.graphics.drawable.Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        android.graphics.Rect rect = this.v;
        background.getPadding(rect);
        this.f = rect.left + rect.right + i;
    }

    @Override // defpackage.hx
    public final void s() {
        int i;
        int iMakeMeasureSpec;
        if (this.e == null) {
            defpackage.kt ktVarP = p(this.c, !this.o);
            this.e = ktVarP;
            ktVarP.setAdapter(this.d);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new defpackage.exk(this, 1));
            this.e.setOnScrollListener(this.u);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.m;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.p.setContentView(this.e);
        }
        android.widget.PopupWindow popupWindow = this.p;
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        android.graphics.Rect rect = this.v;
        if (background != null) {
            background.getPadding(rect);
            i = rect.top + rect.bottom;
            if (!this.s) {
                this.r = -rect.top;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = popupWindow.getMaxAvailableHeight(this.k, this.r, popupWindow.getInputMethodMode() == 2);
        int i2 = this.f;
        if (i2 == -2) {
            int i3 = this.c.getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect2 = this.v;
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i2 != -1) {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            int i4 = this.c.getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = this.v;
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
        }
        int iB = this.e.b(iMakeMeasureSpec, maxAvailableHeight);
        int paddingTop = iB > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        w();
        popupWindow.setWindowLayoutType(1002);
        int i5 = iB + paddingTop;
        if (popupWindow.isShowing()) {
            if (this.k.isAttachedToWindow()) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.k.getWidth();
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.k, this.g, this.r, width < 0 ? -1 : width, i5 >= 0 ? i5 : -1);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.k.getWidth();
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i5);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.p.setIsClippedToScreen(true);
        }
        android.widget.PopupWindow popupWindow2 = this.p;
        popupWindow2.setOutsideTouchable(true);
        popupWindow2.setTouchInterceptor(this.x);
        if (this.i) {
            popupWindow2.setOverlapAnchor(this.h);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow2, this.w);
                } catch (java.lang.Exception e) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.p.setEpicenterBounds(this.w);
        }
        this.p.showAsDropDown(this.k, this.g, this.r, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.y);
    }

    public final void t(android.graphics.Rect rect) {
        this.w = rect != null ? new android.graphics.Rect(rect) : null;
    }

    @Override // defpackage.hx
    public final boolean u() {
        return this.p.isShowing();
    }

    public final void v(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        return this.p.getInputMethodMode() == 2;
    }

    public final void x() {
        this.p.setInputMethodMode(2);
    }

    public final void y() {
        this.o = true;
        this.p.setFocusable(true);
    }
}
