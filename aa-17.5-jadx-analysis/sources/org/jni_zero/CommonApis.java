package org.jni_zero;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CommonApis {
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap map = new HashMap(length >> 1);
        for (int i = 0; i < length; i += 2) {
            map.put(objArr[i], objArr[i + 1]);
        }
        return map;
    }

    private static Object[] mapToArray(Map<Object, Object> map) {
        int size = map.size();
        Object[] objArr = new Object[size + size];
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            objArr[i] = entry.getKey();
            objArr[i + 1] = entry.getValue();
            i += 2;
        }
        return objArr;
    }
}
