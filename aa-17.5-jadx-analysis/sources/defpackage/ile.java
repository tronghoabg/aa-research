package defpackage;

import android.content.Context;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class ile implements jce, jbo {
    public static final yph a = yph.c("CAR.WIFI_PROJ");
    public jcf b;
    public volatile boolean c;
    public String d;
    public Context e;
    public CarInfoInternal f;
    public final jer g;

    public ile(jer jerVar) {
        this.g = jerVar;
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 8192) == 0) {
            return null;
        }
        xpl xplVar = xnzVar.l;
        if (xplVar == null) {
            xplVar = xpl.a;
        }
        this.d = xplVar.b;
        ((ype) a.l().ai(270)).y("onServiceDiscovery. Car wifi BSSID is %s", this.d);
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jcf(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.b = (jcf) jbjVar;
        this.c = true;
    }
}
