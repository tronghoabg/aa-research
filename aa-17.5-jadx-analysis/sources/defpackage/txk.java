package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class txk implements tyz {
    private final int a;
    private final List b;
    protected final ukf c;
    public final tyh d;
    public final int e;
    boolean f;
    private final AtomicReference g;
    private boolean h;

    public txk(tyh tyhVar, ukf ukfVar, int i, ygr ygrVar) {
        this.f = false;
        this.b = new ArrayList();
        AtomicReference atomicReference = new AtomicReference(yly.a);
        this.g = atomicReference;
        this.d = tyhVar;
        this.c = ukfVar;
        this.e = i;
        this.a = Objects.hash(Integer.valueOf(tyhVar.e), Integer.valueOf(i));
        atomicReference.set(ygrVar);
    }

    private static void i(uke ukeVar, ygp ygpVar) {
        if (!ukeVar.i.a()) {
            ygpVar.c(ukeVar.i);
        }
        if (!ukeVar.j.a()) {
            ygpVar.c(ukeVar.j);
        }
        if (ukeVar.k.a()) {
            return;
        }
        ygpVar.c(ukeVar.k);
    }

    private final synchronized boolean j(Runnable runnable) {
        vaq.d();
        if (this.f) {
            return true;
        }
        if (runnable != null) {
            this.b.add(runnable);
        }
        return false;
    }

    private final boolean k(Runnable runnable) {
        vaq.d();
        synchronized (this) {
            if (this.f) {
                return true;
            }
            if (d() == null) {
                return j(runnable);
            }
            if (!this.h) {
                return j(runnable);
            }
            synchronized (this) {
                this.f = true;
            }
            return true;
        }
    }

    @Override // defpackage.tqo
    public int a() {
        return this.e;
    }

    @Override // defpackage.tqo
    public final abcy b() {
        return null;
    }

    @Override // defpackage.tqo
    public final void c(Runnable runnable) {
        if (k(runnable)) {
            runnable.run();
        }
    }

    public ukf d() {
        synchronized (this) {
            ukf ukfVar = this.c;
            if (ukfVar != ukf.a) {
                return ukfVar;
            }
            int i = this.e;
            return i != -1 ? this.d.f(i) : ukf.a;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof txk) {
            txk txkVar = (txk) obj;
            tyh tyhVar = this.d;
            if (tyhVar.e == txkVar.d.e && this.e == txkVar.e) {
                return true;
            }
        }
        return false;
    }

    final ygr f() {
        ygp ygpVar = new ygp();
        ukf ukfVarD = d();
        for (int i = 0; i < ukfVarD.b(); i++) {
            ujf ujfVar = ukfVarD.c[dlz.j(i, 0, r3.length - 1)];
            for (uke ukeVar : ujfVar.o) {
                i(ukeVar, ygpVar);
            }
            for (uke ukeVar2 : ujfVar.n) {
                i(ukeVar2, ygpVar);
            }
            usf usfVar = ujfVar.J;
            if (!usfVar.a()) {
                ygpVar.c(usfVar);
            }
        }
        return ygpVar.g();
    }

    final ygr g(ygr ygrVar) {
        return (ygr) this.g.getAndSet(ygrVar);
    }

    public final void h(boolean z) {
        this.h = z;
        synchronized (this) {
            if (k(null)) {
                this.f = true;
                List list = this.b;
                yfq yfqVarO = yfq.o(list);
                list.clear();
                int size = yfqVarO.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) yfqVarO.get(i)).run();
                }
            }
        }
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.tyz
    public final boolean l(tqo tqoVar, boolean z) {
        for (int i = 0; i < 22; i++) {
            if (!(tqoVar instanceof txk)) {
                return false;
            }
            ujf ujfVarG = d().g(i);
            ujf ujfVarG2 = ((txk) tqoVar).d().g(i);
            if (ujfVarG.F != ujfVarG2.F || uqw.x(ujfVarG.H, 1) != uqw.x(ujfVarG2.H, 1)) {
                return false;
            }
            uke[] ukeVarArr = z ? ujfVarG.n : ujfVarG.o;
            uke[] ukeVarArr2 = z ? ujfVarG2.n : ujfVarG2.o;
            if (ukeVarArr.length != ukeVarArr2.length) {
                return false;
            }
            for (int i2 = 0; i2 < ukeVarArr.length; i2++) {
                uke ukeVar = ukeVarArr[i2];
                uke ukeVar2 = ukeVarArr2[i2];
                if (ukeVar.d != BitmapDescriptorFactory.HUE_RED && ukeVar2.d != BitmapDescriptorFactory.HUE_RED && (!ukeVar.i.equals(ukeVar2.i) || !ukeVar.j.equals(ukeVar2.j) || !ukeVar.k.equals(ukeVar2.k) || ukeVar.f != ukeVar2.f || ukeVar.g != ukeVar2.g)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void e() {
    }

    public txk(tyh tyhVar, ukf ukfVar, int i) {
        this(tyhVar, ukfVar, i, yly.a);
    }
}
