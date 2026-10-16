package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class acm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acm(int i) {
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r5v32, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v54, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v56, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [bym, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return a.ak((cuo) this.a, (cun) obj);
            case 1:
                agc agcVar = (agc) obj;
                acc accVar = acc.a;
                acc accVar2 = acc.b;
                boolean zH = agcVar.h(accVar, accVar2);
                Object obj2 = this.a;
                if (zH) {
                    adj adjVar = ((aco) obj2).e.b.b;
                    return adjVar != null ? adjVar.b : acl.d;
                }
                if (!agcVar.h(accVar2, acc.c)) {
                    return acl.d;
                }
                adj adjVar2 = ((aco) obj2).f.b.b;
                return adjVar2 != null ? adjVar2.b : acl.d;
            case 2:
                return a.ak((cuo) this.a, (cun) obj);
            case 3:
                agc agcVar2 = (agc) obj;
                acc accVar3 = acc.a;
                acc accVar4 = acc.b;
                boolean zH2 = agcVar2.h(accVar3, accVar4);
                Object obj3 = this.a;
                if (zH2) {
                    acd acdVar = ((adp) obj3).b.b;
                    return acl.c;
                }
                if (!agcVar2.h(accVar4, acc.c)) {
                    return acl.c;
                }
                adm admVar = ((adp) obj3).c.b.e;
                return acl.c;
            case 4:
                Long l = (Long) obj;
                l.longValue();
                return this.a.invoke(l);
            case 5:
                return new agj(this.a, 1);
            case 6:
                return new agj(this.a, 0);
            case 7:
                Object obj4 = this.a;
                deb debVar = ddx.a;
                List listSingletonList = Collections.singletonList(obj4);
                listSingletonList.getClass();
                ((dec) obj).a(debVar, listSingletonList);
                return afak.a;
            case 8:
                ajx ajxVar = (ajx) obj;
                if (affa.f(ajxVar.d(), "waiting")) {
                    ((affv) this.a).a = ajxVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                cyz cyzVar = (cyz) obj;
                if (!(cyzVar instanceof ajy)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) this.a.invoke(((ajy) cyzVar).a);
                bool.booleanValue();
                return bool;
            case 10:
                Object obj5 = this.a;
                dec decVar = (dec) obj;
                deb debVar2 = ddx.a;
                List listSingletonList2 = Collections.singletonList(obj5);
                listSingletonList2.getClass();
                decVar.a(debVar2, listSingletonList2);
                decVar.a(ddx.A, new ddo(5));
                return afak.a;
            case 11:
                float fFloatValue = ((Float) obj).floatValue();
                alh alhVar = (alh) this.a;
                float fC = alhVar.c() + fFloatValue + alhVar.c;
                float fD = afpt.d(fC, BitmapDescriptorFactory.HUE_RED, alhVar.b());
                float fC2 = fD - alhVar.c();
                int iRound = Math.round(fC2);
                alhVar.f(alhVar.c() + iRound);
                alhVar.c = fC2 - iRound;
                if (fC != fD) {
                    fFloatValue = fC2;
                }
                return Float.valueOf(fFloatValue);
            case 12:
                this.a.invoke();
                return afak.a;
            case 13:
                cqu cquVar = (cqu) obj;
                this.a.invoke(cquVar, new cja(tl.p(cquVar)));
                cquVar.b();
                return afak.a;
            case 14:
                ajx ajxVar2 = (ajx) obj;
                afeh afehVar = aoi.a;
                return Boolean.valueOf(ajxVar2 instanceof aog ? ((Boolean) this.a.invoke(ajxVar2)).booleanValue() : true);
            case 15:
                return Boolean.valueOf(ca.aF((aqk) this.a, Float.intBitsToFloat((int) (4294967295L & ((aps) obj).a))));
            case 16:
                Float f = (Float) obj;
                f.floatValue();
                return Float.valueOf(((Number) ((afec) this.a.a()).invoke(f)).floatValue());
            case 17:
                long j = ((cja) obj).a;
                aqk aqkVar = (aqk) this.a;
                return new cja(aqkVar.c(aqkVar.h, j, aqkVar.g));
            case 18:
                return Boolean.valueOf(ca.aF((aqk) this.a, Float.intBitsToFloat((int) (4294967295L & ((aps) obj).a))));
            case 19:
                ((cun) obj).x((cuo) this.a, 0, 0);
                return afak.a;
            default:
                ((cun) obj).x((cuo) this.a, 0, 0);
                return afak.a;
        }
    }

    public /* synthetic */ acm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
