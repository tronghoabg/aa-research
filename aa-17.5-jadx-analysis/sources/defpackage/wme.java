package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class wme extends fg {
    public BottomSheetBehavior a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public wmd f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private final boolean i;
    private final wlx j;
    private oit k;

    public wme(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.c = true;
        this.d = true;
        this.j = new wmc(this);
        e();
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.i) {
            FrameLayout frameLayout = this.g;
            dse dseVar = new dse(this, 2);
            int[] iArr = ebm.a;
            ebe.e(frameLayout, dseVar);
        }
        this.b.removeAllViews();
        FrameLayout frameLayout2 = this.b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new mga(this, 5));
        FrameLayout frameLayout3 = this.b;
        wma wmaVar = new wma(this);
        ebm.r(frameLayout3);
        frameLayout3.setAccessibilityDelegate(wmaVar.C);
        this.b.setOnTouchListener(new wmb());
        return this.g;
    }

    private final void h() {
        oit oitVar = this.k;
        if (oitVar == null) {
            return;
        }
        if (this.c) {
            oitVar.c();
        } else {
            oitVar.b();
        }
    }

    private final void i() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) this.g.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(R.id.design_bottom_sheet);
            this.b = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorM = BottomSheetBehavior.M(frameLayout2);
            this.a = bottomSheetBehaviorM;
            bottomSheetBehaviorM.N(this.j);
            this.a.T(this.c);
            this.k = new oit(this.a, this.b);
        }
    }

    public final BottomSheetBehavior a() {
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
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.i && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            ebh.d(window, z2);
            wmd wmdVar = this.f;
            if (wmdVar != null) {
                wmdVar.d(window);
            }
        }
        h();
    }

    @Override // defpackage.fg, defpackage.oc, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        wmd wmdVar = this.f;
        if (wmdVar != null) {
            wmdVar.d(null);
        }
        oit oitVar = this.k;
        if (oitVar != null) {
            oitVar.b();
        }
    }

    @Override // defpackage.oc, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.y != 5) {
            return;
        }
        bottomSheetBehavior.U(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.c != z) {
            this.c = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.T(z);
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

    @Override // defpackage.fg, defpackage.oc, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    @Override // defpackage.fg, defpackage.oc, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.fg, defpackage.oc, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
