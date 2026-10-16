package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class abor<MessageT extends defpackage.abox<MessageT, BuilderT>, BuilderT extends defpackage.abor<MessageT, BuilderT>> extends defpackage.abnf<MessageT, BuilderT> implements defpackage.abpz, acfj {
    public final defpackage.abox a;
    public defpackage.abox b;

    public abor(MessageT messaget) {
        this.a = messaget;
        if (messaget.T()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = p();
    }

    public final void A(java.lang.Iterable iterable) {
        t();
        defpackage.oup oupVar = (defpackage.oup) this.b;
        defpackage.oup oupVar2 = defpackage.oup.a;
        defpackage.abpj abpjVar = oupVar.g;
        if (!abpjVar.c()) {
            int size = abpjVar.size();
            oupVar.g = abpjVar.d(size + size);
        }
        defpackage.abnf.i(iterable, oupVar.g);
    }

    public final void B(ovg ovgVar) {
        t();
        defpackage.ouq ouqVar = (defpackage.ouq) this.b;
        defpackage.ouq ouqVar2 = defpackage.ouq.a;
        ovgVar.getClass();
        defpackage.abpj abpjVar = ouqVar.r;
        if (!abpjVar.c()) {
            ouqVar.r = defpackage.abox.I(abpjVar);
        }
        ouqVar.r.add(ovgVar);
    }

    public final void C(java.lang.Iterable iterable) {
        t();
        ouy ouyVar = this.b;
        ouy ouyVar2 = ouy.a;
        defpackage.abpj abpjVar = ouyVar.g;
        if (!abpjVar.c()) {
            ouyVar.g = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ouyVar.g);
    }

    public final void D(java.lang.String str) {
        t();
        vzv vzvVar = this.b;
        vzv vzvVar2 = vzv.a;
        defpackage.abpj abpjVar = vzvVar.i;
        if (!abpjVar.c()) {
            vzvVar.i = defpackage.abox.I(abpjVar);
        }
        vzvVar.i.add(str);
    }

    public final void E(java.lang.String str) {
        t();
        wcl wclVar = this.b;
        wcl wclVar2 = wcl.a;
        str.getClass();
        defpackage.abpj abpjVar = wclVar.c;
        if (!abpjVar.c()) {
            wclVar.c = defpackage.abox.I(abpjVar);
        }
        wclVar.c.add(str);
    }

    public final void F(java.lang.String str, wcl wclVar) {
        str.getClass();
        wclVar.getClass();
        t();
        wcm wcmVar = this.b;
        wcm wcmVar2 = wcm.a;
        defpackage.abpv abpvVar = wcmVar.b;
        if (!abpvVar.b) {
            wcmVar.b = abpvVar.a();
        }
        wcmVar.b.put(str, wclVar);
    }

    public final void G(java.lang.Iterable iterable) {
        t();
        xhk xhkVar = this.b;
        defpackage.abpg abpgVar = xhk.a;
        xhkVar.b();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xhkVar.i.g(((xhf) it.next()).a());
        }
    }

    public final void H(xhf xhfVar) {
        t();
        xhk xhkVar = this.b;
        defpackage.abpg abpgVar = xhk.a;
        xhkVar.b();
        xhkVar.i.g(xhfVar.a());
    }

    public final void I(xhh xhhVar) {
        t();
        xhk xhkVar = this.b;
        defpackage.abpg abpgVar = xhk.a;
        defpackage.abpf abpfVar = xhkVar.j;
        if (!abpfVar.c()) {
            xhkVar.j = defpackage.abox.G(abpfVar);
        }
        xhkVar.j.g(xhhVar.a());
    }

    public final void J(java.lang.Iterable iterable) {
        t();
        xhp xhpVar = this.b;
        xhp xhpVar2 = xhp.a;
        defpackage.abpf abpfVar = xhpVar.b;
        if (!abpfVar.c()) {
            xhpVar.b = defpackage.abox.G(abpfVar);
        }
        defpackage.abnf.i(iterable, xhpVar.b);
    }

    public final void K(defpackage.xpa xpaVar) {
        t();
        defpackage.xpc xpcVar = (defpackage.xpc) this.b;
        defpackage.xpc xpcVar2 = defpackage.xpc.a;
        xpaVar.getClass();
        defpackage.abpj abpjVar = xpcVar.c;
        if (!abpjVar.c()) {
            int size = abpjVar.size();
            xpcVar.c = abpjVar.d(size + size);
        }
        xpcVar.c.add(xpaVar);
    }

    public final void L(int i) {
        t();
        yww ywwVar = this.b;
        yww ywwVar2 = yww.a;
        defpackage.abpf abpfVar = ywwVar.b;
        if (!abpfVar.c()) {
            ywwVar.b = defpackage.abox.G(abpfVar);
        }
        ywwVar.b.g(i - 1);
    }

    public final void M(yxa yxaVar) {
        t();
        yxc yxcVar = this.b;
        yxc yxcVar2 = yxc.a;
        yxaVar.getClass();
        defpackage.abpj abpjVar = yxcVar.v;
        if (!abpjVar.c()) {
            yxcVar.v = defpackage.abox.I(abpjVar);
        }
        yxcVar.v.add(yxaVar);
    }

    public final void N(java.lang.Iterable iterable) {
        t();
        defpackage.yyg yygVar = (defpackage.yyg) this.b;
        defpackage.yyg yygVar2 = defpackage.yyg.a;
        defpackage.abpj abpjVar = yygVar.P;
        if (!abpjVar.c()) {
            int size = abpjVar.size();
            yygVar.P = abpjVar.d(size + size);
        }
        defpackage.abnf.i(iterable, yygVar.P);
    }

    public final void O(java.lang.Iterable iterable) {
        t();
        defpackage.yyy yyyVar = (defpackage.yyy) this.b;
        defpackage.yyy yyyVar2 = defpackage.yyy.a;
        defpackage.abpj abpjVar = yyyVar.f;
        if (!abpjVar.c()) {
            int size = abpjVar.size();
            yyyVar.f = abpjVar.d(size + size);
        }
        defpackage.abnf.i(iterable, yyyVar.f);
    }

    public final void P(zcl zclVar) {
        t();
        zco zcoVar = this.b;
        zco zcoVar2 = zco.a;
        zclVar.getClass();
        defpackage.abpj abpjVar = zcoVar.b;
        if (!abpjVar.c()) {
            zcoVar.b = defpackage.abox.I(abpjVar);
        }
        zcoVar.b.add(zclVar);
    }

    public final void Q(java.lang.Iterable iterable) {
        t();
        ziq ziqVar = this.b;
        ziq ziqVar2 = ziq.a;
        ziqVar.b();
        defpackage.abnf.i(iterable, ziqVar.d);
    }

    public final void R(defpackage.abnv abnvVar) {
        t();
        ziq ziqVar = this.b;
        ziq ziqVar2 = ziq.a;
        abnvVar.getClass();
        ziqVar.b();
        ziqVar.d.add(abnvVar);
    }

    public final void S(java.lang.Iterable iterable) {
        t();
        aaiv aaivVar = this.b;
        aaiv aaivVar2 = aaiv.a;
        defpackage.abpj abpjVar = aaivVar.b;
        if (!abpjVar.c()) {
            aaivVar.b = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, aaivVar.b);
    }

    public final void T(java.lang.Iterable iterable) {
        t();
        aavz aavzVar = this.b;
        aavz aavzVar2 = aavz.a;
        aavzVar.b();
        defpackage.abnf.i(iterable, aavzVar.b);
    }

    public final void U() {
        t();
        abbp abbpVar = this.b;
        abbp abbpVar2 = abbp.a;
        abpe abpeVar = abbpVar.b;
        if (!abpeVar.c()) {
            abbpVar.b = defpackage.abox.F(abpeVar);
        }
        abbpVar.b.g(1.0f);
    }

    public final void V(int i) {
        t();
        abbx abbxVar = this.b;
        abbx abbxVar2 = abbx.a;
        defpackage.abpf abpfVar = abbxVar.b;
        if (!abpfVar.c()) {
            abbxVar.b = defpackage.abox.G(abpfVar);
        }
        abbxVar.b.g(i);
    }

    public final void W() {
        t();
        abby abbyVar = this.b;
        abby abbyVar2 = abby.a;
        defpackage.abpf abpfVar = abbyVar.b;
        if (!abpfVar.c()) {
            abbyVar.b = defpackage.abox.G(abpfVar);
        }
        abbyVar.b.g(10);
    }

    public final abdq X(int i) {
        return (abdq) this.b.b.get(i);
    }

    public final void Y(java.lang.Iterable iterable) {
        t();
        abdw abdwVar = this.b;
        abdw abdwVar2 = abdw.a;
        abdwVar.b();
        defpackage.abnf.i(iterable, abdwVar.b);
    }

    public final void Z(abdv abdvVar) {
        t();
        abdw abdwVar = this.b;
        abdw abdwVar2 = abdw.a;
        abdvVar.getClass();
        abdwVar.b();
        abdwVar.b.add(abdvVar);
    }

    public final void aA(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        defpackage.abpj abpjVar = ajftVar.r;
        if (!abpjVar.c()) {
            ajftVar.r = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ajftVar.r);
    }

    public final void aB(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        defpackage.abpj abpjVar = ajftVar.q;
        if (!abpjVar.c()) {
            ajftVar.q = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ajftVar.q);
    }

    public final void aC(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.d();
        defpackage.abnf.i(iterable, ajftVar.l);
    }

    public final void aD(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.i();
        defpackage.abnf.i(iterable, ajftVar.k);
    }

    public final void aE(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.j();
        defpackage.abnf.i(iterable, ajftVar.h);
    }

    public final void aF(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.X();
        defpackage.abnf.i(iterable, ajftVar.i);
    }

    public final void aG(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.Y();
        defpackage.abnf.i(iterable, ajftVar.j);
    }

    public final void aH(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.b();
        ajftVar.m.set(i, ajfsVar);
    }

    public final void aI(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.c();
        ajftVar.o.set(i, ajfsVar);
    }

    public final void aJ(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.d();
        ajftVar.l.set(i, ajfsVar);
    }

    public final void aK(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.i();
        ajftVar.k.set(i, ajfsVar);
    }

    public final void aL(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.j();
        ajftVar.h.set(i, ajfsVar);
    }

    public final void aM(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.X();
        ajftVar.i.set(i, ajfsVar);
    }

    public final void aN(int i, ajfs ajfsVar) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajfsVar.getClass();
        ajftVar.Y();
        ajftVar.j.set(i, ajfsVar);
    }

    public final void aO(int i) {
        t();
        ajho ajhoVar = this.b;
        ajho ajhoVar2 = ajho.a;
        defpackage.abpf abpfVar = ajhoVar.c;
        if (!abpfVar.c()) {
            ajhoVar.c = defpackage.abox.G(abpfVar);
        }
        ajhoVar.c.g(i);
    }

    public final void aP(int i) {
        t();
        ajho ajhoVar = this.b;
        ajho ajhoVar2 = ajho.a;
        defpackage.abpf abpfVar = ajhoVar.b;
        if (!abpfVar.c()) {
            ajhoVar.b = defpackage.abox.G(abpfVar);
        }
        ajhoVar.b.g(i);
    }

    public final void aQ(java.lang.Iterable iterable) {
        t();
        ajht ajhtVar = this.b;
        ajht ajhtVar2 = ajht.a;
        defpackage.abpj abpjVar = ajhtVar.v;
        if (!abpjVar.c()) {
            ajhtVar.v = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ajhtVar.v);
    }

    public final void aR(defpackage.abor aborVar) {
        t();
        vpn vpnVar = this.b;
        vpj vpjVarQ = aborVar.q();
        vpn vpnVar2 = vpn.a;
        vpjVarQ.getClass();
        vpnVar.b();
        vpnVar.e.add(vpjVarQ);
    }

    public final void aS(defpackage.abor aborVar) {
        t();
        vpl vplVar = this.b;
        ajhv ajhvVarQ = aborVar.q();
        vpl vplVar2 = vpl.a;
        ajhvVarQ.getClass();
        defpackage.abpj abpjVar = vplVar.c;
        if (!abpjVar.c()) {
            vplVar.c = defpackage.abox.I(abpjVar);
        }
        vplVar.c.add(ajhvVarQ);
    }

    public final void aT(defpackage.abor aborVar) {
        t();
        abka abkaVar = this.b;
        abjn abjnVarQ = aborVar.q();
        abka abkaVar2 = abka.a;
        abjnVarQ.getClass();
        defpackage.abpj abpjVar = abkaVar.b;
        if (!abpjVar.c()) {
            abkaVar.b = defpackage.abox.I(abpjVar);
        }
        abkaVar.b.add(abjnVarQ);
    }

    public final void aU(defpackage.abor aborVar) {
        t();
        abmb abmbVar = this.b;
        ablv ablvVarQ = aborVar.q();
        abmb abmbVar2 = abmb.a;
        ablvVarQ.getClass();
        abmbVar.b();
        abmbVar.e.add(ablvVarQ);
    }

    public final void aV(defpackage.abor aborVar) {
        t();
        abtw abtwVar = this.b;
        abtv abtvVarQ = aborVar.q();
        abtw abtwVar2 = abtw.a;
        abtvVarQ.getClass();
        defpackage.abpj abpjVar = abtwVar.b;
        if (!abpjVar.c()) {
            abtwVar.b = defpackage.abox.I(abpjVar);
        }
        abtwVar.b.add(abtvVarQ);
    }

    @Override // defpackage.abnf, defpackage.abpx
    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final void l(byte[] bArr, int i, int i2) throws defpackage.abpp {
        x(bArr, i, i2, defpackage.abol.a);
    }

    public final void aa(int i) {
        t();
        abfa abfaVar = this.b;
        abfa abfaVar2 = abfa.a;
        defpackage.abpf abpfVar = abfaVar.i;
        if (!abpfVar.c()) {
            abfaVar.i = defpackage.abox.G(abpfVar);
        }
        abfaVar.i.g(i);
    }

    public final void ab(abid abidVar) {
        t();
        abhp abhpVar = this.b;
        abhp abhpVar2 = abhp.a;
        abidVar.getClass();
        abhpVar.b();
        abhpVar.e.add(abidVar);
    }

    public final void ac(abjb abjbVar) {
        t();
        abjd abjdVar = this.b;
        abjd abjdVar2 = abjd.a;
        abjbVar.getClass();
        defpackage.abpj abpjVar = abjdVar.b;
        if (!abpjVar.c()) {
            abjdVar.b = defpackage.abox.I(abpjVar);
        }
        abjdVar.b.add(abjbVar);
    }

    public final void ad(int i) {
        t();
        abkc abkcVar = this.b;
        abkc abkcVar2 = abkc.a;
        defpackage.abpf abpfVar = abkcVar.c;
        if (!abpfVar.c()) {
            abkcVar.c = defpackage.abox.G(abpfVar);
        }
        abkcVar.c.g(i);
    }

    public final void ae(int i) {
        t();
        abkc abkcVar = this.b;
        abkc abkcVar2 = abkc.a;
        defpackage.abpf abpfVar = abkcVar.d;
        if (!abpfVar.c()) {
            abkcVar.d = defpackage.abox.G(abpfVar);
        }
        abkcVar.d.g(i);
    }

    public final void af(ablv ablvVar) {
        t();
        abmb abmbVar = this.b;
        abmb abmbVar2 = abmb.a;
        ablvVar.getClass();
        abmbVar.b();
        abmbVar.e.add(ablvVar);
    }

    public final void ag(absa absaVar) {
        t();
        defpackage.abrz abrzVar = (defpackage.abrz) this.b;
        defpackage.abrz abrzVar2 = defpackage.abrz.a;
        abrzVar.b();
        abrzVar.c.add(absaVar);
    }

    public final void ah(int i, absa absaVar) {
        t();
        defpackage.abrz abrzVar = (defpackage.abrz) this.b;
        defpackage.abrz abrzVar2 = defpackage.abrz.a;
        abrzVar.b();
        abrzVar.c.set(i, absaVar);
    }

    public final void ai(int i) {
        t();
        defpackage.absv absvVar = (defpackage.absv) this.b;
        defpackage.absv absvVar2 = defpackage.absv.a;
        defpackage.abpf abpfVar = absvVar.b;
        if (!abpfVar.c()) {
            int size = abpfVar.size();
            absvVar.b = abpfVar.d(size + size);
        }
        absvVar.b.g(i);
    }

    public final void aj(abtl abtlVar) {
        t();
        abtm abtmVar = this.b;
        abtm abtmVar2 = abtm.a;
        abtlVar.getClass();
        defpackage.abpj abpjVar = abtmVar.b;
        if (!abpjVar.c()) {
            abtmVar.b = defpackage.abox.I(abpjVar);
        }
        abtmVar.b.add(abtlVar);
    }

    public final void ak(int i) {
        t();
        abwn abwnVar = this.b;
        abwn abwnVar2 = abwn.a;
        defpackage.abpf abpfVar = abwnVar.d;
        if (!abpfVar.c()) {
            abwnVar.d = defpackage.abox.G(abpfVar);
        }
        abwnVar.d.g(i - 2);
    }

    public final void al(java.lang.String str) {
        t();
        abyn abynVar = this.b;
        abyn abynVar2 = abyn.a;
        str.getClass();
        defpackage.abpj abpjVar = abynVar.f;
        if (!abpjVar.c()) {
            abynVar.f = defpackage.abox.I(abpjVar);
        }
        abynVar.f.add(str);
    }

    public final void am(abzf abzfVar) {
        t();
        abzc abzcVar = this.b;
        abzc abzcVar2 = abzc.a;
        abzfVar.getClass();
        defpackage.abpj abpjVar = abzcVar.b;
        if (!abpjVar.c()) {
            abzcVar.b = defpackage.abox.I(abpjVar);
        }
        abzcVar.b.add(abzfVar);
    }

    public final void an(acch acchVar) {
        t();
        acci acciVar = this.b;
        acci acciVar2 = acci.a;
        acchVar.getClass();
        acciVar.b();
        acciVar.c.add(acchVar);
    }

    public final void ao(java.lang.Iterable iterable) {
        t();
        accw accwVar = this.b;
        accw accwVar2 = accw.a;
        defpackage.abpj abpjVar = accwVar.c;
        if (!abpjVar.c()) {
            accwVar.c = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, accwVar.c);
    }

    public final void ap(java.lang.Iterable iterable) {
        t();
        ajfo ajfoVar = this.b;
        ajfo ajfoVar2 = ajfo.a;
        defpackage.abpj abpjVar = ajfoVar.c;
        if (!abpjVar.c()) {
            ajfoVar.c = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ajfoVar.c);
    }

    public final void aq(java.lang.Iterable iterable) {
        t();
        ajfo ajfoVar = this.b;
        ajfo ajfoVar2 = ajfo.a;
        defpackage.abpj abpjVar = ajfoVar.d;
        if (!abpjVar.c()) {
            ajfoVar.d = defpackage.abox.I(abpjVar);
        }
        defpackage.abnf.i(iterable, ajfoVar.d);
    }

    public final ajfs ar(int i) {
        return (ajfs) this.b.m.get(i);
    }

    public final ajfs as(int i) {
        return (ajfs) this.b.o.get(i);
    }

    public final ajfs at(int i) {
        return (ajfs) this.b.l.get(i);
    }

    public final ajfs au(int i) {
        return (ajfs) this.b.k.get(i);
    }

    public final ajfs av(int i) {
        return (ajfs) this.b.h.get(i);
    }

    public final ajfs aw(int i) {
        return (ajfs) this.b.i.get(i);
    }

    public final ajfs ax(int i) {
        return (ajfs) this.b.j.get(i);
    }

    public final void ay(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.b();
        defpackage.abnf.i(iterable, ajftVar.m);
    }

    public final void az(java.lang.Iterable iterable) {
        t();
        ajft ajftVar = this.b;
        ajft ajftVar2 = ajft.a;
        ajftVar.c();
        defpackage.abnf.i(iterable, ajftVar.o);
    }

    @Override // defpackage.abnf
    /* JADX INFO: renamed from: e */
    protected final /* synthetic */ defpackage.abnf g(defpackage.abng abngVar) {
        w((defpackage.abox) abngVar);
        return this;
    }

    @Override // defpackage.abnf, defpackage.abpx
    public final /* bridge */ /* synthetic */ void j(defpackage.abny abnyVar, defpackage.abol abolVar) throws java.io.IOException {
        t();
        try {
            defpackage.abqn abqnVarA = defpackage.abqg.a.a(this.b);
            defpackage.abox aboxVar = this.b;
            java.lang.Object abnzVar = abnyVar.k;
            if (abnzVar == null) {
                abnzVar = new defpackage.abnz(abnyVar);
            }
            abqnVarA.i(aboxVar, (defpackage.abnz) abnzVar, abolVar);
        } catch (java.lang.RuntimeException e) {
            if (!(e.getCause() instanceof java.io.IOException)) {
                throw e;
            }
            throw ((java.io.IOException) e.getCause());
        }
    }

    @Override // defpackage.abnf
    public final /* bridge */ /* synthetic */ defpackage.abnf k(byte[] bArr, int i, defpackage.abol abolVar) throws defpackage.abpp {
        x(bArr, 0, i, abolVar);
        return this;
    }

    @Override // defpackage.abnf
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.abor clone() {
        defpackage.abor aborVarJ = this.a.J();
        aborVarJ.b = r();
        return aborVarJ;
    }

    @Override // defpackage.abpx
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final MessageT q() {
        MessageT messaget = (MessageT) r();
        if (defpackage.abox.S(messaget, true)) {
            return messaget;
        }
        throw new defpackage.abqw();
    }

    @Override // defpackage.abpx
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public MessageT r() {
        boolean zT = this.b.T();
        MessageT messaget = (MessageT) this.b;
        if (!zT) {
            return messaget;
        }
        messaget.N();
        return (MessageT) this.b;
    }

    public final defpackage.abox p() {
        return this.a.u();
    }

    @Override // defpackage.abpz
    public final /* bridge */ /* synthetic */ defpackage.abpy s() {
        throw null;
    }

    public final void t() {
        if (this.b.T()) {
            return;
        }
        u();
    }

    protected void u() {
        defpackage.abox aboxVarP = p();
        defpackage.abqg.a.a(aboxVarP).h(aboxVarP, this.b);
        this.b = aboxVarP;
    }

    @Override // defpackage.abpz
    public final boolean v() {
        return defpackage.abox.S(this.b, false);
    }

    public final void w(defpackage.abox aboxVar) {
        if (aboxVar != null && !this.a.getClass().isInstance(aboxVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (this.a.equals(aboxVar)) {
            return;
        }
        t();
        defpackage.abox aboxVar2 = this.b;
        defpackage.abqg.a.a(aboxVar2).h(aboxVar2, aboxVar);
    }

    public final void x(byte[] bArr, int i, int i2, defpackage.abol abolVar) throws defpackage.abpp {
        t();
        try {
            defpackage.abqg.a.a(this.b).j(this.b, bArr, i, i + i2, new defpackage.abnj(abolVar));
        } catch (defpackage.abpp e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void y(java.lang.String str, defpackage.kqq kqqVar) {
        kqqVar.getClass();
        t();
        defpackage.kqp kqpVar = (defpackage.kqp) this.b;
        defpackage.kqp kqpVar2 = defpackage.kqp.a;
        defpackage.abpv abpvVar = kqpVar.b;
        if (!abpvVar.b) {
            kqpVar.b = abpvVar.a();
        }
        kqpVar.b.put(str, kqqVar);
    }

    public final void z(olq olqVar) {
        t();
        olr olrVar = this.b;
        olr olrVar2 = olr.a;
        olqVar.getClass();
        defpackage.abpj abpjVar = olrVar.b;
        if (!abpjVar.c()) {
            olrVar.b = defpackage.abox.I(abpjVar);
        }
        olrVar.b.add(olqVar);
    }

    public abor() {
        throw null;
    }
}
