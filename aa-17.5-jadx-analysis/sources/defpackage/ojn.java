package defpackage;

import android.content.Intent;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public abstract class ojn {
    public final yxo c;

    public ojn(yxo yxoVar) {
        this.c = yxoVar;
    }

    public abstract xxh a();

    public abstract String b();

    public abstract String c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ojn) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public abstract int f();

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public xxh i() {
        return xvy.a;
    }

    public xxh j() {
        return xvy.a;
    }

    public xxh k() {
        return xvy.a;
    }

    public xxh l() {
        return xvy.a;
    }

    public xxh m() {
        return xvy.a;
    }

    public xxh n() {
        return xvy.a;
    }

    public String o() {
        mas.c();
        return "gearhead_connection_status";
    }

    public xxh p() {
        return xxh.h(1);
    }

    public int q() {
        return 3;
    }

    public final String toString() {
        String strA = a().f() ? ((ojm) a().b()).a() : null;
        String action = i().f() ? ((Intent) i().b()).getAction() : null;
        Object objB = k().f() ? k().b() : null;
        Object objB2 = n().f() ? n().b() : null;
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("detectorType", this.c.name());
        xxgVarAo.b("dialogHeading", b());
        xxgVarAo.b("dialogDescription", c());
        xxgVarAo.b("resolutionText", strA);
        xxgVarAo.b("issueUuid", objB);
        xxgVarAo.h("shouldDisplayNotification", e());
        xxgVarAo.h("resolved", d());
        int iF = f();
        xxgVarAo.b("bugReportStatus", iF != 1 ? iF != 2 ? iF != 3 ? iF != 4 ? iF != 5 ? "UPLOADED" : "COMPLETED" : "COLLECTING" : "NOT_STARTED" : "NOT_REQUIRED" : "REPORT_TYPE_UNSPECIFIED");
        int iQ = q();
        xxgVarAo.b(LogFactory.PRIORITY_KEY, iQ != 2 ? iQ != 3 ? iQ != 4 ? "ONLINE_HELP" : "HIGH" : "UNDEFINED" : "LOW");
        xxgVarAo.b("maxHistorySize", p());
        xxgVarAo.b("intentOnNotificationClickedAction", action);
        xxgVarAo.b("notificationText", objB2);
        return xxgVarAo.toString();
    }
}
