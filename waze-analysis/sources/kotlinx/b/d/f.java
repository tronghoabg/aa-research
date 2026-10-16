package kotlinx.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f51205a;

    /* renamed from: b, reason: collision with root package name */
    private String f51206b;

    /* renamed from: c, reason: collision with root package name */
    private a f51207c;

    /* renamed from: d, reason: collision with root package name */
    private kotlinx.b.e.e f51208d;

    public f(b bVar) {
        h.g.b.x.f(bVar, "json");
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        this.f51205a = bVar.a().d();
        this.f51206b = bVar.a().b();
        bVar.a();
        bVar.a();
        this.f51207c = bVar.a().c();
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        bVar.a();
        this.f51208d = bVar.b();
    }

    public final h a() {
        boolean z = this.f51205a;
        String str = this.f51206b;
        if (z) {
            if (!h.g.b.x.n(str, "    ")) {
                String str2 = this.f51206b;
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    char cCharAt = str2.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(String.valueOf(this.f51206b)));
                    }
                }
            }
        } else if (!h.g.b.x.n(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new h(this.f51205a, this.f51206b, this.f51207c);
    }

    public final kotlinx.b.e.e b() {
        return this.f51208d;
    }

    public final void c(a aVar) {
        h.g.b.x.f(aVar, "<set-?>");
        this.f51207c = aVar;
    }

    public final void d(kotlinx.b.e.e eVar) {
        h.g.b.x.f(eVar, "<set-?>");
        this.f51208d = eVar;
    }

    public final void e() {
        this.f51205a = true;
    }

    public final void f() {
        h.g.b.x.f("  ", "<set-?>");
        this.f51206b = "  ";
    }
}
