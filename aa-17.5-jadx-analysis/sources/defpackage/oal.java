package defpackage;

import android.content.ComponentName;
import android.os.Build;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class oal extends erm {
    public static final ygr a;
    public final eqj b;
    public final eqj c;
    public final qrn d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    public final eqj q;
    public final eqj r;
    private final aezr s;
    private final aezr t;
    private final mko u;

    static {
        yph.c("GH.StatusElementVM");
        ygr ygrVarP = ygr.p("debug", "dogfood");
        ygrVarP.getClass();
        a = ygrVarP;
    }

    public oal(eqj eqjVar, eqj eqjVar2, qrn qrnVar) {
        Object aezvVar;
        eqjVar2.getClass();
        this.b = eqjVar;
        this.c = eqjVar2;
        this.d = qrnVar;
        this.u = new mko(mki.a.c);
        try {
            eqj eqjVarA = kjq.a.a().a();
            nqz nqzVar = new nqz(20);
            afco afcoVar = tby.a;
            aezvVar = eqy.b(eqjVarA, nqzVar);
        } catch (Throwable th) {
            aezvVar = new aezv(th);
        }
        afbe afbeVar = afbe.a;
        afco afcoVar2 = tby.a;
        this.e = eqy.b(new obq(), new nna(12));
        yph yphVar = kfp.a;
        this.f = ((kfp) mki.a.i(kfp.class)).c;
        nfq nfqVar = nfr.a;
        int i = 19;
        eqj eqjVarB = eqy.b(nfqVar.a().d, new nna(i));
        this.g = eqjVarB;
        acxa acxaVar = acxa.a;
        this.i = acxaVar.gu().ad() ? tby.a(tby.a(nfqVar.a().d, nfqVar.a().f), nfqVar.a().e) : tby.d;
        this.j = acxaVar.gu().ad() ? eqy.b(nfqVar.a().f, new nna(i)) : tby.y(eqy.b(eqjVarB, new nna(i)), eqy.b(nfqVar.a().f, new nna(i)));
        this.k = acxaVar.gu().ad() ? eqy.b(nfqVar.a().e, new nna(i)) : tby.y(eqy.b(eqjVarB, new nna(i)), eqy.b(nfqVar.a().e, new nna(i)));
        this.s = new aezy(new nnj(6));
        mko mkoVar = this.u;
        this.l = (eqj) mkoVar.a;
        this.m = (eqj) mkoVar.d;
        eqj eqjVar3 = (eqj) mkoVar.c;
        this.n = eqjVar3;
        this.o = eqy.b(eqjVar3, new afec() { // from class: oai
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                ntq ntqVar = (ntq) obj;
                ntqVar.getClass();
                ldz ldzVarA = ldz.a.a();
                qrn qrnVarE = this.a.d;
                if (qrnVarE == null) {
                    yph yphVar2 = kio.a;
                    qrnVarE = ((kio) mki.a.i(kio.class)).e();
                    qrnVarE.getClass();
                }
                if (ldzVarA.c(qrnVarE)) {
                    String str = Build.MANUFACTURER;
                    str.getClass();
                    if (afyh.u(str, "samsung", true)) {
                        switch (ntqVar.a.ordinal()) {
                            case 0:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_1x);
                            case 1:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_3g);
                            case 2:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_h);
                            case 3:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_e);
                            case 4:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_r);
                            case 5:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_4g);
                            case 6:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_4g_plus);
                            case 7:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_lte);
                            case 8:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_lte_plus);
                            case 9:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g);
                            case 10:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g_plus);
                            case 11:
                                return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g_plus);
                            case 12:
                            case 13:
                                return null;
                            default:
                                throw new aezs();
                        }
                    }
                    switch (ntqVar.a.ordinal()) {
                        case 0:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_1x);
                        case 1:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_3g);
                        case 2:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_h);
                        case 3:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_e);
                        case 4:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_r);
                        case 5:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_4g);
                        case 6:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_4g_plus);
                        case 7:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_lte);
                        case 8:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_lte_plus);
                        case 9:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g);
                        case 10:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g_plus);
                        case 11:
                            return Integer.valueOf(R.drawable.ic_cielo_mobiledata_5g_plus);
                        case 12:
                        case 13:
                            return null;
                        default:
                            throw new aezs();
                    }
                }
                String str2 = Build.MANUFACTURER;
                str2.getClass();
                if (afyh.u(str2, "samsung", true)) {
                    switch (ntqVar.a.ordinal()) {
                        case 0:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_1x);
                        case 1:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_3g);
                        case 2:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_h);
                        case 3:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_e);
                        case 4:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_r);
                        case 5:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_4g);
                        case 6:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_4g_plus);
                        case 7:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_lte);
                        case 8:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_lte_plus);
                        case 9:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g);
                        case 10:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g_plus);
                        case 11:
                            return Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g_plus);
                        case 12:
                        case 13:
                            return null;
                        default:
                            throw new aezs();
                    }
                }
                switch (ntqVar.a.ordinal()) {
                    case 0:
                        return Integer.valueOf(R.drawable.ic_mobiledata_1x);
                    case 1:
                        return Integer.valueOf(R.drawable.ic_mobiledata_3g);
                    case 2:
                        return Integer.valueOf(R.drawable.ic_mobiledata_h);
                    case 3:
                        return Integer.valueOf(R.drawable.ic_mobiledata_e);
                    case 4:
                        return Integer.valueOf(R.drawable.ic_mobiledata_r);
                    case 5:
                        return Integer.valueOf(R.drawable.ic_mobiledata_4g);
                    case 6:
                        return Integer.valueOf(R.drawable.ic_mobiledata_4g_plus);
                    case 7:
                        return Integer.valueOf(R.drawable.ic_mobiledata_lte);
                    case 8:
                        return Integer.valueOf(R.drawable.ic_mobiledata_lte_plus);
                    case 9:
                        return Integer.valueOf(R.drawable.ic_mobiledata_5g);
                    case 10:
                        return Integer.valueOf(R.drawable.ic_mobiledata_5g_e);
                    case 11:
                        return Integer.valueOf(R.drawable.ic_mobiledata_5g_plus);
                    case 12:
                    case 13:
                        return null;
                    default:
                        throw new aezs();
                }
            }
        });
        ComponentName componentName = nxo.a;
        this.p = ((nxo) mki.a.i(nxo.class)).d;
        this.t = new aezy(new ngz(this, 13));
        nex.a.a();
        qrn qrnVarE = this.d;
        if (qrnVarE == null) {
            yph yphVar2 = kio.a;
            qrnVarE = ((kio) mki.a.i(kio.class)).e();
            qrnVarE.getClass();
        }
        qrnVarE.getClass();
        this.q = !kfn.q(qrnVarE) ? new eqm(null) : new ney(qrnVarE);
        this.r = nfqVar.a().c;
    }

    public final eqj a() {
        return (eqj) this.s.a();
    }

    public final eqj b() {
        return (eqj) this.t.a();
    }

    public oal() {
        neo neoVarA = neo.a.a();
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(neoVarA, new nns(new mzx(eqlVar, affqVar, 14), 5));
        this(eqlVar, nev.a.a().a(), null);
    }
}
