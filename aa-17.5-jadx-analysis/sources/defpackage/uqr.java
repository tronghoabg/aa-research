package defpackage;

/* loaded from: classes3.dex */
final class uqr implements uqq {
    private final uru a;
    private final urr b;
    private final rjr c;
    private final gjt d;

    public uqr(uqt uqtVar, abbd abbdVar, urv urvVar) {
        gjt gjtVar;
        yfq yfqVar;
        rjr rjrVar = null;
        this.a = urvVar == null ? null : urvVar.b();
        urr urrVarA = urvVar == null ? null : urvVar.a();
        this.b = urrVarA;
        if ((abbdVar.b & 64) != 0) {
            abct abctVar = abbdVar.g;
            abctVar = abctVar == null ? abct.a : abctVar;
            trs trsVar = uqtVar.e;
            abfi abfiVar = trsVar.a;
            int i = trsVar.c;
            ncp ncpVar = (ncp) uqtVar.d.b();
            if (urrVarA == null) {
                int i2 = yfq.d;
                yfqVar = yls.a;
            } else {
                yfqVar = urrVarA.a;
            }
            trt trtVar = uqtVar.c;
            abnp abnpVarN = abct.a.n();
            for (abcs abcsVar : abctVar.b) {
                abnr abnrVar = (abnr) abcsVar.K();
                abdl abdlVar = abcsVar.u;
                if (abdlVar == null) {
                    abdlVar = abdl.a;
                }
                abdl abdlVarC = uqp.c(abdlVar, trtVar);
                abnrVar.t();
                abcs abcsVar2 = (abcs) abnrVar.b;
                abdlVarC.getClass();
                abcsVar2.u = abdlVarC;
                abcsVar2.b |= 65536;
                abnpVarN.Z((abcs) abnrVar.q());
            }
            sb sbVar = new sb((byte[]) null);
            abnp abnpVarN2 = abih.a.n();
            abnpVarN2.t();
            abih abihVar = (abih) abnpVarN2.b;
            abihVar.h = abfiVar.f;
            abihVar.b |= 64;
            abnpVarN2.t();
            abih abihVar2 = (abih) abnpVarN2.b;
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            abihVar2.i = i3;
            abihVar2.b |= 128;
            abnpVarN2.t();
            abih abihVar3 = (abih) abnpVarN2.b;
            abihVar3.b();
            abmc.i(yfqVar, abihVar3.j);
            sbVar.c((abih) abnpVarN2.q());
            sbVar.d(((abct) abnpVarN.q()).h());
            gjtVar = new gjt(sbVar.b(), ncpVar);
        } else {
            gjtVar = null;
        }
        this.d = gjtVar;
        if ((abbdVar.b & 32768) != 0) {
            abcw abcwVar = abbdVar.h;
            rjrVar = new rjr(abcwVar == null ? abcw.a : abcwVar, uqtVar.c, (ncp) uqtVar.d.b());
        }
        this.c = rjrVar;
    }

    @Override // defpackage.uqq
    public final void a() {
        gjt gjtVar = this.d;
        if (gjtVar != null) {
            gjtVar.c();
        }
        rjr rjrVar = this.c;
        if (rjrVar != null) {
            rjrVar.a();
        }
    }

    @Override // defpackage.uqq
    public final void b() {
        gjt gjtVar = this.d;
        if (gjtVar != null) {
            gjtVar.c();
        }
        rjr rjrVar = this.c;
        if (rjrVar != null) {
            rjrVar.a();
        }
        uru uruVar = this.a;
        if (uruVar != null) {
            uruVar.close();
        }
        urr urrVar = this.b;
        if (urrVar != null) {
            urrVar.close();
        }
    }

    @Override // defpackage.uqq
    public final void c() {
        gjt gjtVar = this.d;
        if (gjtVar != null) {
            gjtVar.d();
        }
        rjr rjrVar = this.c;
        if (rjrVar != null) {
            rjrVar.b();
        }
    }

    @Override // defpackage.uqq
    public final twi d() {
        return null;
    }
}
