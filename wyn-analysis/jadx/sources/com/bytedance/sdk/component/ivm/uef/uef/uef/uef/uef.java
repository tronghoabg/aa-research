package com.bytedance.sdk.component.ivm.uef.uef.uef.uef;

import A7.AbstractC0279p0;
import N0.a;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ka.AbstractC3256n;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef extends yo {
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef moa;
    protected List<String> uef;
    private final Context yo;

    public uef(Context context, com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        super(context);
        this.uef = new ArrayList();
        this.yo = context;
        this.moa = uefVar;
        if (uefVar == null) {
            this.moa = com.bytedance.sdk.component.ivm.uef.moa.oa.uef.yo();
        }
    }

    public byte moa() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public String oa() {
        com.bytedance.sdk.component.ivm.uef.uef.lw lwVarYo = com.bytedance.sdk.component.ivm.uef.xs.ivm().yo();
        if (lwVarYo != null) {
            return lwVarYo.oa();
        }
        return null;
    }

    public int uef() {
        Cursor cursorUef = null;
        int i5 = 0;
        try {
            cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorUef != null) {
                cursorUef.moveToFirst();
                i5 = cursorUef.getInt(0);
            }
        } catch (Exception unused) {
            if (cursorUef != null) {
            }
        } catch (Throwable th) {
            if (cursorUef != null) {
                try {
                    cursorUef.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        if (cursorUef != null) {
            try {
                cursorUef.close();
            } catch (Exception unused3) {
            }
        }
        return i5;
    }

    public byte yo() {
        return (byte) 2;
    }

    public void oa(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.ivm.uef.moa.uef uefVar : list) {
            linkedList.add(uefVar.yo());
            com.bytedance.sdk.component.ivm.uef.yo.uef.zjm(uefVar);
        }
        oa();
        linkedList.size();
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), "DELETE FROM " + oa() + " WHERE " + uef("id", linkedList, 1000, true));
        yo(linkedList);
    }

    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int i5, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b5;
        Cursor cursorUef;
        long jUef = com.bytedance.sdk.component.ivm.uef.oa.uef.uef(i5, lw());
        oa();
        if (jUef <= 0) {
            jUef = 1;
        } else if (jUef > 100) {
            jUef = 100;
        }
        String str4 = str + " DESC limit " + jUef;
        ArrayList arrayList = new ArrayList();
        this.uef.clear();
        long jAb = com.bytedance.sdk.component.ivm.uef.xs.ivm().ab();
        if (jAb > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jAb)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.ivm.uef.yo.uef.moa() && moa() == 3) {
            str3 = "id";
            b5 = 3;
            cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), new String[]{"id", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b5 = 3;
            cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), new String[]{str3, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorUef;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.ivm.uef.lw lwVarWk = com.bytedance.sdk.component.ivm.uef.xs.ivm().wk();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                        int i10 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i11 = (com.bytedance.sdk.component.ivm.uef.yo.uef.moa() && moa() == b5) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i10 == 1) {
                            try {
                                string2 = lwVarWk.uef(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.uef.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.ivm.uef.moa.uef.uef uefVar = new com.bytedance.sdk.component.ivm.uef.moa.uef.uef(string, jSONObject);
                            uefVar.oa(moa());
                            uefVar.yo(yo());
                            if (com.bytedance.sdk.component.ivm.uef.yo.uef.moa() && moa() == b5) {
                                uefVar.uef(i11);
                            }
                            com.bytedance.sdk.component.ivm.uef.yo.uef.uef(jSONObject, uefVar);
                            arrayList.add(uefVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.uef.isEmpty()) {
                        uef(this.uef);
                        this.uef.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        oa();
        arrayList.size();
        return arrayList;
    }

    private void oa(int i5, long j8) {
        if (j8 > 0 || i5 > 0) {
            com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j8), String.valueOf(i5)});
            oa();
        }
    }

    public static String oa(String str) {
        return AbstractC0279p0.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(String str) {
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar = this.moa;
        if (uefVar == null) {
            return new ArrayList();
        }
        return uef(uefVar.oa(), str);
    }

    public void uef(List<String> list) {
        oa();
        list.size();
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), "DELETE FROM " + oa() + " WHERE " + uef("id", list, 1000, true));
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.nkh(), list.size());
        yo(list);
    }

    public void uef(int i5, long j8) {
        oa(i5, j8);
    }

    public boolean uef(int i5) {
        if (this.moa == null) {
            return false;
        }
        int iUef = uef();
        int iUef2 = this.moa.uef();
        oa();
        return (com.bytedance.sdk.component.ivm.uef.yo.uef.yo() && (i5 == 1 || i5 == 2)) ? iUef > 0 : iUef >= iUef2;
    }

    private static String uef(String str, List<?> list, int i5, boolean z2) {
        int i10;
        String str2 = z2 ? " IN " : " NOT IN ";
        String str3 = z2 ? " OR " : " AND ";
        int iMin = Math.min(i5, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i10 = size / iMin;
        } else {
            i10 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * iMin;
            String strUef = uef(TextUtils.join("','", list.subList(i12, Math.min(i12 + iMin, size))), "");
            if (i11 != 0) {
                sb2.append(str3);
            }
            AbstractC3256n.p(sb2, str, str2, "('", strUef);
            sb2.append("')");
        }
        return uef(sb2.toString(), a.g(str, str2, "('')"));
    }

    private static String uef(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
