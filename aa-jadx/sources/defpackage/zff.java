package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class zff extends defpackage.zfh implements java.io.Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final java.lang.reflect.Type a;
    private transient defpackage.odn c;

    public zff() {
        super(null);
        java.lang.reflect.Type typeF = f();
        this.a = typeF;
        defpackage.ysr.bn(!(typeF instanceof java.lang.reflect.TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeF);
    }

    public static final defpackage.zff d(java.lang.reflect.Type type) {
        defpackage.zey zeyVar = new defpackage.zey(type);
        if (zeyVar.c().isInterface()) {
            return null;
        }
        return zeyVar;
    }

    public static final defpackage.ygw e(java.lang.reflect.Type[] typeArr) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (java.lang.reflect.Type type : typeArr) {
            defpackage.zey zeyVar = new defpackage.zey(type);
            if (zeyVar.c().isInterface()) {
                ygrVar.i(zeyVar);
            }
        }
        return ygrVar.g();
    }

    public final defpackage.yhx a() {
        defpackage.yhv yhvVar = new defpackage.yhv();
        new defpackage.zex(yhvVar).f(this.a);
        return yhvVar.g();
    }

    public final defpackage.zff b(java.lang.reflect.Type type) {
        defpackage.odn odnVar = this.c;
        if (odnVar == null) {
            java.lang.reflect.Type type2 = this.a;
            defpackage.odn odnVar2 = new defpackage.odn((byte[]) null, (char[]) null);
            type2.getClass();
            defpackage.zet zetVar = new defpackage.zet();
            zetVar.f(type2);
            java.util.Map map = zetVar.a;
            java.lang.Object obj = odnVar2.a;
            defpackage.yhe yheVarJ = defpackage.yhe.j(map);
            defpackage.yha yhaVar = new defpackage.yha(4);
            yhaVar.h(((defpackage.zev) obj).c);
            java.util.Iterator it = yheVarJ.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                defpackage.zew zewVar = (defpackage.zew) entry.getKey();
                java.lang.reflect.Type type3 = (java.lang.reflect.Type) entry.getValue();
                defpackage.ysr.bc(!zewVar.b(type3), "Type variable %s bound to itself", zewVar);
                yhaVar.f(zewVar, type3);
            }
            defpackage.odn odnVar3 = new defpackage.odn(new defpackage.zev(yhaVar.d(true)));
            this.c = odnVar3;
            odnVar = odnVar3;
        }
        defpackage.zey zeyVar = new defpackage.zey(odnVar.l(type));
        zeyVar.c = this.c;
        return zeyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Class c() {
        java.lang.reflect.Type type = this.a;
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        return type instanceof java.lang.reflect.ParameterizedType ? (java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType() : (java.lang.Class) a().iterator().next();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zff) {
            return this.a.equals(((defpackage.zff) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return defpackage.zfq.b(this.a);
    }

    protected java.lang.Object writeReplace() {
        return new defpackage.zey(new defpackage.odn((byte[]) null, (char[]) null).l(this.a));
    }

    public zff(java.lang.reflect.Type type) {
        super(null);
        type.getClass();
        this.a = type;
    }
}
