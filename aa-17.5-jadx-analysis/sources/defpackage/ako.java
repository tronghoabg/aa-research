package defpackage;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class ako extends cfx implements cwl, cwk, cyu, cyg {
    private dlq B;
    public afec a;
    public afec b;
    public ala i;
    public View j;
    public dlg k;
    public aixl n;
    public alb o;
    private bym p;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final bwq l = new ParcelableSnapshotMutableState(null, bxp.b);
    public long m = 9205357640488583168L;

    public ako(afec afecVar, afec afecVar2, ala alaVar) {
        this.a = afecVar;
        this.b = afecVar2;
        this.i = alaVar;
    }

    private final long i() {
        if (this.p == null) {
            nx nxVar = new nx(this, 18);
            lah lahVar = byj.a;
            this.p = new bvk(nxVar, null);
        }
        bym bymVar = this.p;
        if (bymVar != null) {
            return ((cja) bymVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void j() {
        dlg dlgVar;
        alb albVar = this.o;
        if (albVar == null || (dlgVar = this.k) == null || dlq.d(albVar.a(), this.B)) {
            return;
        }
        afec afecVar = this.b;
        if (afecVar != null) {
            afecVar.invoke(new dll(dlgVar.eG(dln.k(albVar.a()))));
        }
        this.B = new dlq(albVar.a());
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        cxdVar.q();
        aixl aixlVar = this.n;
        if (aixlVar != null) {
            aixlVar.j(afak.a);
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        r();
        this.n = afpt.r(0, 0, 7);
        ahnc.d(N(), null, 4, new ada(this, (afck) null, 8), 1);
    }

    @Override // defpackage.cwl
    public final void es(cst cstVar) {
        this.l.b(cstVar);
    }

    public final void f() {
        alb albVar = this.o;
        if (albVar != null) {
            albVar.b();
        }
        View viewC = this.j;
        if (viewC == null) {
            viewC = tt.c(this);
        }
        View view = viewC;
        this.j = view;
        dlg dlgVarT = this.k;
        if (dlgVarT == null) {
            dlgVarT = bzi.t(this);
        }
        dlg dlgVar = dlgVarT;
        this.k = dlgVar;
        this.o = this.i.b(view, this.d, this.e, this.f, this.g, this.h, dlgVar, this.c);
        j();
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(akp.a, new nx(this, 17));
    }

    public final void h() {
        dlg dlgVarT = this.k;
        if (dlgVarT == null) {
            dlgVarT = bzi.t(this);
            this.k = dlgVarT;
        }
        long j = ((cja) this.a.invoke(dlgVarT)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & i()) == 9205357640488583168L) {
            this.m = 9205357640488583168L;
            alb albVar = this.o;
            if (albVar != null) {
                albVar.b();
                return;
            }
            return;
        }
        this.m = a.ai(i(), j);
        if (this.o == null) {
            f();
        }
        alb albVar2 = this.o;
        if (albVar2 != null) {
            albVar2.c(this.m, this.c);
        }
        j();
    }

    @Override // defpackage.cfx
    public final void q() {
        alb albVar = this.o;
        if (albVar != null) {
            albVar.b();
        }
        this.o = null;
    }

    @Override // defpackage.cyg
    public final void r() {
        cjn.p(this, new nx(this, 16));
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
