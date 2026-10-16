package kotlinx.b.e;

import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final l f51235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        super(null);
        x.f(lVar, "provider");
        this.f51235a = lVar;
    }

    public final l a() {
        return this.f51235a;
    }

    @Override // kotlinx.b.e.c
    public final kotlinx.b.b b(List list) {
        x.f(list, "typeArgumentsSerializers");
        return (kotlinx.b.b) this.f51235a.invoke(list);
    }
}
