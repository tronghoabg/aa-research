package com.waze.stats.storage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.waze.bw.a.b.l;
import com.waze.main_screen.p.m;
import com.waze.stats.StatsContract$StatContainer;
import com.waze.stats.aa;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final RoomDatabase f40611a;

    /* renamed from: b, reason: collision with root package name */
    private final EntityInsertAdapter f40612b = new e(this);

    /* renamed from: c, reason: collision with root package name */
    private final EntityDeleteOrUpdateAdapter f40613c = new f(this);

    public g(RoomDatabase roomDatabase) {
        this.f40611a = roomDatabase;
    }

    public static /* synthetic */ void l(aa aaVar, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM stat_container WHERE stat_type = ? AND created_date_millis <= ?");
        try {
            sQLiteStatementPrepare.mo13248bindText(1, r(aaVar));
            sQLiteStatementPrepare.mo13246bindLong(2, j2);
            sQLiteStatementPrepare.step();
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ void m(aa aaVar, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM stat_container WHERE stat_type = ?");
        try {
            sQLiteStatementPrepare.mo13248bindText(1, r(aaVar));
            sQLiteStatementPrepare.step();
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer n(aa aaVar, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT COUNT(*) FROM stat_container WHERE stat_type = ? AND created_date_millis <= ?");
        try {
            sQLiteStatementPrepare.mo13248bindText(1, r(aaVar));
            sQLiteStatementPrepare.mo13246bindLong(2, j2);
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List o(aa aaVar, int i2, SQLiteConnection sQLiteConnection) {
        aa aaVar2;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM stat_container WHERE stat_type = ? ORDER BY created_date_millis ASC LIMIT ?");
        try {
            sQLiteStatementPrepare.mo13248bindText(1, r(aaVar));
            sQLiteStatementPrepare.mo13246bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifier");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stat");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "created_date_millis");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stat_type");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                byte[] blob = sQLiteStatementPrepare.getBlob(columnIndexOrThrow2);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                int iHashCode = text.hashCode();
                if (iHashCode != -849706474) {
                    if (iHashCode != -653893394) {
                        if (iHashCode != 636275727 || !text.equals("AUTHENTICATED")) {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(String.valueOf(text)));
                        }
                        aaVar2 = aa.f40492a;
                        arrayList.add(new StatsContract$StatContainer(j2, blob, j3, aaVar2));
                    } else {
                        if (!text.equals("AD_EVENT_AUTHENTICATED")) {
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(String.valueOf(text)));
                        }
                        aaVar2 = aa.f40494c;
                        arrayList.add(new StatsContract$StatContainer(j2, blob, j3, aaVar2));
                    }
                } else {
                    if (!text.equals("UNAUTHENTICATED")) {
                        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(String.valueOf(text)));
                    }
                    aaVar2 = aa.f40493b;
                    arrayList.add(new StatsContract$StatContainer(j2, blob, j3, aaVar2));
                }
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer p(aa aaVar, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT COUNT(*) FROM stat_container WHERE stat_type = ?");
        try {
            sQLiteStatementPrepare.mo13248bindText(1, r(aaVar));
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(aa aaVar) {
        aa aaVar2 = aa.f40492a;
        int iOrdinal = aaVar.ordinal();
        if (iOrdinal == 0) {
            return "AUTHENTICATED";
        }
        if (iOrdinal == 1) {
            return "UNAUTHENTICATED";
        }
        if (iOrdinal == 2) {
            return "AD_EVENT_AUTHENTICATED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(String.valueOf(String.valueOf(aaVar))));
    }

    @Override // com.waze.stats.storage.a
    public final int a(aa aaVar) {
        return ((Integer) DBUtil.performBlocking(this.f40611a, true, false, new com.waze.sound.e.i(aaVar, 12))).intValue();
    }

    @Override // com.waze.stats.storage.a
    public final int b(aa aaVar, long j2) {
        return ((Integer) DBUtil.performBlocking(this.f40611a, true, false, new d(aaVar, j2, 0))).intValue();
    }

    @Override // com.waze.stats.storage.a
    public final int c(StatsContract$StatContainer statsContract$StatContainer) {
        statsContract$StatContainer.getClass();
        return ((Integer) DBUtil.performBlocking(this.f40611a, false, true, new l(this, statsContract$StatContainer, 9, null))).intValue();
    }

    @Override // com.waze.stats.storage.a
    public final int d(List list) {
        list.getClass();
        return ((Integer) DBUtil.performBlocking(this.f40611a, false, true, new l(this, list, 10))).intValue();
    }

    @Override // com.waze.stats.storage.a
    public final List e(int i2, aa aaVar) {
        return (List) DBUtil.performBlocking(this.f40611a, true, false, new m(aaVar, i2, 8));
    }

    @Override // com.waze.stats.storage.a
    public final void f(aa aaVar) {
        DBUtil.performBlocking(this.f40611a, false, true, new com.waze.sound.e.i(aaVar, 13));
    }

    @Override // com.waze.stats.storage.a
    public final void g(aa aaVar, long j2) {
        DBUtil.performBlocking(this.f40611a, false, true, new d(aaVar, j2, 2));
    }

    @Override // com.waze.stats.storage.a
    public final void h(StatsContract$StatContainer statsContract$StatContainer) {
        DBUtil.performBlocking(this.f40611a, false, true, new l(this, statsContract$StatContainer, 11, null));
    }
}
