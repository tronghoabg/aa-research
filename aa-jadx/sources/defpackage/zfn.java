package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zfn {
    private final java.lang.reflect.GenericDeclaration a;
    private final java.lang.String b;
    private final defpackage.ygw c;

    public zfn(java.lang.reflect.GenericDeclaration genericDeclaration, java.lang.String str, java.lang.reflect.Type[] typeArr) {
        defpackage.zfq.e(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.a = genericDeclaration;
        str.getClass();
        this.b = str;
        this.c = defpackage.ygw.p(typeArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!defpackage.zfl.a) {
            if (obj instanceof java.lang.reflect.TypeVariable) {
                java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) obj;
                if (this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
            }
            return false;
        }
        if (obj != null && java.lang.reflect.Proxy.isProxyClass(obj.getClass()) && (java.lang.reflect.Proxy.getInvocationHandler(obj) instanceof defpackage.zfo)) {
            defpackage.zfo zfoVar = (defpackage.zfo) java.lang.reflect.Proxy.getInvocationHandler(obj);
            int i = defpackage.zfo.b;
            defpackage.zfn zfnVar = zfoVar.a;
            if (this.b.equals(zfnVar.b) && this.a.equals(zfnVar.a) && defpackage.ysr.W(this.c, zfnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
