package androidx.fragment.app;

import Va.M6;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409a implements InterfaceC1412b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18350a;

    /* renamed from: b, reason: collision with root package name */
    public int f18351b;

    /* renamed from: c, reason: collision with root package name */
    public int f18352c;

    /* renamed from: d, reason: collision with root package name */
    public int f18353d;

    /* renamed from: e, reason: collision with root package name */
    public int f18354e;

    /* renamed from: f, reason: collision with root package name */
    public int f18355f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18356g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18357h;

    /* renamed from: i, reason: collision with root package name */
    public String f18358i;

    /* renamed from: j, reason: collision with root package name */
    public int f18359j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public int f18360l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f18361m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18362n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f18363o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18364p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f18365q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18366r;

    /* renamed from: s, reason: collision with root package name */
    public int f18367s;

    public C1409a(e0 e0Var) {
        e0Var.G();
        O o7 = e0Var.f18428v;
        if (o7 != null) {
            o7.f18333b.getClassLoader();
        }
        this.f18350a = new ArrayList();
        this.f18357h = true;
        this.f18364p = false;
        this.f18367s = -1;
        this.f18365q = e0Var;
    }

    @Override // androidx.fragment.app.InterfaceC1412b0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (e0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f18356g) {
            return true;
        }
        this.f18365q.f18411d.add(this);
        return true;
    }

    public final void b(n0 n0Var) {
        this.f18350a.add(n0Var);
        n0Var.f18506d = this.f18351b;
        n0Var.f18507e = this.f18352c;
        n0Var.f18508f = this.f18353d;
        n0Var.f18509g = this.f18354e;
    }

    public final void c(int i5) {
        if (this.f18356g) {
            if (e0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i5);
            }
            ArrayList arrayList = this.f18350a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                n0 n0Var = (n0) arrayList.get(i10);
                F f10 = n0Var.f18504b;
                if (f10 != null) {
                    f10.mBackStackNesting += i5;
                    if (e0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + n0Var.f18504b + " to " + n0Var.f18504b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f18366r) {
            throw new IllegalStateException("commit already called");
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new x0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f18366r = true;
        boolean z10 = this.f18356g;
        e0 e0Var = this.f18365q;
        if (z10) {
            this.f18367s = e0Var.f18417j.getAndIncrement();
        } else {
            this.f18367s = -1;
        }
        e0Var.x(this, z2);
        return this.f18367s;
    }

    public final void e(int i5, F f10, String str, int i10) {
        String str2 = f10.mPreviousWho;
        if (str2 != null) {
            D1.d.c(f10, str2);
        }
        Class<?> cls = f10.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = f10.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(f10);
                sb2.append(": was ");
                throw new IllegalStateException(M6.t(sb2, f10.mTag, " now ", str));
            }
            f10.mTag = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + f10 + " with tag " + str + " to container view with no id");
            }
            int i11 = f10.mFragmentId;
            if (i11 != 0 && i11 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + f10 + ": was " + f10.mFragmentId + " now " + i5);
            }
            f10.mFragmentId = i5;
            f10.mContainerId = i5;
        }
        b(new n0(f10, i10));
        f10.mFragmentManager = this.f18365q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18358i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18367s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18366r);
            if (this.f18355f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18355f));
            }
            if (this.f18351b != 0 || this.f18352c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18351b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18352c));
            }
            if (this.f18353d != 0 || this.f18354e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18353d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18354e));
            }
            if (this.f18359j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18359j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.f18360l != 0 || this.f18361m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18360l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18361m);
            }
        }
        ArrayList arrayList = this.f18350a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n0 n0Var = (n0) arrayList.get(i5);
            switch (n0Var.f18503a) {
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
                    str2 = "cmd=" + n0Var.f18503a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtils.SPACE);
            printWriter.println(n0Var.f18504b);
            if (z2) {
                if (n0Var.f18506d != 0 || n0Var.f18507e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(n0Var.f18506d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(n0Var.f18507e));
                }
                if (n0Var.f18508f != 0 || n0Var.f18509g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(n0Var.f18508f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(n0Var.f18509g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18367s >= 0) {
            sb2.append(" #");
            sb2.append(this.f18367s);
        }
        if (this.f18358i != null) {
            sb2.append(StringUtils.SPACE);
            sb2.append(this.f18358i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
