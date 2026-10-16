package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4258a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4259b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f4259b = i2;
        this.f4258a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        int i2 = this.f4259b;
        if (i2 == 0) {
            r.u((r) this.f4258a, (SQLiteDatabase) obj);
            return null;
        }
        if (i2 == 1) {
            Cursor cursor = (Cursor) obj;
            while (cursor.moveToNext()) {
                Object obj2 = this.f4258a;
                r rVar = (r) obj2;
                rVar.o(cursor.getInt(0), com.google.android.datatransport.runtime.a.a.f.MESSAGE_TOO_OLD, cursor.getString(1));
            }
            return null;
        }
        if (i2 != 2) {
            Cursor cursor2 = (Cursor) obj;
            while (cursor2.moveToNext()) {
                Object obj3 = this.f4258a;
                r rVar2 = (r) obj3;
                rVar2.o(cursor2.getInt(0), com.google.android.datatransport.runtime.a.a.f.MAX_RETRIES_REACHED, cursor2.getString(1));
            }
            return null;
        }
        Cursor cursor3 = (Cursor) obj;
        while (cursor3.moveToNext()) {
            ?? r0 = this.f4258a;
            Long lValueOf = Long.valueOf(cursor3.getLong(0));
            Set hashSet = (Set) r0.get(lValueOf);
            if (hashSet == null) {
                hashSet = new HashSet();
                r0.put(lValueOf, hashSet);
            }
            hashSet.add(new p(cursor3.getString(1), cursor3.getString(2)));
        }
        return null;
    }
}
