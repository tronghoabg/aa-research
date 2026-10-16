package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43106a;

    /* renamed from: b, reason: collision with root package name */
    public final k f43107b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f43108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43109d;

    /* renamed from: e, reason: collision with root package name */
    public View f43110e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43112g;

    /* renamed from: h, reason: collision with root package name */
    public w f43113h;

    /* renamed from: i, reason: collision with root package name */
    public s f43114i;

    /* renamed from: j, reason: collision with root package name */
    public t f43115j;

    /* renamed from: f, reason: collision with root package name */
    public int f43111f = 8388611;
    public final t k = new t(this);

    public v(int i5, Context context, View view, k kVar, boolean z2) {
        this.f43106a = context;
        this.f43107b = kVar;
        this.f43110e = view;
        this.f43108c = z2;
        this.f43109d = i5;
    }

    public final s a() {
        s viewOnKeyListenerC3748C;
        if (this.f43114i == null) {
            Context context = this.f43106a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC3748C = new ViewOnKeyListenerC3754e(context, this.f43110e, this.f43109d, this.f43108c);
            } else {
                View view = this.f43110e;
                Context context2 = this.f43106a;
                boolean z2 = this.f43108c;
                viewOnKeyListenerC3748C = new ViewOnKeyListenerC3748C(this.f43109d, context2, view, this.f43107b, z2);
            }
            viewOnKeyListenerC3748C.i(this.f43107b);
            viewOnKeyListenerC3748C.q(this.k);
            viewOnKeyListenerC3748C.k(this.f43110e);
            viewOnKeyListenerC3748C.c(this.f43113h);
            viewOnKeyListenerC3748C.m(this.f43112g);
            viewOnKeyListenerC3748C.o(this.f43111f);
            this.f43114i = viewOnKeyListenerC3748C;
        }
        return this.f43114i;
    }

    public final boolean b() {
        s sVar = this.f43114i;
        return sVar != null && sVar.a();
    }

    public void c() {
        this.f43114i = null;
        t tVar = this.f43115j;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    public final void d(int i5, int i10, boolean z2, boolean z10) {
        s sVarA = a();
        sVarA.r(z10);
        if (z2) {
            int i11 = this.f43111f;
            View view = this.f43110e;
            WeakHashMap weakHashMap = S.f38779a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i5 -= this.f43110e.getWidth();
            }
            sVarA.p(i5);
            sVarA.s(i10);
            int i12 = (int) ((this.f43106a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            sVarA.f43104a = new Rect(i5 - i12, i10 - i12, i5 + i12, i10 + i12);
        }
        sVarA.show();
    }
}
