package defpackage;

import java.io.EOFException;
import java.util.List;

/* loaded from: classes3.dex */
final class aeax extends aduh implements aebn {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final ajmy c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final aean g;
    public final aebq h;
    public final aebe i;
    public boolean u;
    public final aeec v;
    public aebo w;
    public int x;
    final /* synthetic */ aeay y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeax(aeay aeayVar, int i, adzv adzvVar, Object obj, aean aeanVar, aebq aebqVar, aebe aebeVar, int i2) {
        super(i, adzvVar, aeayVar.t);
        this.y = aeayVar;
        this.c = new ajmy();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = obj;
        this.g = aeanVar;
        this.h = aebqVar;
        this.i = aebeVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        int i3 = aeeb.a;
        this.v = aeea.a;
    }

    @Override // defpackage.adwj
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.f(this.x, i4);
        }
    }

    @Override // defpackage.adwj
    public final void b(Throwable th) throws EOFException {
        q(adnq.c(th), true, new admc());
    }

    @Override // defpackage.aduh
    protected final void c(adnq adnqVar, boolean z2, admc admcVar) throws EOFException {
        q(adnqVar, false, admcVar);
    }

    @Override // defpackage.adrj
    protected final void d() {
        super.d();
        aeac aeacVar = this.l;
        aeacVar.b++;
        aeacVar.a.a();
    }

    @Override // defpackage.adrm
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final aebo f() {
        aebo aeboVar;
        synchronized (this.a) {
            aeboVar = this.w;
        }
        return aeboVar;
    }

    @Override // defpackage.adrj, defpackage.adwj
    public final void k(boolean z2) {
        boolean z3 = this.s;
        aebe aebeVar = this.i;
        if (z3) {
            aebeVar.i(this.x, null, adsi.a, false, null, null);
        } else {
            aebeVar.i(this.x, null, adsi.a, false, aece.CANCEL, null);
        }
        super.k(z2);
    }

    public final void q(adnq adnqVar, boolean z2, admc admcVar) throws EOFException {
        if (this.f) {
            return;
        }
        this.f = true;
        boolean z3 = this.u;
        aebe aebeVar = this.i;
        if (!z3) {
            aebeVar.i(this.x, adnqVar, adsi.a, z2, aece.CANCEL, admcVar);
            return;
        }
        aeay aeayVar = this.y;
        aebeVar.A.remove(aeayVar);
        aebeVar.j(aeayVar);
        this.b = null;
        this.c.y();
        this.u = false;
        if (admcVar == null) {
            admcVar = new admc();
        }
        l(adnqVar, true, admcVar);
    }

    public final void r(ajmy ajmyVar, boolean z2, int i) {
        int i2 = this.B - (((int) ajmyVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 >= 0) {
            super.n(new aebj(ajmyVar), z2);
        } else {
            this.g.e(this.x, aece.FLOW_CONTROL_ERROR);
            this.i.i(this.x, adnq.l.e("Received data size exceeded our receiving window size"), adsi.a, false, null, null);
        }
    }
}
