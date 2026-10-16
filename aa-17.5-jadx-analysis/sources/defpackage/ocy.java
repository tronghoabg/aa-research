package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class ocy extends ocd implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnWindowAttachListener {
    private static final yph b = yph.c("GH.Tooltip.Anchor");
    private final View c;
    private boolean d;

    public ocy(View view) {
        this.c = view;
    }

    @Override // defpackage.ocd
    public final int a() {
        return this.c.getHeight();
    }

    @Override // defpackage.ocd
    public final int b() {
        return this.c.getWidth();
    }

    @Override // defpackage.ocd
    public final Context c() {
        Context context = this.c.getContext();
        context.getClass();
        return context;
    }

    @Override // defpackage.ocd
    public final Point d() {
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    @Override // defpackage.ocd
    public final void e(Runnable runnable) {
        kok kokVar = new kok(runnable, 13);
        View view = this.c;
        if (view.isLaidOut()) {
            kokVar.accept(view);
        } else {
            ols.a(view, kokVar);
        }
    }

    @Override // defpackage.ocd
    public final void f() {
        View view = this.c;
        view.getViewTreeObserver().addOnPreDrawListener(this);
        view.getViewTreeObserver().addOnWindowAttachListener(this);
    }

    @Override // defpackage.ocd
    public final void g() {
        View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.getViewTreeObserver().removeOnWindowAttachListener(this);
    }

    @Override // defpackage.ocd
    public final void h(Runnable runnable) {
        this.c.post(runnable);
    }

    @Override // defpackage.ocd
    public final void i() {
        this.c.requestFocus();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ocq ocqVar = this.a;
        if (ocqVar == null) {
            ((ype) b.h()).u("No Tooltip when drawn. Something went wrong");
            return true;
        }
        View view = this.c;
        if (view.isPressed()) {
            mcd.C(ocqVar, yzy.lL);
            b.l().u("Dismissing tooltip due to click on anchor");
            ocqVar.a();
        }
        if (this.d && !view.hasFocus()) {
            b.l().u("Dismissing tooltip due to losing focus");
            mcd.C(ocqVar, yzy.lO);
            ocqVar.a();
        }
        this.d = view.hasFocus();
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        this.a.getClass();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        ocq ocqVar = this.a;
        if (ocqVar == null) {
            ((ype) b.h()).u("No Tooltip when detached, unable to dismiss");
        } else {
            mcd.C(ocqVar, yzy.lK);
            ocqVar.a();
        }
    }
}
