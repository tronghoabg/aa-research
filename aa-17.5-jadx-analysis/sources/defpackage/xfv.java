package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.car.CarPhoneStatus;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
final class xfv extends ieo {
    final /* synthetic */ CarPhoneStatus.CarCall a;

    public xfv(CarPhoneStatus.CarCall carCall) {
        this.a = carCall;
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 25, byteArrayOutputStream);
        this.a.f = byteArrayOutputStream.toByteArray();
    }
}
