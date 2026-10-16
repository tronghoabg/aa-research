package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import androidx.work.impl.model.WorkSpec;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(final SQLiteConnection sQLiteConnection, ArrayMap<String, List<Data>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new l() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(this.f$0, sQLiteConnection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string = sb.toString();
        x.e(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo13248bindText(i2, it.next());
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<Data> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        list.add(Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
                    }
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        x.f(arrayMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap);
        return ab.f48028a;
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(final SQLiteConnection sQLiteConnection, ArrayMap<String, List<String>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new l() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$0(this.f$0, sQLiteConnection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string = sb.toString();
        x.e(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo13248bindText(i2, it.next());
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<String> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        list.add(sQLiteStatementPrepare.getText(0));
                    }
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab __fetchRelationshipWorkTagAsjavaLangString$lambda$0(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        x.f(arrayMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0279 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282 A[Catch: all -> 0x034a, TRY_LEAVE, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final java.util.List getWorkInfoPojos$lambda$0(java.lang.String r68, androidx.room.RoomRawQuery r69, androidx.work.impl.model.RawWorkInfoDao_Impl r70, androidx.sqlite.SQLiteConnection r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.RawWorkInfoDao_Impl.getWorkInfoPojos$lambda$0(java.lang.String, androidx.room.RoomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl, androidx.sqlite.SQLiteConnection):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0279 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282 A[Catch: all -> 0x034a, TRY_LEAVE, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final java.util.List getWorkInfoPojosFlow$lambda$0(java.lang.String r68, androidx.room.RoomRawQuery r69, androidx.work.impl.model.RawWorkInfoDao_Impl r70, androidx.sqlite.SQLiteConnection r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.RawWorkInfoDao_Impl.getWorkInfoPojosFlow$lambda$0(java.lang.String, androidx.room.RoomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl, androidx.sqlite.SQLiteConnection):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0279 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282 A[Catch: all -> 0x034a, TRY_LEAVE, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257 A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b A[Catch: all -> 0x034a, TryCatch #1 {all -> 0x034a, blocks: (B:3:0x0011, B:4:0x00ce, B:6:0x00d4, B:8:0x00e0, B:10:0x00f1, B:12:0x00fb, B:14:0x010a, B:15:0x011e, B:19:0x0127, B:21:0x012d, B:23:0x0138, B:38:0x016d, B:64:0x01e3, B:66:0x01eb, B:68:0x01fc, B:102:0x0282, B:100:0x0279, B:96:0x026b, B:90:0x0257, B:84:0x0241, B:78:0x022a, B:72:0x0211, B:62:0x01d5, B:58:0x01c5, B:54:0x01b2, B:50:0x019c, B:46:0x018b, B:42:0x017d, B:36:0x0164, B:32:0x0159, B:29:0x0150, B:26:0x0147), top: B:130:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final java.util.List getWorkInfoPojosLiveData$lambda$0(java.lang.String r68, androidx.room.RoomRawQuery r69, androidx.work.impl.model.RawWorkInfoDao_Impl r70, androidx.sqlite.SQLiteConnection r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.RawWorkInfoDao_Impl.getWorkInfoPojosLiveData$lambda$0(java.lang.String, androidx.room.RoomRawQuery, androidx.work.impl.model.RawWorkInfoDao_Impl, androidx.sqlite.SQLiteConnection):java.util.List");
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        x.f(supportSQLiteQuery, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojos$lambda$0(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public k<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(SupportSQLiteQuery supportSQLiteQuery) {
        x.f(supportSQLiteQuery, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        l lVar = new l() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojosFlow$lambda$0(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        };
        return FlowUtil.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, lVar);
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery) {
        x.f(supportSQLiteQuery, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.Companion.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new l() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojosLiveData$lambda$0(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<c<?>> getRequiredConverters() {
            return i.h();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
