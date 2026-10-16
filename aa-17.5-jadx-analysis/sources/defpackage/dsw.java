package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class dsw extends duc {
    private CharSequence a;

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) mkoVar.d).setBigContentTitle(this.h).bigText(this.a);
        if (this.j) {
            bigTextStyleBigText.setSummaryText(this.i);
        }
    }

    public final void d(CharSequence charSequence) {
        this.a = dsx.c(charSequence);
    }
}
