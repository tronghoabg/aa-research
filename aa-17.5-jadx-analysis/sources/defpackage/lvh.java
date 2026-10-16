package defpackage;

import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes2.dex */
public final class lvh extends lvf {
    public MessagingInfo l;
    public int m;
    public StatusBarNotification n;
    public String o;
    public int p;
    public List q;

    public lvh() {
        oit.a();
        Instant.now().toEpochMilli();
        this.e = mny.d;
    }

    @Override // defpackage.lvf
    public final /* synthetic */ void a(String str) {
        this.o = str;
    }

    public final void c(lvg lvgVar) {
        super.b(lvgVar);
        int i = lvi.r;
        lvi lviVar = (lvi) lvgVar;
        this.m = lviVar.q;
        this.o = lviVar.o;
        this.l = lviVar.m;
        this.p = lviVar.n;
        this.n = lviVar.p;
        this.q = lviVar.q();
    }
}
