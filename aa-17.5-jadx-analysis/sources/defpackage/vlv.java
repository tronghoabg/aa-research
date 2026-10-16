package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

/* loaded from: classes3.dex */
final class vlv extends est {
    final /* synthetic */ vlw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlv(vlw vlwVar, Context context) {
        super(context);
        this.k = vlwVar;
    }

    @Override // defpackage.est, defpackage.ess
    public final /* bridge */ /* synthetic */ Object a() {
        return a();
    }

    @Override // defpackage.est
    /* renamed from: i */
    public final Cursor a() {
        vlu vluVar;
        vlw vlwVar = this.k;
        int selectedItemPosition = vlwVar.e.getSelectedItemPosition() - 1;
        String strBp = selectedItemPosition >= 0 ? a.bp(selectedItemPosition, "type=") : "";
        synchronized (vlwVar.b) {
            SQLiteDatabase readableDatabase = vlwVar.c.getReadableDatabase();
            String[] strArr = vlt.a;
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("PRIMES_EVENTS");
            if (!strBp.isEmpty()) {
                sQLiteQueryBuilder.appendWhere(strBp);
            }
            Cursor cursorRawQuery = readableDatabase.rawQuery(sQLiteQueryBuilder.buildQuery(vlt.a, null, null, null, "_id DESC", null), null);
            cursorRawQuery.getCount();
            vluVar = new vlu(this, cursorRawQuery, readableDatabase);
        }
        return vluVar;
    }
}
