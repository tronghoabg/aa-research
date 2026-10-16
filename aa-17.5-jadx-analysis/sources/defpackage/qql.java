package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class qql {
    public String a;
    public int b;
    public int c;
    public int d;
    public CarRegionId e;

    public qql(Bundle bundle) {
        this.b = 0;
        this.a = bundle.getString("com.google.android.gms.car.CarActivityOptions.packageName");
        this.b = bundle.getInt("com.google.android.gms.car.CarActivityOptions.animType");
        this.c = bundle.getInt("com.google.android.gms.car.CarActivityOptions.enterResId", 0);
        this.d = bundle.getInt("com.google.android.gms.car.CarActivityOptions.exitResId", 0);
        byte[] byteArray = bundle.getByteArray("com.google.android.gms.car.CarActivityOptions.launchRegionId");
        if (byteArray == null || byteArray.length <= 0) {
            return;
        }
        this.e = (CarRegionId) spu.h(byteArray, CarRegionId.CREATOR);
    }

    public static qql b(Context context, int i, int i2) {
        qql qqlVar = new qql();
        qqlVar.b = 1;
        qqlVar.a = context.getPackageName();
        qqlVar.c = i;
        qqlVar.d = i2;
        return qqlVar;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.car.CarActivityOptions.packageName", this.a);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.animType", this.b);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.enterResId", this.c);
        bundle.putInt("com.google.android.gms.car.CarActivityOptions.exitResId", this.d);
        CarRegionId carRegionId = this.e;
        if (carRegionId != null) {
            bundle.putByteArray("com.google.android.gms.car.CarActivityOptions.launchRegionId", spu.k(carRegionId));
        }
        return bundle;
    }

    public final String toString() {
        return "CarActivityOptions{packageName=" + this.a + ", animationType=" + this.b + ", enterResId=" + this.c + ", exitResId=" + this.d + ", launchRegionId=" + String.valueOf(this.e) + "}";
    }

    public qql() {
        this.b = 0;
    }
}
