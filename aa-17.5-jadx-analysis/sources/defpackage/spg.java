package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* loaded from: classes2.dex */
public final class spg extends sla implements sle {
    private static final rju a;
    private static final omc l;

    static {
        spf spfVar = new spf();
        l = spfVar;
        a = new rju("ClientTelemetry.API", spfVar);
    }

    public spg(Context context, sou souVar) {
        super(context, null, a, souVar, skz.a);
    }

    public final svz a(TelemetryData telemetryData) {
        snb snbVar = new snb();
        snbVar.b = new Feature[]{sjq.a};
        snbVar.b();
        snbVar.a = new qpy(telemetryData, 13);
        return super.u(2, snbVar.a());
    }
}
