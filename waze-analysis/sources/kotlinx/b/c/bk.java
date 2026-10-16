package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bk implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final bk f50997a = new bk();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f50998b = bj.f50994a;

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        throw new kotlinx.b.k("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f50998b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f((Void) obj, "value");
        throw new kotlinx.b.k("'kotlin.Nothing' cannot be serialized");
    }
}
