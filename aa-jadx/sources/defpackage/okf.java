package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class okf {
    public final defpackage.yyt c;

    public okf(defpackage.yyt yytVar) {
        this.c = yytVar;
    }

    public abstract defpackage.xyn a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.okf) {
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

    public defpackage.xyn i() {
        return defpackage.xxe.a;
    }

    public defpackage.xyn j() {
        return defpackage.xxe.a;
    }

    public defpackage.xyn k() {
        return defpackage.xxe.a;
    }

    public defpackage.xyn l() {
        return defpackage.xxe.a;
    }

    public defpackage.xyn m() {
        return defpackage.xxe.a;
    }

    public defpackage.xyn n() {
        return defpackage.xxe.a;
    }

    public java.lang.String o() {
        defpackage.maz.c();
        return "gearhead_connection_status";
    }

    public defpackage.xyn p() {
        return defpackage.xyn.h(1);
    }

    public int q() {
        return 3;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strA = a().f() ? ((defpackage.oke) a().b()).a() : null;
        java.lang.String action = i().f() ? ((android.content.Intent) i().b()).getAction() : null;
        java.lang.Object objB = k().f() ? k().b() : null;
        java.lang.Object objB2 = n().f() ? n().b() : null;
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("detectorType", this.c.name());
        xymVarBy.b("dialogHeading", b());
        xymVarBy.b("dialogDescription", c());
        xymVarBy.b("resolutionText", strA);
        xymVarBy.b("issueUuid", objB);
        xymVarBy.h("shouldDisplayNotification", e());
        xymVarBy.h("resolved", d());
        int iF = f();
        if (iF == 1) {
            str = "REPORT_TYPE_UNSPECIFIED";
        } else if (iF == 2) {
            str = "NOT_REQUIRED";
        } else if (iF == 3) {
            str = "NOT_STARTED";
        } else if (iF != 4) {
            str = iF != 5 ? "UPLOADED" : "COMPLETED";
        } else {
            str = "COLLECTING";
        }
        xymVarBy.b("bugReportStatus", str);
        int iQ = q();
        if (iQ == 2) {
            str2 = "LOW";
        } else if (iQ != 3) {
            str2 = iQ != 4 ? "ONLINE_HELP" : "HIGH";
        } else {
            str2 = "UNDEFINED";
        }
        xymVarBy.b(org.apache.commons.logging.LogFactory.PRIORITY_KEY, str2);
        xymVarBy.b("maxHistorySize", p());
        xymVarBy.b("intentOnNotificationClickedAction", action);
        xymVarBy.b("notificationText", objB2);
        return xymVarBy.toString();
    }
}
