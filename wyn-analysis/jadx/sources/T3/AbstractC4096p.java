package t3;

import A7.AbstractC0279p0;
import Va.M6;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import x.AbstractC4416i;
import x.C4412e;
import x.C4415h;
import y.AbstractC4517a;

/* renamed from: t3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4096p implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f45695u = {2, 1, 3, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final ae.b f45696v = new ae.b();

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f45697w = new ThreadLocal();
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f45708l;

    /* renamed from: s, reason: collision with root package name */
    public android.support.v4.media.session.b f45715s;

    /* renamed from: a, reason: collision with root package name */
    public final String f45698a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f45699b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f45700c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f45701d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f45702e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f45703f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public W9.u f45704g = new W9.u(7);

    /* renamed from: h, reason: collision with root package name */
    public W9.u f45705h = new W9.u(7);

    /* renamed from: i, reason: collision with root package name */
    public C4101u f45706i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f45707j = f45695u;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f45709m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f45710n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45711o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45712p = false;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f45713q = null;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f45714r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public ae.b f45716t = f45696v;

    public static void c(W9.u uVar, View view, C4103w c4103w) {
        ((C4412e) uVar.f15389a).put(view, c4103w);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f15390b;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = S.f38779a;
        String strF = J.f(view);
        if (strF != null) {
            C4412e c4412e = (C4412e) uVar.f15392d;
            if (c4412e.containsKey(strF)) {
                c4412e.put(strF, null);
            } else {
                c4412e.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C4415h c4415h = (C4415h) uVar.f15391c;
                if (c4415h.f47508a) {
                    int i5 = c4415h.f47511d;
                    long[] jArr = c4415h.f47509b;
                    Object[] objArr = c4415h.f47510c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i5; i11++) {
                        Object obj = objArr[i11];
                        if (obj != AbstractC4416i.f47512a) {
                            if (i11 != i10) {
                                jArr[i10] = jArr[i11];
                                objArr[i10] = obj;
                                objArr[i11] = null;
                            }
                            i10++;
                        }
                    }
                    c4415h.f47508a = false;
                    c4415h.f47511d = i10;
                }
                if (AbstractC4517a.b(c4415h.f47509b, c4415h.f47511d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c4415h.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c4415h.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c4415h.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C4412e p() {
        ThreadLocal threadLocal = f45697w;
        C4412e c4412e = (C4412e) threadLocal.get();
        if (c4412e != null) {
            return c4412e;
        }
        C4412e c4412e2 = new C4412e(0);
        threadLocal.set(c4412e2);
        return c4412e2;
    }

    public static boolean u(C4103w c4103w, C4103w c4103w2, String str) {
        Object obj = c4103w.f45732a.get(str);
        Object obj2 = c4103w2.f45732a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j8) {
        this.f45700c = j8;
    }

    public void C(android.support.v4.media.session.b bVar) {
        this.f45715s = bVar;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.f45701d = timeInterpolator;
    }

    public void E(ae.b bVar) {
        if (bVar == null) {
            this.f45716t = f45696v;
        } else {
            this.f45716t = bVar;
        }
    }

    public void G(long j8) {
        this.f45699b = j8;
    }

    public final void H() {
        if (this.f45710n == 0) {
            ArrayList arrayList = this.f45713q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f45713q.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((InterfaceC4095o) arrayList2.get(i5)).e(this);
                }
            }
            this.f45712p = false;
        }
        this.f45710n++;
    }

    public String I(String str) {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(getClass().getSimpleName());
        sbJ.append("@");
        sbJ.append(Integer.toHexString(hashCode()));
        sbJ.append(": ");
        String string = sbJ.toString();
        if (this.f45700c != -1) {
            string = M6.s(AbstractC0279p0.q(string, "dur("), this.f45700c, ") ");
        }
        if (this.f45699b != -1) {
            string = M6.s(AbstractC0279p0.q(string, "dly("), this.f45699b, ") ");
        }
        if (this.f45701d != null) {
            StringBuilder sbQ = AbstractC0279p0.q(string, "interp(");
            sbQ.append(this.f45701d);
            sbQ.append(") ");
            string = sbQ.toString();
        }
        ArrayList arrayList = this.f45702e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f45703f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strF = N0.a.f(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (i5 > 0) {
                    strF = N0.a.f(strF, ", ");
                }
                StringBuilder sbJ2 = N0.a.j(strF);
                sbJ2.append(arrayList.get(i5));
                strF = sbJ2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    strF = N0.a.f(strF, ", ");
                }
                StringBuilder sbJ3 = N0.a.j(strF);
                sbJ3.append(arrayList2.get(i10));
                strF = sbJ3.toString();
            }
        }
        return N0.a.f(strF, ")");
    }

    public void a(InterfaceC4095o interfaceC4095o) {
        if (this.f45713q == null) {
            this.f45713q = new ArrayList();
        }
        this.f45713q.add(interfaceC4095o);
    }

    public void b(View view) {
        this.f45703f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f45709m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f45713q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f45713q.clone();
        int size2 = arrayList3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((InterfaceC4095o) arrayList3.get(i5)).b();
        }
    }

    public abstract void d(C4103w c4103w);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C4103w c4103w = new C4103w(view);
            if (z2) {
                g(c4103w);
            } else {
                d(c4103w);
            }
            c4103w.f45734c.add(this);
            f(c4103w);
            if (z2) {
                c(this.f45704g, view, c4103w);
            } else {
                c(this.f45705h, view, c4103w);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                e(viewGroup.getChildAt(i5), z2);
            }
        }
    }

    public abstract void g(C4103w c4103w);

    public final void h(ViewGroup viewGroup, boolean z2) {
        j(z2);
        ArrayList arrayList = this.f45702e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f45703f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i5)).intValue());
            if (viewFindViewById != null) {
                C4103w c4103w = new C4103w(viewFindViewById);
                if (z2) {
                    g(c4103w);
                } else {
                    d(c4103w);
                }
                c4103w.f45734c.add(this);
                f(c4103w);
                if (z2) {
                    c(this.f45704g, viewFindViewById, c4103w);
                } else {
                    c(this.f45705h, viewFindViewById, c4103w);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            C4103w c4103w2 = new C4103w(view);
            if (z2) {
                g(c4103w2);
            } else {
                d(c4103w2);
            }
            c4103w2.f45734c.add(this);
            f(c4103w2);
            if (z2) {
                c(this.f45704g, view, c4103w2);
            } else {
                c(this.f45705h, view, c4103w2);
            }
        }
    }

    public final void j(boolean z2) {
        if (z2) {
            ((C4412e) this.f45704g.f15389a).clear();
            ((SparseArray) this.f45704g.f15390b).clear();
            ((C4415h) this.f45704g.f15391c).b();
        } else {
            ((C4412e) this.f45705h.f15389a).clear();
            ((SparseArray) this.f45705h.f15390b).clear();
            ((C4415h) this.f45705h.f15391c).b();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC4096p clone() {
        try {
            AbstractC4096p abstractC4096p = (AbstractC4096p) super.clone();
            abstractC4096p.f45714r = new ArrayList();
            abstractC4096p.f45704g = new W9.u(7);
            abstractC4096p.f45705h = new W9.u(7);
            abstractC4096p.k = null;
            abstractC4096p.f45708l = null;
            return abstractC4096p;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, C4103w c4103w, C4103w c4103w2) {
        return null;
    }

    public void m(ViewGroup viewGroup, W9.u uVar, W9.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorL;
        int i5;
        int i10;
        View view;
        C4103w c4103w;
        Animator animator;
        C4103w c4103w2;
        C4412e c4412eP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C4103w c4103w3 = (C4103w) arrayList.get(i11);
            C4103w c4103w4 = (C4103w) arrayList2.get(i11);
            if (c4103w3 != null && !c4103w3.f45734c.contains(this)) {
                c4103w3 = null;
            }
            if (c4103w4 != null && !c4103w4.f45734c.contains(this)) {
                c4103w4 = null;
            }
            if (!(c4103w3 == null && c4103w4 == null) && ((c4103w3 == null || c4103w4 == null || s(c4103w3, c4103w4)) && (animatorL = l(viewGroup, c4103w3, c4103w4)) != null)) {
                String str = this.f45698a;
                if (c4103w4 != null) {
                    String[] strArrQ = q();
                    view = c4103w4.f45733b;
                    if (strArrQ != null && strArrQ.length > 0) {
                        c4103w2 = new C4103w(view);
                        C4103w c4103w5 = (C4103w) ((C4412e) uVar2.f15389a).get(view);
                        i5 = size;
                        if (c4103w5 != null) {
                            int i12 = 0;
                            while (i12 < strArrQ.length) {
                                HashMap map = c4103w2.f45732a;
                                int i13 = i11;
                                String str2 = strArrQ[i12];
                                map.put(str2, c4103w5.f45732a.get(str2));
                                i12++;
                                i11 = i13;
                            }
                        }
                        i10 = i11;
                        int i14 = c4412eP.f47563c;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                animator = animatorL;
                                break;
                            }
                            C4094n c4094n = (C4094n) c4412eP.get((Animator) c4412eP.g(i15));
                            if (c4094n.f45692c != null && c4094n.f45690a == view && c4094n.f45691b.equals(str) && c4094n.f45692c.equals(c4103w2)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i5 = size;
                        i10 = i11;
                        animator = animatorL;
                        c4103w2 = null;
                    }
                    animatorL = animator;
                    c4103w = c4103w2;
                } else {
                    i5 = size;
                    i10 = i11;
                    view = c4103w3.f45733b;
                    c4103w = null;
                }
                if (animatorL != null) {
                    y yVar = AbstractC4104x.f45735a;
                    C4080D c4080d = new C4080D(viewGroup);
                    C4094n c4094n2 = new C4094n();
                    c4094n2.f45690a = view;
                    c4094n2.f45691b = str;
                    c4094n2.f45692c = c4103w;
                    c4094n2.f45693d = c4080d;
                    c4094n2.f45694e = this;
                    c4412eP.put(animatorL, c4094n2);
                    this.f45714r.add(animatorL);
                }
            } else {
                i5 = size;
                i10 = i11;
            }
            i11 = i10 + 1;
            size = i5;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = (Animator) this.f45714r.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i5 = this.f45710n - 1;
        this.f45710n = i5;
        if (i5 == 0) {
            ArrayList arrayList = this.f45713q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f45713q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC4095o) arrayList2.get(i10)).d(this);
                }
            }
            for (int i11 = 0; i11 < ((C4415h) this.f45704g.f15391c).h(); i11++) {
                View view = (View) ((C4415h) this.f45704g.f15391c).j(i11);
                if (view != null) {
                    WeakHashMap weakHashMap = S.f38779a;
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((C4415h) this.f45705h.f15391c).h(); i12++) {
                View view2 = (View) ((C4415h) this.f45705h.f15391c).j(i12);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = S.f38779a;
                    view2.setHasTransientState(false);
                }
            }
            this.f45712p = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f45708l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (t3.C4103w) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t3.C4103w o(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            t3.u r0 = r4.f45706i
            if (r0 == 0) goto L9
            t3.w r5 = r0.o(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f45708l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            t3.w r3 = (t3.C4103w) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f45733b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f45708l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.k
        L35:
            java.lang.Object r5 = r5.get(r2)
            t3.w r5 = (t3.C4103w) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.AbstractC4096p.o(android.view.View, boolean):t3.w");
    }

    public String[] q() {
        return null;
    }

    public final C4103w r(View view, boolean z2) {
        C4101u c4101u = this.f45706i;
        if (c4101u != null) {
            return c4101u.r(view, z2);
        }
        return (C4103w) ((C4412e) (z2 ? this.f45704g : this.f45705h).f15389a).get(view);
    }

    public boolean s(C4103w c4103w, C4103w c4103w2) {
        if (c4103w != null && c4103w2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(c4103w, c4103w2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c4103w.f45732a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(c4103w, c4103w2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f45702e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f45703f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final String toString() {
        return I("");
    }

    public void v(ViewGroup viewGroup) {
        if (this.f45712p) {
            return;
        }
        ArrayList arrayList = this.f45709m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f45713q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f45713q.clone();
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((InterfaceC4095o) arrayList3.get(i5)).a();
            }
        }
        this.f45711o = true;
    }

    public void w(InterfaceC4095o interfaceC4095o) {
        ArrayList arrayList = this.f45713q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC4095o);
        if (this.f45713q.size() == 0) {
            this.f45713q = null;
        }
    }

    public void x(View view) {
        this.f45703f.remove(view);
    }

    public void y(View view) {
        if (this.f45711o) {
            if (!this.f45712p) {
                ArrayList arrayList = this.f45709m;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f45713q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f45713q.clone();
                    int size2 = arrayList3.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((InterfaceC4095o) arrayList3.get(i5)).c();
                    }
                }
            }
            this.f45711o = false;
        }
    }

    public void z() {
        H();
        C4412e c4412eP = p();
        Iterator it = this.f45714r.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c4412eP.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new D9.c(this, c4412eP));
                    long j8 = this.f45700c;
                    if (j8 >= 0) {
                        animator.setDuration(j8);
                    }
                    long j10 = this.f45699b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f45701d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new D9.o(this, 5));
                    animator.start();
                }
            }
        }
        this.f45714r.clear();
        n();
    }

    public void F() {
    }

    public void f(C4103w c4103w) {
    }
}
