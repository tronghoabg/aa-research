package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import x0.AbstractC4446p;

/* loaded from: classes5.dex */
public final class r extends q {
    public r(KClass kClass, String str, String str2) {
        super(AbstractC3332c.NO_RECEIVER, ((InterfaceC3333d) kClass).getJClass(), str, str2, !(kClass instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public r(String str, String str2) {
        super(AbstractC3332c.NO_RECEIVER, AbstractC4446p.class, str, str2, 1);
    }
}
