package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aedd {
    public static final java.lang.String[] a = new java.lang.String[0];
    public static final java.nio.charset.Charset b = java.nio.charset.Charset.forName(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);

    public static java.util.List a(java.lang.Object[] objArr) {
        return j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList((java.lang.Object[]) objArr.clone()));
    }

    public static java.lang.Object[] b(java.lang.Class cls, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            for (java.lang.Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, arrayList.size()));
    }
}
