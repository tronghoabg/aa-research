package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class lvg {
    public static final /* synthetic */ int l = 0;
    private static final yph m = yph.c("GH.Conversation");
    public boolean a;
    public final Bundle b;
    public long c;
    public final mny d;
    public final long e;
    public final String f;
    public int g;
    public final int h;
    public final Bitmap i;
    public final Uri j;
    public String k;

    public lvg(lvf lvfVar) {
        this.a = lvfVar.a;
        this.b = lvfVar.c;
        this.c = lvfVar.d;
        this.d = lvfVar.e;
        this.k = lvfVar.b;
        this.e = lvfVar.f;
        this.f = lvfVar.g;
        this.g = lvfVar.h;
        this.h = lvfVar.i;
        this.i = lvfVar.j;
        this.j = lvfVar.k;
    }

    public static void i(Bundle bundle, boolean z) {
        ((ype) m.l().ai((char) 4289)).y("Conversation muted: %b", Boolean.valueOf(z));
        bundle.putBoolean("muted", z);
    }

    public static void k(Bundle bundle, boolean z) {
        ((ype) m.l().ai((char) 4290)).y("Per-conversation Visual Preview enabled: %b", Boolean.valueOf(z));
        bundle.putBoolean("visual_preview", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean q() {
        /*
            mki r0 = defpackage.mki.a
            android.content.Context r0 = r0.c
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r0.getClass()
            int r1 = r0.getCurrentInterruptionFilter()
            yph r2 = defpackage.lvg.m
            yop r3 = r2.l()
            r4 = 4287(0x10bf, float:6.007E-42)
            yop r3 = r3.ai(r4)
            ype r3 = (defpackage.ype) r3
            java.lang.String r4 = "Current DND notification Filter: %d"
            r3.w(r4, r1)
            r3 = 1
            if (r1 != r3) goto L2a
            return r3
        L2a:
            android.app.NotificationManager$Policy r0 = r0.getNotificationPolicy()
            r4 = 0
            if (r0 == 0) goto L4c
            int r0 = defpackage.a$$ExternalSyntheticApiModelOutline3.m(r0)
            yop r2 = r2.l()
            r5 = 4288(0x10c0, float:6.009E-42)
            yop r2 = r2.ai(r5)
            ype r2 = (defpackage.ype) r2
            java.lang.String r5 = "Current DND notification policy suppressed effects: %d"
            r2.w(r5, r0)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 <= 0) goto L4c
            r0 = r3
            goto L4d
        L4c:
            r0 = r4
        L4d:
            r2 = 3
            if (r1 == r2) goto L56
            r2 = 4
            if (r1 == r2) goto L56
            if (r0 != 0) goto L56
            return r3
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvg.q():boolean");
    }

    public abstract int a();

    public abstract long b();

    public abstract lvg c(int i);

    public abstract yfq d();

    public abstract String e();

    public String f() {
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

    public abstract boolean l(lvg lvgVar);

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
        return (acxa.ag() || q()) && !o();
    }
}
