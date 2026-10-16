package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final cx f51070a = new cx();

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ bm f51071b = new bm("kotlin.Unit", h.ab.f48028a);

    private cx() {
    }

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        this.f51071b.deserialize(eVar);
        return h.ab.f48028a;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51071b.getDescriptor();
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.ab abVar = (h.ab) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(abVar, "value");
        this.f51071b.serialize(fVar, abVar);
    }
}
