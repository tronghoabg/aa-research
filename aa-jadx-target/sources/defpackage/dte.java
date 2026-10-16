package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dte {
    public final android.content.Context a;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.app.PendingIntent g;
    public androidx.core.graphics.drawable.IconCompat h;
    public int i;
    public defpackage.duj k;
    public int l;
    public int m;
    public boolean n;
    public java.lang.String o;
    public boolean p;
    public java.lang.String r;
    public android.os.Bundle s;
    public android.app.Notification v;
    public android.widget.RemoteViews w;
    public java.lang.String x;
    public final android.app.Notification y;

    @java.lang.Deprecated
    public final java.util.ArrayList z;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public boolean j = true;
    public boolean q = false;
    public int t = 0;
    public int u = 0;

    public dte(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.y = notification;
        this.a = context;
        this.x = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.z = new java.util.ArrayList();
    }

    public static java.lang.CharSequence c(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static java.lang.String d(java.lang.CharSequence charSequence) {
        java.lang.String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            return null;
        }
        return string.length() > 5120 ? string.substring(0, 5120) : string;
    }

    public final android.app.Notification a() {
        android.os.Bundle bundle;
        defpackage.mku mkuVar = new defpackage.mku(this);
        defpackage.dte dteVar = (defpackage.dte) mkuVar.c;
        defpackage.duj dujVar = dteVar.k;
        if (dujVar != null) {
            dujVar.c(mkuVar);
        }
        android.app.Notification notificationBuild = ((android.app.Notification.Builder) mkuVar.a).build();
        android.widget.RemoteViews remoteViews = dteVar.w;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (dujVar != null) {
            dteVar.k.i();
        }
        if (dujVar != null && (bundle = notificationBuild.extras) != null) {
            dujVar.e(bundle);
        }
        return notificationBuild;
    }

    public final android.os.Bundle b() {
        android.os.Bundle bundle = this.s;
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.s = bundle2;
        return bundle2;
    }

    public final void e(int i, boolean z) {
        android.app.Notification notification = this.y;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void f(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this.b.add(new defpackage.dta(i, charSequence, pendingIntent));
    }

    public final void g(defpackage.dta dtaVar) {
        this.b.add(dtaVar);
    }

    public final void h(java.lang.CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(java.lang.CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void j(android.app.PendingIntent pendingIntent) {
        this.y.deleteIntent = pendingIntent;
    }

    public final void k(android.graphics.Bitmap bitmap) {
        this.h = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.k(bitmap);
    }

    public final void l() {
        this.q = true;
    }

    public final void m(int i, int i2, boolean z) {
        this.l = i;
        this.m = i2;
        this.n = z;
    }

    public final void n(int i) {
        this.y.icon = i;
    }

    public final void o(defpackage.duj dujVar) {
        if (this.k != dujVar) {
            this.k = dujVar;
            if (dujVar == null || dujVar.g == this) {
                return;
            }
            dujVar.g = this;
            defpackage.dte dteVar = dujVar.g;
            if (dteVar != null) {
                dteVar.o(dujVar);
            }
        }
    }

    public final void p(long j) {
        this.y.when = j;
    }
}
