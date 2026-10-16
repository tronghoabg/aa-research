package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    private CompactStringObjectMap(int i2, int i3, Object[] objArr) {
        this._hashMask = i2;
        this._spillCount = i3;
        this._hashArea = objArr;
    }

    private final Object _find2(String str, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        int i3 = this._hashMask + 1;
        int i4 = (i2 >> 1) + i3;
        int i5 = i4 + i4;
        Object obj2 = this._hashArea[i5];
        if (str.equals(obj2)) {
            return this._hashArea[i5 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i6 = i3 + (i3 >> 1);
        int i7 = this._spillCount;
        int i8 = i6 + i6;
        for (int i9 = i8; i9 < i8 + i7; i9 += 2) {
            Object obj3 = this._hashArea[i9];
            if (obj3 == str || str.equals(obj3)) {
                return this._hashArea[i9 + 1];
            }
        }
        return null;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int iFindSize = findSize(map.size());
        int i2 = (iFindSize >> 1) + iFindSize;
        int i3 = i2 + i2;
        Object[] objArrCopyOf = new Object[i3];
        Iterator<Map.Entry<String, T>> it = map.entrySet().iterator();
        int i4 = 0;
        while (true) {
            int i5 = iFindSize - 1;
            if (!it.hasNext()) {
                return new CompactStringObjectMap(i5, i4, objArrCopyOf);
            }
            Map.Entry<String, T> next = it.next();
            String key = next.getKey();
            if (key != null) {
                int iHashCode = i5 & key.hashCode();
                int i6 = iHashCode + iHashCode;
                if (objArrCopyOf[i6] != null) {
                    int i7 = (iHashCode >> 1) + iFindSize;
                    i6 = i7 + i7;
                    if (objArrCopyOf[i6] != null) {
                        i6 = i3 + i4;
                        i4 += 2;
                        int length = objArrCopyOf.length;
                        if (i6 >= length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + 4);
                        }
                    }
                }
                objArrCopyOf[i6] = key;
                objArrCopyOf[i6 + 1] = next.getValue();
            }
        }
    }

    private static final int findSize(int i2) {
        if (i2 <= 5) {
            return 8;
        }
        if (i2 <= 12) {
            return 16;
        }
        int i3 = 32;
        while (i3 < i2 + (i2 >> 2)) {
            i3 += i3;
        }
        return i3;
    }

    public Object find(String str) {
        int iHashCode = str.hashCode() & this._hashMask;
        int i2 = iHashCode + iHashCode;
        Object obj = this._hashArea[i2];
        return (obj == str || str.equals(obj)) ? this._hashArea[i2 + 1] : _find2(str, iHashCode, obj);
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i2 = 0; i2 < length; i2 += 2) {
            Object obj = this._hashArea[i2];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i2 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i2 = 0; i2 < length; i2 += 2) {
            Object obj = this._hashArea[i2];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
