package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Speed;

/* loaded from: classes2.dex */
public final class jwf extends jvv {
    public jwf(int i, int i2, ruj rujVar) {
        super(i, i2, rujVar, 2);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        se seVar = new se();
        seVar.b = new CarValue(Float.valueOf(fArr[0]), j, 1);
        seVar.a = new CarValue(null, 0L, 2);
        seVar.c = new CarValue(null, 0L, 2);
        b(new Speed(seVar));
    }
}
