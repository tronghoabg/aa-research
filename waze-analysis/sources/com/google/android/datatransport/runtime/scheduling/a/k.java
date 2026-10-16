package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4267a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4268b;

    public /* synthetic */ k(long j2, int i2) {
        this.f4268b = i2;
        this.f4267a = j2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        int i2 = 0;
        if (this.f4268b != 0) {
            return (com.google.android.datatransport.runtime.a.a.l) r.l(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new k(this.f4267a, i2));
        }
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        long j2 = cursor.getLong(0);
        com.google.android.datatransport.runtime.a.a.k kVarC = com.google.android.datatransport.runtime.a.a.l.c();
        kVarC.c(j2);
        kVarC.b(this.f4267a);
        return kVarC.a();
    }
}
