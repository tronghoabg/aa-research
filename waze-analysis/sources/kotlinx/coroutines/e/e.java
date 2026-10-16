package kotlinx.coroutines.e;

import kotlinx.coroutines.cn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class e implements cn {

    /* renamed from: a, reason: collision with root package name */
    public final long f51893a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f51894b = h.e.b.h(null);

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.d f51895c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.b f51896d;

    public e(long j2, e eVar, int i2) {
        this.f51895c = h.e.b.h(eVar);
        this.f51893a = j2;
        this.f51896d = h.e.b.f(i2 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b() {
        return this.f51894b.b();
    }

    public abstract int a();

    public abstract void l(int i2, h.c.j jVar);

    public final e n() {
        Object objB = b();
        if (objB == d.f51892a) {
            return null;
        }
        return (e) objB;
    }

    public final e o() {
        return (e) this.f51895c.b();
    }

    public final void p() {
        this.f51895c.c(null);
    }

    public final void q() {
        Object objB;
        e eVarN;
        int i2 = kotlinx.coroutines.ai.f51347a;
        if (r()) {
            return;
        }
        while (true) {
            e eVarO = o();
            while (eVarO != null && eVarO.w()) {
                eVarO = (e) eVarO.f51895c.b();
            }
            e eVarN2 = n();
            h.g.b.x.c(eVarN2);
            while (eVarN2.w() && (eVarN = eVarN2.n()) != null) {
                eVarN2 = eVarN;
            }
            kotlinx.a.d dVar = eVarN2.f51895c;
            do {
                objB = dVar.b();
            } while (!dVar.e(objB, ((e) objB) == null ? null : eVarO));
            if (eVarO != null) {
                eVarO.f51894b.d(eVarN2);
            }
            if (!eVarN2.w() || eVarN2.r()) {
                if (eVarO == null || !eVarO.w()) {
                    return;
                }
            }
        }
    }

    public final boolean r() {
        return n() == null;
    }

    public final boolean s() {
        return this.f51894b.e(null, d.f51892a);
    }

    public final boolean t(e eVar) {
        return this.f51894b.e(null, eVar);
    }

    public final void u() {
        if (this.f51896d.e() == a()) {
            q();
        }
    }

    public final boolean v() {
        return this.f51896d.h() == a() && !r();
    }

    public final boolean w() {
        return this.f51896d.d() == a() && !r();
    }

    public final boolean x() {
        kotlinx.a.b bVar;
        int iD;
        do {
            bVar = this.f51896d;
            iD = bVar.d();
            if (iD == a() && !r()) {
                return false;
            }
        } while (!bVar.g(iD, 65536 + iD));
        return true;
    }
}
