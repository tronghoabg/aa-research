package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public final class afpd extends afpi {
    private final Class<?> jClass;
    private final List<Method> methods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpd(Class<?> cls) throws SecurityException {
        super(null);
        cls.getClass();
        this.jClass = cls;
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.methods = woy.db(declaredMethods, new afpc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$0(Method method) {
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        return agkc.getDesc(returnType);
    }

    @Override // defpackage.afpi
    public String asString() {
        return woy.cu(this.methods, "", "<init>(", ")V", afpb.INSTANCE, 24);
    }

    public final List<Method> getMethods() {
        return this.methods;
    }
}
