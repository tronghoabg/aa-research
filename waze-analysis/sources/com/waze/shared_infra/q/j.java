package com.waze.shared_infra.q;

import com.waze.t.b.as;
import h.g.b.x;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37943a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37944b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37945c;

    public j(com.waze.shared_infra.s.b bVar, e eVar) {
        x.f(bVar, "localeData");
        x.f(eVar, "clock");
        this.f37943a = bVar;
        this.f37944b = eVar;
        this.f37945c = bVar.getLocale();
    }

    public final String a(long j2) {
        return new SimpleDateFormat("EEE, dd MMM yyyy", (Locale) this.f37945c).format(Long.valueOf(j2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.shared_infra.s.b, java.lang.Object] */
    public final String b(long j2) {
        boolean zIs24HrClock = this.f37943a.is24HrClock();
        Object obj = this.f37945c;
        if (zIs24HrClock) {
            String str = new SimpleDateFormat("HH:mm", (Locale) obj).format(Long.valueOf(j2));
            x.c(str);
            return str;
        }
        String str2 = new SimpleDateFormat("h:mm a", (Locale) obj).format(Long.valueOf(j2));
        x.c(str2);
        return str2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.waze.shared_infra.q.e, java.lang.Object] */
    public final String c(int i2, int i3) {
        Calendar calendarC = this.f37944b.c();
        calendarC.set(11, i2);
        calendarC.set(12, i3);
        return b(calendarC.getTimeInMillis());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.t.b.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.waze.shared_infra.m.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final com.waze.t.b.h d(h.g.a.a aVar) {
        x.f(aVar, "onConversationClosed");
        as asVarA = this.f37944b.a(this.f37945c, aVar);
        if (asVarA instanceof com.waze.t.b.f) {
            this.f37943a.e("start conversation success");
            return ((com.waze.t.b.f) asVarA).a();
        }
        if (!(asVarA instanceof com.waze.t.b.d)) {
            throw new h.i();
        }
        ?? r2 = this.f37943a;
        com.waze.t.b.e eVarA = ((com.waze.t.b.d) asVarA).a();
        Objects.toString(eVarA);
        r2.b("Failed to start conversation: ".concat(String.valueOf(eVarA)));
        return null;
    }

    public j(com.waze.shared_infra.m.a aVar, com.waze.t.b.g gVar, com.waze.shared_infra.i.e eVar) {
        x.f(gVar, "conversationStarter");
        x.f(eVar, "logger");
        this.f37945c = aVar;
        this.f37944b = gVar;
        this.f37943a = eVar;
    }
}
