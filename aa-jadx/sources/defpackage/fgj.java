package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fgj implements java.lang.Cloneable {
    private java.lang.String D;
    private java.util.ArrayList E;
    private java.util.ArrayList F;
    private java.util.ArrayList G;
    private defpackage.fgg[] H;
    private android.animation.Animator[] I;
    private boolean J;
    private java.util.ArrayList K;
    public long b;
    public long c;
    public android.animation.TimeInterpolator d;
    java.util.ArrayList e;
    java.util.ArrayList f;
    public java.util.ArrayList g;
    public java.util.ArrayList h;
    defpackage.fgt i;
    public int[] j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    java.util.ArrayList m;
    int n;
    boolean o;
    public defpackage.fgj p;
    defpackage.fgj q;
    public java.util.ArrayList r;
    defpackage.fgp s;
    public defpackage.fge t;
    public defpackage.ffl u;
    long v;
    defpackage.fgf w;
    long x;
    public defpackage.jto y;
    public defpackage.jto z;
    private static final android.animation.Animator[] a = new android.animation.Animator[0];
    private static final int[] A = {2, 1, 3, 4};
    private static final defpackage.ffl B = new defpackage.fga();
    private static final java.lang.ThreadLocal C = new java.lang.ThreadLocal();

    public fgj(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.D = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = null;
        this.h = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.y = new defpackage.jto();
        this.z = new defpackage.jto();
        this.i = null;
        int[] iArr = A;
        this.j = iArr;
        this.m = new java.util.ArrayList();
        this.I = a;
        this.n = 0;
        this.J = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.K = null;
        this.r = new java.util.ArrayList();
        this.u = B;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ffz.b);
        android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) attributeSet;
        long jM = defpackage.dmh.m(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM >= 0) {
            R(jM);
        }
        long jM2 = defpackage.dmh.m(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM2 > 0) {
            T(jM2);
        }
        int iA = defpackage.dmh.A(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0);
        if (iA > 0) {
            S(android.view.animation.AnimationUtils.loadInterpolator(context, iA));
        }
        java.lang.String strQ = defpackage.dmh.q(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strQ != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(strQ, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                java.lang.String strTrim = stringTokenizer.nextToken().trim();
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
                        throw new android.view.InflateException(defpackage.a.bp(strTrim, "Unknown match type in matchOrder: '", "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    java.lang.System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.j = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 <= 0 || i3 > 4) {
                        throw new java.lang.IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            throw new java.lang.IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.j = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static void V(defpackage.jto jtoVar, android.view.View view, defpackage.fgv fgvVar) {
        ((defpackage.aba) jtoVar.a).put(view, fgvVar);
        int id = view.getId();
        if (id >= 0) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) jtoVar.c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = defpackage.ebt.a;
        java.lang.String transitionName = view.getTransitionName();
        if (transitionName != null) {
            defpackage.aba abaVar = (defpackage.aba) jtoVar.d;
            if (abaVar.containsKey(transitionName)) {
                abaVar.put(transitionName, null);
            } else {
                abaVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                defpackage.zz zzVar = (defpackage.zz) jtoVar.b;
                if (zzVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zzVar.g(itemIdAtPosition, view);
                    return;
                }
                android.view.View view2 = (android.view.View) zzVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zzVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void f(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        java.util.ArrayList arrayList = this.E;
        if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(id))) {
            java.util.ArrayList arrayList2 = this.F;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((java.lang.Class) this.F.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof android.view.ViewGroup) {
                defpackage.fgv fgvVar = new defpackage.fgv(view);
                if (z) {
                    c(fgvVar);
                } else {
                    b(fgvVar);
                }
                fgvVar.c.add(this);
                p(fgvVar);
                if (z) {
                    V(this.y, view, fgvVar);
                } else {
                    V(this.z, view, fgvVar);
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    private static boolean g(defpackage.fgv fgvVar, defpackage.fgv fgvVar2, java.lang.String str) {
        java.util.Map map = fgvVar2.a;
        java.lang.Object obj = fgvVar.a.get(str);
        java.lang.Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    static defpackage.zd i() {
        java.lang.ThreadLocal threadLocal = C;
        defpackage.zd zdVar = (defpackage.zd) threadLocal.get();
        if (zdVar != null) {
            return zdVar;
        }
        defpackage.zd zdVar2 = new defpackage.zd();
        threadLocal.set(zdVar2);
        return zdVar2;
    }

    public void A(defpackage.fge fgeVar) {
        this.t = fgeVar;
    }

    public void B(defpackage.ffl fflVar) {
        if (fflVar == null) {
            this.u = B;
        } else {
            this.u = fflVar;
        }
    }

    public void C(defpackage.fgp fgpVar) {
        this.s = fgpVar;
    }

    protected final void D() {
        if (this.n == 0) {
            t(this, defpackage.fgi.a, false);
            this.o = false;
        }
        this.n++;
    }

    public boolean E() {
        return !this.m.isEmpty();
    }

    public boolean F(defpackage.fgv fgvVar, defpackage.fgv fgvVar2) {
        if (fgvVar != null && fgvVar2 != null) {
            java.lang.String[] strArrE = e();
            if (strArrE != null) {
                for (java.lang.String str : strArrE) {
                    if (g(fgvVar, fgvVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            java.util.Iterator it = fgvVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (g(fgvVar, fgvVar2, (java.lang.String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean G(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int id = view.getId();
        java.util.ArrayList arrayList3 = this.E;
        if (arrayList3 != null && arrayList3.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        java.util.ArrayList arrayList4 = this.F;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (((java.lang.Class) this.F.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.G != null) {
            int[] iArr = defpackage.ebt.a;
            if (view.getTransitionName() != null && this.G.contains(view.getTransitionName())) {
                return false;
            }
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(java.lang.Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        java.util.ArrayList arrayList5 = this.g;
        if (arrayList5 != null) {
            int[] iArr2 = defpackage.ebt.a;
            if (arrayList5.contains(view.getTransitionName())) {
                return true;
            }
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (((java.lang.Class) this.h.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void H(defpackage.fgg fggVar) {
        java.util.ArrayList arrayList = this.K;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.K = arrayList;
        }
        arrayList.add(fggVar);
    }

    public void I(int i) {
        if (i != 0) {
            this.e.add(java.lang.Integer.valueOf(i));
        }
    }

    public void J(android.view.View view) {
        this.f.add(view);
    }

    public void K(java.lang.Class cls) {
        java.util.ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.h = arrayList;
        }
        arrayList.add(cls);
    }

    public void L(java.lang.String str) {
        java.util.ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.g = arrayList;
        }
        arrayList.add(str);
    }

    public void M(int i) {
        java.util.ArrayList arrayListN = this.E;
        if (i > 0) {
            arrayListN = defpackage.daw.n(arrayListN, java.lang.Integer.valueOf(i));
        }
        this.E = arrayListN;
    }

    public void N(java.lang.Class cls) {
        java.util.ArrayList arrayListN = this.F;
        if (cls != null) {
            arrayListN = defpackage.daw.n(arrayListN, cls);
        }
        this.F = arrayListN;
    }

    public void O(java.lang.String str) {
        this.G = defpackage.daw.n(this.G, str);
    }

    public final void P(defpackage.fgg fggVar) {
        defpackage.fgj fgjVar;
        java.util.ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(fggVar) && (fgjVar = this.p) != null) {
            fgjVar.P(fggVar);
        }
        if (this.K.size() == 0) {
            this.K = null;
        }
    }

    public void Q(android.view.View view) {
        this.f.remove(view);
    }

    public void R(long j) {
        this.c = j;
    }

    public void S(android.animation.TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void T(long j) {
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void U(android.view.ViewGroup viewGroup, defpackage.jto jtoVar, defpackage.jto jtoVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.animation.Animator animatorA;
        android.view.View view;
        defpackage.fgv fgvVar;
        defpackage.fgp fgpVar;
        android.animation.Animator animator;
        java.lang.Object obj;
        defpackage.zd zdVarI = i();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        defpackage.fgf fgfVar = k().w;
        long jMin = Long.MAX_VALUE;
        int i = 0;
        while (i < size) {
            defpackage.fgv fgvVar2 = (defpackage.fgv) arrayList.get(i);
            defpackage.fgv fgvVar3 = (defpackage.fgv) arrayList2.get(i);
            if (fgvVar2 != null && !fgvVar2.c.contains(this)) {
                fgvVar2 = null;
            }
            if (fgvVar3 != null && !fgvVar3.c.contains(this)) {
                fgvVar3 = null;
            }
            if (!(fgvVar2 == null && fgvVar3 == null) && ((fgvVar2 == null || fgvVar3 == null || F(fgvVar2, fgvVar3)) && (animatorA = a(viewGroup, fgvVar2, fgvVar3)) != null)) {
                if (fgvVar3 != null) {
                    view = fgvVar3.b;
                    java.lang.String[] strArrE = e();
                    if (strArrE != null) {
                        animatorA = animatorA;
                        fgvVar = new defpackage.fgv(view);
                        size = size;
                        fgfVar = fgfVar;
                        defpackage.fgv fgvVar4 = (defpackage.fgv) ((defpackage.aba) jtoVar2.a).get(view);
                        i = i;
                        if (fgvVar4 != null) {
                            int i2 = 0;
                            while (i2 < strArrE.length) {
                                java.util.Map map = fgvVar.a;
                                int i3 = i2;
                                java.lang.String str = strArrE[i3];
                                map.put(str, fgvVar4.a.get(str));
                                i2 = i3 + 1;
                                strArrE = strArrE;
                            }
                        }
                        int i4 = zdVarI.d;
                        int i5 = 0;
                        while (i5 < i4) {
                            defpackage.fgd fgdVar = (defpackage.fgd) zdVarI.get((android.animation.Animator) zdVarI.d(i5));
                            defpackage.fgv fgvVar5 = fgdVar.c;
                            int i6 = i4;
                            if (fgvVar5 != null && fgdVar.a == view && fgdVar.b.equals(this.D) && fgvVar5.equals(fgvVar)) {
                                animatorA = null;
                                break;
                            } else {
                                i5++;
                                i4 = i6;
                            }
                        }
                    }
                    if (animatorA == null) {
                        fgpVar = this.s;
                        if (fgpVar != null) {
                            long jA = fgpVar.a(viewGroup, this, fgvVar2, fgvVar3);
                            sparseIntArray.put(this.r.size(), (int) jA);
                            jMin = java.lang.Math.min(jA, jMin);
                        }
                        long j = jMin;
                        android.view.View view2 = view;
                        defpackage.fgv fgvVar6 = fgvVar;
                        animator = animatorA;
                        defpackage.fgd fgdVar2 = new defpackage.fgd(view2, this.D, this, viewGroup.getWindowId(), fgvVar6, animator);
                        if (fgfVar != null) {
                            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        } else {
                            obj = animator;
                        }
                        zdVarI.put(obj, fgdVar2);
                        this.r.add(obj);
                        jMin = j;
                    }
                } else {
                    view = fgvVar2.b;
                }
                fgvVar = null;
                if (animatorA == null) {
                    fgpVar = this.s;
                    if (fgpVar != null) {
                        long jA2 = fgpVar.a(viewGroup, this, fgvVar2, fgvVar3);
                        sparseIntArray.put(this.r.size(), (int) jA2);
                        jMin = java.lang.Math.min(jA2, jMin);
                    }
                    long j2 = jMin;
                    android.view.View view3 = view;
                    defpackage.fgv fgvVar7 = fgvVar;
                    animator = animatorA;
                    defpackage.fgd fgdVar3 = new defpackage.fgd(view3, this.D, this, viewGroup.getWindowId(), fgvVar7, animator);
                    if (fgfVar != null) {
                        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                        animatorSet2.play(animator);
                        obj = animatorSet2;
                    } else {
                        obj = animator;
                    }
                    zdVarI.put(obj, fgdVar3);
                    this.r.add(obj);
                    jMin = j2;
                }
            } else {
                size = size;
                fgfVar = fgfVar;
                i = i;
            }
            i++;
            size = size;
            fgfVar = fgfVar;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                defpackage.fgd fgdVar4 = (defpackage.fgd) zdVarI.get((android.animation.Animator) this.r.get(sparseIntArray.keyAt(i7)));
                long jValueAt = ((long) sparseIntArray.valueAt(i7)) - jMin;
                android.animation.Animator animator2 = fgdVar4.f;
                animator2.setStartDelay(jValueAt + animator2.getStartDelay());
            }
        }
    }

    public android.animation.Animator a(android.view.ViewGroup viewGroup, defpackage.fgv fgvVar, defpackage.fgv fgvVar2) {
        return null;
    }

    public abstract void b(defpackage.fgv fgvVar);

    public abstract void c(defpackage.fgv fgvVar);

    public boolean d() {
        return false;
    }

    public java.lang.String[] e() {
        return null;
    }

    public final android.graphics.Rect h() {
        defpackage.fge fgeVar = this.t;
        if (fgeVar == null) {
            return null;
        }
        return fgeVar.a();
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public defpackage.fgj clone() {
        try {
            defpackage.fgj fgjVar = (defpackage.fgj) super.clone();
            fgjVar.r = new java.util.ArrayList();
            fgjVar.y = new defpackage.jto();
            fgjVar.z = new defpackage.jto();
            fgjVar.k = null;
            fgjVar.l = null;
            fgjVar.w = null;
            fgjVar.p = this;
            fgjVar.K = null;
            fgjVar.q = null;
            return fgjVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final defpackage.fgj k() {
        defpackage.fgt fgtVar = this.i;
        return fgtVar != null ? fgtVar.k() : this;
    }

    final defpackage.fgv l(android.view.View view, boolean z) {
        defpackage.fgt fgtVar = this.i;
        if (fgtVar != null) {
            return fgtVar.l(view, z);
        }
        java.util.ArrayList arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            defpackage.fgv fgvVar = (defpackage.fgv) arrayList.get(i);
            if (fgvVar == null) {
                return null;
            }
            if (fgvVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (defpackage.fgv) (z ? this.l : this.k).get(i);
        }
        return null;
    }

    public final defpackage.fgv m(android.view.View view, boolean z) {
        defpackage.fgt fgtVar = this.i;
        if (fgtVar != null) {
            return fgtVar.m(view, z);
        }
        return (defpackage.fgv) ((defpackage.aba) (z ? this.y : this.z).a).get(view);
    }

    public java.lang.String n(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
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
        defpackage.fgj fgjVar = this.q;
        if (fgjVar != null) {
            this.q = null;
            fgjVar.w();
        }
        int size = this.m.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.m.toArray(this.I);
        this.I = a;
        while (true) {
            size--;
            if (size < 0) {
                this.I = animatorArr;
                t(this, defpackage.fgi.c, false);
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    public void p(defpackage.fgv fgvVar) {
        if (this.s != null) {
            java.util.Map map = fgvVar.a;
            if (map.isEmpty()) {
                return;
            }
            java.lang.String[] strArrC = this.s.c();
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArrC[i])) {
                    this.s.b(fgvVar);
                    return;
                }
            }
        }
    }

    final void q(android.view.ViewGroup viewGroup, boolean z) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        boolean z2;
        r(z);
        if ((this.e.size() <= 0 && this.f.size() <= 0) || (((arrayList = this.g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.h) != null && !arrayList2.isEmpty()))) {
            f(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.e.size()) {
                break;
            }
            android.view.View viewFindViewById = viewGroup.findViewById(((java.lang.Integer) this.e.get(i)).intValue());
            if (viewFindViewById != null) {
                defpackage.fgv fgvVar = new defpackage.fgv(viewFindViewById);
                if (z) {
                    c(fgvVar);
                } else {
                    b(fgvVar);
                    z3 = false;
                }
                fgvVar.c.add(this);
                p(fgvVar);
                if (z3) {
                    V(this.y, viewFindViewById, fgvVar);
                } else {
                    V(this.z, viewFindViewById, fgvVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            android.view.View view = (android.view.View) this.f.get(i2);
            defpackage.fgv fgvVar2 = new defpackage.fgv(view);
            if (z) {
                c(fgvVar2);
                z2 = true;
            } else {
                b(fgvVar2);
                z2 = false;
            }
            fgvVar2.c.add(this);
            p(fgvVar2);
            if (z2) {
                V(this.y, view, fgvVar2);
            } else {
                V(this.z, view, fgvVar2);
            }
        }
    }

    final void r(boolean z) {
        if (z) {
            ((defpackage.aba) this.y.a).clear();
            ((android.util.SparseArray) this.y.c).clear();
            ((defpackage.zz) this.y.b).f();
        } else {
            ((defpackage.aba) this.z.a).clear();
            ((android.util.SparseArray) this.z.c).clear();
            ((defpackage.zz) this.z.b).f();
        }
    }

    protected final void s() {
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            t(this, defpackage.fgi.b, false);
            for (int i2 = 0; i2 < ((defpackage.zz) this.y.b).b(); i2++) {
                android.view.View view = (android.view.View) ((defpackage.zz) this.y.b).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((defpackage.zz) this.z.b).b(); i3++) {
                android.view.View view2 = (android.view.View) ((defpackage.zz) this.z.b).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.o = true;
        }
    }

    public final void t(defpackage.fgj fgjVar, defpackage.fgi fgiVar, boolean z) {
        defpackage.fgj fgjVar2 = this.p;
        if (fgjVar2 != null) {
            fgjVar2.t(fgjVar, fgiVar, z);
        }
        java.util.ArrayList arrayList = this.K;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.K.size();
        defpackage.fgg[] fggVarArr = this.H;
        if (fggVarArr == null) {
            fggVarArr = new defpackage.fgg[size];
        }
        this.H = null;
        defpackage.fgg[] fggVarArr2 = (defpackage.fgg[]) this.K.toArray(fggVarArr);
        for (int i = 0; i < size; i++) {
            fgiVar.a(fggVarArr2[i], fgjVar);
            fggVarArr2[i] = null;
        }
        this.H = fggVarArr2;
    }

    public final java.lang.String toString() {
        return n("");
    }

    public void u(android.view.View view) {
        if (this.o) {
            return;
        }
        int size = this.m.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.m.toArray(this.I);
        this.I = a;
        while (true) {
            size--;
            if (size < 0) {
                this.I = animatorArr;
                t(this, defpackage.fgi.d, false);
                this.J = true;
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v() {
        defpackage.zd zdVarI = i();
        this.v = 0L;
        int i = 0;
        while (true) {
            int size = this.r.size();
            java.util.ArrayList arrayList = this.r;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            defpackage.fgd fgdVar = (defpackage.fgd) zdVarI.get(animator);
            if (animator != null && fgdVar != null) {
                long j = this.c;
                if (j >= 0) {
                    fgdVar.f.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    android.animation.Animator animator2 = fgdVar.f;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                android.animation.TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    fgdVar.f.setInterpolator(timeInterpolator);
                }
                this.m.add(animator);
                this.v = java.lang.Math.max(this.v, animator.getTotalDuration());
            }
            i++;
        }
    }

    public void w() {
        defpackage.zd zdVarI = i();
        int size = this.m.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.m.toArray(this.I);
        this.I = a;
        while (true) {
            size--;
            if (size < 0) {
                this.I = animatorArr;
                this.m.clear();
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                zdVarI.remove(animator);
            }
        }
    }

    public void x(android.view.View view) {
        if (this.J) {
            if (!this.o) {
                int size = this.m.size();
                android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.m.toArray(this.I);
                this.I = a;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    android.animation.Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.I = animatorArr;
                t(this, defpackage.fgi.e, false);
            }
            this.J = false;
        }
    }

    protected void y() {
        D();
        defpackage.zd zdVarI = i();
        java.util.ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            if (zdVarI.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new defpackage.fgb(this, zdVarI));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    android.animation.TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new defpackage.fgc(this));
                    animator.start();
                }
            }
        }
        this.r.clear();
        s();
    }

    public void z(long j, long j2) {
        long j3 = this.v;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.o = false;
            t(this, defpackage.fgi.a, z);
        }
        int size = this.m.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.m.toArray(this.I);
        this.I = a;
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((android.animation.AnimatorSet) animator).setCurrentPlayTime(java.lang.Math.min(java.lang.Math.max(0L, j), animator.getTotalDuration()));
        }
        this.I = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.o = true;
        }
        t(this, defpackage.fgi.b, z);
    }

    public fgj() {
        this.D = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = null;
        this.h = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.y = new defpackage.jto();
        this.z = new defpackage.jto();
        this.i = null;
        this.j = A;
        this.m = new java.util.ArrayList();
        this.I = a;
        this.n = 0;
        this.J = false;
        this.o = false;
        this.p = null;
        this.q = null;
        this.K = null;
        this.r = new java.util.ArrayList();
        this.u = B;
    }
}
