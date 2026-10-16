package defpackage;

import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes2.dex */
public final class lwy extends lxa {
    public MessagingInfo a;
    public StatusBarNotification b;
    public int c;
    public List d;

    public lwy() {
        this.j = yzr.IM_NOTIFICATION;
        oit.a();
        this.m = Instant.now().toEpochMilli();
        this.r = mny.d;
    }

    public final void a(moa moaVar) {
        super.b(moaVar);
        lwz lwzVar = (lwz) moaVar;
        this.a = lwzVar.a;
        this.c = lwzVar.b;
        this.b = lwzVar.c;
        this.d = lwzVar.n();
    }
}
