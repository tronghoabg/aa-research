package defpackage;

import com.google.android.gms.car.control.CarPropertyState;

/* loaded from: classes2.dex */
public final class kkg {
    private static final yph a = yph.c("GH.CarPropertyState");

    public static final kkf a(CarPropertyState carPropertyState) {
        int i = carPropertyState.c;
        if (i != 1) {
            ((ype) a.h()).K("Car property %s has non-available status %s", carPropertyState.a, i);
        }
        if (i != 0) {
            if (i == 1) {
                return new kkc(carPropertyState.b.a);
            }
            if (i != 2) {
                if (i == 3) {
                    return kkd.a;
                }
                throw new IllegalStateException(a.bp(i, "Unexpected car property status: "));
            }
        }
        return kke.a;
    }

    public static final Object b(kkf kkfVar) {
        kkfVar.getClass();
        if (kkfVar instanceof kkc) {
            return ((kkc) kkfVar).a;
        }
        return null;
    }
}
