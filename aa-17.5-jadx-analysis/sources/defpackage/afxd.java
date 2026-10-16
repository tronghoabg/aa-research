package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class afxd extends afxe {
    private final boolean isVoidMethod;

    private afxd(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(2);
            Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            arrayList.add(declaringClass);
            affx.a(typeArr, arrayList);
            typeArr = (Type[]) arrayList.toArray(new Type[arrayList.size()]);
        }
        super(method, genericReturnType, typeArr, null);
        this.isVoidMethod = affa.f(getReturnType(), Void.TYPE);
    }

    protected final Object callMethod(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.isVoidMethod ? afak.a : ((Method) mo61getMember()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public /* synthetic */ afxd(Method method, boolean z, Type[] typeArr, afeu afeuVar) {
        this(method, z, typeArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ afxd(Method method, boolean z, Type[] typeArr, int i, afeu afeuVar) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        if ((i & 4) != 0) {
            typeArr = method.getGenericParameterTypes();
            typeArr.getClass();
        }
        this(method, z, typeArr, null);
    }
}
