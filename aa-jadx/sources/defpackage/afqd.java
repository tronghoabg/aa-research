package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqd extends defpackage.afqi {
    private final java.lang.Class<?> jClass;
    private final java.util.List<java.lang.reflect.Method> methods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqd(java.lang.Class<?> cls) {
        super(null);
        cls.getClass();
        this.jClass = cls;
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.methods = defpackage.afga.bV(declaredMethods, new defpackage.afqc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence asString$lambda$0(java.lang.reflect.Method method) {
        java.lang.Class<?> returnType = method.getReturnType();
        returnType.getClass();
        return defpackage.aglc.getDesc(returnType);
    }

    @Override // defpackage.afqi
    public java.lang.String asString() {
        return defpackage.afga.bo(this.methods, "", "<init>(", ")V", defpackage.afqb.INSTANCE, 24);
    }

    public final java.util.List<java.lang.reflect.Method> getMethods() {
        return this.methods;
    }
}
