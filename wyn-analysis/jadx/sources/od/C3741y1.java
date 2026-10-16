package od;

/* renamed from: od.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3741y1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f42130b;

    public C3741y1(B0 b02, Object obj) {
        this.f42130b = b02;
        this.f42129a = obj;
    }

    @Override // od.A1
    public final void a(G1 g12) {
        g12.f41564a.c(this.f42130b.f41495a.f(this.f42129a));
        g12.f41564a.flush();
    }
}
