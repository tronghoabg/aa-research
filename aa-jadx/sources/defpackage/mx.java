package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class mx extends defpackage.lz {
    private static android.animation.TimeInterpolator i;
    private final java.util.ArrayList j = new java.util.ArrayList();
    private final java.util.ArrayList k = new java.util.ArrayList();
    private final java.util.ArrayList l = new java.util.ArrayList();
    private final java.util.ArrayList m = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final java.util.ArrayList e = new java.util.ArrayList();
    public final java.util.ArrayList f = new java.util.ArrayList();
    final java.util.ArrayList g = new java.util.ArrayList();
    public final java.util.ArrayList h = new java.util.ArrayList();

    public static void t(java.util.List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.mr) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void v(java.util.List list, defpackage.mr mrVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.km kmVar = (defpackage.km) list.get(size);
            if (y(kmVar, mrVar) && kmVar.a == null && kmVar.b == null) {
                list.remove(kmVar);
            }
        }
    }

    private final void w(defpackage.km kmVar) {
        defpackage.mr mrVar = kmVar.a;
        if (mrVar != null) {
            y(kmVar, mrVar);
        }
        defpackage.mr mrVar2 = kmVar.b;
        if (mrVar2 != null) {
            y(kmVar, mrVar2);
        }
    }

    private final void x(defpackage.mr mrVar) {
        if (i == null) {
            i = new android.animation.ValueAnimator().getInterpolator();
        }
        mrVar.a.animate().setInterpolator(i);
        c(mrVar);
    }

    private final boolean y(defpackage.km kmVar, defpackage.mr mrVar) {
        if (kmVar.b == mrVar) {
            kmVar.b = null;
        } else {
            if (kmVar.a != mrVar) {
                return false;
            }
            kmVar.a = null;
        }
        android.view.View view = mrVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        a(mrVar);
        return true;
    }

    @Override // defpackage.lz
    public final void c(defpackage.mr mrVar) {
        android.view.View view = mrVar.a;
        view.animate().cancel();
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((defpackage.ail) this.l.get(size)).e == mrVar) {
                view.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                p(mrVar);
                this.l.remove(size);
            }
        }
        v(this.m, mrVar);
        if (this.j.remove(mrVar)) {
            view.setAlpha(1.0f);
            a(mrVar);
        }
        if (this.k.remove(mrVar)) {
            view.setAlpha(1.0f);
            a(mrVar);
        }
        int size2 = this.d.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) this.d.get(size2);
            v(arrayList, mrVar);
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
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.c.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((defpackage.ail) arrayList2.get(size4)).e == mrVar) {
                    view.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                    p(mrVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.c.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.g.remove(mrVar);
                this.e.remove(mrVar);
                this.h.remove(mrVar);
                this.f.remove(mrVar);
                q();
                return;
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.b.get(size5);
            if (arrayList3.remove(mrVar)) {
                view.setAlpha(1.0f);
                a(mrVar);
                if (arrayList3.isEmpty()) {
                    this.b.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.lz
    public final void d() {
        java.util.ArrayList arrayList;
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.mr mrVar = (defpackage.mr) ((defpackage.ail) this.l.get(size)).e;
            android.view.View view = mrVar.a;
            view.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            p(mrVar);
            this.l.remove(size);
        }
        int size2 = this.j.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a((defpackage.mr) this.j.get(size2));
            this.j.remove(size2);
        }
        int size3 = this.k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            defpackage.mr mrVar2 = (defpackage.mr) this.k.get(size3);
            mrVar2.a.setAlpha(1.0f);
            a(mrVar2);
            this.k.remove(size3);
        }
        int size4 = this.m.size();
        while (true) {
            size4--;
            arrayList = this.m;
            if (size4 < 0) {
                break;
            } else {
                w((defpackage.km) arrayList.get(size4));
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
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.c.get(size5);
            int size6 = arrayList2.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    defpackage.mr mrVar3 = (defpackage.mr) ((defpackage.ail) arrayList2.get(size6)).e;
                    android.view.View view2 = mrVar3.a;
                    view2.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                    p(mrVar3);
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
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.b.get(size7);
            int size8 = arrayList3.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    defpackage.mr mrVar4 = (defpackage.mr) arrayList3.get(size8);
                    mrVar4.a.setAlpha(1.0f);
                    a(mrVar4);
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
            java.util.ArrayList arrayList4 = (java.util.ArrayList) this.d.get(size9);
            int size10 = arrayList4.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((defpackage.km) arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.d.remove(arrayList4);
                    }
                }
            }
        }
    }

    @Override // defpackage.lz
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
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            defpackage.mr mrVar = (defpackage.mr) arrayList.get(i2);
            android.view.View view = mrVar.a;
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.g.add(mrVar);
            viewPropertyAnimatorAnimate.setDuration(120L).alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setListener(new defpackage.kh(this, mrVar, viewPropertyAnimatorAnimate, view)).start();
            i2++;
        }
        this.j.clear();
        if (!zIsEmpty2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(this.l);
            this.c.add(arrayList2);
            this.l.clear();
            defpackage.af afVar = new defpackage.af(this, arrayList2, 8, (char[]) null);
            if (zIsEmpty) {
                afVar.run();
            } else {
                android.view.View view2 = ((defpackage.mr) ((defpackage.ail) arrayList2.get(0)).e).a;
                int[] iArr = defpackage.ebt.a;
                view2.postOnAnimationDelayed(afVar, 120L);
            }
        }
        if (z2) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.addAll(this.m);
            this.d.add(arrayList3);
            this.m.clear();
            defpackage.af afVar2 = new defpackage.af(this, arrayList3, 9, (char[]) null);
            if (zIsEmpty) {
                afVar2.run();
            } else {
                android.view.View view3 = ((defpackage.km) arrayList3.get(0)).a.a;
                int[] iArr2 = defpackage.ebt.a;
                view3.postOnAnimationDelayed(afVar2, 120L);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(this.k);
        this.b.add(arrayList4);
        this.k.clear();
        defpackage.af afVar3 = new defpackage.af(this, arrayList4, 10, (char[]) null);
        if (zIsEmpty && zIsEmpty2 && !z2) {
            afVar3.run();
            return;
        }
        long jMax = (true != z ? 0L : 120L) + java.lang.Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? 250L : 0L);
        android.view.View view4 = ((defpackage.mr) arrayList4.get(0)).a;
        int[] iArr3 = defpackage.ebt.a;
        view4.postOnAnimationDelayed(afVar3, jMax);
    }

    @Override // defpackage.lz
    public final boolean f(defpackage.mr mrVar) {
        return mrVar.t();
    }

    @Override // defpackage.lz
    public final boolean g(defpackage.mr mrVar, java.util.List list) {
        return !list.isEmpty() || f(mrVar);
    }

    @Override // defpackage.lz
    public final boolean h() {
        return (this.k.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.j.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.c.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    @Override // defpackage.lz
    public final boolean j(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2) {
        int i2;
        int i3;
        if (eufVar != null && ((i2 = eufVar.a) != (i3 = eufVar2.a) || eufVar.b != eufVar2.b)) {
            return s(mrVar, i2, eufVar.b, i3, eufVar2.b);
        }
        x(mrVar);
        mrVar.a.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.k.add(mrVar);
        return true;
    }

    @Override // defpackage.lz
    public final boolean k(defpackage.mr mrVar, defpackage.mr mrVar2, defpackage.euf eufVar, defpackage.euf eufVar2) {
        int i2;
        int i3;
        int i4 = eufVar.a;
        int i5 = eufVar.b;
        if (mrVar2.A()) {
            int i6 = eufVar.a;
            i3 = eufVar.b;
            i2 = i6;
        } else {
            i2 = eufVar2.a;
            i3 = eufVar2.b;
        }
        return r(mrVar, mrVar2, i4, i5, i2, i3);
    }

    @Override // defpackage.lz
    public final boolean l(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2) {
        int i2 = eufVar.a;
        int i3 = eufVar.b;
        android.view.View view = mrVar.a;
        int left = eufVar2 == null ? view.getLeft() : eufVar2.a;
        int top = eufVar2 == null ? view.getTop() : eufVar2.b;
        if (!mrVar.v() && (i2 != left || i3 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return s(mrVar, i2, i3, left, top);
        }
        x(mrVar);
        this.j.add(mrVar);
        return true;
    }

    @Override // defpackage.lz
    public final boolean m(defpackage.mr mrVar, defpackage.euf eufVar, defpackage.euf eufVar2) {
        int i2 = eufVar.a;
        int i3 = eufVar2.a;
        if (i2 != i3 || eufVar.b != eufVar2.b) {
            return s(mrVar, i2, eufVar.b, i3, eufVar2.b);
        }
        p(mrVar);
        return false;
    }

    public final void p(defpackage.mr mrVar) {
        u();
        a(mrVar);
    }

    public final void q() {
        if (h()) {
            return;
        }
        b();
    }

    public boolean r(defpackage.mr mrVar, defpackage.mr mrVar2, int i2, int i3, int i4, int i5) {
        if (mrVar == mrVar2) {
            return s(mrVar, i2, i3, i4, i5);
        }
        android.view.View view = mrVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        x(mrVar);
        float f = (i4 - i2) - translationX;
        float f2 = (i5 - i3) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (mrVar2 != null) {
            x(mrVar2);
            android.view.View view2 = mrVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        this.m.add(new defpackage.km(mrVar, mrVar2, i2, i3, i4, i5));
        return true;
    }

    public final boolean s(defpackage.mr mrVar, int i2, int i3, int i4, int i5) {
        android.view.View view = mrVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(mrVar);
        int i6 = i2 + translationX;
        int i7 = i4 - i6;
        int i8 = i3 + translationY;
        int i9 = i5 - i8;
        if (i7 == 0) {
            i7 = 0;
            if (i9 == 0) {
                p(mrVar);
                return false;
            }
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.l.add(new defpackage.ail(mrVar, i6, i8, i4, i5));
        return true;
    }

    public void u() {
    }
}
