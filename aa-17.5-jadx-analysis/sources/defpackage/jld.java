package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.carsetup.BinderParcel;

/* loaded from: classes.dex */
public final class jld implements jla {
    public static final yph a = yph.c("CAR.AUTH");
    private final xyc b = wub.L(new imq(8));
    private final jlb c = new jlb(yfq.r("com.google.android.projection.gearhead.pctsverifier", "com.google.android.projection.gearhead.galmonitor"), false);

    @Override // defpackage.jla
    public final void a(Context context) {
        if (!((jlb) this.b.gu()).a(context)) {
            throw new SecurityException("Caller is not allowed");
        }
    }

    @Override // defpackage.jla
    public final void b(Intent intent) {
        intent.putExtra("service_handshake", new BinderParcel(new jlc()));
    }

    @Override // defpackage.jla
    public final boolean c(Context context) {
        return this.c.a(context);
    }
}
