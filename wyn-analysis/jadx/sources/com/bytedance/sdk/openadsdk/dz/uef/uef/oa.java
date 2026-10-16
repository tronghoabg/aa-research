package com.bytedance.sdk.openadsdk.dz.uef.uef;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;

    /* renamed from: oa, reason: collision with root package name */
    private final WeakReference<ConcurrentHashMap<String, gzw>> f25903oa = new WeakReference<>(new ConcurrentHashMap());

    private oa() {
    }

    public static String ivm() {
        return "CREATE TABLE IF NOT EXISTS iab_history_material (material_key TEXT PRIMARY KEY,material TEXT,sdk_version TEXT,count INTEGER DEFAULT 0)";
    }

    public static String lw() {
        return "CREATE TABLE IF NOT EXISTS iab_history (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT,main_title TEXT,material_key TEXT,time TEXT,item_index INTEGER,sdk_version TEXT)";
    }

    public static oa uef() {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        uef = new oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private int xs() {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", new String[]{"COUNT(*)"}, null, null, null, null, null));
        } catch (Throwable unused) {
            uefVar = null;
        }
        try {
            if (uefVar.moveToFirst()) {
                int i5 = uefVar.getInt(0);
                uefVar.close();
                return i5;
            }
        } catch (Throwable unused2) {
            if (uefVar != null) {
                uefVar.close();
            }
            return 0;
        }
        uefVar.close();
        return 0;
    }

    public void moa() {
        try {
            ArrayList arrayList = new ArrayList();
            int iXs = xs();
            if (iXs > 1000) {
                arrayList.addAll(uef(iXs - 1000));
            }
            for (String str : uef(System.currentTimeMillis() - 2592000000L)) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            oa(arrayList);
            uef(arrayList);
        } catch (Throwable unused) {
        }
    }

    public List<com.bytedance.sdk.openadsdk.dz.uef.uef> oa() {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        ArrayList arrayList = new ArrayList();
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", null, null, null, null, null, "time DESC"));
        } catch (Throwable unused) {
            uefVar = null;
        }
        try {
            if (uefVar.moveToFirst()) {
                do {
                    int columnIndex = uefVar.getColumnIndex("_id");
                    int columnIndex2 = uefVar.getColumnIndex("url");
                    int columnIndex3 = uefVar.getColumnIndex("main_title");
                    int columnIndex4 = uefVar.getColumnIndex("material_key");
                    int columnIndex5 = uefVar.getColumnIndex("time");
                    int columnIndex6 = uefVar.getColumnIndex("item_index");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
                        uefVar.getString(columnIndex);
                        com.bytedance.sdk.openadsdk.dz.uef.uef uefVar2 = new com.bytedance.sdk.openadsdk.dz.uef.uef();
                        uefVar2.oa(uefVar.getInt(columnIndex6));
                        uefVar2.uef(columnIndex);
                        uefVar2.oa(uefVar.getString(columnIndex4));
                        uefVar2.lw(uefVar.getString(columnIndex2));
                        uefVar2.moa(uefVar.getString(columnIndex3));
                        uefVar2.yo(uefVar.getString(columnIndex5));
                        arrayList.add(uefVar2);
                    }
                } while (uefVar.moveToNext());
            }
            uefVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (uefVar != null) {
                uefVar.close();
            }
            return arrayList;
        }
    }

    public void yo() {
        try {
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", null, null);
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", null, null);
            ConcurrentHashMap<String, gzw> concurrentHashMap = this.f25903oa.get();
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }

    private void yo(String str) {
        try {
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public String uef(String str) {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        int columnIndex;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (uefVar.moveToFirst() && (columnIndex = uefVar.getColumnIndex("material")) != -1) {
                    String string = uefVar.getString(columnIndex);
                    uefVar.close();
                    return string;
                }
            } catch (Throwable unused) {
                if (uefVar != null) {
                    uefVar.close();
                }
                return null;
            }
        } catch (Throwable unused2) {
            uefVar = null;
        }
        uefVar.close();
        return null;
    }

    public void uef(com.bytedance.sdk.openadsdk.dz.uef.uef uefVar) {
        Throwable th;
        int i5;
        boolean z2;
        if (uefVar == null || TextUtils.isEmpty(uefVar.xs())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", uefVar.lw());
            contentValues.put("main_title", uefVar.moa());
            contentValues.put("material_key", uefVar.xs());
            contentValues.put("time", uefVar.ivm());
            contentValues.put("item_index", Integer.valueOf(uefVar.oa()));
            contentValues.put("sdk_version", uefVar.uef());
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", contentValues);
            String strYo = uefVar.yo();
            if (TextUtils.isEmpty(strYo)) {
                return;
            }
            com.bytedance.sdk.openadsdk.oib.uef.uef uefVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.oib.uef.uef uefVar3 = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{uefVar.xs()}, null, null, null));
                try {
                    if (uefVar3.moveToFirst()) {
                        int columnIndex = uefVar3.getColumnIndex("count");
                        if (columnIndex != -1) {
                            i5 = uefVar3.getInt(columnIndex);
                            z2 = true;
                        } else {
                            z2 = true;
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                        z2 = false;
                    }
                    uefVar3.close();
                    if (z2) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("count", Integer.valueOf(i5 + 1));
                        com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", contentValues2, "material_key=?", new String[]{uefVar.xs()});
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("material_key", uefVar.xs());
                        contentValues3.put("material", strYo);
                        contentValues3.put("sdk_version", uefVar.uef());
                        contentValues3.put("count", (Integer) 0);
                        com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", contentValues3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uefVar2 = uefVar3;
                    if (uefVar2 == null) {
                        throw th;
                    }
                    uefVar2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable unused) {
        }
    }

    private void oa(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.oib.uef.uef uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList arrayList = new ArrayList();
            if (uefVar.moveToFirst()) {
                do {
                    arrayList.add(uefVar.getString(0));
                } while (uefVar.moveToNext());
            }
            uefVar.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int iOa = oa(str);
                if (iOa > 0) {
                    uef(str, iOa - 1);
                }
                if (iOa <= 0) {
                    yo(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private int oa(String str) {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null));
        } catch (Throwable unused) {
            uefVar = null;
        }
        try {
            if (uefVar.moveToFirst()) {
                int i5 = uefVar.getInt(0);
                uefVar.close();
                return i5;
            }
        } catch (Throwable unused2) {
            if (uefVar != null) {
                uefVar.close();
            }
            return 0;
        }
        uefVar.close();
        return 0;
    }

    private List<String> uef(long j8) {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        ArrayList arrayList = new ArrayList();
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j8)}, null, null, "time ASC"));
        } catch (Throwable unused) {
            uefVar = null;
        }
        try {
            if (uefVar.moveToFirst()) {
                do {
                    arrayList.add(uefVar.getString(0));
                } while (uefVar.moveToNext());
            }
            uefVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (uefVar != null) {
                uefVar.close();
            }
            return arrayList;
        }
    }

    private List<String> uef(int i5) {
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar;
        ArrayList arrayList = new ArrayList();
        try {
            uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", new String[]{"_id"}, null, null, null, null, "time ASC"));
        } catch (Throwable unused) {
            uefVar = null;
        }
        try {
            if (uefVar.moveToFirst()) {
                int i10 = 0;
                while (i10 < i5) {
                    arrayList.add(uefVar.getString(0));
                    i10++;
                    if (!uefVar.moveToNext()) {
                        break;
                    }
                }
            }
            uefVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (uefVar != null) {
                uefVar.close();
            }
            return arrayList;
        }
    }

    private void uef(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history", "_id IN (" + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
        } catch (Throwable unused) {
        }
    }

    private void uef(String str, int i5) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("count", Integer.valueOf(i5));
            com.bytedance.sdk.openadsdk.core.xs.oa.uef(sy.uef(), "iab_history_material", contentValues, "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }
}
