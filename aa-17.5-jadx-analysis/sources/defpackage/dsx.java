package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dsx {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public duc k;
    public int l;
    public int m;
    public boolean n;
    public String o;
    public boolean p;
    public String r;
    public Bundle s;
    public Notification v;
    public RemoteViews w;
    public String x;
    public final Notification y;

    @Deprecated
    public final ArrayList z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean j = true;
    public boolean q = false;
    public int t = 0;
    public int u = 0;

    public dsx(Context context, String str) {
        Notification notification = new Notification();
        this.y = notification;
        this.a = context;
        this.x = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.z = new ArrayList();
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static String d(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            return null;
        }
        return string.length() > 5120 ? string.substring(0, 5120) : string;
    }

    public final Notification a() {
        Bundle bundle;
        mko mkoVar = new mko(this);
        dsx dsxVar = (dsx) mkoVar.c;
        duc ducVar = dsxVar.k;
        if (ducVar != null) {
            ducVar.c(mkoVar);
        }
        Notification notificationBuild = ((Notification.Builder) mkoVar.d).build();
        RemoteViews remoteViews = dsxVar.w;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (ducVar != null) {
            dsxVar.k.i();
        }
        if (ducVar != null && (bundle = notificationBuild.extras) != null) {
            ducVar.e(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        Bundle bundle = this.s;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        this.s = bundle2;
        return bundle2;
    }

    public final void e(int i, boolean z) {
        Notification notification = this.y;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void f(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new dst(i, charSequence, pendingIntent));
    }

    public final void g(dst dstVar) {
        this.b.add(dstVar);
    }

    public final void h(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void j(PendingIntent pendingIntent) {
        this.y.deleteIntent = pendingIntent;
    }

    public final void k(Bitmap bitmap) {
        this.h = bitmap == null ? null : IconCompat.k(bitmap);
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

    public final void o(duc ducVar) {
        if (this.k != ducVar) {
            this.k = ducVar;
            if (ducVar == null || ducVar.g == this) {
                return;
            }
            ducVar.g = this;
            dsx dsxVar = ducVar.g;
            if (dsxVar != null) {
                dsxVar.o(ducVar);
            }
        }
    }

    public final void p(long j) {
        this.y.when = j;
    }
}
