package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wnb extends defpackage.fh {
    public com.google.android.material.bottomsheet.BottomSheetBehavior a;
    public android.widget.FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public defpackage.wna f;
    private android.widget.FrameLayout g;
    private androidx.coordinatorlayout.widget.CoordinatorLayout h;
    private final boolean i;
    private final defpackage.wmv j;
    private defpackage.zps k;

    public wnb(android.content.Context context, int i) {
        if (i == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            i = context.getTheme().resolveAttribute(2130968749, typedValue, true) ? typedValue.resourceId : 2132149912;
        }
        super(context, i);
        this.c = true;
        this.d = true;
        this.j = new defpackage.wmz(this);
        e();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{2130969222});
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.view.View b(int i, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        i();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.g.findViewById(2131427860);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        if (this.i) {
            android.widget.FrameLayout frameLayout = this.g;
            defpackage.eef eefVar = new defpackage.eef(this, 3, null);
            int[] iArr = defpackage.ebt.a;
            defpackage.ebl.e(frameLayout, eefVar);
        }
        this.b.removeAllViews();
        android.widget.FrameLayout frameLayout2 = this.b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(2131429801).setOnClickListener(new sea(this, 17));
        defpackage.ebt.n(this.b, new defpackage.wmy(this));
        this.b.setOnTouchListener(new qgq(5));
        return this.g;
    }

    private final void h() {
        defpackage.zps zpsVar = this.k;
        if (zpsVar == null) {
            return;
        }
        if (this.c) {
            zpsVar.e();
        } else {
            zpsVar.d();
        }
    }

    private final void i() {
        if (this.g == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), 2131624139, null);
            this.g = frameLayout;
            this.h = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.g.findViewById(2131427860);
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) this.g.findViewById(2131427998);
            this.b = frameLayout2;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorB = com.google.android.material.bottomsheet.BottomSheetBehavior.B(frameLayout2);
            this.a = bottomSheetBehaviorB;
            bottomSheetBehaviorB.C(this.j);
            this.a.I(this.c);
            this.k = new defpackage.zps(this.a, this.b);
        }
    }

    public final com.google.android.material.bottomsheet.BottomSheetBehavior a() {
        if (this.a == null) {
            i();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.i && android.graphics.Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            android.widget.FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            defpackage.ebo.d(window, z2);
            defpackage.wna wnaVar = this.f;
            if (wnaVar != null) {
                wnaVar.d(window);
            }
        }
        h();
    }

    @Override // defpackage.fh, defpackage.of, android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        defpackage.wna wnaVar = this.f;
        if (wnaVar != null) {
            wnaVar.d(null);
        }
        defpackage.zps zpsVar = this.k;
        if (zpsVar != null) {
            zpsVar.d();
        }
    }

    @Override // defpackage.of, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.y != 5) {
            return;
        }
        bottomSheetBehavior.J(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.c != z) {
            this.c = z;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z);
            }
            if (getWindow() != null) {
                h();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.c) {
            this.c = true;
        }
        this.d = z;
        this.e = true;
    }

    @Override // defpackage.fh, defpackage.of, android.app.Dialog
    public final void setContentView(android.view.View view) {
        super.setContentView(b(0, view, null));
    }

    @Override // defpackage.fh, defpackage.of, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.fh, defpackage.of, android.app.Dialog
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
