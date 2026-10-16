package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* loaded from: classes3.dex */
final class zdt extends zdw {
    @Override // defpackage.zdw
    public final /* synthetic */ Class a(Object obj) {
        return ((zdz) obj).c();
    }

    @Override // defpackage.zdw
    public final /* synthetic */ Iterable b(Object obj) {
        zdz zdzVar = (zdz) obj;
        Type type = zdzVar.a;
        if (type instanceof TypeVariable) {
            return zdz.e(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return zdz.e(((WildcardType) type).getUpperBounds());
        }
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (Type type2 : zdzVar.c().getGenericInterfaces()) {
            yflVar.i(zdzVar.b(type2));
        }
        return yflVar.g();
    }

    @Override // defpackage.zdw
    public final /* synthetic */ Object c(Object obj) {
        zdz zdzVar = (zdz) obj;
        Type type = zdzVar.a;
        if (type instanceof TypeVariable) {
            return zdz.d(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return zdz.d(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = zdzVar.c().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return zdzVar.b(genericSuperclass);
    }
}
