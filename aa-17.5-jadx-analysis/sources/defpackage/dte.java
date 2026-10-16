package defpackage;

import android.app.Notification;

/* loaded from: classes2.dex */
public final class dte extends duc {
    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        ((Notification.Builder) mkoVar.d).setStyle(dtd.a());
    }

    @Override // defpackage.duc
    public final void i() {
    }
}
