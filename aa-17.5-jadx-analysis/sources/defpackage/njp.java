package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class njp extends lhf {
    public static final njj a = new njj();
    public static final yph b = yph.c("GH.RailHotseatLD");
    public static final afgl c = new nfm(mki.b, 3);
    public final eqj i;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    private aezr u;
    private eqj v;
    private eqj w;
    private eqj x;
    public final SharedPreferences d = ((mkq) mki.a.i(mkq.class)).a().b;
    private final aezr q = new aezy(new ngz(this, 4));
    public final nmk e = new nmk(null);
    private final aezr r = new aezy(new ngz(this, 5));
    private final aezr s = new aezy(new ngz(this, 6));
    private final aezr t = new aezy(new ngz(this, 7));
    public final aezr f = new aezy(new mkj(17));
    public final eqj g = ((lgx) mki.a.i(lgx.class)).a(mpz.d);
    public final eqj h = ((lgx) mki.a.i(lgx.class)).a(mpz.c);

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    public njp() {
        lgx lgxVar = (lgx) mki.a.i(lgx.class);
        mpz mpzVar = mpz.b;
        eqj eqjVarA = lgxVar.a(mpzVar);
        this.i = eqjVarA;
        eqj eqjVarE = mpm.e();
        this.k = eqjVarE;
        eqjVarA.getClass();
        ltk ltkVar = new ltk(12);
        afco afcoVar = tby.a;
        this.l = tby.a(eqjVarE, eqy.b(eqjVarA, ltkVar));
        yph yphVar = mpd.a;
        mpc mpcVar = ((mpd) mki.a.i(mpd.class)).h;
        this.m = mpcVar;
        ltk ltkVar2 = new ltk(10);
        mpcVar.getClass();
        int i = 13;
        this.n = eqy.b(eqy.b(mpcVar, ltkVar2), new njq(mpzVar, i));
        eqj eqjVar = (eqj) ((nfh) mki.a.i(nfh.class)).a;
        this.o = eqjVar;
        ltk ltkVar3 = new ltk(11);
        eqjVar.getClass();
        this.p = eqy.b(eqy.b(eqjVar, ltkVar3), new ltk(i));
    }

    public static final boolean m(ComponentName componentName, qrn qrnVar) {
        return nrz.e().g(componentName) && Collection.EL.stream(lem.a().e(qrnVar, nyj.a())).map(new mix(new nji(2), 6)).anyMatch(new mqu(new niw(componentName, 16), 3));
    }

    public static final boolean o(nsv nsvVar) {
        return nsr.c().b().m() == nsvVar;
    }

    public static final void p(yzy yzyVar, ComponentName componentName) {
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.RAIL, yzyVar);
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
    }

    public static final yzy q(njk njkVar, boolean z) {
        njk njkVar2 = njk.a;
        if (njkVar == njkVar2 && z) {
            return yzy.HW;
        }
        if (njkVar == njkVar2) {
            return yzy.HN;
        }
        njk njkVar3 = njk.d;
        if (njkVar == njkVar3 && z) {
            return yzy.HW;
        }
        if (njkVar == njkVar3) {
            return yzy.HS;
        }
        njk njkVar4 = njk.c;
        if (njkVar == njkVar4 && z) {
            return yzy.HU;
        }
        if (njkVar == njkVar4) {
            return yzy.HP;
        }
        if (njkVar == njk.b) {
            return yzy.HQ;
        }
        if (njkVar == njk.f) {
            return yzy.Ib;
        }
        if (njkVar == njk.e) {
            return yzy.Ia;
        }
        if (njkVar == njk.h) {
            return yzy.Ic;
        }
        if (njkVar == njk.g) {
            return yzy.HY;
        }
        Objects.toString(njkVar);
        throw new IllegalArgumentException("Can't create telemetry for type ".concat(njkVar.toString()));
    }

    public static final ComponentName r(ComponentName componentName) {
        if (kio.b().q()) {
            if (componentName != null) {
                qrn qrnVarE = kio.b().e();
                qrnVarE.getClass();
                if (!m(componentName, qrnVarE)) {
                }
            }
            return null;
        }
        return componentName;
    }

    public static final ComponentName s() {
        if (kio.b().q()) {
            return r(map.a(kio.b().e(), true));
        }
        return null;
    }

    public static final boolean t() {
        if ((o(nsv.a) || o(nsv.g) || o(nsv.h)) && !nsr.c().b().H()) {
            return false;
        }
        khc.t(new wci("GH.RailHotseatLD", yzz.RAIL, yzy.eT, "Unable to stop main activity", new Object[0]), new ngv(7));
        return true;
    }

    private final void u() {
        if (this.u == null) {
            this.u = woy.dG(new njb(this, 0));
        }
    }

    private static final aezu v(ComponentName componentName) {
        nur nurVar;
        Object next;
        oga ogaVar = ogb.a;
        if (ogaVar.c() && kio.b().r()) {
            mqc mqcVarA = lem.a().a(kio.b().e(), new mqb(componentName, (byte[]) null));
            if ((mqcVarA != null ? mqcVarA.b : null) == mpz.c) {
                ofs ofsVarA = ofs.a.a();
                ComponentName componentNameA = mkn.b;
                if (affa.f(componentName, componentNameA)) {
                    mqc mqcVarA2 = ogaVar.a().a();
                    if (mqcVarA2 != null) {
                        componentNameA = mqcVarA2.a();
                    } else {
                        componentNameA.getClass();
                    }
                } else {
                    componentNameA = componentName;
                }
                List list = (List) ofsVarA.d.e();
                if (list != null) {
                    ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nuh) it.next()).c);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (affa.f(((nur) next).f, componentNameA.getPackageName())) {
                            break;
                        }
                    }
                    nurVar = (nur) next;
                } else {
                    nurVar = null;
                }
                GhIcon ghIcon = nurVar != null ? nurVar.d : null;
                if (ghIcon != null) {
                    return new aezu(ghIcon, nurVar.b);
                }
            }
        }
        return new aezu(GhIcon.j(componentName), null);
    }

    public final eqj a(eqj eqjVar, njk njkVar, ComponentName componentName, boolean z) {
        return tby.u(tby.E(tby.e(eqjVar, this.o, ogb.a.c() ? ofs.a.a().d : tby.b, new nja(this, componentName, njkVar, z, 0))), kgq.l());
    }

    public final eqj b() {
        return (eqj) this.s.a();
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        eqj eqjVar;
        super.c();
        SharedPreferences sharedPreferences = this.d;
        int i = 0;
        if (!sharedPreferences.getBoolean("RecentAppsMigratedToUserSettings", false)) {
            Context context = mki.a.c;
            context.getClass();
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("RailHotseat_Pref_File", 0);
            String string = sharedPreferences2.getString("RailHotseat_Recent_Apps_Key", null);
            String string2 = sharedPreferences2.getString("RailHotseat_Previous_App_Component_Name_Key", null);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            if (!sharedPreferences.contains("RailHotseat_Recent_Apps_Key") && string != null) {
                editorEdit.putString("RailHotseat_Recent_Apps_Key", string);
            }
            if (!sharedPreferences.contains("RailHotseat_Previous_App_Component_Name_Key") && string2 != null) {
                editorEdit.putString("RailHotseat_Previous_App_Component_Name_Key", string2);
            }
            editorEdit.putBoolean("RecentAppsMigratedToUserSettings", true);
            editorEdit.apply();
        }
        u();
        aezr aezrVar = this.u;
        if (aezrVar == null || (eqjVar = (eqj) aezrVar.a()) == null) {
            return;
        }
        eqjVar.fE(this, new nns(new nji(i), 1));
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        eqj eqjVar;
        super.d();
        aezr aezrVar = this.u;
        if (aezrVar != null && (eqjVar = (eqj) aezrVar.a()) != null) {
            eqjVar.l(this);
        }
        this.u = null;
        this.v = null;
        this.x = null;
        this.w = null;
    }

    public final eqj e() {
        return (eqj) this.q.a();
    }

    public final eqj f() {
        return (eqj) this.t.a();
    }

    public final eqj g() {
        return (eqj) this.r.a();
    }

    public final eqj h(eqj eqjVar) {
        eqjVar.getClass();
        if (this.v == null) {
            this.v = eqjVar;
        }
        u();
        eqj eqjVar2 = this.x;
        if (eqjVar2 != null) {
            return eqjVar2;
        }
        eqj eqjVar3 = ogb.a.c() ? ofs.a.a().d : tby.b;
        eqj eqjVarA = lix.b().a();
        eqjVarA.getClass();
        aezr aezrVar = this.u;
        if (aezrVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eqj eqjVarE = tby.E(tby.g(eqjVarA, eqjVar, (eqj) aezrVar.a(), this.o, eqjVar3, new afej() { // from class: njd
            @Override // defpackage.afej
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                List list = (List) obj3;
                mqc mqcVar = (mqc) obj4;
                list.getClass();
                int i = true == acxa.U() ? 3 : 1;
                afbt afbtVar = new afbt(10);
                for (int i2 = 0; i2 < i; i2++) {
                    ComponentName componentName = (ComponentName) woy.bI(list, i2);
                    if (zBooleanValue && i2 == 0) {
                        componentName = mkn.v;
                    }
                    ComponentName componentName2 = componentName;
                    ComponentName componentNameA = mqcVar != null ? mqcVar.a() : null;
                    njp njpVar = this.a;
                    njk njkVar = njk.g;
                    bool.getClass();
                    afbtVar.add(njpVar.j(componentName2, componentNameA, njkVar, false, bool.booleanValue()));
                }
                return afbtVar.f();
            }
        }));
        this.x = eqjVarE;
        return eqjVarE;
    }

    public final eqj i(eqj eqjVar) {
        eqjVar.getClass();
        if (this.v == null) {
            this.v = eqjVar;
        }
        u();
        eqj eqjVar2 = this.w;
        if (eqjVar2 != null) {
            return eqjVar2;
        }
        afco afcoVar = tby.a;
        eqj eqjVarV = tby.v(eqy.a(tby.v(h(eqjVar), new ndo(19))), new nji(9));
        this.w = eqjVarV;
        return eqjVarV;
    }

    public final nmj j(final ComponentName componentName, ComponentName componentName2, final njk njkVar, final boolean z, boolean z2) {
        mqc mqcVarA;
        if (componentName == null) {
            return kgq.l();
        }
        if (affa.f(componentName, componentName2)) {
            aezu aezuVarV = v(componentName);
            return new nmj((GhIcon) aezuVarV.a, componentName, (GhIcon) aezuVarV.b, null, false, new afdr() { // from class: njc
                @Override // defpackage.afdr
                public final Object invoke() throws qrz {
                    yzy yzyVar;
                    mub mubVar = mud.h;
                    if (mubVar.a().v() && njp.o(nsv.e)) {
                        njp njpVar = this.a;
                        mki.a.g();
                        ols.f(kio.b().e(), CarDisplayId.a, (ProjectionWindowAnimationChoreography) njpVar.f.a());
                    }
                    boolean zT = njp.t();
                    if (mubVar.a().v()) {
                        njp.b.l().u("Showing dashboard and starting nav app if applicable (canonical/shortrait)");
                        mubVar.a().o(true);
                    } else if (!zT) {
                        ComponentName componentNameS = njp.s();
                        njp.b.l().y("Not showing dashboard, attempting to start default nav app %s", componentNameS);
                        if (componentNameS != null) {
                            mpe.a().i(new Intent().setComponent(componentNameS));
                        }
                    }
                    boolean z3 = z;
                    njk njkVar2 = njkVar;
                    njk njkVar3 = njk.a;
                    if (njkVar2 == njkVar3 && z3) {
                        yzyVar = yzy.HX;
                    } else if (njkVar2 == njkVar3) {
                        yzyVar = yzy.HO;
                    } else {
                        njk njkVar4 = njk.d;
                        if (njkVar2 == njkVar4 && z3) {
                            yzyVar = yzy.HX;
                        } else if (njkVar2 == njkVar4) {
                            yzyVar = yzy.HT;
                        } else {
                            njk njkVar5 = njk.c;
                            if (njkVar2 == njkVar5 && z3) {
                                yzyVar = yzy.HV;
                            } else if (njkVar2 == njkVar5) {
                                yzyVar = yzy.HR;
                            } else {
                                if (njkVar2 != njk.g) {
                                    Objects.toString(njkVar2);
                                    throw new IllegalArgumentException("Can't create telemetry for type ".concat(njkVar2.toString()));
                                }
                                yzyVar = yzy.HZ;
                            }
                        }
                    }
                    njp.p(yzyVar, componentName);
                    return afak.a;
                }
            });
        }
        boolean z3 = false;
        if (lzf.c() && !z2 && (mqcVarA = lem.a().a(kio.b().e(), new mqb(componentName, (byte[]) null))) != null && mqcVarA.c) {
            z3 = true;
        }
        return k(componentName, njkVar, false, z, z3);
    }

    public final nmj k(final ComponentName componentName, final njk njkVar, final boolean z, final boolean z2, final boolean z3) {
        aezu aezuVarV = v(componentName);
        return new nmj((GhIcon) aezuVarV.a, componentName, (GhIcon) aezuVarV.b, null, z3, new afdr() { // from class: njh
            @Override // defpackage.afdr
            public final Object invoke() {
                if (z && !z3) {
                    njp.t();
                }
                boolean z4 = z2;
                njk njkVar2 = njkVar;
                ComponentName componentName2 = componentName;
                mpe.a().i(new Intent().setComponent(componentName2));
                njp.p(njp.q(njkVar2, z4), componentName2);
                return afak.a;
            }
        });
    }

    public final void l(List list) {
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.getClass();
        editorEdit.putString("RailHotseat_Recent_Apps_Key", woy.cu(woy.cd(list, 3), ",", null, null, new nji(1), 30));
        editorEdit.apply();
    }

    public final void n(ComponentName componentName) {
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.getClass();
        editorEdit.putString("RailHotseat_Previous_App_Component_Name_Key", componentName.flattenToString());
        editorEdit.apply();
    }
}
