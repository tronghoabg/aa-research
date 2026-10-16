package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4256c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f4257d;

    public /* synthetic */ f(r rVar, String str, int i2) {
        this.f4257d = i2;
        this.f4256c = rVar;
        this.f4254a = str;
        this.f4255b = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        int i2 = this.f4257d;
        if (i2 == 0) {
            Object obj2 = this.f4256c;
            ?? r1 = this.f4255b;
            return r.d((r) this.f4254a, r1, (com.google.android.datatransport.runtime.a.a.a) obj2, (Cursor) obj);
        }
        if (i2 == 1) {
            Object obj3 = this.f4256c;
            ?? r12 = this.f4255b;
            r.t((r) this.f4254a, r12, (x) obj3, (Cursor) obj);
            return null;
        }
        if (i2 != 2) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            sQLiteDatabase.compileStatement((String) this.f4254a).execute();
            r.l(sQLiteDatabase.rawQuery((String) this.f4255b, null), new g(this.f4256c, 3));
            sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            return null;
        }
        Object obj4 = this.f4254a;
        Object obj5 = this.f4256c;
        return r.i((r) this.f4255b, (com.google.android.datatransport.runtime.n) obj5, (x) obj4, (SQLiteDatabase) obj);
    }

    public /* synthetic */ f(r rVar, Object obj, Object obj2, int i2) {
        this.f4257d = i2;
        this.f4254a = rVar;
        this.f4255b = obj;
        this.f4256c = obj2;
    }

    public /* synthetic */ f(r rVar, com.google.android.datatransport.runtime.n nVar, x xVar, int i2) {
        this.f4257d = i2;
        this.f4255b = rVar;
        this.f4256c = nVar;
        this.f4254a = xVar;
    }
}
