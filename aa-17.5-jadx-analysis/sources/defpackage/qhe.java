package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.gearhead.appdecor.AppContentLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class qhe extends qfi {
    private static final yph c = yph.c("ADU.SysUiFreeAppLayout");
    protected final AppContentLayout a;
    public int b;
    private ykd d;

    public qhe(Context context, final Context context2) {
        super(context2);
        this.b = 0;
        LayoutInflater.from(context2).inflate(R.layout.system_ui_free_car_activity, (ViewGroup) this, true);
        setBackgroundColor(-16777216);
        AppContentLayout appContentLayout = (AppContentLayout) findViewById(R.id.content_view_container);
        this.a = appContentLayout;
        appContentLayout.a = context.getClassLoader();
        appContentLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: qhd
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                qhe qheVar = this.a;
                int dimension = 0;
                if (qheVar.getHeight() == 0) {
                    ols.a(view, new qhc(dimension));
                    return windowInsets;
                }
                int i = qheVar.b;
                if (i != 0) {
                    if (i == 1) {
                        dimension = (int) context2.getResources().getDimension(R.dimen.status_bar_height);
                    } else if (i != 2) {
                        throw new IllegalStateException(a.bp(i, "Invalid appBarInsetBehavior: "));
                    }
                }
                return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop() + dimension, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
        });
    }

    private final void g(int i) {
        ykd ykdVar = this.d;
        if (ykdVar != null) {
            ykdVar.F(i);
        }
    }

    @Override // defpackage.qfi
    public final void a(Bundle bundle) {
        ((ype) c.l().ai((char) 7246)).y("onRestoreInstanceState %s", bundle);
        c(bundle.getBoolean("appContentFocusable", true));
    }

    @Override // defpackage.qfi
    public final void b(Bundle bundle) {
        ((ype) c.l().ai((char) 7247)).y("onSaveInstanceState %s", bundle);
        bundle.putBoolean("appContentFocusable", this.a.getDescendantFocusability() != 393216);
    }

    @Override // defpackage.qfi
    public final void c(boolean z) {
        AppContentLayout appContentLayout = this.a;
        if (z) {
            appContentLayout.setDescendantFocusability(131072);
        } else {
            appContentLayout.setDescendantFocusability(393216);
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        yph yphVar = c;
        ((ype) yphVar.l().ai((char) 7241)).y("dispatchGenericMotionEvent: %s", motionEvent);
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i);
            boolean zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
            if (zDispatchGenericMotionEvent) {
                ((ype) yphVar.l().ai(7243)).M("View: %s handled dispatchGenericMotionEvent(%s)", childAt, motionEvent);
                z = zDispatchGenericMotionEvent;
                break;
            }
            i++;
            z = zDispatchGenericMotionEvent;
        }
        if (z) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        yph yphVar = c;
        ((ype) yphVar.l().ai((char) 7244)).y("dispatchKeyEvent: %s", keyEvent);
        if (!super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        ((ype) yphVar.l().ai((char) 7245)).y("super.dispatchKeyEvent handled dispatchKeyEvent(%s)", keyEvent);
        return true;
    }

    @Override // defpackage.qfi
    public final boolean e() {
        return this.a.requestFocus(66);
    }

    @Override // defpackage.qfi
    public final void f(ykd ykdVar) {
        this.d = ykdVar;
        g(getWindowSystemUiVisibility());
    }

    @Override // defpackage.qfi, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(getWindowSystemUiVisibility());
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        g(i);
    }

    @Override // defpackage.qfi
    public final void d(qfu qfuVar) {
    }
}
