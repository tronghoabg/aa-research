package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Compass;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jwb extends jvv {
    private static final yph e = yph.c("CarApp.H.Har");

    public jwb(int i, int i2, ruj rujVar) {
        super(i, i2, rujVar, 1);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        if (fArr == null || fArr.length != 3) {
            ((ype) ((ype) e.h()).ai((char) 2801)).u("Invalid compass data from CarService.");
            b(new Compass(new CarValue(null, j, 3)));
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(Float.valueOf(fArr[0]));
        arrayList.add(Float.valueOf(fArr[1]));
        arrayList.add(Float.valueOf(fArr[2]));
        b(new Compass(new CarValue(arrayList, j, 1)));
    }
}
