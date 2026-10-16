package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xgw extends defpackage.iew {
    final /* synthetic */ com.google.android.gms.car.CarPhoneStatus.CarCall a;

    public xgw(com.google.android.gms.car.CarPhoneStatus.CarCall carCall) {
        this.a = carCall;
    }

    @Override // defpackage.ifd
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.ifm ifmVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.Bitmap) obj).compress(android.graphics.Bitmap.CompressFormat.PNG, 25, byteArrayOutputStream);
        this.a.f = byteArrayOutputStream.toByteArray();
    }
}
