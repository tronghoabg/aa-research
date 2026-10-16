package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.Set;

/* loaded from: classes2.dex */
final class ofm extends ieq {
    final /* synthetic */ ofq a;
    private final CarCall b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofm(ofq ofqVar, CarCall carCall) {
        super(96, 96);
        carCall.getClass();
        this.a = ofqVar;
        this.b = carCall;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ((ynz) ofq.a.f().ai(5858)).w("onLoadCleared for letter tile. id=%s", this.b.a);
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ((ynz) ofq.a.g().ai(5859)).w("Could not load letter tile photo. id=%s", this.b.a);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        ofq ofqVar = this.a;
        Bitmap bitmap = (Bitmap) obj;
        Set setKeySet = ofqVar.e.keySet();
        CarCall carCall = this.b;
        int i = carCall.a;
        if (!setKeySet.contains(Integer.valueOf(i))) {
            ((ynz) ofq.a.f().ai(5860)).w("Loaded letter tile photo for removed call. id=%d", i);
        } else {
            ((ynz) ofq.a.f().ai(5861)).w("Loaded letter tile photo. id=%d", i);
            ofqVar.f(bitmap, carCall);
        }
    }
}
