package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class lxb extends lue {
    private static final yph a = yph.c("GH.MessagingStreamItem");
    public static final /* synthetic */ int e = 0;
    public final Bundle d;

    public lxb(lxa lxaVar) {
        super(lxaVar);
        this.d = lxaVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean n() {
        /*
            mki r0 = defpackage.mki.a
            android.content.Context r0 = r0.c
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r1 = r0.getCurrentInterruptionFilter()
            yph r2 = defpackage.lxb.a
            yop r3 = r2.l()
            r4 = 4424(0x1148, float:6.2E-42)
            yop r3 = r3.ai(r4)
            ype r3 = (defpackage.ype) r3
            java.lang.String r4 = "Current DND notification Filter: %d"
            r3.w(r4, r1)
            r3 = 1
            if (r1 != r3) goto L27
            return r3
        L27:
            android.app.NotificationManager$Policy r0 = r0.getNotificationPolicy()
            r4 = 0
            if (r0 == 0) goto L49
            int r0 = defpackage.a$$ExternalSyntheticApiModelOutline3.m(r0)
            yop r2 = r2.l()
            r5 = 4425(0x1149, float:6.201E-42)
            yop r2 = r2.ai(r5)
            ype r2 = (defpackage.ype) r2
            java.lang.String r5 = "Current DND notification policy suppressed effects: %d"
            r2.w(r5, r0)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 <= 0) goto L49
            r0 = r3
            goto L4a
        L49:
            r0 = r4
        L4a:
            r2 = 3
            if (r1 == r2) goto L53
            r2 = 4
            if (r1 == r2) goto L53
            if (r0 != 0) goto L53
            return r3
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb.n():boolean");
    }

    public static void r(Bundle bundle, boolean z) {
        ((ype) a.l().ai((char) 4426)).y("Conversation muted: %b", Boolean.valueOf(z));
        bundle.putBoolean("muted", z);
    }

    public static void t(Bundle bundle, boolean z) {
        ((ype) a.l().ai((char) 4427)).y("Per-conversation Visual Preview enabled: %b", Boolean.valueOf(z));
        bundle.putBoolean("visual_preview", z);
    }

    @Override // defpackage.lue
    public final Bundle c() {
        return this.d;
    }

    @Override // defpackage.lue
    public final void g(boolean z) {
        r(this.d, z);
    }

    @Override // defpackage.lue
    public final boolean i() {
        return this.d.getBoolean("group_conversation");
    }

    @Override // defpackage.lue
    public final boolean j() {
        return !n();
    }

    @Override // defpackage.lue
    public final boolean k() {
        return this.d.getBoolean("muted");
    }

    @Override // defpackage.lue
    public final boolean l() {
        return this.d.getBoolean("visual_preview");
    }

    @Override // defpackage.lue
    public final boolean m() {
        return (acxa.ag() || n()) && !k();
    }

    protected final void q() {
        this.p = Long.valueOf(b() + this.k);
    }

    public final void s(boolean z) {
        t(this.d, z);
    }
}
