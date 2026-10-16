package com.waze.br.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.a.t f17320a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17321b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f17322c;

    public d(com.waze.br.a.t tVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(tVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f17320a = tVar;
        this.f17321b = eVar;
        this.f17322c = h.g.a(new r(this, 1));
    }

    static final f c(d dVar) {
        return new f(dVar.f17321b);
    }

    @Override // com.waze.t.b.ai
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a() {
        if (this.f17320a.a()) {
            return (c) this.f17322c.getValue();
        }
        throw new IllegalStateException("SearchMateActionHandler is disabled");
    }
}
