package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class em {
    public final ej a;
    private final int b;

    public em(Context context, int i) {
        this.a = new ej(new ContextThemeWrapper(context, en.a(context, i)));
        this.b = i;
    }

    public final Context a() {
        return this.a.a;
    }

    public en b() {
        ListAdapter egVar;
        ej ejVar = this.a;
        Context context = ejVar.a;
        en enVar = new en(context, this.b);
        AlertController alertController = enVar.a;
        View view = ejVar.e;
        if (view != null) {
            alertController.w = view;
        } else {
            CharSequence charSequence = ejVar.d;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            Drawable drawable = ejVar.c;
            if (drawable != null) {
                alertController.s = drawable;
                alertController.r = 0;
                ImageView imageView = alertController.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = ejVar.f;
        if (charSequence2 != null) {
            alertController.e = charSequence2;
            TextView textView = alertController.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = ejVar.g;
        if (charSequence3 != null) {
            alertController.e(-1, charSequence3, ejVar.h);
        }
        CharSequence charSequence4 = ejVar.i;
        if (charSequence4 != null) {
            alertController.e(-2, charSequence4, ejVar.j);
        }
        if (ejVar.o != null || ejVar.p != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) ejVar.b.inflate(alertController.B, (ViewGroup) null);
            if (ejVar.t) {
                egVar = new eg(ejVar, context, alertController.C, ejVar.o, recycleListView);
            } else {
                int i = ejVar.u ? alertController.D : alertController.E;
                ListAdapter elVar = ejVar.p;
                if (elVar == null) {
                    elVar = new el(context, i, ejVar.o);
                }
                egVar = elVar;
            }
            alertController.x = egVar;
            alertController.y = ejVar.v;
            if (ejVar.q != null) {
                recycleListView.setOnItemClickListener(new eh(ejVar, alertController));
            } else if (ejVar.w != null) {
                recycleListView.setOnItemClickListener(new ei(ejVar, recycleListView, alertController));
            }
            if (ejVar.u) {
                recycleListView.setChoiceMode(1);
            } else if (ejVar.t) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f = recycleListView;
        }
        View view2 = ejVar.r;
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
        DialogInterface.OnKeyListener onKeyListener = ejVar.n;
        if (onKeyListener != null) {
            enVar.setOnKeyListener(onKeyListener);
        }
        return enVar;
    }

    public final void c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.p = listAdapter;
        ejVar.q = onClickListener;
    }

    public final void d(boolean z) {
        this.a.k = z;
    }

    public final void e(View view) {
        this.a.e = view;
    }

    public final void f(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void g(int i) {
        ej ejVar = this.a;
        ejVar.f = ejVar.a.getText(i);
    }

    public final void h(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void i(int i, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.i = ejVar.a.getText(i);
        ejVar.j = onClickListener;
    }

    public final void j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.i = charSequence;
        ejVar.j = onClickListener;
    }

    public final void k(int i, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.g = ejVar.a.getText(i);
        ejVar.h = onClickListener;
    }

    public final void l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.g = charSequence;
        ejVar.h = onClickListener;
    }

    public final void m(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        ej ejVar = this.a;
        ejVar.o = charSequenceArr;
        ejVar.q = onClickListener;
        ejVar.v = i;
        ejVar.u = true;
    }

    public final void n(int i) {
        ej ejVar = this.a;
        ejVar.d = ejVar.a.getText(i);
    }

    public final void o(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void p(View view) {
        this.a.r = view;
    }

    public em(Context context) {
        this(context, en.a(context, 0));
    }
}
