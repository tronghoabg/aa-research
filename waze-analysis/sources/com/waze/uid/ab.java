package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab implements com.waze.uid.d.o {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f44050a = h.g.a(new com.waze.ui.o.ac(18));

    /* renamed from: b, reason: collision with root package name */
    private final h.f f44051b = h.g.a(new com.waze.ui.r.a.e.c(1));

    /* renamed from: c, reason: collision with root package name */
    private final h.f f44052c = h.g.a(new com.waze.ui.r.a.e.c(2));

    /* renamed from: d, reason: collision with root package name */
    private final h.f f44053d = h.g.a(new com.waze.ui.r.a.e.c(3));

    /* renamed from: e, reason: collision with root package name */
    private final h.f f44054e = h.g.a(new com.waze.ui.r.a.e.c(4));

    /* renamed from: f, reason: collision with root package name */
    private final h.f f44055f = h.g.a(new com.waze.ui.r.a.e.c(5));

    /* renamed from: g, reason: collision with root package name */
    private final h.f f44056g = h.g.a(new com.waze.ui.r.a.e.c(6));

    /* renamed from: h, reason: collision with root package name */
    private final h.f f44057h = h.g.a(new com.waze.ui.r.a.e.c(7));

    /* renamed from: i, reason: collision with root package name */
    private final h.f f44058i = h.g.a(new com.waze.ui.r.a.e.c(8));

    /* renamed from: j, reason: collision with root package name */
    private final h.f f44059j = h.g.a(new com.waze.ui.o.ac(19));

    /* renamed from: k, reason: collision with root package name */
    private final h.f f44060k = h.g.a(new com.waze.ui.o.ac(20));

    @Override // com.waze.uid.d.o
    public final String a() {
        String str = (String) this.f44055f.getValue();
        h.g.b.x.e(str, "<get-changeEmail2faUrlDelegate>(...)");
        return str;
    }

    @Override // com.waze.uid.d.o
    public final String b() {
        String str = (String) this.f44051b.getValue();
        h.g.b.x.e(str, "<get-experimentGroupDelegate>(...)");
        return str;
    }

    @Override // com.waze.uid.d.o
    public final String c() {
        String str = (String) this.f44050a.getValue();
        h.g.b.x.e(str, "<get-experimentNameDelegate>(...)");
        return str;
    }

    @Override // com.waze.uid.d.o
    public final boolean d() {
        Boolean bool = (Boolean) this.f44058i.getValue();
        h.g.b.x.e(bool, "<get-allowCreateFromAccountNotFoundDelegate>(...)");
        return bool.booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean e() {
        return ((Boolean) this.f44053d.getValue()).booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean f() {
        return ((Boolean) this.f44052c.getValue()).booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean g() {
        Boolean bool = (Boolean) this.f44054e.getValue();
        h.g.b.x.e(bool, "<get-isChangeEmail2faEnabledDelegate>(...)");
        return bool.booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean h() {
        Boolean bool = (Boolean) this.f44056g.getValue();
        h.g.b.x.e(bool, "<get-isOnboardingVisualA…mentEnabledDelegate>(...)");
        return bool.booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean i() {
        Boolean bool = (Boolean) this.f44057h.getValue();
        h.g.b.x.e(bool, "<get-shouldUseStoredCredentialsDelegate>(...)");
        return bool.booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean j() {
        Boolean bool = (Boolean) this.f44060k.getValue();
        h.g.b.x.e(bool, "<get-showHomeAndWorkScreenDelegate>(...)");
        return bool.booleanValue();
    }

    @Override // com.waze.uid.d.o
    public final boolean k() {
        Boolean bool = (Boolean) this.f44059j.getValue();
        h.g.b.x.e(bool, "<get-showVehicleTypeSelectionDelegate>(...)");
        return bool.booleanValue();
    }
}
