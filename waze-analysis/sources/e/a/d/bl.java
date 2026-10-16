package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bl {

    /* renamed from: a, reason: collision with root package name */
    final e.a.br f46677a;

    /* renamed from: b, reason: collision with root package name */
    final e.a.ee f46678b;

    private bl(e.a.br brVar, e.a.ee eeVar) {
        this.f46677a = brVar;
        this.f46678b = eeVar;
    }

    public final bl a(e.a.br brVar) {
        return new bl(brVar, this.f46678b);
    }

    public final bl b(e.a.ee eeVar) {
        return new bl(this.f46677a, eeVar);
    }

    /* synthetic */ bl() {
        this(null, null);
    }
}
