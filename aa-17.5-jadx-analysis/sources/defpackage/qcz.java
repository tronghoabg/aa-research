package defpackage;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qcz {
    public final Bundler a;
    public final BundlerType b;
    public final zhc c = new zhc();

    public qcz(Bundler bundler, BundlerType bundlerType) {
        this.a = bundler;
        this.b = bundlerType;
    }

    public static zgp b(Map map) {
        zhc zhcVar = new zhc();
        qdr qdrVar = new qdr(map.size(), new qdm(zhcVar));
        for (Map.Entry entry : map.entrySet()) {
            zgj zgjVarV = zgj.v((zgp) entry.getValue());
            pgv pgvVar = new pgv(qdrVar, entry, 2);
            zfq zfqVar = zfq.a;
            wub.ah(zgjVarV.u(qdl.class, pgvVar, zfqVar), new qdn((qdg) entry.getKey(), qdrVar), zfqVar);
        }
        return zhcVar;
    }

    public static void c(zgp zgpVar, ohb ohbVar) {
        wub.ah(zgj.v(zgpVar), new tcd(ohbVar, 1), zfq.a);
    }

    public final void a(Bundle bundle) {
        this.c.p(roc.bt(bundle));
    }
}
