package defpackage;

import android.content.ComponentName;
import com.google.android.gms.car.display.CarRegionId;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class nji implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nji(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                njj njjVar = njp.a;
                return afak.a;
            case 1:
                ComponentName componentName = (ComponentName) obj;
                njj njjVar2 = njp.a;
                componentName.getClass();
                String strFlattenToString = componentName.flattenToString();
                strFlattenToString.getClass();
                return strFlattenToString;
            case 2:
                mqc mqcVar = (mqc) obj;
                njj njjVar3 = njp.a;
                mqcVar.getClass();
                return mqcVar.a;
            case 3:
                njp.b.l().y("Media and InCall hotseat updated to %s", (nmj) obj);
                return obj;
            case 4:
                njp.b.l().y("Nav hotseat type %s", (njk) obj);
                return obj;
            case 5:
                njp.b.l().y("Nav hotseat updated to %s", (nmj) obj);
                return obj;
            case 6:
                mqc mqcVar2 = (mqc) obj;
                mqcVar2.getClass();
                return Boolean.valueOf(mqcVar2.b == mpz.b);
            case 7:
                Map map = (Map) obj;
                map.getClass();
                mqc mqcVar3 = (mqc) map.get(CarRegionId.a);
                if (mqcVar3 != null) {
                    return mqcVar3.a();
                }
                return null;
            case 8:
                njp.b.l().y("Primary region app %s", (ComponentName) obj);
                return obj;
            case 9:
                njp.b.l().y("Recent app hotseat updated to %s", (nmj) obj);
                return obj;
            case 10:
                njp.b.l().y("Media and InCall hotseat updated to %s", (nmj) obj);
                return obj;
            case 11:
                njp.b.l().y("Phone hotseat updated to %s", (nmj) obj);
                return obj;
            case 12:
                njp.b.l().y("Media hotseat updated to %s", (nmj) obj);
                return obj;
            case 13:
                ((Boolean) obj).booleanValue();
                return afak.a;
            case 14:
                ((Boolean) obj).booleanValue();
                return afak.a;
            case 15:
                nkl.a.l().y("currentFanDirectionState: %s", (kkf) obj);
                return obj;
            case 16:
                nkl.a.l().y("Allowed Directions: %s", (Set) obj);
                return obj;
            case 17:
                noq noqVar = (noq) obj;
                noqVar.getClass();
                int iOrdinal = noqVar.ordinal();
                if (iOrdinal == 0) {
                    return nko.b;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return nko.a;
                }
                throw new aezs();
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nko nkoVar = nko.d;
                if (zBooleanValue) {
                    return nkoVar;
                }
                return null;
            case 19:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                nko nkoVar2 = nko.c;
                if (zBooleanValue2) {
                    return nkoVar2;
                }
                return null;
            default:
                ((Boolean) obj).booleanValue();
                return afak.a;
        }
    }
}
