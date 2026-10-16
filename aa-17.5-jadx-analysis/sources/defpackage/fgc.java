package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public abstract class fgc implements Cloneable {
    private String C;
    private ArrayList D;
    private ArrayList E;
    private ArrayList F;
    private ffz[] G;
    private Animator[] H;
    private boolean I;
    private ArrayList J;
    public long b;
    public long c;
    public TimeInterpolator d;
    ArrayList e;
    ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public fgp i;
    public fgp j;
    fgm k;
    public int[] l;
    public ArrayList m;
    public ArrayList n;
    ArrayList o;
    int p;
    boolean q;
    public fgc r;
    public ArrayList s;
    fgi t;
    public ffx u;
    public ffe v;
    long w;
    ffy x;
    long y;
    private static final Animator[] a = new Animator[0];
    private static final int[] z = {2, 1, 3, 4};
    private static final ffe A = new fft();
    private static final ThreadLocal B = new ThreadLocal();

    public fgc(Context context, AttributeSet attributeSet) {
        this.C = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.i = new fgp();
        this.j = new fgp();
        this.k = null;
        int[] iArr = z;
        this.l = iArr;
        this.o = new ArrayList();
        this.H = a;
        this.p = 0;
        this.I = false;
        this.q = false;
        this.r = null;
        this.J = null;
        this.s = new ArrayList();
        this.v = A;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM = dlz.m(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM >= 0) {
            R(jM);
        }
        long jM2 = dlz.m(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM2 > 0) {
            T(jM2);
        }
        int iA = dlz.A(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0);
        if (iA > 0) {
            S(AnimationUtils.loadInterpolator(context, iA));
        }
        String strQ = dlz.q(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strQ != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strQ, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else {
                    if (!strTrim.isEmpty()) {
                        throw new InflateException(a.bq(strTrim, "Unknown match type in matchOrder: '", "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.l = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 <= 0 || i3 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.l = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static boolean U(fgo fgoVar, fgo fgoVar2, String str) {
        Map map = fgoVar2.a;
        Object obj = fgoVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(fgp fgpVar, View view, fgo fgoVar) {
        ((aat) fgpVar.a).put(view, fgoVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) fgpVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = ebm.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            aat aatVar = (aat) fgpVar.d;
            if (aatVar.containsKey(transitionName)) {
                aatVar.put(transitionName, null);
            } else {
                aatVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                zs zsVar = (zs) fgpVar.c;
                if (zsVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zsVar.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) zsVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zsVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.D;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.E;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((Class) this.E.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                fgo fgoVar = new fgo(view);
                if (z2) {
                    c(fgoVar);
                } else {
                    b(fgoVar);
                }
                fgoVar.c.add(this);
                p(fgoVar);
                if (z2) {
                    f(this.i, view, fgoVar);
                } else {
                    f(this.j, view, fgoVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    g(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public static yw i() {
        ThreadLocal threadLocal = B;
        yw ywVar = (yw) threadLocal.get();
        if (ywVar != null) {
            return ywVar;
        }
        yw ywVar2 = new yw();
        threadLocal.set(ywVar2);
        return ywVar2;
    }

    public void A(ffx ffxVar) {
        this.u = ffxVar;
    }

    public void B(ffe ffeVar) {
        if (ffeVar == null) {
            this.v = A;
        } else {
            this.v = ffeVar;
        }
    }

    public void C(fgi fgiVar) {
        this.t = fgiVar;
    }

    protected final void D() {
        if (this.p == 0) {
            u(this, fgb.a, false);
            this.q = false;
        }
        this.p++;
    }

    public boolean E() {
        return !this.o.isEmpty();
    }

    public boolean F(fgo fgoVar, fgo fgoVar2) {
        if (fgoVar != null && fgoVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (U(fgoVar, fgoVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = fgoVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (U(fgoVar, fgoVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean G(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.D;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.E;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.E.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.F != null) {
            int[] iArr = ebm.a;
            if (view.getTransitionName() != null && this.F.contains(view.getTransitionName())) {
                return false;
            }
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList arrayList5 = this.g;
        if (arrayList5 != null) {
            int[] iArr2 = ebm.a;
            if (arrayList5.contains(view.getTransitionName())) {
                return true;
            }
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (((Class) this.h.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void H(ffz ffzVar) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.J = arrayList;
        }
        arrayList.add(ffzVar);
    }

    public void I(int i) {
        if (i != 0) {
            this.e.add(Integer.valueOf(i));
        }
    }

    public void J(View view) {
        this.f.add(view);
    }

    public void K(Class cls) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        arrayList.add(cls);
    }

    public void L(String str) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g = arrayList;
        }
        arrayList.add(str);
    }

    public void M(int i) {
        ArrayList arrayListI = this.D;
        if (i > 0) {
            arrayListI = dat.i(arrayListI, Integer.valueOf(i));
        }
        this.D = arrayListI;
    }

    public void N(Class cls) {
        ArrayList arrayListI = this.E;
        if (cls != null) {
            arrayListI = dat.i(arrayListI, cls);
        }
        this.E = arrayListI;
    }

    public void O(String str) {
        this.F = dat.i(this.F, str);
    }

    public final void P(ffz ffzVar) {
        fgc fgcVar;
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(ffzVar) && (fgcVar = this.r) != null) {
            fgcVar.P(ffzVar);
        }
        if (this.J.size() == 0) {
            this.J = null;
        }
    }

    public void Q(View view) {
        this.f.remove(view);
    }

    public void R(long j) {
        this.c = j;
    }

    public void S(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void T(long j) {
        this.b = j;
    }

    public Animator a(ViewGroup viewGroup, fgo fgoVar, fgo fgoVar2) {
        return null;
    }

    public abstract void b(fgo fgoVar);

    public abstract void c(fgo fgoVar);

    public boolean d() {
        return false;
    }

    public String[] e() {
        return null;
    }

    public final Rect h() {
        ffx ffxVar = this.u;
        if (ffxVar == null) {
            return null;
        }
        return ffxVar.a();
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public fgc clone() {
        try {
            fgc fgcVar = (fgc) super.clone();
            fgcVar.s = new ArrayList();
            fgcVar.i = new fgp();
            fgcVar.j = new fgp();
            fgcVar.m = null;
            fgcVar.n = null;
            fgcVar.x = null;
            fgcVar.r = this;
            fgcVar.J = null;
            return fgcVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final fgc k() {
        fgm fgmVar = this.k;
        return fgmVar != null ? fgmVar.k() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.fgo) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.fgo l(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            fgm r0 = r5.k
            if (r0 == 0) goto L9
            fgo r5 = r0.l(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.m
            goto L10
        Le:
            java.util.ArrayList r0 = r5.n
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            fgo r4 = (defpackage.fgo) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.n
            goto L36
        L34:
            java.util.ArrayList r5 = r5.m
        L36:
            java.lang.Object r5 = r5.get(r3)
            fgo r5 = (defpackage.fgo) r5
            return r5
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgc.l(android.view.View, boolean):fgo");
    }

    public final fgo m(View view, boolean z2) {
        fgm fgmVar = this.k;
        if (fgmVar != null) {
            return fgmVar.m(view, z2);
        }
        return (fgo) ((aat) (z2 ? this.i : this.j).a).get(view);
    }

    public String n(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        if (this.e.size() > 0 || this.f.size() > 0) {
            sb.append("tgts(");
            if (this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.e.get(i));
                }
            }
            if (this.f.size() > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void o() {
        int size = this.o.size();
        Animator[] animatorArr = (Animator[]) this.o.toArray(this.H);
        this.H = a;
        while (true) {
            size--;
            if (size < 0) {
                this.H = animatorArr;
                u(this, fgb.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    public void p(fgo fgoVar) {
        if (this.t != null) {
            Map map = fgoVar.a;
            if (map.isEmpty()) {
                return;
            }
            String[] strArrC = this.t.c();
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArrC[i])) {
                    this.t.b(fgoVar);
                    return;
                }
            }
        }
    }

    final void q(ViewGroup viewGroup, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3;
        r(z2);
        if ((this.e.size() <= 0 && this.f.size() <= 0) || (((arrayList = this.g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.h) != null && !arrayList2.isEmpty()))) {
            g(viewGroup, z2);
            return;
        }
        int i = 0;
        while (true) {
            boolean z4 = true;
            if (i >= this.e.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) this.e.get(i)).intValue());
            if (viewFindViewById != null) {
                fgo fgoVar = new fgo(viewFindViewById);
                if (z2) {
                    c(fgoVar);
                } else {
                    b(fgoVar);
                    z4 = false;
                }
                fgoVar.c.add(this);
                p(fgoVar);
                if (z4) {
                    f(this.i, viewFindViewById, fgoVar);
                } else {
                    f(this.j, viewFindViewById, fgoVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            View view = (View) this.f.get(i2);
            fgo fgoVar2 = new fgo(view);
            if (z2) {
                c(fgoVar2);
                z3 = true;
            } else {
                b(fgoVar2);
                z3 = false;
            }
            fgoVar2.c.add(this);
            p(fgoVar2);
            if (z3) {
                f(this.i, view, fgoVar2);
            } else {
                f(this.j, view, fgoVar2);
            }
        }
    }

    final void r(boolean z2) {
        if (z2) {
            ((aat) this.i.a).clear();
            ((SparseArray) this.i.b).clear();
            ((zs) this.i.c).f();
        } else {
            ((aat) this.j.a).clear();
            ((SparseArray) this.j.b).clear();
            ((zs) this.j.c).f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(android.view.ViewGroup r23, defpackage.fgp r24, defpackage.fgp r25, java.util.ArrayList r26, java.util.ArrayList r27) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgc.s(android.view.ViewGroup, fgp, fgp, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected final void t() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            u(this, fgb.b, false);
            for (int i2 = 0; i2 < ((zs) this.i.c).b(); i2++) {
                View view = (View) ((zs) this.i.c).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((zs) this.j.c).b(); i3++) {
                View view2 = (View) ((zs) this.j.c).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.q = true;
        }
    }

    public final String toString() {
        return n("");
    }

    public final void u(fgc fgcVar, fgb fgbVar, boolean z2) {
        fgc fgcVar2 = this.r;
        if (fgcVar2 != null) {
            fgcVar2.u(fgcVar, fgbVar, z2);
        }
        ArrayList arrayList = this.J;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.J.size();
        ffz[] ffzVarArr = this.G;
        if (ffzVarArr == null) {
            ffzVarArr = new ffz[size];
        }
        this.G = null;
        ffz[] ffzVarArr2 = (ffz[]) this.J.toArray(ffzVarArr);
        for (int i = 0; i < size; i++) {
            fgbVar.a(ffzVarArr2[i], fgcVar);
            ffzVarArr2[i] = null;
        }
        this.G = ffzVarArr2;
    }

    public void v(View view) {
        if (this.q) {
            return;
        }
        int size = this.o.size();
        Animator[] animatorArr = (Animator[]) this.o.toArray(this.H);
        this.H = a;
        while (true) {
            size--;
            if (size < 0) {
                this.H = animatorArr;
                u(this, fgb.d, false);
                this.I = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w() {
        yw ywVarI = i();
        this.w = 0L;
        int i = 0;
        while (true) {
            int size = this.s.size();
            ArrayList arrayList = this.s;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            ffw ffwVar = (ffw) ywVarI.get(animator);
            if (animator != null && ffwVar != null) {
                long j = this.c;
                if (j >= 0) {
                    ffwVar.f.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    Animator animator2 = ffwVar.f;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    ffwVar.f.setInterpolator(timeInterpolator);
                }
                this.o.add(animator);
                this.w = Math.max(this.w, animator.getTotalDuration());
            }
            i++;
        }
    }

    public void x(View view) {
        if (this.I) {
            if (!this.q) {
                int size = this.o.size();
                Animator[] animatorArr = (Animator[]) this.o.toArray(this.H);
                this.H = a;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.H = animatorArr;
                u(this, fgb.e, false);
            }
            this.I = false;
        }
    }

    protected void y() {
        D();
        yw ywVarI = i();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (ywVarI.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new ffu(this, ywVarI));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new ffv(this));
                    animator.start();
                }
            }
        }
        this.s.clear();
        t();
    }

    public void z(long j, long j2) {
        long j3 = this.w;
        boolean z2 = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.q = false;
            u(this, fgb.a, z2);
        }
        int size = this.o.size();
        Animator[] animatorArr = (Animator[]) this.o.toArray(this.H);
        this.H = a;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.H = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.q = true;
        }
        u(this, fgb.b, z2);
    }

    public fgc() {
        this.C = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.i = new fgp();
        this.j = new fgp();
        this.k = null;
        this.l = z;
        this.o = new ArrayList();
        this.H = a;
        this.p = 0;
        this.I = false;
        this.q = false;
        this.r = null;
        this.J = null;
        this.s = new ArrayList();
        this.v = A;
    }
}
