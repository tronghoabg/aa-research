package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import h.g.b.x;
import h.n.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* compiled from: WazeSource */
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* compiled from: WazeSource */
    public abstract class Callback {
        public static final Companion Companion = new Companion(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        public Callback(int i2) {
            this.version = i2;
        }

        private final void deleteDatabaseFile(String str) {
            if (o.m(str, ":memory:", true)) {
                return;
            }
            String str2 = str;
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                int iA = x.a(str2.charAt(true != z ? i2 : length), 32);
                if (z) {
                    if (iA > 0) {
                        break;
                    } else {
                        length--;
                    }
                } else if (iA > 0) {
                    z = true;
                } else {
                    i2++;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: ".concat(String.valueOf(str)));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w(TAG, "delete failed: ", e2);
            }
        }

        public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public void onCorruption(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + supportSQLiteDatabase + ".path");
            if (!supportSQLiteDatabase.isOpen()) {
                String path = supportSQLiteDatabase.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = supportSQLiteDatabase.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    supportSQLiteDatabase.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs == null) {
                    String path2 = supportSQLiteDatabase.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                        return;
                    }
                    return;
                }
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    Object obj = ((Pair) it.next()).second;
                    x.e(obj, "second");
                    deleteDatabaseFile((String) obj);
                }
            } catch (Throwable th) {
                if (attachedDbs != null) {
                    Iterator<T> it2 = attachedDbs.iterator();
                    while (it2.hasNext()) {
                        Object obj2 = ((Pair) it2.next()).second;
                        x.e(obj2, "second");
                        deleteDatabaseFile((String) obj2);
                    }
                } else {
                    String path3 = supportSQLiteDatabase.getPath();
                    if (path3 != null) {
                        deleteDatabaseFile(path3);
                    }
                }
                throw th;
            }
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
            x.f(supportSQLiteDatabase, "db");
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h.g.b.o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Configuration {
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final Callback callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        /* compiled from: WazeSource */
        public class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(Context context) {
                x.f(context, "context");
                this.context = context;
            }

            public Builder allowDataLossOnRecovery(boolean z) {
                this.allowDataLossOnRecovery = z;
                return this;
            }

            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public Builder callback(Callback callback) {
                x.f(callback, "callback");
                this.callback = callback;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder noBackupDirectory(boolean z) {
                this.useNoBackupDirectory = z;
                return this;
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z, boolean z2) {
            x.f(context, "context");
            x.f(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Builder builder(Context context) {
                x.f(context, "context");
                return new Builder(context);
            }

            public /* synthetic */ Companion(h.g.b.o oVar) {
                this();
            }
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z, boolean z2, int i2, h.g.b.o oVar) {
            this(context, str, callback, z & ((i2 & 8) == 0), z2 & ((i2 & 16) == 0));
        }
    }
}
