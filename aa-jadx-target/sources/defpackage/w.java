package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class w extends defpackage.cc implements defpackage.bo {
    public final defpackage.bt a;
    boolean b;
    public int c;
    boolean d;

    public w(defpackage.w wVar) {
        wVar.a.i();
        defpackage.bg bgVar = wVar.a.m;
        if (bgVar != null) {
            bgVar.c.getClassLoader();
        }
        java.util.ArrayList arrayList = wVar.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new defpackage.cb((defpackage.cb) arrayList.get(i)));
        }
        this.f = wVar.f;
        this.g = wVar.g;
        this.h = wVar.h;
        this.i = wVar.i;
        this.j = wVar.j;
        this.k = wVar.k;
        this.l = wVar.l;
        this.m = wVar.m;
        this.p = wVar.p;
        this.q = wVar.q;
        this.n = wVar.n;
        this.o = wVar.o;
        if (wVar.r != null) {
            this.r = new java.util.ArrayList();
            this.r.addAll(wVar.r);
        }
        if (wVar.s != null) {
            this.s = new java.util.ArrayList();
            this.s.addAll(wVar.s);
        }
        this.t = wVar.t;
        this.c = -1;
        this.d = false;
        this.a = wVar.a;
        this.b = wVar.b;
        this.c = wVar.c;
        this.d = wVar.d;
    }

    final void a(int i) {
        if (this.k) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            java.util.ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.cb cbVar = (defpackage.cb) arrayList.get(i2);
                android.support.v4.app.Fragment fragment = cbVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "Bump nesting of " + cbVar.b + " to " + cbVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    final void b() {
        java.util.ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.cb cbVar = (defpackage.cb) arrayList.get(size);
            if (cbVar.c) {
                int i = size - 1;
                if (cbVar.a == 8) {
                    cbVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = cbVar.b.mContainerId;
                    cbVar.a = 2;
                    cbVar.c = false;
                    while (i >= 0) {
                        defpackage.cb cbVar2 = (defpackage.cb) arrayList.get(i);
                        if (cbVar2.c && cbVar2.b.mContainerId == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.cc
    public final void c() {
        p();
        this.a.K(this, false);
    }

    @Override // defpackage.cc
    public final void d() {
        p();
        this.a.K(this, true);
    }

    @Override // defpackage.cc
    public final void e(int i, android.support.v4.app.Fragment fragment, java.lang.String str, int i2) {
        java.lang.String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            defpackage.enp.a(fragment, str2);
        }
        java.lang.Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m(new defpackage.cb(i2, fragment));
        fragment.mFragmentManager = this.a;
    }

    public final void f(java.lang.String str, java.io.PrintWriter printWriter, boolean z) {
        java.lang.String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.j));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.i));
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        java.util.ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.cb cbVar = (defpackage.cb) arrayList.get(i);
            switch (cbVar.a) {
                case defpackage.abnt.b /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + cbVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cbVar.b);
            if (z) {
                if (cbVar.d != 0 || cbVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(cbVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(cbVar.e));
                }
                if (cbVar.f != 0 || cbVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(cbVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(cbVar.g));
                }
            }
        }
    }

    @Override // defpackage.bo
    public final boolean g(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (defpackage.bt.ac(2)) {
            toString();
            android.util.Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.k) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.cc
    public final void h(android.support.v4.app.Fragment fragment, defpackage.epx epxVar) {
        defpackage.bt btVar = fragment.mFragmentManager;
        defpackage.bt btVar2 = this.a;
        if (btVar != btVar2) {
            java.util.Objects.toString(btVar2);
            throw new java.lang.IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(btVar2.toString()));
        }
        if (epxVar == defpackage.epx.b && fragment.mState >= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(epxVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (epxVar == defpackage.epx.a) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(epxVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        m(new defpackage.cb(fragment, epxVar));
    }

    public final void i(boolean z, boolean z2) {
        if (this.b) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (defpackage.bt.ac(2)) {
            toString();
            android.util.Log.v("FragmentManager", "Commit: ".concat(toString()));
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) new cm());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.b = true;
        if (this.k) {
            this.c = this.a.h.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.J(this, z);
        }
    }

    @Override // defpackage.cc
    public final void j(android.support.v4.app.Fragment fragment) {
        defpackage.bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new defpackage.cb(6, fragment));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cc
    public final void k(android.support.v4.app.Fragment fragment) {
        defpackage.bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new defpackage.cb(3, fragment));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cc
    public final void l(android.support.v4.app.Fragment fragment) {
        defpackage.bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new defpackage.cb(8, fragment));
            return;
        }
        throw new java.lang.IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        sb.append("}");
        return sb.toString();
    }

    public w(defpackage.bt btVar) {
        btVar.i();
        defpackage.bg bgVar = btVar.m;
        if (bgVar != null) {
            bgVar.c.getClassLoader();
        }
        this.c = -1;
        this.d = false;
        this.a = btVar;
    }
}
