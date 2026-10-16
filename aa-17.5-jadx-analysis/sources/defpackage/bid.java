package defpackage;

import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class bid extends cwe implements cyu {
    public djy a;
    public djv b;
    public bed c;
    public boolean d;
    public djn e;
    public blr f;
    public dje g;
    public cil h;

    public bid(djy djyVar, djv djvVar, bed bedVar, boolean z, djn djnVar, blr blrVar, dje djeVar, cil cilVar) {
        this.a = djyVar;
        this.b = djvVar;
        this.c = bedVar;
        this.d = z;
        this.e = djnVar;
        this.f = blrVar;
        this.g = djeVar;
        this.h = cilVar;
        blrVar.f = new beg(this, 18);
    }

    public static final void b(bed bedVar, String str, boolean z) {
        if (z) {
            fbf fbfVar = bedVar.s;
            if (fbfVar != null) {
                asl.ad(woy.bi(new diw(), new diu(str, 1)), bedVar.t, bedVar.m, fbfVar);
                return;
            }
            afec afecVar = bedVar.m;
            int length = str.length();
            long jT = czz.t(length, length);
            long j = dfv.a;
            afecVar.invoke(new djv(str, jT, 4));
        }
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(ddx.G, this.b.a);
        decVar.a(ddx.H, this.a.a);
        decVar.a(ddx.I, new dfv(this.b.b));
        decVar.a(ddx.s, cgk.b);
        decVar.a(ddx.t, new cgh(AutofillValue.forText(vs.e(this.b.a))));
        decVar.a(ddq.h, new ddf(null, new bgb(this, 13)));
        int i = this.g.e;
        int i2 = 4;
        if (a.Y(1, 6)) {
            int i3 = cgm.b;
            daq.e(decVar, cgl.b);
        } else if (a.Y(1, 7) || a.Y(1, 8)) {
            int i4 = cgm.b;
            daq.e(decVar, cgl.a);
        } else if (a.Y(1, 4)) {
            int i5 = cgm.b;
            daq.e(decVar, cgl.c);
        }
        if (!this.d) {
            daq.c(decVar);
        }
        boolean z = this.d;
        decVar.a(ddx.R, Boolean.valueOf(z));
        decVar.a(ddq.a, new ddf(null, new bgb(this, 14)));
        int i6 = 16;
        int i7 = 15;
        if (z) {
            decVar.a(ddq.k, new ddf(null, new bgb(this, i7)));
            decVar.a(ddq.o, new ddf(null, new bgb(this, i6)));
        }
        decVar.a(ddq.j, new ddf(null, new akh(this, i2)));
        int i8 = this.g.f;
        beg begVar = new beg(this, 20);
        decVar.a(ddx.K, new djd(i8));
        decVar.a(ddq.p, new ddf(null, begVar));
        decVar.a(ddq.b, new ddf(null, new bih(this, 1)));
        decVar.a(ddq.c, new ddf(null, new beg(this, 15)));
        if (!dfv.i(this.b.b)) {
            decVar.a(ddq.q, new ddf(null, new beg(this, 16)));
            if (this.d) {
                decVar.a(ddq.r, new ddf(null, new beg(this, 17)));
            }
        }
        if (this.d) {
            decVar.a(ddq.s, new ddf(null, new beg(this, 19)));
        }
    }

    @Override // defpackage.cyu
    public final boolean y() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}
