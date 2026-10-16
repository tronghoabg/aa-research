package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
final class zeh {
    private final GenericDeclaration a;
    private final String b;
    private final yfq c;

    public zeh(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        zek.e(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.a = genericDeclaration;
        str.getClass();
        this.b = str;
        this.c = yfq.p(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!zef.a) {
            if (obj instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
            }
            return false;
        }
        if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof zei)) {
            zei zeiVar = (zei) Proxy.getInvocationHandler(obj);
            int i = zei.b;
            zeh zehVar = zeiVar.a;
            if (this.b.equals(zehVar.b) && this.a.equals(zehVar.a) && yrm.W(this.c, zehVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
