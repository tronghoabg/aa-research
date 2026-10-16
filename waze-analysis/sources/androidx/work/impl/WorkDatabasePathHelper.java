package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import h.a.r;
import h.g.b.x;
import h.k;
import h.k.n;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    public static final void migrateDatabase(Context context) {
        x.f(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger.get().debug(WorkDatabasePathHelperKt.TAG, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger logger = Logger.get();
                        String str = WorkDatabasePathHelperKt.TAG;
                        Objects.toString(value);
                        logger.warning(str, "Over-writing contents of ".concat(String.valueOf(value)));
                    }
                    Logger.get().debug(WorkDatabasePathHelperKt.TAG, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        x.f(context, "context");
        return new File(context.getNoBackupFilesDir(), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }

    public final File getDefaultDatabasePath(Context context) {
        x.f(context, "context");
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        x.e(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        x.f(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        String[] strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(strArr.length), 16));
        for (String str : strArr) {
            k kVar = new k(new File(String.valueOf(defaultDatabasePath.getPath()).concat(String.valueOf(str))), new File(String.valueOf(databasePath.getPath()).concat(String.valueOf(str))));
            linkedHashMap.put(kVar.c(), kVar.d());
        }
        return r.p(linkedHashMap, new k(defaultDatabasePath, databasePath));
    }
}
