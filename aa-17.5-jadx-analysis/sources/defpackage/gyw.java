package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gyw implements hem {
    private final Map a = new LinkedHashMap();

    public final gwc a(Class cls) {
        cls.getClass();
        gwc gwcVarB = b(cls);
        if (gwcVarB != null) {
            return gwcVarB;
        }
        throw new IllegalStateException("No InternalModel to UiModel converter found for " + cls + ". Registered converters: " + this.a.keySet());
    }

    public final gwc b(Class cls) {
        cls.getClass();
        afdr afdrVar = (afdr) this.a.get(cls);
        if (afdrVar == null) {
            return null;
        }
        Object objInvoke = afdrVar.invoke();
        objInvoke.getClass();
        return (gwc) objInvoke;
    }

    public final void c(Class cls, afdr afdrVar) {
        this.a.put(cls, afdrVar);
    }
}
