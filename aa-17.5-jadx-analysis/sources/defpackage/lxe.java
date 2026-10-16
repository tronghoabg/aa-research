package defpackage;

import android.app.RemoteInput;
import android.service.notification.StatusBarNotification;
import j$.time.Instant;

/* loaded from: classes2.dex */
final class lxe {
    public StatusBarNotification a;
    public Instant b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public byte j;

    static /* synthetic */ void e(qjk qjkVar, dst dstVar, dst dstVar2) {
        qjkVar.e = dstVar.k;
        qjkVar.j = dstVar2.k;
        dum dumVar = dstVar2.b[0];
        qjkVar.l = new RemoteInput.Builder(dumVar.a).setLabel(dumVar.b).setChoices(dumVar.c).setAllowFreeFormInput(dumVar.d).addExtras(dumVar.f).build();
    }

    public final void a(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | (-128));
    }

    public final void b(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 64);
    }

    public final void c(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | (-128));
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 64);
    }
}
