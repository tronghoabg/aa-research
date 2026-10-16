package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class hlz implements iej {
    final /* synthetic */ hmb a;
    final /* synthetic */ Uri b;
    final /* synthetic */ geu c;
    final /* synthetic */ CarColor d;

    public hlz(hmb hmbVar, Uri uri, geu geuVar, CarColor carColor) {
        this.a = hmbVar;
        this.b = uri;
        this.c = geuVar;
        this.d = carColor;
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        gks.g("CarApp.H.Tem", hwtVar, "Failed to load the image for URI: %s", this.b);
        return false;
    }

    @Override // defpackage.iej
    public final /* bridge */ /* synthetic */ boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        Drawable drawable = (Drawable) obj;
        int iC = hbz.c(this.c, this.d, this.a);
        if (iC == 0) {
            return false;
        }
        drawable.mutate();
        drawable.setTint(iC);
        drawable.setTintMode(PorterDuff.Mode.SRC_IN);
        return false;
    }
}
