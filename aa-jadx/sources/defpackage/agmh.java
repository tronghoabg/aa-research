package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agmh {
    private agmh() {
    }

    public final defpackage.agmi create(java.lang.reflect.Type type) {
        type.getClass();
        boolean z = type instanceof java.lang.Class;
        if (z) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isPrimitive()) {
                return new defpackage.agmf(cls);
            }
        }
        if ((type instanceof java.lang.reflect.GenericArrayType) || (z && ((java.lang.Class) type).isArray())) {
            return new defpackage.aglk(type);
        }
        return type instanceof java.lang.reflect.WildcardType ? new defpackage.agml((java.lang.reflect.WildcardType) type) : new defpackage.aglv(type);
    }

    public /* synthetic */ agmh(defpackage.affu affuVar) {
        this();
    }
}
