package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class lk implements hw {
    private static Method a;
    private static Method b;
    private final Context c;
    private ListAdapter d;
    public ks e;
    public int g;
    public boolean h;
    public boolean i;
    public View k;
    public AdapterView.OnItemClickListener l;
    public AdapterView.OnItemSelectedListener m;
    public final Handler n;
    public boolean o;
    public final PopupWindow p;
    private int r;
    private boolean s;
    private DataSetObserver t;
    private Rect x;
    public int f = -2;
    public int j = 0;
    public final lh q = new lh(this, 2);
    private final jzt y = new jzt(this, 1);
    private final lj u = new lj(this);
    private final lh v = new lh(this, 0);
    private final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public lk(Context context, AttributeSet attributeSet, int i) {
        this.c = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fs.p, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        jh jhVar = new jh(context, attributeSet, i);
        this.p = jhVar;
        jhVar.setInputMethodMode(1);
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

    public final Drawable c() {
        return this.p.getBackground();
    }

    @Override // defpackage.hw
    public final ListView dZ() {
        return this.e;
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new li(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        ks ksVar = this.e;
        if (ksVar != null) {
            ksVar.setAdapter(this.d);
        }
    }

    public final void f(Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.r = i;
        this.s = true;
    }

    @Override // defpackage.hw
    public final void k() {
        PopupWindow popupWindow = this.p;
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

    public ks p(Context context, boolean z) {
        return new ks(context, z);
    }

    public final void q() {
        ks ksVar = this.e;
        if (ksVar != null) {
            ksVar.a = true;
            ksVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.f = rect.left + rect.right + i;
    }

    @Override // defpackage.hw
    public final void s() {
        int i;
        int iMakeMeasureSpec;
        if (this.e == null) {
            ks ksVarP = p(this.c, !this.o);
            this.e = ksVarP;
            ksVarP.setAdapter(this.d);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new exe(this, 1));
            this.e.setOnScrollListener(this.u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.m;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.p.setContentView(this.e);
        }
        PopupWindow popupWindow = this.p;
        Drawable background = popupWindow.getBackground();
        Rect rect = this.w;
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
            Rect rect2 = this.w;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i2 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            int i4 = this.c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.w;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
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
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, true);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.p.setIsClippedToScreen(true);
        }
        PopupWindow popupWindow2 = this.p;
        popupWindow2.setOutsideTouchable(true);
        popupWindow2.setTouchInterceptor(this.y);
        if (this.i) {
            popupWindow2.setOverlapAnchor(this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow2, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.p.setEpicenterBounds(this.x);
        }
        this.p.showAsDropDown(this.k, this.g, this.r, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.v);
    }

    public final void t(Rect rect) {
        this.x = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.hw
    public final boolean u() {
        return this.p.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
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
