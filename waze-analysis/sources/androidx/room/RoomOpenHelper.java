package androidx.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.a.i;
import h.g.b.x;
import h.k;
import h.n.o;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public static final Companion Companion = new Companion(null);
    private final List<RoomDatabase.Callback> callbacks;
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    /* compiled from: WazeSource */
    public abstract class Delegate {
        public final int version;

        public Delegate(int i2) {
            this.version = i2;
        }

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
            validateMigration(supportSQLiteDatabase);
            return new ValidationResult(true, null);
        }

        protected void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: WazeSource */
    public class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.version);
        x.f(databaseConfiguration, "configuration");
        x.f(delegate, "delegate");
        x.f(str, "identityHash");
        x.f(str2, "legacyHash");
        this.callbacks = databaseConfiguration.callbacks;
        this.configuration = databaseConfiguration;
        this.delegate = delegate;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        if (!Companion.hasRoomMasterTable$room_runtime(supportSQLiteDatabase)) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(validationResultOnValidateSchema.expectedFoundMsg)));
            }
            this.delegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
            return;
        }
        Cursor cursorQuery = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
        try {
            Cursor cursor = cursorQuery;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            i.aW(cursorQuery, null);
            if (x.n(this.identityHash, string) || x.n(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i.aW(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        super.onConfigure(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        x.f(supportSQLiteDatabase, "db");
        boolean zHasEmptySchema$room_runtime = Companion.hasEmptySchema$room_runtime(supportSQLiteDatabase);
        this.delegate.createAllTables(supportSQLiteDatabase);
        if (!zHasEmptySchema$room_runtime) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(validationResultOnValidateSchema.expectedFoundMsg)));
            }
        }
        updateIdentity(supportSQLiteDatabase);
        this.delegate.onCreate(supportSQLiteDatabase);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) throws IOException {
        x.f(supportSQLiteDatabase, "db");
        onUpgrade(supportSQLiteDatabase, i2, i3);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        x.f(supportSQLiteDatabase, "db");
        super.onOpen(supportSQLiteDatabase);
        checkIdentity(supportSQLiteDatabase);
        this.delegate.onOpen(supportSQLiteDatabase);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
            }
        }
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) throws IOException {
        List<Migration> listFindMigrationPath;
        x.f(supportSQLiteDatabase, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i2, i3)) != null) {
            this.delegate.onPreMigrate(supportSQLiteDatabase);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(supportSQLiteDatabase));
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(validationResultOnValidateSchema.expectedFoundMsg)));
            }
            this.delegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 == null || databaseConfiguration2.isMigrationRequired(i2, i3)) {
            throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
            Companion.dropAllTables$room_runtime(supportSQLiteDatabase);
        } else {
            this.delegate.dropAllTables(supportSQLiteDatabase);
        }
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(supportSQLiteDatabase);
            }
        }
        this.delegate.createAllTables(supportSQLiteDatabase);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final void dropAllTables$room_runtime(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
            x.f(supportSQLiteDatabase, "db");
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = cursorQuery;
                List listB = i.b();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    x.c(string);
                    if (!o.ah(string, "sqlite_") && !x.n(string, "android_metadata")) {
                        listB.add(new k(string, Boolean.valueOf(x.n(cursor.getString(1), "view"))));
                    }
                }
                List<k> listA = i.a(listB);
                i.aW(cursorQuery, null);
                for (k kVar : listA) {
                    String str = (String) kVar.a();
                    if (((Boolean) kVar.b()).booleanValue()) {
                        supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS ".concat(String.valueOf(str)));
                    } else {
                        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
            x.f(supportSQLiteDatabase, "db");
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z = true;
                    }
                }
                i.aW(cursorQuery, null);
                return z;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
            x.f(supportSQLiteDatabase, "db");
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z = true;
                    }
                }
                i.aW(cursorQuery, null);
                return z;
            } finally {
            }
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str) {
        this(databaseConfiguration, delegate, "", str);
        x.f(databaseConfiguration, "configuration");
        x.f(delegate, "delegate");
        x.f(str, "legacyHash");
    }
}
