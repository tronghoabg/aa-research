package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwk extends defpackage.jvz {
    public jwk(int i, int i2, defpackage.rvc rvcVar) {
        super(i, i2, rvcVar, 22);
    }

    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        byte b = bArr[0];
        defpackage.sk skVar = new defpackage.sk();
        skVar.a = new androidx.car.app.hardware.common.CarValue(java.lang.Integer.valueOf(b == 1 ? 1 : 2), j, 1);
        b(new androidx.car.app.hardware.info.TollCard(skVar));
    }
}
