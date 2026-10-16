package com.bytedance.sdk.component.adexpress.uef.oa;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile ivm f24942oa = null;
    public static int uef = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.uef.yo.yo> lw;
    private final Object moa = new Object();
    private AtomicBoolean ivm = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.uef.yo.oa> xs = new LruCache<String, com.bytedance.sdk.component.adexpress.uef.yo.oa>(uef) { // from class: com.bytedance.sdk.component.adexpress.uef.oa.ivm.1
        @Override // android.util.LruCache
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar) {
            return 1;
        }
    };
    private Set<String> yo = DesugarCollections.synchronizedSet(new HashSet());

    private ivm() {
    }

    private void moa(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.uef.yo.oa> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.xs) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.moa) {
            this.xs.remove(str);
        }
    }

    public static void uef(int i5) {
        uef = i5;
    }

    public Set<String> oa(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorUef != null) {
                try {
                    try {
                        if (cursorUef.moveToFirst()) {
                            do {
                                hashSet.add(cursorUef.getString(cursorUef.getColumnIndex("id")));
                            } while (cursorUef.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e7) {
                        Log.e("TmplDbHelper", "", e7);
                    }
                } finally {
                    cursorUef.close();
                }
            }
        }
        return null;
    }

    public void yo(String str) {
        com.bytedance.sdk.component.adexpress.uef.yo.yo yoVar;
        try {
            if (this.lw != null && !this.lw.isEmpty() && (yoVar = this.lw.get(str)) != null) {
                if (!TextUtils.isEmpty(yoVar.uef()) && com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm() != null) {
                    com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm();
                }
                this.lw.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static ivm uef() {
        if (f24942oa == null) {
            synchronized (ivm.class) {
                try {
                    if (f24942oa == null) {
                        f24942oa = new ivm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24942oa;
    }

    public static String yo() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public com.bytedance.sdk.component.adexpress.uef.yo.oa uef(String str) {
        com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar;
        com.bytedance.sdk.component.adexpress.uef.yo.oa oaVarUef;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa() == null) {
            return null;
        }
        synchronized (this.moa) {
            oaVar = this.xs.get(String.valueOf(str));
        }
        if (oaVar != null) {
            return oaVar;
        }
        Cursor cursorUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorUef != null) {
            try {
                if (cursorUef.moveToFirst()) {
                    do {
                        String string = cursorUef.getString(cursorUef.getColumnIndex("rit"));
                        String string2 = cursorUef.getString(cursorUef.getColumnIndex("id"));
                        String string3 = cursorUef.getString(cursorUef.getColumnIndex("md5"));
                        String string4 = cursorUef.getString(cursorUef.getColumnIndex("url"));
                        String string5 = cursorUef.getString(cursorUef.getColumnIndex(JsonStorageKeyNames.DATA_KEY));
                        String string6 = cursorUef.getString(cursorUef.getColumnIndex("version"));
                        oaVarUef = new com.bytedance.sdk.component.adexpress.uef.yo.oa().uef(string).oa(string2).yo(string3).moa(string4).lw(string5).ivm(string6).uef(Long.valueOf(cursorUef.getLong(cursorUef.getColumnIndex("update_time"))));
                        synchronized (this.moa) {
                            this.xs.put(string2, oaVarUef);
                        }
                        this.yo.add(string2);
                    } while (cursorUef.moveToNext());
                    cursorUef.close();
                    return oaVarUef;
                }
            } catch (Throwable unused) {
            }
            cursorUef.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.uef.yo.oa> oa() {
        if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa() == null) {
            return null;
        }
        boolean z2 = this.ivm.get();
        this.ivm.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", null, null, null, null, null, null);
        if (cursorUef != null) {
            while (cursorUef.moveToNext()) {
                try {
                    String string = cursorUef.getString(cursorUef.getColumnIndex("rit"));
                    String string2 = cursorUef.getString(cursorUef.getColumnIndex("id"));
                    String string3 = cursorUef.getString(cursorUef.getColumnIndex("md5"));
                    String string4 = cursorUef.getString(cursorUef.getColumnIndex("url"));
                    String string5 = cursorUef.getString(cursorUef.getColumnIndex(JsonStorageKeyNames.DATA_KEY));
                    String string6 = cursorUef.getString(cursorUef.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.uef.yo.oa().uef(string).oa(string2).yo(string3).moa(string4).lw(string5).ivm(string6).uef(Long.valueOf(cursorUef.getLong(cursorUef.getColumnIndex("update_time")))));
                    synchronized (this.moa) {
                        this.xs.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.yo.add(string2);
                    if (!z2 && com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm() != null) {
                        if (this.lw == null) {
                            this.lw = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.lw.contains(string2)) {
                            this.lw.put(string2, new com.bytedance.sdk.component.adexpress.uef.yo.yo(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorUef.close();
                }
            }
            cursorUef.close();
            return arrayList;
        }
        return arrayList;
    }

    public void uef(com.bytedance.sdk.component.adexpress.uef.yo.oa oaVar, boolean z2) {
        if (oaVar == null || com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa() == null || TextUtils.isEmpty(oaVar.oa())) {
            return;
        }
        Cursor cursorUef = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", null, "id=?", new String[]{oaVar.oa()}, null, null, null);
        boolean z10 = cursorUef != null && cursorUef.getCount() > 0;
        if (cursorUef != null) {
            try {
                string = cursorUef.moveToFirst() ? cursorUef.getString(cursorUef.getColumnIndex("rit")) : null;
                cursorUef.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", oaVar.uef());
        contentValues.put("id", oaVar.oa());
        contentValues.put("md5", oaVar.yo());
        contentValues.put("url", oaVar.moa());
        contentValues.put(JsonStorageKeyNames.DATA_KEY, oaVar.lw());
        contentValues.put("version", oaVar.ivm());
        contentValues.put("update_time", oaVar.xs());
        if (z10) {
            com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", contentValues, "id=?", new String[]{oaVar.oa()});
        } else {
            com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", contentValues);
        }
        synchronized (this.moa) {
            this.xs.put(oaVar.oa(), oaVar);
        }
        this.yo.add(oaVar.oa());
        if (z2) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm() == null) {
                return;
            }
            if (this.lw == null) {
                this.lw = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.uef.yo.yo yoVar = new com.bytedance.sdk.component.adexpress.uef.yo.yo(oaVar.uef(), oaVar.oa(), oaVar.yo());
            this.lw.put(oaVar.oa(), yoVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm();
                yoVar.oa();
            }
            com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().ivm();
            oaVar.uef();
        } catch (Throwable unused2) {
        }
    }

    public void uef(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i5 = 0; i5 < strArr.length; i5++) {
                moa(strArr[i5]);
                com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().oa().uef("template_diff_new", "id=?", new String[]{strArr[i5]});
                yo(strArr[i5]);
            }
        }
    }
}
