package defpackage;

import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class epa {
    public final int a;
    public final Method b;

    public epa(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epa)) {
            return false;
        }
        epa epaVar = (epa) obj;
        return this.a == epaVar.a && this.b.getName().equals(epaVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
