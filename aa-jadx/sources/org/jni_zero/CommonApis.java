package org.jni_zero;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonApis {
    private static java.util.Map<java.lang.Object, java.lang.Object> arrayToMap(java.lang.Object[] objArr) {
        int length = objArr.length;
        java.util.HashMap map = new java.util.HashMap(length >> 1);
        for (int i = 0; i < length; i += 2) {
            map.put(objArr[i], objArr[i + 1]);
        }
        return map;
    }

    private static java.lang.Object[] mapToArray(java.util.Map<java.lang.Object, java.lang.Object> map) {
        int size = map.size();
        java.lang.Object[] objArr = new java.lang.Object[size + size];
        int i = 0;
        for (java.util.Map.Entry<java.lang.Object, java.lang.Object> entry : map.entrySet()) {
            objArr[i] = entry.getKey();
            objArr[i + 1] = entry.getValue();
            i += 2;
        }
        return objArr;
    }
}
