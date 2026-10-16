package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w extends cc implements bo {
    public final bt a;
    boolean b;
    public int c;
    boolean d;

    public w(w wVar) {
        wVar.a.i();
        bg bgVar = wVar.a.m;
        if (bgVar != null) {
            bgVar.c.getClassLoader();
        }
        ArrayList arrayList = wVar.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new cb((cb) arrayList.get(i)));
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
            this.r = new ArrayList();
            this.r.addAll(wVar.r);
        }
        if (wVar.s != null) {
            this.s = new ArrayList();
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
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cb cbVar = (cb) arrayList.get(i2);
                Fragment fragment = cbVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (bt.ac(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + cbVar.b + " to " + cbVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    final void b() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cb cbVar = (cb) arrayList.get(size);
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
                        cb cbVar2 = (cb) arrayList.get(i);
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
    public final void e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            enj.a(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        m(new cb(i2, fragment));
        fragment.mFragmentManager = this.a;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
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
                printWriter.print(Integer.toHexString(this.j));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cb cbVar = (cb) arrayList.get(i);
            switch (cbVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
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
                    printWriter.print(Integer.toHexString(cbVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cbVar.e));
                }
                if (cbVar.f != 0 || cbVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cbVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cbVar.g));
                }
            }
        }
    }

    @Override // defpackage.bo
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        if (bt.ac(2)) {
            toString();
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.k) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.cc
    public final void h(Fragment fragment, eps epsVar) {
        bt btVar = fragment.mFragmentManager;
        bt btVar2 = this.a;
        if (btVar != btVar2) {
            Objects.toString(btVar2);
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(btVar2.toString()));
        }
        if (epsVar == eps.b && fragment.mState >= 0) {
            throw new IllegalArgumentException(a.bm(epsVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (epsVar == eps.a) {
            throw new IllegalArgumentException(a.bm(epsVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        m(new cb(fragment, epsVar));
    }

    public final void i(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (bt.ac(2)) {
            toString();
            Log.v("FragmentManager", "Commit: ".concat(toString()));
            PrintWriter printWriter = new PrintWriter(new cm());
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
    public final void j(Fragment fragment) {
        bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new cb(6, fragment));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cc
    public final void k(Fragment fragment) {
        bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new cb(3, fragment));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cc
    public final void l(Fragment fragment) {
        bt btVar = fragment.mFragmentManager;
        if (btVar == null || btVar == this.a) {
            m(new cb(8, fragment));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
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

    public w(bt btVar) {
        btVar.i();
        bg bgVar = btVar.m;
        if (bgVar != null) {
            bgVar.c.getClassLoader();
        }
        this.c = -1;
        this.d = false;
        this.a = btVar;
    }
}
