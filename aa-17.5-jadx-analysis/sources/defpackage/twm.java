package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class twm implements uvl {
    public static final int[] a = {0};
    public final float b;
    public final ArrayList c;
    public boolean d;
    public final Map e;
    public Runnable f;
    public final Semaphore g;
    public final twl h;
    public final twp i;
    public final Executor j;
    public final uqi k;
    public final uvg l;
    public final usy m;
    public final adut n;
    public final adut o;
    private final usy p;

    public twm(usy usyVar, float f, uvg uvgVar, twp twpVar, Executor executor, Executor executor2, uqi uqiVar) {
        usy usyVar2 = new usy(usyVar);
        this.c = new ArrayList();
        this.d = false;
        this.e = new HashMap();
        this.n = new adut(null, null);
        this.o = new adut(null, null);
        this.g = new Semaphore(1);
        this.b = f;
        this.p = usyVar;
        this.m = usyVar2;
        this.l = uvgVar;
        this.i = twpVar;
        tvv tvvVar = new tvv(this, 10);
        this.f = tvvVar;
        this.j = executor2;
        this.k = uqiVar;
        uvgVar.e(tvvVar);
        this.h = new twl(executor);
    }

    public static umi a(uma umaVar, tqd tqdVar, umk umkVar, float f) {
        umi umiVar;
        if (umaVar.k && (umiVar = umaVar.x) != null && ((tqdVar != tqd.a || umiVar.b) && (tqdVar != tqd.b || umiVar.c))) {
            if (umaVar instanceof umb) {
                too tooVar = ((umb) umaVar).e;
            }
            if (umiVar.d.a(umkVar, f)) {
                return umiVar;
            }
        }
        return null;
    }

    @Override // defpackage.uvl
    public final void b() {
        boolean z = false;
        while (true) {
            try {
                this.g.acquire();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.uvl
    public final void c() {
        synchronized (this) {
            this.d = true;
        }
    }

    public final synchronized void d() {
        usy usyVar = this.p;
        if (usyVar != null) {
            adut adutVar = this.o;
            adutVar.c = usyVar.o();
            adutVar.a = usyVar.k();
            adutVar.b = usyVar.j();
        }
    }

    @Override // defpackage.uvl
    public final void e() {
        this.g.release();
    }
}
