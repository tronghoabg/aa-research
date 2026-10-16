package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lvn {
    public static final /* synthetic */ int l = 0;
    private static final defpackage.yqm m = defpackage.yqm.c("GH.Conversation");
    public boolean a;
    public final android.os.Bundle b;
    public long c;
    public final defpackage.moe d;
    public final long e;
    public final java.lang.String f;
    public int g;
    public final int h;
    public final android.graphics.Bitmap i;
    public final android.net.Uri j;
    public java.lang.String k;

    public lvn(defpackage.lvm lvmVar) {
        this.a = lvmVar.a;
        this.b = lvmVar.c;
        this.c = lvmVar.d;
        this.d = lvmVar.e;
        this.k = lvmVar.b;
        this.e = lvmVar.f;
        this.f = lvmVar.g;
        this.g = lvmVar.h;
        this.h = lvmVar.i;
        this.i = lvmVar.j;
        this.j = lvmVar.k;
    }

    public static void i(android.os.Bundle bundle, boolean z) {
        ((defpackage.yqj) m.l().ai((char) 4292)).y("Conversation muted: %b", java.lang.Boolean.valueOf(z));
        bundle.putBoolean("muted", z);
    }

    public static void k(android.os.Bundle bundle, boolean z) {
        ((defpackage.yqj) m.l().ai((char) 4293)).y("Per-conversation Visual Preview enabled: %b", java.lang.Boolean.valueOf(z));
        bundle.putBoolean("visual_preview", z);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    private static boolean q() {
        boolean z;
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) defpackage.mkp.a.c.getSystemService("notification");
        notificationManager.getClass();
        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
        defpackage.yqm yqmVar = m;
        ((defpackage.yqj) yqmVar.l().ai(4290)).w("Current DND notification Filter: %d", currentInterruptionFilter);
        if (currentInterruptionFilter == 1) {
            return true;
        }
        android.app.NotificationManager.Policy notificationPolicy = notificationManager.getNotificationPolicy();
        if (notificationPolicy != null) {
            int i = notificationPolicy.suppressedVisualEffects;
            ((defpackage.yqj) yqmVar.l().ai(4291)).w("Current DND notification policy suppressed effects: %d", i);
            if ((i & 256) > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return (currentInterruptionFilter == 3 || currentInterruptionFilter == 4 || z) ? false : true;
    }

    public abstract int a();

    public abstract long b();

    public abstract defpackage.lvn c(int i);

    public abstract defpackage.ygw d();

    public abstract java.lang.String e();

    public java.lang.String f() {
        return this.f;
    }

    protected final void g() {
        this.c = b() + this.e;
    }

    public final void h(boolean z) {
        i(this.b, z);
    }

    public final void j(boolean z) {
        k(this.b, z);
    }

    public abstract boolean l(defpackage.lvn lvnVar);

    public final boolean m() {
        return this.b.getBoolean("group_conversation");
    }

    public final boolean n() {
        return !q();
    }

    public final boolean o() {
        return this.b.getBoolean("muted");
    }

    public final boolean p() {
        return (defpackage.acyc.ah() || q()) && !o();
    }
}
