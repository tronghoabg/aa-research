package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuv {
    public static final /* synthetic */ int j = 0;
    private static final defpackage.yhx k = defpackage.ysr.o(defpackage.nve.b, defpackage.nve.c);
    public final long a;
    public final java.lang.String b;
    public final defpackage.nvh c;
    public final java.lang.String d;
    public final boolean e;
    public boolean f;
    public boolean g;
    public android.service.notification.NotificationListenerService.Ranking h;
    public final defpackage.nus i;

    public nuv(defpackage.nut nutVar) {
        defpackage.nvh nvhVar = nutVar.c;
        this.c = nvhVar;
        this.e = nutVar.d;
        this.a = nutVar.a;
        this.b = nutVar.b;
        this.d = nvhVar.f + "|" + nutVar.a + "|" + nutVar.b;
        this.h = nutVar.e;
        this.i = nutVar.f;
    }

    public static defpackage.nuu a(android.service.notification.NotificationListenerService.Ranking ranking) {
        if (ranking != null && defpackage.acyc.ah()) {
            if (ranking.isSuspended()) {
                return defpackage.nuu.d;
            }
            if ((ranking.getSuppressedVisualEffects() & 256) != 0) {
                return defpackage.nuu.b;
            }
            if (g(ranking)) {
                return defpackage.nuu.c;
            }
        }
        return defpackage.nuu.a;
    }

    public static defpackage.nuu c(defpackage.nvh nvhVar, android.service.notification.NotificationListenerService.Ranking ranking) {
        if (ranking != null) {
            if (!k.contains(nvhVar.x)) {
                if (ranking.isSuspended()) {
                    return defpackage.nuu.d;
                }
                if ((ranking.getSuppressedVisualEffects() & 16) != 0) {
                    return defpackage.nuu.b;
                }
                if (g(ranking)) {
                    return defpackage.nuu.c;
                }
            }
        }
        return defpackage.nuu.a;
    }

    private static boolean g(android.service.notification.NotificationListenerService.Ranking ranking) {
        return ranking.getSuppressedVisualEffects() == 0 && !ranking.matchesInterruptionFilter();
    }

    public final defpackage.nuu b() {
        return c(this.c, this.h);
    }

    public final void d() {
        if (this.g) {
            return;
        }
        this.g = true;
        defpackage.nuz.b().i(this);
    }

    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        defpackage.nuz.b().i(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof defpackage.nuv)) {
            return this.d.equals(((defpackage.nuv) obj).d);
        }
        return false;
    }

    public final boolean f() {
        return a(this.h) == defpackage.nuu.a;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("NotificationEntry");
        xymVar.b("key", this.d);
        xymVar.h("isUpdate", this.e);
        xymVar.h("hasAlerted", this.f);
        xymVar.h("seenByUser", this.g);
        xymVar.b("badgeStatus", this.i);
        xymVar.h("hasRanking", this.h != null);
        android.service.notification.NotificationListenerService.Ranking ranking = this.h;
        if (ranking != null) {
            xymVar.b("hunStatus", b());
            xymVar.h("legacyHunSuppressed", this.c.z);
            xymVar.b("notificationCenterStatus", a(ranking));
            xymVar.h("matchesInterruptionFilter", ranking.matchesInterruptionFilter());
            xymVar.h("isAmbient", ranking.isAmbient());
            xymVar.f("rank", ranking.getRank());
            xymVar.f("suppressedEffects", ranking.getSuppressedVisualEffects());
            xymVar.f("adjustedImportance", ranking.getImportance());
            xymVar.h("canShowBadge", ranking.canShowBadge());
            xymVar.h("isSuspended", ranking.isSuspended());
        }
        xymVar.b("notification", this.c.toString());
        return xymVar.toString();
    }
}
