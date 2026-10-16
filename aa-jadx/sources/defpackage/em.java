package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class em {
    public final defpackage.ej a;
    private final int b;

    public em(android.content.Context context, int i) {
        this.a = new defpackage.ej(new android.view.ContextThemeWrapper(context, defpackage.en.a(context, i)));
        this.b = i;
    }

    public final android.content.Context a() {
        return this.a.a;
    }

    public defpackage.en b() {
        android.widget.ListAdapter egVar;
        defpackage.ej ejVar = this.a;
        android.content.Context context = ejVar.a;
        defpackage.en enVar = new defpackage.en(context, this.b);
        android.support.v7.app.AlertController alertController = enVar.a;
        android.view.View view = ejVar.e;
        if (view != null) {
            alertController.w = view;
        } else {
            java.lang.CharSequence charSequence = ejVar.d;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            android.graphics.drawable.Drawable drawable = ejVar.c;
            if (drawable != null) {
                alertController.s = drawable;
                alertController.r = 0;
                android.widget.ImageView imageView = alertController.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.t.setImageDrawable(drawable);
                }
            }
        }
        java.lang.CharSequence charSequence2 = ejVar.f;
        if (charSequence2 != null) {
            alertController.e = charSequence2;
            android.widget.TextView textView = alertController.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        java.lang.CharSequence charSequence3 = ejVar.g;
        if (charSequence3 != null) {
            alertController.e(-1, charSequence3, ejVar.h);
        }
        java.lang.CharSequence charSequence4 = ejVar.i;
        if (charSequence4 != null) {
            alertController.e(-2, charSequence4, ejVar.j);
        }
        if (ejVar.o != null || ejVar.p != null) {
            android.support.v7.app.AlertController.RecycleListView recycleListView = (android.support.v7.app.AlertController.RecycleListView) ejVar.b.inflate(alertController.B, (android.view.ViewGroup) null);
            if (ejVar.t) {
                egVar = new defpackage.eg(ejVar, context, alertController.C, ejVar.o, recycleListView);
            } else {
                int i = ejVar.u ? alertController.D : alertController.E;
                android.widget.ListAdapter elVar = ejVar.p;
                if (elVar == null) {
                    elVar = new defpackage.el(context, i, ejVar.o);
                }
                egVar = elVar;
            }
            alertController.x = egVar;
            alertController.y = ejVar.v;
            if (ejVar.q != null) {
                recycleListView.setOnItemClickListener(new defpackage.eh(ejVar, alertController));
            } else if (ejVar.w != null) {
                recycleListView.setOnItemClickListener(new defpackage.ei(ejVar, recycleListView, alertController));
            }
            if (ejVar.u) {
                recycleListView.setChoiceMode(1);
            } else if (ejVar.t) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f = recycleListView;
        }
        android.view.View view2 = ejVar.r;
        if (view2 != null) {
            alertController.g = view2;
            alertController.h = false;
        }
        enVar.setCancelable(ejVar.k);
        if (ejVar.k) {
            enVar.setCanceledOnTouchOutside(true);
        }
        enVar.setOnCancelListener(ejVar.l);
        enVar.setOnDismissListener(ejVar.m);
        android.content.DialogInterface.OnKeyListener onKeyListener = ejVar.n;
        if (onKeyListener != null) {
            enVar.setOnKeyListener(onKeyListener);
        }
        return enVar;
    }

    public final void c(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.p = listAdapter;
        ejVar.q = onClickListener;
    }

    public final void d(boolean z) {
        this.a.k = z;
    }

    public final void e(android.view.View view) {
        this.a.e = view;
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
        this.a.c = drawable;
    }

    public final void g(int i) {
        defpackage.ej ejVar = this.a;
        ejVar.f = ejVar.a.getText(i);
    }

    public final void h(java.lang.CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void i(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.i = ejVar.a.getText(i);
        ejVar.j = onClickListener;
    }

    public final void j(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.i = charSequence;
        ejVar.j = onClickListener;
    }

    public final void k(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.g = ejVar.a.getText(i);
        ejVar.h = onClickListener;
    }

    public final void l(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.g = charSequence;
        ejVar.h = onClickListener;
    }

    public final void m(java.lang.CharSequence[] charSequenceArr, int i, android.content.DialogInterface.OnClickListener onClickListener) {
        defpackage.ej ejVar = this.a;
        ejVar.o = charSequenceArr;
        ejVar.q = onClickListener;
        ejVar.v = i;
        ejVar.u = true;
    }

    public final void n(int i) {
        defpackage.ej ejVar = this.a;
        ejVar.d = ejVar.a.getText(i);
    }

    public final void o(java.lang.CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void p(android.view.View view) {
        this.a.r = view;
    }

    public em(android.content.Context context) {
        this(context, defpackage.en.a(context, 0));
    }
}
