package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvh {
    public final defpackage.nvd A;
    public final android.content.ComponentName B;
    public final boolean C;
    public final defpackage.nvg D;
    public final int E;
    public final android.os.Bundle F;
    public final defpackage.nvf a;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon b;
    public final android.app.PendingIntent c;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon d;
    public final androidx.car.app.model.CarIcon e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final int h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final java.lang.CharSequence m;
    public final java.lang.CharSequence n;
    public final java.lang.CharSequence o;
    public final defpackage.nvb p;
    public final defpackage.nvb q;
    public final defpackage.nvb r;
    public final defpackage.nvb s;
    public final defpackage.nur t;
    public final defpackage.nup u;
    public final defpackage.nva v;
    public final android.net.Uri w;
    public final defpackage.nve x;
    public final java.util.List y;
    public final boolean z;

    public nvh(defpackage.nvc nvcVar) {
        this.a = nvcVar.a;
        this.b = nvcVar.b;
        this.c = nvcVar.c;
        this.d = nvcVar.d;
        this.e = nvcVar.e;
        java.lang.String str = nvcVar.f;
        str.getClass();
        this.f = str;
        this.h = nvcVar.h;
        this.i = nvcVar.i;
        this.j = nvcVar.j;
        this.k = nvcVar.k;
        this.l = nvcVar.l;
        this.m = nvcVar.m;
        this.n = nvcVar.n;
        this.o = nvcVar.o;
        this.p = nvcVar.p;
        this.q = nvcVar.q;
        this.r = nvcVar.r;
        this.s = nvcVar.s;
        this.t = nvcVar.t;
        this.u = nvcVar.u;
        this.v = nvcVar.v;
        this.x = nvcVar.x;
        this.y = defpackage.ygw.o(nvcVar.y);
        this.w = nvcVar.w;
        this.g = nvcVar.g;
        this.z = nvcVar.z;
        this.A = nvcVar.A;
        this.B = nvcVar.B;
        this.C = nvcVar.C;
        this.E = nvcVar.E;
        this.F = nvcVar.D == android.os.Bundle.EMPTY ? android.os.Bundle.EMPTY : new android.os.Bundle(nvcVar.D);
        this.D = nvcVar.F;
    }

    public static defpackage.nvf a(int i) {
        if (i == 1) {
            return defpackage.nvf.MIN;
        }
        if (i == 2) {
            return defpackage.nvf.LOW;
        }
        if (i != 4) {
            return i != 5 ? defpackage.nvf.DEFAULT : defpackage.nvf.MAX;
        }
        return defpackage.nvf.HIGH;
    }

    public final boolean b() {
        return (this.p == null && this.q == null && this.r == null) ? false : true;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("ProjectionNotification");
        xymVar.b("package", this.f);
        xymVar.b("category", this.x.name());
        xymVar.b(org.apache.commons.logging.LogFactory.PRIORITY_KEY, this.a.name());
        xymVar.h("alertOnlyOnce", this.k);
        xymVar.h("isOngoing", this.l);
        xymVar.b("smallIcon", this.b);
        xymVar.b("contentIntent", this.c);
        xymVar.b("largeIcon", this.d);
        xymVar.b("largeCarIcon", this.e);
        xymVar.b("action1", this.p);
        xymVar.b("action2", this.q);
        xymVar.b("action3", this.r);
        xymVar.b("statusBarNotificationKey", this.g);
        xymVar.h("isLegacyDndSuppressedMessagingNotification", this.z);
        xymVar.b("canBadgeStatus", this.A);
        xymVar.h("isWorkData", this.C);
        xymVar.b("customOngoingNotificationAlertContent", this.v);
        xymVar.b("style", this.D);
        return xymVar.toString();
    }
}
