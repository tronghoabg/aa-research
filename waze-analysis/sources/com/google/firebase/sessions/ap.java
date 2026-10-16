package com.google.firebase.sessions;

import java.util.Locale;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f10827a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10828b;

    /* renamed from: c, reason: collision with root package name */
    private int f10829c;

    /* renamed from: d, reason: collision with root package name */
    private ah f10830d;

    public ap(ba baVar, h.g.a.a aVar) {
        h.g.b.x.f(baVar, "timeProvider");
        h.g.b.x.f(aVar, "uuidGenerator");
        this.f10827a = aVar;
        this.f10828b = c();
        this.f10829c = -1;
    }

    private final String c() {
        String string = ((UUID) this.f10827a.invoke()).toString();
        h.g.b.x.e(string, "toString(...)");
        String lowerCase = h.n.o.ac(string, "-", "").toLowerCase(Locale.ROOT);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final ah a() {
        ah ahVar = this.f10830d;
        if (ahVar != null) {
            return ahVar;
        }
        h.g.b.x.j("currentSession");
        return null;
    }

    public final void b() {
        int i2 = this.f10829c + 1;
        this.f10829c = i2;
        this.f10830d = new ah(i2 == 0 ? this.f10828b : c(), this.f10828b, this.f10829c, System.currentTimeMillis() * 1000);
        a();
    }
}
