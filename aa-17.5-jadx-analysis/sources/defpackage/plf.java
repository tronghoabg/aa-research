package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class plf implements plg {
    public static volatile pkx a;
    private static final yob c = yob.c("com/google/android/apps/gmm/shared/cache/ObjectPool");
    protected int b;
    private final List d;
    private final pkx e;
    private final vky f;
    private boolean g;
    private final ple h;
    private final pku i;

    public plf(int i, pkx pkxVar, ple pleVar, String str) {
        this.d = new ArrayList();
        this.g = false;
        this.b = i;
        this.h = pleVar;
        if (pkxVar != null) {
            this.e = pkxVar;
        } else {
            this.e = a;
        }
        if (str.isEmpty()) {
            this.f = vky.d(null, pleVar);
        } else {
            this.f = vky.a(vky.a(vky.d(null, pleVar), new vky(": ")), new vky(str));
        }
        erb erbVar = pkxVar == null ? null : pkxVar.b;
        if (erbVar == null || !pleVar.n) {
            this.i = null;
        } else {
            this.i = new pku(erbVar, pmw.a, pmw.b);
        }
    }

    @Override // defpackage.plg
    public final synchronized String a() {
        return "size: " + this.d.size();
    }

    @ResultIgnorabilityUnspecified
    public final synchronized Object b() {
        List list;
        int size;
        list = this.d;
        size = list.size();
        pku pkuVar = this.i;
        if (pkuVar != null && this.h.n) {
            if (size != 0) {
                pkuVar.a();
            } else {
                pkuVar.b();
            }
        }
        return size == 0 ? c() : list.remove(size - 1);
    }

    protected abstract Object c();

    public final synchronized void d() {
        f(BitmapDescriptorFactory.HUE_RED);
    }

    protected final synchronized void e(List list, Object obj) {
        pkx pkxVar;
        if (!this.g && (pkxVar = this.e) != null) {
            pkxVar.c(this, this.f);
            this.g = true;
        }
        list.add(obj);
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        h(this.d, f);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void g(Object obj) {
        List list = this.d;
        if (list.size() >= this.b) {
            ((ynz) ((ynz) c.d()).ai(6771)).D("Pool is full (max size: %d); dispose %s", this.b, obj);
        } else {
            e(list, obj);
        }
    }

    protected final synchronized void h(List list, float f) {
        int size = list.size();
        int i = (int) (size * f);
        if (size > i) {
            ((ynz) ((ynz) c.f()).ai(6772)).S("Trimming %s's current size %d to %g, or %d", this.f, Integer.valueOf(size), Float.valueOf(f), Integer.valueOf(i));
        }
        while (list.size() > i) {
            list.remove(list.size() - 1);
        }
        if (this.g && this.d.isEmpty()) {
            pkx pkxVar = this.e;
            if (pkxVar != null) {
                pkxVar.e(this);
            }
            this.g = false;
        }
    }

    public final synchronized String toString() {
        return "ObjectPool[name: " + this.f.a + "; " + this.d.size() + "/" + this.b + "]";
    }

    public plf(int i, String str) {
        this(i, null, ple.OTHER, str);
    }
}
