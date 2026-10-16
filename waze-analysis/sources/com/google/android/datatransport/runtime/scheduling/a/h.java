package com.google.android.datatransport.runtime.scheduling.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4261b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4262c;

    public /* synthetic */ h(long j2, x xVar, int i2) {
        this.f4262c = i2;
        this.f4260a = j2;
        this.f4261b = xVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        if (this.f4262c == 0) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            String[] strArr = {String.valueOf(this.f4260a)};
            r.l(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new g(this.f4261b, 1));
            return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
        }
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4260a));
        x xVar = (x) this.f4261b;
        if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{xVar.e(), String.valueOf(com.google.android.datatransport.runtime.d.a.a(xVar.d()))}) <= 0) {
            contentValues.put("backend_name", xVar.e());
            contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.d.a.a(xVar.d())));
            sQLiteDatabase2.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ h(r rVar, long j2, int i2) {
        this.f4262c = i2;
        this.f4261b = rVar;
        this.f4260a = j2;
    }
}
