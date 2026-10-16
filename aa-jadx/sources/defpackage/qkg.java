package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkg {
    public android.service.notification.StatusBarNotification a;
    public java.util.List b;
    public java.lang.String c;
    public long d;
    public android.app.PendingIntent e;
    public java.util.List f = new java.util.ArrayList();
    public java.lang.String g;
    public java.lang.String h;
    public android.graphics.drawable.Icon i;
    public android.app.PendingIntent j;
    public android.app.PendingIntent k;
    public android.app.RemoteInput l;
    public boolean m;
    public java.lang.String n;

    public final void a(defpackage.qkh qkhVar) {
        this.f.add(qkhVar);
    }

    public final void b(com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo) {
        this.a = messagingInfo.a;
        this.b = messagingInfo.b;
        this.c = messagingInfo.c;
        this.d = messagingInfo.d;
        this.e = messagingInfo.g;
        this.f = messagingInfo.e;
        this.g = messagingInfo.f;
        this.h = messagingInfo.k;
        this.i = messagingInfo.l;
        this.j = messagingInfo.h;
        this.k = messagingInfo.i;
        this.l = messagingInfo.j;
        this.m = messagingInfo.m;
        this.n = messagingInfo.n;
    }
}
