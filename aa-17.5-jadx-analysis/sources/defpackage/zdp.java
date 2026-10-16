package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class zdp {
    public final yfy c;

    public zdp() {
        this.c = ylx.a;
    }

    public Type a(TypeVariable typeVariable, zdp zdpVar) {
        Type type = (Type) this.c.get(new zdq(typeVariable));
        if (type != null) {
            return new oct(zdpVar).l(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            Type[] typeArrM = new oct(zdpVar).m(bounds);
            if (!zef.a || !Arrays.equals(bounds, typeArrM)) {
                return zek.d(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrM);
            }
        }
        return typeVariable;
    }

    public zdp(yfy yfyVar) {
        this.c = yfyVar;
    }
}
