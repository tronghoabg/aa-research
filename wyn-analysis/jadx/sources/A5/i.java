package A5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import q5.EnumC3870e;
import t5.C4114i;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4114i f364b;

    public /* synthetic */ i(long j8, C4114i c4114i) {
        this.f363a = j8;
        this.f364b = c4114i;
    }

    @Override // A5.k, k8.InterfaceC3199h
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f363a));
        C4114i c4114i = this.f364b;
        String str = c4114i.f45776a;
        EnumC3870e enumC3870e = c4114i.f45778c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(D5.a.a(enumC3870e))}) < 1) {
            contentValues.put("backend_name", c4114i.f45776a);
            contentValues.put("priority", Integer.valueOf(D5.a.a(enumC3870e)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
