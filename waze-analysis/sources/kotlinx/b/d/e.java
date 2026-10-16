package kotlinx.b.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f51203a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51204b = d.f51200a;

    @Override // kotlinx.b.a
    public final /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        aa.b(eVar);
        return new c((List) kotlinx.b.a.b.i(n.f51215a).deserialize(eVar));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return f51204b;
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        c cVar = (c) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(cVar, "value");
        aa.c(fVar);
        kotlinx.b.a.b.i(n.f51215a).serialize(fVar, cVar);
    }
}
