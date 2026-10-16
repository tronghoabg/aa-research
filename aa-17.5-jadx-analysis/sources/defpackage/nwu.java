package defpackage;

import android.app.PendingIntent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class nwu extends nwt {
    private static final yph a = yph.c("GH.NIntentAction");
    private final PendingIntent e;

    public nwu(GhIcon ghIcon, PendingIntent pendingIntent) {
        this(ghIcon, null, pendingIntent, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    @Override // defpackage.nwt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws android.app.PendingIntent.CanceledException {
        /*
            r9 = this;
            android.app.PendingIntent r0 = r9.e
            if (r0 != 0) goto L5
            return
        L5:
            oga r1 = defpackage.ogb.a
            boolean r1 = defpackage.acqd.p()
            java.lang.String r8 = "action intent canceled: %s"
            if (r1 == 0) goto L69
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeBasic()
            r2 = 0
            defpackage.a$$ExternalSyntheticApiModelOutline0.m(r1, r2)
            boolean r2 = defpackage.hrq.a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 36
            if (r2 < r3) goto L20
            goto L2b
        L20:
            boolean r2 = defpackage.hrq.a
            if (r2 != 0) goto L27
            defpackage.hrq.b()
        L27:
            boolean r2 = defpackage.hrq.b
            if (r2 == 0) goto L3e
        L2b:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L34
            r2 = 3
            defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r1, r2)
            goto L3e
        L34:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r2 != r3) goto L3e
            r2 = 1
            defpackage.awx$$ExternalSyntheticApiModelOutline0.m(r1, r2)
        L3e:
            android.os.Bundle r7 = r1.toBundle()     // Catch: android.app.PendingIntent.CanceledException -> L4c
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.send(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.app.PendingIntent.CanceledException -> L4c
            return
        L4c:
            r0 = move-exception
            yph r1 = defpackage.nwu.a
            yop r1 = r1.h()
            ype r1 = (defpackage.ype) r1
            yop r0 = r1.p(r0)
            ype r0 = (defpackage.ype) r0
            r1 = 5521(0x1591, float:7.737E-42)
            yop r0 = r0.ai(r1)
            ype r0 = (defpackage.ype) r0
            android.app.PendingIntent r9 = r9.e
            r0.y(r8, r9)
            return
        L69:
            android.app.PendingIntent r0 = r9.e     // Catch: android.app.PendingIntent.CanceledException -> L6f
            r0.send()     // Catch: android.app.PendingIntent.CanceledException -> L6f
            return
        L6f:
            yph r0 = defpackage.nwu.a
            yop r0 = r0.h()
            ype r0 = (defpackage.ype) r0
            r1 = 5520(0x1590, float:7.735E-42)
            yop r0 = r0.ai(r1)
            ype r0 = (defpackage.ype) r0
            android.app.PendingIntent r9 = r9.e
            r0.y(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwu.a():void");
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nwu)) {
            nwu nwuVar = (nwu) obj;
            if (nwt.c(this.b, nwuVar.b) && Objects.equals(this.e, nwuVar.e) && this.d == nwuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.e, Integer.valueOf(this.d));
    }

    public final String toString() {
        return String.format("NotificationUiIntentAction[icon=%s, intent=%s, semanticType=%s]", this.b, this.e, nsh.h(this.d));
    }

    public nwu(GhIcon ghIcon, String str, PendingIntent pendingIntent, int i) {
        super(ghIcon, str, i);
        this.e = pendingIntent;
    }
}
