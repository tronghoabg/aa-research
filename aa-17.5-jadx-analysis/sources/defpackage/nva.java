package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class nva extends lhf {
    public static final nuy a = new nuy();
    public static final yph b = yph.c("GH.NDirector");
    public static final afgl c = new nfm(mki.b, 4);
    public final nwi d;
    public final eqj e;
    public final eqj f;
    public ajmd g;
    private final eqj h;
    private final nvc i;
    private final nui k;

    public /* synthetic */ nva(byte[] bArr) {
        eqj eqmVar;
        yph yphVar = mpd.a;
        mpc mpcVar = ((mpd) mki.a.i(mpd.class)).h;
        nvh nvhVar = new nvh();
        ComponentName componentName = nxo.a;
        eqm eqmVar2 = ((nxo) mki.a.i(nxo.class)).b;
        eqj eqjVarE = mpm.e();
        nwi nwiVarA = nwi.a();
        if (lec.a.a().f()) {
            eqmVar = mud.h.a().c();
        } else {
            afco afcoVar = tby.a;
            eqmVar = new eqm(false);
        }
        eqmVar.getClass();
        this.h = eqjVarE;
        this.d = nwiVarA;
        yph yphVar2 = nvf.a;
        eqjVarE.getClass();
        eqj eqjVarG = tby.g(mpcVar, nvhVar, eqmVar2, eqjVarE, eqmVar, new nve());
        this.e = eqjVarG;
        int i = nuj.b;
        wer.c();
        nvc nvcVar = new nvc(((nuj) mki.a.i(nuj.class)).a(), ofs.a.a().d, eqjVarG);
        this.i = nvcVar;
        this.f = eqy.b(nvcVar, new nna(10));
        nvcVar.fE(this, new kko(new njq(this, 9), 8));
        this.k = new nuz(this);
    }

    public static final nva a() {
        return a.a();
    }

    public final boolean b() {
        Boolean bool = (Boolean) this.h.e();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        nuj.b().f(this.k);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        nuj.b().k(this.k);
    }

    public final void e(ajmd ajmdVar) {
        b.l().y("setMediaHunListener l=%s", ajmdVar);
        if (ajmdVar == null) {
            ajmdVar = null;
        } else {
            ajmd ajmdVar2 = this.g;
            if (ajmdVar2 != null) {
                tss.p("GH.NDirector", "Tried to register a MediaHunListener when one was already set, current=%s new=%s", ajmdVar2, ajmdVar);
                throw new aezp();
            }
        }
        this.g = ajmdVar;
    }

    public nva() {
        this(null);
    }
}
