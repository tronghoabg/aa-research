package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class afwb implements InvocationHandler {
    private final Class arg$0;
    private final Map arg$1;
    private final aezr arg$2;
    private final aezr arg$3;
    private final List arg$4;

    public afwb(Class cls, Map map, aezr aezrVar, aezr aezrVar2, List list) {
        this.arg$0 = cls;
        this.arg$1 = map;
        this.arg$2 = aezrVar;
        this.arg$3 = aezrVar2;
        this.arg$4 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return afwd.createAnnotationInstance$lambda$6(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, obj, method, objArr);
    }
}
