package com.bytedance.sdk.component.ivm.uef.ivm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ivm implements lw {
    private Context uef;

    public ivm(Context context) {
        this.uef = context;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.lw
    public void oa(moa moaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", moaVar.uef());
        contentValues.put("url", moaVar.oa());
        contentValues.put("replaceholder", Integer.valueOf(moaVar.yo() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(moaVar.moa()));
        contentValues.put("error_code", moaVar.xs());
        contentValues.put("error_msg", moaVar.cz());
        contentValues.put("url_type", Integer.valueOf(moaVar.lw()));
        contentValues.put("ad_id", moaVar.ivm());
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(this.uef, "trackurl", contentValues, "id=?", new String[]{moaVar.uef()});
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.lw
    public List<moa> uef() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(this.uef, "trackurl", null, null, null, null, null, null);
        if (cursorUef != null) {
            while (cursorUef.moveToNext()) {
                try {
                    try {
                        String string = cursorUef.getString(cursorUef.getColumnIndex("id"));
                        String string2 = cursorUef.getString(cursorUef.getColumnIndex("url"));
                        boolean z2 = cursorUef.getInt(cursorUef.getColumnIndex("replaceholder")) > 0;
                        int i5 = cursorUef.getInt(cursorUef.getColumnIndex("retry"));
                        int i10 = cursorUef.getInt(cursorUef.getColumnIndex("url_type"));
                        String string3 = cursorUef.getString(cursorUef.getColumnIndex("ad_id"));
                        String string4 = cursorUef.getString(cursorUef.getColumnIndex("error_code"));
                        String string5 = cursorUef.getString(cursorUef.getColumnIndex("error_msg"));
                        moa moaVar = new moa(string, string2, z2, i10, string3);
                        moaVar.uef(i5);
                        if (!TextUtils.isEmpty(string4)) {
                            moaVar.uef(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            moaVar.oa(string5);
                        }
                        linkedList.add(moaVar);
                    } catch (Throwable unused) {
                    }
                } finally {
                    cursorUef.close();
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.lw
    public void yo(moa moaVar) {
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(this.uef, "trackurl", "id=?", new String[]{moaVar.uef()});
    }

    public static String oa() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.lw
    public moa uef(String str) {
        Cursor cursorUef = com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(this.uef, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorUef != null && cursorUef.moveToFirst()) {
            try {
                String string = cursorUef.getString(cursorUef.getColumnIndex("id"));
                String string2 = cursorUef.getString(cursorUef.getColumnIndex("url"));
                boolean z2 = cursorUef.getInt(cursorUef.getColumnIndex("replaceholder")) > 0;
                int i5 = cursorUef.getInt(cursorUef.getColumnIndex("retry"));
                int i10 = cursorUef.getInt(cursorUef.getColumnIndex("url_type"));
                String string3 = cursorUef.getString(cursorUef.getColumnIndex("ad_id"));
                String string4 = cursorUef.getString(cursorUef.getColumnIndex("error_code"));
                String string5 = cursorUef.getString(cursorUef.getColumnIndex("error_msg"));
                moa moaVar = new moa(string, string2, z2, i10, string3);
                moaVar.uef(i5);
                if (!TextUtils.isEmpty(string4)) {
                    moaVar.uef(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    moaVar.oa(string5);
                }
                return moaVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorUef.close();
                    cursorUef = null;
                } finally {
                    cursorUef.close();
                }
            }
        }
        if (cursorUef != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.ivm.lw
    public void uef(moa moaVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", moaVar.uef());
        contentValues.put("url", moaVar.oa());
        contentValues.put("replaceholder", Integer.valueOf(moaVar.yo() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(moaVar.moa()));
        contentValues.put("url_type", Integer.valueOf(moaVar.lw()));
        contentValues.put("ad_id", moaVar.ivm());
        contentValues.put("error_code", moaVar.xs());
        contentValues.put("error_msg", moaVar.cz());
        com.bytedance.sdk.component.ivm.uef.uef.uef.yo.uef(this.uef, "trackurl", contentValues);
    }
}
