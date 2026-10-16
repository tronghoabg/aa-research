package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class hq {
    public View a;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final hg e;
    private final boolean f;
    private final int g;
    private boolean h;
    private hr i;
    private ho j;
    public int b = 8388611;
    private final PopupWindow.OnDismissListener k = new hp(this);

    public hq(Context context, hg hgVar, View view, boolean z, int i) {
        this.d = context;
        this.e = hgVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final ho a() {
        ho haVar = this.j;
        if (haVar == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            haVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new ha(context, this.a, this.g, this.f) : new hz(context, this.e, this.a, this.g, this.f);
            haVar.j(this.e);
            haVar.p(this.k);
            haVar.l(this.a);
            haVar.d(this.i);
            haVar.m(this.h);
            haVar.n(this.b);
            this.j = haVar;
        }
        return haVar;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        ho hoVar = this.j;
        if (hoVar != null) {
            hoVar.m(z);
        }
    }

    public final void e(hr hrVar) {
        this.i = hrVar;
        ho hoVar = this.j;
        if (hoVar != null) {
            hoVar.d(hrVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        ho hoVarA = a();
        hoVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            hoVarA.o(i);
            hoVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            hoVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        hoVarA.s();
    }

    public final boolean g() {
        ho hoVar = this.j;
        return hoVar != null && hoVar.u();
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
