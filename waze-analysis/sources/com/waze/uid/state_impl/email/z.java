package com.waze.uid.state_impl.email;

import androidx.core.app.NotificationCompat;
import com.waze.sharedui.api.EmailConsent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final String f44666a;

    /* renamed from: b, reason: collision with root package name */
    private final EmailConsent f44667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, EmailConsent emailConsent) {
        super((byte[]) null);
        h.g.b.x.f(str, NotificationCompat.CATEGORY_EMAIL);
        h.g.b.x.f(emailConsent, "consent");
        this.f44666a = str;
        this.f44667b = emailConsent;
    }

    public final EmailConsent a() {
        return this.f44667b;
    }

    public final String b() {
        return this.f44666a;
    }
}
