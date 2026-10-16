package com.bytedance.sdk.openadsdk.core.cq.uef;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.sy;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile yo f25560oa = null;
    public static int uef = 20;
    private final Object yo = new Object();
    private final LruCache<String, uef> moa = new LruCache<String, uef>(uef) { // from class: com.bytedance.sdk.openadsdk.core.cq.uef.yo.1
        @Override // android.util.LruCache
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, uef uefVar) {
            return 1;
        }
    };

    private yo() {
    }

    public static String moa() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static yo uef() {
        if (f25560oa == null) {
            synchronized (yo.class) {
                try {
                    if (f25560oa == null) {
                        f25560oa = new yo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25560oa;
    }

    public static String yo() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public List<uef> oa() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", null, null, null, null, null, null));
        try {
            if (uefVar.moveToFirst()) {
                do {
                    int columnIndex = uefVar.getColumnIndex("id");
                    int columnIndex2 = uefVar.getColumnIndex("md5");
                    int columnIndex3 = uefVar.getColumnIndex("url");
                    int columnIndex4 = uefVar.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                    int columnIndex5 = uefVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = uefVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? uefVar.getString(columnIndex6) : null;
                        String string2 = uefVar.getString(columnIndex);
                        String string3 = uefVar.getString(columnIndex2);
                        String string4 = uefVar.getString(columnIndex3);
                        uef uefVarUef = new uef().uef(string2).oa(string3).yo(string4).moa(uefVar.getString(columnIndex4)).lw(string).uef(Long.valueOf(uefVar.getLong(columnIndex5)));
                        arrayList.add(uefVarUef);
                        synchronized (this.yo) {
                            this.moa.put(string2, uefVarUef);
                        }
                    }
                } while (uefVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                dhk.uef("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                uefVar.close();
            }
        }
    }

    public uef uef(String str, String str2) {
        uef uefVar;
        uef uefVarUef;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.yo) {
            uefVar = this.moa.get(str);
        }
        if (uefVar != null) {
            if (TextUtils.equals(str2, uefVar.oa())) {
                return uefVar;
            }
            oa(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar2 = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (uefVar2.moveToFirst()) {
                do {
                    int columnIndex = uefVar2.getColumnIndex("id");
                    int columnIndex2 = uefVar2.getColumnIndex("md5");
                    int columnIndex3 = uefVar2.getColumnIndex("url");
                    int columnIndex4 = uefVar2.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                    int columnIndex5 = uefVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = uefVar2.getColumnIndex("rit");
                        String string = uefVar2.getString(columnIndex);
                        String string2 = uefVar2.getString(columnIndex2);
                        String string3 = uefVar2.getString(columnIndex3);
                        String string4 = uefVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        uefVarUef = new uef().uef(string).oa(string2).moa(string4).yo(string3).lw(columnIndex6 != -1 ? uefVar2.getString(columnIndex6) : null).uef(Long.valueOf(uefVar2.getLong(columnIndex5)));
                        synchronized (this.yo) {
                            this.moa.put(string, uefVarUef);
                        }
                    }
                    return null;
                } while (uefVar2.moveToNext());
                return uefVarUef;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    private void oa(String str) {
        if (!TextUtils.isEmpty(str) && this.moa.size() > 0) {
            synchronized (this.yo) {
                this.moa.remove(str);
            }
        }
    }

    public void uef(uef uefVar) {
        if (uefVar == null || TextUtils.isEmpty(uefVar.uef())) {
            return;
        }
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar2 = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", null, "id=?", new String[]{uefVar.uef()}, null, null, null));
        boolean z2 = uefVar2.getCount() > 0;
        try {
            uefVar2.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", uefVar.uef());
            contentValues.put("md5", uefVar.oa());
            contentValues.put("url", uefVar.yo());
            contentValues.put(JsonStorageKeyNames.DATA_KEY, uefVar.lw());
            contentValues.put("rit", uefVar.ivm());
            contentValues.put("update_time", uefVar.moa());
            if (z2) {
                com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", contentValues, "id=?", new String[]{uefVar.uef()});
            } else {
                com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", contentValues);
            }
            synchronized (this.yo) {
                this.moa.put(uefVar.uef(), uefVar);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<uef> uef(String str) {
        uef uefVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.oib.uef.uef uefVar2 = new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (uefVar2.moveToFirst()) {
                do {
                    int columnIndex = uefVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = uefVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.yo) {
                                uefVar = this.moa.get(string);
                            }
                            if (uefVar != null) {
                                hashSet.add(uefVar);
                            } else {
                                uef uefVar3 = new uef();
                                int columnIndex2 = uefVar2.getColumnIndex(JsonStorageKeyNames.DATA_KEY);
                                if (columnIndex2 != -1) {
                                    String string2 = uefVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        uefVar3.moa(string2);
                                        uefVar3.uef(string);
                                        uefVar3.lw(str);
                                        int columnIndex3 = uefVar2.getColumnIndex("md5");
                                        int columnIndex4 = uefVar2.getColumnIndex("url");
                                        int columnIndex5 = uefVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            uefVar3.oa(uefVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            uefVar3.yo(uefVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            uefVar3.uef(Long.valueOf(uefVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(uefVar3);
                                        synchronized (this.yo) {
                                            this.moa.put(string, uefVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (uefVar2.moveToNext());
            }
            return hashSet;
        } catch (Throwable th) {
            try {
                dhk.uef("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                uefVar2.close();
            }
        }
    }

    public void uef(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                oa(str);
                com.bytedance.sdk.openadsdk.oib.oa.uef.uef(sy.uef(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
