package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aeaz {
    public static final defpackage.adnz b;
    public static final defpackage.adnz c;
    public static final defpackage.adnz d;
    public static final defpackage.adnz e;
    public final adni a;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    static {
        defpackage.adnz adnzVar;
        defpackage.adnh adnhVarA = defpackage.adnh.a();
        b = adnhVarA.d("grpc.subchannel.disconnections", defpackage.ysr.R("grpc.target"), defpackage.ysr.R("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        c = adnhVarA.d("grpc.subchannel.connection_attempts_succeeded", defpackage.ysr.R("grpc.target"), defpackage.ysr.R("grpc.lb.backend_service", "grpc.lb.locality"));
        d = adnhVarA.d("grpc.subchannel.connection_attempts_failed", defpackage.ysr.R("grpc.target"), defpackage.ysr.R("grpc.lb.backend_service", "grpc.lb.locality"));
        java.util.ArrayList arrayListR = defpackage.ysr.R("grpc.target");
        java.util.ArrayList arrayListR2 = defpackage.ysr.R("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality");
        defpackage.ysr.aY(!defpackage.ysr.bw("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (adnhVarA.a) {
            ?? r5 = adnhVarA.c;
            if (r5.contains("grpc.subchannel.open_connections")) {
                throw new java.lang.IllegalStateException(defpackage.a.bp("grpc.subchannel.open_connections", "Metric with name ", " already exists"));
            }
            int i = adnhVarA.b;
            if (i + 1 == ((defpackage.adnz[]) adnhVarA.d).length) {
                adnhVarA.b();
            }
            adnzVar = new defpackage.adnz(i, "grpc.subchannel.open_connections", arrayListR, arrayListR2);
            ((defpackage.adnz[]) adnhVarA.d)[i] = adnzVar;
            r5.add("grpc.subchannel.open_connections");
            adnhVarA.b++;
        }
        e = adnzVar;
    }

    public aeaz(adni adniVar) {
        this.a = adniVar;
    }
}
