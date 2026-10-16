package android.support.v7.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class eh {

    /* renamed from: l, reason: collision with root package name */
    private static TimeInterpolator f1391l;

    /* renamed from: k, reason: collision with root package name */
    private ei f1402k = null;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f1400i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private long f1401j = 250;

    /* renamed from: a, reason: collision with root package name */
    boolean f1392a = true;
    private ArrayList m = new ArrayList();
    private ArrayList n = new ArrayList();
    private ArrayList o = new ArrayList();
    private ArrayList p = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    ArrayList f1393b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    ArrayList f1394c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    ArrayList f1395d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    ArrayList f1396e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    ArrayList f1397f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    ArrayList f1398g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    ArrayList f1399h = new ArrayList();

    public static final eg e(fe feVar) {
        eg egVar = new eg();
        egVar.a(feVar);
        return egVar;
    }

    static void p(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((fe) list.get(size)).itemView.animate().cancel();
            }
        }
    }

    static void q(fe feVar) {
        int i2 = feVar.mFlags;
        if (!feVar.isInvalid() && (i2 & 4) == 0) {
            feVar.getOldPosition();
            feVar.getAbsoluteAdapterPosition();
        }
    }

    private final void r(List list, fe feVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cd cdVar = (cd) list.get(size);
            if (u(cdVar, feVar) && cdVar.f1216a == null && cdVar.f1217b == null) {
                list.remove(cdVar);
            }
        }
    }

    private final void s(cd cdVar) {
        fe feVar = cdVar.f1216a;
        if (feVar != null) {
            u(cdVar, feVar);
        }
        fe feVar2 = cdVar.f1217b;
        if (feVar2 != null) {
            u(cdVar, feVar2);
        }
    }

    private final void t(fe feVar) {
        if (f1391l == null) {
            f1391l = new ValueAnimator().getInterpolator();
        }
        feVar.itemView.animate().setInterpolator(f1391l);
        i(feVar);
    }

    private final boolean u(cd cdVar, fe feVar) {
        if (cdVar.f1217b == feVar) {
            cdVar.f1217b = null;
        } else {
            if (cdVar.f1216a != feVar) {
                return false;
            }
            cdVar.f1216a = null;
        }
        feVar.itemView.setAlpha(1.0f);
        feVar.itemView.setTranslationX(0.0f);
        feVar.itemView.setTranslationY(0.0f);
        b(feVar);
        return true;
    }

    public final long a() {
        return this.f1401j;
    }

    public final void b(fe feVar) {
        ei eiVar = this.f1402k;
        if (eiVar != null) {
            feVar.setIsRecyclable(true);
            if (feVar.mShadowedHolder != null && feVar.mShadowingHolder == null) {
                feVar.mShadowedHolder = null;
            }
            feVar.mShadowingHolder = null;
            if (feVar.shouldBeKeptAsChild()) {
                return;
            }
            View view = feVar.itemView;
            RecyclerView recyclerView = eiVar.f1403a;
            recyclerView.ap();
            boolean zN = recyclerView.f940g.n(view);
            if (zN) {
                fe feVarP = RecyclerView.p(view);
                et etVar = recyclerView.f937d;
                etVar.o(feVarP);
                etVar.m(feVarP);
            }
            recyclerView.aq(!zN);
            if (zN || !feVar.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(feVar.itemView, false);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f1400i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ef) arrayList.get(i2)).a();
        }
        arrayList.clear();
    }

    final void d(ei eiVar) {
        this.f1402k = eiVar;
    }

    public final void f() {
        this.f1401j = 0L;
    }

    public final boolean g(fe feVar, fe feVar2, eg egVar, eg egVar2) {
        int i2;
        int i3;
        int i4 = egVar.f1389a;
        int i5 = egVar.f1390b;
        if (feVar2.shouldIgnore()) {
            int i6 = egVar.f1389a;
            i3 = egVar.f1390b;
            i2 = i6;
        } else {
            i2 = egVar2.f1389a;
            i3 = egVar2.f1390b;
        }
        if (feVar == feVar2) {
            return l(feVar, i4, i5, i2, i3);
        }
        float translationX = feVar.itemView.getTranslationX();
        float translationY = feVar.itemView.getTranslationY();
        float alpha = feVar.itemView.getAlpha();
        t(feVar);
        float f2 = (i2 - i4) - translationX;
        float f3 = (i3 - i5) - translationY;
        feVar.itemView.setTranslationX(translationX);
        feVar.itemView.setTranslationY(translationY);
        feVar.itemView.setAlpha(alpha);
        if (feVar2 != null) {
            t(feVar2);
            feVar2.itemView.setTranslationX(-((int) f2));
            feVar2.itemView.setTranslationY(-((int) f3));
            feVar2.itemView.setAlpha(0.0f);
        }
        this.p.add(new cd(feVar, feVar2, i4, i5, i2, i3));
        return true;
    }

    final void h() {
        if (m()) {
            return;
        }
        c();
    }

    public final void i(fe feVar) {
        View view = feVar.itemView;
        view.animate().cancel();
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ce) this.o.get(size)).f1222a == feVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                b(feVar);
                this.o.remove(size);
            }
        }
        r(this.p, feVar);
        if (this.m.remove(feVar)) {
            view.setAlpha(1.0f);
            b(feVar);
        }
        if (this.n.remove(feVar)) {
            view.setAlpha(1.0f);
            b(feVar);
        }
        int size2 = this.f1395d.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f1395d.get(size2);
            r(arrayList, feVar);
            if (arrayList.isEmpty()) {
                this.f1395d.remove(size2);
            }
        }
        int size3 = this.f1394c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f1394c.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ce) arrayList2.get(size4)).f1222a == feVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    b(feVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f1394c.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f1393b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f1398g.remove(feVar);
                this.f1396e.remove(feVar);
                this.f1399h.remove(feVar);
                this.f1397f.remove(feVar);
                h();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f1393b.get(size5);
            if (arrayList3.remove(feVar)) {
                view.setAlpha(1.0f);
                b(feVar);
                if (arrayList3.isEmpty()) {
                    this.f1393b.remove(size5);
                }
            }
        }
    }

    public final void j() {
        ArrayList arrayList;
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            fe feVar = ((ce) this.o.get(size)).f1222a;
            View view = feVar.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            b(feVar);
            this.o.remove(size);
        }
        int size2 = this.m.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            b((fe) this.m.get(size2));
            this.m.remove(size2);
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            fe feVar2 = (fe) this.n.get(size3);
            feVar2.itemView.setAlpha(1.0f);
            b(feVar2);
            this.n.remove(size3);
        }
        int size4 = this.p.size();
        while (true) {
            size4--;
            arrayList = this.p;
            if (size4 < 0) {
                break;
            } else {
                s((cd) arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (!m()) {
            return;
        }
        int size5 = this.f1394c.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f1394c.get(size5);
            int size6 = arrayList2.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    fe feVar3 = ((ce) arrayList2.get(size6)).f1222a;
                    View view2 = feVar3.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    b(feVar3);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f1394c.remove(arrayList2);
                    }
                }
            }
        }
        int size7 = this.f1393b.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) this.f1393b.get(size7);
            int size8 = arrayList3.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    fe feVar4 = (fe) arrayList3.get(size8);
                    feVar4.itemView.setAlpha(1.0f);
                    b(feVar4);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.f1393b.remove(arrayList3);
                    }
                }
            }
        }
        int size9 = this.f1395d.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                p(this.f1398g);
                p(this.f1397f);
                p(this.f1396e);
                p(this.f1399h);
                c();
                return;
            }
            ArrayList arrayList4 = (ArrayList) this.f1395d.get(size9);
            int size10 = arrayList4.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    s((cd) arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.f1395d.remove(arrayList4);
                    }
                }
            }
        }
    }

    public final void k() {
        boolean zIsEmpty = this.m.isEmpty();
        boolean z = !zIsEmpty;
        boolean zIsEmpty2 = this.o.isEmpty();
        boolean zIsEmpty3 = this.p.isEmpty();
        boolean z2 = !zIsEmpty3;
        boolean zIsEmpty4 = this.n.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z2 = true;
            }
        }
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            fe feVar = (fe) arrayList.get(i2);
            View view = feVar.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f1398g.add(feVar);
            viewPropertyAnimatorAnimate.setDuration(120L).alpha(0.0f).setListener(new by(this, feVar, viewPropertyAnimatorAnimate, view)).start();
            i2++;
        }
        this.m.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.o);
            this.f1394c.add(arrayList2);
            this.o.clear();
            bx bxVar = new bx(this, arrayList2, 1);
            if (zIsEmpty) {
                bxVar.run();
            } else {
                ViewCompat.postOnAnimationDelayed(((ce) arrayList2.get(0)).f1222a.itemView, bxVar, 120L);
            }
        }
        if (z2) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.p);
            this.f1395d.add(arrayList3);
            this.p.clear();
            bx bxVar2 = new bx(this, arrayList3, 0);
            if (zIsEmpty) {
                bxVar2.run();
            } else {
                ViewCompat.postOnAnimationDelayed(((cd) arrayList3.get(0)).f1216a.itemView, bxVar2, 120L);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.n);
        this.f1393b.add(arrayList4);
        this.n.clear();
        bx bxVar3 = new bx(this, arrayList4, 2);
        if (zIsEmpty && zIsEmpty2) {
            if (!z2) {
                bxVar3.run();
                return;
            }
            z2 = true;
        }
        ViewCompat.postOnAnimationDelayed(((fe) arrayList4.get(0)).itemView, bxVar3, (true != z ? 0L : 120L) + Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? this.f1401j : 0L));
    }

    public final boolean l(fe feVar, int i2, int i3, int i4, int i5) {
        View view = feVar.itemView;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) feVar.itemView.getTranslationY();
        t(feVar);
        int i6 = i2 + translationX;
        int i7 = i4 - i6;
        int i8 = i3 + translationY;
        int i9 = i5 - i8;
        if (i7 == 0) {
            i7 = 0;
            if (i9 == 0) {
                b(feVar);
                return false;
            }
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.o.add(new ce(feVar, i6, i8, i4, i5));
        return true;
    }

    public final boolean m() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.f1397f.isEmpty() && this.f1398g.isEmpty() && this.f1396e.isEmpty() && this.f1399h.isEmpty() && this.f1394c.isEmpty() && this.f1393b.isEmpty() && this.f1395d.isEmpty()) ? false : true;
    }

    public final void n(fe feVar) {
        t(feVar);
        feVar.itemView.setAlpha(0.0f);
        this.n.add(feVar);
    }

    public final void o(fe feVar) {
        t(feVar);
        this.m.add(feVar);
    }
}
