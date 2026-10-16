package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class dm implements android.support.v7.view.menu.ah {

    /* renamed from: a, reason: collision with root package name */
    private Context f1351a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f1352b;

    /* renamed from: c, reason: collision with root package name */
    cl f1353c;

    /* renamed from: d, reason: collision with root package name */
    int f1354d;

    /* renamed from: e, reason: collision with root package name */
    final Handler f1355e;

    /* renamed from: f, reason: collision with root package name */
    PopupWindow f1356f;

    /* renamed from: g, reason: collision with root package name */
    final e f1357g;

    /* renamed from: h, reason: collision with root package name */
    private int f1358h;

    /* renamed from: i, reason: collision with root package name */
    private int f1359i;

    /* renamed from: j, reason: collision with root package name */
    private int f1360j;

    /* renamed from: k, reason: collision with root package name */
    private int f1361k;

    /* renamed from: l, reason: collision with root package name */
    private int f1362l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private DataSetObserver q;
    private View r;
    private AdapterView.OnItemClickListener s;
    private AdapterView.OnItemSelectedListener t;
    private final dl u;
    private final dk v;
    private final Rect w;
    private Rect x;
    private boolean y;
    private final e z;

    public dm(Context context, AttributeSet attributeSet, int i2, byte[] bArr) {
        this.f1358h = -2;
        this.f1359i = -2;
        this.f1362l = 1002;
        this.p = 0;
        this.f1354d = Integer.MAX_VALUE;
        this.f1357g = new e(this, 5);
        this.u = new dl(this);
        this.v = new dk(this);
        this.z = new e(this, 4);
        this.w = new Rect();
        this.f1351a = context;
        this.f1355e = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.a.a.o, i2, 0);
        this.f1360j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1361k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        an anVar = new an(context, attributeSet, i2);
        this.f1356f = anVar;
        anVar.setInputMethodMode(1);
    }

    public final void A(int i2) {
        this.p = i2;
    }

    public final void B(Rect rect) {
        this.x = rect != null ? new Rect(rect) : null;
    }

    public final void C(PopupWindow.OnDismissListener onDismissListener) {
        this.f1356f.setOnDismissListener(onDismissListener);
    }

    public final void D(AdapterView.OnItemClickListener onItemClickListener) {
        this.s = onItemClickListener;
    }

    public final void E(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.t = onItemSelectedListener;
    }

    public final boolean F() {
        return this.f1356f.getInputMethodMode() == 2;
    }

    public final boolean G() {
        return this.y;
    }

    public final void H() {
        this.f1356f.setAnimationStyle(0);
    }

    public final void I() {
        this.f1356f.setInputMethodMode(2);
    }

    public final void J() {
        this.y = true;
        this.f1356f.setFocusable(true);
    }

    public final void K() {
        this.o = true;
        this.n = true;
    }

    @Override // android.support.v7.view.menu.ah
    public final ListView bh() {
        return this.f1353c;
    }

    public final int bi() {
        return this.f1360j;
    }

    public final int bj() {
        if (this.m) {
            return this.f1361k;
        }
        return 0;
    }

    public final Drawable c() {
        return this.f1356f.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.q;
        if (dataSetObserver == null) {
            this.q = new dj(this);
        } else {
            ListAdapter listAdapter2 = this.f1352b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1352b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.q);
        }
        cl clVar = this.f1353c;
        if (clVar != null) {
            clVar.setAdapter(this.f1352b);
        }
    }

    public final void f(Drawable drawable) {
        this.f1356f.setBackgroundDrawable(drawable);
    }

    public final void g(int i2) {
        this.f1360j = i2;
    }

    public final void j(int i2) {
        this.f1361k = i2;
        this.m = true;
    }

    @Override // android.support.v7.view.menu.ah
    public final void k() {
        this.f1356f.dismiss();
        this.f1356f.setContentView(null);
        this.f1353c = null;
        this.f1355e.removeCallbacks(this.f1357g);
    }

    public final int p() {
        if (u()) {
            return this.f1353c.getSelectedItemPosition();
        }
        return -1;
    }

    public final int q() {
        return this.f1359i;
    }

    public final long r() {
        if (u()) {
            return this.f1353c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    @Override // android.support.v7.view.menu.ah
    public final void s() {
        int paddingTop;
        int iMakeMeasureSpec;
        if (this.f1353c == null) {
            cl clVarT = t(this.f1351a, !this.y);
            this.f1353c = clVarT;
            clVarT.setAdapter(this.f1352b);
            this.f1353c.setOnItemClickListener(this.s);
            this.f1353c.setFocusable(true);
            this.f1353c.setFocusableInTouchMode(true);
            this.f1353c.setOnItemSelectedListener(new di(this));
            this.f1353c.setOnScrollListener(this.v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.t;
            if (onItemSelectedListener != null) {
                this.f1353c.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.f1356f.setContentView(this.f1353c);
        }
        Drawable background = this.f1356f.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            paddingTop = rect.top + rect.bottom;
            if (!this.m) {
                this.f1361k = -rect.top;
            }
        } else {
            rect.setEmpty();
            paddingTop = 0;
        }
        int maxAvailableHeight = this.f1356f.getMaxAvailableHeight(this.r, this.f1361k, this.f1356f.getInputMethodMode() == 2);
        if (this.f1358h != -1) {
            int i2 = this.f1359i;
            if (i2 == -2) {
                int i3 = this.f1351a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.w;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i2 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else {
                int i4 = this.f1351a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.w;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
            }
            maxAvailableHeight = this.f1353c.c(iMakeMeasureSpec, maxAvailableHeight);
            paddingTop = maxAvailableHeight > 0 ? paddingTop + this.f1353c.getPaddingTop() + this.f1353c.getPaddingBottom() : 0;
        }
        boolean zF = F();
        PopupWindowCompat.setWindowLayoutType(this.f1356f, this.f1362l);
        int i5 = maxAvailableHeight + paddingTop;
        if (this.f1356f.isShowing()) {
            if (this.r.isAttachedToWindow()) {
                int width = this.f1359i;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.r.getWidth();
                }
                int i6 = this.f1358h;
                if (i6 == -1) {
                    if (true != zF) {
                        i5 = -1;
                    }
                    PopupWindow popupWindow = this.f1356f;
                    if (zF) {
                        popupWindow.setWidth(this.f1359i == -1 ? -1 : 0);
                        this.f1356f.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f1359i == -1 ? -1 : 0);
                        this.f1356f.setHeight(-1);
                    }
                } else if (i6 != -2) {
                    i5 = i6;
                }
                this.f1356f.setOutsideTouchable(true);
                this.f1356f.update(this.r, this.f1360j, this.f1361k, width < 0 ? -1 : width, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.f1359i;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.r.getWidth();
        }
        int i7 = this.f1358h;
        if (i7 == -1) {
            i5 = -1;
        } else if (i7 != -2) {
            i5 = i7;
        }
        this.f1356f.setWidth(width2);
        this.f1356f.setHeight(i5);
        this.f1356f.setIsClippedToScreen(true);
        this.f1356f.setOutsideTouchable(true);
        this.f1356f.setTouchInterceptor(this.u);
        if (this.o) {
            PopupWindowCompat.setOverlapAnchor(this.f1356f, this.n);
        }
        this.f1356f.setEpicenterBounds(this.x);
        PopupWindowCompat.showAsDropDown(this.f1356f, this.r, this.f1360j, this.f1361k, this.p);
        this.f1353c.setSelection(-1);
        if (!this.y || this.f1353c.isInTouchMode()) {
            x();
        }
        if (this.y) {
            return;
        }
        this.f1355e.post(this.z);
    }

    cl t(Context context, boolean z) {
        return new cl(context, z);
    }

    @Override // android.support.v7.view.menu.ah
    public final boolean u() {
        return this.f1356f.isShowing();
    }

    public final View v() {
        if (u()) {
            return this.f1353c.getSelectedView();
        }
        return null;
    }

    public final Object w() {
        if (u()) {
            return this.f1353c.getSelectedItem();
        }
        return null;
    }

    public final void x() {
        cl clVar = this.f1353c;
        if (clVar != null) {
            clVar.a(true);
            clVar.requestLayout();
        }
    }

    public final void y(View view) {
        this.r = view;
    }

    public final void z(int i2) {
        Drawable background = this.f1356f.getBackground();
        if (background == null) {
            this.f1359i = i2;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.f1359i = rect.left + rect.right + i2;
    }

    public dm(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, null);
    }
}
