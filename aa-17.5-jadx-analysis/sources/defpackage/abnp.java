package defpackage;

import defpackage.abnp;
import defpackage.abnv;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class abnp<MessageT extends abnv<MessageT, BuilderT>, BuilderT extends abnp<MessageT, BuilderT>> extends abmc<MessageT, BuilderT> implements abox, aceh {
    public final abnv a;
    public abnv b;

    public abnp(MessageT messaget) {
        this.a = messaget;
        if (messaget.T()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = p();
    }

    public final void A(Iterable iterable) {
        t();
        ots otsVar = (ots) this.b;
        ots otsVar2 = ots.a;
        aboh abohVar = otsVar.g;
        if (!abohVar.c()) {
            int size = abohVar.size();
            otsVar.g = abohVar.d(size + size);
        }
        abmc.i(iterable, otsVar.g);
    }

    public final void B(ouj oujVar) {
        t();
        ott ottVar = (ott) this.b;
        ott ottVar2 = ott.a;
        oujVar.getClass();
        aboh abohVar = ottVar.r;
        if (!abohVar.c()) {
            ottVar.r = abnv.I(abohVar);
        }
        ottVar.r.add(oujVar);
    }

    public final void C(Iterable iterable) {
        t();
        oub oubVar = (oub) this.b;
        oub oubVar2 = oub.a;
        aboh abohVar = oubVar.g;
        if (!abohVar.c()) {
            oubVar.g = abnv.I(abohVar);
        }
        abmc.i(iterable, oubVar.g);
    }

    public final void D(String str) {
        t();
        vza vzaVar = (vza) this.b;
        vza vzaVar2 = vza.a;
        aboh abohVar = vzaVar.i;
        if (!abohVar.c()) {
            vzaVar.i = abnv.I(abohVar);
        }
        vzaVar.i.add(str);
    }

    public final void E(String str) {
        t();
        wbp wbpVar = (wbp) this.b;
        wbp wbpVar2 = wbp.a;
        str.getClass();
        aboh abohVar = wbpVar.c;
        if (!abohVar.c()) {
            wbpVar.c = abnv.I(abohVar);
        }
        wbpVar.c.add(str);
    }

    public final void F(String str, wbp wbpVar) {
        str.getClass();
        wbpVar.getClass();
        t();
        wbq wbqVar = (wbq) this.b;
        wbq wbqVar2 = wbq.a;
        abot abotVar = wbqVar.b;
        if (!abotVar.b) {
            wbqVar.b = abotVar.a();
        }
        wbqVar.b.put(str, wbpVar);
    }

    public final void G(Iterable iterable) {
        t();
        xgj xgjVar = (xgj) this.b;
        aboe aboeVar = xgj.a;
        xgjVar.b();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xgjVar.i.g(((xge) it.next()).a());
        }
    }

    public final void H(xge xgeVar) {
        t();
        xgj xgjVar = (xgj) this.b;
        aboe aboeVar = xgj.a;
        xgjVar.b();
        xgjVar.i.g(xgeVar.a());
    }

    public final void I(xgg xggVar) {
        t();
        xgj xgjVar = (xgj) this.b;
        aboe aboeVar = xgj.a;
        abod abodVar = xgjVar.j;
        if (!abodVar.c()) {
            xgjVar.j = abnv.G(abodVar);
        }
        xgjVar.j.g(xggVar.a());
    }

    public final void J(Iterable iterable) {
        t();
        xgo xgoVar = (xgo) this.b;
        xgo xgoVar2 = xgo.a;
        abod abodVar = xgoVar.b;
        if (!abodVar.c()) {
            xgoVar.b = abnv.G(abodVar);
        }
        abmc.i(iterable, xgoVar.b);
    }

    public final void K(xnz xnzVar) {
        t();
        xob xobVar = (xob) this.b;
        xob xobVar2 = xob.a;
        xnzVar.getClass();
        aboh abohVar = xobVar.c;
        if (!abohVar.c()) {
            int size = abohVar.size();
            xobVar.c = abohVar.d(size + size);
        }
        xobVar.c.add(xnzVar);
    }

    public final void L(int i) {
        t();
        yvr yvrVar = (yvr) this.b;
        yvr yvrVar2 = yvr.a;
        abod abodVar = yvrVar.b;
        if (!abodVar.c()) {
            yvrVar.b = abnv.G(abodVar);
        }
        yvrVar.b.g(i - 1);
    }

    public final void M(yvv yvvVar) {
        t();
        yvx yvxVar = (yvx) this.b;
        yvx yvxVar2 = yvx.a;
        yvvVar.getClass();
        aboh abohVar = yvxVar.v;
        if (!abohVar.c()) {
            yvxVar.v = abnv.I(abohVar);
        }
        yvxVar.v.add(yvvVar);
    }

    public final void N(Iterable iterable) {
        t();
        yxb yxbVar = (yxb) this.b;
        yxb yxbVar2 = yxb.a;
        aboh abohVar = yxbVar.P;
        if (!abohVar.c()) {
            int size = abohVar.size();
            yxbVar.P = abohVar.d(size + size);
        }
        abmc.i(iterable, yxbVar.P);
    }

    public final void O(Iterable iterable) {
        t();
        yxt yxtVar = (yxt) this.b;
        yxt yxtVar2 = yxt.a;
        aboh abohVar = yxtVar.f;
        if (!abohVar.c()) {
            int size = abohVar.size();
            yxtVar.f = abohVar.d(size + size);
        }
        abmc.i(iterable, yxtVar.f);
    }

    public final void P(zbf zbfVar) {
        t();
        zbi zbiVar = (zbi) this.b;
        zbi zbiVar2 = zbi.a;
        zbfVar.getClass();
        aboh abohVar = zbiVar.b;
        if (!abohVar.c()) {
            zbiVar.b = abnv.I(abohVar);
        }
        zbiVar.b.add(zbfVar);
    }

    public final void Q(Iterable iterable) {
        t();
        zho zhoVar = (zho) this.b;
        zho zhoVar2 = zho.a;
        zhoVar.b();
        abmc.i(iterable, zhoVar.d);
    }

    public final void R(abms abmsVar) {
        t();
        zho zhoVar = (zho) this.b;
        zho zhoVar2 = zho.a;
        abmsVar.getClass();
        zhoVar.b();
        zhoVar.d.add(abmsVar);
    }

    public final void S(Iterable iterable) {
        t();
        aahs aahsVar = (aahs) this.b;
        aahs aahsVar2 = aahs.a;
        aboh abohVar = aahsVar.b;
        if (!abohVar.c()) {
            aahsVar.b = abnv.I(abohVar);
        }
        abmc.i(iterable, aahsVar.b);
    }

    public final void T(Iterable iterable) {
        t();
        aauw aauwVar = (aauw) this.b;
        aauw aauwVar2 = aauw.a;
        aauwVar.b();
        abmc.i(iterable, aauwVar.b);
    }

    public final void U() {
        t();
        abam abamVar = (abam) this.b;
        abam abamVar2 = abam.a;
        aboc abocVar = abamVar.b;
        if (!abocVar.c()) {
            abamVar.b = abnv.F(abocVar);
        }
        abamVar.b.g(1.0f);
    }

    public final void V(int i) {
        t();
        abau abauVar = (abau) this.b;
        abau abauVar2 = abau.a;
        abod abodVar = abauVar.b;
        if (!abodVar.c()) {
            abauVar.b = abnv.G(abodVar);
        }
        abauVar.b.g(i);
    }

    public final void W() {
        t();
        abav abavVar = (abav) this.b;
        abav abavVar2 = abav.a;
        abod abodVar = abavVar.b;
        if (!abodVar.c()) {
            abavVar.b = abnv.G(abodVar);
        }
        abavVar.b.g(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final abcn X(int i) {
        return (abcn) ((abci) this.b).b.get(i);
    }

    public final void Y(Iterable iterable) {
        t();
        abct abctVar = (abct) this.b;
        abct abctVar2 = abct.a;
        abctVar.b();
        abmc.i(iterable, abctVar.b);
    }

    public final void Z(abcs abcsVar) {
        t();
        abct abctVar = (abct) this.b;
        abct abctVar2 = abct.a;
        abcsVar.getClass();
        abctVar.b();
        abctVar.b.add(abcsVar);
    }

    public final void aA(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        aboh abohVar = ajeuVar.r;
        if (!abohVar.c()) {
            ajeuVar.r = abnv.I(abohVar);
        }
        abmc.i(iterable, ajeuVar.r);
    }

    public final void aB(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        aboh abohVar = ajeuVar.q;
        if (!abohVar.c()) {
            ajeuVar.q = abnv.I(abohVar);
        }
        abmc.i(iterable, ajeuVar.q);
    }

    public final void aC(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.d();
        abmc.i(iterable, ajeuVar.l);
    }

    public final void aD(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.i();
        abmc.i(iterable, ajeuVar.k);
    }

    public final void aE(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.j();
        abmc.i(iterable, ajeuVar.h);
    }

    public final void aF(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.X();
        abmc.i(iterable, ajeuVar.i);
    }

    public final void aG(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.Y();
        abmc.i(iterable, ajeuVar.j);
    }

    public final void aH(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.b();
        ajeuVar.m.set(i, ajetVar);
    }

    public final void aI(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.c();
        ajeuVar.o.set(i, ajetVar);
    }

    public final void aJ(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.d();
        ajeuVar.l.set(i, ajetVar);
    }

    public final void aK(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.i();
        ajeuVar.k.set(i, ajetVar);
    }

    public final void aL(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.j();
        ajeuVar.h.set(i, ajetVar);
    }

    public final void aM(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.X();
        ajeuVar.i.set(i, ajetVar);
    }

    public final void aN(int i, ajet ajetVar) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajetVar.getClass();
        ajeuVar.Y();
        ajeuVar.j.set(i, ajetVar);
    }

    public final void aO(int i) {
        t();
        ajgp ajgpVar = (ajgp) this.b;
        ajgp ajgpVar2 = ajgp.a;
        abod abodVar = ajgpVar.c;
        if (!abodVar.c()) {
            ajgpVar.c = abnv.G(abodVar);
        }
        ajgpVar.c.g(i);
    }

    public final void aP(int i) {
        t();
        ajgp ajgpVar = (ajgp) this.b;
        ajgp ajgpVar2 = ajgp.a;
        abod abodVar = ajgpVar.b;
        if (!abodVar.c()) {
            ajgpVar.b = abnv.G(abodVar);
        }
        ajgpVar.b.g(i);
    }

    public final void aQ(Iterable iterable) {
        t();
        ajgu ajguVar = (ajgu) this.b;
        ajgu ajguVar2 = ajgu.a;
        aboh abohVar = ajguVar.v;
        if (!abohVar.c()) {
            ajguVar.v = abnv.I(abohVar);
        }
        abmc.i(iterable, ajguVar.v);
    }

    public final void aR(abnp abnpVar) {
        t();
        vor vorVar = (vor) this.b;
        von vonVar = (von) abnpVar.q();
        vor vorVar2 = vor.a;
        vonVar.getClass();
        vorVar.b();
        vorVar.e.add(vonVar);
    }

    public final void aS(abnp abnpVar) {
        t();
        vop vopVar = (vop) this.b;
        ajgw ajgwVar = (ajgw) abnpVar.q();
        vop vopVar2 = vop.a;
        ajgwVar.getClass();
        aboh abohVar = vopVar.c;
        if (!abohVar.c()) {
            vopVar.c = abnv.I(abohVar);
        }
        vopVar.c.add(ajgwVar);
    }

    public final void aT(abnp abnpVar) {
        t();
        abix abixVar = (abix) this.b;
        abik abikVar = (abik) abnpVar.q();
        abix abixVar2 = abix.a;
        abikVar.getClass();
        aboh abohVar = abixVar.b;
        if (!abohVar.c()) {
            abixVar.b = abnv.I(abohVar);
        }
        abixVar.b.add(abikVar);
    }

    public final void aU(abnp abnpVar) {
        t();
        abky abkyVar = (abky) this.b;
        abks abksVar = (abks) abnpVar.q();
        abky abkyVar2 = abky.a;
        abksVar.getClass();
        abkyVar.b();
        abkyVar.e.add(abksVar);
    }

    public final void aV(abnp abnpVar) {
        t();
        abst abstVar = (abst) this.b;
        abss abssVar = (abss) abnpVar.q();
        abst abstVar2 = abst.a;
        abssVar.getClass();
        aboh abohVar = abstVar.b;
        if (!abohVar.c()) {
            abstVar.b = abnv.I(abohVar);
        }
        abstVar.b.add(abssVar);
    }

    @Override // defpackage.abmc, defpackage.abov
    /* renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final void l(byte[] bArr, int i, int i2) throws abon {
        x(bArr, i, i2, abnj.a);
    }

    public final void aa(int i) {
        t();
        abdx abdxVar = (abdx) this.b;
        abdx abdxVar2 = abdx.a;
        abod abodVar = abdxVar.i;
        if (!abodVar.c()) {
            abdxVar.i = abnv.G(abodVar);
        }
        abdxVar.i.g(i);
    }

    public final void ab(abha abhaVar) {
        t();
        abgm abgmVar = (abgm) this.b;
        abgm abgmVar2 = abgm.a;
        abhaVar.getClass();
        abgmVar.b();
        abgmVar.e.add(abhaVar);
    }

    public final void ac(abhy abhyVar) {
        t();
        abia abiaVar = (abia) this.b;
        abia abiaVar2 = abia.a;
        abhyVar.getClass();
        aboh abohVar = abiaVar.b;
        if (!abohVar.c()) {
            abiaVar.b = abnv.I(abohVar);
        }
        abiaVar.b.add(abhyVar);
    }

    public final void ad(int i) {
        t();
        abiz abizVar = (abiz) this.b;
        abiz abizVar2 = abiz.a;
        abod abodVar = abizVar.c;
        if (!abodVar.c()) {
            abizVar.c = abnv.G(abodVar);
        }
        abizVar.c.g(i);
    }

    public final void ae(int i) {
        t();
        abiz abizVar = (abiz) this.b;
        abiz abizVar2 = abiz.a;
        abod abodVar = abizVar.d;
        if (!abodVar.c()) {
            abizVar.d = abnv.G(abodVar);
        }
        abizVar.d.g(i);
    }

    public final void af(abks abksVar) {
        t();
        abky abkyVar = (abky) this.b;
        abky abkyVar2 = abky.a;
        abksVar.getClass();
        abkyVar.b();
        abkyVar.e.add(abksVar);
    }

    public final void ag(abqx abqxVar) {
        t();
        abqw abqwVar = (abqw) this.b;
        abqw abqwVar2 = abqw.a;
        abqwVar.b();
        abqwVar.c.add(abqxVar);
    }

    public final void ah(int i, abqx abqxVar) {
        t();
        abqw abqwVar = (abqw) this.b;
        abqw abqwVar2 = abqw.a;
        abqwVar.b();
        abqwVar.c.set(i, abqxVar);
    }

    public final void ai(int i) {
        t();
        abrs abrsVar = (abrs) this.b;
        abrs abrsVar2 = abrs.a;
        abod abodVar = abrsVar.b;
        if (!abodVar.c()) {
            int size = abodVar.size();
            abrsVar.b = abodVar.d(size + size);
        }
        abrsVar.b.g(i);
    }

    public final void aj(absi absiVar) {
        t();
        absj absjVar = (absj) this.b;
        absj absjVar2 = absj.a;
        absiVar.getClass();
        aboh abohVar = absjVar.b;
        if (!abohVar.c()) {
            absjVar.b = abnv.I(abohVar);
        }
        absjVar.b.add(absiVar);
    }

    public final void ak(int i) {
        t();
        abvk abvkVar = (abvk) this.b;
        abvk abvkVar2 = abvk.a;
        abod abodVar = abvkVar.d;
        if (!abodVar.c()) {
            abvkVar.d = abnv.G(abodVar);
        }
        abvkVar.d.g(i - 2);
    }

    public final void al(String str) {
        t();
        abxk abxkVar = (abxk) this.b;
        abxk abxkVar2 = abxk.a;
        str.getClass();
        aboh abohVar = abxkVar.f;
        if (!abohVar.c()) {
            abxkVar.f = abnv.I(abohVar);
        }
        abxkVar.f.add(str);
    }

    public final void am(abyc abycVar) {
        t();
        abxz abxzVar = (abxz) this.b;
        abxz abxzVar2 = abxz.a;
        abycVar.getClass();
        aboh abohVar = abxzVar.b;
        if (!abohVar.c()) {
            abxzVar.b = abnv.I(abohVar);
        }
        abxzVar.b.add(abycVar);
    }

    public final void an(acbf acbfVar) {
        t();
        acbg acbgVar = (acbg) this.b;
        acbg acbgVar2 = acbg.a;
        acbfVar.getClass();
        acbgVar.b();
        acbgVar.c.add(acbfVar);
    }

    public final void ao(Iterable iterable) {
        t();
        acbu acbuVar = (acbu) this.b;
        acbu acbuVar2 = acbu.a;
        aboh abohVar = acbuVar.c;
        if (!abohVar.c()) {
            acbuVar.c = abnv.I(abohVar);
        }
        abmc.i(iterable, acbuVar.c);
    }

    public final void ap(Iterable iterable) {
        t();
        ajep ajepVar = (ajep) this.b;
        ajep ajepVar2 = ajep.a;
        aboh abohVar = ajepVar.c;
        if (!abohVar.c()) {
            ajepVar.c = abnv.I(abohVar);
        }
        abmc.i(iterable, ajepVar.c);
    }

    public final void aq(Iterable iterable) {
        t();
        ajep ajepVar = (ajep) this.b;
        ajep ajepVar2 = ajep.a;
        aboh abohVar = ajepVar.d;
        if (!abohVar.c()) {
            ajepVar.d = abnv.I(abohVar);
        }
        abmc.i(iterable, ajepVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet ar(int i) {
        return (ajet) ((ajeu) this.b).m.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet as(int i) {
        return (ajet) ((ajeu) this.b).o.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet at(int i) {
        return (ajet) ((ajeu) this.b).l.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet au(int i) {
        return (ajet) ((ajeu) this.b).k.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet av(int i) {
        return (ajet) ((ajeu) this.b).h.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet aw(int i) {
        return (ajet) ((ajeu) this.b).i.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajet ax(int i) {
        return (ajet) ((ajeu) this.b).j.get(i);
    }

    public final void ay(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.b();
        abmc.i(iterable, ajeuVar.m);
    }

    public final void az(Iterable iterable) {
        t();
        ajeu ajeuVar = (ajeu) this.b;
        ajeu ajeuVar2 = ajeu.a;
        ajeuVar.c();
        abmc.i(iterable, ajeuVar.o);
    }

    @Override // defpackage.abmc
    /* renamed from: e */
    protected final /* synthetic */ abmc g(abmd abmdVar) {
        w((abnv) abmdVar);
        return this;
    }

    @Override // defpackage.abmc, defpackage.abov
    public final /* bridge */ /* synthetic */ void j(abmw abmwVar, abnj abnjVar) throws IOException {
        t();
        try {
            abpl abplVarA = abpe.a.a(this.b);
            abnv abnvVar = this.b;
            Object abmxVar = abmwVar.k;
            if (abmxVar == null) {
                abmxVar = new abmx(abmwVar);
            }
            abplVarA.i(abnvVar, (abmx) abmxVar, abnjVar);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    @Override // defpackage.abmc
    public final /* bridge */ /* synthetic */ abmc k(byte[] bArr, int i, abnj abnjVar) throws abon {
        x(bArr, 0, i, abnjVar);
        return this;
    }

    @Override // defpackage.abmc
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final abnp clone() {
        abnp abnpVarP = this.a.J();
        abnpVarP.b = r();
        return abnpVarP;
    }

    @Override // defpackage.abov
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final MessageT q() {
        MessageT messaget = (MessageT) r();
        if (abnv.S(messaget, true)) {
            return messaget;
        }
        throw new abpu();
    }

    @Override // defpackage.abov
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public MessageT r() {
        boolean zT = this.b.T();
        MessageT messaget = (MessageT) this.b;
        if (!zT) {
            return messaget;
        }
        messaget.N();
        return (MessageT) this.b;
    }

    public final abnv p() {
        return this.a.u();
    }

    @Override // defpackage.abox
    public final /* bridge */ /* synthetic */ abow s() {
        throw null;
    }

    public final void t() {
        if (this.b.T()) {
            return;
        }
        u();
    }

    protected void u() {
        abnv abnvVarP = p();
        abpe.a.a(abnvVarP).h(abnvVarP, this.b);
        this.b = abnvVarP;
    }

    @Override // defpackage.abox
    public final boolean v() {
        return abnv.S(this.b, false);
    }

    public final void w(abnv abnvVar) {
        if (abnvVar != null && !this.a.getClass().isInstance(abnvVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (this.a.equals(abnvVar)) {
            return;
        }
        t();
        abnv abnvVar2 = this.b;
        abpe.a.a(abnvVar2).h(abnvVar2, abnvVar);
    }

    public final void x(byte[] bArr, int i, int i2, abnj abnjVar) throws abon {
        t();
        try {
            abpe.a.a(this.b).j(this.b, bArr, i, i + i2, new abmg(abnjVar));
        } catch (abon e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void y(String str, kqi kqiVar) {
        kqiVar.getClass();
        t();
        kqh kqhVar = (kqh) this.b;
        kqh kqhVar2 = kqh.a;
        abot abotVar = kqhVar.b;
        if (!abotVar.b) {
            kqhVar.b = abotVar.a();
        }
        kqhVar.b.put(str, kqiVar);
    }

    public final void z(oky okyVar) {
        t();
        okz okzVar = (okz) this.b;
        okz okzVar2 = okz.a;
        okyVar.getClass();
        aboh abohVar = okzVar.b;
        if (!abohVar.c()) {
            okzVar.b = abnv.I(abohVar);
        }
        okzVar.b.add(okyVar);
    }

    public abnp() {
        throw null;
    }
}
