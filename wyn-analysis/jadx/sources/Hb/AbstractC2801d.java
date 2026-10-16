package hb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: hb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2801d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f36313a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f36314b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36315c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f36316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36317e;

    /* renamed from: f, reason: collision with root package name */
    public final r[] f36318f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36319g;

    public AbstractC2801d(Type type, Set set, Object obj, Method method, int i5, int i10, boolean z2) {
        this.f36313a = ib.f.a(type);
        this.f36314b = set;
        this.f36315c = obj;
        this.f36316d = method;
        this.f36317e = i10;
        this.f36318f = new r[i5 - i10];
        this.f36319g = z2;
    }

    public void a(K k, C2802e c2802e) {
        r[] rVarArr = this.f36318f;
        if (rVarArr.length > 0) {
            Method method = this.f36316d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i5 = this.f36317e;
            for (int i10 = i5; i10 < length; i10++) {
                Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                Set setE = ib.f.e(parameterAnnotations[i10]);
                rVarArr[i10 - i5] = (P.b(this.f36313a, type) && this.f36314b.equals(setE)) ? k.d(c2802e, type, setE) : k.c(type, setE, null);
            }
        }
    }

    public Object b(w wVar) {
        throw new AssertionError();
    }

    public final Object c(Object obj) {
        r[] rVarArr = this.f36318f;
        Object[] objArr = new Object[rVarArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(rVarArr, 0, objArr, 1, rVarArr.length);
        try {
            return this.f36316d.invoke(this.f36315c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public void d(AbstractC2797C abstractC2797C, Object obj) {
        throw new AssertionError();
    }
}
