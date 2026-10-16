package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472j extends P {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f18882s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18883g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18884h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f18885i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f18886j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f18887l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18888m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18889n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f18890o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f18891p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f18892q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f18893r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((m0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.P
    public final boolean a(m0 m0Var, m0 m0Var2, O o7, O o10) {
        int i5;
        int i10;
        int i11 = o7.f18777a;
        int i12 = o7.f18778b;
        if (m0Var2.shouldIgnore()) {
            int i13 = o7.f18777a;
            i10 = o7.f18778b;
            i5 = i13;
        } else {
            i5 = o10.f18777a;
            i10 = o10.f18778b;
        }
        if (m0Var == m0Var2) {
            return g(m0Var, i11, i12, i5, i10);
        }
        float translationX = m0Var.itemView.getTranslationX();
        float translationY = m0Var.itemView.getTranslationY();
        float alpha = m0Var.itemView.getAlpha();
        l(m0Var);
        m0Var.itemView.setTranslationX(translationX);
        m0Var.itemView.setTranslationY(translationY);
        m0Var.itemView.setAlpha(alpha);
        l(m0Var2);
        m0Var2.itemView.setTranslationX(-((int) ((i5 - i11) - translationX)));
        m0Var2.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        m0Var2.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.k;
        C1470h c1470h = new C1470h();
        c1470h.f18871a = m0Var;
        c1470h.f18872b = m0Var2;
        c1470h.f18873c = i11;
        c1470h.f18874d = i12;
        c1470h.f18875e = i5;
        c1470h.f18876f = i10;
        arrayList.add(c1470h);
        return true;
    }

    @Override // androidx.recyclerview.widget.P
    public final void d(m0 m0Var) {
        View view = m0Var.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f18886j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1471i) arrayList.get(size)).f18877a == m0Var) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c(m0Var);
                arrayList.remove(size);
            }
        }
        j(this.k, m0Var);
        if (this.f18884h.remove(m0Var)) {
            view.setAlpha(1.0f);
            c(m0Var);
        }
        if (this.f18885i.remove(m0Var)) {
            view.setAlpha(1.0f);
            c(m0Var);
        }
        ArrayList arrayList2 = this.f18889n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, m0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f18888m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C1471i) arrayList5.get(size4)).f18877a == m0Var) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(m0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f18887l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(m0Var)) {
                view.setAlpha(1.0f);
                c(m0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f18892q.remove(m0Var);
        this.f18890o.remove(m0Var);
        this.f18893r.remove(m0Var);
        this.f18891p.remove(m0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.P
    public final void e() {
        ArrayList arrayList = this.f18886j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1471i c1471i = (C1471i) arrayList.get(size);
            View view = c1471i.f18877a.itemView;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c(c1471i.f18877a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f18884h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((m0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f18885i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            m0 m0Var = (m0) arrayList3.get(size3);
            m0Var.itemView.setAlpha(1.0f);
            c(m0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1470h c1470h = (C1470h) arrayList4.get(size4);
            m0 m0Var2 = c1470h.f18871a;
            if (m0Var2 != null) {
                k(c1470h, m0Var2);
            }
            m0 m0Var3 = c1470h.f18872b;
            if (m0Var3 != null) {
                k(c1470h, m0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f18888m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1471i c1471i2 = (C1471i) arrayList6.get(size6);
                    View view2 = c1471i2.f18877a.itemView;
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(c1471i2.f18877a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f18887l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    m0 m0Var4 = (m0) arrayList8.get(size8);
                    m0Var4.itemView.setAlpha(1.0f);
                    c(m0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f18889n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1470h c1470h2 = (C1470h) arrayList10.get(size10);
                    m0 m0Var5 = c1470h2.f18871a;
                    if (m0Var5 != null) {
                        k(c1470h2, m0Var5);
                    }
                    m0 m0Var6 = c1470h2.f18872b;
                    if (m0Var6 != null) {
                        k(c1470h2, m0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f18892q);
            h(this.f18891p);
            h(this.f18890o);
            h(this.f18893r);
            ArrayList arrayList11 = this.f18780b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.P
    public final boolean f() {
        return (this.f18885i.isEmpty() && this.k.isEmpty() && this.f18886j.isEmpty() && this.f18884h.isEmpty() && this.f18891p.isEmpty() && this.f18892q.isEmpty() && this.f18890o.isEmpty() && this.f18893r.isEmpty() && this.f18888m.isEmpty() && this.f18887l.isEmpty() && this.f18889n.isEmpty()) ? false : true;
    }

    public final boolean g(m0 m0Var, int i5, int i10, int i11, int i12) {
        View view = m0Var.itemView;
        int translationX = i5 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) m0Var.itemView.getTranslationY());
        l(m0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(m0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.f18886j;
        C1471i c1471i = new C1471i();
        c1471i.f18877a = m0Var;
        c1471i.f18878b = translationX;
        c1471i.f18879c = translationY;
        c1471i.f18880d = i11;
        c1471i.f18881e = i12;
        arrayList.add(c1471i);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f18780b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, m0 m0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1470h c1470h = (C1470h) arrayList.get(size);
            if (k(c1470h, m0Var) && c1470h.f18871a == null && c1470h.f18872b == null) {
                arrayList.remove(c1470h);
            }
        }
    }

    public final boolean k(C1470h c1470h, m0 m0Var) {
        if (c1470h.f18872b == m0Var) {
            c1470h.f18872b = null;
        } else {
            if (c1470h.f18871a != m0Var) {
                return false;
            }
            c1470h.f18871a = null;
        }
        m0Var.itemView.setAlpha(1.0f);
        m0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        m0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(m0Var);
        return true;
    }

    public final void l(m0 m0Var) {
        if (f18882s == null) {
            f18882s = new ValueAnimator().getInterpolator();
        }
        m0Var.itemView.animate().setInterpolator(f18882s);
        d(m0Var);
    }
}
