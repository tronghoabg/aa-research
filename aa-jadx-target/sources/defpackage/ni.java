package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ni implements defpackage.ht {
    defpackage.hh a;
    public defpackage.hj b;
    final /* synthetic */ android.support.v7.widget.Toolbar c;

    public ni(android.support.v7.widget.Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.ht
    public final void b(android.content.Context context, defpackage.hh hhVar) {
        defpackage.hj hjVar;
        defpackage.hh hhVar2 = this.a;
        if (hhVar2 != null && (hjVar = this.b) != null) {
            hhVar2.t(hjVar);
        }
        this.a = hhVar;
    }

    @Override // defpackage.ht
    public final void d(defpackage.hs hsVar) {
        throw null;
    }

    @Override // defpackage.ht
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ht
    public final boolean f(ib ibVar) {
        return false;
    }

    @Override // defpackage.ht
    public final boolean g(defpackage.hj hjVar) {
        android.support.v7.widget.Toolbar toolbar = this.c;
        hl hlVar = toolbar.h;
        if (hlVar instanceof hl) {
            hlVar.a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        java.util.ArrayList arrayList = toolbar.u;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                hjVar.h(false);
                toolbar.w();
                return true;
            }
            toolbar.addView((android.view.View) arrayList.get(size));
        }
    }

    @Override // defpackage.ht
    public final boolean h(defpackage.hj hjVar) {
        android.support.v7.widget.Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new defpackage.jf(toolbar.getContext(), null, 2130971065);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            defpackage.nj njVar = new defpackage.nj();
            njVar.a = (toolbar.m & 112) | 8388611;
            njVar.b = 2;
            toolbar.g.setLayoutParams(njVar);
            toolbar.g.setOnClickListener(new if(toolbar, 2));
        }
        android.view.ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = hjVar.getActionView();
        this.b = hjVar;
        android.view.ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.h);
            }
            defpackage.nj njVar2 = new defpackage.nj();
            njVar2.a = (toolbar.m & 112) | 8388611;
            njVar2.b = 2;
            toolbar.h.setLayoutParams(njVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((defpackage.nj) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.u.add(childAt);
            }
        }
        toolbar.requestLayout();
        hjVar.h(true);
        hl hlVar = toolbar.h;
        if (hlVar instanceof hl) {
            hlVar.a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.ht
    public final void i() {
        if (this.b != null) {
            defpackage.hh hhVar = this.a;
            if (hhVar != null) {
                int size = hhVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.ht
    public final void c(defpackage.hh hhVar, boolean z) {
    }
}
