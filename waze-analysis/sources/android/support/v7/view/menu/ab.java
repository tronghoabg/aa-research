package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ab {

    /* renamed from: a, reason: collision with root package name */
    private final Context f750a;

    /* renamed from: b, reason: collision with root package name */
    private final q f751b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f752c;

    /* renamed from: d, reason: collision with root package name */
    private final int f753d;

    /* renamed from: e, reason: collision with root package name */
    private View f754e;

    /* renamed from: f, reason: collision with root package name */
    private int f755f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f756g;

    /* renamed from: h, reason: collision with root package name */
    private ac f757h;

    /* renamed from: i, reason: collision with root package name */
    private z f758i;

    /* renamed from: j, reason: collision with root package name */
    private PopupWindow.OnDismissListener f759j;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f760k;

    public ab(Context context, q qVar, View view, boolean z, int i2) {
        this.f755f = GravityCompat.START;
        this.f760k = new aa(this);
        this.f750a = context;
        this.f751b = qVar;
        this.f754e = view;
        this.f752c = z;
        this.f753d = i2;
    }

    private final void l(int i2, int i3, boolean z, boolean z2) {
        z zVarA = a();
        zVarA.q(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.f755f, this.f754e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f754e.getWidth();
            }
            zVarA.o(i2);
            zVarA.r(i3);
            int i4 = (int) ((this.f750a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i5 = i2 + i4;
            zVarA.x(new Rect(i2 - i4, i3 - i4, i5, i3 + i4));
        }
        zVarA.s();
    }

    public final z a() {
        z kVar = this.f758i;
        if (kVar == null) {
            Context context = this.f750a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            kVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new k(context, this.f754e, this.f753d, this.f752c) : new ak(context, this.f751b, this.f754e, this.f753d, this.f752c);
            kVar.b(this.f751b);
            kVar.p(this.f760k);
            kVar.l(this.f754e);
            kVar.e(this.f757h);
            kVar.m(this.f756g);
            kVar.n(this.f755f);
            this.f758i = kVar;
        }
        return kVar;
    }

    public final void b() {
        if (h()) {
            this.f758i.k();
        }
    }

    protected void c() {
        this.f758i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f759j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(View view) {
        this.f754e = view;
    }

    public final void e(boolean z) {
        this.f756g = z;
        z zVar = this.f758i;
        if (zVar != null) {
            zVar.m(z);
        }
    }

    public final void f(PopupWindow.OnDismissListener onDismissListener) {
        this.f759j = onDismissListener;
    }

    public final void g(ac acVar) {
        this.f757h = acVar;
        z zVar = this.f758i;
        if (zVar != null) {
            zVar.e(acVar);
        }
    }

    public final boolean h() {
        z zVar = this.f758i;
        return zVar != null && zVar.u();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.f754e == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public final boolean j(int i2, int i3) {
        if (h()) {
            return true;
        }
        if (this.f754e == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }

    public final void k() {
        this.f755f = GravityCompat.END;
    }

    public ab(Context context, q qVar, View view, boolean z) {
        this(context, qVar, view, z, R.attr.actionOverflowMenuStyle);
    }
}
