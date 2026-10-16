package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class ahoq extends ahnt implements Serializable {
    protected ahoq() {
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String strValueOf = String.valueOf(String.valueOf(cls.getName()));
            String strValueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(strValueOf.length() + 45 + strValueOf2.length());
            sb.append("Generated message class \"");
            sb.append(strValueOf);
            sb.append("\" missing method \"");
            sb.append(strValueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends ahpg, Type> ahop<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, ahpg ahpgVar, ahos ahosVar, int i, ahqi ahqiVar, boolean z, Class cls) {
        return new ahop<>(containingtype, Collections.EMPTY_LIST, ahpgVar, new ahoo(ahosVar, i, ahqiVar, true, z), cls);
    }

    public static <ContainingType extends ahpg, Type> ahop<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, ahpg ahpgVar, ahos ahosVar, int i, ahqi ahqiVar, Class cls) {
        return new ahop<>(containingtype, type, ahpgVar, new ahoo(ahosVar, i, ahqiVar, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends defpackage.ahpg> boolean parseUnknownField(defpackage.ahoi<defpackage.ahoo> r5, MessageType r6, defpackage.ahoc r7, defpackage.ahoe r8, defpackage.ahog r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahoq.parseUnknownField(ahoi, ahpg, ahoc, ahoe, ahog, int):boolean");
    }

    @Override // defpackage.ahpg
    public ahpi<? extends ahpg> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected ahoq(ahok ahokVar) {
    }

    protected void makeExtensionsImmutable() {
    }

    protected boolean parseUnknownField(ahoc ahocVar, ahoe ahoeVar, ahog ahogVar, int i) throws IOException {
        return ahocVar.skipField(i, ahoeVar);
    }
}
