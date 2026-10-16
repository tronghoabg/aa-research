package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pmz extends pmx {
    private static final yob c = yob.c("com/google/android/apps/gmm/systems/clientparam/ClientParametersImpl");
    public volatile pnh a;
    public final boolean b;
    private final ygr g;
    private aavp h;
    private pnf i;
    private String j;
    private int k;
    private abms d = abms.d;
    private long e = 0;
    private final Map f = new EnumMap(acef.class);
    private volatile ajzn l = new ajzn();

    public pmz(String str, abms abmsVar, long j, int i, List list, Set set, boolean z) {
        this.g = ygr.n(set);
        this.k = i;
        this.b = z;
        m(str, abmsVar, j, i, list);
    }

    private static pnh n(acdv acdvVar) {
        vaq.d();
        return new pnh(acdvVar);
    }

    private final void o(acef acefVar, aceg acegVar) {
        this.f.put(acefVar, acegVar);
    }

    private static boolean p(boolean z, boolean z2) {
        return z2 && z;
    }

    @Override // defpackage.plz
    public final synchronized aceg a(acef acefVar) {
        return (aceg) this.f.get(acefVar);
    }

    @Override // defpackage.plz
    public final synchronized Map c() {
        return new EnumMap(this.f);
    }

    @Override // defpackage.pnd
    public final synchronized long d() {
        return this.e;
    }

    public final synchronized pnh e() {
        if (this.a == null) {
            aceg acegVarA = a(acef.NAVIGATION);
            this.a = n(acegVarA.c == 3 ? (acdv) acegVarA.d : acdv.a);
        }
        return this.a;
    }

    public final synchronized aavp f() {
        aavp aavpVar;
        aavpVar = this.h;
        if (aavpVar == null) {
            aceg acegVarA = a(acef.NAVIGATION2);
            aavpVar = acegVarA.c == 250 ? (aavp) acegVarA.d : aavp.a;
            this.h = aavpVar;
        }
        return aavpVar;
    }

    @Override // defpackage.pnd
    public final synchronized abms g() {
        return this.d;
    }

    @Override // defpackage.pnd
    public final synchronized String h() {
        return this.j;
    }

    @Override // defpackage.pnd
    public final synchronized List i() {
        ArrayList arrayList;
        vaq.d();
        Map map = this.f;
        arrayList = new ArrayList(map.size());
        for (aceg acegVar : map.values()) {
            abnp abnpVarN = aceg.a.n();
            if ((acegVar.b & 1) != 0) {
                acef acefVarB = acef.b(acegVar.e);
                if (acefVarB == null) {
                    acefVarB = acef.UNKNOWN_TYPE;
                }
                abnpVarN.t();
                aceg acegVar2 = (aceg) abnpVarN.b;
                acegVar2.e = acefVarB.eO;
                acegVar2.b |= 1;
            }
            if ((acegVar.b & 2) != 0) {
                long j = acegVar.f;
                abnpVarN.t();
                aceg acegVar3 = (aceg) abnpVarN.b;
                acegVar3.b |= 2;
                acegVar3.f = j;
            }
            arrayList.add((aceg) abnpVarN.q());
        }
        return arrayList;
    }

    public final synchronized acbu j() {
        abnp abnpVarN;
        abnpVarN = acbu.a.n();
        abnpVarN.ao(this.f.values());
        long j = this.e;
        abnpVarN.t();
        acbu acbuVar = (acbu) abnpVarN.b;
        acbuVar.b |= 4;
        acbuVar.e = j;
        return (acbu) abnpVarN.q();
    }

    @Override // defpackage.pnd
    public final synchronized int k() {
        return this.k;
    }

    final synchronized boolean l(String str) {
        if (Objects.equals(this.j, str)) {
            return false;
        }
        this.j = str;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    final synchronized boolean m(String str, abms abmsVar, long j, int i, List list) {
        boolean z;
        boolean z2;
        acef acefVarB;
        boolean z3;
        aceg acegVar;
        boolean zL;
        vaq.d();
        Map map = this.f;
        boolean zIsEmpty = map.isEmpty();
        vaq.d();
        this.e = j;
        if (acbu.a.c.equals(list) && Objects.equals(this.d, abmsVar)) {
            z2 = false;
        } else {
            if (Objects.equals(this.d, abmsVar)) {
                z = false;
            } else {
                this.d = abmsVar;
                z = true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aceg acegVar2 = (aceg) it.next();
                vaq.d();
                if ((acegVar2.b & 1) != 0) {
                    acefVarB = acef.b(acegVar2.e);
                    if (acefVarB == null) {
                        acefVarB = acef.UNKNOWN_TYPE;
                    }
                } else {
                    acefVarB = null;
                }
                if (this.g.contains(acefVarB)) {
                    if ((acegVar2.b & 2) != 0 || !map.containsKey(acefVarB)) {
                        acef acefVarB2 = acef.b(acegVar2.e);
                        if (acefVarB2 == null) {
                            acefVarB2 = acef.UNKNOWN_TYPE;
                        }
                        acef acefVar = acef.ENABLE_FEATURES;
                        if (acefVarB2 == acefVar && (acegVar = (aceg) map.get(acefVar)) != null) {
                            abnp abnpVarK = acegVar2.K();
                            aasr aasrVar = acegVar.c == 4 ? (aasr) acegVar.d : aasr.a;
                            aasr aasrVar2 = acegVar2.c == 4 ? (aasr) acegVar2.d : aasr.a;
                            vaq.d();
                            abnp abnpVarK2 = aasrVar2.K();
                            boolean zP = p(aasrVar.d, aasrVar2.d);
                            abnpVarK2.t();
                            aasr aasrVar3 = (aasr) abnpVarK2.b;
                            aasrVar3.b |= 1;
                            aasrVar3.d = zP;
                            boolean zP2 = p(aasrVar.e, aasrVar2.e);
                            abnpVarK2.t();
                            aasr aasrVar4 = (aasr) abnpVarK2.b;
                            aasrVar4.b |= 128;
                            aasrVar4.e = zP2;
                            boolean zP3 = p(aasrVar.f, aasrVar2.f);
                            abnpVarK2.t();
                            aasr aasrVar5 = (aasr) abnpVarK2.b;
                            aasrVar5.b |= 256;
                            aasrVar5.f = zP3;
                            boolean zP4 = p(aasrVar.g, aasrVar2.g);
                            abnpVarK2.t();
                            aasr aasrVar6 = (aasr) abnpVarK2.b;
                            aasrVar6.b |= 131072;
                            aasrVar6.g = zP4;
                            boolean zP5 = p(aasrVar.i, aasrVar2.i);
                            abnpVarK2.t();
                            aasr aasrVar7 = (aasr) abnpVarK2.b;
                            aasrVar7.b |= 4194304;
                            aasrVar7.i = zP5;
                            boolean zP6 = p(aasrVar.h, aasrVar2.h);
                            abnpVarK2.t();
                            aasr aasrVar8 = (aasr) abnpVarK2.b;
                            aasrVar8.b |= 262144;
                            aasrVar8.h = zP6;
                            boolean zP7 = p(aasrVar.j, aasrVar2.j);
                            abnpVarK2.t();
                            aasr aasrVar9 = (aasr) abnpVarK2.b;
                            aasrVar9.b |= 8388608;
                            aasrVar9.j = zP7;
                            aasr aasrVar10 = (aasr) abnpVarK2.q();
                            abnpVarK.t();
                            aceg acegVar3 = (aceg) abnpVarK.b;
                            aasrVar10.getClass();
                            acegVar3.d = aasrVar10;
                            acegVar3.c = 4;
                            acegVar2 = (aceg) abnpVarK.q();
                        }
                        o(acefVarB2, acegVar2);
                        int iOrdinal = acefVarB2.ordinal();
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 23) {
                                    if (iOrdinal == 151) {
                                        this.l.f(acegVar2.f);
                                    }
                                } else if (this.i != null) {
                                    this.i = new pnf(acegVar2.c == 23 ? (accl) acegVar2.d : accl.a);
                                }
                            } else if (this.h != null) {
                                this.h = acegVar2.c == 250 ? (aavp) acegVar2.d : aavp.a;
                            }
                        } else if (this.b || this.a != null) {
                            this.a = n(acegVar2.c == 3 ? (acdv) acegVar2.d : acdv.a);
                        }
                        z3 = true;
                    }
                    z |= z3;
                } else {
                    ((ynz) ((ynz) c.d()).ai(6796)).M("%s ParameterGroupProto with type %s is not supported", "ClientParameters", acefVarB);
                }
                z3 = false;
                z |= z3;
            }
            z2 = z;
        }
        zL = l(str) | z2;
        this.k = i;
        if (zIsEmpty) {
            vaq.d();
            yno it2 = this.g.iterator();
            while (it2.hasNext()) {
                acef acefVar2 = (acef) it2.next();
                if (!map.containsKey(acefVar2)) {
                    abnp abnpVarN = aceg.a.n();
                    abnpVarN.t();
                    aceg acegVar4 = (aceg) abnpVarN.b;
                    acegVar4.e = acefVar2.eO;
                    acegVar4.b |= 1;
                    o(acefVar2, (aceg) abnpVarN.q());
                }
            }
        }
        notifyAll();
        return zL;
    }
}
