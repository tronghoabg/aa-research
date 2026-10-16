package defpackage;

import android.util.ArrayMap;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;
import com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class imc {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("CAR.SERVICE");
    private final Map d = new ArrayMap();
    public final yks a = new yez(null);

    public final synchronized CarRegionGroup a(CarRegionId carRegionId) {
        return (CarRegionGroup) this.d.get(carRegionId);
    }

    public final synchronized yfq b(CarRegionId carRegionId) {
        CarRegionGroup carRegionGroup = (CarRegionGroup) this.d.get(carRegionId);
        if (carRegionGroup == null) {
            int i = yfq.d;
            return yls.a;
        }
        ArrayList arrayList = new ArrayList(((yby) this.a).c(carRegionGroup));
        arrayList.remove(carRegionId);
        return yfq.o(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        eqy.f(carActivityLayoutConfig);
        yfq yfqVarA = carActivityLayoutConfig.a();
        int size = yfqVarA.size();
        int i2 = 0;
        while (i2 < size) {
            CarDisplayLayoutConfig carDisplayLayoutConfig = (CarDisplayLayoutConfig) yfqVarA.get(i2);
            CarDisplayId carDisplayId = carDisplayLayoutConfig.a;
            yks yksVar = this.a;
            Collection.EL.removeIf(yksVar.x(), new imb(carDisplayId, 1));
            Map map = this.d;
            Collection.EL.removeIf(map.values(), new imb(carDisplayId, 0));
            yfq yfqVarA2 = carDisplayLayoutConfig.a();
            int size2 = yfqVarA2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (CarActivityRegionLayoutConfig) yfqVarA2.get(i3);
                    CarRegionGroup carRegionGroup = carActivityRegionLayoutConfig.e;
                    if (carRegionGroup != null) {
                        yph yphVar = c;
                        CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                        ((ype) yphVar.l().ai((char) 411)).M("Adding region %s to group %s", carRegionId, carRegionGroup);
                        map.put(carRegionId, carRegionGroup);
                        yksVar.t(carRegionGroup, carRegionId);
                    }
                    i3++;
                }
            }
            i2 = i;
        }
        ((ype) ((ype) c.f()).ai(410)).y("Updated region groups: %s", this.a);
    }

    public final synchronized boolean d(CarRegionId carRegionId) {
        if (carRegionId == null) {
            return false;
        }
        if (!carRegionId.a()) {
            if (!b(new CarRegionId(0, carRegionId.h)).contains(carRegionId)) {
                return false;
            }
        }
        return true;
    }
}
