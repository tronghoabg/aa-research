package com.google.gson.internal.bind;

import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p7.AbstractC3772b;
import ra.C3962a;

/* renamed from: com.google.gson.internal.bind.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1772s extends AbstractC1770p {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f27490e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f27491b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f27492c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f27493d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f27490e = map;
    }

    public C1772s(Class cls, r rVar) throws SecurityException {
        super(rVar);
        this.f27493d = new HashMap();
        AbstractC3772b abstractC3772b = pa.c.f43447a;
        Constructor constructorV = abstractC3772b.v(cls);
        this.f27491b = constructorV;
        pa.c.f(constructorV);
        String[] strArrC = abstractC3772b.C(cls);
        for (int i5 = 0; i5 < strArrC.length; i5++) {
            this.f27493d.put(strArrC[i5], Integer.valueOf(i5));
        }
        Class<?>[] parameterTypes = this.f27491b.getParameterTypes();
        this.f27492c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f27492c[i10] = f27490e.get(parameterTypes[i10]);
        }
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final Object d() {
        return (Object[]) this.f27492c.clone();
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f27491b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            AbstractC3772b abstractC3772b = pa.c.f43447a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + pa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + pa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + pa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // com.google.gson.internal.bind.AbstractC1770p
    public final void f(Object obj, C3962a c3962a, C1769o c1769o) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f27493d;
        String str = c1769o.f27479c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + pa.c.b(this.f27491b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = c1769o.f27482f.b(c3962a);
        if (objB != null || !c1769o.f27483g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbW.append(c3962a.y());
            throw new E5.Q(sbW.toString(), 13);
        }
    }
}
