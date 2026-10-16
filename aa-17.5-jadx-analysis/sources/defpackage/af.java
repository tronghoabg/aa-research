package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.car.app.CarAppBinder;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ af(Object obj, Object obj2, int i) {
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
    /* JADX WARN: Type inference failed for: r1v36, types: [epz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [dzg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        View view = null;
        int i = 0;
        switch (this.c) {
            case 0:
                ck.y((View) this.a, (Rect) this.b);
                return;
            case 1:
                ((cq) this.a).c((cp) this.b);
                return;
            case 2:
                a.a((cp) this.a, (ai) this.b);
                return;
            case 3:
                a.a((cp) this.a, (ai) this.b);
                return;
            case 4:
                Iterator it = ((ai) this.b).a.iterator();
                while (it.hasNext()) {
                    cp cpVar = ((aj) it.next()).a;
                    View view2 = cpVar.a.getView();
                    if (view2 != null) {
                        ca.h(cpVar.h, view2, (ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                ((Fragment) this.a).m117x22bc4f96((Bundle) this.b);
                return;
            case 6:
                ?? r1 = this.a;
                Object obj = this.b;
                try {
                    r1.run();
                    return;
                } finally {
                    ((eq) obj).a();
                }
            case 7:
                isp ispVar = (isp) this.b;
                fy fyVar = (fy) ispVar.b;
                if (fyVar.f == ispVar.a) {
                    Object obj2 = this.a;
                    ?? r12 = ispVar.d;
                    fyVar.d = r12;
                    fyVar.e = DesugarCollections.unmodifiableList(r12);
                    ((ge) obj2).a(fyVar.a);
                    fyVar.a();
                    return;
                }
                return;
            case 8:
                ?? r13 = this.a;
                int size = r13.size();
                while (i < size) {
                    aig aigVar = (aig) r13.get(i);
                    Object obj3 = this.b;
                    Object obj4 = aigVar.e;
                    int i2 = aigVar.b;
                    int i3 = aigVar.c;
                    int i4 = aigVar.d;
                    int i5 = aigVar.a;
                    mo moVar = (mo) obj4;
                    View view3 = moVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view3.animate().translationX(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i7 != 0) {
                        view3.animate().translationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    mu muVar = (mu) obj3;
                    muVar.f.add(obj4);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new ki(muVar, moVar, i6, view3, i7, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) r13).clear();
                ((mu) this.b).c.remove((Object) r13);
                return;
            case 9:
                ?? r14 = this.a;
                int size2 = r14.size();
                while (i < size2) {
                    kl klVar = (kl) r14.get(i);
                    Object obj5 = this.b;
                    mo moVar2 = klVar.a;
                    View view4 = moVar2 == null ? view : moVar2.a;
                    mo moVar3 = klVar.b;
                    View view5 = moVar3 != null ? moVar3.a : view;
                    if (view4 != null) {
                        ViewPropertyAnimator duration = view4.animate().setDuration(250L);
                        mu muVar2 = (mu) obj5;
                        muVar2.h.add(klVar.a);
                        duration.translationX(klVar.e - klVar.c);
                        duration.translationY(klVar.f - klVar.d);
                        duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new kj(muVar2, klVar, duration, view4)).start();
                    }
                    if (view5 != null) {
                        mu muVar3 = (mu) obj5;
                        ArrayList arrayList = muVar3.h;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view5.animate();
                        arrayList.add(klVar.b);
                        viewPropertyAnimatorAnimate2.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(250L).alpha(1.0f).setListener(new kk(muVar3, klVar, viewPropertyAnimatorAnimate2, view5)).start();
                    }
                    i++;
                    view = null;
                }
                ((ArrayList) r14).clear();
                ((mu) this.b).d.remove((Object) r14);
                return;
            case 10:
                ?? r15 = this.a;
                int size3 = r15.size();
                while (i < size3) {
                    mo moVar4 = (mo) r15.get(i);
                    Object obj6 = this.b;
                    View view6 = moVar4.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view6.animate();
                    mu muVar4 = (mu) obj6;
                    muVar4.e.add(moVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(120L).setListener(new kh(muVar4, moVar4, view6, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) r15).clear();
                ((mu) this.b).b.remove((Object) r15);
                return;
            case 11:
                nv nvVar = (nv) this.a;
                RecyclerView recyclerView = nvVar.o;
                if (recyclerView == null || !recyclerView.q) {
                    return;
                }
                nu nuVar = (nu) this.b;
                if (nuVar.n || nuVar.h.a() == -1) {
                    return;
                }
                lw lwVar = nvVar.o.E;
                if (lwVar == null || !lwVar.o(null)) {
                    List list = nvVar.n;
                    int size4 = list.size();
                    while (i < size4) {
                        if (((nu) list.get(i)).o) {
                            i++;
                        }
                    }
                    return;
                }
                nvVar.o.post(this);
                return;
            case 12:
                ((ob) this.b).z((bii) this.a);
                return;
            case 13:
                Object obj7 = this.a;
                Map map = ((qg) this.b).a;
                synchronized (map) {
                    CarAppBinder carAppBinder = (CarAppBinder) map.get(obj7);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                }
                return;
            case 14:
                eqc eqcVar = ((qw) this.b).b;
                if (eqcVar.e.a(eps.b)) {
                    Object obj8 = this.a;
                    epq epqVar = epr.Companion;
                    eqcVar.e((epr) obj8);
                    return;
                }
                return;
            case 15:
                Object obj9 = this.b;
                ((ru) this.a.getKey()).a();
                return;
            case 16:
                xb.e((cgq) this.a, (LongSparseArray) this.b);
                return;
            case 17:
                ?? r16 = this.b;
                dcp dcpVar = (dcp) r16;
                if (dcpVar.c) {
                    return;
                }
                ept eptVar = (ept) this.a;
                dcpVar.d = eptVar;
                eptVar.c(r16);
                return;
            case 18:
                ((dsg) this.a).b((Typeface) this.b);
                return;
            case 19:
                this.b.a(this.a);
                return;
            default:
                Object obj10 = this.b;
                Object obj11 = this.a;
                int i8 = enj.a;
                Throwable th = (Throwable) obj10;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj11)), th);
                throw th;
        }
    }

    public /* synthetic */ af(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public af(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public af(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
