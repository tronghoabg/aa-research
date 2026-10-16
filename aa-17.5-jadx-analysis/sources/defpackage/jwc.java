package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.EnergyLevel;

/* loaded from: classes2.dex */
public final class jwc extends jvv {
    private final boolean e;

    public jwc(int i, int i2, ruj rujVar, boolean z) {
        super(i, i2, rujVar, 5);
        this.e = z;
    }

    static final CarValue c(long j, float[] fArr) {
        float f = fArr[0];
        return Float.isNaN(f) ? new CarValue(null, j, 2) : new CarValue(Float.valueOf(f), j, 1);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        CarValue carValue;
        rx rxVar = new rx();
        byte b = bArr[0];
        if (b == -1) {
            carValue = new CarValue(null, j, 2);
        } else {
            carValue = new CarValue(Boolean.valueOf(b == 1), j, 1);
        }
        rxVar.c = carValue;
        float f = fArr[1];
        rxVar.d = Float.isNaN(f) ? new CarValue(null, j, 2) : new CarValue(Float.valueOf(f * 1000.0f), j, 1);
        rxVar.e = new CarValue(null, 0L, 2);
        if (this.e) {
            rxVar.a = c(j, fArr);
            rxVar.b = new CarValue(null, j, 2);
        } else {
            rxVar.b = c(j, fArr);
            rxVar.a = new CarValue(null, j, 2);
        }
        b(new EnergyLevel(rxVar));
    }
}
