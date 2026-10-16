package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqm {
    public static final defpackage.ajna a(javax.net.ssl.X509TrustManager x509TrustManager) {
        android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
        } catch (java.lang.IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new defpackage.ajna(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public static final java.lang.reflect.Type[] getGenericParameterTypesWithEnclosingThis(java.lang.reflect.Constructor<?> constructor) {
        constructor.getClass();
        java.lang.reflect.Type outerClassForInnerClassConstructor = getOuterClassForInnerClassConstructor(constructor);
        if (outerClassForInnerClassConstructor == null) {
            return getGenericParameterTypesWithoutEnclosingThis(constructor);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(outerClassForInnerClassConstructor);
        defpackage.afgx.a(getGenericParameterTypesWithoutEnclosingThis(constructor), arrayList);
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[arrayList.size()]);
    }

    private static final java.lang.reflect.Type[] getGenericParameterTypesWithoutEnclosingThis(java.lang.reflect.Constructor<?> constructor) {
        java.util.Collection collectionAa;
        java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = genericParameterTypes.length;
        if (length != parameterTypes.length) {
            genericParameterTypes.getClass();
            return genericParameterTypes;
        }
        java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
        if (java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers()) || declaringClass.getDeclaringClass() == null) {
            genericParameterTypes.getClass();
            return genericParameterTypes;
        }
        genericParameterTypes.getClass();
        int i = length - 1;
        int iE = defpackage.afqt.e(i, 0);
        if (iE < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(iE, "Requested element count ", " is less than zero."));
        }
        if (iE == 0) {
            collectionAa = defpackage.afce.a;
        } else if (iE >= length) {
            collectionAa = defpackage.afga.bZ(genericParameterTypes);
        } else {
            collectionAa = iE == 1 ? defpackage.afga.aa(genericParameterTypes[i]) : defpackage.afga.bx(defpackage.afga.bC(genericParameterTypes, length - iE, length));
        }
        return (java.lang.reflect.Type[]) collectionAa.toArray(new java.lang.reflect.Type[0]);
    }

    private static final java.lang.reflect.Type getOuterClassForInnerClassConstructor(java.lang.reflect.Constructor<?> constructor) {
        java.lang.Class<?> declaringClass = constructor.getDeclaringClass();
        java.lang.Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) {
            return null;
        }
        return declaringClass2;
    }
}
