package com.bytedance.sdk.openadsdk.core.xs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class oa {
    private static final ConcurrentHashMap<String, Object> uef = new ConcurrentHashMap<>();

    public static void uef(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (uef(str)) {
            try {
                uef.uef(context).uef().uef(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public static int uef(Context context, String str, String str2, String[] strArr) {
        int iUef;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (uef(str)) {
            try {
                iUef = uef.uef(context).uef().uef(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return iUef;
    }

    public static int uef(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int iUef;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (uef(str)) {
                try {
                    iUef = uef.uef(context).uef().uef(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return iUef;
        }
        return 0;
    }

    public static Map<String, List<String>> uef(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> mapUef;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (uef(str)) {
            try {
                mapUef = uef(uef.uef(context).uef().uef(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return mapUef;
    }

    public static Map<String, List<String>> uef(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object uef(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = uef;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (oa.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
