package android.support.v4.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ch {

    /* renamed from: a, reason: collision with root package name */
    private final az f255a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f256b;

    /* renamed from: e, reason: collision with root package name */
    final ArrayList f257e;

    /* renamed from: f, reason: collision with root package name */
    int f258f;

    /* renamed from: g, reason: collision with root package name */
    int f259g;

    /* renamed from: h, reason: collision with root package name */
    int f260h;

    /* renamed from: i, reason: collision with root package name */
    int f261i;

    /* renamed from: j, reason: collision with root package name */
    int f262j;

    /* renamed from: k, reason: collision with root package name */
    boolean f263k;

    /* renamed from: l, reason: collision with root package name */
    boolean f264l;
    String m;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList r;
    ArrayList s;
    boolean t;
    ArrayList u;

    @Deprecated
    public ch() {
        this.f257e = new ArrayList();
        this.f264l = true;
        this.t = false;
        this.f255a = null;
        this.f256b = null;
    }

    private final ar b(Class cls, Bundle bundle) {
        az azVar = this.f255a;
        if (azVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f256b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        ar arVarA = azVar.a(classLoader, cls.getName());
        if (bundle != null) {
            arVarA.setArguments(bundle);
        }
        return arVarA;
    }

    public final void A() {
        this.t = true;
    }

    public final void B() {
        this.f262j = 4099;
    }

    public final void C(int i2, Class cls, Bundle bundle, String str) {
        r(i2, b(cls, bundle), str);
    }

    public final void D(ViewGroup viewGroup, ar arVar, String str) {
        arVar.mContainer = viewGroup;
        arVar.mInDynamicContainer = true;
        r(viewGroup.getId(), arVar, str);
    }

    public final void E(Class cls, Bundle bundle, String str) {
        s(b(cls, bundle), str);
    }

    public final void F(int i2, ar arVar) {
        x(i2, arVar, null);
    }

    public final void G(int i2, Class cls, Bundle bundle, String str) {
        x(i2, b(cls, bundle), str);
    }

    public abstract int a();

    public abstract void f();

    public abstract void g();

    void h(int i2, ar arVar, String str, int i3) {
        throw null;
    }

    public abstract void l();

    public void m(ar arVar) {
        throw null;
    }

    public void n(ar arVar) {
        throw null;
    }

    public void o(ar arVar) {
        throw null;
    }

    final void p(cg cgVar) {
        this.f257e.add(cgVar);
        cgVar.f249d = this.f258f;
        cgVar.f250e = this.f259g;
        cgVar.f251f = this.f260h;
        cgVar.f252g = this.f261i;
    }

    public final void q(int i2, ar arVar) {
        h(i2, arVar, null, 1);
    }

    public final void r(int i2, ar arVar, String str) {
        h(i2, arVar, str, 1);
    }

    public final void s(ar arVar, String str) {
        h(0, arVar, str, 1);
    }

    public final void t(View view, String str) {
        cq cqVar = ci.f265a;
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.r == null) {
            this.r = new ArrayList();
            this.s = new ArrayList();
        } else {
            if (this.s.contains(str)) {
                throw new IllegalArgumentException(k.g(str, "A shared element with the target name '", "' has already been added to the transaction."));
            }
            if (this.r.contains(transitionName)) {
                throw new IllegalArgumentException(k.g(transitionName, "A shared element with the source name '", "' has already been added to the transaction."));
            }
        }
        this.r.add(transitionName);
        this.s.add(str);
    }

    public final void u(String str) {
        if (!this.f264l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f263k = true;
        this.m = str;
    }

    public final void v(ar arVar) {
        p(new cg(7, arVar));
    }

    public final void w() {
        if (this.f263k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f264l = false;
    }

    public final void x(int i2, ar arVar, String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        h(i2, arVar, str, 2);
    }

    public final void y(int i2, int i3) {
        z(i2, i3, 0, 0);
    }

    public final void z(int i2, int i3, int i4, int i5) {
        this.f258f = i2;
        this.f259g = i3;
        this.f260h = i4;
        this.f261i = i5;
    }

    ch(az azVar, ClassLoader classLoader) {
        this.f257e = new ArrayList();
        this.f264l = true;
        this.t = false;
        this.f255a = azVar;
        this.f256b = classLoader;
    }
}
