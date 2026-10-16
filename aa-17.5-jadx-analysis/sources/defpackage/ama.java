package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class ama extends aoe implements cyu {
    public afeg a;
    public afeg b;
    public final tp c;
    private ape i;
    private ape j;

    public ama(boolean z, asf asfVar, api apiVar) {
        super(amc.a, z, asfVar, apiVar);
        this.c = new tp();
    }

    private final void A() {
        if (this.A) {
            dlg dlgVar = bzi.q(this).r;
            m().b = new kwp(new adk(dlgVar), (byte[]) null);
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        ape apeVar = this.i;
        if (apeVar != null) {
            apeVar.d = bzi.q(this).r;
        }
        ape apeVar2 = this.j;
        if (apeVar2 != null) {
            apeVar2.d = bzi.q(this).r;
        }
        A();
    }

    protected abstract ape f();

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        if (this.f && (this.a == null || this.b == null)) {
            this.a = new alx(this, 0);
            this.b = new alz(this, null);
        }
        afeg afegVar = this.a;
        if (afegVar != null) {
            decVar.a(ddq.d, new ddf(null, afegVar));
        }
        afeg afegVar2 = this.b;
        if (afegVar2 != null) {
            decVar.a(ddq.e, afegVar2);
        }
    }

    protected abstract ape h();

    protected abstract Object i(long j, afck afckVar);

    @Override // defpackage.aoe
    public final boolean k() {
        aqk aqkVarL = l();
        if (aqkVarL.a.i()) {
            return true;
        }
        aiu aiuVar = aqkVarL.j;
        return aiuVar != null && aiuVar.j();
    }

    protected abstract aqk l();

    protected abstract anh m();

    @Override // defpackage.aoe, defpackage.cfx
    /* renamed from: p */
    public final void t() {
        o();
        ape apeVar = this.i;
        if (apeVar != null) {
            apeVar.d = bzi.q(this).r;
        }
        ape apeVar2 = this.j;
        if (apeVar2 != null) {
            apeVar2.d = bzi.q(this).r;
        }
        o();
        A();
    }

    @Override // defpackage.aoe, defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        int i;
        List list = cqlVar.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.e.invoke(new crc(((cqu) list.get(i2)).i))).booleanValue()) {
                super.s(cqlVar, cqmVar, j);
                break;
            }
            i2++;
        }
        if (this.f) {
            F();
            cqm cqmVar2 = cqm.a;
            if (cqmVar == cqmVar2 && cqlVar.e == 6) {
                ape apeVarF = this.i;
                if (apeVarF == null) {
                    apeVarF = f();
                    this.i = apeVarF;
                }
                if (apeVarF != null) {
                    aitx aitxVarN = N();
                    apc apcVar = (apc) apeVarF;
                    if (apcVar.b == null) {
                        apcVar.b = ahnc.d(aitxVarN, null, 0, new bto(apcVar, (afck) null, 1), 3);
                    }
                }
            }
            ape apeVar = this.i;
            if (apeVar != null) {
                apeVar.o(cqlVar, cqmVar);
            }
            if (cqmVar == cqmVar2 && ((i = cqlVar.e) == 10 || i == 11 || i == 12)) {
                ape apeVarH = this.j;
                if (apeVarH == null) {
                    apeVarH = h();
                    this.j = apeVarH;
                }
                if (apeVarH != null) {
                    aitx aitxVarN2 = N();
                    ard ardVar = (ard) apeVarH;
                    if (ardVar.b == null) {
                        ardVar.b = ahnc.d(aitxVarN2, null, 0, new efi(ardVar, (afck) null, 1), 3);
                    }
                }
            }
            ape apeVar2 = this.j;
            if (apeVar2 != null) {
                apeVar2.o(cqlVar, cqmVar);
            }
        }
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

    @Override // defpackage.aoe
    public final void j(long j) {
    }
}
