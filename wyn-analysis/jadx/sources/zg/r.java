package zg;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Method f48636a;

    /* renamed from: b, reason: collision with root package name */
    public final List f48637b;

    public r(Method method, ArrayList arrayList) {
        this.f48636a = method;
        this.f48637b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f48636a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f48637b);
    }
}
