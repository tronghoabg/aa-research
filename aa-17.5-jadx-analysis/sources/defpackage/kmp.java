package defpackage;

import com.google.android.gms.car.CarCall;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kmp implements svv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.svv
    public final void e(Object obj) {
        CarCall.Details details;
        switch (this.b) {
            case 0:
                ((kmr) this.a).e.set((ExperimentTokens) obj);
                break;
            case 1:
                ((kmr) this.a).d.set((ExperimentTokens) obj);
                break;
            case 2:
                mjv.y(thd.d, (CarCall) this.a);
                break;
            case 3:
                yph yphVar = the.a;
                ygp ygpVar = new ygp();
                for (CarCall carCall : (List) obj) {
                    if (carCall.e != 7 && ((details = carCall.f) == null || (details.i & 256) != 256)) {
                        ygpVar.c(carCall);
                    }
                }
                thc thcVar = (thc) this.a;
                thcVar.c = ygpVar.g();
                thcVar.a();
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                yph yphVar2 = the.a;
                bool.booleanValue();
                thc thcVar2 = (thc) this.a;
                thcVar2.e = bool;
                thcVar2.a();
                break;
            case 5:
                Integer num = (Integer) obj;
                yph yphVar3 = the.a;
                num.intValue();
                thc thcVar3 = (thc) this.a;
                thcVar3.g = num;
                thcVar3.a();
                break;
            case 6:
                Integer num2 = (Integer) obj;
                yph yphVar4 = the.a;
                num2.intValue();
                thc thcVar4 = (thc) this.a;
                thcVar4.f = num2;
                thcVar4.a();
                break;
            case 7:
                mjv.y(thd.e, (CarCall) this.a);
                break;
            default:
                mjv.y(thd.c, (CarCall) this.a);
                break;
        }
    }
}
