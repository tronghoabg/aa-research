package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class fev extends ck {
    private static boolean A(fgc fgcVar) {
        return (x(fgcVar.e) && x(fgcVar.g) && x(fgcVar.h)) ? false : true;
    }

    @Override // defpackage.ck
    public final Object a(Object obj) {
        if (obj != null) {
            return ((fgc) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ck
    public final Object b(Object obj, Object obj2, Object obj3) {
        fgc fgcVar = (fgc) obj;
        fgc fgcVar2 = (fgc) obj2;
        fgc fgcVar3 = (fgc) obj3;
        if (fgcVar != null && fgcVar2 != null) {
            fgm fgmVar = new fgm();
            fgmVar.U(fgcVar);
            fgmVar.U(fgcVar2);
            fgmVar.W(1);
            fgcVar = fgmVar;
        } else if (fgcVar == null) {
            fgcVar = fgcVar2 != null ? fgcVar2 : null;
        }
        if (fgcVar3 == null) {
            return fgcVar;
        }
        fgm fgmVar2 = new fgm();
        if (fgcVar != null) {
            fgmVar2.U(fgcVar);
        }
        fgmVar2.U(fgcVar3);
        return fgmVar2;
    }

    @Override // defpackage.ck
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        fgm fgmVar = new fgm();
        fgmVar.U((fgc) obj);
        return fgmVar;
    }

    @Override // defpackage.ck
    public final void d(Object obj, View view) {
        ((fgc) obj).J(view);
    }

    @Override // defpackage.ck
    public final void e(Object obj, ArrayList arrayList) {
        fgc fgcVar = (fgc) obj;
        if (fgcVar == null) {
            return;
        }
        int i = 0;
        if (fgcVar instanceof fgm) {
            fgm fgmVar = (fgm) fgcVar;
            int iF = fgmVar.f();
            while (i < iF) {
                e(fgmVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (A(fgcVar) || !x(fgcVar.f)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            fgcVar.J((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ck
    public final void f(ViewGroup viewGroup, Object obj) {
        fgh.b(viewGroup, (fgc) obj);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        fgc fgcVar = (fgc) obj;
        int i = 0;
        if (fgcVar instanceof fgm) {
            fgm fgmVar = (fgm) fgcVar;
            int iF = fgmVar.f();
            while (i < iF) {
                g(fgmVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(fgcVar)) {
            return;
        }
        ArrayList arrayList3 = fgcVar.f;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            fgcVar.J((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                fgcVar.Q((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.ck
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((fgc) obj).H(new fer(view, arrayList));
    }

    @Override // defpackage.ck
    public final void i(Object obj, Rect rect) {
        ((fgc) obj).A(new feu(rect));
    }

    @Override // defpackage.ck
    public final void j(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            y(view, rect);
            ((fgc) obj).A(new feq(rect));
        }
    }

    @Override // defpackage.ck
    public final void k(Object obj, View view, ArrayList arrayList) {
        fgm fgmVar = (fgm) obj;
        ArrayList arrayList2 = fgmVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        e(fgmVar, arrayList);
    }

    @Override // defpackage.ck
    public final void l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        fgm fgmVar = (fgm) obj;
        if (fgmVar != null) {
            fgmVar.f.clear();
            fgmVar.f.addAll(arrayList2);
            g(fgmVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ck
    public final boolean m(Object obj) {
        return obj instanceof fgc;
    }

    @Override // defpackage.ck
    public final boolean n() {
        return true;
    }

    @Override // defpackage.ck
    public final boolean o(Object obj) {
        boolean zD = ((fgc) obj).d();
        if (!zD) {
            Log.v("FragmentManager", a.bm(obj, "Predictive back not available for AndroidX Transition ", ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."));
        }
        return zD;
    }

    @Override // defpackage.ck
    public final Object p(Object obj, Object obj2) {
        fgm fgmVar = new fgm();
        if (obj != null) {
            fgmVar.U((fgc) obj);
        }
        fgmVar.U((fgc) obj2);
        return fgmVar;
    }

    @Override // defpackage.ck
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((fgc) obj).H(new fes(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ck
    public final void r(Object obj, dvw dvwVar, Runnable runnable) {
        z(obj, dvwVar, null, runnable);
    }

    @Override // defpackage.ck
    public final Object s(ViewGroup viewGroup, Object obj) {
        fgc fgcVar = (fgc) obj;
        ArrayList arrayList = fgh.a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!fgcVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        fgc fgcVarClone = fgcVar.clone();
        fgm fgmVar = new fgm();
        fgmVar.U(fgcVarClone);
        fgh.d(viewGroup, fgmVar);
        viewGroup.setTag(R.id.transition_current_scene, null);
        fgh.c(viewGroup, fgmVar);
        viewGroup.invalidate();
        fgmVar.x = new ffy(fgmVar);
        fgmVar.H(fgmVar.x);
        return fgmVar.x;
    }

    @Override // defpackage.ck
    public final void t(Object obj) {
        ((ffy) obj).i();
    }

    @Override // defpackage.ck
    public final void u(Object obj, Runnable runnable) {
        ((ffy) obj).j(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    @Override // defpackage.ck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            ffy r11 = (defpackage.ffy) r11
            boolean r10 = r11.b
            if (r10 == 0) goto L6c
            long r0 = r11.h()
            float r10 = (float) r0
            float r12 = r12 * r10
            long r0 = (long) r12
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r10 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r10 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            emp r10 = r11.e
            if (r10 != 0) goto L64
            long r8 = r11.a
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L6c
            boolean r10 = r11.c
            if (r10 != 0) goto L59
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L3c
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L4c
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L58
            fgc r10 = r11.g
            r10.z(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            zit r10 = r11.h
            long r11 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r0 = (float) r0
            r10.b(r11, r0)
            return
        L64:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "setCurrentPlayTimeMillis() called after animation has been started"
            r10.<init>(r11)
            throw r10
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fev.w(java.lang.Object, float):void");
    }

    @Override // defpackage.ck
    public final void z(Object obj, dvw dvwVar, Runnable runnable, Runnable runnable2) {
        fgc fgcVar = (fgc) obj;
        whk whkVar = new whk(runnable, fgcVar, runnable2);
        synchronized (dvwVar) {
            while (dvwVar.b) {
                try {
                    dvwVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (dvwVar.c != whkVar) {
                dvwVar.c = whkVar;
                if (dvwVar.a) {
                    whkVar.b();
                }
            }
        }
        fgcVar.H(new fet(runnable2));
    }
}
