package x1;

import ef.C2515C;
import ff.AbstractC2640A;
import j$.util.DesugarCollections;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4454g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f47653a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f47655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4454g(p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f47655c = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4454g c4454g = new C4454g(this.f47655c, interfaceC3103c);
        c4454g.f47654b = obj;
        return c4454g;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4454g) create((C4449b) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f47653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4449b c4449b = (C4449b) this.f47654b;
            Fe.e.U(obj);
            return c4449b;
        }
        Fe.e.U(obj);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C4449b) this.f47654b).f47646a);
        AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        C4449b c4449b2 = new C4449b(AbstractC2640A.a0(mapUnmodifiableMap), false);
        this.f47654b = c4449b2;
        this.f47653a = 1;
        return this.f47655c.invoke(c4449b2, this) == aVar ? aVar : c4449b2;
    }
}
