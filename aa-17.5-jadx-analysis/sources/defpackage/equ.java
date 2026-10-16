package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
final class equ implements epy {
    private final Object a;
    private final etf b;

    public equ(Object obj) {
        this.a = obj;
        this.b = epb.a.c(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r0 = this.b.b;
        List list = (List) r0.get(eprVar);
        Object obj = this.a;
        etf.a(list, eqaVar, eprVar, obj);
        etf.a((List) r0.get(epr.ON_ANY), eqaVar, eprVar, obj);
    }
}
