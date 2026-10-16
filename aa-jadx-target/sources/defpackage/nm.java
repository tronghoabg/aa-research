package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nm {
    public final android.support.v7.widget.Toolbar a;
    public int b;
    java.lang.CharSequence c;
    public android.view.Window.Callback d;
    boolean e;
    public defpackage.ip f;
    private android.view.View g;
    private android.graphics.drawable.Drawable h;
    private android.graphics.drawable.Drawable i;
    private android.graphics.drawable.Drawable j;
    private boolean k;
    private java.lang.CharSequence l;
    private java.lang.CharSequence m;
    private int n;
    private android.graphics.drawable.Drawable o;

    public nm(android.support.v7.widget.Toolbar toolbar, boolean z) {
        android.graphics.drawable.Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.s;
        this.l = toolbar.t;
        this.k = this.c != null;
        this.j = toolbar.e();
        android.content.Context context = toolbar.getContext();
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(null, defpackage.ft.a, 2130968585, 0));
        int i = 15;
        this.o = lamVar.s(15);
        if (z) {
            java.lang.CharSequence charSequenceU = lamVar.u(27);
            if (!android.text.TextUtils.isEmpty(charSequenceU)) {
                g(charSequenceU);
            }
            java.lang.CharSequence charSequenceU2 = lamVar.u(25);
            if (!android.text.TextUtils.isEmpty(charSequenceU2)) {
                this.l = charSequenceU2;
                if ((this.b & 8) != 0) {
                    toolbar.u(charSequenceU2);
                }
            }
            android.graphics.drawable.Drawable drawableS = lamVar.s(20);
            if (drawableS != null) {
                e(drawableS);
            }
            android.graphics.drawable.Drawable drawableS2 = lamVar.s(17);
            if (drawableS2 != null) {
                this.h = drawableS2;
                r();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                q();
            }
            d(lamVar.n(10, 0));
            int iQ = lamVar.q(9, 0);
            if (iQ != 0) {
                android.view.View viewInflate = android.view.LayoutInflater.from(toolbar.getContext()).inflate(iQ, (android.view.ViewGroup) toolbar, false);
                android.view.View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                d(this.b | 16);
            }
            int iP = lamVar.p(13, 0);
            if (iP > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iP;
                toolbar.setLayoutParams(layoutParams);
            }
            int iL = lamVar.l(7, -1);
            int iL2 = lamVar.l(3, -1);
            if (iL >= 0 || iL2 >= 0) {
                int iMax = java.lang.Math.max(iL, 0);
                int iMax2 = java.lang.Math.max(iL2, 0);
                toolbar.k();
                toolbar.r.a(iMax, iMax2);
            }
            int iQ2 = lamVar.q(28, 0);
            if (iQ2 != 0) {
                android.content.Context context2 = toolbar.getContext();
                toolbar.k = iQ2;
                android.widget.TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context2, iQ2);
                }
            }
            int iQ3 = lamVar.q(26, 0);
            if (iQ3 != 0) {
                android.content.Context context3 = toolbar.getContext();
                toolbar.l = iQ3;
                android.widget.TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context3, iQ3);
                }
            }
            int iQ4 = lamVar.q(22, 0);
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
        lamVar.w();
        if (this.n != 2132083047) {
            this.n = 2132083047;
            if (android.text.TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.m = i2 != 0 ? a().getString(i2) : null;
                p();
            }
        }
        this.m = toolbar.h();
        toolbar.q(new defpackage.nk(this));
    }

    private final void o(java.lang.CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            android.support.v7.widget.Toolbar toolbar = this.a;
            toolbar.v(charSequence);
            if (this.k) {
                defpackage.ebt.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void p() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = android.text.TextUtils.isEmpty(this.m);
            android.support.v7.widget.Toolbar toolbar = this.a;
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
        android.support.v7.widget.Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.p(null);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.p(drawable);
    }

    private final void r() {
        android.graphics.drawable.Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final android.content.Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        android.support.v7.widget.ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        android.view.View view;
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
                android.support.v7.widget.Toolbar toolbar = this.a;
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
            android.support.v7.widget.Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void e(android.graphics.drawable.Drawable drawable) {
        this.i = drawable;
        r();
    }

    public final void f() {
        this.e = true;
    }

    public final void g(java.lang.CharSequence charSequence) {
        this.k = true;
        o(charSequence);
    }

    public final void h(int i) {
        this.a.setVisibility(i);
    }

    public final void i(java.lang.CharSequence charSequence) {
        if (this.k) {
            return;
        }
        o(charSequence);
    }

    public final boolean j() {
        return this.a.x();
    }

    public final boolean k() {
        defpackage.ip ipVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (ipVar = actionMenuView.c) == null || !ipVar.k()) ? false : true;
    }

    public final boolean l() {
        return this.a.y();
    }

    public final boolean m() {
        return this.a.z();
    }

    public final defpackage.erh n(int i, long j) {
        defpackage.erh erhVarU = defpackage.ebt.u(this.a);
        erhVarU.E(i == 0 ? 1.0f : 0.0f);
        erhVarU.F(j);
        erhVarU.G(new nl(this, i));
        return erhVarU;
    }
}
