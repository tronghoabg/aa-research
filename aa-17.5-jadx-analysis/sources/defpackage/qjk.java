package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qjk {
    public StatusBarNotification a;
    public List b;
    public String c;
    public long d;
    public PendingIntent e;
    public List f = new ArrayList();
    public String g;
    public String h;
    public Icon i;
    public PendingIntent j;
    public PendingIntent k;
    public RemoteInput l;
    public boolean m;
    public String n;

    public final void a(qjl qjlVar) {
        this.f.add(qjlVar);
    }

    public final void b(MessagingInfo messagingInfo) {
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
