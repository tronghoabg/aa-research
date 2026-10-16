package A5;

import U8.C0881m0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import cb.AbstractC1593a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import t5.C4114i;
import w5.EnumC4363c;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements k, O9.a, Continuation, B5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f367c;

    public /* synthetic */ j(Object obj, long j8, Object obj2) {
        this.f365a = obj;
        this.f366b = j8;
        this.f367c = obj2;
    }

    @Override // A5.k, k8.InterfaceC3199h
    public Object apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i5 = ((EnumC4363c) this.f367c).f47295a;
        String string = Integer.toString(i5);
        String str = (String) this.f365a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z2 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j8 = this.f366b;
            if (z2) {
                sQLiteDatabase.execSQL(AbstractC1593a.h(j8, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i5)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i5));
            contentValues.put("events_dropped_count", Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // B5.b
    public Object execute() {
        z5.f fVar = (z5.f) this.f365a;
        long jC = fVar.f48389g.c() + this.f366b;
        m mVar = (m) fVar.f48385c;
        C4114i c4114i = (C4114i) this.f367c;
        mVar.getClass();
        mVar.d(new i(jC, c4114i));
        return null;
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        ((O8.a) bVar.get()).d((String) this.f365a, this.f366b, (C0881m0) this.f367c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((aa.h) this.f365a).b(task, this.f366b, (HashMap) this.f367c);
    }

    public /* synthetic */ j(Object obj, Object obj2, long j8) {
        this.f365a = obj;
        this.f367c = obj2;
        this.f366b = j8;
    }
}
