package u1;

import ac.C1346a;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: u1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4221j {
    public static C4209G a(InterfaceC4224m serializer, C1346a c1346a, List list, Ef.E scope, tf.a aVar, int i5) {
        InterfaceC4213b interfaceC4213b = c1346a;
        if ((i5 & 2) != 0) {
            interfaceC4213b = null;
        }
        if ((i5 & 4) != 0) {
            list = ff.v.f35432a;
        }
        AbstractC3340k.e(serializer, "serializer");
        AbstractC3340k.e(scope, "scope");
        InterfaceC4213b dVar = interfaceC4213b;
        if (interfaceC4213b == null) {
            dVar = new ae.d(14);
        }
        return new C4209G(aVar, serializer, AbstractC3935e.C(new C4216e(list, null)), dVar, scope);
    }
}
