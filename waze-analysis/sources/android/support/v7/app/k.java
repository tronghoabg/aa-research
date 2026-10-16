package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final g f609a;

    /* renamed from: b, reason: collision with root package name */
    private final int f610b;

    public k(Context context, int i2) {
        this.f609a = new g(new ContextThemeWrapper(context, l.a(context, i2)));
        this.f610b = i2;
    }

    public final Context a() {
        return this.f609a.f584a;
    }

    public l b() {
        ListAdapter dVar;
        g gVar = this.f609a;
        Context context = gVar.f584a;
        l lVar = new l(context, this.f610b);
        j jVar = lVar.f611a;
        View view = gVar.f589f;
        if (view != null) {
            jVar.b(view);
        } else {
            CharSequence charSequence = gVar.f588e;
            if (charSequence != null) {
                jVar.f(charSequence);
            }
            Drawable drawable = gVar.f587d;
            if (drawable != null) {
                jVar.d(drawable);
            }
            int i2 = gVar.f586c;
            if (i2 != 0) {
                jVar.c(i2);
            }
        }
        CharSequence charSequence2 = gVar.f590g;
        if (charSequence2 != null) {
            jVar.e(charSequence2);
        }
        CharSequence charSequence3 = gVar.f591h;
        if (charSequence3 != null) {
            jVar.i(-1, charSequence3, gVar.f592i);
        }
        CharSequence charSequence4 = gVar.f593j;
        if (charSequence4 != null) {
            jVar.i(-2, charSequence4, gVar.f594k);
        }
        if (gVar.o != null || gVar.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) gVar.f585b.inflate(jVar.f607k, (ViewGroup) null);
            if (gVar.t) {
                dVar = new d(gVar, context, jVar.f608l, gVar.o, alertController$RecycleListView);
            } else {
                int i3 = gVar.u ? jVar.m : jVar.n;
                ListAdapter iVar = gVar.p;
                if (iVar == null) {
                    iVar = new i(context, i3, gVar.o);
                }
                dVar = iVar;
            }
            jVar.f605i = dVar;
            jVar.f606j = gVar.v;
            if (gVar.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new e(gVar, jVar));
            } else if (gVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new f(gVar, alertController$RecycleListView, jVar));
            }
            if (gVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (gVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            jVar.f598b = alertController$RecycleListView;
        }
        View view2 = gVar.r;
        if (view2 != null) {
            jVar.g(view2);
        }
        lVar.setCancelable(gVar.f595l);
        if (gVar.f595l) {
            lVar.setCanceledOnTouchOutside(true);
        }
        lVar.setOnCancelListener(null);
        lVar.setOnDismissListener(gVar.m);
        DialogInterface.OnKeyListener onKeyListener = gVar.n;
        if (onKeyListener != null) {
            lVar.setOnKeyListener(onKeyListener);
        }
        return lVar;
    }

    public final void c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.p = listAdapter;
        gVar.q = onClickListener;
    }

    public final void d() {
        this.f609a.f595l = true;
    }

    public final void e(View view) {
        this.f609a.f589f = view;
    }

    public final void f() {
        this.f609a.f586c = R.drawable.flag_it_popup;
    }

    public final void g(Drawable drawable) {
        this.f609a.f587d = drawable;
    }

    public final void h(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.o = charSequenceArr;
        gVar.q = onClickListener;
    }

    public final void i(CharSequence charSequence) {
        this.f609a.f590g = charSequence;
    }

    public void j(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        g gVar = this.f609a;
        gVar.o = charSequenceArr;
        gVar.w = onMultiChoiceClickListener;
        gVar.s = zArr;
        gVar.t = true;
    }

    public final void k(DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.f593j = gVar.f584a.getText(android.R.string.cancel);
        gVar.f594k = onClickListener;
    }

    public final void l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.f593j = charSequence;
        gVar.f594k = onClickListener;
    }

    public final void m(DialogInterface.OnDismissListener onDismissListener) {
        this.f609a.m = onDismissListener;
    }

    public final void n(DialogInterface.OnKeyListener onKeyListener) {
        this.f609a.n = onKeyListener;
    }

    public final void o(DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.f591h = gVar.f584a.getText(android.R.string.ok);
        gVar.f592i = onClickListener;
    }

    public void p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.f591h = charSequence;
        gVar.f592i = onClickListener;
    }

    public final void q(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.p = listAdapter;
        gVar.q = onClickListener;
        gVar.v = i2;
        gVar.u = true;
    }

    public void r(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.f609a;
        gVar.o = charSequenceArr;
        gVar.q = onClickListener;
        gVar.v = i2;
        gVar.u = true;
    }

    public final void s(CharSequence charSequence) {
        this.f609a.f588e = charSequence;
    }

    public final void t(View view) {
        this.f609a.r = view;
    }

    public k(Context context) {
        this(context, l.a(context, 0));
    }
}
