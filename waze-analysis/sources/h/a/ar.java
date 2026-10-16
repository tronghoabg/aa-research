package h.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f47984a;

    /* renamed from: b, reason: collision with root package name */
    private int f47985b;

    /* renamed from: c, reason: collision with root package name */
    private int f47986c;

    ar(as asVar) {
        this.f47984a = asVar;
        this.f47985b = asVar.size();
        this.f47986c = asVar.f47989c;
    }

    @Override // h.a.b
    protected final void a() {
        if (this.f47985b == 0) {
            b();
            return;
        }
        as asVar = this.f47984a;
        c(asVar.f47987a[this.f47986c]);
        this.f47986c = (this.f47986c + 1) % asVar.f47988b;
        this.f47985b--;
    }
}
