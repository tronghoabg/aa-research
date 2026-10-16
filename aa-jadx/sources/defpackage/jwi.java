package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwi extends defpackage.jvz {
    public jwi(int i, int i2, defpackage.rvc rvcVar) {
        super(i, i2, rvcVar, 4);
    }

    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        defpackage.sf sfVar = new defpackage.sf();
        sfVar.a = new androidx.car.app.hardware.common.CarValue(java.lang.Float.valueOf(fArr[0]), j, 1);
        sfVar.b = new androidx.car.app.hardware.common.CarValue(null, 0L, 2);
        b(new androidx.car.app.hardware.info.Mileage(sfVar));
    }
}
