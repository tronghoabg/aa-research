package androidx.room.migration.bundle;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BundleUtil {
    public static final String TABLE_NAME_PLACEHOLDER = "${TABLE_NAME}";
    public static final String VIEW_NAME_PLACEHOLDER = "${VIEW_NAME}";

    public static final String replaceTableName(String str, String str2) {
        x.f(str, "contents");
        x.f(str2, "tableName");
        return o.ac(str, TABLE_NAME_PLACEHOLDER, str2);
    }

    public static final String replaceViewName(String str, String str2) {
        x.f(str, "contents");
        x.f(str2, "viewName");
        return o.ac(str, VIEW_NAME_PLACEHOLDER, str2);
    }
}
