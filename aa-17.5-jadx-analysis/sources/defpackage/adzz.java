package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class adzz {
    public static final admy b;
    public static final admy c;
    public static final admy d;
    public static final admy e;
    public final admh a;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    static {
        admy admyVar;
        admg admgVarA = admg.a();
        b = admgVarA.d("grpc.subchannel.disconnections", yrm.R("grpc.target"), yrm.R("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        c = admgVarA.d("grpc.subchannel.connection_attempts_succeeded", yrm.R("grpc.target"), yrm.R("grpc.lb.backend_service", "grpc.lb.locality"));
        d = admgVarA.d("grpc.subchannel.connection_attempts_failed", yrm.R("grpc.target"), yrm.R("grpc.lb.backend_service", "grpc.lb.locality"));
        ArrayList arrayListR = yrm.R("grpc.target");
        ArrayList arrayListR2 = yrm.R("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality");
        woy.O(!woy.am("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (admgVarA.a) {
            ?? r5 = admgVarA.c;
            if (r5.contains("grpc.subchannel.open_connections")) {
                throw new IllegalStateException(a.bq("grpc.subchannel.open_connections", "Metric with name ", " already exists"));
            }
            int i = admgVarA.b;
            if (i + 1 == ((admy[]) admgVarA.d).length) {
                admgVarA.b();
            }
            admyVar = new admy(i, "grpc.subchannel.open_connections", arrayListR, arrayListR2);
            ((admy[]) admgVarA.d)[i] = admyVar;
            r5.add("grpc.subchannel.open_connections");
            admgVarA.b++;
        }
        e = admyVar;
    }

    public adzz(admh admhVar) {
        this.a = admhVar;
    }
}
