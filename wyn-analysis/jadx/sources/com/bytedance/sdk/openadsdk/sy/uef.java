package com.bytedance.sdk.openadsdk.sy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.bcc.uef.ivm;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class uef {
    private static Context moa;
    private Boolean bcc;
    private oa ivm;
    private com.bytedance.sdk.openadsdk.sy.yo.uef xs;
    public static final long uef = com.bytedance.sdk.openadsdk.sy.moa.uef.uef();

    /* renamed from: oa, reason: collision with root package name */
    private static final String[] f26093oa = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
    private static final long yo = System.currentTimeMillis();
    private final ArrayList<moa> lw = new ArrayList<>();
    private final Runnable cz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sy.uef.1
        @Override // java.lang.Runnable
        public void run() {
            if (!uef.this.moa() || uef.this.lw.isEmpty()) {
                return;
            }
            uef uefVar = uef.this;
            uefVar.uef(uefVar.lw);
            uef.this.lw.clear();
        }
    };
    private int zjm = 0;
    private final Runnable dj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sy.uef.4
        @Override // java.lang.Runnable
        public void run() {
            int i5;
            int i10;
            int i11;
            int i12;
            int i13;
            try {
                SQLiteDatabase sQLiteDatabaseOa = com.bytedance.sdk.openadsdk.sy.uef.uef.oa();
                if (sQLiteDatabaseOa != null) {
                    String[] strArr = {String.valueOf(uef.this.ivm.getOnceLogInterval() < 86400000 ? uef.yo : uef.uef)};
                    int iMax = Math.max(10, uef.this.ivm.getOnceLogCount());
                    int i14 = iMax > 100 ? 10 : iMax;
                    Cursor cursorQuery = sQLiteDatabaseOa.query("monitor_table", uef.f26093oa, "timestamp < ?", strArr, null, null, null, String.valueOf(i14));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("sdk_version");
                        int columnIndex3 = cursorQuery.getColumnIndex("scene");
                        int columnIndex4 = cursorQuery.getColumnIndex("start_count");
                        int columnIndex5 = cursorQuery.getColumnIndex("success_count");
                        int columnIndex6 = cursorQuery.getColumnIndex("fail_count");
                        int columnIndex7 = cursorQuery.getColumnIndex("rit");
                        int columnIndex8 = cursorQuery.getColumnIndex("tag");
                        int columnIndex9 = cursorQuery.getColumnIndex("label");
                        int columnIndex10 = cursorQuery.getColumnIndex("timestamp");
                        int columnIndex11 = cursorQuery.getColumnIndex("mediation");
                        int i15 = i14;
                        int columnIndex12 = cursorQuery.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = cursorQuery.getColumnIndex("extra");
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.sy.oa.uef uefVar = new com.bytedance.sdk.openadsdk.sy.oa.uef();
                                if (columnIndex >= 0) {
                                    i5 = columnIndex10;
                                    i10 = columnIndex11;
                                    long j8 = cursorQuery.getLong(columnIndex);
                                    uefVar.uef(j8);
                                    arrayList2.add(String.valueOf(j8));
                                } else {
                                    i5 = columnIndex10;
                                    i10 = columnIndex11;
                                }
                                if (columnIndex2 >= 0) {
                                    uefVar.uef(cursorQuery.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    uefVar.oa(cursorQuery.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    uefVar.uef(cursorQuery.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    uefVar.oa(cursorQuery.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    uefVar.yo(cursorQuery.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    uefVar.yo(cursorQuery.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    uefVar.moa(cursorQuery.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    uefVar.lw(cursorQuery.getString(columnIndex9));
                                }
                                if (i5 >= 0) {
                                    i11 = columnIndex;
                                    columnIndex10 = i5;
                                    i12 = columnIndex2;
                                    uefVar.oa(cursorQuery.getLong(columnIndex10));
                                } else {
                                    i11 = columnIndex;
                                    columnIndex10 = i5;
                                    i12 = columnIndex2;
                                }
                                if (i10 >= 0) {
                                    i13 = i10;
                                    uefVar.ivm(cursorQuery.getString(i13));
                                } else {
                                    i13 = i10;
                                }
                                if (columnIndex12 >= 0) {
                                    uefVar.moa(cursorQuery.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    uefVar.xs(cursorQuery.getString(columnIndex13));
                                }
                                arrayList3.add(uefVar);
                                int i16 = i11;
                                columnIndex11 = i13;
                                columnIndex = i16;
                                arrayList = arrayList3;
                                columnIndex2 = i12;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                uef.this.ivm.onMonitorUpload(arrayList4);
                                SQLiteDatabase sQLiteDatabaseUef = com.bytedance.sdk.openadsdk.sy.uef.uef.uef();
                                if (sQLiteDatabaseUef != null && sQLiteDatabaseUef.isOpen()) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id IN (");
                                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                        sb2.append("?");
                                        if (i17 < arrayList2.size() - 1) {
                                            sb2.append(",");
                                        }
                                    }
                                    sb2.append(")");
                                    sQLiteDatabaseUef.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                    if (uef.this.xs != null) {
                                        uef.this.xs.uef(uef.yo);
                                    }
                                }
                                if (arrayList4.size() < i15 || uef.this.zjm > 1000) {
                                    return;
                                }
                                uef.this.uef(false);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    private uef(oa oaVar) {
        try {
            this.ivm = new BusMonitorDependWrapper(oaVar);
            this.xs = new com.bytedance.sdk.openadsdk.sy.yo.uef(oaVar.getContext());
            moa = oaVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int moa(uef uefVar) {
        int i5 = uefVar.zjm;
        uefVar.zjm = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean moa() {
        if (this.bcc == null) {
            oa oaVar = this.ivm;
            this.bcc = Boolean.valueOf((oaVar == null || oaVar.getContext() == null || !this.ivm.isMonitorOpen() || this.ivm.getHandler() == null) ? false : true);
        }
        return this.bcc.booleanValue();
    }

    public static uef uef(oa oaVar) {
        return new uef(oaVar);
    }

    public static Context uef() {
        Context context = moa;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void uef(final moa moaVar) {
        if (moaVar == null || !moa()) {
            return;
        }
        final ivm handler = this.ivm.getHandler();
        handler.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sy.uef.2
            @Override // java.lang.Runnable
            public void run() {
                uef.this.lw.add(moaVar);
                if (uef.this.lw.size() >= 10) {
                    handler.oa(uef.this.cz);
                    uef uefVar = uef.this;
                    uefVar.uef(uefVar.lw);
                    uef.this.lw.clear();
                }
            }
        });
        handler.oa(this.cz);
        handler.uef(this.cz, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(List<moa> list) {
        com.bytedance.sdk.openadsdk.sy.oa.uef uefVarUef;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseUef = com.bytedance.sdk.openadsdk.sy.uef.uef.uef();
                if (sQLiteDatabaseUef != null) {
                    try {
                        sQLiteDatabaseUef.beginTransaction();
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            moa moaVar = list.get(i5);
                            if (moaVar != null && (uefVarUef = moaVar.uef()) != null) {
                                Cursor cursorQuery = sQLiteDatabaseUef.query("monitor_table", f26093oa, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{uefVarUef.oa(), uefVarUef.yo(), uefVarUef.xs(), uefVarUef.bcc(), uefVarUef.cz(), uefVarUef.dj(), String.valueOf(uefVarUef.wrv()), String.valueOf(uefVarUef.zjm()), uefVarUef.cq()}, null, null, null);
                                if (cursorQuery != null) {
                                    if (cursorQuery.moveToNext()) {
                                        int columnIndex = cursorQuery.getColumnIndex("_id");
                                        if (columnIndex >= 0) {
                                            uefVarUef.uef(cursorQuery.getLong(columnIndex));
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                        if (columnIndex2 >= 0) {
                                            uefVarUef.uef(cursorQuery.getInt(columnIndex2) + uefVarUef.moa());
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                        if (columnIndex3 >= 0) {
                                            uefVarUef.oa(cursorQuery.getInt(columnIndex3) + uefVarUef.lw());
                                        }
                                        int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                        if (columnIndex4 >= 0) {
                                            uefVarUef.yo(cursorQuery.getInt(columnIndex4) + uefVarUef.ivm());
                                        }
                                    }
                                    cursorQuery.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                if (uefVarUef.uef() > 0) {
                                    contentValues.put("_id", Long.valueOf(uefVarUef.uef()));
                                }
                                contentValues.put("sdk_version", uefVarUef.oa());
                                contentValues.put("scene", uefVarUef.yo());
                                contentValues.put("start_count", Integer.valueOf(uefVarUef.moa()));
                                contentValues.put("success_count", Integer.valueOf(uefVarUef.lw()));
                                contentValues.put("fail_count", Integer.valueOf(uefVarUef.ivm()));
                                contentValues.put("rit", uefVarUef.xs());
                                contentValues.put("tag", uefVarUef.bcc());
                                contentValues.put("label", uefVarUef.cz());
                                contentValues.put("timestamp", Long.valueOf(uefVarUef.zjm()));
                                contentValues.put("mediation", uefVarUef.dj());
                                contentValues.put("is_init", Integer.valueOf(uefVarUef.wrv()));
                                contentValues.put("extra", uefVarUef.cq());
                                sQLiteDatabaseUef.insertWithOnConflict("monitor_table", null, contentValues, 5);
                            }
                        }
                        sQLiteDatabaseUef.setTransactionSuccessful();
                    } catch (Throwable unused) {
                        sQLiteDatabase = sQLiteDatabaseUef;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                            return;
                        }
                        return;
                    }
                }
                if (sQLiteDatabaseUef != null) {
                    sQLiteDatabaseUef.endTransaction();
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public void uef(final boolean z2) {
        final ivm handler = this.ivm.getHandler();
        oa oaVar = this.ivm;
        if (oaVar == null || handler == null || oaVar.getContext() == null || this.xs == null || !moa()) {
            return;
        }
        handler.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sy.uef.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    uef.moa(uef.this);
                    if (z2) {
                        long jUef = uef.this.xs.uef();
                        if (jUef == 0) {
                            uef.this.xs.uef(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.sy.moa.uef.uef(jUef) && System.currentTimeMillis() - jUef < uef.this.ivm.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.uef(uef.this.dj);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.ivm.getOnceLogInterval(), 10000));
    }
}
