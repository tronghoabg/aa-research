package android.support.v4.app;

import android.util.Log;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class a extends ch implements bm, br {

    /* renamed from: a, reason: collision with root package name */
    final bv f91a;

    /* renamed from: b, reason: collision with root package name */
    boolean f92b;

    /* renamed from: c, reason: collision with root package name */
    int f93c;

    /* renamed from: d, reason: collision with root package name */
    boolean f94d;

    /* JADX WARN: Illegal instructions before constructor call */
    a(a aVar) {
        az azVarO = aVar.f91a.o();
        bv bvVar = aVar.f91a;
        super(azVarO, bvVar.p() != null ? bvVar.p().i().getClassLoader() : null);
        ArrayList arrayList = aVar.f257e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f257e.add(new cg((cg) arrayList.get(i2)));
        }
        this.f258f = aVar.f258f;
        this.f259g = aVar.f259g;
        this.f260h = aVar.f260h;
        this.f261i = aVar.f261i;
        this.f262j = aVar.f262j;
        this.f263k = aVar.f263k;
        this.f264l = aVar.f264l;
        this.m = aVar.m;
        this.p = aVar.p;
        this.q = aVar.q;
        this.n = aVar.n;
        this.o = aVar.o;
        if (aVar.r != null) {
            this.r = new ArrayList();
            this.r.addAll(aVar.r);
        }
        if (aVar.s != null) {
            this.s = new ArrayList();
            this.s.addAll(aVar.s);
        }
        this.t = aVar.t;
        this.f93c = -1;
        this.f94d = false;
        this.f91a = aVar.f91a;
        this.f92b = aVar.f92b;
        this.f93c = aVar.f93c;
        this.f94d = aVar.f94d;
    }

    @Override // android.support.v4.app.ch
    public final int a() {
        return b(false, true);
    }

    final int b(boolean z, boolean z2) {
        if (this.f92b) {
            throw new IllegalStateException("commit already called");
        }
        if (bv.aM(2)) {
            toString();
            Log.v("FragmentManager", "Commit: ".concat(toString()));
            PrintWriter printWriter = new PrintWriter(new cs());
            i("  ", printWriter);
            printWriter.close();
        }
        this.f92b = true;
        if (this.f263k) {
            this.f93c = this.f91a.a();
        } else {
            this.f93c = -1;
        }
        if (z2) {
            this.f91a.af(this, z);
        }
        return this.f93c;
    }

    @Override // android.support.v4.app.bm
    public final int c() {
        return this.f93c;
    }

    final void d(int i2) {
        if (this.f263k) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f257e;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                cg cgVar = (cg) arrayList.get(i3);
                ar arVar = cgVar.f247b;
                if (arVar != null) {
                    arVar.mBackStackNesting += i2;
                    if (bv.aM(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + cgVar.f247b + " to " + cgVar.f247b.mBackStackNesting);
                    }
                }
            }
        }
    }

    final void e() {
        ArrayList arrayList = this.f257e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cg cgVar = (cg) arrayList.get(size);
            if (cgVar.f248c) {
                int i2 = size - 1;
                if (cgVar.f246a == 8) {
                    cgVar.f248c = false;
                    arrayList.remove(i2);
                    size = i2;
                } else {
                    int i3 = cgVar.f247b.mContainerId;
                    cgVar.f246a = 2;
                    cgVar.f248c = false;
                    while (i2 >= 0) {
                        cg cgVar2 = (cg) arrayList.get(i2);
                        if (cgVar2.f248c && cgVar2.f247b.mContainerId == i3) {
                            arrayList.remove(i2);
                            size--;
                        }
                        i2--;
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.ch
    public final void f() {
        w();
        this.f91a.ag(this, false);
    }

    @Override // android.support.v4.app.ch
    public final void g() {
        w();
        this.f91a.ag(this, true);
    }

    @Override // android.support.v4.app.ch
    final void h(int i2, ar arVar, String str, int i3) {
        String str2 = arVar.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(arVar, str2);
        }
        Class<?> cls = arVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = arVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + arVar + ": was " + arVar.mTag + " now " + str);
            }
            arVar.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + arVar + " with tag " + str + " to container view with no id");
            }
            int i4 = arVar.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + arVar + ": was " + arVar.mFragmentId + " now " + i2);
            }
            arVar.mFragmentId = i2;
            arVar.mContainerId = i2;
        }
        p(new cg(i3, arVar));
        arVar.mFragmentManager = this.f91a;
    }

    public final void i(String str, PrintWriter printWriter) {
        j(str, printWriter, true);
    }

    public final void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f93c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f92b);
            if (this.f262j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f262j));
            }
            if (this.f258f != 0 || this.f259g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f258f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f259g));
            }
            if (this.f260h != 0 || this.f261i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f260h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f261i));
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
        ArrayList arrayList = this.f257e;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cg cgVar = (cg) arrayList.get(i2);
            switch (cgVar.f246a) {
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
                    str2 = "cmd=" + cgVar.f246a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cgVar.f247b);
            if (z) {
                if (cgVar.f249d != 0 || cgVar.f250e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cgVar.f249d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cgVar.f250e));
                }
                if (cgVar.f251f != 0 || cgVar.f252g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cgVar.f251f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cgVar.f252g));
                }
            }
        }
    }

    @Override // android.support.v4.app.br
    public final boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (bv.aM(2)) {
            toString();
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f263k) {
            return true;
        }
        this.f91a.f195a.add(this);
        return true;
    }

    @Override // android.support.v4.app.ch
    public final void l() {
        b(true, true);
    }

    @Override // android.support.v4.app.ch
    public final void m(ar arVar) {
        bv bvVar = arVar.mFragmentManager;
        if (bvVar == null || bvVar == this.f91a) {
            p(new cg(6, arVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + arVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // android.support.v4.app.ch
    public final void n(ar arVar) {
        bv bvVar = arVar.mFragmentManager;
        if (bvVar == null || bvVar == this.f91a) {
            p(new cg(3, arVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + arVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // android.support.v4.app.ch
    public final void o(ar arVar) {
        bv bvVar;
        if (arVar == null || (bvVar = arVar.mFragmentManager) == null || bvVar == this.f91a) {
            p(new cg(8, arVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + arVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f93c >= 0) {
            sb.append(" #");
            sb.append(this.f93c);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        sb.append("}");
        return sb.toString();
    }

    a(bv bvVar) {
        super(bvVar.o(), bvVar.p() != null ? bvVar.p().i().getClassLoader() : null);
        this.f93c = -1;
        this.f94d = false;
        this.f91a = bvVar;
    }
}
