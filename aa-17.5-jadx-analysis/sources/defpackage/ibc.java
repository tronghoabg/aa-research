package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ibc implements huq {
    private final huq b;
    private final boolean c;

    public ibc(huq huqVar, boolean z) {
        this.b = huqVar;
        this.c = z;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.huq
    public final hwx b(Context context, hwx hwxVar, int i, int i2) {
        hxe hxeVar = hrt.b(context).a;
        Drawable drawable = (Drawable) hwxVar.c();
        hwx hwxVarA = ibb.a(hxeVar, drawable, i, i2);
        if (hwxVarA == null) {
            if (this.c) {
                throw new IllegalArgumentException(a.bV(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return hwxVar;
        }
        hwx hwxVarB = this.b.b(context, hwxVarA, i, i2);
        if (!hwxVarB.equals(hwxVarA)) {
            return ibn.f(context.getResources(), hwxVarB);
        }
        hwxVarB.e();
        return hwxVar;
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof ibc) {
            return this.b.equals(((ibc) obj).b);
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        return this.b.hashCode();
    }
}
