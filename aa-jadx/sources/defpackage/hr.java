package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class hr {
    public android.view.View a;
    public android.widget.PopupWindow.OnDismissListener c;
    private final android.content.Context d;
    private final defpackage.hh e;
    private final boolean f;
    private final int g;
    private boolean h;
    private defpackage.hs i;
    private defpackage.hp j;
    public int b = 8388611;
    private final android.widget.PopupWindow.OnDismissListener k = new defpackage.hq(this);

    public hr(android.content.Context context, defpackage.hh hhVar, android.view.View view, boolean z, int i) {
        this.d = context;
        this.e = hhVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final defpackage.hp a() {
        defpackage.hp hbVar = this.j;
        if (hbVar == null) {
            android.content.Context context = this.d;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            hbVar = java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.abc_cascading_menus_min_smallest_width) ? new defpackage.hb(context, this.a, this.g, this.f) : new defpackage.ia(context, this.e, this.a, this.g, this.f);
            hbVar.j(this.e);
            hbVar.p(this.k);
            hbVar.l(this.a);
            hbVar.d(this.i);
            hbVar.m(this.h);
            hbVar.n(this.b);
            this.j = hbVar;
        }
        return hbVar;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    protected void c() {
        this.j = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        defpackage.hp hpVar = this.j;
        if (hpVar != null) {
            hpVar.m(z);
        }
    }

    public final void e(defpackage.hs hsVar) {
        this.i = hsVar;
        defpackage.hp hpVar = this.j;
        if (hpVar != null) {
            hpVar.d(hsVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        defpackage.hp hpVarA = a();
        hpVarA.q(z2);
        if (z) {
            if ((android.view.Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            hpVarA.o(i);
            hpVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            hpVarA.g = new android.graphics.Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        hpVarA.s();
    }

    public final boolean g() {
        defpackage.hp hpVar = this.j;
        return hpVar != null && hpVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }
}
