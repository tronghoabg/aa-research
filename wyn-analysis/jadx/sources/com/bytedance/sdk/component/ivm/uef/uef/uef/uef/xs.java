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
public class xs extends yo {
    protected List<String> uef;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef yo;

    public xs(Context context, com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        super(context);
        this.uef = new ArrayList();
        this.yo = uefVar;
        if (uefVar == null) {
            this.yo = com.bytedance.sdk.component.ivm.uef.moa.oa.uef.yo();
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public long ivm() {
        return com.bytedance.sdk.component.ivm.uef.xs.uef.oa();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int moa() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.lw()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.oa()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs.moa():int");
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public String oa() {
        return com.bytedance.sdk.component.ivm.uef.xs.ivm().yo().moa();
    }

    public byte uef() {
        return (byte) 1;
    }

    public byte yo() {
        return (byte) 2;
    }

    public static String yo(String str) {
        return AbstractC0279p0.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> oa(String str) {
        com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar = this.yo;
        return uefVar == null ? new ArrayList() : uef(uefVar.oa(), str);
    }

    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int i5, String str) {
        long jUef = com.bytedance.sdk.component.ivm.uef.oa.uef.uef(i5, lw());
        if (jUef <= 0) {
            jUef = 1;
        } else if (jUef > 100) {
            jUef = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.uef.clear();
        Cursor cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), new String[]{"id", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "encrypt"}, null, null, null, null, str + " DESC limit " + jUef);
        if (cursorUef != null) {
            while (cursorUef.moveToNext()) {
                try {
                    try {
                        String string = cursorUef.getString(cursorUef.getColumnIndex("id"));
                        String string2 = cursorUef.getString(cursorUef.getColumnIndex(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                        if (cursorUef.getInt(cursorUef.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.ivm.uef.xs.ivm().wk().uef(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.uef.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.ivm.uef.moa.uef.uef uefVar = new com.bytedance.sdk.component.ivm.uef.moa.uef.uef(string, new JSONObject(string2));
                            uefVar.yo(yo());
                            uefVar.oa(uef());
                            arrayList.add(uefVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                cursorUef.close();
                if (!this.uef.isEmpty()) {
                    uef(this.uef);
                    this.uef.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
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

    private void oa(int i5, long j8) {
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(lw(), oa(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j8), String.valueOf(i5)});
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
        return this.yo != null && moa() >= this.yo.uef();
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
