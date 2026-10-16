package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gearhead.appdecor.AppContentLayout;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class qge extends qfi {
    private static final yph c = yph.c("ADU.LegacyCarAppLayout");
    protected final AppContentLayout a;
    public final StatusBarView b;
    private qfu d;
    private ykd e;

    public qge(Context context, Context context2) {
        super(context2);
        LayoutInflater.from(context2).inflate(R.layout.adu_activity, (ViewGroup) this, true);
        setBackgroundColor(-16777216);
        this.b = (StatusBarView) findViewById(R.id.status_bar);
        AppContentLayout appContentLayout = (AppContentLayout) findViewById(R.id.content_view_container);
        this.a = appContentLayout;
        appContentLayout.a = context.getClassLoader();
        appContentLayout.setOnApplyWindowInsetsListener(new jsg(this, 3));
    }

    private final void g(int i) {
        ykd ykdVar = this.e;
        if (ykdVar != null) {
            ykdVar.F(i);
        }
    }

    @Override // defpackage.qfi
    public final void a(Bundle bundle) {
        ((ype) c.l().ai((char) 7113)).y("onRestoreInstanceState %s", bundle);
        c(bundle.getBoolean("appContentFocusable", true));
    }

    @Override // defpackage.qfi
    public final void b(Bundle bundle) {
        ((ype) c.l().ai((char) 7114)).y("onSaveInstanceState %s", bundle);
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

    @Override // defpackage.qfi
    public final void d(qfu qfuVar) {
        this.d = qfuVar;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        yph yphVar = c;
        ((ype) yphVar.l().ai((char) 7107)).y("dispatchGenericMotionEvent: %s", motionEvent);
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i);
            boolean zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
            if (zDispatchGenericMotionEvent) {
                ((ype) yphVar.l().ai(7109)).M("View: %s handled dispatchGenericMotionEvent(%s)", childAt, motionEvent);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qge.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.qfi
    public final boolean e() {
        return this.a.requestFocus(66);
    }

    @Override // defpackage.qfi
    public final void f(ykd ykdVar) {
        this.e = ykdVar;
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
}
