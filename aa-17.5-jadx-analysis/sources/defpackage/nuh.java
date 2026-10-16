package defpackage;

import android.service.notification.NotificationListenerService;

/* loaded from: classes2.dex */
public final class nuh {
    public static final /* synthetic */ int j = 0;
    private static final ygr k = yrm.o(nuo.b, nuo.c);
    public final long a;
    public final String b;
    public final nur c;
    public final String d;
    public final boolean e;
    public boolean f;
    public boolean g;
    public NotificationListenerService.Ranking h;
    public final nue i;

    public nuh(nuf nufVar) {
        nur nurVar = nufVar.c;
        this.c = nurVar;
        this.e = nufVar.d;
        this.a = nufVar.a;
        this.b = nufVar.b;
        this.d = nurVar.f + "|" + nufVar.a + "|" + nufVar.b;
        this.h = nufVar.e;
        this.i = nufVar.f;
    }

    public static nug a(NotificationListenerService.Ranking ranking) {
        if (ranking != null && acxa.ag()) {
            if (ranking.isSuspended()) {
                return nug.d;
            }
            if ((ranking.getSuppressedVisualEffects() & 256) != 0) {
                return nug.b;
            }
            if (g(ranking)) {
                return nug.c;
            }
        }
        return nug.a;
    }

    public static nug c(nur nurVar, NotificationListenerService.Ranking ranking) {
        if (ranking != null) {
            if (!k.contains(nurVar.x)) {
                if (ranking.isSuspended()) {
                    return nug.d;
                }
                if ((ranking.getSuppressedVisualEffects() & 16) != 0) {
                    return nug.b;
                }
                if (g(ranking)) {
                    return nug.c;
                }
            }
        }
        return nug.a;
    }

    private static boolean g(NotificationListenerService.Ranking ranking) {
        return ranking.getSuppressedVisualEffects() == 0 && !ranking.matchesInterruptionFilter();
    }

    public final nug b() {
        return c(this.c, this.h);
    }

    public final void d() {
        if (this.g) {
            return;
        }
        this.g = true;
        nuj.b().i(this);
    }

    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        nuj.b().i(this);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nuh)) {
            return this.d.equals(((nuh) obj).d);
        }
        return false;
    }

    public final boolean f() {
        return a(this.h) == nug.a;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        xxg xxgVar = new xxg("NotificationEntry");
        xxgVar.b("key", this.d);
        xxgVar.h("isUpdate", this.e);
        xxgVar.h("hasAlerted", this.f);
        xxgVar.h("seenByUser", this.g);
        xxgVar.b("badgeStatus", this.i);
        xxgVar.h("hasRanking", this.h != null);
        NotificationListenerService.Ranking ranking = this.h;
        if (ranking != null) {
            xxgVar.b("hunStatus", b());
            xxgVar.h("legacyHunSuppressed", this.c.z);
            xxgVar.b("notificationCenterStatus", a(ranking));
            xxgVar.h("matchesInterruptionFilter", ranking.matchesInterruptionFilter());
            xxgVar.h("isAmbient", ranking.isAmbient());
            xxgVar.f("rank", ranking.getRank());
            xxgVar.f("suppressedEffects", ranking.getSuppressedVisualEffects());
            xxgVar.f("adjustedImportance", ranking.getImportance());
            xxgVar.h("canShowBadge", ranking.canShowBadge());
            xxgVar.h("isSuspended", ranking.isSuspended());
        }
        xxgVar.b("notification", this.c.toString());
        return xxgVar.toString();
    }
}
