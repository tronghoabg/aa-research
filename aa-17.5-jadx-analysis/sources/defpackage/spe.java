package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ClientThrottlingTelemetryData;

/* loaded from: classes2.dex */
public final class spe extends sla implements sle {
    private static final rju a;
    private static final omc l;

    static {
        spd spdVar = new spd();
        l = spdVar;
        a = new rju("ClientThrottling.API", spdVar);
    }

    public spe(Context context) {
        super(context, null, a, sku.c, skz.a);
    }

    public final void a(ClientThrottlingTelemetryData clientThrottlingTelemetryData) {
        snb snbVar = new snb();
        snbVar.b = new Feature[]{sjq.c};
        snbVar.b();
        snbVar.a = new qpy(clientThrottlingTelemetryData, 12);
        super.u(2, snbVar.a());
    }
}
