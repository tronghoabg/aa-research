package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdw {
    public final com.google.android.enterprise.connectedapps.internal.Bundler a;
    public final com.google.android.enterprise.connectedapps.internal.BundlerType b;
    public final defpackage.zif c = new defpackage.zif();

    public qdw(com.google.android.enterprise.connectedapps.internal.Bundler bundler, com.google.android.enterprise.connectedapps.internal.BundlerType bundlerType) {
        this.a = bundler;
        this.b = bundlerType;
    }

    public static defpackage.zhs b(java.util.Map map) {
        defpackage.zif zifVar = new defpackage.zif();
        defpackage.qeo qeoVar = new defpackage.qeo(map.size(), new defpackage.qej(zifVar));
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.zhm zhmVarV = defpackage.zhm.v((defpackage.zhs) entry.getValue());
            defpackage.phr phrVar = new defpackage.phr(qeoVar, entry, 2);
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            defpackage.ysr.cy(zhmVarV.u(defpackage.qei.class, phrVar, zgtVar), new defpackage.qek((defpackage.qed) entry.getKey(), qeoVar), zgtVar);
        }
        return zifVar;
    }

    public static void c(defpackage.zhs zhsVar, defpackage.ohv ohvVar) {
        defpackage.ysr.cy(defpackage.zhm.v(zhsVar), new defpackage.tcz(ohvVar, 1), defpackage.zgt.INSTANCE);
    }

    public final void a(android.os.Bundle bundle) {
        this.c.p(defpackage.rox.aa(bundle));
    }
}
