package kotlinx.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.ab;
import h.g.b.at;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a.v;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends kotlinx.b.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f51251a;

    /* renamed from: b, reason: collision with root package name */
    private final List f51252b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f51253c;

    public f(h.l.c cVar) {
        x.f(cVar, "baseClass");
        this.f51251a = cVar;
        this.f51252b = h.a.i.h();
        this.f51253c = h.g.b(h.h.f48131b, new h.g.a.a() { // from class: kotlinx.b.e
            @Override // h.g.a.a
            public final Object invoke() {
                return f.c(this.f51233a);
            }
        });
    }

    static final ab a(f fVar, kotlinx.b.a.a aVar) {
        x.f(aVar, "$this$buildSerialDescriptor");
        kotlinx.b.a.a.g(aVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, kotlinx.b.a.b.u(at.f48108a).getDescriptor());
        kotlinx.b.a.a.g(aVar, "value", h.k.n.z("kotlinx.serialization.Polymorphic<" + fVar.f51251a.c() + '>', v.f50938a, new kotlinx.b.a.q[0], new z(6)));
        aVar.f(fVar.f51252b);
        return ab.f48028a;
    }

    static final kotlinx.b.a.q c(f fVar) {
        return kotlinx.b.a.b.b(h.k.n.z("kotlinx.serialization.Polymorphic", kotlinx.b.a.d.f50909a, new kotlinx.b.a.q[0], new g(fVar, 1)), fVar.f51251a);
    }

    @Override // kotlinx.b.c.b
    public final h.l.c b() {
        return this.f51251a;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return (kotlinx.b.a.q) this.f51253c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f51251a + ')';
    }
}
