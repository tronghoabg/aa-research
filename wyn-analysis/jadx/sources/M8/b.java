package M8;

import A5.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t5.C4114i;
import w5.EnumC4363c;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements g, B5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7539e;

    public /* synthetic */ b(f fVar, Object obj, long j8, TimeUnit timeUnit, int i5) {
        this.f7535a = i5;
        this.f7536b = fVar;
        this.f7539e = obj;
        this.f7537c = j8;
        this.f7538d = timeUnit;
    }

    @Override // M8.g
    public ScheduledFuture a(xa.d dVar) {
        switch (this.f7535a) {
            case 0:
                f fVar = (f) this.f7536b;
                return fVar.f7554b.schedule(new e(fVar, (Runnable) this.f7539e, dVar, 1), this.f7537c, (TimeUnit) this.f7538d);
            default:
                f fVar2 = (f) this.f7536b;
                return fVar2.f7554b.schedule(new K3.e(fVar2, (Callable) this.f7539e, dVar, 1), this.f7537c, (TimeUnit) this.f7538d);
        }
    }

    @Override // B5.b
    public Object execute() {
        z5.f fVar = (z5.f) this.f7536b;
        m mVar = (m) fVar.f48385c;
        mVar.getClass();
        Iterable iterable = (Iterable) this.f7539e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m.w(iterable);
            SQLiteDatabase sQLiteDatabaseA = mVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        mVar.i(cursorRawQuery.getInt(0), EnumC4363c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseA.endTransaction();
            }
        }
        mVar.d(new A5.i(fVar.f48389g.c() + this.f7537c, (C4114i) this.f7538d));
        return null;
    }

    public /* synthetic */ b(z5.f fVar, Iterable iterable, C4114i c4114i, long j8) {
        this.f7535a = 2;
        this.f7536b = fVar;
        this.f7539e = iterable;
        this.f7538d = c4114i;
        this.f7537c = j8;
    }
}
