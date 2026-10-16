package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class icu implements icw {
    private final /* synthetic */ int a;
    private final Object b;

    public icu(Resources resources, int i) {
        this.a = i;
        a.al(resources, "Argument must not be null");
        this.b = resources;
    }

    @Override // defpackage.icw
    public final hwx a(hwx hwxVar, hum humVar) {
        if (this.a == 0) {
            return ibn.f((Resources) this.b, hwxVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) hwxVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
        hwxVar.e();
        return new icc(byteArrayOutputStream.toByteArray(), 0);
    }

    public icu(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }
}
