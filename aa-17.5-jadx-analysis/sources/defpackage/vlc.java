package defpackage;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class vlc implements vlb {
    private final aezk a;
    private final vll b;
    private final aezk c;
    private final aezk d;
    private final aezk e;
    private final aezk f;
    private final aezk g;
    private final aezk h;
    private final aezk i;
    private final abos j;

    public vlc(aezk aezkVar, vll vllVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, aezk aezkVar5, aezk aezkVar6, aezk aezkVar7, aezk aezkVar8, xxh xxhVar, abos abosVar) {
        this.a = aezkVar;
        this.b = vllVar;
        this.c = aezkVar2;
        this.d = aezkVar3;
        this.e = aezkVar4;
        this.f = aezkVar5;
        this.g = aezkVar6;
        this.h = aezkVar7;
        this.i = aezkVar8;
        this.j = abosVar;
        if (((Boolean) xxhVar.d(false)).booleanValue()) {
            return;
        }
        ((ynz) ((ynz) vlj.a.e()).ai((char) 9751)).u("Primes instant initialization");
        try {
            AtomicReference atomicReference = xts.a;
            Iterator it = ((ackv) aezkVar2).a().iterator();
            while (it.hasNext()) {
                ((vsa) it.next()).k();
            }
        } catch (RuntimeException e) {
            yob yobVar = vlj.a;
            ((ynz) ((ynz) ((ynz) yobVar.h()).p(e)).ai((char) 9752)).u("Primes failed to initialize");
            vll vllVar2 = this.b;
            if (vllVar2.a) {
                return;
            }
            vllVar2.a = true;
            ((ynz) ((ynz) yobVar.e()).ai((char) 9759)).u("Shutdown ...");
        }
    }

    @Override // defpackage.vlb
    public final vxb a() {
        return ((vww) this.h).a().b();
    }

    @Override // defpackage.vlb
    public final xyc b() {
        return new vdv(this.a, 5);
    }

    @Override // defpackage.vlb
    public final Thread.UncaughtExceptionHandler c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return ((vta) this.e.a()).l(uncaughtExceptionHandler);
    }

    @Override // defpackage.vlb
    public final void d() {
        abos abosVar = this.j;
        if (((AtomicBoolean) abosVar.b).getAndSet(true)) {
            return;
        }
        if (!((xxh) abosVar.a).f()) {
            xxh xxhVar = (xxh) abosVar.c;
            if (xxhVar.f()) {
                ((vta) ((aezk) xxhVar.b()).a()).m();
            }
        }
        xxh xxhVar2 = (xxh) abosVar.d;
        if (xxhVar2.f()) {
            ((vvf) ((aezk) xxhVar2.b()).a()).a();
        }
    }

    @Override // defpackage.vlb
    public final void e(vvu vvuVar) {
        ((vwc) this.g).a().a(vvuVar);
    }

    @Override // defpackage.vlb
    public final void f() {
        ((vta) this.e.a()).n();
    }

    @Override // defpackage.vlb
    public final void g(vky vkyVar) {
        ((vww) this.h).a().c(vkyVar);
    }

    @Override // defpackage.vlb
    public final void h() {
        ((vvf) this.f.a()).a();
    }

    @Override // defpackage.vlb
    public final boolean i() {
        return ((vku) this.d).a().c();
    }

    @Override // defpackage.vlb
    public final void j(vky vkyVar, long j, long j2) {
        ((vwx) this.i).a().a(vkyVar, j, j2);
    }

    @Override // defpackage.vlb
    public final void k(vky vkyVar, vky vkyVar2, int i) {
        ((vww) this.h).a().d(vkyVar, vkyVar2, i);
    }

    @Override // defpackage.vlb
    public final void l(vxb vxbVar, vky vkyVar) {
        ((vww) this.h).a().e(vxbVar, vkyVar);
    }
}
