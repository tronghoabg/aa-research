package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class fbv extends SQLiteOpenHelper {
    private final Context a;
    private final fbm b;
    private final boolean c;
    private boolean d;
    private final fch e;
    private boolean f;
    private final vw g;

    public fbv(Context context, String str, final vw vwVar, fbm fbmVar, boolean z) {
        String string;
        super(context, str, null, fbmVar.a, new DatabaseErrorHandler() { // from class: fbt
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                fbs fbsVarD = dsq.d(vwVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.bm(fbsVarD, "Corruption reported by sqlite on database: ", ".path"));
                if (!fbsVarD.h()) {
                    String strA = fbsVarD.a();
                    if (strA != null) {
                        fbm.a(strA);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = fbsVarD.e.getAttachedDbs();
                    } catch (Throwable th) {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                fbm.a((String) obj);
                            }
                        } else {
                            String strA2 = fbsVarD.a();
                            if (strA2 != null) {
                                fbm.a(strA2);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    fbsVarD.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs == null) {
                    String strA3 = fbsVarD.a();
                    if (strA3 != null) {
                        fbm.a(strA3);
                        return;
                    }
                    return;
                }
                Iterator<T> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    Object obj2 = ((Pair) it2.next()).second;
                    obj2.getClass();
                    fbm.a((String) obj2);
                }
            }
        });
        this.a = context;
        this.g = vwVar;
        this.b = fbmVar;
        this.c = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.e = new fch(string, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final fbs a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return dsq.d(this.g, sQLiteDatabase);
    }

    public final fbl b() {
        SQLiteDatabase sQLiteDatabaseC;
        fbl fblVarA;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof fbu) {
                        fbu fbuVar = (fbu) th;
                        Throwable th2 = fbuVar.a;
                        int i = fbuVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new aezs();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (fbu e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                fblVarA = b();
            } else {
                fblVarA = a(sQLiteDatabaseC);
            }
            return fblVarA;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            fch fchVar = this.e;
            Map map = fch.a;
            boolean z = fchVar.b;
            fchVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new fbu(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            fbm fbmVar = this.b;
            fca fcaVar = new fca(a(sQLiteDatabase));
            fbk fbkVarA = fcaVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (fbkVarA.k()) {
                    if (fbkVarA.b(0) == 0) {
                        z = true;
                    }
                }
                eyk eykVar = fbmVar.b;
                affa.m(fbkVarA, null);
                ezf ezfVar = eykVar.b;
                ezfVar.a(fcaVar);
                if (!z) {
                    admq admqVarG = ezfVar.g(fcaVar);
                    if (!admqVarG.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(admqVarG.b)));
                    }
                }
                eykVar.a(fcaVar);
                ezfVar.e();
                for (ezd ezdVar : eykVar.c) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new fbu(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new fbu(4, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new fbu(3, th);
        }
    }
}
