package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bjk extends cfx implements cwu, cwk, cyu {
    public String a;
    public dfw b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public afec g;
    public bjj h;
    public wci i;
    private Map j;
    private biv k;

    public bjk(String str, dfw dfwVar, wci wciVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dfwVar;
        this.i = wciVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
    }

    private final biv m(csq csqVar) {
        biv bivVarN = n();
        bivVarN.e(csqVar);
        return bivVarN;
    }

    private final biv n() {
        biv bivVar;
        bjj bjjVar = this.h;
        if (bjjVar != null) {
            if (true != bjjVar.b) {
                bjjVar = null;
            }
            if (bjjVar != null && (bivVar = bjjVar.c) != null) {
                return bivVar;
            }
        }
        return d();
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        if (!this.A) {
            return;
        }
        biv bivVarN = n();
        den denVar = bivVarN.n;
        if (denVar == null) {
            asl.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.k + ", textSubstitution=" + this.h + ")");
            throw new aezp();
        }
        cju cjuVarB = cxdVar.r().b();
        boolean z = bivVarN.h;
        if (z) {
            long j = bivVarN.i;
            cjuVarB.g();
            cjuVarB.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            dfw dfwVar = this.b;
            dku dkuVarQ = dfwVar.q();
            if (dkuVarQ == null) {
                dkuVarQ = dku.a;
            }
            dku dkuVar = dkuVarQ;
            cku ckuVarI = dfwVar.i();
            if (ckuVarI == null) {
                ckuVarI = cku.a;
            }
            cku ckuVar = ckuVarI;
            czz czzVarY = dfwVar.y();
            if (czzVarY == null) {
                czzVarY = cmf.a;
            }
            czz czzVar = czzVarY;
            dfwVar.x();
            float[] fArr = clj.a;
            long j2 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
            if (j2 == 16) {
                j2 = dfwVar.e() != 16 ? dfwVar.e() : -72057594037927936L;
            }
            denVar.k(cjuVarB, j2, ckuVar, dkuVar, czzVar);
            if (z) {
                cjuVarB.e();
            }
        } finally {
        }
    }

    public final biv d() {
        dfw dfwVar = this.b;
        biv bivVar = this.k;
        if (bivVar == null) {
            bivVar = new biv(this.a, dfwVar, this.i, this.c, this.d, this.e, this.f);
            this.k = bivVar;
        }
        bivVar.getClass();
        return bivVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    @Override // defpackage.cwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctq el(defpackage.cts r17, defpackage.cto r18, long r19) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjk.el(cts, cto, long):ctq");
    }

    public final void f() {
        this.h = null;
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        afec bjiVar = this.g;
        if (bjiVar == null) {
            bjiVar = new bji(this, 0);
            this.g = bjiVar;
        }
        deu deuVar = new deu(this.a);
        deb debVar = ddx.D;
        List listSingletonList = Collections.singletonList(deuVar);
        listSingletonList.getClass();
        decVar.a(debVar, listSingletonList);
        bjj bjjVar = this.h;
        if (bjjVar != null) {
            decVar.a(ddx.F, Boolean.valueOf(bjjVar.b));
            decVar.a(ddx.E, new deu(bjjVar.a));
        }
        decVar.a(ddq.l, new ddf(null, new bji(this, 2)));
        decVar.a(ddq.m, new ddf(null, new bji(this, 3)));
        decVar.a(ddq.n, new ddf(null, new bih(this, 9)));
        decVar.a(ddq.a, new ddf(null, bjiVar));
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        return m(csqVar).a(i, csqVar.p());
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        return Math.round((float) Math.ceil(m(csqVar).c(csqVar.p()).a()));
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        return m(csqVar).a(i, csqVar.p());
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        return Math.round((float) Math.ceil(m(csqVar).c(csqVar.p()).b()));
    }

    public final void l() {
        bzi.q(this).J();
        bzi.q(this).I();
        cjn.w(this);
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
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
