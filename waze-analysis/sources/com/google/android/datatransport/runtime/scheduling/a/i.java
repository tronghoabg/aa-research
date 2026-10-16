package com.google.android.datatransport.runtime.scheduling.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.runtime.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements o {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4263a;

    public /* synthetic */ i(int i2) {
        this.f4263a = i2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.a.o
    public final Object a(Object obj) {
        int i2 = 2;
        switch (this.f4263a) {
            case 0:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 1:
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
            case 2:
                Cursor cursor2 = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    com.google.android.datatransport.runtime.w wVarA = x.a();
                    wVarA.b(cursor2.getString(1));
                    wVarA.d(com.google.android.datatransport.runtime.d.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    wVarA.c(string == null ? null : Base64.decode(string, 0));
                    arrayList.add(wVarA.a());
                }
                return arrayList;
            case 3:
                Cursor cursor3 = (Cursor) obj;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor3.moveToNext()) {
                    byte[] blob = cursor3.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i4);
                    int length2 = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i3, length2);
                    i3 += length2;
                }
                return bArr;
            case 4:
                return (List) r.l(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new i(i2));
            case 5:
                Cursor cursor4 = (Cursor) obj;
                if (cursor4.moveToNext()) {
                    return Long.valueOf(cursor4.getLong(0));
                }
                return 0L;
            case 6:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 7:
                throw new com.google.android.datatransport.runtime.b.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            default:
                throw new com.google.android.datatransport.runtime.b.a("Timed out while trying to open db.", (Throwable) obj);
        }
    }
}
