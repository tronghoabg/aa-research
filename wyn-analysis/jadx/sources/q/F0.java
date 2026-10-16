package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import i.AbstractC2820a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.InterfaceC3747B;

/* loaded from: classes.dex */
public class F0 implements InterfaceC3747B {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f43624A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f43625B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f43626C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f43627a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f43628b;

    /* renamed from: c, reason: collision with root package name */
    public C3838t0 f43629c;

    /* renamed from: f, reason: collision with root package name */
    public int f43632f;

    /* renamed from: g, reason: collision with root package name */
    public int f43633g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f43635i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43636j;
    public boolean k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f43639n;

    /* renamed from: o, reason: collision with root package name */
    public View f43640o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f43641p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f43642q;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f43643r;

    /* renamed from: s, reason: collision with root package name */
    public final B9.c f43644s;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f43647v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f43649x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f43650y;

    /* renamed from: z, reason: collision with root package name */
    public final C3843w f43651z;

    /* renamed from: d, reason: collision with root package name */
    public final int f43630d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f43631e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f43634h = BackupConstant.SCENE_BACKUP_RENDER_FAIL;

    /* renamed from: l, reason: collision with root package name */
    public int f43637l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f43638m = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: t, reason: collision with root package name */
    public final E0 f43645t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f43646u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f43648w = new Rect();

    static {
        int i5 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i5 <= 28) {
            try {
                f43624A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f43626C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f43625B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public F0(Context context, AttributeSet attributeSet, int i5) {
        int resourceId;
        int i10 = 1;
        this.f43643r = new C0(this, i10);
        this.f43644s = new B9.c(this, i10);
        this.f43627a = context;
        this.f43647v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36451o, i5, 0);
        this.f43632f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f43633g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f43635i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C3843w c3843w = new C3843w(context, attributeSet, i5, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36455s, i5, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c3843w.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c3843w.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : Fe.g.B(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f43651z = c3843w;
        c3843w.setInputMethodMode(1);
    }

    @Override // p.InterfaceC3747B
    public final boolean a() {
        return this.f43651z.isShowing();
    }

    public final int b() {
        return this.f43632f;
    }

    public final void c(int i5) {
        this.f43632f = i5;
    }

    @Override // p.InterfaceC3747B
    public final void dismiss() {
        C3843w c3843w = this.f43651z;
        c3843w.dismiss();
        c3843w.setContentView(null);
        this.f43629c = null;
        this.f43647v.removeCallbacks(this.f43643r);
    }

    public final Drawable e() {
        return this.f43651z.getBackground();
    }

    public final void g(int i5) {
        this.f43633g = i5;
        this.f43635i = true;
    }

    public final int j() {
        if (this.f43635i) {
            return this.f43633g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        D0 d02 = this.f43639n;
        if (d02 == null) {
            this.f43639n = new D0(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f43628b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f43628b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f43639n);
        }
        C3838t0 c3838t0 = this.f43629c;
        if (c3838t0 != null) {
            c3838t0.setAdapter(this.f43628b);
        }
    }

    public final void l(Drawable drawable) {
        this.f43651z.setBackgroundDrawable(drawable);
    }

    @Override // p.InterfaceC3747B
    public final C3838t0 n() {
        return this.f43629c;
    }

    public C3838t0 o(Context context, boolean z2) {
        return new C3838t0(context, z2);
    }

    public final void p(int i5) {
        Drawable background = this.f43651z.getBackground();
        if (background == null) {
            this.f43631e = i5;
            return;
        }
        Rect rect = this.f43648w;
        background.getPadding(rect);
        this.f43631e = rect.left + rect.right + i5;
    }

    @Override // p.InterfaceC3747B
    public final void show() {
        int i5;
        int iA;
        int paddingBottom;
        C3838t0 c3838t0;
        C3838t0 c3838t02 = this.f43629c;
        C3843w c3843w = this.f43651z;
        Context context = this.f43627a;
        if (c3838t02 == null) {
            C3838t0 c3838t0O = o(context, !this.f43650y);
            this.f43629c = c3838t0O;
            c3838t0O.setAdapter(this.f43628b);
            this.f43629c.setOnItemClickListener(this.f43641p);
            this.f43629c.setFocusable(true);
            this.f43629c.setFocusableInTouchMode(true);
            this.f43629c.setOnItemSelectedListener(new C3850z0(this, 0));
            this.f43629c.setOnScrollListener(this.f43645t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f43642q;
            if (onItemSelectedListener != null) {
                this.f43629c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c3843w.setContentView(this.f43629c);
        }
        Drawable background = c3843w.getBackground();
        Rect rect = this.f43648w;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i5 = rect.bottom + i10;
            if (!this.f43635i) {
                this.f43633g = -i10;
            }
        } else {
            rect.setEmpty();
            i5 = 0;
        }
        boolean z2 = c3843w.getInputMethodMode() == 2;
        View view = this.f43640o;
        int i11 = this.f43633g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f43625B;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c3843w, view, Integer.valueOf(i11), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = c3843w.getMaxAvailableHeight(view, i11);
            }
        } else {
            iA = A0.a(c3843w, view, i11, z2);
        }
        int i12 = this.f43630d;
        if (i12 == -1) {
            paddingBottom = iA + i5;
        } else {
            int i13 = this.f43631e;
            int iA2 = this.f43629c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f43629c.getPaddingBottom() + this.f43629c.getPaddingTop() + i5 : 0);
        }
        boolean z10 = this.f43651z.getInputMethodMode() == 2;
        c3843w.setWindowLayoutType(this.f43634h);
        if (c3843w.isShowing()) {
            View view2 = this.f43640o;
            WeakHashMap weakHashMap = k1.S.f38779a;
            if (view2.isAttachedToWindow()) {
                int width = this.f43631e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f43640o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        c3843w.setWidth(this.f43631e == -1 ? -1 : 0);
                        c3843w.setHeight(0);
                    } else {
                        c3843w.setWidth(this.f43631e == -1 ? -1 : 0);
                        c3843w.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                c3843w.setOutsideTouchable(true);
                int i14 = width;
                View view3 = this.f43640o;
                int i15 = this.f43632f;
                int i16 = this.f43633g;
                if (i14 < 0) {
                    i14 = -1;
                }
                c3843w.update(view3, i15, i16, i14, i12 < 0 ? -1 : i12);
                return;
            }
            return;
        }
        int width2 = this.f43631e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f43640o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        c3843w.setWidth(width2);
        c3843w.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f43624A;
            if (method2 != null) {
                try {
                    method2.invoke(c3843w, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c3843w, true);
        }
        c3843w.setOutsideTouchable(true);
        c3843w.setTouchInterceptor(this.f43644s);
        if (this.k) {
            c3843w.setOverlapAnchor(this.f43636j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f43626C;
            if (method3 != null) {
                try {
                    method3.invoke(c3843w, this.f43649x);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            B0.a(c3843w, this.f43649x);
        }
        c3843w.showAsDropDown(this.f43640o, this.f43632f, this.f43633g, this.f43637l);
        this.f43629c.setSelection(-1);
        if ((!this.f43650y || this.f43629c.isInTouchMode()) && (c3838t0 = this.f43629c) != null) {
            c3838t0.setListSelectionHidden(true);
            c3838t0.requestLayout();
        }
        if (this.f43650y) {
            return;
        }
        this.f43647v.post(this.f43646u);
    }
}
