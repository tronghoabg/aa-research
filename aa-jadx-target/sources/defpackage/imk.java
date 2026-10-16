package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class imk {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("CAR.SERVICE");
    private final java.util.Map d = new android.util.ArrayMap();
    public final defpackage.ylx a = new defpackage.ygf(null);

    public final synchronized com.google.android.gms.car.display.CarRegionGroup a(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return (com.google.android.gms.car.display.CarRegionGroup) this.d.get(carRegionId);
    }

    public final synchronized defpackage.ygw b(com.google.android.gms.car.display.CarRegionId carRegionId) {
        com.google.android.gms.car.display.CarRegionGroup carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) this.d.get(carRegionId);
        if (carRegionGroup == null) {
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(((defpackage.yde) this.a).c(carRegionGroup));
        arrayList.remove(carRegionId);
        return defpackage.ygw.o(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        defpackage.dmh.J(carActivityLayoutConfig);
        defpackage.ygw ygwVarA = carActivityLayoutConfig.a();
        int size = ygwVarA.size();
        int i2 = 0;
        while (i2 < size) {
            com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA.get(i2);
            com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplayLayoutConfig.a;
            defpackage.ylx ylxVar = this.a;
            j$.util.Collection.-EL.removeIf(ylxVar.x(), new defpackage.imj(carDisplayId, 1));
            java.util.Map map = this.d;
            j$.util.Collection.-EL.removeIf(map.values(), new defpackage.imj(carDisplayId, 0));
            defpackage.ygw ygwVarA2 = carDisplayLayoutConfig.a();
            int size2 = ygwVarA2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA2.get(i3);
                    com.google.android.gms.car.display.CarRegionGroup carRegionGroup = carActivityRegionLayoutConfig.e;
                    if (carRegionGroup != null) {
                        defpackage.yqm yqmVar = c;
                        com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                        ((defpackage.yqj) yqmVar.l().ai((char) 411)).M("Adding region %s to group %s", carRegionId, carRegionGroup);
                        map.put(carRegionId, carRegionGroup);
                        ylxVar.t(carRegionGroup, carRegionId);
                    }
                    i3++;
                }
            }
            i2 = i;
        }
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai(410)).y("Updated region groups: %s", this.a);
    }

    public final synchronized boolean d(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (carRegionId == null) {
            return false;
        }
        return carRegionId.a() || b(new com.google.android.gms.car.display.CarRegionId(0, carRegionId.h)).contains(carRegionId);
    }
}
