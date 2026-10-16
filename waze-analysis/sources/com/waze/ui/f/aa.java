package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.q f42265a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.q f42266b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.q f42267c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.q f42268d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.q f42269e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.q f42270f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.q f42271g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.q f42272h;

    /* renamed from: i, reason: collision with root package name */
    private final h.g.a.q f42273i;

    public aa(h.g.a.q qVar, h.g.a.q qVar2, h.g.a.q qVar3, h.g.a.q qVar4, h.g.a.q qVar5, h.g.a.q qVar6, h.g.a.q qVar7, h.g.a.q qVar8, h.g.a.q qVar9) {
        h.g.b.x.f(qVar, "idleUi");
        h.g.b.x.f(qVar2, "listeningUi");
        h.g.b.x.f(qVar3, "processingUi");
        h.g.b.x.f(qVar4, "speakingUi");
        h.g.b.x.f(qVar5, "fteHintUi");
        h.g.b.x.f(qVar6, "mutedUi");
        h.g.b.x.f(qVar7, "successUi");
        h.g.b.x.f(qVar8, "errorUi");
        h.g.b.x.f(qVar9, "pausedUi");
        this.f42265a = qVar;
        this.f42266b = qVar2;
        this.f42267c = qVar3;
        this.f42268d = qVar4;
        this.f42269e = qVar5;
        this.f42270f = qVar6;
        this.f42271g = qVar7;
        this.f42272h = qVar8;
        this.f42273i = qVar9;
    }

    public final h.g.a.q a() {
        return this.f42272h;
    }

    public final h.g.a.q b() {
        return this.f42269e;
    }

    public final h.g.a.q c() {
        return this.f42265a;
    }

    public final h.g.a.q d() {
        return this.f42266b;
    }

    public final h.g.a.q e() {
        return this.f42270f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f42265a, aaVar.f42265a) && h.g.b.x.n(this.f42266b, aaVar.f42266b) && h.g.b.x.n(this.f42267c, aaVar.f42267c) && h.g.b.x.n(this.f42268d, aaVar.f42268d) && h.g.b.x.n(this.f42269e, aaVar.f42269e) && h.g.b.x.n(this.f42270f, aaVar.f42270f) && h.g.b.x.n(this.f42271g, aaVar.f42271g) && h.g.b.x.n(this.f42272h, aaVar.f42272h) && h.g.b.x.n(this.f42273i, aaVar.f42273i);
    }

    public final h.g.a.q f() {
        return this.f42273i;
    }

    public final h.g.a.q g() {
        return this.f42267c;
    }

    public final h.g.a.q h() {
        return this.f42268d;
    }

    public final int hashCode() {
        return (((((((((((((((this.f42265a.hashCode() * 31) + this.f42266b.hashCode()) * 31) + this.f42267c.hashCode()) * 31) + this.f42268d.hashCode()) * 31) + this.f42269e.hashCode()) * 31) + this.f42270f.hashCode()) * 31) + this.f42271g.hashCode()) * 31) + this.f42272h.hashCode()) * 31) + this.f42273i.hashCode();
    }

    public final h.g.a.q i() {
        return this.f42271g;
    }

    public final String toString() {
        return "ConversationUiProviders(idleUi=" + this.f42265a + ", listeningUi=" + this.f42266b + ", processingUi=" + this.f42267c + ", speakingUi=" + this.f42268d + ", fteHintUi=" + this.f42269e + ", mutedUi=" + this.f42270f + ", successUi=" + this.f42271g + ", errorUi=" + this.f42272h + ", pausedUi=" + this.f42273i + ")";
    }
}
