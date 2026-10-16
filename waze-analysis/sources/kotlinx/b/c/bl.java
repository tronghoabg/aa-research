package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl<T> implements kotlinx.b.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f50999a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.a.q f51000b;

    public bl(kotlinx.b.b bVar) {
        h.g.b.x.f(bVar, "serializer");
        this.f50999a = bVar;
        this.f51000b = new bz(bVar.getDescriptor());
    }

    @Override // kotlinx.b.a
    public final T deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        return eVar.decodeNotNullMark() ? (T) eVar.decodeSerializableValue(this.f50999a) : (T) eVar.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && h.g.b.x.n(this.f50999a, ((bl) obj).f50999a);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return this.f51000b;
    }

    public final int hashCode() {
        return this.f50999a.hashCode();
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, T t) {
        h.g.b.x.f(fVar, "encoder");
        if (t == null) {
            fVar.encodeNull();
        } else {
            fVar.encodeNotNullMark();
            fVar.encodeSerializableValue(this.f50999a, t);
        }
    }
}
