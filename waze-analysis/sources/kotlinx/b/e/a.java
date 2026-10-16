package kotlinx.b.e;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.b f51234a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlinx.b.b bVar) {
        super(null);
        x.f(bVar, "serializer");
        this.f51234a = bVar;
    }

    public final kotlinx.b.b a() {
        return this.f51234a;
    }

    @Override // kotlinx.b.e.c
    public final kotlinx.b.b b(List list) {
        x.f(list, "typeArgumentsSerializers");
        return this.f51234a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && x.n(((a) obj).f51234a, this.f51234a);
    }

    public final int hashCode() {
        return this.f51234a.hashCode();
    }
}
