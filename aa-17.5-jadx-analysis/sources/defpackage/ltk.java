package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.gms.car.display.CarRegionId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ltk implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ ltk(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ltp ltpVar = (ltp) obj;
                ltpVar.getClass();
                return ltpVar.f();
            case 1:
                ltp ltpVar2 = (ltp) obj;
                ltpVar2.getClass();
                return ltpVar2.d();
            case 2:
                ltp ltpVar3 = (ltp) obj;
                ltpVar3.getClass();
                return ltpVar3.e();
            case 3:
                ltp ltpVar4 = (ltp) obj;
                ltpVar4.getClass();
                return ltpVar4.b();
            case 4:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return Boolean.valueOf(lem.b(aaPlaybackState, 2L));
            case 5:
                AaPlaybackState aaPlaybackState2 = (AaPlaybackState) obj;
                aaPlaybackState2.getClass();
                return Integer.valueOf(aaPlaybackState2.Q());
            case 6:
                qsw qswVar = (qsw) obj;
                msf msfVar = msh.a;
                qswVar.getClass();
                qswVar.l = true;
                qswVar.m = 192;
                qswVar.e();
                return afak.a;
            case 7:
                nsv nsvVar = (nsv) obj;
                nsvVar.getClass();
                if (nsvVar != nsv.e) {
                    return mpm.e();
                }
                eqj eqjVarA = mud.h.a().a();
                muc mucVar = muc.a;
                afco afcoVar = tby.a;
                eqjVarA.getClass();
                return eqy.b(eqjVarA, new njq(mucVar, 13));
            case 8:
                Map map = (Map) obj;
                map.getClass();
                mqc mqcVar = (mqc) map.get(CarRegionId.a);
                if (mqcVar != 0 && mqcVar.b != mpz.b) {
                    componentName = mqcVar;
                }
                return Boolean.valueOf(componentName == null);
            case 9:
                muh muhVar = (muh) obj;
                int i = muh.d;
                muhVar.getClass();
                if (lec.a.a().f()) {
                    yph yphVar = nsr.a;
                    if (((nsr) mki.a.i(nsr.class)).b().M()) {
                        return muhVar.b;
                    }
                }
                return muhVar.c;
            case 10:
                Map map2 = (Map) obj;
                njj njjVar = njp.a;
                map2.getClass();
                mqc mqcVar2 = (mqc) map2.get(nsr.c().b().r(nsn.s));
                if (mqcVar2 != null) {
                    return mqcVar2.b;
                }
                return null;
            case 11:
                mqc mqcVar3 = (mqc) obj;
                njj njjVar2 = njp.a;
                return Boolean.valueOf((mqcVar3 == null || mqcVar3.b == mpz.b) ? false : true);
            case 12:
                ComponentName componentName = (ComponentName) obj;
                njj njjVar3 = njp.a;
                return Boolean.valueOf(componentName != null ? lem.a().i(mpl.b(componentName)) : false);
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                njp.b.l().y("Main content covering maps: %s", bool);
                return obj;
            case 14:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((kjl) obj2).b().contains(2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list2) {
                    int iA = ((kjl) obj3).a();
                    njr njrVar = iA != 2 ? iA != 3 ? njr.c : njr.b : njr.a;
                    Object arrayList2 = linkedHashMap.get(njrVar);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(njrVar, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                return linkedHashMap;
            case 16:
                aezu aezuVar = (aezu) obj;
                aezuVar.getClass();
                return (List) aezuVar.a;
            case 17:
                aezu aezuVar2 = (aezu) obj;
                aezuVar2.getClass();
                return (List) aezuVar2.b;
            case 18:
                nxs nxsVar = (nxs) obj;
                yph yphVar2 = njw.a;
                nxsVar.getClass();
                return Boolean.valueOf(!nxsVar.a && nxsVar.b > 0);
            case 19:
                Map map3 = (Map) obj;
                yph yphVar3 = njw.a;
                map3.getClass();
                return (mqc) map3.get(CarRegionId.a);
            default:
                mqc mqcVar4 = (mqc) obj;
                yph yphVar4 = njw.a;
                return Boolean.valueOf(affa.f(mqcVar4 != null ? mqcVar4.a() : null, mkn.s));
        }
    }
}
