package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Mileage;

/* loaded from: classes2.dex */
public final class jwe extends jvv {
    public jwe(int i, int i2, ruj rujVar) {
        super(i, i2, rujVar, 4);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        sa saVar = new sa();
        saVar.a = new CarValue(Float.valueOf(fArr[0]), j, 1);
        saVar.b = new CarValue(null, 0L, 2);
        b(new Mileage(saVar));
    }
}
