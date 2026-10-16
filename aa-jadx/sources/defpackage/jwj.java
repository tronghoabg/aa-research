package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwj extends defpackage.jvz {
    public jwj(int i, int i2, defpackage.rvc rvcVar) {
        super(i, i2, rvcVar, 2);
    }

    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        defpackage.sj sjVar = new defpackage.sj();
        sjVar.b = new androidx.car.app.hardware.common.CarValue(java.lang.Float.valueOf(fArr[0]), j, 1);
        sjVar.a = new androidx.car.app.hardware.common.CarValue(null, 0L, 2);
        sjVar.c = new androidx.car.app.hardware.common.CarValue(null, 0L, 2);
        b(new androidx.car.app.hardware.info.Speed(sjVar));
    }
}
