package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwg extends defpackage.jvz {
    private final boolean e;

    public jwg(int i, int i2, defpackage.rvc rvcVar, boolean z) {
        super(i, i2, rvcVar, 5);
        this.e = z;
    }

    static final androidx.car.app.hardware.common.CarValue c(long j, float[] fArr) {
        float f = fArr[0];
        return java.lang.Float.isNaN(f) ? new androidx.car.app.hardware.common.CarValue(null, j, 2) : new androidx.car.app.hardware.common.CarValue(java.lang.Float.valueOf(f), j, 1);
    }

    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        androidx.car.app.hardware.common.CarValue carValue;
        defpackage.sc scVar = new defpackage.sc();
        byte b = bArr[0];
        if (b == -1) {
            carValue = new androidx.car.app.hardware.common.CarValue(null, j, 2);
        } else {
            carValue = new androidx.car.app.hardware.common.CarValue(java.lang.Boolean.valueOf(b == 1), j, 1);
        }
        scVar.c = carValue;
        float f = fArr[1];
        scVar.d = java.lang.Float.isNaN(f) ? new androidx.car.app.hardware.common.CarValue(null, j, 2) : new androidx.car.app.hardware.common.CarValue(java.lang.Float.valueOf(f * 1000.0f), j, 1);
        scVar.e = new androidx.car.app.hardware.common.CarValue(null, 0L, 2);
        if (this.e) {
            scVar.a = c(j, fArr);
            scVar.b = new androidx.car.app.hardware.common.CarValue(null, j, 2);
        } else {
            scVar.b = c(j, fArr);
            scVar.a = new androidx.car.app.hardware.common.CarValue(null, j, 2);
        }
        b(new androidx.car.app.hardware.info.EnergyLevel(scVar));
    }
}
