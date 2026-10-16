package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class azl implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ azl(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return affa.b(((axk) obj).a, ((axk) obj2).a);
            case 1:
                int i = ((abmz) obj2).a;
                int i2 = ((abmz) obj).a;
                long j = ayd.a;
                return affa.b(i, i2);
            case 2:
                return affa.b(((bwd) obj).a, ((bwd) obj2).a);
            case 3:
                cxb cxbVar = (cxb) obj;
                cxb cxbVar2 = (cxb) obj2;
                return cxbVar.d() == cxbVar2.d() ? affa.b(cxbVar.f(), cxbVar2.f()) : Float.compare(cxbVar.d(), cxbVar2.d());
            case 4:
                return Integer.valueOf(((det) obj).b).compareTo(Integer.valueOf(((det) obj2).b));
            case 5:
                return Integer.valueOf(((det) obj).b).compareTo(Integer.valueOf(((det) obj2).b));
            case 6:
                afha afhaVar = (afha) obj;
                afha afhaVar2 = (afha) obj2;
                return (afhaVar.b - afhaVar.a) - (afhaVar2.b - afhaVar2.a);
            case 7:
                return affa.x(((dhz) obj).a(), ((dhz) obj2).a());
            case 8:
                yph yphVar = ina.a;
                jhq jhqVarX = ((jhf) obj).x();
                jhq jhqVarX2 = ((jhf) obj2).x();
                if (jhqVarX == null && jhqVarX2 == null) {
                    return 0;
                }
                if (jhqVarX == null) {
                    return -1;
                }
                if (jhqVarX2 == null) {
                    return 1;
                }
                return jhqVarX2.g - jhqVarX.g;
            case 9:
                return affa.x(((nuh) obj2).c.a, ((nuh) obj).c.a);
            case 10:
                return new afah(((tdi) obj).e).compareTo(new afah(((tdi) obj2).e));
            case 11:
                yrs yrsVarA = yrs.a(obj);
                yrs yrsVarA2 = yrs.a(obj2);
                if (yrsVarA != yrsVarA2) {
                    return yrsVarA.compareTo(yrsVarA2);
                }
                int iOrdinal = yrsVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
