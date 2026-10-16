package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.List;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class nur {
    public final nun A;
    public final ComponentName B;
    public final boolean C;
    public final nuq D;
    public final int E;
    public final Bundle F;
    public final nup a;
    public final GhIcon b;
    public final PendingIntent c;
    public final GhIcon d;
    public final CarIcon e;
    public final String f;
    public final String g;
    public final int h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final CharSequence m;
    public final CharSequence n;
    public final CharSequence o;
    public final nul p;
    public final nul q;
    public final nul r;
    public final nul s;
    public final nud t;
    public final nub u;
    public final nuk v;
    public final Uri w;
    public final nuo x;
    public final List y;
    public final boolean z;

    public nur(num numVar) {
        this.a = numVar.a;
        this.b = numVar.b;
        this.c = numVar.c;
        this.d = numVar.d;
        this.e = numVar.e;
        String str = numVar.f;
        str.getClass();
        this.f = str;
        this.h = numVar.h;
        this.i = numVar.i;
        this.j = numVar.j;
        this.k = numVar.k;
        this.l = numVar.l;
        this.m = numVar.m;
        this.n = numVar.n;
        this.o = numVar.o;
        this.p = numVar.p;
        this.q = numVar.q;
        this.r = numVar.r;
        this.s = numVar.s;
        this.t = numVar.t;
        this.u = numVar.u;
        this.v = numVar.v;
        this.x = numVar.x;
        this.y = yfq.o(numVar.y);
        this.w = numVar.w;
        this.g = numVar.g;
        this.z = numVar.z;
        this.A = numVar.A;
        this.B = numVar.B;
        this.C = numVar.C;
        this.E = numVar.E;
        this.F = numVar.D == Bundle.EMPTY ? Bundle.EMPTY : new Bundle(numVar.D);
        this.D = numVar.F;
    }

    public static nup a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? nup.DEFAULT : nup.MAX : nup.HIGH : nup.LOW : nup.MIN;
    }

    public final boolean b() {
        return (this.p == null && this.q == null && this.r == null) ? false : true;
    }

    public final String toString() {
        xxg xxgVar = new xxg("ProjectionNotification");
        xxgVar.b("package", this.f);
        xxgVar.b("category", this.x.name());
        xxgVar.b(LogFactory.PRIORITY_KEY, this.a.name());
        xxgVar.h("alertOnlyOnce", this.k);
        xxgVar.h("isOngoing", this.l);
        xxgVar.b("smallIcon", this.b);
        xxgVar.b("contentIntent", this.c);
        xxgVar.b("largeIcon", this.d);
        xxgVar.b("largeCarIcon", this.e);
        xxgVar.b("action1", this.p);
        xxgVar.b("action2", this.q);
        xxgVar.b("action3", this.r);
        xxgVar.b("statusBarNotificationKey", this.g);
        xxgVar.h("isLegacyDndSuppressedMessagingNotification", this.z);
        xxgVar.b("canBadgeStatus", this.A);
        xxgVar.h("isWorkData", this.C);
        xxgVar.b("customOngoingNotificationAlertContent", this.v);
        xxgVar.b("style", this.D);
        return xxgVar.toString();
    }
}
