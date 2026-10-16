package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class af implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [eqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [dzn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        android.view.View view = null;
        int i = 0;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ck.y((android.view.View) this.a, (android.graphics.Rect) this.b);
                return;
            case 1:
                ((defpackage.cq) this.a).c((defpackage.cp) this.b);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.a.a((defpackage.cp) this.a, (ai) this.b);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.a.a((defpackage.cp) this.a, (ai) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.Iterator it = ((ai) this.b).a.iterator();
                while (it.hasNext()) {
                    defpackage.cp cpVar = ((ad) ((aj) it.next())).a;
                    android.view.View view2 = cpVar.a.getView();
                    if (view2 != null) {
                        defpackage.ca.h(cpVar.h, view2, (android.view.ViewGroup) this.a);
                    }
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((android.support.v4.app.Fragment) this.a).m16x22bc4f96((android.os.Bundle) this.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r1 = this.a;
                java.lang.Object obj = this.b;
                try {
                    r1.run();
                    return;
                } finally {
                    ((defpackage.eq) obj).a();
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                isx isxVar = (isx) this.b;
                fz fzVar = (fz) isxVar.b;
                if (fzVar.f == isxVar.a) {
                    java.lang.Object obj2 = this.a;
                    ?? r2 = isxVar.d;
                    fzVar.d = r2;
                    fzVar.e = j$.util.DesugarCollections.unmodifiableList((java.util.List) r2);
                    ((gf) obj2).a(fzVar.a);
                    fzVar.a();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r3 = this.a;
                int size = r3.size();
                while (i < size) {
                    ail ailVar = (ail) r3.get(i);
                    java.lang.Object obj3 = this.b;
                    java.lang.Object obj4 = ailVar.e;
                    int i2 = ailVar.b;
                    int i3 = ailVar.c;
                    int i4 = ailVar.d;
                    int i5 = ailVar.a;
                    defpackage.mr mrVar = (defpackage.mr) obj4;
                    android.view.View view3 = mrVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    defpackage.mx mxVar = (defpackage.mx) obj3;
                    mxVar.f.add(obj4);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new kj(mxVar, mrVar, i6, view3, i7, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((java.util.ArrayList) r3).clear();
                ((defpackage.mx) this.b).c.remove((java.lang.Object) r3);
                return;
            case 9:
                ?? r4 = this.a;
                int size2 = r4.size();
                while (i < size2) {
                    km kmVar = (km) r4.get(i);
                    java.lang.Object obj5 = this.b;
                    defpackage.mr mrVar2 = kmVar.a;
                    android.view.View view4 = mrVar2 == null ? view : mrVar2.a;
                    defpackage.mr mrVar3 = kmVar.b;
                    android.view.View view5 = mrVar3 != null ? mrVar3.a : view;
                    if (view4 != null) {
                        android.view.ViewPropertyAnimator duration = view4.animate().setDuration(250L);
                        defpackage.mx mxVar2 = (defpackage.mx) obj5;
                        mxVar2.h.add(kmVar.a);
                        duration.translationX(kmVar.e - kmVar.c);
                        duration.translationY(kmVar.f - kmVar.d);
                        duration.alpha(0.0f).setListener(new kk(mxVar2, kmVar, duration, view4)).start();
                    }
                    if (view5 != null) {
                        defpackage.mx mxVar3 = (defpackage.mx) obj5;
                        java.util.ArrayList arrayList = mxVar3.h;
                        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view5.animate();
                        arrayList.add(kmVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new kl(mxVar3, kmVar, viewPropertyAnimatorAnimate2, view5)).start();
                    }
                    i++;
                    view = null;
                }
                ((java.util.ArrayList) r4).clear();
                ((defpackage.mx) this.b).d.remove((java.lang.Object) r4);
                return;
            case 10:
                ?? r5 = this.a;
                int size3 = r5.size();
                while (i < size3) {
                    defpackage.mr mrVar4 = (defpackage.mr) r5.get(i);
                    java.lang.Object obj6 = this.b;
                    android.view.View view6 = mrVar4.a;
                    android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view6.animate();
                    defpackage.mx mxVar4 = (defpackage.mx) obj6;
                    mxVar4.e.add(mrVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(120L).setListener(new ki(mxVar4, mrVar4, view6, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((java.util.ArrayList) r5).clear();
                ((defpackage.mx) this.b).b.remove((java.lang.Object) r5);
                return;
            case 11:
                nx nxVar = (nx) this.a;
                android.support.v7.widget.RecyclerView recyclerView = nxVar.o;
                if (recyclerView == null || !recyclerView.q) {
                    return;
                }
                nw nwVar = (nw) this.b;
                if (nwVar.n || nwVar.h.a() == -1) {
                    return;
                }
                defpackage.lz lzVar = nxVar.o.E;
                if (lzVar == null || !lzVar.o(null)) {
                    java.util.List list = nxVar.n;
                    int size4 = list.size();
                    while (i < size4) {
                        if (((nw) list.get(i)).o) {
                            i++;
                        }
                    }
                    return;
                }
                nxVar.o.post(this);
                return;
            case 12:
                ((defpackage.od) this.b).z((defpackage.bil) this.a);
                return;
            case 13:
                java.lang.Object obj7 = this.a;
                java.util.Map map = ((ql) this.b).a;
                synchronized (map) {
                    androidx.car.app.CarAppBinder carAppBinder = (androidx.car.app.CarAppBinder) map.get(obj7);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                    break;
                }
                return;
            case 14:
                defpackage.eqi eqiVar = ((rb) this.b).b;
                if (eqiVar.e.a(defpackage.epx.b)) {
                    java.lang.Object obj8 = this.a;
                    defpackage.epv epvVar = defpackage.epw.Companion;
                    eqiVar.e((defpackage.epw) obj8);
                    return;
                }
                return;
            case 15:
                androidx.car.app.hardware.common.CarResultStub.lambda$notifyResults$1((java.util.Map.Entry) this.a, this.b);
                return;
            case 16:
                defpackage.xi.c((defpackage.cgx) this.a, (android.util.LongSparseArray) this.b);
                return;
            case 17:
                ?? r6 = this.b;
                defpackage.dcx dcxVar = (defpackage.dcx) r6;
                if (dcxVar.c) {
                    return;
                }
                defpackage.epy epyVar = (defpackage.epy) this.a;
                dcxVar.d = epyVar;
                epyVar.c(r6);
                return;
            case 18:
                ((defpackage.ebl) this.a).b((android.graphics.Typeface) this.b);
                return;
            case 19:
                this.b.a(this.a);
                return;
            default:
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                int i8 = defpackage.enp.a;
                java.lang.Throwable th = (java.lang.Throwable) obj9;
                android.util.Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(java.lang.String.valueOf(obj10)), th);
                throw th;
        }
    }

    public /* synthetic */ af(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public af(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public af(java.lang.Object obj, java.lang.Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
