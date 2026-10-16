package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import androidx.car.app.model.CarColor;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class kut implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kut(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        lwq lwqVar;
        String str;
        Object obj2;
        int i = -1;
        int i2 = 11;
        Object obj3 = null;
        int i3 = 1;
        switch (this.b) {
            case 0:
                mcr mcrVar = (mcr) obj;
                mcrVar.getClass();
                mcrVar.a(new cct(-279952753, true, new juy(this.a, 17)));
                return afak.a;
            case 1:
                mcr mcrVar2 = (mcr) obj;
                mcrVar2.getClass();
                mcrVar2.a(new cct(1377155504, true, new juy(this.a, 18)));
                return afak.a;
            case 2:
                mcr mcrVar3 = (mcr) obj;
                mcrVar3.getClass();
                mcrVar3.b(new cct(-991886629, true, new juy(this.a, 16)));
                return afak.a;
            case 3:
                mcr mcrVar4 = (mcr) obj;
                mcrVar4.getClass();
                mcrVar4.b(new cct(1645972410, true, new juy(this.a, 15)));
                return afak.a;
            case 4:
                axl axlVar = (axl) obj;
                axlVar.getClass();
                this.a.invoke(new kvo(axlVar));
                return afak.a;
            case 5:
                yfu yfuVar = new yfu(4);
                yfuVar.e(this.a, obj);
                return yfuVar.d(true);
            case 6:
                tab tabVar = (tab) obj;
                yph yphVar = kyw.a;
                Object obj4 = this.a;
                if (tabVar == null) {
                    int i4 = yfq.d;
                    ((eqj) obj4).j(yls.a);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (szu szuVar : tabVar.b) {
                        ArrayList arrayList2 = new ArrayList();
                        for (tat tatVar : szuVar.b) {
                            String str2 = tatVar.d;
                            int iAs = a.as(tatVar.e);
                            if (iAs == 0) {
                                iAs = i3;
                            }
                            switch (iAs + i) {
                                case 1:
                                    lwqVar = lwq.b;
                                    break;
                                case 2:
                                    lwqVar = lwq.d;
                                    break;
                                case 3:
                                    lwqVar = lwq.e;
                                    break;
                                case 4:
                                    lwqVar = lwq.f;
                                    break;
                                case 5:
                                    lwqVar = lwq.g;
                                    break;
                                case 6:
                                    lwqVar = lwq.h;
                                    break;
                                default:
                                    lwqVar = lwq.a;
                                    break;
                            }
                            String str3 = tatVar.f;
                            double d = tatVar.g;
                            int i5 = tatVar.b;
                            String str4 = "";
                            if (i5 == 10) {
                                i5 = 10;
                                str = (String) tatVar.c;
                            } else {
                                str = "";
                            }
                            String str5 = i5 == i2 ? (String) tatVar.c : "";
                            Object obj5 = obj4;
                            if (i5 == 12) {
                                str4 = (String) tatVar.c;
                            }
                            arrayList2.add(new lwr(str2, lwqVar, str3, d, new lwp(str, str5, str4, null), false));
                            i = -1;
                            i2 = 11;
                            obj4 = obj5;
                            obj3 = null;
                            i3 = 1;
                        }
                        arrayList.add(arrayList2);
                        i = -1;
                        i2 = 11;
                        i3 = 1;
                    }
                    ((eqj) obj4).j(arrayList);
                }
                return afak.a;
            case 7:
                Boolean bool = (Boolean) obj;
                yph yphVar2 = kyw.a;
                ((ype) yphVar2.l().ai((char) 3610)).y("coolwalkMediaSuggestionsEnabled: %s", bool);
                if (bool.booleanValue()) {
                    return ((kyw) this.a).s;
                }
                ((ype) ((ype) yphVar2.h()).ai((char) 3611)).u("getMediaRecommendations called even though suggestions are not enabled");
                return new eqm(null);
            case 8:
                lod lodVar = (lod) obj;
                lok lokVar = lodVar.b;
                yph yphVar3 = laa.a;
                if (lokVar != lok.b) {
                    return null;
                }
                Object obj6 = this.a;
                ComponentName componentName = lodVar.c.a;
                yph yphVar4 = laa.a;
                ((ype) yphVar4.l().ai((char) 3674)).y("buildMbsComponentName: component=%s", componentName);
                if (obj6 == null) {
                    ((ype) yphVar4.l().ai((char) 3678)).y("Car client token is null, returning same component=%s", componentName);
                } else if (kio.b().q()) {
                    qrn qrnVar = (qrn) obj6;
                    if (Collection.EL.stream(jxg.a().b(qrnVar, nyj.b())).anyMatch(new koh(componentName, 14))) {
                        ComponentName componentNameA = ljp.d().a(componentName, qrnVar);
                        ((ype) yphVar4.l().ai((char) 3675)).y("Found equivalentMbsComponentName=%s", componentNameA);
                        componentName = (ComponentName) Objects.requireNonNullElse(componentNameA, componentName);
                    } else {
                        ((ype) yphVar4.l().ai((char) 3676)).y("Not an external media app. Returning same component=%s", componentName);
                    }
                } else {
                    ((ype) yphVar4.l().ai((char) 3677)).y("Car not connected, returning same component=%s", componentName);
                }
                abnp abnpVarN = osg.a.n();
                osc oscVarA = laa.a(componentName);
                abnpVarN.t();
                osg osgVar = (osg) abnpVarN.b;
                oscVarA.getClass();
                osgVar.c = oscVarA;
                osgVar.b |= 1;
                return (osg) abnpVarN.q();
            case 9:
                return ((loy) this.a).f((ComponentName) obj);
            case 10:
                yph yphVar5 = laa.a;
                return tby.w((eqj) this.a, new kut((qrn) obj, 8));
            case 11:
                lbt lbtVar = (lbt) obj;
                lbtVar.getClass();
                ((ype) lcq.b.f()).y("Received trigger for survey: %s", lbtVar.name());
                if (((lcq) this.a).e.add(lbtVar)) {
                    lda.b.l().y("Survey %s: eligible for survey", lbtVar.name());
                    lnm.M(lbtVar, yzy.FF);
                }
                return afak.a;
            case 12:
                abqw abqwVar = (abqw) obj;
                abqwVar.getClass();
                Instant instantNow = Instant.now();
                instantNow.getClass();
                return lcy.b(this.a, abqwVar, instantNow);
            case 13:
                abqw abqwVar2 = (abqw) obj;
                Instant instantNow2 = Instant.now();
                instantNow2.getClass();
                abpt abptVarQ = abzi.q(instantNow2);
                abqwVar2.getClass();
                abnp abnpVarK = abqwVar2.K();
                abnpVarK.getClass();
                abzi.p(abptVarQ, abnpVarK);
                Iterator<E> it = abzi.m(abnpVarK).iterator();
                int i6 = 0;
                while (true) {
                    obj2 = this.a;
                    if (it.hasNext()) {
                        yzz yzzVarB = yzz.b(((abqx) it.next()).c);
                        if (yzzVarB == null) {
                            yzzVarB = yzz.UNKNOWN_CONTEXT;
                        }
                        if (yzzVarB == ((lbt) obj2).c()) {
                            i = i6;
                        } else {
                            i6++;
                        }
                    }
                }
                if (i >= 0) {
                    abzi.m(abnpVarK);
                    abnp abnpVarK2 = ((abqx) abzi.m(abnpVarK).get(i)).K();
                    abnpVarK2.getClass();
                    abzi.l(abptVarQ, abnpVarK2);
                    abnpVarK.ah(i, abzi.j(abnpVarK2));
                } else {
                    abzi.m(abnpVarK);
                    abnp abnpVarN2 = abqx.a.n();
                    abnpVarN2.getClass();
                    abzi.k(((lbt) obj2).c(), abnpVarN2);
                    abzi.l(abptVarQ, abnpVarN2);
                    abnpVarK.ag(abzi.j(abnpVarN2));
                }
                return abzi.n(abnpVarK);
            case 14:
                abqw abqwVar3 = (abqw) obj;
                abqwVar3.getClass();
                Instant instantNow3 = Instant.now();
                instantNow3.getClass();
                return lcy.b(this.a, abqwVar3, instantNow3);
            case 15:
                Object obj7 = this.a;
                return thq.b(((lkl) obj7).d, new jzi(obj7, (Boolean) obj, i2));
            case 16:
                Boolean bool2 = (Boolean) obj;
                ynz ynzVar = (ynz) lkp.a.f().ai(3990);
                bool2.getClass();
                ynzVar.N("Current tab band %s is playing: %b", this.a, bool2.booleanValue());
                return afak.a;
            case 17:
                lnr lnrVar = (lnr) obj;
                lnrVar.getClass();
                eqj eqjVarB = lnrVar.b(((llu) this.a).i());
                eqjVarB.getClass();
                return eqjVarB;
            case 18:
                obj.getClass();
                boolean z = obj instanceof lkg;
                Object obj8 = this.a;
                if (z) {
                    return ((lkr) obj8).a;
                }
                if (obj instanceof lkm) {
                    return ((lkr) obj8).a;
                }
                if (obj instanceof lkl) {
                    return ((lkr) obj8).c;
                }
                afhe afheVarB = affw.b(obj.getClass());
                java.util.Objects.toString(afheVarB);
                throw new IllegalStateException("Unknown model type ".concat(String.valueOf(afheVarB)));
            case 19:
                Uri uri = (Uri) obj;
                uri.getClass();
                return ((lku) this.a).a.d(uri);
            default:
                tj tjVar = (tj) obj;
                int i7 = lld.a;
                tjVar.getClass();
                tjVar.a((CarColor) this.a);
                return afak.a;
        }
    }
}
