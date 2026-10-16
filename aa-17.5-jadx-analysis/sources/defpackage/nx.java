package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class nx implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nx(agg aggVar, int i) {
        this.b = i;
        this.a = aggVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v24, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [fbg, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                eww ewwVar = new eww();
                ((ob) this.a).r().aa().s(ewwVar);
                return ewwVar;
            case 1:
                return new jyk(((ob) this.a).l);
            case 2:
                ?? r6 = this.a;
                ob obVar = (ob) r6;
                return new erh(obVar.getApplication(), r6, obVar.getIntent() != null ? obVar.getIntent().getExtras() : null);
            case 3:
                Object obj = this.a;
                bii biiVar = new bii(new ne(obj, 3, null == true ? 1 : 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!affa.f(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new af(obj, (Object) biiVar, 12, (byte[]) (null == true ? 1 : 0)));
                        return biiVar;
                    }
                    ((ob) obj).z(biiVar);
                }
                return biiVar;
            case 4:
                eww ewwVar2 = new eww();
                ((oc) this.a).r().aa().s(ewwVar2);
                return ewwVar2;
            case 5:
                return new bii(new ne(this.a, 4, null == true ? 1 : 0));
            case 6:
                return new oo((bii) this.a);
            case 7:
                return ((agg) this.a).g();
            case 8:
                aft aftVar = acl.a;
                adb adbVar = (adb) this.a;
                adbVar.g(acw.a);
                adbVar.r.e();
                adbVar.b = 0L;
                adbVar.c = 1.0f;
                adbVar.d = 1.0f;
                sm smVar = adbVar.s;
                if (smVar != null) {
                    smVar.e();
                }
                adbVar.e = roc.aA(0.5f, 0.5f);
                adbVar.f = 0L;
                sm smVar2 = adbVar.t;
                adbVar.p = null;
                adbVar.q = null;
                adbVar.u = null;
                adbVar.j(null);
                return afak.a;
            case 9:
                return Float.valueOf(afp.c(this.a.c()));
            case 10:
                ((aed) this.a).d = false;
                return afak.a;
            case 11:
                ((aed) this.a).d = false;
                return afak.a;
            case 12:
                agg aggVar = (agg) this.a;
                return Boolean.valueOf(!affa.f(aggVar.g(), aggVar.e()) || aggVar.v() || ((Boolean) aggVar.d.a()).booleanValue());
            case 13:
                return Long.valueOf(((agg) this.a).a());
            case 14:
                ?? r62 = this.a;
                akg akgVar = (akg) bzi.x(r62, aki.a);
                if (!(akgVar instanceof akm)) {
                    Objects.toString(akgVar);
                    asl.c("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: ".concat(String.valueOf(akgVar)));
                }
                air airVar = (air) r62;
                akm akmVar = airVar.c;
                airVar.c = (akm) akgVar;
                if (akmVar != null && !affa.f(airVar.c, akmVar)) {
                    airVar.v();
                }
                return afak.a;
            case 15:
                ((air) this.a).u();
                return true;
            case 16:
                ((ako) this.a).h();
                return afak.a;
            case 17:
                return new cja(((ako) this.a).m);
            case 18:
                cst cstVar = (cst) ((ako) this.a).l.a();
                return new cja(cstVar != null ? cstVar.j(0L) : 9205357640488583168L);
            case 19:
                return Float.valueOf(((alf) this.a).a.c());
            default:
                return Float.valueOf(((alf) this.a).a.b());
        }
    }

    public /* synthetic */ nx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
