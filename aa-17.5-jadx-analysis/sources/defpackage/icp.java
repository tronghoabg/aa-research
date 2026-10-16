package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class icp implements huq {
    private final huq b;

    public icp(huq huqVar) {
        this.b = huqVar;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.huq
    public final hwx b(Context context, hwx hwxVar, int i, int i2) {
        icm icmVar = (icm) hwxVar.c();
        hwx ibnVar = new ibn(icmVar.a(), hrt.b(context).a, 1);
        huq huqVar = this.b;
        hwx hwxVarB = huqVar.b(context, ibnVar, i, i2);
        if (!ibnVar.equals(hwxVarB)) {
            ibnVar.e();
        }
        icmVar.a.a.e(huqVar, (Bitmap) hwxVarB.c());
        return hwxVar;
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof icp) {
            return this.b.equals(((icp) obj).b);
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return this.b.hashCode();
    }
}
