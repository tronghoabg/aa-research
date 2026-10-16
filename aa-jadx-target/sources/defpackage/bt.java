package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bt {
    public defpackage.bil A;
    public final defpackage.bil B;
    private boolean C;
    private java.util.ArrayList D;
    private final defpackage.dzn F;
    private final defpackage.dzn G;
    private final defpackage.dzn H;
    private final defpackage.dzn I;
    private final defpackage.bf J;
    private boolean K;
    private java.util.ArrayList L;
    private java.util.ArrayList M;
    private java.util.ArrayList N;
    private final java.lang.Runnable O;
    private final defpackage.ca P;
    private final defpackage.izq Q;
    public final java.util.ArrayList j;
    public final java.util.concurrent.CopyOnWriteArrayList k;
    public int l;
    public defpackage.bg m;
    public defpackage.be n;
    public android.support.v4.app.Fragment o;
    public android.support.v4.app.Fragment p;
    public defpackage.bf q;
    public defpackage.pb r;
    public defpackage.pb s;
    public defpackage.pb t;
    public java.util.ArrayDeque u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public defpackage.bv z;
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final defpackage.bz b = new defpackage.bz();
    java.util.ArrayList c = new java.util.ArrayList();
    public final defpackage.bh d = new defpackage.bh(this);
    defpackage.w e = null;
    boolean f = false;
    public final defpackage.op g = new defpackage.bj(this);
    public final java.util.concurrent.atomic.AtomicInteger h = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.Map i = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map E = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    public bt() {
        j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());
        this.j = new java.util.ArrayList();
        this.B = new defpackage.bil(this);
        this.k = new java.util.concurrent.CopyOnWriteArrayList();
        this.F = new defpackage.ba(this, 2);
        this.G = new defpackage.ba(this, 3);
        this.H = new defpackage.ba(this, 4);
        this.I = new defpackage.ba(this, 5);
        this.Q = new defpackage.izq(this);
        this.l = -1;
        this.q = null;
        this.J = new defpackage.bk(this);
        this.P = new defpackage.ca();
        this.u = new java.util.ArrayDeque();
        this.O = new defpackage.ap(this, 12, null);
    }

    private final void aA() {
        java.util.Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            P((defpackage.by) it.next());
        }
    }

    public static boolean ac(int i) {
        return android.util.Log.isLoggable("FragmentManager", i);
    }

    static final java.util.Set ai(defpackage.w wVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = wVar.e;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            android.support.v4.app.Fragment fragment = ((defpackage.cb) arrayList.get(i)).b;
            if (fragment != null && wVar.k) {
                hashSet.add(fragment);
            }
            i++;
        }
    }

    public static final boolean aj(android.support.v4.app.Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zAj = false;
        for (android.support.v4.app.Fragment fragment2 : fragment.mChildFragmentManager.b.f()) {
            if (fragment2 != null) {
                zAj = aj(fragment2);
            }
            if (zAj) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ak(android.support.v4.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    static final void am(android.support.v4.app.Fragment fragment) {
        if (ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "show: ".concat(java.lang.String.valueOf(fragment)));
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private final android.view.ViewGroup aq(android.support.v4.app.Fragment fragment) {
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.n.b()) {
            return null;
        }
        android.view.View viewA = this.n.a(fragment.mContainerId);
        if (viewA instanceof android.view.ViewGroup) {
            return (android.view.ViewGroup) viewA;
        }
        return null;
    }

    private final java.util.Set ar() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((defpackage.by) it.next()).a.mContainer;
            if (viewGroup != null) {
                hashSet.add(defpackage.ca.d(viewGroup, ap()));
            }
        }
        return hashSet;
    }

    private final void as() {
        if (af()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void at() {
        this.C = false;
        this.M.clear();
        this.L.clear();
    }

    private final void au() {
        if (this.K) {
            this.K = false;
            aA();
        }
    }

    private final void av(boolean z) {
        if (this.C) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            if (!this.y) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.m.d.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            as();
        }
        if (this.L == null) {
            this.L = new java.util.ArrayList();
            this.M = new java.util.ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0220 A[PHI: r14
  0x0220: PHI (r14v16 int) = (r14v15 int), (r14v17 int) binds: [B:99:0x0210, B:104:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a  */
    private final void aw(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = i;
        boolean z3 = ((defpackage.w) arrayList.get(i8)).t;
        java.util.ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        java.util.ArrayList arrayList4 = this.N;
        defpackage.bz bzVar = this.b;
        arrayList4.addAll(bzVar.g());
        android.support.v4.app.Fragment fragment = this.p;
        int i9 = i8;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i2) {
                boolean z5 = z3;
                boolean z6 = z4;
                int i11 = -1;
                this.N.clear();
                if (!z5 && this.l > 0) {
                    for (int i12 = i8; i12 < i2; i12++) {
                        java.util.ArrayList arrayList5 = ((defpackage.w) arrayList.get(i12)).e;
                        int size = arrayList5.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            android.support.v4.app.Fragment fragment2 = ((defpackage.cb) arrayList5.get(i13)).b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                bzVar.j(k(fragment2));
                            }
                        }
                    }
                }
                int i14 = i8;
                while (i14 < i2) {
                    defpackage.w wVar = (defpackage.w) arrayList.get(i14);
                    if (!((java.lang.Boolean) arrayList2.get(i14)).booleanValue()) {
                        wVar.a(1);
                        java.util.ArrayList arrayList6 = wVar.e;
                        int size2 = arrayList6.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            defpackage.cb cbVar = (defpackage.cb) arrayList6.get(i15);
                            android.support.v4.app.Fragment fragment3 = cbVar.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = wVar.d;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(wVar.j);
                                fragment3.setSharedElementNames(wVar.r, wVar.s);
                            }
                            switch (cbVar.a) {
                                case 1:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    defpackage.bt btVar = wVar.a;
                                    btVar.T(fragment3, false);
                                    btVar.j(fragment3);
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + cbVar.a);
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    wVar.a.R(fragment3);
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    wVar.a.L(fragment3);
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    wVar.a.T(fragment3, false);
                                    am(fragment3);
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    wVar.a.r(fragment3);
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fragment3.setAnimations(cbVar.d, cbVar.e, cbVar.f, cbVar.g);
                                    defpackage.bt btVar2 = wVar.a;
                                    btVar2.T(fragment3, false);
                                    btVar2.p(fragment3);
                                    break;
                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                    wVar.a.V(fragment3);
                                    break;
                                case 9:
                                    wVar.a.V(null);
                                    break;
                                case 10:
                                    cbVar.h = fragment3.mMaxState;
                                    wVar.a.U(fragment3, cbVar.i);
                                    break;
                            }
                        }
                    } else {
                        int i16 = i11;
                        wVar.a(i16);
                        java.util.ArrayList arrayList7 = wVar.e;
                        for (int size3 = arrayList7.size() + i16; size3 >= 0; size3--) {
                            defpackage.cb cbVar2 = (defpackage.cb) arrayList7.get(size3);
                            android.support.v4.app.Fragment fragment4 = cbVar2.b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = wVar.d;
                                fragment4.setPopDirection(true);
                                int i17 = wVar.j;
                                int i18 = 8194;
                                int i19 = 4097;
                                if (i17 != 4097) {
                                    if (i17 != 8194) {
                                        i18 = 4100;
                                        i19 = 8197;
                                        if (i17 != 8197) {
                                            if (i17 == 4099) {
                                                i18 = 4099;
                                            } else if (i17 != 4100) {
                                                i18 = 0;
                                            } else {
                                                i18 = i19;
                                            }
                                        }
                                    } else {
                                        i18 = i19;
                                    }
                                }
                                fragment4.setNextTransition(i18);
                                fragment4.setSharedElementNames(wVar.s, wVar.r);
                            }
                            switch (cbVar2.a) {
                                case 1:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    defpackage.bt btVar3 = wVar.a;
                                    btVar3.T(fragment4, true);
                                    btVar3.R(fragment4);
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + cbVar2.a);
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    wVar.a.j(fragment4);
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    defpackage.bt btVar4 = wVar.a;
                                    am(fragment4);
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    defpackage.bt btVar5 = wVar.a;
                                    btVar5.T(fragment4, true);
                                    btVar5.L(fragment4);
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    wVar.a.p(fragment4);
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    fragment4.setAnimations(cbVar2.d, cbVar2.e, cbVar2.f, cbVar2.g);
                                    defpackage.bt btVar6 = wVar.a;
                                    btVar6.T(fragment4, true);
                                    btVar6.r(fragment4);
                                    break;
                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                    wVar.a.V(null);
                                    break;
                                case 9:
                                    wVar.a.V(fragment4);
                                    break;
                                case 10:
                                    cbVar2.i = fragment4.mMaxState;
                                    wVar.a.U(fragment4, cbVar2.h);
                                    break;
                            }
                        }
                    }
                    i14++;
                    i11 = -1;
                }
                boolean zBooleanValue = ((java.lang.Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z6 && !this.j.isEmpty()) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                    int size4 = arrayList.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        linkedHashSet.addAll(ai((defpackage.w) arrayList.get(i20)));
                    }
                    if (this.e == null) {
                        java.util.ArrayList arrayList8 = this.j;
                        int size5 = arrayList8.size();
                        int i21 = 0;
                        while (i21 < size5) {
                            glm glmVar = (glm) arrayList8.get(i21);
                            java.util.Iterator it = linkedHashSet.iterator();
                            while (true) {
                                i4 = i21 + 1;
                                if (it.hasNext()) {
                                    glmVar.e((android.support.v4.app.Fragment) it.next(), zBooleanValue);
                                }
                            }
                            i21 = i4;
                        }
                        java.util.ArrayList arrayList9 = this.j;
                        int size6 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            glm glmVar2 = (glm) arrayList9.get(i22);
                            java.util.Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                i3 = i22 + 1;
                                if (it2.hasNext()) {
                                    glmVar2.d((android.support.v4.app.Fragment) it2.next(), zBooleanValue);
                                }
                            }
                            i22 = i3;
                        }
                    }
                }
                for (int i23 = i8; i23 < i2; i23++) {
                    defpackage.w wVar2 = (defpackage.w) arrayList.get(i23);
                    if (zBooleanValue) {
                        java.util.ArrayList arrayList10 = wVar2.e;
                        for (int size7 = arrayList10.size() - 1; size7 >= 0; size7--) {
                            android.support.v4.app.Fragment fragment5 = ((defpackage.cb) arrayList10.get(size7)).b;
                            if (fragment5 != null) {
                                k(fragment5).e();
                            }
                        }
                    } else {
                        java.util.ArrayList arrayList11 = wVar2.e;
                        int size8 = arrayList11.size();
                        for (int i24 = 0; i24 < size8; i24++) {
                            android.support.v4.app.Fragment fragment6 = ((defpackage.cb) arrayList11.get(i24)).b;
                            if (fragment6 != null) {
                                k(fragment6).e();
                            }
                        }
                    }
                }
                M(this.l, true);
                for (defpackage.cq cqVar : m(arrayList, i8, i2)) {
                    cqVar.d = zBooleanValue;
                    cqVar.g();
                    cqVar.e();
                }
                while (i8 < i2) {
                    defpackage.w wVar3 = (defpackage.w) arrayList.get(i8);
                    if (((java.lang.Boolean) arrayList2.get(i8)).booleanValue() && wVar3.c >= 0) {
                        wVar3.c = -1;
                    }
                    if (wVar3.u != null) {
                        for (int i25 = 0; i25 < wVar3.u.size(); i25++) {
                            ((java.lang.Runnable) wVar3.u.get(i25)).run();
                        }
                        wVar3.u = null;
                    }
                    i8++;
                }
                if (z6) {
                    for (int i26 = 0; i26 < this.j.size(); i26++) {
                    }
                    return;
                }
                return;
            }
            defpackage.w wVar4 = (defpackage.w) arrayList.get(i9);
            boolean zBooleanValue2 = ((java.lang.Boolean) arrayList2.get(i9)).booleanValue();
            java.util.ArrayList arrayList12 = this.N;
            if (zBooleanValue2) {
                z = z3;
                i5 = i9;
                z2 = z4;
                int i27 = 1;
                java.util.ArrayList arrayList13 = wVar4.e;
                int size9 = arrayList13.size() - 1;
                while (size9 >= 0) {
                    defpackage.cb cbVar3 = (defpackage.cb) arrayList13.get(size9);
                    int i28 = cbVar3.a;
                    if (i28 == i27) {
                        arrayList12.remove(cbVar3.b);
                    } else if (i28 != 3) {
                        switch (i28) {
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                arrayList12.add(cbVar3.b);
                                break;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                arrayList12.remove(cbVar3.b);
                                break;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                fragment = null;
                                break;
                            case 9:
                                fragment = cbVar3.b;
                                break;
                            case 10:
                                cbVar3.i = cbVar3.h;
                                break;
                        }
                    } else {
                        arrayList12.add(cbVar3.b);
                    }
                    size9--;
                    i27 = 1;
                }
            } else {
                int i29 = 0;
                while (true) {
                    java.util.ArrayList arrayList14 = wVar4.e;
                    if (i29 < arrayList14.size()) {
                        defpackage.cb cbVar4 = (defpackage.cb) arrayList14.get(i29);
                        boolean z7 = z3;
                        int i30 = cbVar4.a;
                        if (i30 != i10) {
                            i6 = i9;
                            if (i30 != 2) {
                                if (i30 == 3 || i30 == 6) {
                                    arrayList12.remove(cbVar4.b);
                                    android.support.v4.app.Fragment fragment7 = cbVar4.b;
                                    if (fragment7 == fragment) {
                                        arrayList14.add(i29, new defpackage.cb(9, fragment7));
                                        i29++;
                                        fragment = null;
                                    }
                                } else if (i30 == 7) {
                                    i7 = 1;
                                } else if (i30 == 8) {
                                    arrayList14.add(i29, new defpackage.cb(9, fragment, null));
                                    cbVar4.c = true;
                                    fragment = cbVar4.b;
                                    i29++;
                                }
                                i7 = 1;
                            } else {
                                android.support.v4.app.Fragment fragment8 = cbVar4.b;
                                int i31 = fragment8.mContainerId;
                                int size10 = arrayList12.size() - 1;
                                boolean z8 = false;
                                while (size10 >= 0) {
                                    int i32 = size10;
                                    android.support.v4.app.Fragment fragment9 = (android.support.v4.app.Fragment) arrayList12.get(size10);
                                    boolean z9 = z4;
                                    if (fragment9.mContainerId != i31) {
                                        i31 = i31;
                                    } else if (fragment9 == fragment8) {
                                        i31 = i31;
                                        z8 = true;
                                    } else {
                                        if (fragment9 == fragment) {
                                            bArr = null;
                                            arrayList14.add(i29, new defpackage.cb(9, fragment9, null));
                                            i29++;
                                            fragment = null;
                                        } else {
                                            bArr = null;
                                        }
                                        defpackage.cb cbVar5 = new defpackage.cb(3, fragment9, bArr);
                                        cbVar5.d = cbVar4.d;
                                        cbVar5.f = cbVar4.f;
                                        cbVar5.e = cbVar4.e;
                                        cbVar5.g = cbVar4.g;
                                        arrayList14.add(i29, cbVar5);
                                        arrayList12.remove(fragment9);
                                        i29++;
                                        fragment = fragment;
                                    }
                                    size10 = i32 - 1;
                                    i31 = i31;
                                    z4 = z9;
                                }
                                z4 = z4;
                                i7 = 1;
                                if (z8) {
                                    arrayList14.remove(i29);
                                    i29--;
                                } else {
                                    cbVar4.a = 1;
                                    cbVar4.c = true;
                                    arrayList12.add(fragment8);
                                }
                            }
                            i29 += i7;
                            i10 = i7;
                            z3 = z7;
                            i9 = i6;
                            z4 = z4;
                        } else {
                            i6 = i9;
                            i7 = i10;
                        }
                        z4 = z4;
                        arrayList12.add(cbVar4.b);
                        i29 += i7;
                        i10 = i7;
                        z3 = z7;
                        i9 = i6;
                        z4 = z4;
                    } else {
                        z = z3;
                        i5 = i9;
                        z2 = z4;
                    }
                }
            }
            z4 = z2 || wVar4.k;
            i9 = i5 + 1;
            z3 = z;
        }
    }

    private final void ax() {
        for (defpackage.cq cqVar : ar()) {
            if (cqVar.e) {
                if (ac(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                cqVar.e = false;
                cqVar.e();
            }
        }
    }

    private final void ay(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((defpackage.w) arrayList.get(i)).t) {
                if (i2 != i) {
                    aw(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((java.lang.Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((java.lang.Boolean) arrayList2.get(i2)).booleanValue() && !((defpackage.w) arrayList.get(i2)).t) {
                        i2++;
                    }
                }
                aw(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            aw(arrayList, arrayList2, i2, size);
        }
    }

    private final void az(android.support.v4.app.Fragment fragment) {
        android.view.ViewGroup viewGroupAq = aq(fragment);
        if (viewGroupAq == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupAq.getTag(2131429877) == null) {
            viewGroupAq.setTag(2131429877, fragment);
        }
        ((android.support.v4.app.Fragment) viewGroupAq.getTag(2131429877)).setPopDirection(fragment.getPopDirection());
    }

    public static android.support.v4.app.Fragment g(android.view.View view) {
        while (view != null) {
            android.support.v4.app.Fragment fragmentH = h(view);
            if (fragmentH != null) {
                return fragmentH;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    public static android.support.v4.app.Fragment h(android.view.View view) {
        java.lang.Object tag = view.getTag(2131428235);
        if (tag instanceof android.support.v4.app.Fragment) {
            return (android.support.v4.app.Fragment) tag;
        }
        return null;
    }

    public final void A(android.support.v4.app.Fragment fragment) {
        if (fragment == null || !fragment.equals(d(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final void B() {
        if (this.e != null) {
            q();
        }
        F(5);
    }

    final void C(boolean z, boolean z2) {
        if (z2 && (this.m instanceof defpackage.dup)) {
            W(new java.lang.IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.C(z, true);
                }
            }
        }
    }

    public final void D() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(7);
    }

    public final void E() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(5);
    }

    public final void F(int i) {
        try {
            this.C = true;
            for (defpackage.by byVar : this.b.b.values()) {
                if (byVar != null) {
                    byVar.b = i;
                }
            }
            M(i, false);
            java.util.Iterator it = ar().iterator();
            while (it.hasNext()) {
                ((defpackage.cq) it.next()).f();
            }
            this.C = false;
            an(true);
        } catch (java.lang.Throwable th) {
            this.C = false;
            throw th;
        }
    }

    public final void G() {
        this.x = true;
        this.z.g = true;
        F(4);
    }

    public final void H(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        defpackage.bz bzVar = this.b;
        java.util.HashMap map = bzVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (defpackage.by byVar : map.values()) {
                printWriter.print(str);
                if (byVar != null) {
                    java.lang.String strValueOf = java.lang.String.valueOf(str);
                    android.support.v4.app.Fragment fragment = byVar.a;
                    printWriter.println(fragment);
                    fragment.dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = bzVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        java.util.ArrayList arrayList2 = this.D;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.Fragment fragment3 = (android.support.v4.app.Fragment) this.D.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                defpackage.w wVar = (defpackage.w) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(wVar.toString());
                wVar.f(strValueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.h.get());
        java.util.ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    java.lang.Object obj = (defpackage.bo) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public final void I() {
        java.util.Iterator it = ar().iterator();
        while (it.hasNext()) {
            ((defpackage.cq) it.next()).f();
        }
    }

    public final void J(defpackage.bo boVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.y) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            as();
        }
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.m == null) {
                if (!z) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(boVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.m.d.removeCallbacks(this.O);
                    this.m.d.post(this.O);
                    X();
                }
            }
        }
    }

    final void K(defpackage.bo boVar, boolean z) {
        if (z && (this.m == null || this.y)) {
            return;
        }
        av(z);
        defpackage.w wVar = this.e;
        if (wVar != null) {
            wVar.b = false;
            wVar.b();
            if (ac(3)) {
                android.util.Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execSingleAction for action " + boVar);
            }
            this.e.i(false, false);
            this.e.g(this.L, this.M);
            java.util.ArrayList arrayList = this.e.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.app.Fragment fragment = ((defpackage.cb) arrayList.get(i)).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.e = null;
        }
        boVar.g(this.L, this.M);
        this.C = true;
        try {
            ay(this.L, this.M);
            at();
            X();
            au();
            this.b.i();
        } catch (java.lang.Throwable th) {
            at();
            throw th;
        }
    }

    final void L(android.support.v4.app.Fragment fragment) {
        if (ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "hide: ".concat(java.lang.String.valueOf(fragment)));
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        az(fragment);
    }

    final void M(int i, boolean z) {
        defpackage.bg bgVar;
        if (this.m == null && i != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z || i != this.l) {
            this.l = i;
            defpackage.bz bzVar = this.b;
            java.util.ArrayList arrayList = bzVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.by byVar = (defpackage.by) bzVar.b.get(((android.support.v4.app.Fragment) arrayList.get(i2)).mWho);
                if (byVar != null) {
                    byVar.e();
                }
            }
            for (defpackage.by byVar2 : bzVar.b.values()) {
                if (byVar2 != null) {
                    byVar2.e();
                    android.support.v4.app.Fragment fragment = byVar2.a;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !bzVar.c.containsKey(fragment.mWho)) {
                            bzVar.a(fragment.mWho, byVar2.a());
                        }
                        bzVar.k(byVar2);
                    }
                }
            }
            aA();
            if (this.v && (bgVar = this.m) != null && this.l == 7) {
                bgVar.j();
                this.v = false;
            }
        }
    }

    public final void N() {
        if (this.m == null) {
            return;
        }
        this.w = false;
        this.x = false;
        this.z.g = false;
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void O(android.support.v4.app.FragmentContainerView fragmentContainerView) {
        android.view.View view;
        for (defpackage.by byVar : this.b.e()) {
            android.support.v4.app.Fragment fragment = byVar.a;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                byVar.b();
                byVar.e();
            }
        }
    }

    public final void P(defpackage.by byVar) {
        android.support.v4.app.Fragment fragment = byVar.a;
        if (fragment.mDeferStart) {
            if (this.C) {
                this.K = true;
            } else {
                fragment.mDeferStart = false;
                byVar.e();
            }
        }
    }

    public final void Q() {
        J(new bp(this, (java.lang.String) null, -1, 0), false);
    }

    final void R(android.support.v4.app.Fragment fragment) {
        if (ac(2)) {
            android.util.Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.b.l(fragment);
        if (aj(fragment)) {
            this.v = true;
        }
        fragment.mRemoving = true;
        az(fragment);
    }

    public final void S(android.os.Parcelable parcelable) {
        defpackage.by byVar;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        android.os.Bundle bundle3 = (android.os.Bundle) parcelable;
        for (java.lang.String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.m.c.getClassLoader());
                this.E.put(str.substring(7), bundle2);
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.m.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        defpackage.bz bzVar = this.b;
        java.util.HashMap map2 = bzVar.c;
        map2.clear();
        map2.putAll(map);
        android.support.v4.app.FragmentManagerState fragmentManagerState = (android.support.v4.app.FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState != null) {
            bzVar.b.clear();
            java.util.ArrayList arrayList = fragmentManagerState.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                android.os.Bundle bundleA = bzVar.a((java.lang.String) arrayList.get(i), null);
                if (bundleA != null) {
                    android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) this.z.b.get(bundleA.getParcelable("state").b);
                    if (fragment != null) {
                        if (ac(2)) {
                            java.util.Objects.toString(fragment);
                            android.util.Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(fragment.toString()));
                        }
                        byVar = new defpackage.by(this.B, bzVar, fragment, bundleA);
                    } else {
                        byVar = new defpackage.by(this.B, bzVar, this.m.c.getClassLoader(), i(), bundleA);
                    }
                    android.support.v4.app.Fragment fragment2 = byVar.a;
                    fragment2.mSavedFragmentState = bundleA;
                    fragment2.mFragmentManager = this;
                    if (ac(2)) {
                        android.util.Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                    }
                    byVar.f(this.m.c.getClassLoader());
                    bzVar.j(byVar);
                    byVar.b = this.l;
                }
            }
            for (android.support.v4.app.Fragment fragment3 : new java.util.ArrayList(this.z.b.values())) {
                if (!bzVar.m(fragment3.mWho)) {
                    if (ac(2)) {
                        android.util.Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                    }
                    this.z.e(fragment3);
                    fragment3.mFragmentManager = this;
                    defpackage.by byVar2 = new defpackage.by(this.B, bzVar, fragment3);
                    byVar2.b = 1;
                    byVar2.e();
                    fragment3.mRemoving = true;
                    byVar2.e();
                }
            }
            java.util.ArrayList<java.lang.String> arrayList2 = fragmentManagerState.b;
            bzVar.a.clear();
            if (arrayList2 != null) {
                for (java.lang.String str3 : arrayList2) {
                    android.support.v4.app.Fragment fragmentB = bzVar.b(str3);
                    if (fragmentB == null) {
                        throw new java.lang.IllegalStateException(defpackage.a.bp(str3, "No instantiated fragment for (", ")"));
                    }
                    if (ac(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bx(fragmentB, str3, "restoreSaveState: added (", "): "));
                    }
                    bzVar.h(fragmentB);
                }
            }
            android.support.v4.app.BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
            if (backStackRecordStateArr != null) {
                this.c = new java.util.ArrayList(backStackRecordStateArr.length);
                int i2 = 0;
                while (true) {
                    android.support.v4.app.BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.c;
                    if (i2 >= backStackRecordStateArr2.length) {
                        break;
                    }
                    android.support.v4.app.BackStackRecordState backStackRecordState = backStackRecordStateArr2[i2];
                    defpackage.w wVar = new defpackage.w(this);
                    backStackRecordState.a(wVar);
                    wVar.c = backStackRecordState.g;
                    int i3 = 0;
                    while (true) {
                        java.util.ArrayList arrayList3 = backStackRecordState.b;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        java.lang.String str4 = (java.lang.String) arrayList3.get(i3);
                        if (str4 != null) {
                            ((defpackage.cb) wVar.e.get(i3)).b = d(str4);
                        }
                        i3++;
                    }
                    wVar.a(1);
                    if (ac(2)) {
                        android.util.Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + wVar.c + "): " + wVar);
                        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cm());
                        wVar.f("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.c.add(wVar);
                    i2++;
                }
            } else {
                this.c = new java.util.ArrayList();
            }
            this.h.set(fragmentManagerState.d);
            java.lang.String str5 = fragmentManagerState.e;
            if (str5 != null) {
                android.support.v4.app.Fragment fragmentD = d(str5);
                this.p = fragmentD;
                A(fragmentD);
            }
            java.util.ArrayList arrayList4 = fragmentManagerState.f;
            if (arrayList4 != null) {
                for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                    this.i.put((java.lang.String) arrayList4.get(i4), (android.support.v4.app.BackStackState) fragmentManagerState.g.get(i4));
                }
            }
            this.u = new java.util.ArrayDeque(fragmentManagerState.h);
        }
    }

    final void T(android.support.v4.app.Fragment fragment, boolean z) {
        android.view.ViewGroup viewGroupAq = aq(fragment);
        if (viewGroupAq == null || !(viewGroupAq instanceof android.support.v4.app.FragmentContainerView)) {
            return;
        }
        ((android.support.v4.app.FragmentContainerView) viewGroupAq).a = !z;
    }

    final void U(android.support.v4.app.Fragment fragment, defpackage.epx epxVar) {
        if (!fragment.equals(d(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(this, fragment, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        fragment.mMaxState = epxVar;
    }

    final void V(android.support.v4.app.Fragment fragment) {
        if (fragment != null && (!fragment.equals(d(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(this, fragment, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        android.support.v4.app.Fragment fragment2 = this.p;
        this.p = fragment;
        A(fragment2);
        A(this.p);
    }

    public final void W(java.lang.RuntimeException runtimeException) {
        android.util.Log.e("FragmentManager", runtimeException.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cm());
        defpackage.bg bgVar = this.m;
        if (bgVar != null) {
            try {
                bgVar.q(printWriter, new java.lang.String[0]);
                throw runtimeException;
            } catch (java.lang.Exception e) {
                android.util.Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            H("  ", null, printWriter, new java.lang.String[0]);
            throw runtimeException;
        } catch (java.lang.Exception e2) {
            android.util.Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void X() {
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.g.f(true);
                if (ac(3)) {
                    android.util.Log.d("FragmentManager", defpackage.a.bl(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = b() > 0 && ae(this.o);
            if (ac(3)) {
                android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.g.f(z);
        }
    }

    public final boolean Y(android.view.MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        boolean z = false;
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null && ak(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.D != null) {
            for (int i = 0; i < this.D.size(); i++) {
                android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) this.D.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.D = arrayList;
        return z;
    }

    public final int a(java.lang.String str, int i, boolean z) {
        if (this.c.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.c.size() - 1;
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            defpackage.w wVar = (defpackage.w) this.c.get(size);
            if ((str != null && str.equals(wVar.m)) || (i >= 0 && i == wVar.c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.c.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i2 = size - 1;
            defpackage.w wVar2 = (defpackage.w) this.c.get(i2);
            if ((str == null || !str.equals(wVar2.m)) && (i < 0 || i != wVar2.c)) {
                break;
            }
            size = i2;
        }
        return size;
    }

    public final boolean aa(android.view.MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean ab(android.view.Menu menu) {
        boolean z = false;
        if (this.l <= 0) {
            return false;
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null && ak(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean ad() {
        android.support.v4.app.Fragment fragment = this.o;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && fragment.getParentFragmentManager().ad();
    }

    public final boolean ae(android.support.v4.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        defpackage.bt btVar = fragment.mFragmentManager;
        return fragment.equals(btVar.p) && ae(btVar.o);
    }

    public final boolean af() {
        return this.w || this.x;
    }

    final boolean ag(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, int i, int i2) {
        int iA = a(str, i, 1 == i2);
        if (iA < 0) {
            return false;
        }
        int size = this.c.size();
        while (true) {
            size--;
            if (size < iA) {
                return true;
            }
            arrayList.add((defpackage.w) this.c.remove(size));
            arrayList2.add(java.lang.Boolean.TRUE);
        }
    }

    public final void ah() {
        an(true);
        ax();
    }

    public final void al(java.lang.String str) {
        J(new bp(this, str, -1, 1), false);
    }

    public final void an(boolean z) {
        defpackage.w wVar;
        av(z);
        if (!this.f && (wVar = this.e) != null) {
            wVar.b = false;
            wVar.b();
            if (ac(3)) {
                android.util.Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execPendingActions for actions " + this.a);
            }
            this.e.i(false, false);
            this.a.add(0, this.e);
            java.util.ArrayList arrayList = this.e.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.app.Fragment fragment = ((defpackage.cb) arrayList.get(i)).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.e = null;
        }
        while (true) {
            java.util.ArrayList arrayList2 = this.L;
            java.util.ArrayList arrayList3 = this.M;
            java.util.ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zG = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zG |= ((defpackage.bo) arrayList4.get(i2)).g(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.m.d.removeCallbacks(this.O);
                    if (!zG) {
                        break;
                    }
                    this.C = true;
                    try {
                        ay(this.L, this.M);
                        at();
                    } catch (java.lang.Throwable th) {
                        at();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    this.a.clear();
                    this.m.d.removeCallbacks(this.O);
                    throw th2;
                }
            }
        }
        X();
        au();
        this.b.i();
    }

    public final boolean ao() {
        an(false);
        av(true);
        android.support.v4.app.Fragment fragment = this.p;
        if (fragment != null && fragment.getChildFragmentManager().ao()) {
            return true;
        }
        boolean zAg = ag(this.L, this.M, null, -1, 0);
        if (zAg) {
            this.C = true;
            try {
                ay(this.L, this.M);
                at();
            } catch (java.lang.Throwable th) {
                at();
                throw th;
            }
        }
        X();
        au();
        this.b.i();
        return zAg;
    }

    final defpackage.ca ap() {
        android.support.v4.app.Fragment fragment = this.o;
        return fragment != null ? fragment.mFragmentManager.ap() : this.P;
    }

    public final int b() {
        return this.c.size() + (this.e != null ? 1 : 0);
    }

    public final android.os.Bundle c() {
        android.support.v4.app.BackStackRecordState[] backStackRecordStateArr;
        java.util.ArrayList arrayList;
        android.os.Bundle bundle = new android.os.Bundle();
        ax();
        I();
        an(true);
        this.w = true;
        this.z.g = true;
        defpackage.bz bzVar = this.b;
        java.util.HashMap map = bzVar.b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (defpackage.by byVar : map.values()) {
            if (byVar != null) {
                android.support.v4.app.Fragment fragment = byVar.a;
                bzVar.a(fragment.mWho, byVar.a());
                arrayList2.add(fragment.mWho);
                if (ac(2)) {
                    android.util.Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        java.util.HashMap map2 = bzVar.c;
        if (!map2.isEmpty()) {
            java.util.ArrayList<android.support.v4.app.Fragment> arrayList3 = bzVar.a;
            synchronized (arrayList3) {
                backStackRecordStateArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(arrayList3.size());
                    for (android.support.v4.app.Fragment fragment2 : arrayList3) {
                        arrayList.add(fragment2.mWho);
                        if (ac(2)) {
                            android.util.Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                backStackRecordStateArr = new android.support.v4.app.BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new android.support.v4.app.BackStackRecordState((defpackage.w) this.c.get(i));
                    if (ac(2)) {
                        android.util.Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            android.support.v4.app.FragmentManagerState fragmentManagerState = new android.support.v4.app.FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.h.get();
            android.support.v4.app.Fragment fragment3 = this.p;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            java.util.ArrayList arrayList4 = fragmentManagerState.f;
            java.util.Map map3 = this.i;
            arrayList4.addAll(map3.keySet());
            fragmentManagerState.g.addAll(map3.values());
            fragmentManagerState.h = new java.util.ArrayList(this.u);
            bundle.putParcelable("state", fragmentManagerState);
            java.util.Map map4 = this.E;
            for (java.lang.String str : map4.keySet()) {
                bundle.putBundle("result_".concat(java.lang.String.valueOf(str)), (android.os.Bundle) map4.get(str));
            }
            for (java.lang.String str2 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(java.lang.String.valueOf(str2)), (android.os.Bundle) map2.get(str2));
            }
        } else if (ac(2)) {
            android.util.Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final android.support.v4.app.Fragment d(java.lang.String str) {
        return this.b.b(str);
    }

    public final android.support.v4.app.Fragment e(int i) {
        defpackage.bz bzVar = this.b;
        java.util.ArrayList arrayList = bzVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (defpackage.by byVar : bzVar.b.values()) {
                    if (byVar != null) {
                        android.support.v4.app.Fragment fragment = byVar.a;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    public final android.support.v4.app.Fragment f(java.lang.String str) {
        defpackage.bz bzVar = this.b;
        java.util.ArrayList arrayList = bzVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (defpackage.by byVar : bzVar.b.values()) {
                    if (byVar != null) {
                        android.support.v4.app.Fragment fragment = byVar.a;
                        if (str.equals(fragment.mTag)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) arrayList.get(size);
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
    }

    public final defpackage.bf i() {
        defpackage.bf bfVar = this.q;
        if (bfVar != null) {
            return bfVar;
        }
        android.support.v4.app.Fragment fragment = this.o;
        return fragment != null ? fragment.mFragmentManager.i() : this.J;
    }

    final defpackage.by j(android.support.v4.app.Fragment fragment) {
        java.lang.String str = fragment.mPreviousWho;
        if (str != null) {
            defpackage.enp.a(fragment, str);
        }
        if (ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "add: ".concat(java.lang.String.valueOf(fragment)));
        }
        defpackage.by byVarK = k(fragment);
        fragment.mFragmentManager = this;
        defpackage.bz bzVar = this.b;
        bzVar.j(byVarK);
        if (!fragment.mDetached) {
            bzVar.h(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (aj(fragment)) {
                this.v = true;
            }
        }
        return byVarK;
    }

    public final defpackage.by k(android.support.v4.app.Fragment fragment) {
        defpackage.bz bzVar = this.b;
        defpackage.by byVarD = bzVar.d(fragment.mWho);
        if (byVarD != null) {
            return byVarD;
        }
        defpackage.by byVar = new defpackage.by(this.B, bzVar, fragment);
        byVar.f(this.m.c.getClassLoader());
        byVar.b = this.l;
        return byVar;
    }

    public final java.util.List l() {
        return this.b.g();
    }

    final java.util.Set m(java.util.ArrayList arrayList, int i, int i2) {
        android.view.ViewGroup viewGroup;
        java.util.HashSet hashSet = new java.util.HashSet();
        while (i < i2) {
            java.util.ArrayList arrayList2 = ((defpackage.w) arrayList.get(i)).e;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                android.support.v4.app.Fragment fragment = ((defpackage.cb) arrayList2.get(i3)).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    defpackage.ca caVarAp = ap();
                    caVarAp.getClass();
                    hashSet.add(defpackage.ca.d(viewGroup, caVarAp));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void n(defpackage.bw bwVar) {
        this.k.add(bwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(defpackage.bg bgVar, defpackage.be beVar, android.support.v4.app.Fragment fragment) {
        defpackage.bv bvVar;
        defpackage.eqg eqgVar;
        if (this.m != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.m = bgVar;
        this.n = beVar;
        this.o = fragment;
        if (fragment != null) {
            n(new defpackage.bl(fragment));
        } else if (bgVar instanceof defpackage.bw) {
            n((defpackage.bw) bgVar);
        }
        if (this.o != null) {
            X();
        }
        if (bgVar instanceof defpackage.ou) {
            defpackage.ou ouVar = (defpackage.ou) bgVar;
            defpackage.bil bilVarR = ouVar.r();
            this.A = bilVarR;
            if (fragment != null) {
                eqgVar = ouVar;
                eqgVar = fragment;
            }
            eqgVar = ouVar;
            bilVarR.x(eqgVar, this.g);
        }
        int i = 0;
        if (fragment != null) {
            defpackage.bv bvVar2 = fragment.mFragmentManager.z;
            java.util.HashMap map = bvVar2.c;
            bvVar = (defpackage.bv) map.get(fragment.mWho);
            if (bvVar == null) {
                bvVar = new defpackage.bv(bvVar2.e);
                map.put(fragment.mWho, bvVar);
            }
            this.z = bvVar;
        } else {
            if (bgVar instanceof defpackage.esa) {
                bvVar = (defpackage.bv) new defpackage.ery(((defpackage.esa) bgVar).getViewModelStore(), defpackage.bv.a).a(defpackage.bv.class);
                this.z = bvVar;
            } else {
                bvVar = new defpackage.bv(false);
                this.z = bvVar;
            }
            fragment = null;
        }
        bvVar.g = af();
        this.b.d = bvVar;
        java.lang.Object obj = this.m;
        if ((obj instanceof defpackage.fbm) && fragment == null) {
            defpackage.fbk savedStateRegistry = ((defpackage.fbm) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new defpackage.bi(this, i));
            android.os.Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                S(bundleA);
            }
        }
        java.lang.Object obj2 = this.m;
        if (obj2 instanceof defpackage.pg) {
            defpackage.pf pfVarFL = ((defpackage.pg) obj2).fL();
            java.lang.String strConcat = fragment != null ? java.lang.String.valueOf(fragment.mWho).concat(":") : "";
            defpackage.pk pkVar = new defpackage.pk();
            defpackage.bm bmVar = new defpackage.bm(this, 0);
            java.lang.String strConcat2 = "FragmentManager:".concat(strConcat);
            this.r = pfVarFL.a(strConcat2.concat("StartActivityForResult"), pkVar, bmVar);
            this.s = pfVarFL.a(strConcat2.concat("StartIntentSenderForResult"), new defpackage.bn(), new defpackage.bm(this, 2));
            this.t = pfVarFL.a(strConcat2.concat("RequestPermissions"), new defpackage.pj(), new defpackage.bm(this, 1));
        }
        java.lang.Object obj3 = this.m;
        if (obj3 instanceof defpackage.duy) {
            ((defpackage.duy) obj3).fM(this.F);
        }
        java.lang.Object obj4 = this.m;
        if (obj4 instanceof defpackage.duz) {
            ((defpackage.duz) obj4).fP(this.G);
        }
        java.lang.Object obj5 = this.m;
        if (obj5 instanceof defpackage.duo) {
            ((defpackage.duo) obj5).fN(this.H);
        }
        java.lang.Object obj6 = this.m;
        if (obj6 instanceof defpackage.dup) {
            ((defpackage.dup) obj6).fO(this.I);
        }
        java.lang.Object obj7 = this.m;
        if ((obj7 instanceof defpackage.eak) && fragment == null) {
            ((defpackage.eak) obj7).s(this.Q);
        }
    }

    final void p(android.support.v4.app.Fragment fragment) {
        if (ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "attach: ".concat(java.lang.String.valueOf(fragment)));
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.b.h(fragment);
            if (ac(2)) {
                java.util.Objects.toString(fragment);
                android.util.Log.v("FragmentManager", "add from attach: ".concat(java.lang.String.valueOf(fragment)));
            }
            if (aj(fragment)) {
                this.v = true;
            }
        }
    }

    final void q() {
        if (ac(3)) {
            defpackage.w wVar = this.e;
            java.util.Objects.toString(wVar);
            android.util.Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(java.lang.String.valueOf(wVar)));
        }
        defpackage.w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.b = false;
            wVar2.b();
            defpackage.w wVar3 = this.e;
            defpackage.ag agVar = new defpackage.ag(this, 16);
            if (wVar3.u == null) {
                wVar3.u = new java.util.ArrayList();
            }
            wVar3.u.add(agVar);
            this.e.i(false, true);
            this.f = true;
            ah();
            this.f = false;
            this.e = null;
        }
    }

    final void r(android.support.v4.app.Fragment fragment) {
        if (ac(2)) {
            java.util.Objects.toString(fragment);
            android.util.Log.v("FragmentManager", "detach: ".concat(java.lang.String.valueOf(fragment)));
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (ac(2)) {
                java.util.Objects.toString(fragment);
                android.util.Log.v("FragmentManager", "remove from detach: ".concat(java.lang.String.valueOf(fragment)));
            }
            this.b.l(fragment);
            if (aj(fragment)) {
                this.v = true;
            }
            az(fragment);
        }
    }

    public final void s() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(4);
    }

    public final void t(android.content.res.Configuration configuration, boolean z) {
        if (z && (this.m instanceof defpackage.duy)) {
            W(new java.lang.IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.t(configuration, true);
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.app.Fragment fragment = this.o;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            defpackage.bg bgVar = this.m;
            if (bgVar != null) {
                sb.append(bgVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[LOOP:1: B:13:0x0041->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a A[LOOP:3: B:62:0x0114->B:64:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final void v() {
        boolean zIsChangingConfigurations;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.pb pbVar;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.lang.AutoCloseable autoCloseable;
        java.util.Iterator it3;
        java.util.Iterator it4;
        this.y = true;
        an(true);
        I();
        defpackage.bg bgVar = this.m;
        if (!(bgVar instanceof defpackage.esa)) {
            android.content.Context context = bgVar.c;
            if (context instanceof android.app.Activity) {
                zIsChangingConfigurations = true ^ ((android.app.Activity) context).isChangingConfigurations();
            } else {
                it3 = this.i.values().iterator();
                while (it3.hasNext()) {
                    it4 = ((android.support.v4.app.BackStackState) it3.next()).a.iterator();
                    while (it4.hasNext()) {
                        this.b.d.c((java.lang.String) it4.next(), false);
                    }
                }
            }
            F(-1);
            obj = this.m;
            if (obj instanceof defpackage.duz) {
                ((defpackage.duz) obj).n(this.G);
            }
            obj2 = this.m;
            if (obj2 instanceof defpackage.duy) {
                ((defpackage.duy) obj2).k(this.F);
            }
            obj3 = this.m;
            if (obj3 instanceof defpackage.duo) {
                ((defpackage.duo) obj3).l(this.H);
            }
            obj4 = this.m;
            if (obj4 instanceof defpackage.dup) {
                ((defpackage.dup) obj4).m(this.I);
            }
            obj5 = this.m;
            if ((obj5 instanceof defpackage.eak) && this.o == null) {
                ((defpackage.eak) obj5).t(this.Q);
            }
            this.m = null;
            this.n = null;
            this.o = null;
            if (this.A != null) {
                defpackage.op opVar = this.g;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = opVar.d;
                it = copyOnWriteArrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    autoCloseable = (java.lang.AutoCloseable) it.next();
                    if (autoCloseable instanceof java.lang.AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
                        defpackage.a.k((java.util.concurrent.ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof android.content.res.TypedArray) {
                        ((android.content.res.TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                        ((android.media.MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof android.media.MediaDrm) {
                        ((android.media.MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof android.drm.DrmManagerClient) {
                        ((android.drm.DrmManagerClient) autoCloseable).release();
                    } else {
                        if (autoCloseable instanceof android.content.ContentProviderClient) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        ((android.content.ContentProviderClient) autoCloseable).release();
                    }
                }
                copyOnWriteArrayList.clear();
                java.util.List list = opVar.b;
                it2 = list.iterator();
                while (it2.hasNext()) {
                    ((defpackage.oo) it2.next()).f();
                }
                list.clear();
                this.A = null;
            }
            pbVar = this.r;
            if (pbVar != null) {
                pbVar.a();
                this.s.a();
                this.t.a();
            }
        }
        zIsChangingConfigurations = this.b.d.f;
        if (zIsChangingConfigurations) {
            it3 = this.i.values().iterator();
            while (it3.hasNext()) {
                it4 = ((android.support.v4.app.BackStackState) it3.next()).a.iterator();
                while (it4.hasNext()) {
                    this.b.d.c((java.lang.String) it4.next(), false);
                }
            }
        }
        F(-1);
        obj = this.m;
        if (obj instanceof defpackage.duz) {
            ((defpackage.duz) obj).n(this.G);
        }
        obj2 = this.m;
        if (obj2 instanceof defpackage.duy) {
            ((defpackage.duy) obj2).k(this.F);
        }
        obj3 = this.m;
        if (obj3 instanceof defpackage.duo) {
            ((defpackage.duo) obj3).l(this.H);
        }
        obj4 = this.m;
        if (obj4 instanceof defpackage.dup) {
            ((defpackage.dup) obj4).m(this.I);
        }
        obj5 = this.m;
        if (obj5 instanceof defpackage.eak) {
            ((defpackage.eak) obj5).t(this.Q);
        }
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.A != null) {
            defpackage.op opVar2 = this.g;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = opVar2.d;
            it = copyOnWriteArrayList2.iterator();
            it.getClass();
            while (it.hasNext()) {
                autoCloseable = (java.lang.AutoCloseable) it.next();
                if (autoCloseable instanceof java.lang.AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
                    defpackage.a.k((java.util.concurrent.ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof android.content.res.TypedArray) {
                    ((android.content.res.TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                    ((android.media.MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof android.media.MediaDrm) {
                    ((android.media.MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof android.drm.DrmManagerClient) {
                    ((android.drm.DrmManagerClient) autoCloseable).release();
                } else {
                    if (autoCloseable instanceof android.content.ContentProviderClient) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    ((android.content.ContentProviderClient) autoCloseable).release();
                }
            }
            copyOnWriteArrayList2.clear();
            java.util.List list2 = opVar2.b;
            it2 = list2.iterator();
            while (it2.hasNext()) {
                ((defpackage.oo) it2.next()).f();
            }
            list2.clear();
            this.A = null;
        }
        pbVar = this.r;
        if (pbVar != null) {
            pbVar.a();
            this.s.a();
            this.t.a();
        }
    }

    final void w(boolean z) {
        if (z && (this.m instanceof defpackage.duz)) {
            W(new java.lang.IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.w(true);
                }
            }
        }
    }

    final void x(boolean z, boolean z2) {
        if (z2 && (this.m instanceof defpackage.duo)) {
            W(new java.lang.IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.x(z, true);
                }
            }
        }
    }

    final void y() {
        for (android.support.v4.app.Fragment fragment : this.b.f()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.y();
            }
        }
    }

    public final void z(android.view.Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (android.support.v4.app.Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }
}
