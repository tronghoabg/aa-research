package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.util.TableInfo;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import e.c.d.a;
import h.a.i;
import h.a.r;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SchemaInfoUtilKt {
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        x.e(upperCase, "toUpperCase(...)");
        String str2 = upperCase;
        if (o.F(str2, "INT", false)) {
            return 3;
        }
        if (o.F(str2, "CHAR", false) || o.F(str2, "CLOB", false) || o.F(str2, "TEXT", false)) {
            return 2;
        }
        if (o.F(str2, "BLOB", false)) {
            return 5;
        }
        return (o.F(str2, "REAL", false) || o.F(str2, "FLOA", false) || o.F(str2, "DOUB", false)) ? 4 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set<java.lang.String> parseFtsOptions(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.SchemaInfoUtilKt.parseFtsOptions(java.lang.String):java.util.Set");
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            if (!sQLiteStatement.step()) {
                Map<String, TableInfo.Column> mapJ = r.j();
                r.y(sQLiteStatementPrepare, null);
                return mapJ;
            }
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "notnull");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "pk");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "dflt_value");
            Map mapC = r.c();
            do {
                String text = sQLiteStatement.getText(iColumnIndexOf);
                mapC.put(text, new TableInfo.Column(text, sQLiteStatement.getText(iColumnIndexOf2), sQLiteStatement.getLong(iColumnIndexOf3) != 0, (int) sQLiteStatement.getLong(iColumnIndexOf4), sQLiteStatement.isNull(iColumnIndexOf5) ? null : sQLiteStatement.getText(iColumnIndexOf5), 2));
            } while (sQLiteStatement.step());
            Map<String, TableInfo.Column> mapB = r.b(mapC);
            r.y(sQLiteStatementPrepare, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.y(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TtmlNode.ATTR_ID);
        int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_FROM);
        int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_TO);
        List listB = i.b();
        while (sQLiteStatement.step()) {
            listB.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iColumnIndexOf), (int) sQLiteStatement.getLong(iColumnIndexOf2), sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4)));
        }
        return i.ak(i.a(listB));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TtmlNode.ATTR_ID);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "table");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_delete");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_update");
            List<ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(sQLiteStatement);
            sQLiteStatement.reset();
            Set setM = a.m();
            while (sQLiteStatement.step()) {
                if (sQLiteStatement.getLong(iColumnIndexOf2) == 0) {
                    int i2 = (int) sQLiteStatement.getLong(iColumnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i2) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setM.add(new TableInfo.ForeignKey(sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4), sQLiteStatement.getText(iColumnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setL = a.l(setM);
            r.y(sQLiteStatementPrepare, null);
            return setL;
        } finally {
        }
    }

    public static final Set<String> readFtsColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        x.f(sQLiteConnection, "connection");
        x.f(str, "tableName");
        Set setM = a.m();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            if (sQLiteStatement.step()) {
                int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, HintConstants.AUTOFILL_HINT_NAME);
                do {
                    setM.add(sQLiteStatement.getText(iColumnIndexOf));
                } while (sQLiteStatement.step());
            }
            r.y(sQLiteStatementPrepare, null);
            return a.l(setM);
        } finally {
        }
    }

    public static final Set<String> readFtsOptions(SQLiteConnection sQLiteConnection, String str) throws Exception {
        x.f(sQLiteConnection, "connection");
        x.f(str, "tableName");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            String text = sQLiteStatement.step() ? sQLiteStatement.getText(SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "sql")) : "";
            r.y(sQLiteStatementPrepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seqno");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, CmcdConfiguration.KEY_CONTENT_ID);
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "desc");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1 && iColumnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (sQLiteStatement.step()) {
                    if (((int) sQLiteStatement.getLong(iColumnIndexOf2)) >= 0) {
                        int i2 = (int) sQLiteStatement.getLong(iColumnIndexOf);
                        String text = sQLiteStatement.getText(iColumnIndexOf3);
                        String str2 = sQLiteStatement.getLong(iColumnIndexOf4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i2);
                        linkedHashMap.put(numValueOf, text);
                        linkedHashMap2.put(numValueOf, str2);
                    }
                }
                List listAl = i.al(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return h.b.a.a((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(i.q(listAl, 10));
                Iterator it = listAl.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listAo = i.ao(arrayList);
                List listAl2 = i.al(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return h.b.a.a((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(i.q(listAl2, 10));
                Iterator it2 = listAl2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z, listAo, i.ao(arrayList2));
                r.y(sQLiteStatementPrepare, null);
                return index;
            }
            r.y(sQLiteStatementPrepare, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, HintConstants.AUTOFILL_HINT_NAME);
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TtmlNode.ATTR_TTS_ORIGIN);
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "unique");
            if (iColumnIndexOf != -1 && iColumnIndexOf2 != -1 && iColumnIndexOf3 != -1) {
                Set setM = a.m();
                while (sQLiteStatement.step()) {
                    if (x.n("c", sQLiteStatement.getText(iColumnIndexOf2))) {
                        TableInfo.Index index = readIndex(sQLiteConnection, sQLiteStatement.getText(iColumnIndexOf), sQLiteStatement.getLong(iColumnIndexOf3) == 1);
                        if (index == null) {
                            r.y(sQLiteStatementPrepare, null);
                            return null;
                        }
                        setM.add(index);
                    }
                }
                Set<TableInfo.Index> setL = a.l(setM);
                r.y(sQLiteStatementPrepare, null);
                return setL;
            }
            r.y(sQLiteStatementPrepare, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SQLiteConnection sQLiteConnection, String str) {
        x.f(sQLiteConnection, "connection");
        x.f(str, "tableName");
        return new TableInfo(str, readColumns(sQLiteConnection, str), readForeignKeys(sQLiteConnection, str), readIndices(sQLiteConnection, str));
    }

    public static final ViewInfo readViewInfo(SQLiteConnection sQLiteConnection, String str) throws Exception {
        x.f(sQLiteConnection, "connection");
        x.f(str, "viewName");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            ViewInfo viewInfo = sQLiteStatement.step() ? new ViewInfo(sQLiteStatement.getText(0), sQLiteStatement.getText(1)) : new ViewInfo(str, null);
            r.y(sQLiteStatementPrepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.y(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
