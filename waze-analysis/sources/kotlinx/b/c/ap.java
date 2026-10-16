package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.b.b f50966a;

    ap(kotlinx.b.b bVar) {
        this.f50966a = bVar;
    }

    @Override // kotlinx.b.c.ak
    public final kotlinx.b.b<?>[] childSerializers() {
        return new kotlinx.b.b[]{this.f50966a};
    }

    @Override // kotlinx.b.a
    public final Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, Object obj) {
        h.g.b.x.f(fVar, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.b.c.ak
    public final /* synthetic */ kotlinx.b.b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
