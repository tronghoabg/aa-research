package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes5.dex */
public class y extends x {
    public y(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC3332c.NO_RECEIVER, ((InterfaceC3333d) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public y(Class cls, String str, String str2, int i5) {
        super(AbstractC3332c.NO_RECEIVER, cls, str, str2, i5);
    }
}
