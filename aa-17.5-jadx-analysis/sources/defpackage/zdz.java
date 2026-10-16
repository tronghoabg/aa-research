package defpackage;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class zdz extends zeb implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final Type a;
    private transient oct b;

    public zdz() {
        super(null);
        Type typeF = f();
        this.a = typeF;
        woy.ad(!(typeF instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeF);
    }

    public static final zdz d(Type type) {
        zds zdsVar = new zds(type);
        if (zdsVar.c().isInterface()) {
            return null;
        }
        return zdsVar;
    }

    public static final yfq e(Type[] typeArr) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (Type type : typeArr) {
            zds zdsVar = new zds(type);
            if (zdsVar.c().isInterface()) {
                yflVar.i(zdsVar);
            }
        }
        return yflVar.g();
    }

    public final ygr a() {
        ygp ygpVar = new ygp();
        new zdr(ygpVar).f(this.a);
        return ygpVar.g();
    }

    public final zdz b(Type type) {
        oct octVar = this.b;
        if (octVar == null) {
            Type type2 = this.a;
            oct octVar2 = new oct((byte[]) null, (char[]) null);
            type2.getClass();
            zdn zdnVar = new zdn();
            zdnVar.f(type2);
            Map map = zdnVar.a;
            Object obj = octVar2.a;
            yfy yfyVarJ = yfy.j(map);
            yfu yfuVar = new yfu(4);
            yfuVar.h(((zdp) obj).c);
            Iterator it = yfyVarJ.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                zdq zdqVar = (zdq) entry.getKey();
                Type type3 = (Type) entry.getValue();
                woy.S(!zdqVar.b(type3), "Type variable %s bound to itself", zdqVar);
                yfuVar.e(zdqVar, type3);
            }
            oct octVar3 = new oct(new zdp(yfuVar.d(true)));
            this.b = octVar3;
            octVar = octVar3;
        }
        zds zdsVar = new zds(octVar.l(type));
        zdsVar.b = this.b;
        return zdsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class c() {
        Type type = this.a;
        return type instanceof Class ? (Class) type : type instanceof ParameterizedType ? (Class) ((ParameterizedType) type).getRawType() : (Class) a().iterator().next();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zdz) {
            return this.a.equals(((zdz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zek.b(this.a);
    }

    protected Object writeReplace() {
        return new zds(new oct((byte[]) null, (char[]) null).l(this.a));
    }

    public zdz(Type type) {
        super(null);
        type.getClass();
        this.a = type;
    }
}
