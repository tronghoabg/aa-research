package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class tyt {
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/TypedTextureStorage");
    private static final tys c = new tys(usf.a, null);
    private final upr d;
    private final zgt i;
    private final gjv k;
    private final erb l;
    private final AtomicInteger e = new AtomicInteger(0);
    public final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final HashMap g = new HashMap();
    private int h = 0;
    private zgr j = null;

    public tyt(gjv gjvVar, upr uprVar, erb erbVar, zgt zgtVar) {
        this.k = gjvVar;
        this.d = uprVar;
        this.l = erbVar;
        this.i = zgtVar;
    }

    private final synchronized tys k(usf usfVar) {
        tys tysVar = (tys) this.g.get(usfVar);
        if (tysVar != null) {
            return tysVar;
        }
        return c;
    }

    @ResultIgnorabilityUnspecified
    final synchronized usf a(usg usgVar, usq usqVar) {
        usf usfVar;
        String str = "ClientProvidedTexture_" + this.e.getAndIncrement();
        usf usfVar2 = usf.a;
        usfVar = new usf(str, usgVar);
        tys tysVar = new tys(usfVar, this.k);
        tysVar.f(usqVar);
        this.g.put(usfVar, tysVar);
        g();
        return usfVar;
    }

    @ResultIgnorabilityUnspecified
    final synchronized usf b(usf usfVar, usq usqVar) {
        tys tysVarK = k(usfVar);
        if (tysVarK != c) {
            tysVarK.d();
            return usfVar;
        }
        ((ynz) ((ynz) b.h()).ai((char) 9215)).y("Attempted to add ref for an unreferenced texture: %s.", usfVar);
        usf usfVar2 = new usf("ClientProvidedTexture_" + this.e.getAndIncrement(), usfVar.c);
        tys tysVar = new tys(usfVar, this.k);
        tysVar.f(usqVar);
        this.g.put(usfVar, tysVar);
        g();
        return usfVar2;
    }

    final synchronized uwc c(usf usfVar) {
        return k(usfVar).b();
    }

    public final synchronized void d() {
        this.f.set(true);
        zgr zgrVar = this.j;
        if (zgrVar != null && !zgrVar.isCancelled()) {
            this.j.cancel(false);
            AtomicBoolean atomicBoolean = this.a;
            if (atomicBoolean.compareAndSet(false, true)) {
                h();
                atomicBoolean.set(false);
            }
        }
    }

    final synchronized void e(usf usfVar) {
        if (k(usfVar) == c) {
            final gjv gjvVar = this.k;
            tys tysVar = new tys(usfVar, gjvVar);
            this.g.put(usfVar, tysVar);
            g();
            upr uprVar = this.d;
            gjvVar.getClass();
            tysVar.c(uprVar, new tyr() { // from class: tyq
                @Override // defpackage.tyr
                public final void a() {
                    gjvVar.l();
                }
            });
        }
    }

    final synchronized void f(usf usfVar, tyr tyrVar) {
        tys tysVarK = k(usfVar);
        if (tysVarK == c) {
            tys tysVar = new tys(usfVar, this.k);
            this.g.put(usfVar, tysVar);
            g();
            tysVarK = tysVar;
        } else {
            tysVarK.d();
        }
        tysVarK.c(this.d, tyrVar);
    }

    final void g() {
        zgt zgtVar;
        if (this.f.get() || !this.a.compareAndSet(false, true) || (zgtVar = this.i) == null) {
            return;
        }
        this.j = zgtVar.schedule(new tvv(this, 19), 1L, TimeUnit.MINUTES);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        yfq yfqVarO;
        uuz uuzVar;
        synchronized (this) {
            yfqVarO = yfq.o(this.g.values());
        }
        int size = yfqVarO.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tys tysVar = (tys) yfqVarO.get(i2);
            if (tysVar != null && !tysVar.d) {
                synchronized (tysVar) {
                    uwc uwcVarB = tysVar.b();
                    if (uwcVarB != null && (uuzVar = uwcVarB.c) != null) {
                        i += uuzVar.e * uuzVar.f * 4;
                    }
                }
            }
        }
        if (i > this.h) {
            this.h = i;
            this.l.V(qbo.am);
        }
    }

    final synchronized void i(usf usfVar) {
        tys tysVarK = k(usfVar);
        if (tysVarK != c) {
            tysVarK.e(this.d, usfVar.b);
        }
    }

    @ResultIgnorabilityUnspecified
    final synchronized boolean j(usf usfVar) {
        tys tysVarK = k(usfVar);
        if (tysVarK == c) {
            ((ynz) ((ynz) b.h()).ai((char) 9214)).u("Attempted to release an unreferenced texture.");
            return true;
        }
        if (tysVarK.d) {
            ((ynz) tys.a.a(uys.a).ai((char) 9213)).u("Attempted to release to a destroyed TextureNode");
        }
        if (tysVarK.c.decrementAndGet() != 0) {
            return false;
        }
        tysVarK.d = true;
        this.g.remove(usfVar);
        return true;
    }
}
