package kotlinx.b.d.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.d.b f51166b;

    /* renamed from: c, reason: collision with root package name */
    private int f51167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, kotlinx.b.d.b bVar) {
        super(vVar);
        h.g.b.x.f(vVar, "writer");
        h.g.b.x.f(bVar, "json");
        this.f51166b = bVar;
    }

    @Override // kotlinx.b.d.a.i
    public final void a() {
        k(true);
        this.f51167c++;
    }

    @Override // kotlinx.b.d.a.i
    public final void b() throws IOException {
        k(false);
        h("\n");
        int i2 = this.f51167c;
        for (int i3 = 0; i3 < i2; i3++) {
            h(this.f51166b.a().b());
        }
    }

    @Override // kotlinx.b.d.a.i
    public final void c() {
        if (n()) {
            k(false);
        } else {
            b();
        }
    }

    @Override // kotlinx.b.d.a.i
    public final void l() throws IOException {
        e(' ');
    }

    @Override // kotlinx.b.d.a.i
    public final void m() {
        this.f51167c--;
    }
}
