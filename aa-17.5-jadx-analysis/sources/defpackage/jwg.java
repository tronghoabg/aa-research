package defpackage;

import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.TollCard;

/* loaded from: classes2.dex */
public final class jwg extends jvv {
    public jwg(int i, int i2, ruj rujVar) {
        super(i, i2, rujVar, 22);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        byte b = bArr[0];
        sf sfVar = new sf();
        sfVar.a = new CarValue(Integer.valueOf(b == 1 ? 1 : 2), j, 1);
        b(new TollCard(sfVar));
    }
}
