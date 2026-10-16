package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class nk {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    public io f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public nk(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.s;
        this.l = toolbar.t;
        this.k = this.c != null;
        this.j = toolbar.e();
        Context context = toolbar.getContext();
        lah lahVar = new lah(context, context.obtainStyledAttributes(null, fs.a, R.attr.actionBarStyle, 0));
        int i = 15;
        this.o = lahVar.s(15);
        if (z) {
            CharSequence charSequenceU = lahVar.u(27);
            if (!TextUtils.isEmpty(charSequenceU)) {
                g(charSequenceU);
            }
            CharSequence charSequenceU2 = lahVar.u(25);
            if (!TextUtils.isEmpty(charSequenceU2)) {
                this.l = charSequenceU2;
                if ((this.b & 8) != 0) {
                    toolbar.u(charSequenceU2);
                }
            }
            Drawable drawableS = lahVar.s(20);
            if (drawableS != null) {
                e(drawableS);
            }
            Drawable drawableS2 = lahVar.s(17);
            if (drawableS2 != null) {
                this.h = drawableS2;
                r();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                q();
            }
            d(lahVar.n(10, 0));
            int iQ = lahVar.q(9, 0);
            if (iQ != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iQ, (ViewGroup) toolbar, false);
                View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                d(this.b | 16);
            }
            int iP = lahVar.p(13, 0);
            if (iP > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iP;
                toolbar.setLayoutParams(layoutParams);
            }
            int iL = lahVar.l(7, -1);
            int iL2 = lahVar.l(3, -1);
            if (iL >= 0 || iL2 >= 0) {
                int iMax = Math.max(iL, 0);
                int iMax2 = Math.max(iL2, 0);
                toolbar.k();
                toolbar.r.a(iMax, iMax2);
            }
            int iQ2 = lahVar.q(28, 0);
            if (iQ2 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.k = iQ2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context2, iQ2);
                }
            }
            int iQ3 = lahVar.q(26, 0);
            if (iQ3 != 0) {
                Context context3 = toolbar.getContext();
                toolbar.l = iQ3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context3, iQ3);
                }
            }
            int iQ4 = lahVar.q(22, 0);
            if (iQ4 != 0) {
                toolbar.r(iQ4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        lahVar.w();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.m = i2 != 0 ? a().getString(i2) : null;
                p();
            }
        }
        this.m = toolbar.h();
        toolbar.q(new ni(this));
    }

    private final void o(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.v(charSequence);
            if (this.k) {
                ebm.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void p() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.m);
            Toolbar toolbar = this.a;
            if (!zIsEmpty) {
                toolbar.o(this.m);
            } else {
                int i = this.n;
                toolbar.o(i != 0 ? toolbar.getContext().getText(i) : null);
            }
        }
    }

    private final void q() {
        int i = this.b & 4;
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.p(null);
            return;
        }
        Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.p(drawable);
    }

    private final void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                int i3 = i & 8;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    toolbar.v(this.c);
                    toolbar.u(this.l);
                } else {
                    toolbar.v(null);
                    toolbar.u(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            int i4 = i & 16;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        r();
    }

    public final void f() {
        this.e = true;
    }

    public final void g(CharSequence charSequence) {
        this.k = true;
        o(charSequence);
    }

    public final void h(int i) {
        this.a.setVisibility(i);
    }

    public final void i(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        o(charSequence);
    }

    public final boolean j() {
        return this.a.x();
    }

    public final boolean k() {
        io ioVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (ioVar = actionMenuView.c) == null || !ioVar.k()) ? false : true;
    }

    public final boolean l() {
        return this.a.y();
    }

    public final boolean m() {
        return this.a.z();
    }

    public final erb n(int i, long j) {
        erb erbVarV = ebm.v(this.a);
        erbVarV.u(i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        erbVarV.v(j);
        erbVarV.w(new nj(this, i));
        return erbVarV;
    }
}
