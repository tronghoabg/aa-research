package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Accelerometer;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.car.app.hardware.info.Compass;
import androidx.car.app.hardware.info.Gyroscope;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class sd implements rw {
    private static final CarValue a = new CarValue(null, 0, 2);

    public sd() {
        CarValue carValue = a;
        new Accelerometer(carValue);
        new HashMap();
        new Gyroscope(carValue);
        new HashMap();
        new Compass(carValue);
        new HashMap();
        new CarHardwareLocation(new CarValue(null, 0L, 2));
        new HashMap();
    }
}
