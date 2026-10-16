package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mu extends lw {
    private static TimeInterpolator i;
    private final ArrayList j = new ArrayList();
    private final ArrayList k = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void t(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((mo) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void v(List list, mo moVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            kl klVar = (kl) list.get(size);
            if (y(klVar, moVar) && klVar.a == null && klVar.b == null) {
                list.remove(klVar);
            }
        }
    }

    private final void w(kl klVar) {
        mo moVar = klVar.a;
        if (moVar != null) {
            y(klVar, moVar);
        }
        mo moVar2 = klVar.b;
        if (moVar2 != null) {
            y(klVar, moVar2);
        }
    }

    private final void x(mo moVar) {
        if (i == null) {
            i = new ValueAnimator().getInterpolator();
        }
        moVar.a.animate().setInterpolator(i);
        c(moVar);
    }

    private final boolean y(kl klVar, mo moVar) {
        if (klVar.b == moVar) {
            klVar.b = null;
        } else {
            if (klVar.a != moVar) {
                return false;
            }
            klVar.a = null;
        }
        View view = moVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        a(moVar);
        return true;
    }

    @Override // defpackage.lw
    public final void c(mo moVar) {
        View view = moVar.a;
        view.animate().cancel();
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((aig) this.l.get(size)).e == moVar) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                p(moVar);
                this.l.remove(size);
            }
        }
        v(this.m, moVar);
        if (this.j.remove(moVar)) {
            view.setAlpha(1.0f);
            a(moVar);
        }
        if (this.k.remove(moVar)) {
            view.setAlpha(1.0f);
            a(moVar);
        }
        int size2 = this.d.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.d.get(size2);
            v(arrayList, moVar);
            if (arrayList.isEmpty()) {
                this.d.remove(size2);
            }
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.c.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((aig) arrayList2.get(size4)).e == moVar) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    p(moVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.c.remove(size3);
                    }
                }
            }
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.g.remove(moVar);
                this.e.remove(moVar);
                this.h.remove(moVar);
                this.f.remove(moVar);
                q();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.b.get(size5);
            if (arrayList3.remove(moVar)) {
                view.setAlpha(1.0f);
                a(moVar);
                if (arrayList3.isEmpty()) {
                    this.b.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.lw
    public final void d() {
        ArrayList arrayList;
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mo moVar = (mo) ((aig) this.l.get(size)).e;
            View view = moVar.a;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            p(moVar);
            this.l.remove(size);
        }
        int size2 = this.j.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((mo) this.j.get(size2));
            this.j.remove(size2);
        }
        int size3 = this.k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            mo moVar2 = (mo) this.k.get(size3);
            moVar2.a.setAlpha(1.0f);
            a(moVar2);
            this.k.remove(size3);
        }
        int size4 = this.m.size();
        while (true) {
            size4--;
            arrayList = this.m;
            if (size4 < 0) {
                break;
            } else {
                w((kl) arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (!h()) {
            return;
        }
        int size5 = this.c.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.c.get(size5);
            int size6 = arrayList2.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    mo moVar3 = (mo) ((aig) arrayList2.get(size6)).e;
                    View view2 = moVar3.a;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    p(moVar3);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.c.remove(arrayList2);
                    }
                }
            }
        }
        int size7 = this.b.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) this.b.get(size7);
            int size8 = arrayList3.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    mo moVar4 = (mo) arrayList3.get(size8);
                    moVar4.a.setAlpha(1.0f);
                    a(moVar4);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.b.remove(arrayList3);
                    }
                }
            }
        }
        int size9 = this.d.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                t(this.g);
                t(this.f);
                t(this.e);
                t(this.h);
                b();
                return;
            }
            ArrayList arrayList4 = (ArrayList) this.d.get(size9);
            int size10 = arrayList4.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((kl) arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.d.remove(arrayList4);
                    }
                }
            }
        }
    }

    @Override // defpackage.lw
    public final void e() {
        boolean zIsEmpty = this.j.isEmpty();
        boolean z = !zIsEmpty;
        boolean zIsEmpty2 = this.l.isEmpty();
        boolean zIsEmpty3 = this.m.isEmpty();
        boolean z2 = !zIsEmpty3;
        boolean zIsEmpty4 = this.k.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z2 = true;
            }
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            mo moVar = (mo) arrayList.get(i2);
            View view = moVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.g.add(moVar);
            viewPropertyAnimatorAnimate.setDuration(120L).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new kg(this, moVar, viewPropertyAnimatorAnimate, view)).start();
            i2++;
        }
        this.j.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.l);
            this.c.add(arrayList2);
            this.l.clear();
            af afVar = new af(this, arrayList2, 8, (char[]) null);
            if (zIsEmpty) {
                afVar.run();
            } else {
                View view2 = ((mo) ((aig) arrayList2.get(0)).e).a;
                int[] iArr = ebm.a;
                view2.postOnAnimationDelayed(afVar, 120L);
            }
        }
        if (z2) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.m);
            this.d.add(arrayList3);
            this.m.clear();
            af afVar2 = new af(this, arrayList3, 9, (char[]) null);
            if (zIsEmpty) {
                afVar2.run();
            } else {
                View view3 = ((kl) arrayList3.get(0)).a.a;
                int[] iArr2 = ebm.a;
                view3.postOnAnimationDelayed(afVar2, 120L);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.k);
        this.b.add(arrayList4);
        this.k.clear();
        af afVar3 = new af(this, arrayList4, 10, (char[]) null);
        if (zIsEmpty && zIsEmpty2 && !z2) {
            afVar3.run();
            return;
        }
        long jMax = (true != z ? 0L : 120L) + Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? 250L : 0L);
        View view4 = ((mo) arrayList4.get(0)).a;
        int[] iArr3 = ebm.a;
        view4.postOnAnimationDelayed(afVar3, jMax);
    }

    @Override // defpackage.lw
    public final boolean f(mo moVar) {
        return moVar.t();
    }

    @Override // defpackage.lw
    public final boolean g(mo moVar, List list) {
        return !list.isEmpty() || f(moVar);
    }

    @Override // defpackage.lw
    public final boolean h() {
        return (this.k.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.j.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.c.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    @Override // defpackage.lw
    public final boolean j(mo moVar, etz etzVar, etz etzVar2) {
        int i2;
        int i3;
        if (etzVar != null && ((i2 = etzVar.a) != (i3 = etzVar2.a) || etzVar.b != etzVar2.b)) {
            return s(moVar, i2, etzVar.b, i3, etzVar2.b);
        }
        x(moVar);
        moVar.a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.k.add(moVar);
        return true;
    }

    @Override // defpackage.lw
    public final boolean k(mo moVar, mo moVar2, etz etzVar, etz etzVar2) {
        int i2;
        int i3;
        int i4 = etzVar.a;
        int i5 = etzVar.b;
        if (moVar2.A()) {
            int i6 = etzVar.a;
            i3 = etzVar.b;
            i2 = i6;
        } else {
            i2 = etzVar2.a;
            i3 = etzVar2.b;
        }
        return r(moVar, moVar2, i4, i5, i2, i3);
    }

    @Override // defpackage.lw
    public final boolean l(mo moVar, etz etzVar, etz etzVar2) {
        int i2 = etzVar.a;
        int i3 = etzVar.b;
        View view = moVar.a;
        int left = etzVar2 == null ? view.getLeft() : etzVar2.a;
        int top = etzVar2 == null ? view.getTop() : etzVar2.b;
        if (!moVar.v() && (i2 != left || i3 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return s(moVar, i2, i3, left, top);
        }
        x(moVar);
        this.j.add(moVar);
        return true;
    }

    @Override // defpackage.lw
    public final boolean m(mo moVar, etz etzVar, etz etzVar2) {
        int i2 = etzVar.a;
        int i3 = etzVar2.a;
        if (i2 != i3 || etzVar.b != etzVar2.b) {
            return s(moVar, i2, etzVar.b, i3, etzVar2.b);
        }
        p(moVar);
        return false;
    }

    public final void p(mo moVar) {
        u();
        a(moVar);
    }

    public final void q() {
        if (h()) {
            return;
        }
        b();
    }

    public boolean r(mo moVar, mo moVar2, int i2, int i3, int i4, int i5) {
        if (moVar == moVar2) {
            return s(moVar, i2, i3, i4, i5);
        }
        View view = moVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        x(moVar);
        float f = (i4 - i2) - translationX;
        float f2 = (i5 - i3) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (moVar2 != null) {
            x(moVar2);
            View view2 = moVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.m.add(new kl(moVar, moVar2, i2, i3, i4, i5));
        return true;
    }

    public final boolean s(mo moVar, int i2, int i3, int i4, int i5) {
        View view = moVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(moVar);
        int i6 = i2 + translationX;
        int i7 = i4 - i6;
        int i8 = i3 + translationY;
        int i9 = i5 - i8;
        if (i7 == 0) {
            i7 = 0;
            if (i9 == 0) {
                p(moVar);
                return false;
            }
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.l.add(new aig(moVar, i6, i8, i4, i5));
        return true;
    }

    public void u() {
    }
}
