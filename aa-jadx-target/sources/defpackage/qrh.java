package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qrh {
    public java.lang.String a;
    public int b;
    public int c;
    public int d;
    public com.google.android.gms.car.display.CarRegionId e;

    public qrh(android.os.Bundle bundle) {
        this.b = 0;
        this.a = bundle.getString("com.google.android.gms.car.CarActivityOptions.packageName");
        this.b = bundle.getInt("com.google.android.gms.car.CarActivityOptions.animType");
        this.c = bundle.getInt("com.google.android.gms.car.CarActivityOptions.enterResId", 0);
        this.d = bundle.getInt("com.google.android.gms.car.CarActivityOptions.exitResId", 0);
        byte[] byteArray = bundle.getByteArray("com.google.android.gms.car.CarActivityOptions.launchRegionId");
        if (byteArray == null || byteArray.length <= 0) {
            return;
        }
        this.e = (com.google.android.gms.car.display.CarRegionId) defpackage.sqs.l(byteArray, com.google.android.gms.car.display.CarRegionId.CREATOR);
    }

    public static defpackage.qrh b(android.content.Context context, int i, int i2) {
        defpackage.qrh qrhVar = new defpackage.qrh();
        qrhVar.b = 1;
        qrhVar.a = context.getPackageName();
        qrhVar.c = i;
        qrhVar.d = i2;
        return qrhVar;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.gms.car.CarActivityOptions.packageName", this.a);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.animType", this.b);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.enterResId", this.c);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.exitResId", this.d);
        com.google.android.gms.car.display.CarRegionId carRegionId = this.e;
        if (carRegionId != null) {
            bundle.putByteArray("com.google.android.gms.car.CarActivityOptions.launchRegionId", defpackage.sqs.o(carRegionId));
        }
        return bundle;
    }

    public final java.lang.String toString() {
        return "CarActivityOptions{packageName=" + this.a + ", animationType=" + this.b + ", enterResId=" + this.c + ", exitResId=" + this.d + ", launchRegionId=" + java.lang.String.valueOf(this.e) + "}";
    }

    public qrh() {
        this.b = 0;
    }
}
